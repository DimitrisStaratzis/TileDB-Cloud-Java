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
 * Synchronous Task Type
 */
@JsonAdapter(ArrayTaskType.Adapter.class)
public enum ArrayTaskType {
  
  SQL("SQL"),
  
  UDF("UDF"),
  
  QUERY("QUERY"),
  
  GENERIC_UDF("GENERIC_UDF"),
  
  BATCH_UDF("BATCH_UDF"),
  
  CLIENT_COMPUTATION("CLIENT_COMPUTATION");

  private String value;

  ArrayTaskType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ArrayTaskType fromValue(String value) {
    for (ArrayTaskType b : ArrayTaskType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ArrayTaskType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ArrayTaskType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ArrayTaskType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ArrayTaskType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ArrayTaskType.fromValue(value);
  }
}

