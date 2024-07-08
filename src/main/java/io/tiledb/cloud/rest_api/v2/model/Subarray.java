/*
 * Tiledb Storage Platform API
 * TileDB Storage Platform REST API
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.tiledb.cloud.rest_api.v2.model;

import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.v2.JSON;

/**
 * A Subarray
 */
@ApiModel(description = "A Subarray")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class Subarray {
  public static final String SERIALIZED_NAME_LAYOUT = "layout";
  @SerializedName(SERIALIZED_NAME_LAYOUT)
  private Layout layout;

  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  private List<SubarrayRanges> ranges = null;

  public Subarray() { 
  }

  public Subarray layout(Layout layout) {
    
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Layout getLayout() {
    return layout;
  }


  public void setLayout(Layout layout) {
    this.layout = layout;
  }


  public Subarray ranges(List<SubarrayRanges> ranges) {
    
    this.ranges = ranges;
    return this;
  }

  public Subarray addRangesItem(SubarrayRanges rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * List of 1D ranges, one per dimension
   * @return ranges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of 1D ranges, one per dimension")

  public List<SubarrayRanges> getRanges() {
    return ranges;
  }


  public void setRanges(List<SubarrayRanges> ranges) {
    this.ranges = ranges;
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
   */
  public Subarray putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
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
    Subarray subarray = (Subarray) o;
    return Objects.equals(this.layout, subarray.layout) &&
        Objects.equals(this.ranges, subarray.ranges)&&
        Objects.equals(this.additionalProperties, subarray.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout, ranges, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subarray {\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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
    openapiFields.add("layout");
    openapiFields.add("ranges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Subarray
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Subarray.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Subarray is not found in the empty JSON string", Subarray.openapiRequiredFields.toString()));
        }
      }
      JsonArray jsonArrayranges = jsonObj.getAsJsonArray("ranges");
      if (jsonArrayranges != null) {
        // ensure the json data is an array
        if (!jsonObj.get("ranges").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `ranges` to be an array in the JSON string but got `%s`", jsonObj.get("ranges").toString()));
        }

        // validate the optional field `ranges` (array)
        for (int i = 0; i < jsonArrayranges.size(); i++) {
          SubarrayRanges.validateJsonObject(jsonArrayranges.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Subarray.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Subarray' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Subarray> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Subarray.class));

       return (TypeAdapter<T>) new TypeAdapter<Subarray>() {
           @Override
           public void write(JsonWriter out, Subarray value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Subarray read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Subarray instance = thisAdapter.fromJsonTree(jsonObj);
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
                 } else { // non-primitive type
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
  * Create an instance of Subarray given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Subarray
  * @throws IOException if the JSON string is invalid with respect to Subarray
  */
  public static Subarray fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Subarray.class);
  }

 /**
  * Convert an instance of Subarray to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

