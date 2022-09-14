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
import org.openapitools.client.model.GroupEntry;
import org.openapitools.client.model.PaginationMetadata;

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
 * Object including a page of members of a group and pagination metadata
 */
@ApiModel(description = "Object including a page of members of a group and pagination metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
public class GroupContents {
  public static final String SERIALIZED_NAME_ENTRIES = "entries";
  @SerializedName(SERIALIZED_NAME_ENTRIES)
  private List<GroupEntry> entries = null;

  public static final String SERIALIZED_NAME_PAGINATION_METADATA = "pagination_metadata";
  @SerializedName(SERIALIZED_NAME_PAGINATION_METADATA)
  private PaginationMetadata paginationMetadata;

  public GroupContents() { 
  }

  public GroupContents entries(List<GroupEntry> entries) {
    
    this.entries = entries;
    return this;
  }

  public GroupContents addEntriesItem(GroupEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Groups members
   * @return entries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Groups members")

  public List<GroupEntry> getEntries() {
    return entries;
  }


  public void setEntries(List<GroupEntry> entries) {
    this.entries = entries;
  }


  public GroupContents paginationMetadata(PaginationMetadata paginationMetadata) {
    
    this.paginationMetadata = paginationMetadata;
    return this;
  }

   /**
   * Get paginationMetadata
   * @return paginationMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaginationMetadata getPaginationMetadata() {
    return paginationMetadata;
  }


  public void setPaginationMetadata(PaginationMetadata paginationMetadata) {
    this.paginationMetadata = paginationMetadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupContents groupContents = (GroupContents) o;
    return Objects.equals(this.entries, groupContents.entries) &&
        Objects.equals(this.paginationMetadata, groupContents.paginationMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, paginationMetadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupContents {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    paginationMetadata: ").append(toIndentedString(paginationMetadata)).append("\n");
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
    openapiFields.add("entries");
    openapiFields.add("pagination_metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupContents
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupContents.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupContents is not found in the empty JSON string", GroupContents.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!GroupContents.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupContents` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
      JsonArray jsonArrayentries = jsonObj.getAsJsonArray("entries");
      if (jsonArrayentries != null) {
        // ensure the json data is an array
        if (!jsonObj.get("entries").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `entries` to be an array in the JSON string but got `%s`", jsonObj.get("entries").toString()));
        }

        // validate the optional field `entries` (array)
        for (int i = 0; i < jsonArrayentries.size(); i++) {
          GroupEntry.validateJsonObject(jsonArrayentries.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `pagination_metadata`
      if (jsonObj.getAsJsonObject("pagination_metadata") != null) {
        PaginationMetadata.validateJsonObject(jsonObj.getAsJsonObject("pagination_metadata"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupContents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupContents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupContents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupContents.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupContents>() {
           @Override
           public void write(JsonWriter out, GroupContents value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupContents read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupContents given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupContents
  * @throws IOException if the JSON string is invalid with respect to GroupContents
  */
  public static GroupContents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupContents.class);
  }

 /**
  * Convert an instance of GroupContents to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

