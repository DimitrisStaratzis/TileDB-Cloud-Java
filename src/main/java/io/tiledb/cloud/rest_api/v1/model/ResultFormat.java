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
 * Data format of a result
 */
@JsonAdapter(ResultFormat.Adapter.class)
public enum ResultFormat {
  
  PYTHON_PICKLE("python_pickle"),
  
  R_SERIALIZATION("r_serialization"),
  
  JSON("json"),
  
  ARROW("arrow"),
  
  BYTES("bytes"),
  
  TILEDB_JSON("tiledb_json"),
  
  NATIVE("native");

  private String value;

  ResultFormat(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ResultFormat fromValue(String value) {
    for (ResultFormat b : ResultFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResultFormat> {
    @Override
    public void write(final JsonWriter jsonWriter, final ResultFormat enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResultFormat read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ResultFormat.fromValue(value);
    }
  }
}

