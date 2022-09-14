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
import org.openapitools.client.model.Layout;
import org.openapitools.client.model.ReadState;
import org.openapitools.client.model.Subarray;

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
 * Read struct (can&#39;t be called reader due to class name conflict)
 */
@ApiModel(description = "Read struct (can't be called reader due to class name conflict)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
public class QueryReader {
  public static final String SERIALIZED_NAME_LAYOUT = "layout";
  @SerializedName(SERIALIZED_NAME_LAYOUT)
  private Layout layout;

  public static final String SERIALIZED_NAME_SUBARRAY = "subarray";
  @SerializedName(SERIALIZED_NAME_SUBARRAY)
  private Subarray subarray;

  public static final String SERIALIZED_NAME_READ_STATE = "readState";
  @SerializedName(SERIALIZED_NAME_READ_STATE)
  private ReadState readState;

  public static final String SERIALIZED_NAME_VAR_OFFSETS_MODE = "varOffsetsMode";
  @SerializedName(SERIALIZED_NAME_VAR_OFFSETS_MODE)
  private String varOffsetsMode;

  public static final String SERIALIZED_NAME_VAR_OFFSETS_ADD_EXTRA_ELEMENT = "varOffsetsAddExtraElement";
  @SerializedName(SERIALIZED_NAME_VAR_OFFSETS_ADD_EXTRA_ELEMENT)
  private Boolean varOffsetsAddExtraElement;

  public static final String SERIALIZED_NAME_VAR_OFFSETS_BITSIZE = "varOffsetsBitsize";
  @SerializedName(SERIALIZED_NAME_VAR_OFFSETS_BITSIZE)
  private Integer varOffsetsBitsize;

  public QueryReader() { 
  }

  public QueryReader layout(Layout layout) {
    
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


  public QueryReader subarray(Subarray subarray) {
    
    this.subarray = subarray;
    return this;
  }

   /**
   * Get subarray
   * @return subarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Subarray getSubarray() {
    return subarray;
  }


  public void setSubarray(Subarray subarray) {
    this.subarray = subarray;
  }


  public QueryReader readState(ReadState readState) {
    
    this.readState = readState;
    return this;
  }

   /**
   * Get readState
   * @return readState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReadState getReadState() {
    return readState;
  }


  public void setReadState(ReadState readState) {
    this.readState = readState;
  }


  public QueryReader varOffsetsMode(String varOffsetsMode) {
    
    this.varOffsetsMode = varOffsetsMode;
    return this;
  }

   /**
   * The offsets format (bytes or elements) to be used.
   * @return varOffsetsMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offsets format (bytes or elements) to be used.")

  public String getVarOffsetsMode() {
    return varOffsetsMode;
  }


  public void setVarOffsetsMode(String varOffsetsMode) {
    this.varOffsetsMode = varOffsetsMode;
  }


  public QueryReader varOffsetsAddExtraElement(Boolean varOffsetsAddExtraElement) {
    
    this.varOffsetsAddExtraElement = varOffsetsAddExtraElement;
    return this;
  }

   /**
   * True if an extra element will be added to the end of the offsets buffer.
   * @return varOffsetsAddExtraElement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if an extra element will be added to the end of the offsets buffer.")

  public Boolean getVarOffsetsAddExtraElement() {
    return varOffsetsAddExtraElement;
  }


  public void setVarOffsetsAddExtraElement(Boolean varOffsetsAddExtraElement) {
    this.varOffsetsAddExtraElement = varOffsetsAddExtraElement;
  }


  public QueryReader varOffsetsBitsize(Integer varOffsetsBitsize) {
    
    this.varOffsetsBitsize = varOffsetsBitsize;
    return this;
  }

   /**
   * The offsets bitsize (32 or 64) to be used.
   * @return varOffsetsBitsize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The offsets bitsize (32 or 64) to be used.")

  public Integer getVarOffsetsBitsize() {
    return varOffsetsBitsize;
  }


  public void setVarOffsetsBitsize(Integer varOffsetsBitsize) {
    this.varOffsetsBitsize = varOffsetsBitsize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryReader queryReader = (QueryReader) o;
    return Objects.equals(this.layout, queryReader.layout) &&
        Objects.equals(this.subarray, queryReader.subarray) &&
        Objects.equals(this.readState, queryReader.readState) &&
        Objects.equals(this.varOffsetsMode, queryReader.varOffsetsMode) &&
        Objects.equals(this.varOffsetsAddExtraElement, queryReader.varOffsetsAddExtraElement) &&
        Objects.equals(this.varOffsetsBitsize, queryReader.varOffsetsBitsize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layout, subarray, readState, varOffsetsMode, varOffsetsAddExtraElement, varOffsetsBitsize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryReader {\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
    sb.append("    subarray: ").append(toIndentedString(subarray)).append("\n");
    sb.append("    readState: ").append(toIndentedString(readState)).append("\n");
    sb.append("    varOffsetsMode: ").append(toIndentedString(varOffsetsMode)).append("\n");
    sb.append("    varOffsetsAddExtraElement: ").append(toIndentedString(varOffsetsAddExtraElement)).append("\n");
    sb.append("    varOffsetsBitsize: ").append(toIndentedString(varOffsetsBitsize)).append("\n");
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
    openapiFields.add("subarray");
    openapiFields.add("readState");
    openapiFields.add("varOffsetsMode");
    openapiFields.add("varOffsetsAddExtraElement");
    openapiFields.add("varOffsetsBitsize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to QueryReader
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (QueryReader.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in QueryReader is not found in the empty JSON string", QueryReader.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!QueryReader.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `QueryReader` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
      // validate the optional field `subarray`
      if (jsonObj.getAsJsonObject("subarray") != null) {
        Subarray.validateJsonObject(jsonObj.getAsJsonObject("subarray"));
      }
      // validate the optional field `readState`
      if (jsonObj.getAsJsonObject("readState") != null) {
        ReadState.validateJsonObject(jsonObj.getAsJsonObject("readState"));
      }
      if (jsonObj.get("varOffsetsMode") != null && !jsonObj.get("varOffsetsMode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `varOffsetsMode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("varOffsetsMode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QueryReader.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QueryReader' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QueryReader> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QueryReader.class));

       return (TypeAdapter<T>) new TypeAdapter<QueryReader>() {
           @Override
           public void write(JsonWriter out, QueryReader value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QueryReader read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QueryReader given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QueryReader
  * @throws IOException if the JSON string is invalid with respect to QueryReader
  */
  public static QueryReader fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QueryReader.class);
  }

 /**
  * Convert an instance of QueryReader to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

