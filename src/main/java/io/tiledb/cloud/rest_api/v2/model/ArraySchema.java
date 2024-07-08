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
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.v2.JSON;

/**
 * ArraySchema during creation or retrieval
 */
@ApiModel(description = "ArraySchema during creation or retrieval")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class ArraySchema {
  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private List<Integer> version = new ArrayList<>();

  public static final String SERIALIZED_NAME_ARRAY_TYPE = "arrayType";
  @SerializedName(SERIALIZED_NAME_ARRAY_TYPE)
  private ArrayType arrayType;

  public static final String SERIALIZED_NAME_TILE_ORDER = "tileOrder";
  @SerializedName(SERIALIZED_NAME_TILE_ORDER)
  private Layout tileOrder;

  public static final String SERIALIZED_NAME_CELL_ORDER = "cellOrder";
  @SerializedName(SERIALIZED_NAME_CELL_ORDER)
  private Layout cellOrder;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_COORDS_FILTER_PIPELINE = "coordsFilterPipeline";
  @SerializedName(SERIALIZED_NAME_COORDS_FILTER_PIPELINE)
  private FilterPipeline coordsFilterPipeline;

  public static final String SERIALIZED_NAME_OFFSET_FILTER_PIPELINE = "offsetFilterPipeline";
  @SerializedName(SERIALIZED_NAME_OFFSET_FILTER_PIPELINE)
  private FilterPipeline offsetFilterPipeline;

  public static final String SERIALIZED_NAME_VALIDITY_FILTER_PIPELINE = "validityFilterPipeline";
  @SerializedName(SERIALIZED_NAME_VALIDITY_FILTER_PIPELINE)
  private FilterPipeline validityFilterPipeline;

  public static final String SERIALIZED_NAME_DOMAIN = "domain";
  @SerializedName(SERIALIZED_NAME_DOMAIN)
  private Domain domain;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<Attribute> attributes = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOWS_DUPLICATES = "allowsDuplicates";
  @SerializedName(SERIALIZED_NAME_ALLOWS_DUPLICATES)
  private Boolean allowsDuplicates;

  public static final String SERIALIZED_NAME_TIMESTAMP_RANGE = "timestampRange";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP_RANGE)
  private List<Integer> timestampRange = null;

  public ArraySchema() { 
  }

  public ArraySchema uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI of schema
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "s3://<bucket>/test_array", value = "URI of schema")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public ArraySchema name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * name of schema
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "name of schema")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ArraySchema version(List<Integer> version) {
    
    this.version = version;
    return this;
  }

  public ArraySchema addVersionItem(Integer versionItem) {
    this.version.add(versionItem);
    return this;
  }

   /**
   * file format version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[1, 3, 0]", required = true, value = "file format version")

  public List<Integer> getVersion() {
    return version;
  }


  public void setVersion(List<Integer> version) {
    this.version = version;
  }


  public ArraySchema arrayType(ArrayType arrayType) {
    
    this.arrayType = arrayType;
    return this;
  }

   /**
   * Get arrayType
   * @return arrayType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ArrayType getArrayType() {
    return arrayType;
  }


  public void setArrayType(ArrayType arrayType) {
    this.arrayType = arrayType;
  }


  public ArraySchema tileOrder(Layout tileOrder) {
    
    this.tileOrder = tileOrder;
    return this;
  }

   /**
   * Get tileOrder
   * @return tileOrder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Layout getTileOrder() {
    return tileOrder;
  }


  public void setTileOrder(Layout tileOrder) {
    this.tileOrder = tileOrder;
  }


  public ArraySchema cellOrder(Layout cellOrder) {
    
    this.cellOrder = cellOrder;
    return this;
  }

   /**
   * Get cellOrder
   * @return cellOrder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Layout getCellOrder() {
    return cellOrder;
  }


  public void setCellOrder(Layout cellOrder) {
    this.cellOrder = cellOrder;
  }


  public ArraySchema capacity(Integer capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Capacity of array
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100000", required = true, value = "Capacity of array")

  public Integer getCapacity() {
    return capacity;
  }


  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public ArraySchema coordsFilterPipeline(FilterPipeline coordsFilterPipeline) {
    
    this.coordsFilterPipeline = coordsFilterPipeline;
    return this;
  }

   /**
   * Get coordsFilterPipeline
   * @return coordsFilterPipeline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterPipeline getCoordsFilterPipeline() {
    return coordsFilterPipeline;
  }


  public void setCoordsFilterPipeline(FilterPipeline coordsFilterPipeline) {
    this.coordsFilterPipeline = coordsFilterPipeline;
  }


  public ArraySchema offsetFilterPipeline(FilterPipeline offsetFilterPipeline) {
    
    this.offsetFilterPipeline = offsetFilterPipeline;
    return this;
  }

   /**
   * Get offsetFilterPipeline
   * @return offsetFilterPipeline
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FilterPipeline getOffsetFilterPipeline() {
    return offsetFilterPipeline;
  }


  public void setOffsetFilterPipeline(FilterPipeline offsetFilterPipeline) {
    this.offsetFilterPipeline = offsetFilterPipeline;
  }


  public ArraySchema validityFilterPipeline(FilterPipeline validityFilterPipeline) {
    
    this.validityFilterPipeline = validityFilterPipeline;
    return this;
  }

   /**
   * Get validityFilterPipeline
   * @return validityFilterPipeline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FilterPipeline getValidityFilterPipeline() {
    return validityFilterPipeline;
  }


  public void setValidityFilterPipeline(FilterPipeline validityFilterPipeline) {
    this.validityFilterPipeline = validityFilterPipeline;
  }


  public ArraySchema domain(Domain domain) {
    
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Domain getDomain() {
    return domain;
  }


  public void setDomain(Domain domain) {
    this.domain = domain;
  }


  public ArraySchema attributes(List<Attribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public ArraySchema addAttributesItem(Attribute attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Attributes of array
   * @return attributes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Attributes of array")

  public List<Attribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }


  public ArraySchema allowsDuplicates(Boolean allowsDuplicates) {
    
    this.allowsDuplicates = allowsDuplicates;
    return this;
  }

   /**
   * True if the array allows coordinate duplicates. Applicable only to sparse arrays.
   * @return allowsDuplicates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the array allows coordinate duplicates. Applicable only to sparse arrays.")

  public Boolean getAllowsDuplicates() {
    return allowsDuplicates;
  }


  public void setAllowsDuplicates(Boolean allowsDuplicates) {
    this.allowsDuplicates = allowsDuplicates;
  }


  public ArraySchema timestampRange(List<Integer> timestampRange) {
    
    this.timestampRange = timestampRange;
    return this;
  }

  public ArraySchema addTimestampRangeItem(Integer timestampRangeItem) {
    if (this.timestampRange == null) {
      this.timestampRange = new ArrayList<>();
    }
    this.timestampRange.add(timestampRangeItem);
    return this;
  }

   /**
   * The list of sizes per range
   * @return timestampRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of sizes per range")

  public List<Integer> getTimestampRange() {
    return timestampRange;
  }


  public void setTimestampRange(List<Integer> timestampRange) {
    this.timestampRange = timestampRange;
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
  public ArraySchema putAdditionalProperty(String key, Object value) {
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
    ArraySchema arraySchema = (ArraySchema) o;
    return Objects.equals(this.uri, arraySchema.uri) &&
        Objects.equals(this.name, arraySchema.name) &&
        Objects.equals(this.version, arraySchema.version) &&
        Objects.equals(this.arrayType, arraySchema.arrayType) &&
        Objects.equals(this.tileOrder, arraySchema.tileOrder) &&
        Objects.equals(this.cellOrder, arraySchema.cellOrder) &&
        Objects.equals(this.capacity, arraySchema.capacity) &&
        Objects.equals(this.coordsFilterPipeline, arraySchema.coordsFilterPipeline) &&
        Objects.equals(this.offsetFilterPipeline, arraySchema.offsetFilterPipeline) &&
        Objects.equals(this.validityFilterPipeline, arraySchema.validityFilterPipeline) &&
        Objects.equals(this.domain, arraySchema.domain) &&
        Objects.equals(this.attributes, arraySchema.attributes) &&
        Objects.equals(this.allowsDuplicates, arraySchema.allowsDuplicates) &&
        Objects.equals(this.timestampRange, arraySchema.timestampRange)&&
        Objects.equals(this.additionalProperties, arraySchema.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, name, version, arrayType, tileOrder, cellOrder, capacity, coordsFilterPipeline, offsetFilterPipeline, validityFilterPipeline, domain, attributes, allowsDuplicates, timestampRange, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArraySchema {\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    arrayType: ").append(toIndentedString(arrayType)).append("\n");
    sb.append("    tileOrder: ").append(toIndentedString(tileOrder)).append("\n");
    sb.append("    cellOrder: ").append(toIndentedString(cellOrder)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    coordsFilterPipeline: ").append(toIndentedString(coordsFilterPipeline)).append("\n");
    sb.append("    offsetFilterPipeline: ").append(toIndentedString(offsetFilterPipeline)).append("\n");
    sb.append("    validityFilterPipeline: ").append(toIndentedString(validityFilterPipeline)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    allowsDuplicates: ").append(toIndentedString(allowsDuplicates)).append("\n");
    sb.append("    timestampRange: ").append(toIndentedString(timestampRange)).append("\n");
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
    openapiFields.add("uri");
    openapiFields.add("name");
    openapiFields.add("version");
    openapiFields.add("arrayType");
    openapiFields.add("tileOrder");
    openapiFields.add("cellOrder");
    openapiFields.add("capacity");
    openapiFields.add("coordsFilterPipeline");
    openapiFields.add("offsetFilterPipeline");
    openapiFields.add("validityFilterPipeline");
    openapiFields.add("domain");
    openapiFields.add("attributes");
    openapiFields.add("allowsDuplicates");
    openapiFields.add("timestampRange");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("arrayType");
    openapiRequiredFields.add("tileOrder");
    openapiRequiredFields.add("cellOrder");
    openapiRequiredFields.add("capacity");
    openapiRequiredFields.add("coordsFilterPipeline");
    openapiRequiredFields.add("offsetFilterPipeline");
    openapiRequiredFields.add("domain");
    openapiRequiredFields.add("attributes");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ArraySchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ArraySchema.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ArraySchema is not found in the empty JSON string", ArraySchema.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ArraySchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("uri") != null && !jsonObj.get("uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uri").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be an array in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
      // validate the optional field `coordsFilterPipeline`
      if (jsonObj.getAsJsonObject("coordsFilterPipeline") != null) {
        FilterPipeline.validateJsonObject(jsonObj.getAsJsonObject("coordsFilterPipeline"));
      }
      // validate the optional field `offsetFilterPipeline`
      if (jsonObj.getAsJsonObject("offsetFilterPipeline") != null) {
        FilterPipeline.validateJsonObject(jsonObj.getAsJsonObject("offsetFilterPipeline"));
      }
      // validate the optional field `validityFilterPipeline`
      if (jsonObj.getAsJsonObject("validityFilterPipeline") != null) {
        FilterPipeline.validateJsonObject(jsonObj.getAsJsonObject("validityFilterPipeline"));
      }
      // validate the optional field `domain`
      if (jsonObj.getAsJsonObject("domain") != null) {
        Domain.validateJsonObject(jsonObj.getAsJsonObject("domain"));
      }
      JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
      if (jsonArrayattributes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attributes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
        }

        // validate the optional field `attributes` (array)
        for (int i = 0; i < jsonArrayattributes.size(); i++) {
          Attribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("timestampRange") != null && !jsonObj.get("timestampRange").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `timestampRange` to be an array in the JSON string but got `%s`", jsonObj.get("timestampRange").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ArraySchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ArraySchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ArraySchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ArraySchema.class));

       return (TypeAdapter<T>) new TypeAdapter<ArraySchema>() {
           @Override
           public void write(JsonWriter out, ArraySchema value) throws IOException {
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
           public ArraySchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ArraySchema instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ArraySchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ArraySchema
  * @throws IOException if the JSON string is invalid with respect to ArraySchema
  */
  public static ArraySchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ArraySchema.class);
  }

 /**
  * Convert an instance of ArraySchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

