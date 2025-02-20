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
 * TileDB filter types
 */
@JsonAdapter(FilterType.Adapter.class)
public enum FilterType {
  
  NONE("NONE"),
  
  GZIP("GZIP"),
  
  ZSTD("ZSTD"),
  
  LZ4("LZ4"),
  
  RLE("RLE"),
  
  BZIP2("BZIP2"),
  
  DOUBLE_DELTA("DOUBLE_DELTA"),
  
  BIT_WIDTH_REDUCTION("BIT_WIDTH_REDUCTION"),
  
  BITSHUFFLE("BITSHUFFLE"),
  
  BYTESHUFFLE("BYTESHUFFLE"),
  
  POSITIVE_DELTA("POSITIVE_DELTA");

  private String value;

  FilterType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FilterType fromValue(String value) {
    for (FilterType b : FilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FilterType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FilterType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FilterType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FilterType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FilterType.fromValue(value);
  }
}

