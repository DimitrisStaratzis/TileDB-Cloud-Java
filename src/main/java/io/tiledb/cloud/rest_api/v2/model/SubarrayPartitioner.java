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
 * The subarray partitioner
 */
@ApiModel(description = "The subarray partitioner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-02T18:54:48.746612+03:00[Europe/Athens]")
public class SubarrayPartitioner {
  public static final String SERIALIZED_NAME_SUBARRAY = "subarray";
  @SerializedName(SERIALIZED_NAME_SUBARRAY)
  private Subarray subarray;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private List<AttributeBufferSize> budget = null;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private SubarrayPartitionerCurrent current;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private SubarrayPartitionerState state;

  public static final String SERIALIZED_NAME_MEMORY_BUDGET = "memoryBudget";
  @SerializedName(SERIALIZED_NAME_MEMORY_BUDGET)
  private Integer memoryBudget;

  public static final String SERIALIZED_NAME_MEMORY_BUDGET_VAR = "memoryBudgetVar";
  @SerializedName(SERIALIZED_NAME_MEMORY_BUDGET_VAR)
  private Integer memoryBudgetVar;

  public SubarrayPartitioner() { 
  }

  public SubarrayPartitioner subarray(Subarray subarray) {
    
    this.subarray = subarray;
    return this;
  }

   /**
   * Get subarray
   * @return subarray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Subarray getSubarray() {
    return subarray;
  }


  public void setSubarray(Subarray subarray) {
    this.subarray = subarray;
  }


  public SubarrayPartitioner budget(List<AttributeBufferSize> budget) {
    
    this.budget = budget;
    return this;
  }

  public SubarrayPartitioner addBudgetItem(AttributeBufferSize budgetItem) {
    if (this.budget == null) {
      this.budget = new ArrayList<>();
    }
    this.budget.add(budgetItem);
    return this;
  }

   /**
   * Result size budget (in bytes) for all attributes.
   * @return budget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Result size budget (in bytes) for all attributes.")

  public List<AttributeBufferSize> getBudget() {
    return budget;
  }


  public void setBudget(List<AttributeBufferSize> budget) {
    this.budget = budget;
  }


  public SubarrayPartitioner current(SubarrayPartitionerCurrent current) {
    
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubarrayPartitionerCurrent getCurrent() {
    return current;
  }


  public void setCurrent(SubarrayPartitionerCurrent current) {
    this.current = current;
  }


  public SubarrayPartitioner state(SubarrayPartitionerState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubarrayPartitionerState getState() {
    return state;
  }


  public void setState(SubarrayPartitionerState state) {
    this.state = state;
  }


  public SubarrayPartitioner memoryBudget(Integer memoryBudget) {
    
    this.memoryBudget = memoryBudget;
    return this;
  }

   /**
   * The memory budget for the fixed-sized attributes and the offsets of the var-sized attributes
   * @return memoryBudget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The memory budget for the fixed-sized attributes and the offsets of the var-sized attributes")

  public Integer getMemoryBudget() {
    return memoryBudget;
  }


  public void setMemoryBudget(Integer memoryBudget) {
    this.memoryBudget = memoryBudget;
  }


  public SubarrayPartitioner memoryBudgetVar(Integer memoryBudgetVar) {
    
    this.memoryBudgetVar = memoryBudgetVar;
    return this;
  }

   /**
   * The memory budget for the var-sized attributes
   * @return memoryBudgetVar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The memory budget for the var-sized attributes")

  public Integer getMemoryBudgetVar() {
    return memoryBudgetVar;
  }


  public void setMemoryBudgetVar(Integer memoryBudgetVar) {
    this.memoryBudgetVar = memoryBudgetVar;
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
  public SubarrayPartitioner putAdditionalProperty(String key, Object value) {
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
    SubarrayPartitioner subarrayPartitioner = (SubarrayPartitioner) o;
    return Objects.equals(this.subarray, subarrayPartitioner.subarray) &&
        Objects.equals(this.budget, subarrayPartitioner.budget) &&
        Objects.equals(this.current, subarrayPartitioner.current) &&
        Objects.equals(this.state, subarrayPartitioner.state) &&
        Objects.equals(this.memoryBudget, subarrayPartitioner.memoryBudget) &&
        Objects.equals(this.memoryBudgetVar, subarrayPartitioner.memoryBudgetVar)&&
        Objects.equals(this.additionalProperties, subarrayPartitioner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subarray, budget, current, state, memoryBudget, memoryBudgetVar, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubarrayPartitioner {\n");
    sb.append("    subarray: ").append(toIndentedString(subarray)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    memoryBudget: ").append(toIndentedString(memoryBudget)).append("\n");
    sb.append("    memoryBudgetVar: ").append(toIndentedString(memoryBudgetVar)).append("\n");
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
    openapiFields.add("subarray");
    openapiFields.add("budget");
    openapiFields.add("current");
    openapiFields.add("state");
    openapiFields.add("memoryBudget");
    openapiFields.add("memoryBudgetVar");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubarrayPartitioner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubarrayPartitioner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubarrayPartitioner is not found in the empty JSON string", SubarrayPartitioner.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `subarray`
      if (jsonObj.getAsJsonObject("subarray") != null) {
        Subarray.validateJsonObject(jsonObj.getAsJsonObject("subarray"));
      }
      JsonArray jsonArraybudget = jsonObj.getAsJsonArray("budget");
      if (jsonArraybudget != null) {
        // ensure the json data is an array
        if (!jsonObj.get("budget").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `budget` to be an array in the JSON string but got `%s`", jsonObj.get("budget").toString()));
        }

        // validate the optional field `budget` (array)
        for (int i = 0; i < jsonArraybudget.size(); i++) {
          AttributeBufferSize.validateJsonObject(jsonArraybudget.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `current`
      if (jsonObj.getAsJsonObject("current") != null) {
        SubarrayPartitionerCurrent.validateJsonObject(jsonObj.getAsJsonObject("current"));
      }
      // validate the optional field `state`
      if (jsonObj.getAsJsonObject("state") != null) {
        SubarrayPartitionerState.validateJsonObject(jsonObj.getAsJsonObject("state"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubarrayPartitioner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubarrayPartitioner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubarrayPartitioner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubarrayPartitioner.class));

       return (TypeAdapter<T>) new TypeAdapter<SubarrayPartitioner>() {
           @Override
           public void write(JsonWriter out, SubarrayPartitioner value) throws IOException {
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
           public SubarrayPartitioner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SubarrayPartitioner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SubarrayPartitioner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubarrayPartitioner
  * @throws IOException if the JSON string is invalid with respect to SubarrayPartitioner
  */
  public static SubarrayPartitioner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubarrayPartitioner.class);
  }

 /**
  * Convert an instance of SubarrayPartitioner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

