// Copyright 2011 Foursquare Labs Inc. All Rights Reserved.

package com.foursquare.geo.shapes

import com.vividsolutions.jts.geom.Geometry
import java.io.File
import java.nio.charset.Charset
import org.geotools.data.shapefile.ShapefileDataStore
import org.opengis.feature.simple.SimpleFeature
import scalaj.collection.Imports._
import org.geotools.geojson.feature.FeatureJSON

object FsqSimpleFeatureImplicits {
  implicit def simpleFeatureToFsqSimpleFeature(f: SimpleFeature) =
    new FsqSimpleFeature(f)
}

class FsqSimpleFeature(val f: SimpleFeature) {
  val propMap = f.getProperties().asScala.flatMap(p => {
    Option(p.getValue()).map(v =>
      (p.getName().toString, v.toString)
    )
  }).toMap

  lazy val geometry: Option[Geometry] = {
    if (f.getDefaultGeometry() != null) {
      Some(f.getDefaultGeometry().asInstanceOf[Geometry] )
    } else {
      None
    }
  }

  lazy val boundingBox = {
    geometry.map(g => {
      val envelope = g.getEnvelopeInternal()
      (
        (envelope.getMaxY(), envelope.getMaxX()),
        (envelope.getMinY(), envelope.getMinX())
      )
    })
  }
}

trait ShapeIterator extends Iterator[SimpleFeature] {
  def file: File
}

class GeoJsonIterator(val file: File) extends ShapeIterator {
  def this(path: String) = this(new File(path))
  val io = new FeatureJSON()
  val iter = io.streamFeatureCollection(file)

  def hasNext = iter.hasNext
  def next = iter.next
}

class ShapefileIterator(val file: File) extends ShapeIterator {
  def this(path: String) = this(new File(path))
  val shapeURL = file.toURI.toURL
  val store = new ShapefileDataStore(shapeURL)
  store.setStringCharset(Charset.forName("UTF-8"))
  val name = store.getTypeNames()(0);
  val source = store.getFeatureSource(name)
  val fsShape = source.getFeatures()
  val iter = fsShape.features()

  override def size = fsShape.size()

  def hasNext = iter.hasNext
  def next = iter.next
}
