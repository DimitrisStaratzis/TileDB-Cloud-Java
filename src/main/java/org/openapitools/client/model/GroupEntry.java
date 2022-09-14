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
import org.openapitools.client.model.ArrayInfo;
import org.openapitools.client.model.GroupInfo;

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
 * Object describing a single member of a group, which can be an array or a group
 */
@ApiModel(description = "Object describing a single member of a group, which can be an array or a group")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T18:46:41.869452+03:00[Europe/Athens]")
public class GroupEntry {
  public static final String SERIALIZED_NAME_MEMBER_ID = "member_id";
  @SerializedName(SERIALIZED_NAME_MEMBER_ID)
  private String memberId;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private GroupInfo group;

  public static final String SERIALIZED_NAME_ARRAY = "array";
  @SerializedName(SERIALIZED_NAME_ARRAY)
  private ArrayInfo array;

  public GroupEntry() { 
  }

  
  public GroupEntry(
     String memberId
  ) {
    this();
    this.memberId = memberId;
  }

   /**
   * The unique member id for the entry
   * @return memberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique member id for the entry")

  public String getMemberId() {
    return memberId;
  }




  public GroupEntry group(GroupInfo group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupInfo getGroup() {
    return group;
  }


  public void setGroup(GroupInfo group) {
    this.group = group;
  }


  public GroupEntry array(ArrayInfo array) {
    
    this.array = array;
    return this;
  }

   /**
   * Get array
   * @return array
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArrayInfo getArray() {
    return array;
  }


  public void setArray(ArrayInfo array) {
    this.array = array;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupEntry groupEntry = (GroupEntry) o;
    return Objects.equals(this.memberId, groupEntry.memberId) &&
        Objects.equals(this.group, groupEntry.group) &&
        Objects.equals(this.array, groupEntry.array);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, group, array);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupEntry {\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
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
    openapiFields.add("member_id");
    openapiFields.add("group");
    openapiFields.add("array");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupEntry.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupEntry is not found in the empty JSON string", GroupEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
//      for (Entry<String, JsonElement> entry : entries) {
//        if (!GroupEntry.openapiFields.contains(entry.getKey())) {
//          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
//        }
//      }
      if (jsonObj.get("member_id") != null && !jsonObj.get("member_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `member_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("member_id").toString()));
      }
      // validate the optional field `group`
      if (jsonObj.getAsJsonObject("group") != null) {
        GroupInfo.validateJsonObject(jsonObj.getAsJsonObject("group"));
      }
      // validate the optional field `array`
      if (jsonObj.getAsJsonObject("array") != null) {
        ArrayInfo.validateJsonObject(jsonObj.getAsJsonObject("array"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupEntry>() {
           @Override
           public void write(JsonWriter out, GroupEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupEntry
  * @throws IOException if the JSON string is invalid with respect to GroupEntry
  */
  public static GroupEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupEntry.class);
  }

 /**
  * Convert an instance of GroupEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

