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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Extent of tile
 */
@ApiModel(description = "Extent of tile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
public class DimensionTileExtent {
  public static final String SERIALIZED_NAME_INT8 = "int8";
  @SerializedName(SERIALIZED_NAME_INT8)
  private Integer int8;

  public static final String SERIALIZED_NAME_UINT8 = "uint8";
  @SerializedName(SERIALIZED_NAME_UINT8)
  private Integer uint8;

  public static final String SERIALIZED_NAME_INT16 = "int16";
  @SerializedName(SERIALIZED_NAME_INT16)
  private Integer int16;

  public static final String SERIALIZED_NAME_UINT16 = "uint16";
  @SerializedName(SERIALIZED_NAME_UINT16)
  private Integer uint16;

  public static final String SERIALIZED_NAME_INT32 = "int32";
  @SerializedName(SERIALIZED_NAME_INT32)
  private Integer int32;

  public static final String SERIALIZED_NAME_UINT32 = "uint32";
  @SerializedName(SERIALIZED_NAME_UINT32)
  private Integer uint32;

  public static final String SERIALIZED_NAME_INT64 = "int64";
  @SerializedName(SERIALIZED_NAME_INT64)
  private Long int64;

  public static final String SERIALIZED_NAME_UINT64 = "uint64";
  @SerializedName(SERIALIZED_NAME_UINT64)
  private Integer uint64;

  public static final String SERIALIZED_NAME_FLOAT32 = "float32";
  @SerializedName(SERIALIZED_NAME_FLOAT32)
  private Integer float32;

  public static final String SERIALIZED_NAME_FLOAT64 = "float64";
  @SerializedName(SERIALIZED_NAME_FLOAT64)
  private Integer float64;

  public DimensionTileExtent() { 
  }

  public DimensionTileExtent int8(Integer int8) {
    
    this.int8 = int8;
    return this;
  }

   /**
   * Get int8
   * @return int8
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInt8() {
    return int8;
  }


  public void setInt8(Integer int8) {
    this.int8 = int8;
  }


  public DimensionTileExtent uint8(Integer uint8) {
    
    this.uint8 = uint8;
    return this;
  }

   /**
   * Get uint8
   * @return uint8
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUint8() {
    return uint8;
  }


  public void setUint8(Integer uint8) {
    this.uint8 = uint8;
  }


  public DimensionTileExtent int16(Integer int16) {
    
    this.int16 = int16;
    return this;
  }

   /**
   * Get int16
   * @return int16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInt16() {
    return int16;
  }


  public void setInt16(Integer int16) {
    this.int16 = int16;
  }


  public DimensionTileExtent uint16(Integer uint16) {
    
    this.uint16 = uint16;
    return this;
  }

   /**
   * Get uint16
   * @return uint16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUint16() {
    return uint16;
  }


  public void setUint16(Integer uint16) {
    this.uint16 = uint16;
  }


  public DimensionTileExtent int32(Integer int32) {
    
    this.int32 = int32;
    return this;
  }

   /**
   * Get int32
   * @return int32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInt32() {
    return int32;
  }


  public void setInt32(Integer int32) {
    this.int32 = int32;
  }


  public DimensionTileExtent uint32(Integer uint32) {
    
    this.uint32 = uint32;
    return this;
  }

   /**
   * Get uint32
   * @return uint32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUint32() {
    return uint32;
  }


  public void setUint32(Integer uint32) {
    this.uint32 = uint32;
  }


  public DimensionTileExtent int64(Long int64) {
    
    this.int64 = int64;
    return this;
  }

   /**
   * Get int64
   * @return int64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getInt64() {
    return int64;
  }


  public void setInt64(Long int64) {
    this.int64 = int64;
  }


  public DimensionTileExtent uint64(Integer uint64) {
    
    this.uint64 = uint64;
    return this;
  }

   /**
   * Get uint64
   * @return uint64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUint64() {
    return uint64;
  }


  public void setUint64(Integer uint64) {
    this.uint64 = uint64;
  }


  public DimensionTileExtent float32(Integer float32) {
    
    this.float32 = float32;
    return this;
  }

   /**
   * Get float32
   * @return float32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFloat32() {
    return float32;
  }


  public void setFloat32(Integer float32) {
    this.float32 = float32;
  }


  public DimensionTileExtent float64(Integer float64) {
    
    this.float64 = float64;
    return this;
  }

   /**
   * Get float64
   * @return float64
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFloat64() {
    return float64;
  }


  public void setFloat64(Integer float64) {
    this.float64 = float64;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DimensionTileExtent dimensionTileExtent = (DimensionTileExtent) o;
    return Objects.equals(this.int8, dimensionTileExtent.int8) &&
        Objects.equals(this.uint8, dimensionTileExtent.uint8) &&
        Objects.equals(this.int16, dimensionTileExtent.int16) &&
        Objects.equals(this.uint16, dimensionTileExtent.uint16) &&
        Objects.equals(this.int32, dimensionTileExtent.int32) &&
        Objects.equals(this.uint32, dimensionTileExtent.uint32) &&
        Objects.equals(this.int64, dimensionTileExtent.int64) &&
        Objects.equals(this.uint64, dimensionTileExtent.uint64) &&
        Objects.equals(this.float32, dimensionTileExtent.float32) &&
        Objects.equals(this.float64, dimensionTileExtent.float64);
  }

  @Override
  public int hashCode() {
    return Objects.hash(int8, uint8, int16, uint16, int32, uint32, int64, uint64, float32, float64);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DimensionTileExtent {\n");
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
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DimensionTileExtent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DimensionTileExtent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DimensionTileExtent is not found in the empty JSON string", DimensionTileExtent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!DimensionTileExtent.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DimensionTileExtent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DimensionTileExtent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DimensionTileExtent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DimensionTileExtent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DimensionTileExtent.class));

       return (TypeAdapter<T>) new TypeAdapter<DimensionTileExtent>() {
           @Override
           public void write(JsonWriter out, DimensionTileExtent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DimensionTileExtent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DimensionTileExtent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DimensionTileExtent
  * @throws IOException if the JSON string is invalid with respect to DimensionTileExtent
  */
  public static DimensionTileExtent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DimensionTileExtent.class);
  }

 /**
  * Convert an instance of DimensionTileExtent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

