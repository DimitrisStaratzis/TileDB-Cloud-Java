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
import io.tiledb.cloud.rest_api.model.GroupActions;
import io.tiledb.cloud.rest_api.model.GroupType;
import io.tiledb.cloud.rest_api.model.MetadataStringifiedEntry;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * metadata of a group
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
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
  private List<GroupActions> allowedActions = new ArrayList<>();

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
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_LICENSE_ID = "license_id";
  @SerializedName(SERIALIZED_NAME_LICENSE_ID)
  private String licenseId;

  public static final String SERIALIZED_NAME_LICENSE_TEXT = "license_text";
  @SerializedName(SERIALIZED_NAME_LICENSE_TEXT)
  private String licenseText;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private List<MetadataStringifiedEntry> metadata = new ArrayList<>();

  public GroupInfo() {
  }

  public GroupInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique ID of registered group
   * @return id
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
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
   */
  @javax.annotation.Nullable
  public String getLicenseText() {
    return licenseText;
  }

  public void setLicenseText(String licenseText) {
    this.licenseText = licenseText;
  }


  public GroupInfo createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Datetime the group was registered with tiledb
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GroupInfo createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The username of the group&#39;s creator, if known.
   * @return createdBy
   */
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public GroupInfo metadata(List<MetadataStringifiedEntry> metadata) {
    this.metadata = metadata;
    return this;
  }

  public GroupInfo addMetadataItem(MetadataStringifiedEntry metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Contains metadata of the group. **Note:** This property is included in the response only if the &#x60;with_metadata&#x60; query parameter is set to &#x60;true&#x60;. 
   * @return metadata
   */
  @javax.annotation.Nullable
  public List<MetadataStringifiedEntry> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<MetadataStringifiedEntry> metadata) {
    this.metadata = metadata;
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
   * @return the GroupInfo instance itself
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
        Objects.equals(this.licenseText, groupInfo.licenseText) &&
        Objects.equals(this.createdAt, groupInfo.createdAt) &&
        Objects.equals(this.createdBy, groupInfo.createdBy) &&
        Objects.equals(this.metadata, groupInfo.metadata)&&
        Objects.equals(this.additionalProperties, groupInfo.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, namespace, name, description, uri, tiledbUri, assetCount, groupCount, size, lastAccessed, allowedActions, groupType, logo, accessCredentialsName, shareCount, publicShare, tags, licenseId, licenseText, createdAt, createdBy, metadata, additionalProperties);
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
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("created_at");
    openapiFields.add("created_by");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to GroupInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GroupInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupInfo is not found in the empty JSON string", GroupInfo.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
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
      // ensure the optional json data is an array if present
      if (jsonObj.get("allowed_actions") != null && !jsonObj.get("allowed_actions").isJsonNull() && !jsonObj.get("allowed_actions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowed_actions` to be an array in the JSON string but got `%s`", jsonObj.get("allowed_actions").toString()));
      }
      // validate the optional field `group_type`
      if (jsonObj.get("group_type") != null && !jsonObj.get("group_type").isJsonNull()) {
        GroupType.validateJsonElement(jsonObj.get("group_type"));
      }
      if ((jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonNull()) && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if ((jsonObj.get("access_credentials_name") != null && !jsonObj.get("access_credentials_name").isJsonNull()) && !jsonObj.get("access_credentials_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_credentials_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_credentials_name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("license_id") != null && !jsonObj.get("license_id").isJsonNull()) && !jsonObj.get("license_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_id").toString()));
      }
      if ((jsonObj.get("license_text") != null && !jsonObj.get("license_text").isJsonNull()) && !jsonObj.get("license_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_text").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        JsonArray jsonArraymetadata = jsonObj.getAsJsonArray("metadata");
        if (jsonArraymetadata != null) {
          // ensure the json data is an array
          if (!jsonObj.get("metadata").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `metadata` to be an array in the JSON string but got `%s`", jsonObj.get("metadata").toString()));
          }

          // validate the optional field `metadata` (array)
          for (int i = 0; i < jsonArraymetadata.size(); i++) {
            MetadataStringifiedEntry.validateJsonElement(jsonArraymetadata.get(i));
          };
        }
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
           public GroupInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
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

