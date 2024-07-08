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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.openapitools.jackson.nullable.JsonNullable;

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
 * metadata of a group
 */
@ApiModel(description = "metadata of a group")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class GroupInfo {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_TILEDB_URI = "tiledb_uri";
  @SerializedName(SERIALIZED_NAME_TILEDB_URI)
  private String tiledbUri;

  public static final String SERIALIZED_NAME_ASSET_COUNT = "asset_count";
  @SerializedName(SERIALIZED_NAME_ASSET_COUNT)
  private BigDecimal assetCount;

  public static final String SERIALIZED_NAME_GROUP_COUNT = "group_count";
  @SerializedName(SERIALIZED_NAME_GROUP_COUNT)
  private BigDecimal groupCount;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private BigDecimal size;

  public static final String SERIALIZED_NAME_LAST_ACCESSED = "last_accessed";
  @SerializedName(SERIALIZED_NAME_LAST_ACCESSED)
  private OffsetDateTime lastAccessed;

  public static final String SERIALIZED_NAME_ALLOWED_ACTIONS = "allowed_actions";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ACTIONS)
  private List<GroupActions> allowedActions = null;

  public static final String SERIALIZED_NAME_GROUP_TYPE = "group_type";
  @SerializedName(SERIALIZED_NAME_GROUP_TYPE)
  private GroupType groupType;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_ACCESS_CREDENTIALS_NAME = "access_credentials_name";
  @SerializedName(SERIALIZED_NAME_ACCESS_CREDENTIALS_NAME)
  private String accessCredentialsName;

  public static final String SERIALIZED_NAME_SHARE_COUNT = "share_count";
  @SerializedName(SERIALIZED_NAME_SHARE_COUNT)
  private BigDecimal shareCount;

  public static final String SERIALIZED_NAME_PUBLIC_SHARE = "public_share";
  @SerializedName(SERIALIZED_NAME_PUBLIC_SHARE)
  private Boolean publicShare;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_LICENSE_ID = "license_id";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private String licenseId;

  public static final String SERIALIZED_NAME_LICENSE_TEXT = "license_text";
  @SerializedName(SERIALIZED_NAME_LICENSE_TEXT)
  private String licenseText;

  public GroupInfo() {
  }

  public GroupInfo id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * unique ID of registered group
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "unique ID of registered group")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GroupInfo namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * namespace group is in
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "user1", value = "namespace group is in")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public GroupInfo name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of group
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "myarray1", value = "name of group")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GroupInfo description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description of group
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "description of group")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GroupInfo uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * uri of group
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "s3://bucket/asset", value = "uri of group")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public GroupInfo tiledbUri(String tiledbUri) {
    
    this.tiledbUri = tiledbUri;
    return this;
  }

   /**
   * uri for access through TileDB cloud
   * @return tiledbUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "uri for access through TileDB cloud")

  public String getTiledbUri() {
    return tiledbUri;
  }


  public void setTiledbUri(String tiledbUri) {
    this.tiledbUri = tiledbUri;
  }


  public GroupInfo assetCount(BigDecimal assetCount) {
    
    this.assetCount = assetCount;
    return this;
  }

   /**
   * A count of direct array members
   * @return assetCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12.0", value = "A count of direct array members")

  public BigDecimal getAssetCount() {
    return assetCount;
  }


  public void setAssetCount(BigDecimal assetCount) {
    this.assetCount = assetCount;
  }


  public GroupInfo groupCount(BigDecimal groupCount) {
    
    this.groupCount = groupCount;
    return this;
  }

   /**
   * A count of direct group members
   * @return groupCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4.0", value = "A count of direct group members")

  public BigDecimal getGroupCount() {
    return groupCount;
  }


  public void setGroupCount(BigDecimal groupCount) {
    this.groupCount = groupCount;
  }


  public GroupInfo size(BigDecimal size) {
    
    this.size = size;
    return this;
  }

   /**
   * A count of direct members. This is the sum of asset_count and group_count
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16.0", value = "A count of direct members. This is the sum of asset_count and group_count")

  public BigDecimal getSize() {
    return size;
  }


  public void setSize(BigDecimal size) {
    this.size = size;
  }


  public GroupInfo lastAccessed(OffsetDateTime lastAccessed) {
    
    this.lastAccessed = lastAccessed;
    return this;
  }

   /**
   * Datetime groups was last accessed in UTC
   * @return lastAccessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Datetime groups was last accessed in UTC")

  public OffsetDateTime getLastAccessed() {
    return lastAccessed;
  }


  public void setLastAccessed(OffsetDateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
  }


  public GroupInfo allowedActions(List<GroupActions> allowedActions) {
    
    this.allowedActions = allowedActions;
    return this;
  }

  public GroupInfo addAllowedActionsItem(GroupActions allowedActionsItem) {
    if (this.allowedActions == null) {
      this.allowedActions = new ArrayList<>();
    }
    this.allowedActions.add(allowedActionsItem);
    return this;
  }

   /**
   * list of actions user is allowed to do on this group
   * @return allowedActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "list of actions user is allowed to do on this group")

  public List<GroupActions> getAllowedActions() {
    return allowedActions;
  }


  public void setAllowedActions(List<GroupActions> allowedActions) {
    this.allowedActions = allowedActions;
  }


  public GroupInfo groupType(GroupType groupType) {
    
    this.groupType = groupType;
    return this;
  }

   /**
   * Get groupType
   * @return groupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupType getGroupType() {
    return groupType;
  }


  public void setGroupType(GroupType groupType) {
    this.groupType = groupType;
  }


  public GroupInfo logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * logo (base64 encoded) for the gruop. Optional
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "logo (base64 encoded) for the gruop. Optional")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public GroupInfo accessCredentialsName(String accessCredentialsName) {
    
    this.accessCredentialsName = accessCredentialsName;
    return this;
  }

   /**
   * the name of the access credentials to use. if unset, the default credentials will be used
   * @return accessCredentialsName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the name of the access credentials to use. if unset, the default credentials will be used")

  public String getAccessCredentialsName() {
    return accessCredentialsName;
  }


  public void setAccessCredentialsName(String accessCredentialsName) {
    this.accessCredentialsName = accessCredentialsName;
  }


  public GroupInfo shareCount(BigDecimal shareCount) {
    
    this.shareCount = shareCount;
    return this;
  }

   /**
   * number of unique namespaces this group is shared with
   * @return shareCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of unique namespaces this group is shared with")

  public BigDecimal getShareCount() {
    return shareCount;
  }


  public void setShareCount(BigDecimal shareCount) {
    this.shareCount = shareCount;
  }


  public GroupInfo publicShare(Boolean publicShare) {
    
    this.publicShare = publicShare;
    return this;
  }

   /**
   * Suggests if the group was shared to public by owner
   * @return publicShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Suggests if the group was shared to public by owner")

  public Boolean getPublicShare() {
    return publicShare;
  }


  public void setPublicShare(Boolean publicShare) {
    this.publicShare = publicShare;
  }


  public GroupInfo tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public GroupInfo addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * optional tags for group
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional tags for group")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public GroupInfo licenseId(String licenseId) {
    
    this.licenseId = licenseId;
    return this;
  }

   /**
   * License identifier from SPDX License List or Custom
   * @return licenseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "License identifier from SPDX License List or Custom")

  public String getLicenseId() {
    return licenseId;
  }


  public void setLicenseId(String licenseId) {
    this.licenseId = licenseId;
  }


  public GroupInfo licenseText(String licenseText) {
    
    this.licenseText = licenseText;
    return this;
  }

   /**
   * License text
   * @return licenseText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "License text")

  public String getLicenseText() {
    return licenseText;
  }


  public void setLicenseText(String licenseText) {
    this.licenseText = licenseText;
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
  public GroupInfo putAdditionalProperty(String key, Object value) {
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
    GroupInfo groupInfo = (GroupInfo) o;
    return Objects.equals(this.id, groupInfo.id) &&
        Objects.equals(this.namespace, groupInfo.namespace) &&
        Objects.equals(this.name, groupInfo.name) &&
        Objects.equals(this.description, groupInfo.description) &&
        Objects.equals(this.uri, groupInfo.uri) &&
        Objects.equals(this.tiledbUri, groupInfo.tiledbUri) &&
        Objects.equals(this.assetCount, groupInfo.assetCount) &&
        Objects.equals(this.groupCount, groupInfo.groupCount) &&
        Objects.equals(this.size, groupInfo.size) &&
        Objects.equals(this.lastAccessed, groupInfo.lastAccessed) &&
        Objects.equals(this.allowedActions, groupInfo.allowedActions) &&
        Objects.equals(this.groupType, groupInfo.groupType) &&
        Objects.equals(this.logo, groupInfo.logo) &&
        Objects.equals(this.accessCredentialsName, groupInfo.accessCredentialsName) &&
        Objects.equals(this.shareCount, groupInfo.shareCount) &&
        Objects.equals(this.publicShare, groupInfo.publicShare) &&
        Objects.equals(this.tags, groupInfo.tags) &&
        Objects.equals(this.licenseId, groupInfo.licenseId) &&
        Objects.equals(this.licenseText, groupInfo.licenseText)&&
        Objects.equals(this.additionalProperties, groupInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, name, description, uri, tiledbUri, assetCount, groupCount, size, lastAccessed, allowedActions, groupType, logo, accessCredentialsName, shareCount, publicShare, tags, licenseId, licenseText, additionalProperties);
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
    sb.append("class GroupInfo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    tiledbUri: ").append(toIndentedString(tiledbUri)).append("\n");
    sb.append("    assetCount: ").append(toIndentedString(assetCount)).append("\n");
    sb.append("    groupCount: ").append(toIndentedString(groupCount)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
    sb.append("    allowedActions: ").append(toIndentedString(allowedActions)).append("\n");
    sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    accessCredentialsName: ").append(toIndentedString(accessCredentialsName)).append("\n");
    sb.append("    shareCount: ").append(toIndentedString(shareCount)).append("\n");
    sb.append("    publicShare: ").append(toIndentedString(publicShare)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
    sb.append("    licenseText: ").append(toIndentedString(licenseText)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("namespace");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("uri");
    openapiFields.add("tiledb_uri");
    openapiFields.add("asset_count");
    openapiFields.add("group_count");
    openapiFields.add("size");
    openapiFields.add("last_accessed");
    openapiFields.add("allowed_actions");
    openapiFields.add("group_type");
    openapiFields.add("logo");
    openapiFields.add("access_credentials_name");
    openapiFields.add("share_count");
    openapiFields.add("public_share");
    openapiFields.add("tags");
    openapiFields.add("license_id");
    openapiFields.add("license_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GroupInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupInfo is not found in the empty JSON string", GroupInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonNull()) && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if ((jsonObj.get("tiledb_uri") != null && !jsonObj.get("tiledb_uri").isJsonNull()) && !jsonObj.get("tiledb_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tiledb_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tiledb_uri").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("allowed_actions") != null && !jsonObj.get("allowed_actions").isJsonNull()) && !jsonObj.get("allowed_actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_actions` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_actions").toString()));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if ((jsonObj.get("access_credentials_name") != null && !jsonObj.get("access_credentials_name").isJsonNull()) && !jsonObj.get("access_credentials_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_credentials_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_credentials_name").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull()) && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("license_id") != null && !jsonObj.get("license_id").isJsonNull()) && !jsonObj.get("license_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_id").toString()));
      }
      if ((jsonObj.get("license_text") != null && !jsonObj.get("license_text").isJsonNull()) && !jsonObj.get("license_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupInfo>() {
           @Override
           public void write(JsonWriter out, GroupInfo value) throws IOException {
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
           public GroupInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GroupInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GroupInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupInfo
  * @throws IOException if the JSON string is invalid with respect to GroupInfo
  */
  public static GroupInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupInfo.class);
  }

 /**
  * Convert an instance of GroupInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

