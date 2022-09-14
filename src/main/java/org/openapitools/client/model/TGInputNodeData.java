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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Specifies that a node is an “input value”, allowing for parameterized task graphs. An input node may not depend upon any other nodes. 
 */
@ApiModel(description = "Specifies that a node is an “input value”, allowing for parameterized task graphs. An input node may not depend upon any other nodes. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
public class TGInputNodeData {
  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "default_value";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private Object defaultValue;

  public static final String SERIALIZED_NAME_DATATYPE = "datatype";
  @SerializedName(SERIALIZED_NAME_DATATYPE)
  private String datatype;

  public TGInputNodeData() { 
  }

  public TGInputNodeData defaultValue(Object defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * An argument provided to a node. This is one of a direct value (i.e., a raw JSON value) or a &#x60;TGSentinel&#x60;. For example this Python value:      {\&quot;a\&quot;: [1, \&quot;pipe\&quot;, range(30), None], \&quot;b\&quot;: b\&quot;bytes\&quot;}  is encoded thusly (with included comments):      {  // A dictionary with string keys is JSON-encodable.       \&quot;a\&quot;: [  // As is a list.         1,         \&quot;pipe\&quot;,         {  // A &#x60;range&#x60; is replaced with its pickle.           \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;,           \&quot;format\&quot;: \&quot;python_pickle\&quot;,           \&quot;base64_data\&quot;: \&quot;gASVIAAAAAAAAACMCGJ1aWx0aW5zlIwFcmFuZ2WUk5RLAEseSwGHlFKULg&#x3D;&#x3D;\&quot;         },         null       ],       \&quot;b\&quot;: {  // Raw binary data is encoded into base64.         \&quot;__tdbudf__\&quot;: \&quot;immediate\&quot;         \&quot;format\&quot;: \&quot;bytes\&quot;,         \&quot;base64_data\&quot;: \&quot;Ynl0ZXM&#x3D;\&quot;       }     } 
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An argument provided to a node. This is one of a direct value (i.e., a raw JSON value) or a `TGSentinel`. For example this Python value:      {\"a\": [1, \"pipe\", range(30), None], \"b\": b\"bytes\"}  is encoded thusly (with included comments):      {  // A dictionary with string keys is JSON-encodable.       \"a\": [  // As is a list.         1,         \"pipe\",         {  // A `range` is replaced with its pickle.           \"__tdbudf__\": \"immediate\",           \"format\": \"python_pickle\",           \"base64_data\": \"gASVIAAAAAAAAACMCGJ1aWx0aW5zlIwFcmFuZ2WUk5RLAEseSwGHlFKULg==\"         },         null       ],       \"b\": {  // Raw binary data is encoded into base64.         \"__tdbudf__\": \"immediate\"         \"format\": \"bytes\",         \"base64_data\": \"Ynl0ZXM=\"       }     } ")

  public Object getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
  }


  public TGInputNodeData datatype(String datatype) {
    
    this.datatype = datatype;
    return this;
  }

   /**
   * An annotation of what datatype this node is supposed to be. Conventionally, this is a Python-format type annotation, but it’s purely for documentation purposes and not validated. 
   * @return datatype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An annotation of what datatype this node is supposed to be. Conventionally, this is a Python-format type annotation, but it’s purely for documentation purposes and not validated. ")

  public String getDatatype() {
    return datatype;
  }


  public void setDatatype(String datatype) {
    this.datatype = datatype;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TGInputNodeData tgInputNodeData = (TGInputNodeData) o;
    return Objects.equals(this.defaultValue, tgInputNodeData.defaultValue) &&
        Objects.equals(this.datatype, tgInputNodeData.datatype);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, datatype);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TGInputNodeData {\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    datatype: ").append(toIndentedString(datatype)).append("\n");
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
    openapiFields.add("default_value");
    openapiFields.add("datatype");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TGInputNodeData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TGInputNodeData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TGInputNodeData is not found in the empty JSON string", TGInputNodeData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!TGInputNodeData.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TGInputNodeData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
      if (jsonObj.get("datatype") != null && !jsonObj.get("datatype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datatype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datatype").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TGInputNodeData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TGInputNodeData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TGInputNodeData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TGInputNodeData.class));

       return (TypeAdapter<T>) new TypeAdapter<TGInputNodeData>() {
           @Override
           public void write(JsonWriter out, TGInputNodeData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TGInputNodeData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TGInputNodeData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TGInputNodeData
  * @throws IOException if the JSON string is invalid with respect to TGInputNodeData
  */
  public static TGInputNodeData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TGInputNodeData.class);
  }

 /**
  * Convert an instance of TGInputNodeData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

