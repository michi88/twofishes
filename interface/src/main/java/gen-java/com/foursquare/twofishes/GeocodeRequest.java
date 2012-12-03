/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.foursquare.twofishes;

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

public class GeocodeRequest implements TBase<GeocodeRequest, GeocodeRequest._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("GeocodeRequest");

  private static final TField QUERY_FIELD_DESC = new TField("query", TType.STRING, (short)1);
  private static final TField CC_FIELD_DESC = new TField("cc", TType.STRING, (short)2);
  private static final TField LANG_FIELD_DESC = new TField("lang", TType.STRING, (short)3);
  private static final TField LL_FIELD_DESC = new TField("ll", TType.STRUCT, (short)4);
  private static final TField FULL_FIELD_DESC = new TField("full", TType.BOOL, (short)5);
  private static final TField DEBUG_FIELD_DESC = new TField("debug", TType.I32, (short)6);
  private static final TField AUTOCOMPLETE_FIELD_DESC = new TField("autocomplete", TType.BOOL, (short)7);
  private static final TField WOE_HINT_FIELD_DESC = new TField("woeHint", TType.LIST, (short)8);
  private static final TField WOE_RESTRICT_FIELD_DESC = new TField("woeRestrict", TType.LIST, (short)9);
  private static final TField BOUNDS_FIELD_DESC = new TField("bounds", TType.STRUCT, (short)10);

  public String query;
  public String cc;
  public String lang;
  public GeocodePoint ll;
  public boolean full;
  public int debug;
  public boolean autocomplete;
  public List<YahooWoeType> woeHint;
  public List<YahooWoeType> woeRestrict;
  public GeocodeBoundingBox bounds;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    QUERY((short)1, "query"),
    CC((short)2, "cc"),
    LANG((short)3, "lang"),
    LL((short)4, "ll"),
    FULL((short)5, "full"),
    DEBUG((short)6, "debug"),
    AUTOCOMPLETE((short)7, "autocomplete"),
    WOE_HINT((short)8, "woeHint"),
    WOE_RESTRICT((short)9, "woeRestrict"),
    BOUNDS((short)10, "bounds");

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
        case 1: // QUERY
          return QUERY;
        case 2: // CC
          return CC;
        case 3: // LANG
          return LANG;
        case 4: // LL
          return LL;
        case 5: // FULL
          return FULL;
        case 6: // DEBUG
          return DEBUG;
        case 7: // AUTOCOMPLETE
          return AUTOCOMPLETE;
        case 8: // WOE_HINT
          return WOE_HINT;
        case 9: // WOE_RESTRICT
          return WOE_RESTRICT;
        case 10: // BOUNDS
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
  private static final int __FULL_ISSET_ID = 0;
  private static final int __DEBUG_ISSET_ID = 1;
  private static final int __AUTOCOMPLETE_ISSET_ID = 2;
  private BitSet __isset_bit_vector = new BitSet(3);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.QUERY, new FieldMetaData("query", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.CC, new FieldMetaData("cc", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.LANG, new FieldMetaData("lang", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.LL, new FieldMetaData("ll", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, GeocodePoint.class)));
    tmpMap.put(_Fields.FULL, new FieldMetaData("full", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.DEBUG, new FieldMetaData("debug", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.AUTOCOMPLETE, new FieldMetaData("autocomplete", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMap.put(_Fields.WOE_HINT, new FieldMetaData("woeHint", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new EnumMetaData(TType.ENUM, YahooWoeType.class))));
    tmpMap.put(_Fields.WOE_RESTRICT, new FieldMetaData("woeRestrict", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new EnumMetaData(TType.ENUM, YahooWoeType.class))));
    tmpMap.put(_Fields.BOUNDS, new FieldMetaData("bounds", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, GeocodeBoundingBox.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(GeocodeRequest.class, metaDataMap);
  }

  public GeocodeRequest() {
    this.lang = "en";

    this.full = false;

    this.debug = 0;

    this.autocomplete = false;

    this.woeHint = new ArrayList<YahooWoeType>();

    this.woeRestrict = new ArrayList<YahooWoeType>();

  }

  public GeocodeRequest(
    String query)
  {
    this();
    this.query = query;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GeocodeRequest(GeocodeRequest other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetQuery()) {
      this.query = other.query;
    }
    if (other.isSetCc()) {
      this.cc = other.cc;
    }
    if (other.isSetLang()) {
      this.lang = other.lang;
    }
    if (other.isSetLl()) {
      this.ll = new GeocodePoint(other.ll);
    }
    this.full = other.full;
    this.debug = other.debug;
    this.autocomplete = other.autocomplete;
    if (other.isSetWoeHint()) {
      List<YahooWoeType> __this__woeHint = new ArrayList<YahooWoeType>();
      for (YahooWoeType other_element : other.woeHint) {
        __this__woeHint.add(other_element);
      }
      this.woeHint = __this__woeHint;
    }
    if (other.isSetWoeRestrict()) {
      List<YahooWoeType> __this__woeRestrict = new ArrayList<YahooWoeType>();
      for (YahooWoeType other_element : other.woeRestrict) {
        __this__woeRestrict.add(other_element);
      }
      this.woeRestrict = __this__woeRestrict;
    }
    if (other.isSetBounds()) {
      this.bounds = new GeocodeBoundingBox(other.bounds);
    }
  }

  public GeocodeRequest deepCopy() {
    return new GeocodeRequest(this);
  }

  @Override
  public void clear() {
    this.query = null;
    this.cc = null;
    this.lang = "en";

    this.ll = null;
    this.full = false;

    this.debug = 0;

    this.autocomplete = false;

    this.woeHint = new ArrayList<YahooWoeType>();

    this.woeRestrict = new ArrayList<YahooWoeType>();

    this.bounds = null;
  }

  public String getQuery() {
    return this.query;
  }

  public GeocodeRequest setQuery(String query) {
    this.query = query;
    return this;
  }

  public void unsetQuery() {
    this.query = null;
  }

  /** Returns true if field query is set (has been asigned a value) and false otherwise */
  public boolean isSetQuery() {
    return this.query != null;
  }

  public void setQueryIsSet(boolean value) {
    if (!value) {
      this.query = null;
    }
  }

  public String getCc() {
    return this.cc;
  }

  public GeocodeRequest setCc(String cc) {
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

  public String getLang() {
    return this.lang;
  }

  public GeocodeRequest setLang(String lang) {
    this.lang = lang;
    return this;
  }

  public void unsetLang() {
    this.lang = null;
  }

  /** Returns true if field lang is set (has been asigned a value) and false otherwise */
  public boolean isSetLang() {
    return this.lang != null;
  }

  public void setLangIsSet(boolean value) {
    if (!value) {
      this.lang = null;
    }
  }

  public GeocodePoint getLl() {
    return this.ll;
  }

  public GeocodeRequest setLl(GeocodePoint ll) {
    this.ll = ll;
    return this;
  }

  public void unsetLl() {
    this.ll = null;
  }

  /** Returns true if field ll is set (has been asigned a value) and false otherwise */
  public boolean isSetLl() {
    return this.ll != null;
  }

  public void setLlIsSet(boolean value) {
    if (!value) {
      this.ll = null;
    }
  }

  public boolean isFull() {
    return this.full;
  }

  public GeocodeRequest setFull(boolean full) {
    this.full = full;
    setFullIsSet(true);
    return this;
  }

  public void unsetFull() {
    __isset_bit_vector.clear(__FULL_ISSET_ID);
  }

  /** Returns true if field full is set (has been asigned a value) and false otherwise */
  public boolean isSetFull() {
    return __isset_bit_vector.get(__FULL_ISSET_ID);
  }

  public void setFullIsSet(boolean value) {
    __isset_bit_vector.set(__FULL_ISSET_ID, value);
  }

  public int getDebug() {
    return this.debug;
  }

  public GeocodeRequest setDebug(int debug) {
    this.debug = debug;
    setDebugIsSet(true);
    return this;
  }

  public void unsetDebug() {
    __isset_bit_vector.clear(__DEBUG_ISSET_ID);
  }

  /** Returns true if field debug is set (has been asigned a value) and false otherwise */
  public boolean isSetDebug() {
    return __isset_bit_vector.get(__DEBUG_ISSET_ID);
  }

  public void setDebugIsSet(boolean value) {
    __isset_bit_vector.set(__DEBUG_ISSET_ID, value);
  }

  public boolean isAutocomplete() {
    return this.autocomplete;
  }

  public GeocodeRequest setAutocomplete(boolean autocomplete) {
    this.autocomplete = autocomplete;
    setAutocompleteIsSet(true);
    return this;
  }

  public void unsetAutocomplete() {
    __isset_bit_vector.clear(__AUTOCOMPLETE_ISSET_ID);
  }

  /** Returns true if field autocomplete is set (has been asigned a value) and false otherwise */
  public boolean isSetAutocomplete() {
    return __isset_bit_vector.get(__AUTOCOMPLETE_ISSET_ID);
  }

  public void setAutocompleteIsSet(boolean value) {
    __isset_bit_vector.set(__AUTOCOMPLETE_ISSET_ID, value);
  }

  public int getWoeHintSize() {
    return (this.woeHint == null) ? 0 : this.woeHint.size();
  }

  public java.util.Iterator<YahooWoeType> getWoeHintIterator() {
    return (this.woeHint == null) ? null : this.woeHint.iterator();
  }

  public void addToWoeHint(YahooWoeType elem) {
    if (this.woeHint == null) {
      this.woeHint = new ArrayList<YahooWoeType>();
    }
    this.woeHint.add(elem);
  }

  public List<YahooWoeType> getWoeHint() {
    return this.woeHint;
  }

  public GeocodeRequest setWoeHint(List<YahooWoeType> woeHint) {
    this.woeHint = woeHint;
    return this;
  }

  public void unsetWoeHint() {
    this.woeHint = null;
  }

  /** Returns true if field woeHint is set (has been asigned a value) and false otherwise */
  public boolean isSetWoeHint() {
    return this.woeHint != null;
  }

  public void setWoeHintIsSet(boolean value) {
    if (!value) {
      this.woeHint = null;
    }
  }

  public int getWoeRestrictSize() {
    return (this.woeRestrict == null) ? 0 : this.woeRestrict.size();
  }

  public java.util.Iterator<YahooWoeType> getWoeRestrictIterator() {
    return (this.woeRestrict == null) ? null : this.woeRestrict.iterator();
  }

  public void addToWoeRestrict(YahooWoeType elem) {
    if (this.woeRestrict == null) {
      this.woeRestrict = new ArrayList<YahooWoeType>();
    }
    this.woeRestrict.add(elem);
  }

  public List<YahooWoeType> getWoeRestrict() {
    return this.woeRestrict;
  }

  public GeocodeRequest setWoeRestrict(List<YahooWoeType> woeRestrict) {
    this.woeRestrict = woeRestrict;
    return this;
  }

  public void unsetWoeRestrict() {
    this.woeRestrict = null;
  }

  /** Returns true if field woeRestrict is set (has been asigned a value) and false otherwise */
  public boolean isSetWoeRestrict() {
    return this.woeRestrict != null;
  }

  public void setWoeRestrictIsSet(boolean value) {
    if (!value) {
      this.woeRestrict = null;
    }
  }

  public GeocodeBoundingBox getBounds() {
    return this.bounds;
  }

  public GeocodeRequest setBounds(GeocodeBoundingBox bounds) {
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
    case QUERY:
      if (value == null) {
        unsetQuery();
      } else {
        setQuery((String)value);
      }
      break;

    case CC:
      if (value == null) {
        unsetCc();
      } else {
        setCc((String)value);
      }
      break;

    case LANG:
      if (value == null) {
        unsetLang();
      } else {
        setLang((String)value);
      }
      break;

    case LL:
      if (value == null) {
        unsetLl();
      } else {
        setLl((GeocodePoint)value);
      }
      break;

    case FULL:
      if (value == null) {
        unsetFull();
      } else {
        setFull((Boolean)value);
      }
      break;

    case DEBUG:
      if (value == null) {
        unsetDebug();
      } else {
        setDebug((Integer)value);
      }
      break;

    case AUTOCOMPLETE:
      if (value == null) {
        unsetAutocomplete();
      } else {
        setAutocomplete((Boolean)value);
      }
      break;

    case WOE_HINT:
      if (value == null) {
        unsetWoeHint();
      } else {
        setWoeHint((List<YahooWoeType>)value);
      }
      break;

    case WOE_RESTRICT:
      if (value == null) {
        unsetWoeRestrict();
      } else {
        setWoeRestrict((List<YahooWoeType>)value);
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
    case QUERY:
      return getQuery();

    case CC:
      return getCc();

    case LANG:
      return getLang();

    case LL:
      return getLl();

    case FULL:
      return new Boolean(isFull());

    case DEBUG:
      return new Integer(getDebug());

    case AUTOCOMPLETE:
      return new Boolean(isAutocomplete());

    case WOE_HINT:
      return getWoeHint();

    case WOE_RESTRICT:
      return getWoeRestrict();

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
    case QUERY:
      return isSetQuery();
    case CC:
      return isSetCc();
    case LANG:
      return isSetLang();
    case LL:
      return isSetLl();
    case FULL:
      return isSetFull();
    case DEBUG:
      return isSetDebug();
    case AUTOCOMPLETE:
      return isSetAutocomplete();
    case WOE_HINT:
      return isSetWoeHint();
    case WOE_RESTRICT:
      return isSetWoeRestrict();
    case BOUNDS:
      return isSetBounds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GeocodeRequest)
      return this.equals((GeocodeRequest)that);
    return false;
  }

  public boolean equals(GeocodeRequest that) {
    if (that == null)
      return false;

    boolean this_present_query = true && this.isSetQuery();
    boolean that_present_query = true && that.isSetQuery();
    if (this_present_query || that_present_query) {
      if (!(this_present_query && that_present_query))
        return false;
      if (!this.query.equals(that.query))
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

    boolean this_present_lang = true && this.isSetLang();
    boolean that_present_lang = true && that.isSetLang();
    if (this_present_lang || that_present_lang) {
      if (!(this_present_lang && that_present_lang))
        return false;
      if (!this.lang.equals(that.lang))
        return false;
    }

    boolean this_present_ll = true && this.isSetLl();
    boolean that_present_ll = true && that.isSetLl();
    if (this_present_ll || that_present_ll) {
      if (!(this_present_ll && that_present_ll))
        return false;
      if (!this.ll.equals(that.ll))
        return false;
    }

    boolean this_present_full = true && this.isSetFull();
    boolean that_present_full = true && that.isSetFull();
    if (this_present_full || that_present_full) {
      if (!(this_present_full && that_present_full))
        return false;
      if (this.full != that.full)
        return false;
    }

    boolean this_present_debug = true && this.isSetDebug();
    boolean that_present_debug = true && that.isSetDebug();
    if (this_present_debug || that_present_debug) {
      if (!(this_present_debug && that_present_debug))
        return false;
      if (this.debug != that.debug)
        return false;
    }

    boolean this_present_autocomplete = true && this.isSetAutocomplete();
    boolean that_present_autocomplete = true && that.isSetAutocomplete();
    if (this_present_autocomplete || that_present_autocomplete) {
      if (!(this_present_autocomplete && that_present_autocomplete))
        return false;
      if (this.autocomplete != that.autocomplete)
        return false;
    }

    boolean this_present_woeHint = true && this.isSetWoeHint();
    boolean that_present_woeHint = true && that.isSetWoeHint();
    if (this_present_woeHint || that_present_woeHint) {
      if (!(this_present_woeHint && that_present_woeHint))
        return false;
      if (!this.woeHint.equals(that.woeHint))
        return false;
    }

    boolean this_present_woeRestrict = true && this.isSetWoeRestrict();
    boolean that_present_woeRestrict = true && that.isSetWoeRestrict();
    if (this_present_woeRestrict || that_present_woeRestrict) {
      if (!(this_present_woeRestrict && that_present_woeRestrict))
        return false;
      if (!this.woeRestrict.equals(that.woeRestrict))
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

  public int compareTo(GeocodeRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    GeocodeRequest typedOther = (GeocodeRequest)other;

    lastComparison = Boolean.valueOf(isSetQuery()).compareTo(typedOther.isSetQuery());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQuery()) {
      lastComparison = TBaseHelper.compareTo(this.query, typedOther.query);
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
    lastComparison = Boolean.valueOf(isSetLang()).compareTo(typedOther.isSetLang());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLang()) {
      lastComparison = TBaseHelper.compareTo(this.lang, typedOther.lang);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLl()).compareTo(typedOther.isSetLl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLl()) {
      lastComparison = TBaseHelper.compareTo(this.ll, typedOther.ll);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFull()).compareTo(typedOther.isSetFull());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFull()) {
      lastComparison = TBaseHelper.compareTo(this.full, typedOther.full);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDebug()).compareTo(typedOther.isSetDebug());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebug()) {
      lastComparison = TBaseHelper.compareTo(this.debug, typedOther.debug);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAutocomplete()).compareTo(typedOther.isSetAutocomplete());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAutocomplete()) {
      lastComparison = TBaseHelper.compareTo(this.autocomplete, typedOther.autocomplete);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWoeHint()).compareTo(typedOther.isSetWoeHint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWoeHint()) {
      lastComparison = TBaseHelper.compareTo(this.woeHint, typedOther.woeHint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWoeRestrict()).compareTo(typedOther.isSetWoeRestrict());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWoeRestrict()) {
      lastComparison = TBaseHelper.compareTo(this.woeRestrict, typedOther.woeRestrict);
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
        case 1: // QUERY
          if (field.type == TType.STRING) {
            this.query = iprot.readString();
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
        case 3: // LANG
          if (field.type == TType.STRING) {
            this.lang = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // LL
          if (field.type == TType.STRUCT) {
            this.ll = new GeocodePoint();
            this.ll.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // FULL
          if (field.type == TType.BOOL) {
            this.full = iprot.readBool();
            setFullIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // DEBUG
          if (field.type == TType.I32) {
            this.debug = iprot.readI32();
            setDebugIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 7: // AUTOCOMPLETE
          if (field.type == TType.BOOL) {
            this.autocomplete = iprot.readBool();
            setAutocompleteIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 8: // WOE_HINT
          if (field.type == TType.LIST) {
            {
              TList _list40 = iprot.readListBegin();
              this.woeHint = new ArrayList<YahooWoeType>(_list40.size);
              for (int _i41 = 0; _i41 < _list40.size; ++_i41)
              {
                YahooWoeType _elem42;
                _elem42 = YahooWoeType.findByValue(iprot.readI32());
                this.woeHint.add(_elem42);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 9: // WOE_RESTRICT
          if (field.type == TType.LIST) {
            {
              TList _list43 = iprot.readListBegin();
              this.woeRestrict = new ArrayList<YahooWoeType>(_list43.size);
              for (int _i44 = 0; _i44 < _list43.size; ++_i44)
              {
                YahooWoeType _elem45;
                _elem45 = YahooWoeType.findByValue(iprot.readI32());
                this.woeRestrict.add(_elem45);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // BOUNDS
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
    if (this.query != null) {
      oprot.writeFieldBegin(QUERY_FIELD_DESC);
      oprot.writeString(this.query);
      oprot.writeFieldEnd();
    }
    if (this.cc != null) {
      if (isSetCc()) {
        oprot.writeFieldBegin(CC_FIELD_DESC);
        oprot.writeString(this.cc);
        oprot.writeFieldEnd();
      }
    }
    if (this.lang != null) {
      if (isSetLang()) {
        oprot.writeFieldBegin(LANG_FIELD_DESC);
        oprot.writeString(this.lang);
        oprot.writeFieldEnd();
      }
    }
    if (this.ll != null) {
      if (isSetLl()) {
        oprot.writeFieldBegin(LL_FIELD_DESC);
        this.ll.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (isSetFull()) {
      oprot.writeFieldBegin(FULL_FIELD_DESC);
      oprot.writeBool(this.full);
      oprot.writeFieldEnd();
    }
    if (isSetDebug()) {
      oprot.writeFieldBegin(DEBUG_FIELD_DESC);
      oprot.writeI32(this.debug);
      oprot.writeFieldEnd();
    }
    if (isSetAutocomplete()) {
      oprot.writeFieldBegin(AUTOCOMPLETE_FIELD_DESC);
      oprot.writeBool(this.autocomplete);
      oprot.writeFieldEnd();
    }
    if (this.woeHint != null) {
      if (isSetWoeHint()) {
        oprot.writeFieldBegin(WOE_HINT_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.woeHint.size()));
          for (YahooWoeType _iter46 : this.woeHint)
          {
            oprot.writeI32(_iter46.getValue());
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.woeRestrict != null) {
      if (isSetWoeRestrict()) {
        oprot.writeFieldBegin(WOE_RESTRICT_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.woeRestrict.size()));
          for (YahooWoeType _iter47 : this.woeRestrict)
          {
            oprot.writeI32(_iter47.getValue());
          }
          oprot.writeListEnd();
        }
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
    StringBuilder sb = new StringBuilder("GeocodeRequest(");
    boolean first = true;

    sb.append("query:");
    if (this.query == null) {
      sb.append("null");
    } else {
      sb.append(this.query);
    }
    first = false;
    if (isSetCc()) {
      if (!first) sb.append(", ");
      sb.append("cc:");
      if (this.cc == null) {
        sb.append("null");
      } else {
        sb.append(this.cc);
      }
      first = false;
    }
    if (isSetLang()) {
      if (!first) sb.append(", ");
      sb.append("lang:");
      if (this.lang == null) {
        sb.append("null");
      } else {
        sb.append(this.lang);
      }
      first = false;
    }
    if (isSetLl()) {
      if (!first) sb.append(", ");
      sb.append("ll:");
      if (this.ll == null) {
        sb.append("null");
      } else {
        sb.append(this.ll);
      }
      first = false;
    }
    if (isSetFull()) {
      if (!first) sb.append(", ");
      sb.append("full:");
      sb.append(this.full);
      first = false;
    }
    if (isSetDebug()) {
      if (!first) sb.append(", ");
      sb.append("debug:");
      sb.append(this.debug);
      first = false;
    }
    if (isSetAutocomplete()) {
      if (!first) sb.append(", ");
      sb.append("autocomplete:");
      sb.append(this.autocomplete);
      first = false;
    }
    if (isSetWoeHint()) {
      if (!first) sb.append(", ");
      sb.append("woeHint:");
      if (this.woeHint == null) {
        sb.append("null");
      } else {
        sb.append(this.woeHint);
      }
      first = false;
    }
    if (isSetWoeRestrict()) {
      if (!first) sb.append(", ");
      sb.append("woeRestrict:");
      if (this.woeRestrict == null) {
        sb.append("null");
      } else {
        sb.append(this.woeRestrict);
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

