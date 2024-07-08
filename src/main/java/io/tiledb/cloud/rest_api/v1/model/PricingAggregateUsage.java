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
 * Specifies a usage aggregation strategy for pricings of usage_type&#x3D;metered
 */
@JsonAdapter(PricingAggregateUsage.Adapter.class)
public enum PricingAggregateUsage {
  
  SUM("sum");

  private String value;

  PricingAggregateUsage(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PricingAggregateUsage fromValue(String value) {
    for (PricingAggregateUsage b : PricingAggregateUsage.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<PricingAggregateUsage> {
    @Override
    public void write(final JsonWriter jsonWriter, final PricingAggregateUsage enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PricingAggregateUsage read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PricingAggregateUsage.fromValue(value);
    }
  }
}

