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
 * The token information itself. Exactly one sub-field may be set. The names match those in the CloudProvider enum.
 */
@ApiModel(description = "The token information itself. Exactly one sub-field may be set. The names match those in the CloudProvider enum.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class AccessCredentialToken {
  public static final String SERIALIZED_NAME_AZURE = "azure";
  @SerializedName(SERIALIZED_NAME_AZURE)
  private AzureToken azure;

  public static final String SERIALIZED_NAME_GCP = "gcp";
  @SerializedName(SERIALIZED_NAME_GCP)
  private GCPServiceAccountKey gcp;

  public AccessCredentialToken() { 
  }

  public AccessCredentialToken azure(AzureToken azure) {
    
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AzureToken getAzure() {
    return azure;
  }


  public void setAzure(AzureToken azure) {
    this.azure = azure;
  }


  public AccessCredentialToken gcp(GCPServiceAccountKey gcp) {
    
    this.gcp = gcp;
    return this;
  }

   /**
   * Get gcp
   * @return gcp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GCPServiceAccountKey getGcp() {
    return gcp;
  }


  public void setGcp(GCPServiceAccountKey gcp) {
    this.gcp = gcp;
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
  public AccessCredentialToken putAdditionalProperty(String key, Object value) {
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
    AccessCredentialToken accessCredentialToken = (AccessCredentialToken) o;
    return Objects.equals(this.azure, accessCredentialToken.azure) &&
        Objects.equals(this.gcp, accessCredentialToken.gcp)&&
        Objects.equals(this.additionalProperties, accessCredentialToken.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(azure, gcp, additionalProperties);
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
    sb.append("class AccessCredentialToken {\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    gcp: ").append(toIndentedString(gcp)).append("\n");
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
    openapiFields.add("azure");
    openapiFields.add("gcp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AccessCredentialToken
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AccessCredentialToken.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessCredentialToken is not found in the empty JSON string", AccessCredentialToken.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `azure`
      if (jsonObj.getAsJsonObject("azure") != null) {
        AzureToken.validateJsonObject(jsonObj.getAsJsonObject("azure"));
      }
      // validate the optional field `gcp`
      if (jsonObj.getAsJsonObject("gcp") != null) {
        GCPServiceAccountKey.validateJsonObject(jsonObj.getAsJsonObject("gcp"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessCredentialToken.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessCredentialToken' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessCredentialToken> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessCredentialToken.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessCredentialToken>() {
           @Override
           public void write(JsonWriter out, AccessCredentialToken value) throws IOException {
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
           public AccessCredentialToken read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AccessCredentialToken instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AccessCredentialToken given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessCredentialToken
  * @throws IOException if the JSON string is invalid with respect to AccessCredentialToken
  */
  public static AccessCredentialToken fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessCredentialToken.class);
  }

 /**
  * Convert an instance of AccessCredentialToken to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

