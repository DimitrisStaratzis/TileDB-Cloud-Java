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
import io.tiledb.cloud.rest_api.model.ArrayEndTimestampData;
import io.tiledb.cloud.rest_api.model.Error;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotebooksApi
 */
@Disabled
public class NotebooksApiTest {

    private final NotebooksApi api = new NotebooksApi();

    /**
     * retrieve a list of timestamps from the array fragment info listing in milliseconds, paginated
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void notebooksNamespaceArrayEndTimestampsGetTest() throws ApiException {
        String namespace = null;
        String array = null;
        Integer page = null;
        Integer perPage = null;
        ArrayEndTimestampData response = api.notebooksNamespaceArrayEndTimestampsGet(namespace, array, page, perPage);
        // TODO: test validations
    }

    /**
     * prune fragments of the notebook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void notebooksNamespaceArrayPrunePostTest() throws ApiException {
        String namespace = null;
        String array = null;
        Integer keepVersions = null;
        api.notebooksNamespaceArrayPrunePost(namespace, array, keepVersions);
        // TODO: test validations
    }

}
