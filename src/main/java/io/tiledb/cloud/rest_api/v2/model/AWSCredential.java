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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.v2.JSON;

/**
 * Credential information to access Amazon Web Services
 */
@ApiModel(description = "Credential information to access Amazon Web Services")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class AWSCredential {
  public static final String SERIALIZED_NAME_ACCESS_KEY_ID = "access_key_id";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_ID)
  private String accessKeyId;

  public static final String SERIALIZED_NAME_SECRET_ACCESS_KEY = "secret_access_key";
  @SerializedName(SERIALIZED_NAME_SECRET_ACCESS_KEY)
  private String secretAccessKey;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public AWSCredential() { 
  }

  public AWSCredential accessKeyId(String accessKeyId) {
    
    this.accessKeyId = accessKeyId;
    return this;
  }

   /**
   * The ID of the access key
   * @return accessKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the access key")

  public String getAccessKeyId() {
    return accessKeyId;
  }


  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }


  public AWSCredential secretAccessKey(String secretAccessKey) {
    
    this.secretAccessKey = secretAccessKey;
    return this;
  }

   /**
   * The access key&#39;s secret. Never returned in responses.
   * @return secretAccessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The access key's secret. Never returned in responses.")

  public String getSecretAccessKey() {
    return secretAccessKey;
  }


  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }


  public AWSCredential endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * The endpoint used for this credential
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://example.us-west-2.amazonaws.com", value = "The endpoint used for this credential")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
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
  public AWSCredential putAdditionalProperty(String key, Object value) {
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
    AWSCredential awSCredential = (AWSCredential) o;
    return Objects.equals(this.accessKeyId, awSCredential.accessKeyId) &&
        Objects.equals(this.secretAccessKey, awSCredential.secretAccessKey) &&
        Objects.equals(this.endpoint, awSCredential.endpoint)&&
        Objects.equals(this.additionalProperties, awSCredential.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, secretAccessKey, endpoint, additionalProperties);
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
    sb.append("class AWSCredential {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
    openapiFields.add("access_key_id");
    openapiFields.add("secret_access_key");
    openapiFields.add("endpoint");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AWSCredential
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AWSCredential.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AWSCredential is not found in the empty JSON string", AWSCredential.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("access_key_id") != null && !jsonObj.get("access_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_key_id").toString()));
      }
      if (jsonObj.get("secret_access_key") != null && !jsonObj.get("secret_access_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secret_access_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secret_access_key").toString()));
      }
      if (jsonObj.get("endpoint") != null && !jsonObj.get("endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endpoint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AWSCredential.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AWSCredential' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AWSCredential> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AWSCredential.class));

       return (TypeAdapter<T>) new TypeAdapter<AWSCredential>() {
           @Override
           public void write(JsonWriter out, AWSCredential value) throws IOException {
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
           public AWSCredential read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AWSCredential instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AWSCredential given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AWSCredential
  * @throws IOException if the JSON string is invalid with respect to AWSCredential
  */
  public static AWSCredential fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AWSCredential.class);
  }

 /**
  * Convert an instance of AWSCredential to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

