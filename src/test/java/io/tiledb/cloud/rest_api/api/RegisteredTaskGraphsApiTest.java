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
import io.tiledb.cloud.rest_api.model.RegisteredTaskGraph;
import io.tiledb.cloud.rest_api.model.TaskGraphSharing;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegisteredTaskGraphsApi
 */
@Disabled
public class RegisteredTaskGraphsApiTest {

    private final RegisteredTaskGraphsApi api = new RegisteredTaskGraphsApi();

    /**
     * Delete the given registered task graph. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteRegisteredTaskGraphTest() throws ApiException {
        String namespace = null;
        String name = null;
        api.deleteRegisteredTaskGraph(namespace, name);
        // TODO: test validations
    }

    /**
     * Fetch the contents of this registered task graph. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRegisteredTaskGraphTest() throws ApiException {
        String namespace = null;
        String name = null;
        RegisteredTaskGraph response = api.getRegisteredTaskGraph(namespace, name);
        // TODO: test validations
    }

    /**
     * Get sharing policies for the task graph.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRegisteredTaskGraphSharingPoliciesTest() throws ApiException {
        String namespace = null;
        String name = null;
        List<TaskGraphSharing> response = api.getRegisteredTaskGraphSharingPolicies(namespace, name);
        // TODO: test validations
    }

    /**
     * Register a task graph in the given namespace, with the given name. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerRegisteredTaskGraphTest() throws ApiException {
        String namespace = null;
        String name = null;
        RegisteredTaskGraph graph = null;
        api.registerRegisteredTaskGraph(namespace, name, graph);
        // TODO: test validations
    }

    /**
     * Share a task graph.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void shareRegisteredTaskGraphTest() throws ApiException {
        String namespace = null;
        String name = null;
        TaskGraphSharing taskGraphSharing = null;
        api.shareRegisteredTaskGraph(namespace, name, taskGraphSharing);
        // TODO: test validations
    }

    /**
     * Update the contents of an existing registered task graph. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateRegisteredTaskGraphTest() throws ApiException {
        String namespace = null;
        String name = null;
        RegisteredTaskGraph graph = null;
        api.updateRegisteredTaskGraph(namespace, name, graph);
        // TODO: test validations
    }

}
