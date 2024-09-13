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
import io.tiledb.cloud.rest_api.model.ActivityEventType;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

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
 * Information related to last access of an array
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class LastAccessedArray {
  public static final String SERIALIZED_NAME_ARRAY_ID = "array_id";
  @SerializedName(SERIALIZED_NAME_ARRAY_ID)
  private String arrayId;

  public static final String SERIALIZED_NAME_ARRAY_NAME = "array_name";
  @SerializedName(SERIALIZED_NAME_ARRAY_NAME)
  private String arrayName;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_ACCESSED_TIME = "accessed_time";
  @SerializedName(SERIALIZED_NAME_ACCESSED_TIME)
  private BigDecimal accessedTime;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private ActivityEventType accessType;

  public LastAccessedArray() {
  }

  public LastAccessedArray arrayId(String arrayId) {
    this.arrayId = arrayId;
    return this;
  }

  /**
   * unique ID of array
   * @return arrayId
   */
  @javax.annotation.Nullable
  public String getArrayId() {
    return arrayId;
  }

  public void setArrayId(String arrayId) {
    this.arrayId = arrayId;
  }


  public LastAccessedArray arrayName(String arrayName) {
    this.arrayName = arrayName;
    return this;
  }

  /**
   * name of the array
   * @return arrayName
   */
  @javax.annotation.Nullable
  public String getArrayName() {
    return arrayName;
  }

  public void setArrayName(String arrayName) {
    this.arrayName = arrayName;
  }


  public LastAccessedArray namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * namespace of a user or organization
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public LastAccessedArray accessedTime(BigDecimal accessedTime) {
    this.accessedTime = accessedTime;
    return this;
  }

  /**
   * timestamp (epoch milliseconds) array is last accessed
   * @return accessedTime
   */
  @javax.annotation.Nullable
  public BigDecimal getAccessedTime() {
    return accessedTime;
  }

  public void setAccessedTime(BigDecimal accessedTime) {
    this.accessedTime = accessedTime;
  }


  public LastAccessedArray accessType(ActivityEventType accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   * @return accessType
   */
  @javax.annotation.Nullable
  public ActivityEventType getAccessType() {
    return accessType;
  }

  public void setAccessType(ActivityEventType accessType) {
    this.accessType = accessType;
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
   * @return the LastAccessedArray instance itself
   */
  public LastAccessedArray putAdditionalProperty(String key, Object value) {
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
    LastAccessedArray lastAccessedArray = (LastAccessedArray) o;
    return Objects.equals(this.arrayId, lastAccessedArray.arrayId) &&
        Objects.equals(this.arrayName, lastAccessedArray.arrayName) &&
        Objects.equals(this.namespace, lastAccessedArray.namespace) &&
        Objects.equals(this.accessedTime, lastAccessedArray.accessedTime) &&
        Objects.equals(this.accessType, lastAccessedArray.accessType)&&
        Objects.equals(this.additionalProperties, lastAccessedArray.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayId, arrayName, namespace, accessedTime, accessType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastAccessedArray {\n");
    sb.append("    arrayId: ").append(toIndentedString(arrayId)).append("\n");
    sb.append("    arrayName: ").append(toIndentedString(arrayName)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    accessedTime: ").append(toIndentedString(accessedTime)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
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
    openapiFields.add("array_id");
    openapiFields.add("array_name");
    openapiFields.add("namespace");
    openapiFields.add("accessed_time");
    openapiFields.add("access_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to LastAccessedArray
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!LastAccessedArray.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LastAccessedArray is not found in the empty JSON string", LastAccessedArray.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("array_id") != null && !jsonObj.get("array_id").isJsonNull()) && !jsonObj.get("array_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("array_id").toString()));
      }
      if ((jsonObj.get("array_name") != null && !jsonObj.get("array_name").isJsonNull()) && !jsonObj.get("array_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("array_name").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      // validate the optional field `access_type`
      if (jsonObj.get("access_type") != null && !jsonObj.get("access_type").isJsonNull()) {
        ActivityEventType.validateJsonElement(jsonObj.get("access_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LastAccessedArray.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LastAccessedArray' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LastAccessedArray> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LastAccessedArray.class));

       return (TypeAdapter<T>) new TypeAdapter<LastAccessedArray>() {
           @Override
           public void write(JsonWriter out, LastAccessedArray value) throws IOException {
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
           public LastAccessedArray read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             LastAccessedArray instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of LastAccessedArray given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of LastAccessedArray
   * @throws IOException if the JSON string is invalid with respect to LastAccessedArray
   */
  public static LastAccessedArray fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LastAccessedArray.class);
  }

  /**
   * Convert an instance of LastAccessedArray to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

