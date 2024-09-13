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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.tiledb.cloud.rest_api.model.Datatype;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.tiledb.cloud.rest_api.JSON;

/**
 * A set of 1D ranges for a subarray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class SubarrayRanges {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Datatype type;

  public static final String SERIALIZED_NAME_HAS_DEFAULT_RANGE = "hasDefaultRange";
  @SerializedName(SERIALIZED_NAME_HAS_DEFAULT_RANGE)
  private Boolean hasDefaultRange;

  public static final String SERIALIZED_NAME_BUFFER = "buffer";
  @SerializedName(SERIALIZED_NAME_BUFFER)
  private List<Integer> buffer = new ArrayList<>();

  public SubarrayRanges() {
  }

  public SubarrayRanges type(Datatype type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  public Datatype getType() {
    return type;
  }

  public void setType(Datatype type) {
    this.type = type;
  }


  public SubarrayRanges hasDefaultRange(Boolean hasDefaultRange) {
    this.hasDefaultRange = hasDefaultRange;
    return this;
  }

  /**
   * True if the range is the default range
   * @return hasDefaultRange
   */
  @javax.annotation.Nullable
  public Boolean getHasDefaultRange() {
    return hasDefaultRange;
  }

  public void setHasDefaultRange(Boolean hasDefaultRange) {
    this.hasDefaultRange = hasDefaultRange;
  }


  public SubarrayRanges buffer(List<Integer> buffer) {
    this.buffer = buffer;
    return this;
  }

  public SubarrayRanges addBufferItem(Integer bufferItem) {
    if (this.buffer == null) {
      this.buffer = new ArrayList<>();
    }
    this.buffer.add(bufferItem);
    return this;
  }

  /**
   * The bytes of the ranges
   * @return buffer
   */
  @javax.annotation.Nullable
  public List<Integer> getBuffer() {
    return buffer;
  }

  public void setBuffer(List<Integer> buffer) {
    this.buffer = buffer;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SubarrayRanges instance itself
   */
  public SubarrayRanges putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubarrayRanges subarrayRanges = (SubarrayRanges) o;
    return Objects.equals(this.type, subarrayRanges.type) &&
        Objects.equals(this.hasDefaultRange, subarrayRanges.hasDefaultRange) &&
        Objects.equals(this.buffer, subarrayRanges.buffer)&&
        Objects.equals(this.additionalProperties, subarrayRanges.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, hasDefaultRange, buffer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubarrayRanges {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hasDefaultRange: ").append(toIndentedString(hasDefaultRange)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("type");
    openapiFields.add("hasDefaultRange");
    openapiFields.add("buffer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubarrayRanges
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubarrayRanges.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubarrayRanges is not found in the empty JSON string", SubarrayRanges.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        Datatype.validateJsonElement(jsonObj.get("type"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("buffer") != null && !jsonObj.get("buffer").isJsonNull() && !jsonObj.get("buffer").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `buffer` to be an array in the JSON string but got `%s`", jsonObj.get("buffer").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubarrayRanges.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubarrayRanges' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubarrayRanges> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubarrayRanges.class));

       return (TypeAdapter<T>) new TypeAdapter<SubarrayRanges>() {
           @Override
           public void write(JsonWriter out, SubarrayRanges value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SubarrayRanges read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SubarrayRanges instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubarrayRanges given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubarrayRanges
   * @throws IOException if the JSON string is invalid with respect to SubarrayRanges
   */
  public static SubarrayRanges fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubarrayRanges.class);
  }

  /**
   * Convert an instance of SubarrayRanges to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

