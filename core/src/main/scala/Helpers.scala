// Copyright 2012 Foursquare Labs Inc. All Rights Reserved.
package com.foursquare.twofishes

import java.text.Normalizer
import java.util.regex.Pattern

object Helpers {
  def tryo[T](f: => T): Option[T] = {
    try {
      Some(f)
    } catch {
      case _ => None
    }
  }

  def flattryo[T](f: => Option[T]): Option[T] = {
    try {
      f
    } catch {
      case _ => None
    }
  }
}

object NameNormalizer {
  def tokenize(s: String): List[String] = {
    s.split(" ").filterNot(_.isEmpty).toList
  }

  def normalize(s: String): String = {
    var n = s.toLowerCase
    // remove periods and quotes
    // \u2013 = en-dash
    n = n.replaceAll("['\u2018\u2019\\.\u2013]", "")
    // change all other punctuation to spaces
    n = n.replaceAll("\\p{Punct}", " ")
    n
  }

  def deaccent(s: String): String = {
    val temp = Normalizer.normalize(s, Normalizer.Form.NFD);
    val pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    pattern.matcher(temp).replaceAll("");
  }
} 

import com.google.common.geometry.S2LatLngRect
import com.google.common.geometry.S2LatLng

object GeoTools {
  val MetersPerMile: Double = 1609.344
  val RadiusInMeters: Int = 6378100 // Approximately a little less than the Earth's polar radius
  val MetersPerDegreeLatitude: Double = 111111.0
  val MetersPerDegreeLongitude: Double = 110540.0 // I'm assuming this as at the Equator

  def boundingBoxToS2Rect(bounds: GeocodeBoundingBox): S2LatLngRect = {
    S2LatLngRect.fromPointPair(
      S2LatLng.fromDegrees(bounds.ne.lat, bounds.ne.lng),
      S2LatLng.fromDegrees(bounds.sw.lat, bounds.sw.lng)
    )
  }

  def pointToS2LatLng(ll: GeocodePoint): S2LatLng = {
    S2LatLng.fromDegrees(ll.lat, ll.lng)
  }

  def boundsContains(bounds: GeocodeBoundingBox, ll: GeocodePoint): Boolean = {
    val rect =  boundingBoxToS2Rect(bounds)
    val point = pointToS2LatLng(ll)
    rect.contains(point)
  }

  def boundsIntersect(b1: GeocodeBoundingBox, b2: GeocodeBoundingBox): Boolean = {
    boundingBoxToS2Rect(b1).intersects(boundingBoxToS2Rect(b2))
  }

  /**
   * @return distance in meters
   */
  def getDistance(geolat1: Double, geolong1: Double, geolat2: Double, geolong2: Double): Int = {
    val theta = geolong1 - geolong2
    val dist = math.sin(math.toRadians(geolat1)) * math.sin(math.toRadians(geolat2)) +
               math.cos(math.toRadians(geolat1)) * math.cos(math.toRadians(geolat2)) * math.cos(math.toRadians(theta))
    (RadiusInMeters * math.acos(dist)).toInt
  }
}
