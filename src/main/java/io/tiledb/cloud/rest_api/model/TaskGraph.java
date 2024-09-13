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
import io.tiledb.cloud.rest_api.model.RetryStrategy;
import io.tiledb.cloud.rest_api.model.TaskGraphNode;
import io.tiledb.cloud.rest_api.model.TaskGraphType;
import java.io.IOException;
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
 * Information about a task graph.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-13T19:24:49.771847040-04:00[America/New_York]", comments = "Generator version: 7.7.0")
public class TaskGraph {
  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_NODES = "nodes";
  @SerializedName(SERIALIZED_NAME_NODES)
  private List<TaskGraphNode> nodes = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARALLELISM = "parallelism";
  @SerializedName(SERIALIZED_NAME_PARALLELISM)
  private Long parallelism;

  public static final String SERIALIZED_NAME_RETRY_STRATEGY = "retry_strategy";
  @SerializedName(SERIALIZED_NAME_RETRY_STRATEGY)
  private RetryStrategy retryStrategy;

  public static final String SERIALIZED_NAME_DEADLINE = "deadline";
  @SerializedName(SERIALIZED_NAME_DEADLINE)
  private Long deadline;

  public static final String SERIALIZED_NAME_TASK_GRAPH_TYPE = "task_graph_type";
  @SerializedName(SERIALIZED_NAME_TASK_GRAPH_TYPE)
  private TaskGraphType taskGraphType;

  public TaskGraph() {
  }

  public TaskGraph(
     String uuid, 
     String createdBy, 
     OffsetDateTime createdAt
  ) {
    this();
    this.uuid = uuid;
    this.createdBy = createdBy;
    this.createdAt = createdAt;
  }

  /**
   * The server-generated UUID of the task graph.
   * @return uuid
   */
  @javax.annotation.Nullable
  public String getUuid() {
    return uuid;
  }



  public TaskGraph namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * The namespace that owns this task graph. When creating a task graph log, this is used as the namespace to create the log in; thereafter it is read-only. 
   * @return namespace
   */
  @javax.annotation.Nullable
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  /**
   * The name of the user who created this task graph log.
   * @return createdBy
   */
  @javax.annotation.Nullable
  public String getCreatedBy() {
    return createdBy;
  }



  public TaskGraph name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A name for this task graph, displayed in the UI. Does not need to be unique. 
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  /**
   * The date/time when this task graph was originally created. 
   * @return createdAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }



  public TaskGraph nodes(List<TaskGraphNode> nodes) {
    this.nodes = nodes;
    return this;
  }

  public TaskGraph addNodesItem(TaskGraphNode nodesItem) {
    if (this.nodes == null) {
      this.nodes = new ArrayList<>();
    }
    this.nodes.add(nodesItem);
    return this;
  }

  /**
   * The structure of the graph. This is provided by the client when first setting up the task graph. This must be topographically sorted; that is, each node must appear after all nodes that it depends upon. 
   * @return nodes
   */
  @javax.annotation.Nullable
  public List<TaskGraphNode> getNodes() {
    return nodes;
  }

  public void setNodes(List<TaskGraphNode> nodes) {
    this.nodes = nodes;
  }


  public TaskGraph parallelism(Long parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  /**
   * Parallelism limits the max total parallel pods that can execute at the same time in a workflow. 
   * @return parallelism
   */
  @javax.annotation.Nullable
  public Long getParallelism() {
    return parallelism;
  }

  public void setParallelism(Long parallelism) {
    this.parallelism = parallelism;
  }


  public TaskGraph retryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
    return this;
  }

  /**
   * Get retryStrategy
   * @return retryStrategy
   */
  @javax.annotation.Nullable
  public RetryStrategy getRetryStrategy() {
    return retryStrategy;
  }

  public void setRetryStrategy(RetryStrategy retryStrategy) {
    this.retryStrategy = retryStrategy;
  }


  public TaskGraph deadline(Long deadline) {
    this.deadline = deadline;
    return this;
  }

  /**
   * Duration in seconds relative to the workflow start time which the workflow is allowed to run before it gets terminated. Defaults to 24h when unset 
   * @return deadline
   */
  @javax.annotation.Nullable
  public Long getDeadline() {
    return deadline;
  }

  public void setDeadline(Long deadline) {
    this.deadline = deadline;
  }


  public TaskGraph taskGraphType(TaskGraphType taskGraphType) {
    this.taskGraphType = taskGraphType;
    return this;
  }

  /**
   * Get taskGraphType
   * @return taskGraphType
   */
  @javax.annotation.Nullable
  public TaskGraphType getTaskGraphType() {
    return taskGraphType;
  }

  public void setTaskGraphType(TaskGraphType taskGraphType) {
    this.taskGraphType = taskGraphType;
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
   * @return the TaskGraph instance itself
   */
  public TaskGraph putAdditionalProperty(String key, Object value) {
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
    TaskGraph taskGraph = (TaskGraph) o;
    return Objects.equals(this.uuid, taskGraph.uuid) &&
        Objects.equals(this.namespace, taskGraph.namespace) &&
        Objects.equals(this.createdBy, taskGraph.createdBy) &&
        Objects.equals(this.name, taskGraph.name) &&
        Objects.equals(this.createdAt, taskGraph.createdAt) &&
        Objects.equals(this.nodes, taskGraph.nodes) &&
        Objects.equals(this.parallelism, taskGraph.parallelism) &&
        Objects.equals(this.retryStrategy, taskGraph.retryStrategy) &&
        Objects.equals(this.deadline, taskGraph.deadline) &&
        Objects.equals(this.taskGraphType, taskGraph.taskGraphType)&&
        Objects.equals(this.additionalProperties, taskGraph.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, namespace, createdBy, name, createdAt, nodes, parallelism, retryStrategy, deadline, taskGraphType, additionalProperties);
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
    sb.append("class TaskGraph {\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    retryStrategy: ").append(toIndentedString(retryStrategy)).append("\n");
    sb.append("    deadline: ").append(toIndentedString(deadline)).append("\n");
    sb.append("    taskGraphType: ").append(toIndentedString(taskGraphType)).append("\n");
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
    openapiFields.add("uuid");
    openapiFields.add("namespace");
    openapiFields.add("created_by");
    openapiFields.add("name");
    openapiFields.add("created_at");
    openapiFields.add("nodes");
    openapiFields.add("parallelism");
    openapiFields.add("retry_strategy");
    openapiFields.add("deadline");
    openapiFields.add("task_graph_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to TaskGraph
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!TaskGraph.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TaskGraph is not found in the empty JSON string", TaskGraph.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonNull()) && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      if ((jsonObj.get("namespace") != null && !jsonObj.get("namespace").isJsonNull()) && !jsonObj.get("namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namespace").toString()));
      }
      if ((jsonObj.get("created_by") != null && !jsonObj.get("created_by").isJsonNull()) && !jsonObj.get("created_by").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created_by` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created_by").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("nodes") != null && !jsonObj.get("nodes").isJsonNull()) {
        JsonArray jsonArraynodes = jsonObj.getAsJsonArray("nodes");
        if (jsonArraynodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("nodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `nodes` to be an array in the JSON string but got `%s`", jsonObj.get("nodes").toString()));
          }

          // validate the optional field `nodes` (array)
          for (int i = 0; i < jsonArraynodes.size(); i++) {
            TaskGraphNode.validateJsonElement(jsonArraynodes.get(i));
          };
        }
      }
      // validate the optional field `retry_strategy`
      if (jsonObj.get("retry_strategy") != null && !jsonObj.get("retry_strategy").isJsonNull()) {
        RetryStrategy.validateJsonElement(jsonObj.get("retry_strategy"));
      }
      // validate the optional field `task_graph_type`
      if (jsonObj.get("task_graph_type") != null && !jsonObj.get("task_graph_type").isJsonNull()) {
        TaskGraphType.validateJsonElement(jsonObj.get("task_graph_type"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TaskGraph.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TaskGraph' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TaskGraph> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TaskGraph.class));

       return (TypeAdapter<T>) new TypeAdapter<TaskGraph>() {
           @Override
           public void write(JsonWriter out, TaskGraph value) throws IOException {
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
           public TaskGraph read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             TaskGraph instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of TaskGraph given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of TaskGraph
   * @throws IOException if the JSON string is invalid with respect to TaskGraph
   */
  public static TaskGraph fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TaskGraph.class);
  }

  /**
   * Convert an instance of TaskGraph to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

