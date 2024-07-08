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
 * The status of a given task graph execution.
 */
@JsonAdapter(TaskGraphLogStatus.Adapter.class)
public enum TaskGraphLogStatus {
  
  SUBMITTED("submitted"),
  
  RUNNING("running"),
  
  IDLE("idle"),
  
  ABANDONED("abandoned"),
  
  SUCCEEDED("succeeded"),
  
  FAILED("failed"),
  
  CANCELLED("cancelled");

  private String value;

  TaskGraphLogStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TaskGraphLogStatus fromValue(String value) {
    for (TaskGraphLogStatus b : TaskGraphLogStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TaskGraphLogStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TaskGraphLogStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TaskGraphLogStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TaskGraphLogStatus.fromValue(value);
    }
  }
}

