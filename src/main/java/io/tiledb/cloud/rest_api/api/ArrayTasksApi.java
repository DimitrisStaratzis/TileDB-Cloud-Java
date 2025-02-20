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


import io.tiledb.cloud.rest_api.model.ArrayTaskBrowserSidebar;
import io.tiledb.cloud.rest_api.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayTasksApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ArrayTasksApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ArrayTasksApi(ApiClient apiClient) {
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
     * Build call for getArrayTasksSidebar
     * @param start Fetch tasks created after this time, unix epoch in seconds, default 7 days ago (optional)
     * @param end Fetch tasks created before this time, unix epoch in seconds, default now (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> sidebar metadata for task definitions for all arrays user has access to </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> array tasks not found </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getArrayTasksSidebarCall(Integer start, Integer end, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/tasks/sidebar";

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
    private okhttp3.Call getArrayTasksSidebarValidateBeforeCall(Integer start, Integer end, final ApiCallback _callback) throws ApiException {
        return getArrayTasksSidebarCall(start, end, _callback);

    }

    /**
     * 
     * 
     * @param start Fetch tasks created after this time, unix epoch in seconds, default 7 days ago (optional)
     * @param end Fetch tasks created before this time, unix epoch in seconds, default now (optional)
     * @return ArrayTaskBrowserSidebar
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> sidebar metadata for task definitions for all arrays user has access to </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> array tasks not found </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ArrayTaskBrowserSidebar getArrayTasksSidebar(Integer start, Integer end) throws ApiException {
        ApiResponse<ArrayTaskBrowserSidebar> localVarResp = getArrayTasksSidebarWithHttpInfo(start, end);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param start Fetch tasks created after this time, unix epoch in seconds, default 7 days ago (optional)
     * @param end Fetch tasks created before this time, unix epoch in seconds, default now (optional)
     * @return ApiResponse&lt;ArrayTaskBrowserSidebar&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> sidebar metadata for task definitions for all arrays user has access to </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> array tasks not found </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ArrayTaskBrowserSidebar> getArrayTasksSidebarWithHttpInfo(Integer start, Integer end) throws ApiException {
        okhttp3.Call localVarCall = getArrayTasksSidebarValidateBeforeCall(start, end, null);
        Type localVarReturnType = new TypeToken<ArrayTaskBrowserSidebar>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param start Fetch tasks created after this time, unix epoch in seconds, default 7 days ago (optional)
     * @param end Fetch tasks created before this time, unix epoch in seconds, default now (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> sidebar metadata for task definitions for all arrays user has access to </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> array tasks not found </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getArrayTasksSidebarAsync(Integer start, Integer end, final ApiCallback<ArrayTaskBrowserSidebar> _callback) throws ApiException {

        okhttp3.Call localVarCall = getArrayTasksSidebarValidateBeforeCall(start, end, _callback);
        Type localVarReturnType = new TypeToken<ArrayTaskBrowserSidebar>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
