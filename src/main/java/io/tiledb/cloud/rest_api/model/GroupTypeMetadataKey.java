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
 * A group type is stored in the group metadata using this key
 */
@JsonAdapter(GroupTypeMetadataKey.Adapter.class)
public enum GroupTypeMetadataKey {
  
  DATASET_TYPE("dataset_type");

  private String value;

  GroupTypeMetadataKey(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupTypeMetadataKey fromValue(String value) {
    for (GroupTypeMetadataKey b : GroupTypeMetadataKey.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GroupTypeMetadataKey> {
    @Override
    public void write(final JsonWriter jsonWriter, final GroupTypeMetadataKey enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GroupTypeMetadataKey read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GroupTypeMetadataKey.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    GroupTypeMetadataKey.fromValue(value);
  }
}

