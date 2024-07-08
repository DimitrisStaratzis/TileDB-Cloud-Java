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


package io.tiledb.cloud.rest_api.v2.api;

import io.tiledb.cloud.rest_api.v2.model.Array;
import io.tiledb.cloud.rest_api.v2.model.ArrayActivityLogData;
import io.tiledb.cloud.rest_api.v2.model.ArrayFetch;
import io.tiledb.cloud.rest_api.v2.ApiCallback;
import io.tiledb.cloud.rest_api.v2.ApiClient;
import io.tiledb.cloud.rest_api.v2.ApiException;
import io.tiledb.cloud.rest_api.v2.ApiResponse;
import io.tiledb.cloud.rest_api.v2.Configuration;
import io.tiledb.cloud.rest_api.v2.Pair;

import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ArrayApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ArrayApi(ApiClient apiClient) {
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
     * Build call for arrayActivityLog
     * @param namespace namespace array is in (an organization name or user&#39;s username) (required)
     * @param array name/uri of array that is url-encoded (required)
     * @param start Start time of window of fetch logs, unix epoch in seconds (default: seven days ago) (optional)
     * @param end End time of window of fetch logs, unix epoch in seconds (default: current utc timestamp) (optional)
     * @param eventTypes Refer to ActivityEventType for possible values (optional)
     * @param taskId Array task id To filter activity to (optional)
     * @param hasTaskId Excludes activity log results that does not contain an array task uuid (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> log of array activity </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call arrayActivityLogCall(String namespace, String array, Integer start, Integer end, List<String> eventTypes, String taskId, Boolean hasTaskId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/arrays/{namespace}/{array}/activity"
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "array" + "\\}", localVarApiClient.escapeString(array.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (start != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start", start));
        }

        if (end != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end", end));
        }

        if (eventTypes != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "event_types", eventTypes));
        }

        if (taskId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("task_id", taskId));
        }

        if (hasTaskId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("has_task_id", hasTaskId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call arrayActivityLogValidateBeforeCall(String namespace, String array, Integer start, Integer end, List<String> eventTypes, String taskId, Boolean hasTaskId, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling arrayActivityLog(Async)");
        }
        
        // verify the required parameter 'array' is set
        if (array == null) {
            throw new ApiException("Missing the required parameter 'array' when calling arrayActivityLog(Async)");
        }
        

        okhttp3.Call localVarCall = arrayActivityLogCall(namespace, array, start, end, eventTypes, taskId, hasTaskId, page, perPage, _callback);
        return localVarCall;

    }

    /**
     * 
     * get array activity logs
     * @param namespace namespace array is in (an organization name or user&#39;s username) (required)
     * @param array name/uri of array that is url-encoded (required)
     * @param start Start time of window of fetch logs, unix epoch in seconds (default: seven days ago) (optional)
     * @param end End time of window of fetch logs, unix epoch in seconds (default: current utc timestamp) (optional)
     * @param eventTypes Refer to ActivityEventType for possible values (optional)
     * @param taskId Array task id To filter activity to (optional)
     * @param hasTaskId Excludes activity log results that does not contain an array task uuid (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @return ArrayActivityLogData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> log of array activity </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ArrayActivityLogData arrayActivityLog(String namespace, String array, Integer start, Integer end, List<String> eventTypes, String taskId, Boolean hasTaskId, Integer page, Integer perPage) throws ApiException {
        ApiResponse<ArrayActivityLogData> localVarResp = arrayActivityLogWithHttpInfo(namespace, array, start, end, eventTypes, taskId, hasTaskId, page, perPage);
        return localVarResp.getData();
    }

    /**
     * 
     * get array activity logs
     * @param namespace namespace array is in (an organization name or user&#39;s username) (required)
     * @param array name/uri of array that is url-encoded (required)
     * @param start Start time of window of fetch logs, unix epoch in seconds (default: seven days ago) (optional)
     * @param end End time of window of fetch logs, unix epoch in seconds (default: current utc timestamp) (optional)
     * @param eventTypes Refer to ActivityEventType for possible values (optional)
     * @param taskId Array task id To filter activity to (optional)
     * @param hasTaskId Excludes activity log results that does not contain an array task uuid (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @return ApiResponse&lt;ArrayActivityLogData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> log of array activity </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ArrayActivityLogData> arrayActivityLogWithHttpInfo(String namespace, String array, Integer start, Integer end, List<String> eventTypes, String taskId, Boolean hasTaskId, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = arrayActivityLogValidateBeforeCall(namespace, array, start, end, eventTypes, taskId, hasTaskId, page, perPage, null);
        Type localVarReturnType = new TypeToken<ArrayActivityLogData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get array activity logs
     * @param namespace namespace array is in (an organization name or user&#39;s username) (required)
     * @param array name/uri of array that is url-encoded (required)
     * @param start Start time of window of fetch logs, unix epoch in seconds (default: seven days ago) (optional)
     * @param end End time of window of fetch logs, unix epoch in seconds (default: current utc timestamp) (optional)
     * @param eventTypes Refer to ActivityEventType for possible values (optional)
     * @param taskId Array task id To filter activity to (optional)
     * @param hasTaskId Excludes activity log results that does not contain an array task uuid (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> log of array activity </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call arrayActivityLogAsync(String namespace, String array, Integer start, Integer end, List<String> eventTypes, String taskId, Boolean hasTaskId, Integer page, Integer perPage, final ApiCallback<ArrayActivityLogData> _callback) throws ApiException {

        okhttp3.Call localVarCall = arrayActivityLogValidateBeforeCall(namespace, array, start, end, eventTypes, taskId, hasTaskId, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<ArrayActivityLogData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getArray
     * @param namespace namespace array is in (an organization name or user&#39;s username) (required)
     * @param array name/uri of array that is url-encoded (required)
     * @param contentType Content Type of input and return mime (required)
     * @param arrayFetch Details for array being fetched (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Array opened successfully </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getArrayCall(String namespace, String array, String contentType, ArrayFetch arrayFetch, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = arrayFetch;

        // create path and map variables
        String localVarPath = "/arrays/{namespace}/{array}"
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "array" + "\\}", localVarApiClient.escapeString(array.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", localVarApiClient.parameterToString(contentType));
        }

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getArrayValidateBeforeCall(String namespace, String array, String contentType, ArrayFetch arrayFetch, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getArray(Async)");
        }
        
        // verify the required parameter 'array' is set
        if (array == null) {
            throw new ApiException("Missing the required parameter 'array' when calling getArray(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling getArray(Async)");
        }
        
        // verify the required parameter 'arrayFetch' is set
        if (arrayFetch == null) {
            throw new ApiException("Missing the required parameter 'arrayFetch' when calling getArray(Async)");
        }
        

        okhttp3.Call localVarCall = getArrayCall(namespace, array, contentType, arrayFetch, _callback);
        return localVarCall;

    }

    /**
     * 
     * Get a array at a specified URI registered to a group/project
     * @param namespace namespace array is in (an organization name or user&#39;s username) (required)
     * @param array name/uri of array that is url-encoded (required)
     * @param contentType Content Type of input and return mime (required)
     * @param arrayFetch Details for array being fetched (required)
     * @return Array
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Array opened successfully </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public Array getArray(String namespace, String array, String contentType, ArrayFetch arrayFetch) throws ApiException {
        ApiResponse<Array> localVarResp = getArrayWithHttpInfo(namespace, array, contentType, arrayFetch);
        return localVarResp.getData();
    }

    /**
     * 
     * Get a array at a specified URI registered to a group/project
     * @param namespace namespace array is in (an organization name or user&#39;s username) (required)
     * @param array name/uri of array that is url-encoded (required)
     * @param contentType Content Type of input and return mime (required)
     * @param arrayFetch Details for array being fetched (required)
     * @return ApiResponse&lt;Array&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Array opened successfully </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Array> getArrayWithHttpInfo(String namespace, String array, String contentType, ArrayFetch arrayFetch) throws ApiException {
        okhttp3.Call localVarCall = getArrayValidateBeforeCall(namespace, array, contentType, arrayFetch, null);
        Type localVarReturnType = new TypeToken<Array>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a array at a specified URI registered to a group/project
     * @param namespace namespace array is in (an organization name or user&#39;s username) (required)
     * @param array name/uri of array that is url-encoded (required)
     * @param contentType Content Type of input and return mime (required)
     * @param arrayFetch Details for array being fetched (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Array opened successfully </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getArrayAsync(String namespace, String array, String contentType, ArrayFetch arrayFetch, final ApiCallback<Array> _callback) throws ApiException {

        okhttp3.Call localVarCall = getArrayValidateBeforeCall(namespace, array, contentType, arrayFetch, _callback);
        Type localVarReturnType = new TypeToken<Array>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
