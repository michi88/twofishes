/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.foursquare.geocoder;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class GeocodeFeature implements TBase<GeocodeFeature, GeocodeFeature._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("GeocodeFeature");

  private static final TField CENTER_FIELD_DESC = new TField("center", TType.STRUCT, (short)1);
  private static final TField CC_FIELD_DESC = new TField("cc", TType.STRING, (short)2);
  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)3);
  private static final TField DISPLAY_NAME_FIELD_DESC = new TField("displayName", TType.STRING, (short)4);
  private static final TField WOE_TYPE_FIELD_DESC = new TField("woeType", TType.I32, (short)5);
  private static final TField BOUNDS_FIELD_DESC = new TField("bounds", TType.STRUCT, (short)6);

  public GeocodePoint center;
  public String cc;
  public String name;
  public String displayName;
  /**
   * 
   * @see YahooWoeType
   */
  public YahooWoeType woeType;
  public GeocodeBoundingBox bounds;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    CENTER((short)1, "center"),
    CC((short)2, "cc"),
    NAME((short)3, "name"),
    DISPLAY_NAME((short)4, "displayName"),
    /**
     * 
     * @see YahooWoeType
     */
    WOE_TYPE((short)5, "woeType"),
    BOUNDS((short)6, "bounds");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CENTER
          return CENTER;
        case 2: // CC
          return CC;
        case 3: // NAME
          return NAME;
        case 4: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 5: // WOE_TYPE
          return WOE_TYPE;
        case 6: // BOUNDS
          return BOUNDS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CENTER, new FieldMetaData("center", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, GeocodePoint.class)));
    tmpMap.put(_Fields.CC, new FieldMetaData("cc", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new FieldMetaData("displayName", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.WOE_TYPE, new FieldMetaData("woeType", TFieldRequirementType.OPTIONAL, 
        new EnumMetaData(TType.ENUM, YahooWoeType.class)));
    tmpMap.put(_Fields.BOUNDS, new FieldMetaData("bounds", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, GeocodeBoundingBox.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(GeocodeFeature.class, metaDataMap);
  }

  public GeocodeFeature() {
  }

  public GeocodeFeature(
    GeocodePoint center,
    String cc)
  {
    this();
    this.center = center;
    this.cc = cc;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GeocodeFeature(GeocodeFeature other) {
    if (other.isSetCenter()) {
      this.center = new GeocodePoint(other.center);
    }
    if (other.isSetCc()) {
      this.cc = other.cc;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    if (other.isSetWoeType()) {
      this.woeType = other.woeType;
    }
    if (other.isSetBounds()) {
      this.bounds = new GeocodeBoundingBox(other.bounds);
    }
  }

  public GeocodeFeature deepCopy() {
    return new GeocodeFeature(this);
  }

  @Override
  public void clear() {
    this.center = null;
    this.cc = null;
    this.name = null;
    this.displayName = null;
    this.woeType = null;
    this.bounds = null;
  }

  public GeocodePoint getCenter() {
    return this.center;
  }

  public GeocodeFeature setCenter(GeocodePoint center) {
    this.center = center;
    return this;
  }

  public void unsetCenter() {
    this.center = null;
  }

  /** Returns true if field center is set (has been asigned a value) and false otherwise */
  public boolean isSetCenter() {
    return this.center != null;
  }

  public void setCenterIsSet(boolean value) {
    if (!value) {
      this.center = null;
    }
  }

  public String getCc() {
    return this.cc;
  }

  public GeocodeFeature setCc(String cc) {
    this.cc = cc;
    return this;
  }

  public void unsetCc() {
    this.cc = null;
  }

  /** Returns true if field cc is set (has been asigned a value) and false otherwise */
  public boolean isSetCc() {
    return this.cc != null;
  }

  public void setCcIsSet(boolean value) {
    if (!value) {
      this.cc = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public GeocodeFeature setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getDisplayName() {
    return this.displayName;
  }

  public GeocodeFeature setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been asigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  /**
   * 
   * @see YahooWoeType
   */
  public YahooWoeType getWoeType() {
    return this.woeType;
  }

  /**
   * 
   * @see YahooWoeType
   */
  public GeocodeFeature setWoeType(YahooWoeType woeType) {
    this.woeType = woeType;
    return this;
  }

  public void unsetWoeType() {
    this.woeType = null;
  }

  /** Returns true if field woeType is set (has been asigned a value) and false otherwise */
  public boolean isSetWoeType() {
    return this.woeType != null;
  }

  public void setWoeTypeIsSet(boolean value) {
    if (!value) {
      this.woeType = null;
    }
  }

  public GeocodeBoundingBox getBounds() {
    return this.bounds;
  }

  public GeocodeFeature setBounds(GeocodeBoundingBox bounds) {
    this.bounds = bounds;
    return this;
  }

  public void unsetBounds() {
    this.bounds = null;
  }

  /** Returns true if field bounds is set (has been asigned a value) and false otherwise */
  public boolean isSetBounds() {
    return this.bounds != null;
  }

  public void setBoundsIsSet(boolean value) {
    if (!value) {
      this.bounds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CENTER:
      if (value == null) {
        unsetCenter();
      } else {
        setCenter((GeocodePoint)value);
      }
      break;

    case CC:
      if (value == null) {
        unsetCc();
      } else {
        setCc((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((String)value);
      }
      break;

    case WOE_TYPE:
      if (value == null) {
        unsetWoeType();
      } else {
        setWoeType((YahooWoeType)value);
      }
      break;

    case BOUNDS:
      if (value == null) {
        unsetBounds();
      } else {
        setBounds((GeocodeBoundingBox)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CENTER:
      return getCenter();

    case CC:
      return getCc();

    case NAME:
      return getName();

    case DISPLAY_NAME:
      return getDisplayName();

    case WOE_TYPE:
      return getWoeType();

    case BOUNDS:
      return getBounds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CENTER:
      return isSetCenter();
    case CC:
      return isSetCc();
    case NAME:
      return isSetName();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case WOE_TYPE:
      return isSetWoeType();
    case BOUNDS:
      return isSetBounds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GeocodeFeature)
      return this.equals((GeocodeFeature)that);
    return false;
  }

  public boolean equals(GeocodeFeature that) {
    if (that == null)
      return false;

    boolean this_present_center = true && this.isSetCenter();
    boolean that_present_center = true && that.isSetCenter();
    if (this_present_center || that_present_center) {
      if (!(this_present_center && that_present_center))
        return false;
      if (!this.center.equals(that.center))
        return false;
    }

    boolean this_present_cc = true && this.isSetCc();
    boolean that_present_cc = true && that.isSetCc();
    if (this_present_cc || that_present_cc) {
      if (!(this_present_cc && that_present_cc))
        return false;
      if (!this.cc.equals(that.cc))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_woeType = true && this.isSetWoeType();
    boolean that_present_woeType = true && that.isSetWoeType();
    if (this_present_woeType || that_present_woeType) {
      if (!(this_present_woeType && that_present_woeType))
        return false;
      if (!this.woeType.equals(that.woeType))
        return false;
    }

    boolean this_present_bounds = true && this.isSetBounds();
    boolean that_present_bounds = true && that.isSetBounds();
    if (this_present_bounds || that_present_bounds) {
      if (!(this_present_bounds && that_present_bounds))
        return false;
      if (!this.bounds.equals(that.bounds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(GeocodeFeature other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GeocodeFeature typedOther = (GeocodeFeature)other;

    lastComparison = Boolean.valueOf(isSetCenter()).compareTo(typedOther.isSetCenter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCenter()) {
      lastComparison = TBaseHelper.compareTo(this.center, typedOther.center);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCc()).compareTo(typedOther.isSetCc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCc()) {
      lastComparison = TBaseHelper.compareTo(this.cc, typedOther.cc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDisplayName()).compareTo(typedOther.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = TBaseHelper.compareTo(this.displayName, typedOther.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWoeType()).compareTo(typedOther.isSetWoeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWoeType()) {
      lastComparison = TBaseHelper.compareTo(this.woeType, typedOther.woeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBounds()).compareTo(typedOther.isSetBounds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBounds()) {
      lastComparison = TBaseHelper.compareTo(this.bounds, typedOther.bounds);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // CENTER
          if (field.type == TType.STRUCT) {
            this.center = new GeocodePoint();
            this.center.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // CC
          if (field.type == TType.STRING) {
            this.cc = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // DISPLAY_NAME
          if (field.type == TType.STRING) {
            this.displayName = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // WOE_TYPE
          if (field.type == TType.I32) {
            this.woeType = YahooWoeType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // BOUNDS
          if (field.type == TType.STRUCT) {
            this.bounds = new GeocodeBoundingBox();
            this.bounds.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.center != null) {
      oprot.writeFieldBegin(CENTER_FIELD_DESC);
      this.center.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.cc != null) {
      oprot.writeFieldBegin(CC_FIELD_DESC);
      oprot.writeString(this.cc);
      oprot.writeFieldEnd();
    }
    if (this.name != null) {
      if (isSetName()) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(this.name);
        oprot.writeFieldEnd();
      }
    }
    if (this.displayName != null) {
      if (isSetDisplayName()) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(this.displayName);
        oprot.writeFieldEnd();
      }
    }
    if (this.woeType != null) {
      if (isSetWoeType()) {
        oprot.writeFieldBegin(WOE_TYPE_FIELD_DESC);
        oprot.writeI32(this.woeType.getValue());
        oprot.writeFieldEnd();
      }
    }
    if (this.bounds != null) {
      if (isSetBounds()) {
        oprot.writeFieldBegin(BOUNDS_FIELD_DESC);
        this.bounds.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GeocodeFeature(");
    boolean first = true;

    sb.append("center:");
    if (this.center == null) {
      sb.append("null");
    } else {
      sb.append(this.center);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cc:");
    if (this.cc == null) {
      sb.append("null");
    } else {
      sb.append(this.cc);
    }
    first = false;
    if (isSetName()) {
      if (!first) sb.append(", ");
      sb.append("name:");
      if (this.name == null) {
        sb.append("null");
      } else {
        sb.append(this.name);
      }
      first = false;
    }
    if (isSetDisplayName()) {
      if (!first) sb.append(", ");
      sb.append("displayName:");
      if (this.displayName == null) {
        sb.append("null");
      } else {
        sb.append(this.displayName);
      }
      first = false;
    }
    if (isSetWoeType()) {
      if (!first) sb.append(", ");
      sb.append("woeType:");
      if (this.woeType == null) {
        sb.append("null");
      } else {
        sb.append(this.woeType);
      }
      first = false;
    }
    if (isSetBounds()) {
      if (!first) sb.append(", ");
      sb.append("bounds:");
      if (this.bounds == null) {
        sb.append("null");
      } else {
        sb.append(this.bounds);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

