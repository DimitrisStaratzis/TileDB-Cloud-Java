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


import io.tiledb.cloud.rest_api.model.AssetListResponse;
import io.tiledb.cloud.rest_api.model.Error;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssetsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AssetsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AssetsApi(ApiClient apiClient) {
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
     * Build call for listAssets
     * @param namespace namespace (required)
     * @param assetType asset_type to filter to (optional)
     * @param ownershipLevel ownership_level to filter to (owned, shared) (optional)
     * @param depth depth of assets to be returned (optional)
     * @param search search string (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param orderBy order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  (optional)
     * @param expand expansion option for the AssetInfo object to be added to the response (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful list of assets </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAssetsCall(String namespace, String assetType, String ownershipLevel, String depth, String search, Integer page, Integer perPage, String orderBy, String expand, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/assets/{namespace}"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (assetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_type", assetType));
        }

        if (ownershipLevel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ownership_level", ownershipLevel));
        }

        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
        }

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
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
    private okhttp3.Call listAssetsValidateBeforeCall(String namespace, String assetType, String ownershipLevel, String depth, String search, Integer page, Integer perPage, String orderBy, String expand, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listAssets(Async)");
        }

        return listAssetsCall(namespace, assetType, ownershipLevel, depth, search, page, perPage, orderBy, expand, _callback);

    }

    /**
     * 
     * List assets in a namespace
     * @param namespace namespace (required)
     * @param assetType asset_type to filter to (optional)
     * @param ownershipLevel ownership_level to filter to (owned, shared) (optional)
     * @param depth depth of assets to be returned (optional)
     * @param search search string (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param orderBy order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  (optional)
     * @param expand expansion option for the AssetInfo object to be added to the response (optional)
     * @return AssetListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful list of assets </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public AssetListResponse listAssets(String namespace, String assetType, String ownershipLevel, String depth, String search, Integer page, Integer perPage, String orderBy, String expand) throws ApiException {
        ApiResponse<AssetListResponse> localVarResp = listAssetsWithHttpInfo(namespace, assetType, ownershipLevel, depth, search, page, perPage, orderBy, expand);
        return localVarResp.getData();
    }

    /**
     * 
     * List assets in a namespace
     * @param namespace namespace (required)
     * @param assetType asset_type to filter to (optional)
     * @param ownershipLevel ownership_level to filter to (owned, shared) (optional)
     * @param depth depth of assets to be returned (optional)
     * @param search search string (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param orderBy order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  (optional)
     * @param expand expansion option for the AssetInfo object to be added to the response (optional)
     * @return ApiResponse&lt;AssetListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful list of assets </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AssetListResponse> listAssetsWithHttpInfo(String namespace, String assetType, String ownershipLevel, String depth, String search, Integer page, Integer perPage, String orderBy, String expand) throws ApiException {
        okhttp3.Call localVarCall = listAssetsValidateBeforeCall(namespace, assetType, ownershipLevel, depth, search, page, perPage, orderBy, expand, null);
        Type localVarReturnType = new TypeToken<AssetListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List assets in a namespace
     * @param namespace namespace (required)
     * @param assetType asset_type to filter to (optional)
     * @param ownershipLevel ownership_level to filter to (owned, shared) (optional)
     * @param depth depth of assets to be returned (optional)
     * @param search search string (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param orderBy order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  (optional)
     * @param expand expansion option for the AssetInfo object to be added to the response (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful list of assets </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listAssetsAsync(String namespace, String assetType, String ownershipLevel, String depth, String search, Integer page, Integer perPage, String orderBy, String expand, final ApiCallback<AssetListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listAssetsValidateBeforeCall(namespace, assetType, ownershipLevel, depth, search, page, perPage, orderBy, expand, _callback);
        Type localVarReturnType = new TypeToken<AssetListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPublicAssets
     * @param assetType asset_type to filter to (optional)
     * @param depth depth of assets to be returned (optional)
     * @param search search string (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param orderBy order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful list of assets </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPublicAssetsCall(String assetType, String depth, String search, Integer page, Integer perPage, String orderBy, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/public_assets";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (assetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_type", assetType));
        }

        if (depth != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("depth", depth));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
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
    private okhttp3.Call listPublicAssetsValidateBeforeCall(String assetType, String depth, String search, Integer page, Integer perPage, String orderBy, final ApiCallback _callback) throws ApiException {
        return listPublicAssetsCall(assetType, depth, search, page, perPage, orderBy, _callback);

    }

    /**
     * 
     * List public assets
     * @param assetType asset_type to filter to (optional)
     * @param depth depth of assets to be returned (optional)
     * @param search search string (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param orderBy order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  (optional)
     * @return AssetListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful list of assets </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public AssetListResponse listPublicAssets(String assetType, String depth, String search, Integer page, Integer perPage, String orderBy) throws ApiException {
        ApiResponse<AssetListResponse> localVarResp = listPublicAssetsWithHttpInfo(assetType, depth, search, page, perPage, orderBy);
        return localVarResp.getData();
    }

    /**
     * 
     * List public assets
     * @param assetType asset_type to filter to (optional)
     * @param depth depth of assets to be returned (optional)
     * @param search search string (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param orderBy order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  (optional)
     * @return ApiResponse&lt;AssetListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful list of assets </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AssetListResponse> listPublicAssetsWithHttpInfo(String assetType, String depth, String search, Integer page, Integer perPage, String orderBy) throws ApiException {
        okhttp3.Call localVarCall = listPublicAssetsValidateBeforeCall(assetType, depth, search, page, perPage, orderBy, null);
        Type localVarReturnType = new TypeToken<AssetListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List public assets
     * @param assetType asset_type to filter to (optional)
     * @param depth depth of assets to be returned (optional)
     * @param search search string (optional)
     * @param page pagination offset (optional)
     * @param perPage pagination limit (optional)
     * @param orderBy order by a specific property, defaults to &#x60;created_at desc&#x60; supported values are created_at, name, asset_type can also include the order type (asc or desc) separated by space i.e. &#x60;name asc&#x60; &#x60;name desc&#x60; etc.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful list of assets </td><td>  -  </td></tr>
        <tr><td> 502 </td><td> Bad Gateway </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> error response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPublicAssetsAsync(String assetType, String depth, String search, Integer page, Integer perPage, String orderBy, final ApiCallback<AssetListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPublicAssetsValidateBeforeCall(assetType, depth, search, page, perPage, orderBy, _callback);
        Type localVarReturnType = new TypeToken<AssetListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
