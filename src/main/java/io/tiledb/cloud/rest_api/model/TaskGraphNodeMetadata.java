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


package io.tiledb.cloud.rest_api.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.tiledb.cloud.rest_api.JSON;

/**
 * Metadata about an individual node in a task graph.
 */
@ApiModel(description = "Metadata about an individual node in a task graph.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-02T12:25:58.319138+03:00[Europe/Athens]")
/**
 * @deprecated This class is now moved to io.tiledb.cloud.rest_api.v1.model
 */
@Deprecated
public class TaskGraphNodeMetadata {
  public static final String SERIALIZED_NAME_CLIENT_NODE_UUID = "client_node_uuid";
  @SerializedName(SERIALIZED_NAME_CLIENT_NODE_UUID)
  private String clientNodeUuid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DEPENDS_ON = "depends_on";
  @SerializedName(SERIALIZED_NAME_DEPENDS_ON)
  private List<String> dependsOn = null;

  public static final String SERIALIZED_NAME_RUN_LOCATION = "run_location";
  @SerializedName(SERIALIZED_NAME_RUN_LOCATION)
  private TaskGraphLogRunLocation runLocation;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ArrayTaskStatus status;

  public static final String SERIALIZED_NAME_STATUS_MESSAGE = "status_message";
  @SerializedName(SERIALIZED_NAME_STATUS_MESSAGE)
  private String statusMessage;

  public static final String SERIALIZED_NAME_EXECUTIONS = "executions";
  @SerializedName(SERIALIZED_NAME_EXECUTIONS)
  private List<ArrayTask> executions = null;

  public TaskGraphNodeMetadata() {
  }

  
  public TaskGraphNodeMetadata(
     List<ArrayTask> executions
  ) {
    this();
    this.executions = executions;
  }

  public TaskGraphNodeMetadata clientNodeUuid(String clientNodeUuid) {
    
    this.clientNodeUuid = clientNodeUuid;
    return this;
  }

   /**
   * The client-generated UUID of the given graph node.
   * @return clientNodeUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client-generated UUID of the given graph node.")

  public String getClientNodeUuid() {
    return clientNodeUuid;
  }


  public void setClientNodeUuid(String clientNodeUuid) {
    this.clientNodeUuid = clientNodeUuid;
  }


  public TaskGraphNodeMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The client-generated name of the node. This is not guaranteed to be unique. 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client-generated name of the node. This is not guaranteed to be unique. ")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public TaskGraphNodeMetadata dependsOn(List<String> dependsOn) {
    
    this.dependsOn = dependsOn;
    return this;
  }

  public TaskGraphNodeMetadata addDependsOnItem(String dependsOnItem) {
    if (this.dependsOn == null) {
      this.dependsOn = new ArrayList<>();
    }
    this.dependsOn.add(dependsOnItem);
    return this;
  }

   /**
   * The client_node_uuid of each node that this node depends upon. Used to define the structure of the graph. 
   * @return dependsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The client_node_uuid of each node that this node depends upon. Used to define the structure of the graph. ")

  public List<String> getDependsOn() {
    return dependsOn;
  }


  public void setDependsOn(List<String> dependsOn) {
    this.dependsOn = dependsOn;
  }


  public TaskGraphNodeMetadata runLocation(TaskGraphLogRunLocation runLocation) {
    
    this.runLocation = runLocation;
    return this;
  }

   /**
   * Get runLocation
   * @return runLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskGraphLogRunLocation getRunLocation() {
    return runLocation;
  }


  public void setRunLocation(TaskGraphLogRunLocation runLocation) {
    this.runLocation = runLocation;
  }


  public TaskGraphNodeMetadata status(ArrayTaskStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArrayTaskStatus getStatus() {
    return status;
  }


  public void setStatus(ArrayTaskStatus status) {
    this.status = status;
  }


  public TaskGraphNodeMetadata statusMessage(String statusMessage) {
    
    this.statusMessage = statusMessage;
    return this;
  }

   /**
   * The reason the array task status is in the state
   * @return statusMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason the array task status is in the state")

  public String getStatusMessage() {
    return statusMessage;
  }


  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


   /**
   * ArrayTasks representing each execution attempt for this node. For nodes that have never been submitted, this will be empty. For nodes that have been retried, this may have multiple entries. The last one in the list represents the most recent execution. This is read-only and generated by the server based on the tasks it has actually executed. 
   * @return executions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ArrayTasks representing each execution attempt for this node. For nodes that have never been submitted, this will be empty. For nodes that have been retried, this may have multiple entries. The last one in the list represents the most recent execution. This is read-only and generated by the server based on the tasks it has actually executed. ")

  public List<ArrayTask> getExecutions() {
    return executions;
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
  public TaskGraphNodeMetadata putAdditionalProperty(String key, Object value) {
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
    TaskGraphNodeMetadata taskGraphNodeMetadata = (TaskGraphNodeMetadata) o;
    return Objects.equals(this.clientNodeUuid, taskGraphNodeMetadata.clientNodeUuid) &&
        Objects.equals(this.name, taskGraphNodeMetadata.name) &&
        Objects.equals(this.dependsOn, taskGraphNodeMetadata.dependsOn) &&
        Objects.equals(this.runLocation, taskGraphNodeMetadata.runLocation) &&
        Objects.equals(this.status, taskGraphNodeMetadata.status) &&
        Objects.equals(this.statusMessage, taskGraphNodeMetadata.statusMessage) &&
        Objects.equals(this.executions, taskGraphNodeMetadata.executions)&&
        Objects.equals(this.additionalProperties, taskGraphNodeMetadata.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientNodeUuid, name, dependsOn, runLocation, status, statusMessage, executions, additionalProperties);
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
    sb.append("class TaskGraphNodeMetadata {\n");
    sb.append("    clientNodeUuid: ").append(toIndentedString(clientNodeUuid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dependsOn: ").append(toIndentedString(dependsOn)).append("\n");
    sb.append("    runLocation: ").append(toIndentedString(runLocation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    executions: ").append(toIndentedString(executions)).append("\n");
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
    openapiFields.add("client_node_uuid");
    openapiFields.add("name");
    openapiFields.add("depends_on");
    openapiFields.add("run_location");
    openapiFields.add("status");
    openapiFields.add("status_message");
    openapiFields.add("executions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TaskGraphNodeMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TaskGraphNodeMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskGraphNodeMetadata is not found in the empty JSON string", TaskGraphNodeMetadata.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("client_node_uuid") != null && !jsonObj.get("client_node_uuid").isJsonNull()) && !jsonObj.get("client_node_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `client_node_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("client_node_uuid").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("depends_on") != null && !jsonObj.get("depends_on").isJsonNull()) && !jsonObj.get("depends_on").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `depends_on` to be an array in the JSON string but got `%s`", jsonObj.get("depends_on").toString()));
      }
      if ((jsonObj.get("status_message") != null && !jsonObj.get("status_message").isJsonNull()) && !jsonObj.get("status_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status_message").toString()));
      }
      JsonArray jsonArrayexecutions = jsonObj.getAsJsonArray("executions");
      if (jsonArrayexecutions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("executions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `executions` to be an array in the JSON string but got `%s`", jsonObj.get("executions").toString()));
        }

        // validate the optional field `executions` (array)
        for (int i = 0; i < jsonArrayexecutions.size(); i++) {
          ArrayTask.validateJsonObject(jsonArrayexecutions.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskGraphNodeMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskGraphNodeMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskGraphNodeMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskGraphNodeMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskGraphNodeMetadata>() {
           @Override
           public void write(JsonWriter out, TaskGraphNodeMetadata value) throws IOException {
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
           public TaskGraphNodeMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TaskGraphNodeMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TaskGraphNodeMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TaskGraphNodeMetadata
  * @throws IOException if the JSON string is invalid with respect to TaskGraphNodeMetadata
  */
  public static TaskGraphNodeMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskGraphNodeMetadata.class);
  }

 /**
  * Convert an instance of TaskGraphNodeMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

