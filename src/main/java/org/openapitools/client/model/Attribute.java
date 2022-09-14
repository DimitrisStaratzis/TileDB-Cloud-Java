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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Datatype;
import org.openapitools.client.model.FilterPipeline;

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
 * Attribute of array
 */
@ApiModel(description = "Attribute of array")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
public class Attribute {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Datatype type;

  public static final String SERIALIZED_NAME_FILTER_PIPELINE = "filterPipeline";
  @SerializedName(SERIALIZED_NAME_FILTER_PIPELINE)
  private FilterPipeline filterPipeline;

  public static final String SERIALIZED_NAME_CELL_VAL_NUM = "cellValNum";
  @SerializedName(SERIALIZED_NAME_CELL_VAL_NUM)
  private Integer cellValNum;

  public static final String SERIALIZED_NAME_NULLABLE = "nullable";
  @SerializedName(SERIALIZED_NAME_NULLABLE)
  private Boolean nullable;

  public static final String SERIALIZED_NAME_FILL_VALUE = "fillValue";
  @SerializedName(SERIALIZED_NAME_FILL_VALUE)
  private List<Integer> fillValue = null;

  public Attribute() { 
  }

  public Attribute name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Attribute name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "attribute1", required = true, value = "Attribute name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Attribute type(Datatype type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Datatype getType() {
    return type;
  }


  public void setType(Datatype type) {
    this.type = type;
  }


  public Attribute filterPipeline(FilterPipeline filterPipeline) {
    
    this.filterPipeline = filterPipeline;
    return this;
  }

   /**
   * Get filterPipeline
   * @return filterPipeline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterPipeline getFilterPipeline() {
    return filterPipeline;
  }


  public void setFilterPipeline(FilterPipeline filterPipeline) {
    this.filterPipeline = filterPipeline;
  }


  public Attribute cellValNum(Integer cellValNum) {
    
    this.cellValNum = cellValNum;
    return this;
  }

   /**
   * Attribute number of values per cell
   * @return cellValNum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Attribute number of values per cell")

  public Integer getCellValNum() {
    return cellValNum;
  }


  public void setCellValNum(Integer cellValNum) {
    this.cellValNum = cellValNum;
  }


  public Attribute nullable(Boolean nullable) {
    
    this.nullable = nullable;
    return this;
  }

   /**
   * Is attribute nullable
   * @return nullable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Is attribute nullable")

  public Boolean getNullable() {
    return nullable;
  }


  public void setNullable(Boolean nullable) {
    this.nullable = nullable;
  }


  public Attribute fillValue(List<Integer> fillValue) {
    
    this.fillValue = fillValue;
    return this;
  }

  public Attribute addFillValueItem(Integer fillValueItem) {
    if (this.fillValue == null) {
      this.fillValue = new ArrayList<>();
    }
    this.fillValue.add(fillValueItem);
    return this;
  }

   /**
   * The default fill value
   * @return fillValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default fill value")

  public List<Integer> getFillValue() {
    return fillValue;
  }


  public void setFillValue(List<Integer> fillValue) {
    this.fillValue = fillValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attribute attribute = (Attribute) o;
    return Objects.equals(this.name, attribute.name) &&
        Objects.equals(this.type, attribute.type) &&
        Objects.equals(this.filterPipeline, attribute.filterPipeline) &&
        Objects.equals(this.cellValNum, attribute.cellValNum) &&
        Objects.equals(this.nullable, attribute.nullable) &&
        Objects.equals(this.fillValue, attribute.fillValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, filterPipeline, cellValNum, nullable, fillValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attribute {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filterPipeline: ").append(toIndentedString(filterPipeline)).append("\n");
    sb.append("    cellValNum: ").append(toIndentedString(cellValNum)).append("\n");
    sb.append("    nullable: ").append(toIndentedString(nullable)).append("\n");
    sb.append("    fillValue: ").append(toIndentedString(fillValue)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("filterPipeline");
    openapiFields.add("cellValNum");
    openapiFields.add("nullable");
    openapiFields.add("fillValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("filterPipeline");
    openapiRequiredFields.add("cellValNum");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Attribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Attribute.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Attribute is not found in the empty JSON string", Attribute.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!Attribute.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Attribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Attribute.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `filterPipeline`
      if (jsonObj.getAsJsonObject("filterPipeline") != null) {
        FilterPipeline.validateJsonObject(jsonObj.getAsJsonObject("filterPipeline"));
      }
      // ensure the json data is an array
      if (jsonObj.get("fillValue") != null && !jsonObj.get("fillValue").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `fillValue` to be an array in the JSON string but got `%s`", jsonObj.get("fillValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Attribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Attribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Attribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Attribute.class));

       return (TypeAdapter<T>) new TypeAdapter<Attribute>() {
           @Override
           public void write(JsonWriter out, Attribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Attribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Attribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Attribute
  * @throws IOException if the JSON string is invalid with respect to Attribute
  */
  public static Attribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Attribute.class);
  }

 /**
  * Convert an instance of Attribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

