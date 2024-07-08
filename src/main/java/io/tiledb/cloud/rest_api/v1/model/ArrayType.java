/*
 * TileDB Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 2.2.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tiledb.cloud.rest_api.v1.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * TileDB array type
 */
@JsonAdapter(ArrayType.Adapter.class)
public enum ArrayType {
  
  DENSE("dense"),
  
  SPARSE("sparse");

  private String value;

  ArrayType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ArrayType fromValue(String value) {
    for (ArrayType b : ArrayType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ArrayType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ArrayType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ArrayType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ArrayType.fromValue(value);
    }
  }
}

