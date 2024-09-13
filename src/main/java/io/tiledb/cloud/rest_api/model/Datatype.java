/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.17.51
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tiledb.cloud.rest_api.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * TileDB data type
 */
@JsonAdapter(Datatype.Adapter.class)
public enum Datatype {
  
  INT32("INT32"),
  
  INT64("INT64"),
  
  FLOAT32("FLOAT32"),
  
  FLOAT64("FLOAT64"),
  
  CHAR("CHAR"),
  
  INT8("INT8"),
  
  UINT8("UINT8"),
  
  INT16("INT16"),
  
  UINT16("UINT16"),
  
  UINT32("UINT32"),
  
  UINT64("UINT64"),
  
  STRING_ASCII("STRING_ASCII"),
  
  STRING_UTF8("STRING_UTF8"),
  
  STRING_UTF16("STRING_UTF16"),
  
  STRING_UTF32("STRING_UTF32"),
  
  STRING_UCS2("STRING_UCS2"),
  
  STRING_UCS4("STRING_UCS4"),
  
  ANY("ANY"),
  
  DATETIME_YEAR("DATETIME_YEAR"),
  
  DATETIME_MONTH("DATETIME_MONTH"),
  
  DATETIME_WEEK("DATETIME_WEEK"),
  
  DATETIME_DAY("DATETIME_DAY"),
  
  DATETIME_HR("DATETIME_HR"),
  
  DATETIME_MIN("DATETIME_MIN"),
  
  DATETIME_SEC("DATETIME_SEC"),
  
  DATETIME_MS("DATETIME_MS"),
  
  DATETIME_US("DATETIME_US"),
  
  DATETIME_NS("DATETIME_NS"),
  
  DATETIME_PS("DATETIME_PS"),
  
  DATETIME_FS("DATETIME_FS"),
  
  DATETIME_AS("DATETIME_AS"),
  
  TIME_HR("TIME_HR"),
  
  TIME_MIN("TIME_MIN"),
  
  TIME_SEC("TIME_SEC"),
  
  TIME_MS("TIME_MS"),
  
  TIME_US("TIME_US"),
  
  TIME_NS("TIME_NS"),
  
  TIME_PS("TIME_PS"),
  
  TIME_FS("TIME_FS"),
  
  TIME_AS("TIME_AS"),
  
  BLOB("BLOB"),
  
  BOOL("BOOL");

  private String value;

  Datatype(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Datatype fromValue(String value) {
    for (Datatype b : Datatype.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<Datatype> {
    @Override
    public void write(final JsonWriter jsonWriter, final Datatype enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Datatype read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Datatype.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    Datatype.fromValue(value);
  }
}

