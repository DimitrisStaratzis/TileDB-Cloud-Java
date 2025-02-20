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


package io.tiledb.cloud.rest_api.api;

import io.tiledb.cloud.rest_api.ApiCallback;
import io.tiledb.cloud.rest_api.ApiClient;
import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.ApiResponse;
import io.tiledb.cloud.rest_api.Configuration;
import io.tiledb.cloud.rest_api.Pair;
import io.tiledb.cloud.rest_api.ProgressRequestBody;
import io.tiledb.cloud.rest_api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.tiledb.cloud.rest_api.model.Error;
import io.tiledb.cloud.rest_api.model.TaskGraph;
import io.tiledb.cloud.rest_api.model.TaskGraphLog;
import io.tiledb.cloud.rest_api.model.TaskGraphs;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskGraphsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TaskGraphsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskGraphsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createTaskGraph
     * @param namespace Include graphs for this namespace. (required)
     * @param graph Create the task graph. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Task graph created successfully. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTaskGraphCall(String namespace, TaskGraph graph, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = graph;

        // create path and map variables
        String localVarPath = "/taskgraphs/{namespace}/graphs"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createTaskGraphValidateBeforeCall(String namespace, TaskGraph graph, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createTaskGraph(Async)");
        }

        // verify the required parameter 'graph' is set
        if (graph == null) {
            throw new ApiException("Missing the required parameter 'graph' when calling createTaskGraph(Async)");
        }

        return createTaskGraphCall(namespace, graph, _callback);

    }

    /**
     * 
     * Create a single task graph for execution. 
     * @param namespace Include graphs for this namespace. (required)
     * @param graph Create the task graph. (required)
     * @return TaskGraph
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Task graph created successfully. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public TaskGraph createTaskGraph(String namespace, TaskGraph graph) throws ApiException {
        ApiResponse<TaskGraph> localVarResp = createTaskGraphWithHttpInfo(namespace, graph);
        return localVarResp.getData();
    }

    /**
     * 
     * Create a single task graph for execution. 
     * @param namespace Include graphs for this namespace. (required)
     * @param graph Create the task graph. (required)
     * @return ApiResponse&lt;TaskGraph&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Task graph created successfully. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskGraph> createTaskGraphWithHttpInfo(String namespace, TaskGraph graph) throws ApiException {
        okhttp3.Call localVarCall = createTaskGraphValidateBeforeCall(namespace, graph, null);
        Type localVarReturnType = new TypeToken<TaskGraph>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a single task graph for execution. 
     * @param namespace Include graphs for this namespace. (required)
     * @param graph Create the task graph. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Task graph created successfully. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createTaskGraphAsync(String namespace, TaskGraph graph, final ApiCallback<TaskGraph> _callback) throws ApiException {

        okhttp3.Call localVarCall = createTaskGraphValidateBeforeCall(namespace, graph, _callback);
        Type localVarReturnType = new TypeToken<TaskGraph>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getTaskGraph
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Information about the single task graph. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTaskGraphCall(String namespace, String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/taskgraphs/{namespace}/graphs/{id}"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTaskGraphValidateBeforeCall(String namespace, String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getTaskGraph(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTaskGraph(Async)");
        }

        return getTaskGraphCall(namespace, id, _callback);

    }

    /**
     * 
     * Fetch information about a single task graph. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @return TaskGraph
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Information about the single task graph. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public TaskGraph getTaskGraph(String namespace, String id) throws ApiException {
        ApiResponse<TaskGraph> localVarResp = getTaskGraphWithHttpInfo(namespace, id);
        return localVarResp.getData();
    }

    /**
     * 
     * Fetch information about a single task graph. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @return ApiResponse&lt;TaskGraph&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Information about the single task graph. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskGraph> getTaskGraphWithHttpInfo(String namespace, String id) throws ApiException {
        okhttp3.Call localVarCall = getTaskGraphValidateBeforeCall(namespace, id, null);
        Type localVarReturnType = new TypeToken<TaskGraph>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Fetch information about a single task graph. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Information about the single task graph. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTaskGraphAsync(String namespace, String id, final ApiCallback<TaskGraph> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTaskGraphValidateBeforeCall(namespace, id, _callback);
        Type localVarReturnType = new TypeToken<TaskGraph>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listTaskGraphs
     * @param namespace Namespace for graphs (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The task graphs that matched the user&#39;s query. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listTaskGraphsCall(String namespace, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/taskgraphs/{namespace}/graphs"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listTaskGraphsValidateBeforeCall(String namespace, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listTaskGraphs(Async)");
        }

        return listTaskGraphsCall(namespace, _callback);

    }

    /**
     * 
     * Fetch the task graphs of a namespace the user has access to. The returned entries will include only summary data, and will not include information about the individual tasks that were executed. (This information is available when requesting an individual task graph log.) Entries in the response are ordered from newest to oldest. Pagination parameters work as in other API methods; see PaginationMetadata. 
     * @param namespace Namespace for graphs (required)
     * @return TaskGraphs
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The task graphs that matched the user&#39;s query. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public TaskGraphs listTaskGraphs(String namespace) throws ApiException {
        ApiResponse<TaskGraphs> localVarResp = listTaskGraphsWithHttpInfo(namespace);
        return localVarResp.getData();
    }

    /**
     * 
     * Fetch the task graphs of a namespace the user has access to. The returned entries will include only summary data, and will not include information about the individual tasks that were executed. (This information is available when requesting an individual task graph log.) Entries in the response are ordered from newest to oldest. Pagination parameters work as in other API methods; see PaginationMetadata. 
     * @param namespace Namespace for graphs (required)
     * @return ApiResponse&lt;TaskGraphs&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The task graphs that matched the user&#39;s query. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskGraphs> listTaskGraphsWithHttpInfo(String namespace) throws ApiException {
        okhttp3.Call localVarCall = listTaskGraphsValidateBeforeCall(namespace, null);
        Type localVarReturnType = new TypeToken<TaskGraphs>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Fetch the task graphs of a namespace the user has access to. The returned entries will include only summary data, and will not include information about the individual tasks that were executed. (This information is available when requesting an individual task graph log.) Entries in the response are ordered from newest to oldest. Pagination parameters work as in other API methods; see PaginationMetadata. 
     * @param namespace Namespace for graphs (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The task graphs that matched the user&#39;s query. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listTaskGraphsAsync(String namespace, final ApiCallback<TaskGraphs> _callback) throws ApiException {

        okhttp3.Call localVarCall = listTaskGraphsValidateBeforeCall(namespace, _callback);
        Type localVarReturnType = new TypeToken<TaskGraphs>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for submitTaskGraph
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Information about the execution of a single task graph. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitTaskGraphCall(String namespace, String id, String rootId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/taskgraphs/{namespace}/graphs/{id}/submit"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (rootId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("root_task_graph_uuid", rootId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call submitTaskGraphValidateBeforeCall(String namespace, String id, String rootId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling submitTaskGraph(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling submitTaskGraph(Async)");
        }

        return submitTaskGraphCall(namespace, id, rootId, _callback);

    }

    /**
     * 
     * Submit a single task graph for execution. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @return TaskGraphLog
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Information about the execution of a single task graph. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public TaskGraphLog submitTaskGraph(String namespace, String id, String rootId) throws ApiException {
        ApiResponse<TaskGraphLog> localVarResp = submitTaskGraphWithHttpInfo(namespace, id, rootId);
        return localVarResp.getData();
    }

    /**
     * 
     * Submit a single task graph for execution. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @return ApiResponse&lt;TaskGraphLog&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Information about the execution of a single task graph. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<TaskGraphLog> submitTaskGraphWithHttpInfo(String namespace, String id, String rootId) throws ApiException {
        okhttp3.Call localVarCall = submitTaskGraphValidateBeforeCall(namespace, id, rootId, null);
        Type localVarReturnType = new TypeToken<TaskGraphLog>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Submit a single task graph for execution. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Information about the execution of a single task graph. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitTaskGraphAsync(String namespace, String id, String rootId, final ApiCallback<TaskGraphLog> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitTaskGraphValidateBeforeCall(namespace, id, rootId, _callback);
        Type localVarReturnType = new TypeToken<TaskGraphLog>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateTaskGraph
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @param graph Updates to make to the task graph. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Task graph created successfully. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTaskGraphCall(String namespace, String id, TaskGraph graph, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = graph;

        // create path and map variables
        String localVarPath = "/taskgraphs/{namespace}/graphs/{id}"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateTaskGraphValidateBeforeCall(String namespace, String id, TaskGraph graph, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling updateTaskGraph(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateTaskGraph(Async)");
        }

        // verify the required parameter 'graph' is set
        if (graph == null) {
            throw new ApiException("Missing the required parameter 'graph' when calling updateTaskGraph(Async)");
        }

        return updateTaskGraphCall(namespace, id, graph, _callback);

    }

    /**
     * 
     * Update information about a single task graph execution. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @param graph Updates to make to the task graph. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Task graph created successfully. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public void updateTaskGraph(String namespace, String id, TaskGraph graph) throws ApiException {
        updateTaskGraphWithHttpInfo(namespace, id, graph);
    }

    /**
     * 
     * Update information about a single task graph execution. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @param graph Updates to make to the task graph. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Task graph created successfully. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateTaskGraphWithHttpInfo(String namespace, String id, TaskGraph graph) throws ApiException {
        okhttp3.Call localVarCall = updateTaskGraphValidateBeforeCall(namespace, id, graph, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     *  (asynchronously)
     * Update information about a single task graph execution. 
     * @param namespace The namespace that owns this task graph. (required)
     * @param id The UUID of the task graph entry. (required)
     * @param graph Updates to make to the task graph. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Task graph created successfully. </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateTaskGraphAsync(String namespace, String id, TaskGraph graph, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateTaskGraphValidateBeforeCall(namespace, id, graph, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
