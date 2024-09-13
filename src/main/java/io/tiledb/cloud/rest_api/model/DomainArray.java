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
 * Domain object for an array of each type
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class DomainArray {
  public static final String SERIALIZED_NAME_INT8 = "int8";
  @SerializedName(SERIALIZED_NAME_INT8)
  private List<Integer> int8 = new ArrayList<>();

  public static final String SERIALIZED_NAME_UINT8 = "uint8";
  @SerializedName(SERIALIZED_NAME_UINT8)
  private List<Integer> uint8 = new ArrayList<>();

  public static final String SERIALIZED_NAME_INT16 = "int16";
  @SerializedName(SERIALIZED_NAME_INT16)
  private List<Integer> int16 = new ArrayList<>();

  public static final String SERIALIZED_NAME_UINT16 = "uint16";
  @SerializedName(SERIALIZED_NAME_UINT16)
  private List<Integer> uint16 = new ArrayList<>();

  public static final String SERIALIZED_NAME_INT32 = "int32";
  @SerializedName(SERIALIZED_NAME_INT32)
  private List<Integer> int32 = new ArrayList<>();

  public static final String SERIALIZED_NAME_UINT32 = "uint32";
  @SerializedName(SERIALIZED_NAME_UINT32)
  private List<Integer> uint32 = new ArrayList<>();

  public static final String SERIALIZED_NAME_INT64 = "int64";
  @SerializedName(SERIALIZED_NAME_INT64)
  private List<Long> int64 = new ArrayList<>();

  public static final String SERIALIZED_NAME_UINT64 = "uint64";
  @SerializedName(SERIALIZED_NAME_UINT64)
  private List<Integer> uint64 = new ArrayList<>();

  public static final String SERIALIZED_NAME_FLOAT32 = "float32";
  @SerializedName(SERIALIZED_NAME_FLOAT32)
  private List<Float> float32 = new ArrayList<>();

  public static final String SERIALIZED_NAME_FLOAT64 = "float64";
  @SerializedName(SERIALIZED_NAME_FLOAT64)
  private List<Double> float64 = new ArrayList<>();

  public DomainArray() {
  }

  public DomainArray int8(List<Integer> int8) {
    this.int8 = int8;
    return this;
  }

  public DomainArray addInt8Item(Integer int8Item) {
    if (this.int8 == null) {
      this.int8 = new ArrayList<>();
    }
    this.int8.add(int8Item);
    return this;
  }

  /**
   * Get int8
   * @return int8
   */
  @javax.annotation.Nullable
  public List<Integer> getInt8() {
    return int8;
  }

  public void setInt8(List<Integer> int8) {
    this.int8 = int8;
  }


  public DomainArray uint8(List<Integer> uint8) {
    this.uint8 = uint8;
    return this;
  }

  public DomainArray addUint8Item(Integer uint8Item) {
    if (this.uint8 == null) {
      this.uint8 = new ArrayList<>();
    }
    this.uint8.add(uint8Item);
    return this;
  }

  /**
   * Get uint8
   * @return uint8
   */
  @javax.annotation.Nullable
  public List<Integer> getUint8() {
    return uint8;
  }

  public void setUint8(List<Integer> uint8) {
    this.uint8 = uint8;
  }


  public DomainArray int16(List<Integer> int16) {
    this.int16 = int16;
    return this;
  }

  public DomainArray addInt16Item(Integer int16Item) {
    if (this.int16 == null) {
      this.int16 = new ArrayList<>();
    }
    this.int16.add(int16Item);
    return this;
  }

  /**
   * Get int16
   * @return int16
   */
  @javax.annotation.Nullable
  public List<Integer> getInt16() {
    return int16;
  }

  public void setInt16(List<Integer> int16) {
    this.int16 = int16;
  }


  public DomainArray uint16(List<Integer> uint16) {
    this.uint16 = uint16;
    return this;
  }

  public DomainArray addUint16Item(Integer uint16Item) {
    if (this.uint16 == null) {
      this.uint16 = new ArrayList<>();
    }
    this.uint16.add(uint16Item);
    return this;
  }

  /**
   * Get uint16
   * @return uint16
   */
  @javax.annotation.Nullable
  public List<Integer> getUint16() {
    return uint16;
  }

  public void setUint16(List<Integer> uint16) {
    this.uint16 = uint16;
  }


  public DomainArray int32(List<Integer> int32) {
    this.int32 = int32;
    return this;
  }

  public DomainArray addInt32Item(Integer int32Item) {
    if (this.int32 == null) {
      this.int32 = new ArrayList<>();
    }
    this.int32.add(int32Item);
    return this;
  }

  /**
   * Get int32
   * @return int32
   */
  @javax.annotation.Nullable
  public List<Integer> getInt32() {
    return int32;
  }

  public void setInt32(List<Integer> int32) {
    this.int32 = int32;
  }


  public DomainArray uint32(List<Integer> uint32) {
    this.uint32 = uint32;
    return this;
  }

  public DomainArray addUint32Item(Integer uint32Item) {
    if (this.uint32 == null) {
      this.uint32 = new ArrayList<>();
    }
    this.uint32.add(uint32Item);
    return this;
  }

  /**
   * Get uint32
   * @return uint32
   */
  @javax.annotation.Nullable
  public List<Integer> getUint32() {
    return uint32;
  }

  public void setUint32(List<Integer> uint32) {
    this.uint32 = uint32;
  }


  public DomainArray int64(List<Long> int64) {
    this.int64 = int64;
    return this;
  }

  public DomainArray addInt64Item(Long int64Item) {
    if (this.int64 == null) {
      this.int64 = new ArrayList<>();
    }
    this.int64.add(int64Item);
    return this;
  }

  /**
   * Get int64
   * @return int64
   */
  @javax.annotation.Nullable
  public List<Long> getInt64() {
    return int64;
  }

  public void setInt64(List<Long> int64) {
    this.int64 = int64;
  }


  public DomainArray uint64(List<Integer> uint64) {
    this.uint64 = uint64;
    return this;
  }

  public DomainArray addUint64Item(Integer uint64Item) {
    if (this.uint64 == null) {
      this.uint64 = new ArrayList<>();
    }
    this.uint64.add(uint64Item);
    return this;
  }

  /**
   * Get uint64
   * @return uint64
   */
  @javax.annotation.Nullable
  public List<Integer> getUint64() {
    return uint64;
  }

  public void setUint64(List<Integer> uint64) {
    this.uint64 = uint64;
  }


  public DomainArray float32(List<Float> float32) {
    this.float32 = float32;
    return this;
  }

  public DomainArray addFloat32Item(Float float32Item) {
    if (this.float32 == null) {
      this.float32 = new ArrayList<>();
    }
    this.float32.add(float32Item);
    return this;
  }

  /**
   * Get float32
   * @return float32
   */
  @javax.annotation.Nullable
  public List<Float> getFloat32() {
    return float32;
  }

  public void setFloat32(List<Float> float32) {
    this.float32 = float32;
  }


  public DomainArray float64(List<Double> float64) {
    this.float64 = float64;
    return this;
  }

  public DomainArray addFloat64Item(Double float64Item) {
    if (this.float64 == null) {
      this.float64 = new ArrayList<>();
    }
    this.float64.add(float64Item);
    return this;
  }

  /**
   * Get float64
   * @return float64
   */
  @javax.annotation.Nullable
  public List<Double> getFloat64() {
    return float64;
  }

  public void setFloat64(List<Double> float64) {
    this.float64 = float64;
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
   * @return the DomainArray instance itself
   */
  public DomainArray putAdditionalProperty(String key, Object value) {
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
    DomainArray domainArray = (DomainArray) o;
    return Objects.equals(this.int8, domainArray.int8) &&
        Objects.equals(this.uint8, domainArray.uint8) &&
        Objects.equals(this.int16, domainArray.int16) &&
        Objects.equals(this.uint16, domainArray.uint16) &&
        Objects.equals(this.int32, domainArray.int32) &&
        Objects.equals(this.uint32, domainArray.uint32) &&
        Objects.equals(this.int64, domainArray.int64) &&
        Objects.equals(this.uint64, domainArray.uint64) &&
        Objects.equals(this.float32, domainArray.float32) &&
        Objects.equals(this.float64, domainArray.float64)&&
        Objects.equals(this.additionalProperties, domainArray.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(int8, uint8, int16, uint16, int32, uint32, int64, uint64, float32, float64, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainArray {\n");
    sb.append("    int8: ").append(toIndentedString(int8)).append("\n");
    sb.append("    uint8: ").append(toIndentedString(uint8)).append("\n");
    sb.append("    int16: ").append(toIndentedString(int16)).append("\n");
    sb.append("    uint16: ").append(toIndentedString(uint16)).append("\n");
    sb.append("    int32: ").append(toIndentedString(int32)).append("\n");
    sb.append("    uint32: ").append(toIndentedString(uint32)).append("\n");
    sb.append("    int64: ").append(toIndentedString(int64)).append("\n");
    sb.append("    uint64: ").append(toIndentedString(uint64)).append("\n");
    sb.append("    float32: ").append(toIndentedString(float32)).append("\n");
    sb.append("    float64: ").append(toIndentedString(float64)).append("\n");
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
    openapiFields.add("int8");
    openapiFields.add("uint8");
    openapiFields.add("int16");
    openapiFields.add("uint16");
    openapiFields.add("int32");
    openapiFields.add("uint32");
    openapiFields.add("int64");
    openapiFields.add("uint64");
    openapiFields.add("float32");
    openapiFields.add("float64");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to DomainArray
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DomainArray.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DomainArray is not found in the empty JSON string", DomainArray.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("int8") != null && !jsonObj.get("int8").isJsonNull() && !jsonObj.get("int8").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `int8` to be an array in the JSON string but got `%s`", jsonObj.get("int8").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("uint8") != null && !jsonObj.get("uint8").isJsonNull() && !jsonObj.get("uint8").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uint8` to be an array in the JSON string but got `%s`", jsonObj.get("uint8").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("int16") != null && !jsonObj.get("int16").isJsonNull() && !jsonObj.get("int16").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `int16` to be an array in the JSON string but got `%s`", jsonObj.get("int16").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("uint16") != null && !jsonObj.get("uint16").isJsonNull() && !jsonObj.get("uint16").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uint16` to be an array in the JSON string but got `%s`", jsonObj.get("uint16").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("int32") != null && !jsonObj.get("int32").isJsonNull() && !jsonObj.get("int32").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `int32` to be an array in the JSON string but got `%s`", jsonObj.get("int32").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("uint32") != null && !jsonObj.get("uint32").isJsonNull() && !jsonObj.get("uint32").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uint32` to be an array in the JSON string but got `%s`", jsonObj.get("uint32").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("int64") != null && !jsonObj.get("int64").isJsonNull() && !jsonObj.get("int64").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `int64` to be an array in the JSON string but got `%s`", jsonObj.get("int64").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("uint64") != null && !jsonObj.get("uint64").isJsonNull() && !jsonObj.get("uint64").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `uint64` to be an array in the JSON string but got `%s`", jsonObj.get("uint64").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("float32") != null && !jsonObj.get("float32").isJsonNull() && !jsonObj.get("float32").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `float32` to be an array in the JSON string but got `%s`", jsonObj.get("float32").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("float64") != null && !jsonObj.get("float64").isJsonNull() && !jsonObj.get("float64").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `float64` to be an array in the JSON string but got `%s`", jsonObj.get("float64").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DomainArray.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DomainArray' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DomainArray> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DomainArray.class));

       return (TypeAdapter<T>) new TypeAdapter<DomainArray>() {
           @Override
           public void write(JsonWriter out, DomainArray value) throws IOException {
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
           public DomainArray read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             DomainArray instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of DomainArray given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of DomainArray
   * @throws IOException if the JSON string is invalid with respect to DomainArray
   */
  public static DomainArray fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DomainArray.class);
  }

  /**
   * Convert an instance of DomainArray to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

