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

import io.tiledb.cloud.rest_api.ApiException;
import io.tiledb.cloud.rest_api.model.AssetListResponse;
import io.tiledb.cloud.rest_api.model.Error;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AssetsApi
 */
@Disabled
public class AssetsApiTest {

    private final AssetsApi api = new AssetsApi();

    /**
     * List assets in a namespace
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAssetsTest() throws ApiException {
        String namespace = null;
        String assetType = null;
        String ownershipLevel = null;
        String depth = null;
        String search = null;
        Integer page = null;
        Integer perPage = null;
        String orderBy = null;
        String expand = null;
        AssetListResponse response = api.listAssets(namespace, assetType, ownershipLevel, depth, search, page, perPage, orderBy, expand);
        // TODO: test validations
    }

    /**
     * List public assets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listPublicAssetsTest() throws ApiException {
        String assetType = null;
        String depth = null;
        String search = null;
        Integer page = null;
        Integer perPage = null;
        String orderBy = null;
        AssetListResponse response = api.listPublicAssets(assetType, depth, search, page, perPage, orderBy);
        // TODO: test validations
    }

}
