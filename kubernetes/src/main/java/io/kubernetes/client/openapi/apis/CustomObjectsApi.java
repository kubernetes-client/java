/*
Copyright 2024 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.apis;

import io.kubernetes.client.openapi.ApiCallback;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.Pair;
import io.kubernetes.client.openapi.ProgressRequestBody;
import io.kubernetes.client.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1DeleteOptions;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

public class CustomObjectsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CustomObjectsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomObjectsApi(ApiClient apiClient) {
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

    private okhttp3.Call createClusterCustomObjectCall(String group, String version, String plural, Object body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createClusterCustomObjectValidateBeforeCall(String group, String version, String plural, Object body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling createClusterCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling createClusterCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling createClusterCustomObject(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createClusterCustomObject(Async)");
        }

        return createClusterCustomObjectCall(group, version, plural, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<Object> createClusterCustomObjectWithHttpInfo(String group, String version, String plural, Object body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createClusterCustomObjectValidateBeforeCall(group, version, plural, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createClusterCustomObjectAsync(String group, String version, String plural, Object body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = createClusterCustomObjectValidateBeforeCall(group, version, plural, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateClusterCustomObjectRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final Object body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIcreateClusterCustomObjectRequest(String group, String version, String plural, Object body) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
         * @return APIcreateClusterCustomObjectRequest
         */
        public APIcreateClusterCustomObjectRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateClusterCustomObjectRequest
         */
        public APIcreateClusterCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIcreateClusterCustomObjectRequest
         */
        public APIcreateClusterCustomObjectRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIcreateClusterCustomObjectRequest
         */
        public APIcreateClusterCustomObjectRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createClusterCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createClusterCustomObjectCall(group, version, plural, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createClusterCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = createClusterCustomObjectWithHttpInfo(group, version, plural, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createClusterCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return createClusterCustomObjectWithHttpInfo(group, version, plural, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createClusterCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return createClusterCustomObjectAsync(group, version, plural, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * Creates a cluster scoped Custom object
     * @param group The custom resource&#39;s group name (required)
     * @param version The custom resource&#39;s version (required)
     * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param body The JSON schema of the Resource to create. (required)
     * @return APIcreateClusterCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateClusterCustomObjectRequest createClusterCustomObject(String group, String version, String plural, Object body) {
        return new APIcreateClusterCustomObjectRequest(group, version, plural, body);
    }
    private okhttp3.Call createNamespacedCustomObjectCall(String group, String version, String namespace, String plural, Object body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNamespacedCustomObjectValidateBeforeCall(String group, String version, String namespace, String plural, Object body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling createNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling createNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling createNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedCustomObject(Async)");
        }

        return createNamespacedCustomObjectCall(group, version, namespace, plural, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<Object> createNamespacedCustomObjectWithHttpInfo(String group, String version, String namespace, String plural, Object body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNamespacedCustomObjectAsync(String group, String version, String namespace, String plural, Object body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateNamespacedCustomObjectRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final Object body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIcreateNamespacedCustomObjectRequest(String group, String version, String namespace, String plural, Object body) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
         * @return APIcreateNamespacedCustomObjectRequest
         */
        public APIcreateNamespacedCustomObjectRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateNamespacedCustomObjectRequest
         */
        public APIcreateNamespacedCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateNamespacedCustomObjectRequest
         */
        public APIcreateNamespacedCustomObjectRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIcreateNamespacedCustomObjectRequest
         */
        public APIcreateNamespacedCustomObjectRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createNamespacedCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createNamespacedCustomObjectCall(group, version, namespace, plural, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createNamespacedCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = createNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createNamespacedCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return createNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createNamespacedCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return createNamespacedCustomObjectAsync(group, version, namespace, plural, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * Creates a namespace scoped Custom object
     * @param group The custom resource&#39;s group name (required)
     * @param version The custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param body The JSON schema of the Resource to create. (required)
     * @return APIcreateNamespacedCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateNamespacedCustomObjectRequest createNamespacedCustomObject(String group, String version, String namespace, String plural, Object body) {
        return new APIcreateNamespacedCustomObjectRequest(group, version, namespace, plural, body);
    }
    private okhttp3.Call deleteClusterCustomObjectCall(String group, String version, String plural, String name, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteClusterCustomObjectValidateBeforeCall(String group, String version, String plural, String name, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling deleteClusterCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling deleteClusterCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling deleteClusterCustomObject(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteClusterCustomObject(Async)");
        }

        return deleteClusterCustomObjectCall(group, version, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);

    }


    private ApiResponse<Object> deleteClusterCustomObjectWithHttpInfo(String group, String version, String plural, String name, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteClusterCustomObjectValidateBeforeCall(group, version, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteClusterCustomObjectAsync(String group, String version, String plural, String name, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteClusterCustomObjectValidateBeforeCall(group, version, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteClusterCustomObjectRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;
        private Integer gracePeriodSeconds;
        private Boolean orphanDependents;
        private String propagationPolicy;
        private String dryRun;
        private V1DeleteOptions body;

        private APIdeleteClusterCustomObjectRequest(String group, String version, String plural, String name) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteClusterCustomObjectRequest
         */
        public APIdeleteClusterCustomObjectRequest gracePeriodSeconds(Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteClusterCustomObjectRequest
         */
        public APIdeleteClusterCustomObjectRequest orphanDependents(Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. (optional)
         * @return APIdeleteClusterCustomObjectRequest
         */
        public APIdeleteClusterCustomObjectRequest propagationPolicy(String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteClusterCustomObjectRequest
         */
        public APIdeleteClusterCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteClusterCustomObjectRequest
         */
        public APIdeleteClusterCustomObjectRequest body(V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteClusterCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteClusterCustomObjectCall(group, version, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        }

        /**
         * Execute deleteClusterCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = deleteClusterCustomObjectWithHttpInfo(group, version, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteClusterCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return deleteClusterCustomObjectWithHttpInfo(group, version, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body);
        }

        /**
         * Execute deleteClusterCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return deleteClusterCustomObjectAsync(group, version, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        }
    }

    /**
     *
     * Deletes the specified cluster scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @return APIdeleteClusterCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteClusterCustomObjectRequest deleteClusterCustomObject(String group, String version, String plural, String name) {
        return new APIdeleteClusterCustomObjectRequest(group, version, plural, name);
    }
    private okhttp3.Call deleteCollectionClusterCustomObjectCall(String group, String version, String plural, String pretty, String labelSelector, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCollectionClusterCustomObjectValidateBeforeCall(String group, String version, String plural, String pretty, String labelSelector, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling deleteCollectionClusterCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling deleteCollectionClusterCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling deleteCollectionClusterCustomObject(Async)");
        }

        return deleteCollectionClusterCustomObjectCall(group, version, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);

    }


    private ApiResponse<Object> deleteCollectionClusterCustomObjectWithHttpInfo(String group, String version, String plural, String pretty, String labelSelector, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionClusterCustomObjectValidateBeforeCall(group, version, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionClusterCustomObjectAsync(String group, String version, String plural, String pretty, String labelSelector, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionClusterCustomObjectValidateBeforeCall(group, version, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionClusterCustomObjectRequest {
        private final String group;
        private final String version;
        private final String plural;
        private String pretty;
        private String labelSelector;
        private Integer gracePeriodSeconds;
        private Boolean orphanDependents;
        private String propagationPolicy;
        private String dryRun;
        private V1DeleteOptions body;

        private APIdeleteCollectionClusterCustomObjectRequest(String group, String version, String plural) {
            this.group = group;
            this.version = version;
            this.plural = plural;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
         * @return APIdeleteCollectionClusterCustomObjectRequest
         */
        public APIdeleteCollectionClusterCustomObjectRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionClusterCustomObjectRequest
         */
        public APIdeleteCollectionClusterCustomObjectRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionClusterCustomObjectRequest
         */
        public APIdeleteCollectionClusterCustomObjectRequest gracePeriodSeconds(Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionClusterCustomObjectRequest
         */
        public APIdeleteCollectionClusterCustomObjectRequest orphanDependents(Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. (optional)
         * @return APIdeleteCollectionClusterCustomObjectRequest
         */
        public APIdeleteCollectionClusterCustomObjectRequest propagationPolicy(String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionClusterCustomObjectRequest
         */
        public APIdeleteCollectionClusterCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionClusterCustomObjectRequest
         */
        public APIdeleteCollectionClusterCustomObjectRequest body(V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionClusterCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteCollectionClusterCustomObjectCall(group, version, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        }

        /**
         * Execute deleteCollectionClusterCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = deleteCollectionClusterCustomObjectWithHttpInfo(group, version, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionClusterCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return deleteCollectionClusterCustomObjectWithHttpInfo(group, version, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body);
        }

        /**
         * Execute deleteCollectionClusterCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return deleteCollectionClusterCustomObjectAsync(group, version, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        }
    }

    /**
     *
     * Delete collection of cluster scoped custom objects
     * @param group The custom resource&#39;s group name (required)
     * @param version The custom resource&#39;s version (required)
     * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @return APIdeleteCollectionClusterCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionClusterCustomObjectRequest deleteCollectionClusterCustomObject(String group, String version, String plural) {
        return new APIdeleteCollectionClusterCustomObjectRequest(group, version, plural);
    }
    private okhttp3.Call deleteCollectionNamespacedCustomObjectCall(String group, String version, String namespace, String plural, String pretty, String labelSelector, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCollectionNamespacedCustomObjectValidateBeforeCall(String group, String version, String namespace, String plural, String pretty, String labelSelector, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling deleteCollectionNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling deleteCollectionNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteCollectionNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling deleteCollectionNamespacedCustomObject(Async)");
        }

        return deleteCollectionNamespacedCustomObjectCall(group, version, namespace, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);

    }


    private ApiResponse<Object> deleteCollectionNamespacedCustomObjectWithHttpInfo(String group, String version, String namespace, String plural, String pretty, String labelSelector, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionNamespacedCustomObjectAsync(String group, String version, String namespace, String plural, String pretty, String labelSelector, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionNamespacedCustomObjectRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private String pretty;
        private String labelSelector;
        private Integer gracePeriodSeconds;
        private Boolean orphanDependents;
        private String propagationPolicy;
        private String dryRun;
        private V1DeleteOptions body;

        private APIdeleteCollectionNamespacedCustomObjectRequest(String group, String version, String namespace, String plural) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
         * @return APIdeleteCollectionNamespacedCustomObjectRequest
         */
        public APIdeleteCollectionNamespacedCustomObjectRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedCustomObjectRequest
         */
        public APIdeleteCollectionNamespacedCustomObjectRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionNamespacedCustomObjectRequest
         */
        public APIdeleteCollectionNamespacedCustomObjectRequest gracePeriodSeconds(Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionNamespacedCustomObjectRequest
         */
        public APIdeleteCollectionNamespacedCustomObjectRequest orphanDependents(Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. (optional)
         * @return APIdeleteCollectionNamespacedCustomObjectRequest
         */
        public APIdeleteCollectionNamespacedCustomObjectRequest propagationPolicy(String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionNamespacedCustomObjectRequest
         */
        public APIdeleteCollectionNamespacedCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionNamespacedCustomObjectRequest
         */
        public APIdeleteCollectionNamespacedCustomObjectRequest body(V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionNamespacedCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteCollectionNamespacedCustomObjectCall(group, version, namespace, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        }

        /**
         * Execute deleteCollectionNamespacedCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = deleteCollectionNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionNamespacedCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return deleteCollectionNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body);
        }

        /**
         * Execute deleteCollectionNamespacedCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return deleteCollectionNamespacedCustomObjectAsync(group, version, namespace, plural, pretty, labelSelector, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        }
    }

    /**
     *
     * Delete collection of namespace scoped custom objects
     * @param group The custom resource&#39;s group name (required)
     * @param version The custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @return APIdeleteCollectionNamespacedCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionNamespacedCustomObjectRequest deleteCollectionNamespacedCustomObject(String group, String version, String namespace, String plural) {
        return new APIdeleteCollectionNamespacedCustomObjectRequest(group, version, namespace, plural);
    }
    private okhttp3.Call deleteNamespacedCustomObjectCall(String group, String version, String namespace, String plural, String name, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteNamespacedCustomObjectValidateBeforeCall(String group, String version, String namespace, String plural, String name, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling deleteNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling deleteNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling deleteNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedCustomObject(Async)");
        }

        return deleteNamespacedCustomObjectCall(group, version, namespace, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);

    }


    private ApiResponse<Object> deleteNamespacedCustomObjectWithHttpInfo(String group, String version, String namespace, String plural, String name, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteNamespacedCustomObjectAsync(String group, String version, String namespace, String plural, String name, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, String dryRun, V1DeleteOptions body, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteNamespacedCustomObjectRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;
        private Integer gracePeriodSeconds;
        private Boolean orphanDependents;
        private String propagationPolicy;
        private String dryRun;
        private V1DeleteOptions body;

        private APIdeleteNamespacedCustomObjectRequest(String group, String version, String namespace, String plural, String name) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteNamespacedCustomObjectRequest
         */
        public APIdeleteNamespacedCustomObjectRequest gracePeriodSeconds(Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteNamespacedCustomObjectRequest
         */
        public APIdeleteNamespacedCustomObjectRequest orphanDependents(Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. (optional)
         * @return APIdeleteNamespacedCustomObjectRequest
         */
        public APIdeleteNamespacedCustomObjectRequest propagationPolicy(String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteNamespacedCustomObjectRequest
         */
        public APIdeleteNamespacedCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteNamespacedCustomObjectRequest
         */
        public APIdeleteNamespacedCustomObjectRequest body(V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteNamespacedCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteNamespacedCustomObjectCall(group, version, namespace, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        }

        /**
         * Execute deleteNamespacedCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = deleteNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteNamespacedCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return deleteNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body);
        }

        /**
         * Execute deleteNamespacedCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return deleteNamespacedCustomObjectAsync(group, version, namespace, plural, name, gracePeriodSeconds, orphanDependents, propagationPolicy, dryRun, body, _callback);
        }
    }

    /**
     *
     * Deletes the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @return APIdeleteNamespacedCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteNamespacedCustomObjectRequest deleteNamespacedCustomObject(String group, String version, String namespace, String plural, String name) {
        return new APIdeleteNamespacedCustomObjectRequest(group, version, namespace, plural, name);
    }
    private okhttp3.Call getAPIResourcesCall(String group, String version, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()));

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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAPIResourcesValidateBeforeCall(String group, String version, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling getAPIResources(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getAPIResources(Async)");
        }

        return getAPIResourcesCall(group, version, _callback);

    }


    private ApiResponse<V1APIResourceList> getAPIResourcesWithHttpInfo(String group, String version) throws ApiException {
        okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(group, version, null);
        Type localVarReturnType = new TypeToken<V1APIResourceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAPIResourcesAsync(String group, String version, final ApiCallback<V1APIResourceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(group, version, _callback);
        Type localVarReturnType = new TypeToken<V1APIResourceList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetAPIResourcesRequest {
        private final String group;
        private final String version;

        private APIgetAPIResourcesRequest(String group, String version) {
            this.group = group;
            this.version = version;
        }

        /**
         * Build call for getAPIResources
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAPIResourcesCall(group, version, _callback);
        }

        /**
         * Execute getAPIResources request
         * @return V1APIResourceList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1APIResourceList execute() throws ApiException {
            ApiResponse<V1APIResourceList> localVarResp = getAPIResourcesWithHttpInfo(group, version);
            return localVarResp.getData();
        }

        /**
         * Execute getAPIResources request with HTTP info returned
         * @return ApiResponse&lt;V1APIResourceList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1APIResourceList> executeWithHttpInfo() throws ApiException {
            return getAPIResourcesWithHttpInfo(group, version);
        }

        /**
         * Execute getAPIResources request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1APIResourceList> _callback) throws ApiException {
            return getAPIResourcesAsync(group, version, _callback);
        }
    }

    /**
     *
     * get available resources
     * @param group The custom resource&#39;s group name (required)
     * @param version The custom resource&#39;s version (required)
     * @return APIgetAPIResourcesRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetAPIResourcesRequest getAPIResources(String group, String version) {
        return new APIgetAPIResourcesRequest(group, version);
    }
    private okhttp3.Call getClusterCustomObjectCall(String group, String version, String plural, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getClusterCustomObjectValidateBeforeCall(String group, String version, String plural, String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling getClusterCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getClusterCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling getClusterCustomObject(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getClusterCustomObject(Async)");
        }

        return getClusterCustomObjectCall(group, version, plural, name, _callback);

    }


    private ApiResponse<Object> getClusterCustomObjectWithHttpInfo(String group, String version, String plural, String name) throws ApiException {
        okhttp3.Call localVarCall = getClusterCustomObjectValidateBeforeCall(group, version, plural, name, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getClusterCustomObjectAsync(String group, String version, String plural, String name, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getClusterCustomObjectValidateBeforeCall(group, version, plural, name, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetClusterCustomObjectRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;

        private APIgetClusterCustomObjectRequest(String group, String version, String plural, String name) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
        }

        /**
         * Build call for getClusterCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getClusterCustomObjectCall(group, version, plural, name, _callback);
        }

        /**
         * Execute getClusterCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getClusterCustomObjectWithHttpInfo(group, version, plural, name);
            return localVarResp.getData();
        }

        /**
         * Execute getClusterCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getClusterCustomObjectWithHttpInfo(group, version, plural, name);
        }

        /**
         * Execute getClusterCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getClusterCustomObjectAsync(group, version, plural, name, _callback);
        }
    }

    /**
     *
     * Returns a cluster scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @return APIgetClusterCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetClusterCustomObjectRequest getClusterCustomObject(String group, String version, String plural, String name) {
        return new APIgetClusterCustomObjectRequest(group, version, plural, name);
    }
    private okhttp3.Call getClusterCustomObjectScaleCall(String group, String version, String plural, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}/scale"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getClusterCustomObjectScaleValidateBeforeCall(String group, String version, String plural, String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling getClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling getClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getClusterCustomObjectScale(Async)");
        }

        return getClusterCustomObjectScaleCall(group, version, plural, name, _callback);

    }


    private ApiResponse<Object> getClusterCustomObjectScaleWithHttpInfo(String group, String version, String plural, String name) throws ApiException {
        okhttp3.Call localVarCall = getClusterCustomObjectScaleValidateBeforeCall(group, version, plural, name, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getClusterCustomObjectScaleAsync(String group, String version, String plural, String name, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getClusterCustomObjectScaleValidateBeforeCall(group, version, plural, name, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetClusterCustomObjectScaleRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;

        private APIgetClusterCustomObjectScaleRequest(String group, String version, String plural, String name) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
        }

        /**
         * Build call for getClusterCustomObjectScale
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getClusterCustomObjectScaleCall(group, version, plural, name, _callback);
        }

        /**
         * Execute getClusterCustomObjectScale request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getClusterCustomObjectScaleWithHttpInfo(group, version, plural, name);
            return localVarResp.getData();
        }

        /**
         * Execute getClusterCustomObjectScale request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getClusterCustomObjectScaleWithHttpInfo(group, version, plural, name);
        }

        /**
         * Execute getClusterCustomObjectScale request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getClusterCustomObjectScaleAsync(group, version, plural, name, _callback);
        }
    }

    /**
     *
     * read scale of the specified custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @return APIgetClusterCustomObjectScaleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetClusterCustomObjectScaleRequest getClusterCustomObjectScale(String group, String version, String plural, String name) {
        return new APIgetClusterCustomObjectScaleRequest(group, version, plural, name);
    }
    private okhttp3.Call getClusterCustomObjectStatusCall(String group, String version, String plural, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}/status"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getClusterCustomObjectStatusValidateBeforeCall(String group, String version, String plural, String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling getClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling getClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getClusterCustomObjectStatus(Async)");
        }

        return getClusterCustomObjectStatusCall(group, version, plural, name, _callback);

    }


    private ApiResponse<Object> getClusterCustomObjectStatusWithHttpInfo(String group, String version, String plural, String name) throws ApiException {
        okhttp3.Call localVarCall = getClusterCustomObjectStatusValidateBeforeCall(group, version, plural, name, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getClusterCustomObjectStatusAsync(String group, String version, String plural, String name, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getClusterCustomObjectStatusValidateBeforeCall(group, version, plural, name, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetClusterCustomObjectStatusRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;

        private APIgetClusterCustomObjectStatusRequest(String group, String version, String plural, String name) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
        }

        /**
         * Build call for getClusterCustomObjectStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getClusterCustomObjectStatusCall(group, version, plural, name, _callback);
        }

        /**
         * Execute getClusterCustomObjectStatus request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getClusterCustomObjectStatusWithHttpInfo(group, version, plural, name);
            return localVarResp.getData();
        }

        /**
         * Execute getClusterCustomObjectStatus request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getClusterCustomObjectStatusWithHttpInfo(group, version, plural, name);
        }

        /**
         * Execute getClusterCustomObjectStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getClusterCustomObjectStatusAsync(group, version, plural, name, _callback);
        }
    }

    /**
     *
     * read status of the specified cluster scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @return APIgetClusterCustomObjectStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetClusterCustomObjectStatusRequest getClusterCustomObjectStatus(String group, String version, String plural, String name) {
        return new APIgetClusterCustomObjectStatusRequest(group, version, plural, name);
    }
    private okhttp3.Call getNamespacedCustomObjectCall(String group, String version, String namespace, String plural, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getNamespacedCustomObjectValidateBeforeCall(String group, String version, String namespace, String plural, String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling getNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling getNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNamespacedCustomObject(Async)");
        }

        return getNamespacedCustomObjectCall(group, version, namespace, plural, name, _callback);

    }


    private ApiResponse<Object> getNamespacedCustomObjectWithHttpInfo(String group, String version, String namespace, String plural, String name) throws ApiException {
        okhttp3.Call localVarCall = getNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getNamespacedCustomObjectAsync(String group, String version, String namespace, String plural, String name, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetNamespacedCustomObjectRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;

        private APIgetNamespacedCustomObjectRequest(String group, String version, String namespace, String plural, String name) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
        }

        /**
         * Build call for getNamespacedCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getNamespacedCustomObjectCall(group, version, namespace, plural, name, _callback);
        }

        /**
         * Execute getNamespacedCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name);
            return localVarResp.getData();
        }

        /**
         * Execute getNamespacedCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name);
        }

        /**
         * Execute getNamespacedCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getNamespacedCustomObjectAsync(group, version, namespace, plural, name, _callback);
        }
    }

    /**
     *
     * Returns a namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @return APIgetNamespacedCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetNamespacedCustomObjectRequest getNamespacedCustomObject(String group, String version, String namespace, String plural, String name) {
        return new APIgetNamespacedCustomObjectRequest(group, version, namespace, plural, name);
    }
    private okhttp3.Call getNamespacedCustomObjectScaleCall(String group, String version, String namespace, String plural, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getNamespacedCustomObjectScaleValidateBeforeCall(String group, String version, String namespace, String plural, String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling getNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling getNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNamespacedCustomObjectScale(Async)");
        }

        return getNamespacedCustomObjectScaleCall(group, version, namespace, plural, name, _callback);

    }


    private ApiResponse<Object> getNamespacedCustomObjectScaleWithHttpInfo(String group, String version, String namespace, String plural, String name) throws ApiException {
        okhttp3.Call localVarCall = getNamespacedCustomObjectScaleValidateBeforeCall(group, version, namespace, plural, name, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getNamespacedCustomObjectScaleAsync(String group, String version, String namespace, String plural, String name, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNamespacedCustomObjectScaleValidateBeforeCall(group, version, namespace, plural, name, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetNamespacedCustomObjectScaleRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;

        private APIgetNamespacedCustomObjectScaleRequest(String group, String version, String namespace, String plural, String name) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
        }

        /**
         * Build call for getNamespacedCustomObjectScale
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getNamespacedCustomObjectScaleCall(group, version, namespace, plural, name, _callback);
        }

        /**
         * Execute getNamespacedCustomObjectScale request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getNamespacedCustomObjectScaleWithHttpInfo(group, version, namespace, plural, name);
            return localVarResp.getData();
        }

        /**
         * Execute getNamespacedCustomObjectScale request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getNamespacedCustomObjectScaleWithHttpInfo(group, version, namespace, plural, name);
        }

        /**
         * Execute getNamespacedCustomObjectScale request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getNamespacedCustomObjectScaleAsync(group, version, namespace, plural, name, _callback);
        }
    }

    /**
     *
     * read scale of the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @return APIgetNamespacedCustomObjectScaleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetNamespacedCustomObjectScaleRequest getNamespacedCustomObjectScale(String group, String version, String namespace, String plural, String name) {
        return new APIgetNamespacedCustomObjectScaleRequest(group, version, namespace, plural, name);
    }
    private okhttp3.Call getNamespacedCustomObjectStatusCall(String group, String version, String namespace, String plural, String name, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getNamespacedCustomObjectStatusValidateBeforeCall(String group, String version, String namespace, String plural, String name, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling getNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling getNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getNamespacedCustomObjectStatus(Async)");
        }

        return getNamespacedCustomObjectStatusCall(group, version, namespace, plural, name, _callback);

    }


    private ApiResponse<Object> getNamespacedCustomObjectStatusWithHttpInfo(String group, String version, String namespace, String plural, String name) throws ApiException {
        okhttp3.Call localVarCall = getNamespacedCustomObjectStatusValidateBeforeCall(group, version, namespace, plural, name, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getNamespacedCustomObjectStatusAsync(String group, String version, String namespace, String plural, String name, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNamespacedCustomObjectStatusValidateBeforeCall(group, version, namespace, plural, name, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetNamespacedCustomObjectStatusRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;

        private APIgetNamespacedCustomObjectStatusRequest(String group, String version, String namespace, String plural, String name) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
        }

        /**
         * Build call for getNamespacedCustomObjectStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getNamespacedCustomObjectStatusCall(group, version, namespace, plural, name, _callback);
        }

        /**
         * Execute getNamespacedCustomObjectStatus request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getNamespacedCustomObjectStatusWithHttpInfo(group, version, namespace, plural, name);
            return localVarResp.getData();
        }

        /**
         * Execute getNamespacedCustomObjectStatus request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getNamespacedCustomObjectStatusWithHttpInfo(group, version, namespace, plural, name);
        }

        /**
         * Execute getNamespacedCustomObjectStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getNamespacedCustomObjectStatusAsync(group, version, namespace, plural, name, _callback);
        }
    }

    /**
     *
     * read status of the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @return APIgetNamespacedCustomObjectStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetNamespacedCustomObjectStatusRequest getNamespacedCustomObjectStatus(String group, String version, String namespace, String plural, String name) {
        return new APIgetNamespacedCustomObjectStatusRequest(group, version, namespace, plural, name);
    }
    private okhttp3.Call listClusterCustomObjectCall(String group, String version, String plural, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}/{plural}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (allowWatchBookmarks != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
        }

        if (_continue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/json;stream=watch"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listClusterCustomObjectValidateBeforeCall(String group, String version, String plural, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling listClusterCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling listClusterCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling listClusterCustomObject(Async)");
        }

        return listClusterCustomObjectCall(group, version, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<Object> listClusterCustomObjectWithHttpInfo(String group, String version, String plural, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listClusterCustomObjectValidateBeforeCall(group, version, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listClusterCustomObjectAsync(String group, String version, String plural, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = listClusterCustomObjectValidateBeforeCall(group, version, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistClusterCustomObjectRequest {
        private final String group;
        private final String version;
        private final String plural;
        private String pretty;
        private Boolean allowWatchBookmarks;
        private String _continue;
        private String fieldSelector;
        private String labelSelector;
        private Integer limit;
        private String resourceVersion;
        private String resourceVersionMatch;
        private Integer timeoutSeconds;
        private Boolean watch;

        private APIlistClusterCustomObjectRequest(String group, String version, String plural) {
            this.group = group;
            this.version = version;
            this.plural = plural;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest allowWatchBookmarks(Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest fieldSelector(String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest resourceVersionMatch(String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. (optional)
         * @return APIlistClusterCustomObjectRequest
         */
        public APIlistClusterCustomObjectRequest watch(Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listClusterCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listClusterCustomObjectCall(group, version, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listClusterCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = listClusterCustomObjectWithHttpInfo(group, version, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listClusterCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return listClusterCustomObjectWithHttpInfo(group, version, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch);
        }

        /**
         * Execute listClusterCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return listClusterCustomObjectAsync(group, version, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch cluster scoped custom objects
     * @param group The custom resource&#39;s group name (required)
     * @param version The custom resource&#39;s version (required)
     * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @return APIlistClusterCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistClusterCustomObjectRequest listClusterCustomObject(String group, String version, String plural) {
        return new APIlistClusterCustomObjectRequest(group, version, plural);
    }
    private okhttp3.Call listNamespacedCustomObjectCall(String group, String version, String namespace, String plural, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (allowWatchBookmarks != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
        }

        if (_continue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/json;stream=watch"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listNamespacedCustomObjectValidateBeforeCall(String group, String version, String namespace, String plural, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling listNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling listNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling listNamespacedCustomObject(Async)");
        }

        return listNamespacedCustomObjectCall(group, version, namespace, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<Object> listNamespacedCustomObjectWithHttpInfo(String group, String version, String namespace, String plural, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listNamespacedCustomObjectAsync(String group, String version, String namespace, String plural, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Integer timeoutSeconds, Boolean watch, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = listNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistNamespacedCustomObjectRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private String pretty;
        private Boolean allowWatchBookmarks;
        private String _continue;
        private String fieldSelector;
        private String labelSelector;
        private Integer limit;
        private String resourceVersion;
        private String resourceVersionMatch;
        private Integer timeoutSeconds;
        private Boolean watch;

        private APIlistNamespacedCustomObjectRequest(String group, String version, String namespace, String plural) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. If the feature gate WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest allowWatchBookmarks(Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest fieldSelector(String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion When specified with a watch call, shows changes that occur after that particular version of a resource. Defaults to changes from the beginning of history. When specified for list: - if unset, then the result is returned from remote storage based on quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache, no guarantee; - if set to non zero, then the result is at least as fresh as given rv. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest resourceVersionMatch(String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. (optional)
         * @return APIlistNamespacedCustomObjectRequest
         */
        public APIlistNamespacedCustomObjectRequest watch(Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listNamespacedCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listNamespacedCustomObjectCall(group, version, namespace, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listNamespacedCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = listNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listNamespacedCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return listNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch);
        }

        /**
         * Execute listNamespacedCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return listNamespacedCustomObjectAsync(group, version, namespace, plural, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch namespace scoped custom objects
     * @param group The custom resource&#39;s group name (required)
     * @param version The custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @return APIlistNamespacedCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistNamespacedCustomObjectRequest listNamespacedCustomObject(String group, String version, String namespace, String plural) {
        return new APIlistNamespacedCustomObjectRequest(group, version, namespace, plural);
    }
    private okhttp3.Call patchClusterCustomObjectCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchClusterCustomObjectValidateBeforeCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling patchClusterCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling patchClusterCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling patchClusterCustomObject(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchClusterCustomObject(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchClusterCustomObject(Async)");
        }

        return patchClusterCustomObjectCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<Object> patchClusterCustomObjectWithHttpInfo(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchClusterCustomObjectValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchClusterCustomObjectAsync(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchClusterCustomObjectValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchClusterCustomObjectRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchClusterCustomObjectRequest(String group, String version, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchClusterCustomObjectRequest
         */
        public APIpatchClusterCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchClusterCustomObjectRequest
         */
        public APIpatchClusterCustomObjectRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIpatchClusterCustomObjectRequest
         */
        public APIpatchClusterCustomObjectRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchClusterCustomObjectRequest
         */
        public APIpatchClusterCustomObjectRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchClusterCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchClusterCustomObjectCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchClusterCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = patchClusterCustomObjectWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchClusterCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return patchClusterCustomObjectWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchClusterCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return patchClusterCustomObjectAsync(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * patch the specified cluster scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body The JSON schema of the Resource to patch. (required)
     * @return APIpatchClusterCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchClusterCustomObjectRequest patchClusterCustomObject(String group, String version, String plural, String name, Object body) {
        return new APIpatchClusterCustomObjectRequest(group, version, plural, name, body);
    }
    private okhttp3.Call patchClusterCustomObjectScaleCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}/scale"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchClusterCustomObjectScaleValidateBeforeCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling patchClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling patchClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling patchClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchClusterCustomObjectScale(Async)");
        }

        return patchClusterCustomObjectScaleCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<Object> patchClusterCustomObjectScaleWithHttpInfo(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchClusterCustomObjectScaleValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchClusterCustomObjectScaleAsync(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchClusterCustomObjectScaleValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchClusterCustomObjectScaleRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchClusterCustomObjectScaleRequest(String group, String version, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchClusterCustomObjectScaleRequest
         */
        public APIpatchClusterCustomObjectScaleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchClusterCustomObjectScaleRequest
         */
        public APIpatchClusterCustomObjectScaleRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIpatchClusterCustomObjectScaleRequest
         */
        public APIpatchClusterCustomObjectScaleRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchClusterCustomObjectScaleRequest
         */
        public APIpatchClusterCustomObjectScaleRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchClusterCustomObjectScale
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchClusterCustomObjectScaleCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchClusterCustomObjectScale request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = patchClusterCustomObjectScaleWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchClusterCustomObjectScale request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return patchClusterCustomObjectScaleWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchClusterCustomObjectScale request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return patchClusterCustomObjectScaleAsync(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update scale of the specified cluster scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body  (required)
     * @return APIpatchClusterCustomObjectScaleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchClusterCustomObjectScaleRequest patchClusterCustomObjectScale(String group, String version, String plural, String name, Object body) {
        return new APIpatchClusterCustomObjectScaleRequest(group, version, plural, name, body);
    }
    private okhttp3.Call patchClusterCustomObjectStatusCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}/status"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchClusterCustomObjectStatusValidateBeforeCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling patchClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling patchClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling patchClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchClusterCustomObjectStatus(Async)");
        }

        return patchClusterCustomObjectStatusCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<Object> patchClusterCustomObjectStatusWithHttpInfo(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchClusterCustomObjectStatusValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchClusterCustomObjectStatusAsync(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchClusterCustomObjectStatusValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchClusterCustomObjectStatusRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchClusterCustomObjectStatusRequest(String group, String version, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchClusterCustomObjectStatusRequest
         */
        public APIpatchClusterCustomObjectStatusRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchClusterCustomObjectStatusRequest
         */
        public APIpatchClusterCustomObjectStatusRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIpatchClusterCustomObjectStatusRequest
         */
        public APIpatchClusterCustomObjectStatusRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchClusterCustomObjectStatusRequest
         */
        public APIpatchClusterCustomObjectStatusRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchClusterCustomObjectStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchClusterCustomObjectStatusCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchClusterCustomObjectStatus request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = patchClusterCustomObjectStatusWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchClusterCustomObjectStatus request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return patchClusterCustomObjectStatusWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchClusterCustomObjectStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return patchClusterCustomObjectStatusAsync(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update status of the specified cluster scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body  (required)
     * @return APIpatchClusterCustomObjectStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchClusterCustomObjectStatusRequest patchClusterCustomObjectStatus(String group, String version, String plural, String name, Object body) {
        return new APIpatchClusterCustomObjectStatusRequest(group, version, plural, name, body);
    }
    private okhttp3.Call patchNamespacedCustomObjectCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchNamespacedCustomObjectValidateBeforeCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling patchNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling patchNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling patchNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedCustomObject(Async)");
        }

        return patchNamespacedCustomObjectCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<Object> patchNamespacedCustomObjectWithHttpInfo(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedCustomObjectAsync(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedCustomObjectRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchNamespacedCustomObjectRequest(String group, String version, String namespace, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedCustomObjectRequest
         */
        public APIpatchNamespacedCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedCustomObjectRequest
         */
        public APIpatchNamespacedCustomObjectRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIpatchNamespacedCustomObjectRequest
         */
        public APIpatchNamespacedCustomObjectRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedCustomObjectRequest
         */
        public APIpatchNamespacedCustomObjectRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchNamespacedCustomObjectCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = patchNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return patchNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return patchNamespacedCustomObjectAsync(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * patch the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body The JSON schema of the Resource to patch. (required)
     * @return APIpatchNamespacedCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedCustomObjectRequest patchNamespacedCustomObject(String group, String version, String namespace, String plural, String name, Object body) {
        return new APIpatchNamespacedCustomObjectRequest(group, version, namespace, plural, name, body);
    }
    private okhttp3.Call patchNamespacedCustomObjectScaleCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchNamespacedCustomObjectScaleValidateBeforeCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling patchNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling patchNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling patchNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedCustomObjectScale(Async)");
        }

        return patchNamespacedCustomObjectScaleCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<Object> patchNamespacedCustomObjectScaleWithHttpInfo(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedCustomObjectScaleValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedCustomObjectScaleAsync(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedCustomObjectScaleValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedCustomObjectScaleRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchNamespacedCustomObjectScaleRequest(String group, String version, String namespace, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedCustomObjectScaleRequest
         */
        public APIpatchNamespacedCustomObjectScaleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedCustomObjectScaleRequest
         */
        public APIpatchNamespacedCustomObjectScaleRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIpatchNamespacedCustomObjectScaleRequest
         */
        public APIpatchNamespacedCustomObjectScaleRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedCustomObjectScaleRequest
         */
        public APIpatchNamespacedCustomObjectScaleRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedCustomObjectScale
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchNamespacedCustomObjectScaleCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedCustomObjectScale request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = patchNamespacedCustomObjectScaleWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedCustomObjectScale request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return patchNamespacedCustomObjectScaleWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedCustomObjectScale request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return patchNamespacedCustomObjectScaleAsync(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update scale of the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body  (required)
     * @return APIpatchNamespacedCustomObjectScaleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedCustomObjectScaleRequest patchNamespacedCustomObjectScale(String group, String version, String namespace, String plural, String name, Object body) {
        return new APIpatchNamespacedCustomObjectScaleRequest(group, version, namespace, plural, name, body);
    }
    private okhttp3.Call patchNamespacedCustomObjectStatusCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchNamespacedCustomObjectStatusValidateBeforeCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling patchNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling patchNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling patchNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedCustomObjectStatus(Async)");
        }

        return patchNamespacedCustomObjectStatusCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<Object> patchNamespacedCustomObjectStatusWithHttpInfo(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedCustomObjectStatusValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedCustomObjectStatusAsync(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedCustomObjectStatusValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedCustomObjectStatusRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchNamespacedCustomObjectStatusRequest(String group, String version, String namespace, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedCustomObjectStatusRequest
         */
        public APIpatchNamespacedCustomObjectStatusRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedCustomObjectStatusRequest
         */
        public APIpatchNamespacedCustomObjectStatusRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIpatchNamespacedCustomObjectStatusRequest
         */
        public APIpatchNamespacedCustomObjectStatusRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedCustomObjectStatusRequest
         */
        public APIpatchNamespacedCustomObjectStatusRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedCustomObjectStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchNamespacedCustomObjectStatusCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedCustomObjectStatus request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = patchNamespacedCustomObjectStatusWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedCustomObjectStatus request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return patchNamespacedCustomObjectStatusWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedCustomObjectStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return patchNamespacedCustomObjectStatusAsync(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update status of the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body  (required)
     * @return APIpatchNamespacedCustomObjectStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedCustomObjectStatusRequest patchNamespacedCustomObjectStatus(String group, String version, String namespace, String plural, String name, Object body) {
        return new APIpatchNamespacedCustomObjectStatusRequest(group, version, namespace, plural, name, body);
    }
    private okhttp3.Call replaceClusterCustomObjectCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceClusterCustomObjectValidateBeforeCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling replaceClusterCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling replaceClusterCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling replaceClusterCustomObject(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceClusterCustomObject(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceClusterCustomObject(Async)");
        }

        return replaceClusterCustomObjectCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<Object> replaceClusterCustomObjectWithHttpInfo(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceClusterCustomObjectValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceClusterCustomObjectAsync(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceClusterCustomObjectValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceClusterCustomObjectRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceClusterCustomObjectRequest(String group, String version, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceClusterCustomObjectRequest
         */
        public APIreplaceClusterCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceClusterCustomObjectRequest
         */
        public APIreplaceClusterCustomObjectRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIreplaceClusterCustomObjectRequest
         */
        public APIreplaceClusterCustomObjectRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceClusterCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceClusterCustomObjectCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceClusterCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = replaceClusterCustomObjectWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceClusterCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return replaceClusterCustomObjectWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceClusterCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return replaceClusterCustomObjectAsync(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified cluster scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body The JSON schema of the Resource to replace. (required)
     * @return APIreplaceClusterCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceClusterCustomObjectRequest replaceClusterCustomObject(String group, String version, String plural, String name, Object body) {
        return new APIreplaceClusterCustomObjectRequest(group, version, plural, name, body);
    }
    private okhttp3.Call replaceClusterCustomObjectScaleCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}/scale"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceClusterCustomObjectScaleValidateBeforeCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling replaceClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling replaceClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling replaceClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceClusterCustomObjectScale(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceClusterCustomObjectScale(Async)");
        }

        return replaceClusterCustomObjectScaleCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<Object> replaceClusterCustomObjectScaleWithHttpInfo(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceClusterCustomObjectScaleValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceClusterCustomObjectScaleAsync(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceClusterCustomObjectScaleValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceClusterCustomObjectScaleRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceClusterCustomObjectScaleRequest(String group, String version, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceClusterCustomObjectScaleRequest
         */
        public APIreplaceClusterCustomObjectScaleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceClusterCustomObjectScaleRequest
         */
        public APIreplaceClusterCustomObjectScaleRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIreplaceClusterCustomObjectScaleRequest
         */
        public APIreplaceClusterCustomObjectScaleRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceClusterCustomObjectScale
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceClusterCustomObjectScaleCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceClusterCustomObjectScale request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = replaceClusterCustomObjectScaleWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceClusterCustomObjectScale request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return replaceClusterCustomObjectScaleWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceClusterCustomObjectScale request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return replaceClusterCustomObjectScaleAsync(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace scale of the specified cluster scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body  (required)
     * @return APIreplaceClusterCustomObjectScaleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceClusterCustomObjectScaleRequest replaceClusterCustomObjectScale(String group, String version, String plural, String name, Object body) {
        return new APIreplaceClusterCustomObjectScaleRequest(group, version, plural, name, body);
    }
    private okhttp3.Call replaceClusterCustomObjectStatusCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/{plural}/{name}/status"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceClusterCustomObjectStatusValidateBeforeCall(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling replaceClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling replaceClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling replaceClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceClusterCustomObjectStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceClusterCustomObjectStatus(Async)");
        }

        return replaceClusterCustomObjectStatusCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<Object> replaceClusterCustomObjectStatusWithHttpInfo(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceClusterCustomObjectStatusValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceClusterCustomObjectStatusAsync(String group, String version, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceClusterCustomObjectStatusValidateBeforeCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceClusterCustomObjectStatusRequest {
        private final String group;
        private final String version;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceClusterCustomObjectStatusRequest(String group, String version, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceClusterCustomObjectStatusRequest
         */
        public APIreplaceClusterCustomObjectStatusRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceClusterCustomObjectStatusRequest
         */
        public APIreplaceClusterCustomObjectStatusRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIreplaceClusterCustomObjectStatusRequest
         */
        public APIreplaceClusterCustomObjectStatusRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceClusterCustomObjectStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceClusterCustomObjectStatusCall(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceClusterCustomObjectStatus request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = replaceClusterCustomObjectStatusWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceClusterCustomObjectStatus request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return replaceClusterCustomObjectStatusWithHttpInfo(group, version, plural, name, body, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceClusterCustomObjectStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return replaceClusterCustomObjectStatusAsync(group, version, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace status of the cluster scoped specified custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body  (required)
     * @return APIreplaceClusterCustomObjectStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceClusterCustomObjectStatusRequest replaceClusterCustomObjectStatus(String group, String version, String plural, String name, Object body) {
        return new APIreplaceClusterCustomObjectStatusRequest(group, version, plural, name, body);
    }
    private okhttp3.Call replaceNamespacedCustomObjectCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceNamespacedCustomObjectValidateBeforeCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling replaceNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling replaceNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling replaceNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedCustomObject(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedCustomObject(Async)");
        }

        return replaceNamespacedCustomObjectCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<Object> replaceNamespacedCustomObjectWithHttpInfo(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedCustomObjectAsync(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedCustomObjectRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceNamespacedCustomObjectRequest(String group, String version, String namespace, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedCustomObjectRequest
         */
        public APIreplaceNamespacedCustomObjectRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedCustomObjectRequest
         */
        public APIreplaceNamespacedCustomObjectRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIreplaceNamespacedCustomObjectRequest
         */
        public APIreplaceNamespacedCustomObjectRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedCustomObject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceNamespacedCustomObjectCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedCustomObject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = replaceNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedCustomObject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedCustomObject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return replaceNamespacedCustomObjectAsync(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body The JSON schema of the Resource to replace. (required)
     * @return APIreplaceNamespacedCustomObjectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedCustomObjectRequest replaceNamespacedCustomObject(String group, String version, String namespace, String plural, String name, Object body) {
        return new APIreplaceNamespacedCustomObjectRequest(group, version, namespace, plural, name, body);
    }
    private okhttp3.Call replaceNamespacedCustomObjectScaleCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceNamespacedCustomObjectScaleValidateBeforeCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling replaceNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling replaceNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling replaceNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedCustomObjectScale(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedCustomObjectScale(Async)");
        }

        return replaceNamespacedCustomObjectScaleCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<Object> replaceNamespacedCustomObjectScaleWithHttpInfo(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedCustomObjectScaleValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedCustomObjectScaleAsync(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedCustomObjectScaleValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedCustomObjectScaleRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceNamespacedCustomObjectScaleRequest(String group, String version, String namespace, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedCustomObjectScaleRequest
         */
        public APIreplaceNamespacedCustomObjectScaleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedCustomObjectScaleRequest
         */
        public APIreplaceNamespacedCustomObjectScaleRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIreplaceNamespacedCustomObjectScaleRequest
         */
        public APIreplaceNamespacedCustomObjectScaleRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedCustomObjectScale
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceNamespacedCustomObjectScaleCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedCustomObjectScale request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = replaceNamespacedCustomObjectScaleWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedCustomObjectScale request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedCustomObjectScaleWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedCustomObjectScale request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return replaceNamespacedCustomObjectScaleAsync(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace scale of the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body  (required)
     * @return APIreplaceNamespacedCustomObjectScaleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedCustomObjectScaleRequest replaceNamespacedCustomObjectScale(String group, String version, String namespace, String plural, String name, Object body) {
        return new APIreplaceNamespacedCustomObjectScaleRequest(group, version, namespace, plural, name, body);
    }
    private okhttp3.Call replaceNamespacedCustomObjectStatusCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status"
            .replace("{" + "group" + "}", localVarApiClient.escapeString(group.toString()))
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()))
            .replace("{" + "plural" + "}", localVarApiClient.escapeString(plural.toString()))
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldManager != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
        }

        if (fieldValidation != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf"
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

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceNamespacedCustomObjectStatusValidateBeforeCall(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'group' is set
        if (group == null) {
            throw new ApiException("Missing the required parameter 'group' when calling replaceNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling replaceNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'plural' is set
        if (plural == null) {
            throw new ApiException("Missing the required parameter 'plural' when calling replaceNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedCustomObjectStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedCustomObjectStatus(Async)");
        }

        return replaceNamespacedCustomObjectStatusCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<Object> replaceNamespacedCustomObjectStatusWithHttpInfo(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedCustomObjectStatusValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedCustomObjectStatusAsync(String group, String version, String namespace, String plural, String name, Object body, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedCustomObjectStatusValidateBeforeCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedCustomObjectStatusRequest {
        private final String group;
        private final String version;
        private final String namespace;
        private final String plural;
        private final String name;
        private final Object body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceNamespacedCustomObjectStatusRequest(String group, String version, String namespace, String plural, String name, Object body) {
            this.group = group;
            this.version = version;
            this.namespace = namespace;
            this.plural = plural;
            this.name = name;
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedCustomObjectStatusRequest
         */
        public APIreplaceNamespacedCustomObjectStatusRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedCustomObjectStatusRequest
         */
        public APIreplaceNamespacedCustomObjectStatusRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional) (optional)
         * @return APIreplaceNamespacedCustomObjectStatusRequest
         */
        public APIreplaceNamespacedCustomObjectStatusRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedCustomObjectStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceNamespacedCustomObjectStatusCall(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedCustomObjectStatus request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = replaceNamespacedCustomObjectStatusWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedCustomObjectStatus request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedCustomObjectStatusWithHttpInfo(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedCustomObjectStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return replaceNamespacedCustomObjectStatusAsync(group, version, namespace, plural, name, body, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace status of the specified namespace scoped custom object
     * @param group the custom resource&#39;s group (required)
     * @param version the custom resource&#39;s version (required)
     * @param namespace The custom resource&#39;s namespace (required)
     * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural kind. (required)
     * @param name the custom object&#39;s name (required)
     * @param body  (required)
     * @return APIreplaceNamespacedCustomObjectStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedCustomObjectStatusRequest replaceNamespacedCustomObjectStatus(String group, String version, String namespace, String plural, String name, Object body) {
        return new APIreplaceNamespacedCustomObjectStatusRequest(group, version, namespace, plural, name, body);
    }
}
