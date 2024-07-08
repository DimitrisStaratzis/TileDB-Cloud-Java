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
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.v1.JSON;

/**
 * Object with data to fill browser filter
 */
@ApiModel(description = "Object with data to fill browser filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class GroupBrowserFilterData {
  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private List<String> namespaces = null;

  public static final String SERIALIZED_NAME_GROUP_TYPES = "group_types";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPES)
  private List<GroupType> groupTypes = null;

  public GroupBrowserFilterData() {
  }

  public GroupBrowserFilterData namespaces(List<String> namespaces) {
    
    this.namespaces = namespaces;
    return this;
  }

  public GroupBrowserFilterData addNamespacesItem(String namespacesItem) {
    if (this.namespaces == null) {
      this.namespaces = new ArrayList<>();
    }
    this.namespaces.add(namespacesItem);
    return this;
  }

   /**
   * list of all unique namespaces to display
   * @return namespaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of all unique namespaces to display")

  public List<String> getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(List<String> namespaces) {
    this.namespaces = namespaces;
  }


  public GroupBrowserFilterData groupTypes(List<GroupType> groupTypes) {
    
    this.groupTypes = groupTypes;
    return this;
  }

  public GroupBrowserFilterData addGroupTypesItem(GroupType groupTypesItem) {
    if (this.groupTypes == null) {
      this.groupTypes = new ArrayList<>();
    }
    this.groupTypes.add(groupTypesItem);
    return this;
  }

   /**
   * list of all available group types to display
   * @return groupTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of all available group types to display")

  public List<GroupType> getGroupTypes() {
    return groupTypes;
  }


  public void setGroupTypes(List<GroupType> groupTypes) {
    this.groupTypes = groupTypes;
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
  public GroupBrowserFilterData putAdditionalProperty(String key, Object value) {
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
    GroupBrowserFilterData groupBrowserFilterData = (GroupBrowserFilterData) o;
    return Objects.equals(this.namespaces, groupBrowserFilterData.namespaces) &&
        Objects.equals(this.groupTypes, groupBrowserFilterData.groupTypes)&&
        Objects.equals(this.additionalProperties, groupBrowserFilterData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(namespaces, groupTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupBrowserFilterData {\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    groupTypes: ").append(toIndentedString(groupTypes)).append("\n");
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
    openapiFields.add("namespaces");
    openapiFields.add("group_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupBrowserFilterData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupBrowserFilterData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupBrowserFilterData is not found in the empty JSON string", GroupBrowserFilterData.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("namespaces") != null && !jsonObj.get("namespaces").isJsonNull()) && !jsonObj.get("namespaces").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespaces` to be an array in the JSON string but got `%s`", jsonObj.get("namespaces").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("group_types") != null && !jsonObj.get("group_types").isJsonNull()) && !jsonObj.get("group_types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_types` to be an array in the JSON string but got `%s`", jsonObj.get("group_types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupBrowserFilterData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupBrowserFilterData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupBrowserFilterData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupBrowserFilterData.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupBrowserFilterData>() {
           @Override
           public void write(JsonWriter out, GroupBrowserFilterData value) throws IOException {
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
           public GroupBrowserFilterData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupBrowserFilterData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupBrowserFilterData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupBrowserFilterData
  * @throws IOException if the JSON string is invalid with respect to GroupBrowserFilterData
  */
  public static GroupBrowserFilterData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupBrowserFilterData.class);
  }

 /**
  * Convert an instance of GroupBrowserFilterData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

