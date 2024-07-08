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
import java.math.BigDecimal;

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
 * Defines an image that belongs to a set of images having a version
 */
@ApiModel(description = "Defines an image that belongs to a set of images having a version")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
public class UDFImageVersion {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UDF_IMAGE_UUID = "udf_image_uuid";
  @SerializedName(SERIALIZED_NAME_UDF_IMAGE_UUID)
  private String udfImageUuid;

  public static final String SERIALIZED_NAME_DOCKER_IMAGE = "docker_image";
  @SerializedName(SERIALIZED_NAME_DOCKER_IMAGE)
  private String dockerImage;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private BigDecimal version;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public static final String SERIALIZED_NAME_LATEST = "latest";
  @SerializedName(SERIALIZED_NAME_LATEST)
  private Boolean latest;

  public UDFImageVersion() {
  }

  public UDFImageVersion id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique ID of a versioned image
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Unique ID of a versioned image")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UDFImageVersion name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of UDFImageVersion
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of UDFImageVersion")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UDFImageVersion udfImageUuid(String udfImageUuid) {
    
    this.udfImageUuid = udfImageUuid;
    return this;
  }

   /**
   * Unique ID of the UDF image set
   * @return udfImageUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "Unique ID of the UDF image set")

  public String getUdfImageUuid() {
    return udfImageUuid;
  }


  public void setUdfImageUuid(String udfImageUuid) {
    this.udfImageUuid = udfImageUuid;
  }


  public UDFImageVersion dockerImage(String dockerImage) {
    
    this.dockerImage = dockerImage;
    return this;
  }

   /**
   * Uri of docker image related to current entry
   * @return dockerImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Uri of docker image related to current entry")

  public String getDockerImage() {
    return dockerImage;
  }


  public void setDockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
  }


  public UDFImageVersion version(BigDecimal version) {
    
    this.version = version;
    return this;
  }

   /**
   * Image-specific version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.0", value = "Image-specific version")

  public BigDecimal getVersion() {
    return version;
  }


  public void setVersion(BigDecimal version) {
    this.version = version;
  }


  public UDFImageVersion _default(Boolean _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * If current image is default version
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If current image is default version")

  public Boolean getDefault() {
    return _default;
  }


  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  public UDFImageVersion latest(Boolean latest) {
    
    this.latest = latest;
    return this;
  }

   /**
   * If current image is latest version
   * @return latest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If current image is latest version")

  public Boolean getLatest() {
    return latest;
  }


  public void setLatest(Boolean latest) {
    this.latest = latest;
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
  public UDFImageVersion putAdditionalProperty(String key, Object value) {
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
    UDFImageVersion udFImageVersion = (UDFImageVersion) o;
    return Objects.equals(this.id, udFImageVersion.id) &&
        Objects.equals(this.name, udFImageVersion.name) &&
        Objects.equals(this.udfImageUuid, udFImageVersion.udfImageUuid) &&
        Objects.equals(this.dockerImage, udFImageVersion.dockerImage) &&
        Objects.equals(this.version, udFImageVersion.version) &&
        Objects.equals(this._default, udFImageVersion._default) &&
        Objects.equals(this.latest, udFImageVersion.latest)&&
        Objects.equals(this.additionalProperties, udFImageVersion.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, udfImageUuid, dockerImage, version, _default, latest, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UDFImageVersion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    udfImageUuid: ").append(toIndentedString(udfImageUuid)).append("\n");
    sb.append("    dockerImage: ").append(toIndentedString(dockerImage)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("udf_image_uuid");
    openapiFields.add("docker_image");
    openapiFields.add("version");
    openapiFields.add("default");
    openapiFields.add("latest");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UDFImageVersion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UDFImageVersion.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UDFImageVersion is not found in the empty JSON string", UDFImageVersion.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("udf_image_uuid") != null && !jsonObj.get("udf_image_uuid").isJsonNull()) && !jsonObj.get("udf_image_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `udf_image_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("udf_image_uuid").toString()));
      }
      if ((jsonObj.get("docker_image") != null && !jsonObj.get("docker_image").isJsonNull()) && !jsonObj.get("docker_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docker_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docker_image").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UDFImageVersion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UDFImageVersion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UDFImageVersion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UDFImageVersion.class));

       return (TypeAdapter<T>) new TypeAdapter<UDFImageVersion>() {
           @Override
           public void write(JsonWriter out, UDFImageVersion value) throws IOException {
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
           public UDFImageVersion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UDFImageVersion instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of UDFImageVersion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UDFImageVersion
  * @throws IOException if the JSON string is invalid with respect to UDFImageVersion
  */
  public static UDFImageVersion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UDFImageVersion.class);
  }

 /**
  * Convert an instance of UDFImageVersion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

