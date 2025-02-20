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
import io.tiledb.cloud.rest_api.model.SQLParameters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SqlApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SqlApi(ApiClient apiClient) {
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
     * Build call for runSQL
     * @param namespace namespace to run task under is in (an organization name or user&#39;s username) (required)
     * @param sql sql being submitted (required)
     * @param acceptEncoding Encoding to use (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> JSON results in array of objects form, if the query returns results </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
        <tr><td> 204 </td><td> SQL executed successfully </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runSQLCall(String namespace, SQLParameters sql, String acceptEncoding, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = sql;

        // create path and map variables
        String localVarPath = "/sql/{namespace}"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (acceptEncoding != null) {
            localVarHeaderParams.put("Accept-Encoding", localVarApiClient.parameterToString(acceptEncoding));
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

        String[] localVarAuthNames = new String[] { "BasicAuth", "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call runSQLValidateBeforeCall(String namespace, SQLParameters sql, String acceptEncoding, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling runSQL(Async)");
        }

        // verify the required parameter 'sql' is set
        if (sql == null) {
            throw new ApiException("Missing the required parameter 'sql' when calling runSQL(Async)");
        }

        return runSQLCall(namespace, sql, acceptEncoding, _callback);

    }

    /**
     * 
     * Run a sql query
     * @param namespace namespace to run task under is in (an organization name or user&#39;s username) (required)
     * @param sql sql being submitted (required)
     * @param acceptEncoding Encoding to use (optional)
     * @return List&lt;Map&lt;String, Object&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> JSON results in array of objects form, if the query returns results </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
        <tr><td> 204 </td><td> SQL executed successfully </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public List<Map<String, Object>> runSQL(String namespace, SQLParameters sql, String acceptEncoding) throws ApiException {
        ApiResponse<List<Map<String, Object>>> localVarResp = runSQLWithHttpInfo(namespace, sql, acceptEncoding);
        return localVarResp.getData();
    }

    /**
     * 
     * Run a sql query
     * @param namespace namespace to run task under is in (an organization name or user&#39;s username) (required)
     * @param sql sql being submitted (required)
     * @param acceptEncoding Encoding to use (optional)
     * @return ApiResponse&lt;List&lt;Map&lt;String, Object&gt;&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> JSON results in array of objects form, if the query returns results </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
        <tr><td> 204 </td><td> SQL executed successfully </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Map<String, Object>>> runSQLWithHttpInfo(String namespace, SQLParameters sql, String acceptEncoding) throws ApiException {
        okhttp3.Call localVarCall = runSQLValidateBeforeCall(namespace, sql, acceptEncoding, null);
        Type localVarReturnType = new TypeToken<List<Map<String, Object>>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Run a sql query
     * @param namespace namespace to run task under is in (an organization name or user&#39;s username) (required)
     * @param sql sql being submitted (required)
     * @param acceptEncoding Encoding to use (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> JSON results in array of objects form, if the query returns results </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
        <tr><td> 204 </td><td> SQL executed successfully </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call runSQLAsync(String namespace, SQLParameters sql, String acceptEncoding, final ApiCallback<List<Map<String, Object>>> _callback) throws ApiException {

        okhttp3.Call localVarCall = runSQLValidateBeforeCall(namespace, sql, acceptEncoding, _callback);
        Type localVarReturnType = new TypeToken<List<Map<String, Object>>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    /**
     *
     * Run a sql query
     * @param namespace namespace to run task under is in (an organization name or user&#39;s username) (required)
     * @param sql sql being submitted (required)
     * @param acceptEncoding Encoding to use (optional)
     * @return ApiResponse with byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> JSON results in array of objects form, if the query returns results </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
    <tr><td> 204 </td><td> SQL executed successfully </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
    <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
    </table>
     */
    public ApiResponse<byte[]> runSQLWithHttpInfoBytes(String namespace, SQLParameters sql, String acceptEncoding) throws ApiException {
        okhttp3.Call localVarCall = runSQLValidateBeforeCall(namespace, sql, acceptEncoding, null);
        Type localVarReturnType = new TypeToken<byte[]>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *
     * Run a sql query
     * @param namespace namespace to run task under is in (an organization name or user&#39;s username) (required)
     * @param sql sql being submitted (required)
     * @param acceptEncoding Encoding to use (optional)
     * @return byte[]
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> JSON results in array of objects form, if the query returns results </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
    <tr><td> 204 </td><td> SQL executed successfully </td><td>  * X-TILEDB-CLOUD-TASK-ID - Task ID for just completed request <br>  </td></tr>
    <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
    </table>
     */
    public byte[] runSQLBytes(String namespace, SQLParameters sql, String acceptEncoding) throws ApiException {
        ApiResponse<byte[]> localVarResp = runSQLWithHttpInfoBytes(namespace, sql, acceptEncoding);
        return localVarResp.getData();
    }
}
