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
import io.tiledb.cloud.rest_api.model.Error;
import java.io.File;
import io.tiledb.cloud.rest_api.model.FileCreate;
import io.tiledb.cloud.rest_api.model.FileCreated;
import io.tiledb.cloud.rest_api.model.FileExport;
import io.tiledb.cloud.rest_api.model.FileExported;
import io.tiledb.cloud.rest_api.model.FileUploaded;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
@Disabled
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    /**
     * Create a tiledb file at the specified location
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void handleCreateFileTest() throws ApiException {
        String namespace = null;
        FileCreate fileCreate = null;
        String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = null;
        FileCreated response = api.handleCreateFile(namespace, fileCreate, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME);
        // TODO: test validations
    }

    /**
     * Export a TileDB File back to its original file format
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void handleExportFileTest() throws ApiException {
        String namespace = null;
        String _file = null;
        FileExport fileExport = null;
        FileExported response = api.handleExportFile(namespace, _file, fileExport);
        // TODO: test validations
    }

    /**
     * Upload a tiledb file at the specified location
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void handleUploadFileTest() throws ApiException {
        String namespace = null;
        File inputFile = null;
        String X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME = null;
        String outputUri = null;
        String name = null;
        FileUploaded response = api.handleUploadFile(namespace, inputFile, X_TILEDB_CLOUD_ACCESS_CREDENTIALS_NAME, outputUri, name);
        // TODO: test validations
    }

}
