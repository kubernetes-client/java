/*
Copyright 2025 The Kubernetes Authors.
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
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.V1beta2DeviceClass;
import io.kubernetes.client.openapi.models.V1beta2DeviceClassList;
import io.kubernetes.client.openapi.models.V1beta2ResourceClaim;
import io.kubernetes.client.openapi.models.V1beta2ResourceClaimList;
import io.kubernetes.client.openapi.models.V1beta2ResourceClaimTemplate;
import io.kubernetes.client.openapi.models.V1beta2ResourceClaimTemplateList;
import io.kubernetes.client.openapi.models.V1beta2ResourceSlice;
import io.kubernetes.client.openapi.models.V1beta2ResourceSliceList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceV1beta2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ResourceV1beta2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ResourceV1beta2Api(ApiClient apiClient) {
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

    private okhttp3.Call createDeviceClassCall(@jakarta.annotation.Nonnull V1beta2DeviceClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/deviceclasses";

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call createDeviceClassValidateBeforeCall(@jakarta.annotation.Nonnull V1beta2DeviceClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createDeviceClass(Async)");
        }

        return createDeviceClassCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2DeviceClass> createDeviceClassWithHttpInfo(@jakarta.annotation.Nonnull V1beta2DeviceClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createDeviceClassValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createDeviceClassAsync(@jakarta.annotation.Nonnull V1beta2DeviceClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = createDeviceClassValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateDeviceClassRequest {
        @jakarta.annotation.Nonnull
        private final V1beta2DeviceClass body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIcreateDeviceClassRequest(@jakarta.annotation.Nonnull V1beta2DeviceClass body) {
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateDeviceClassRequest
         */
        public APIcreateDeviceClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateDeviceClassRequest
         */
        public APIcreateDeviceClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateDeviceClassRequest
         */
        public APIcreateDeviceClassRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateDeviceClassRequest
         */
        public APIcreateDeviceClassRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createDeviceClass
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createDeviceClassCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createDeviceClass request
         * @return V1beta2DeviceClass
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2DeviceClass execute() throws ApiException {
            ApiResponse<V1beta2DeviceClass> localVarResp = createDeviceClassWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createDeviceClass request with HTTP info returned
         * @return ApiResponse&lt;V1beta2DeviceClass&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2DeviceClass> executeWithHttpInfo() throws ApiException {
            return createDeviceClassWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createDeviceClass request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {
            return createDeviceClassAsync(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * create a DeviceClass
     * @param body  (required)
     * @return APIcreateDeviceClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateDeviceClassRequest createDeviceClass(@jakarta.annotation.Nonnull V1beta2DeviceClass body) {
        return new APIcreateDeviceClassRequest(body);
    }
    private okhttp3.Call createNamespacedResourceClaimCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call createNamespacedResourceClaimValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedResourceClaim(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedResourceClaim(Async)");
        }

        return createNamespacedResourceClaimCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2ResourceClaim> createNamespacedResourceClaimWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createNamespacedResourceClaimValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNamespacedResourceClaimAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNamespacedResourceClaimValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateNamespacedResourceClaimRequest {
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1beta2ResourceClaim body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIcreateNamespacedResourceClaimRequest(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body) {
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateNamespacedResourceClaimRequest
         */
        public APIcreateNamespacedResourceClaimRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateNamespacedResourceClaimRequest
         */
        public APIcreateNamespacedResourceClaimRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateNamespacedResourceClaimRequest
         */
        public APIcreateNamespacedResourceClaimRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateNamespacedResourceClaimRequest
         */
        public APIcreateNamespacedResourceClaimRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createNamespacedResourceClaim
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createNamespacedResourceClaimCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createNamespacedResourceClaim request
         * @return V1beta2ResourceClaim
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaim execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaim> localVarResp = createNamespacedResourceClaimWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createNamespacedResourceClaim request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaim&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaim> executeWithHttpInfo() throws ApiException {
            return createNamespacedResourceClaimWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createNamespacedResourceClaim request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {
            return createNamespacedResourceClaimAsync(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * create a ResourceClaim
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIcreateNamespacedResourceClaimRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateNamespacedResourceClaimRequest createNamespacedResourceClaim(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body) {
        return new APIcreateNamespacedResourceClaimRequest(namespace, body);
    }
    private okhttp3.Call createNamespacedResourceClaimTemplateCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaimtemplates"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call createNamespacedResourceClaimTemplateValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedResourceClaimTemplate(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedResourceClaimTemplate(Async)");
        }

        return createNamespacedResourceClaimTemplateCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimTemplate> createNamespacedResourceClaimTemplateWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createNamespacedResourceClaimTemplateValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNamespacedResourceClaimTemplateAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNamespacedResourceClaimTemplateValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateNamespacedResourceClaimTemplateRequest {
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1beta2ResourceClaimTemplate body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIcreateNamespacedResourceClaimTemplateRequest(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body) {
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateNamespacedResourceClaimTemplateRequest
         */
        public APIcreateNamespacedResourceClaimTemplateRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateNamespacedResourceClaimTemplateRequest
         */
        public APIcreateNamespacedResourceClaimTemplateRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateNamespacedResourceClaimTemplateRequest
         */
        public APIcreateNamespacedResourceClaimTemplateRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateNamespacedResourceClaimTemplateRequest
         */
        public APIcreateNamespacedResourceClaimTemplateRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createNamespacedResourceClaimTemplate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createNamespacedResourceClaimTemplateCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createNamespacedResourceClaimTemplate request
         * @return V1beta2ResourceClaimTemplate
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimTemplate execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimTemplate> localVarResp = createNamespacedResourceClaimTemplateWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createNamespacedResourceClaimTemplate request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimTemplate&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimTemplate> executeWithHttpInfo() throws ApiException {
            return createNamespacedResourceClaimTemplateWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createNamespacedResourceClaimTemplate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {
            return createNamespacedResourceClaimTemplateAsync(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * create a ResourceClaimTemplate
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIcreateNamespacedResourceClaimTemplateRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateNamespacedResourceClaimTemplateRequest createNamespacedResourceClaimTemplate(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body) {
        return new APIcreateNamespacedResourceClaimTemplateRequest(namespace, body);
    }
    private okhttp3.Call createResourceSliceCall(@jakarta.annotation.Nonnull V1beta2ResourceSlice body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceslices";

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call createResourceSliceValidateBeforeCall(@jakarta.annotation.Nonnull V1beta2ResourceSlice body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createResourceSlice(Async)");
        }

        return createResourceSliceCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2ResourceSlice> createResourceSliceWithHttpInfo(@jakarta.annotation.Nonnull V1beta2ResourceSlice body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createResourceSliceValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createResourceSliceAsync(@jakarta.annotation.Nonnull V1beta2ResourceSlice body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {

        okhttp3.Call localVarCall = createResourceSliceValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateResourceSliceRequest {
        @jakarta.annotation.Nonnull
        private final V1beta2ResourceSlice body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIcreateResourceSliceRequest(@jakarta.annotation.Nonnull V1beta2ResourceSlice body) {
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateResourceSliceRequest
         */
        public APIcreateResourceSliceRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateResourceSliceRequest
         */
        public APIcreateResourceSliceRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateResourceSliceRequest
         */
        public APIcreateResourceSliceRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateResourceSliceRequest
         */
        public APIcreateResourceSliceRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createResourceSlice
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createResourceSliceCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createResourceSlice request
         * @return V1beta2ResourceSlice
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceSlice execute() throws ApiException {
            ApiResponse<V1beta2ResourceSlice> localVarResp = createResourceSliceWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createResourceSlice request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceSlice&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceSlice> executeWithHttpInfo() throws ApiException {
            return createResourceSliceWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createResourceSlice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {
            return createResourceSliceAsync(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * create a ResourceSlice
     * @param body  (required)
     * @return APIcreateResourceSliceRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateResourceSliceRequest createResourceSlice(@jakarta.annotation.Nonnull V1beta2ResourceSlice body) {
        return new APIcreateResourceSliceRequest(body);
    }
    private okhttp3.Call deleteCollectionDeviceClassCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/deviceclasses";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (_continue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (ignoreStoreReadErrorWithClusterBreakingPotential != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ignoreStoreReadErrorWithClusterBreakingPotential", ignoreStoreReadErrorWithClusterBreakingPotential));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call deleteCollectionDeviceClassValidateBeforeCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        return deleteCollectionDeviceClassCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);

    }


    private ApiResponse<V1Status> deleteCollectionDeviceClassWithHttpInfo(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionDeviceClassValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionDeviceClassAsync(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionDeviceClassValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionDeviceClassRequest {
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private Integer gracePeriodSeconds;
        @jakarta.annotation.Nullable
        private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private Boolean orphanDependents;
        @jakarta.annotation.Nullable
        private String propagationPolicy;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private V1DeleteOptions body;

        private APIdeleteCollectionDeviceClassRequest() {
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionDeviceClassRequest
         */
        public APIdeleteCollectionDeviceClassRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionDeviceClass
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteCollectionDeviceClassCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }

        /**
         * Execute deleteCollectionDeviceClass request
         * @return V1Status
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1Status execute() throws ApiException {
            ApiResponse<V1Status> localVarResp = deleteCollectionDeviceClassWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionDeviceClass request with HTTP info returned
         * @return ApiResponse&lt;V1Status&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1Status> executeWithHttpInfo() throws ApiException {
            return deleteCollectionDeviceClassWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        }

        /**
         * Execute deleteCollectionDeviceClass request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1Status> _callback) throws ApiException {
            return deleteCollectionDeviceClassAsync(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }
    }

    /**
     *
     * delete collection of DeviceClass
     * @return APIdeleteCollectionDeviceClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionDeviceClassRequest deleteCollectionDeviceClass() {
        return new APIdeleteCollectionDeviceClassRequest();
    }
    private okhttp3.Call deleteCollectionNamespacedResourceClaimCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (_continue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (ignoreStoreReadErrorWithClusterBreakingPotential != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ignoreStoreReadErrorWithClusterBreakingPotential", ignoreStoreReadErrorWithClusterBreakingPotential));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call deleteCollectionNamespacedResourceClaimValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteCollectionNamespacedResourceClaim(Async)");
        }

        return deleteCollectionNamespacedResourceClaimCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);

    }


    private ApiResponse<V1Status> deleteCollectionNamespacedResourceClaimWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionNamespacedResourceClaimValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionNamespacedResourceClaimAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionNamespacedResourceClaimValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionNamespacedResourceClaimRequest {
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private Integer gracePeriodSeconds;
        @jakarta.annotation.Nullable
        private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private Boolean orphanDependents;
        @jakarta.annotation.Nullable
        private String propagationPolicy;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private V1DeleteOptions body;

        private APIdeleteCollectionNamespacedResourceClaimRequest(@jakarta.annotation.Nonnull String namespace) {
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionNamespacedResourceClaim
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteCollectionNamespacedResourceClaimCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }

        /**
         * Execute deleteCollectionNamespacedResourceClaim request
         * @return V1Status
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1Status execute() throws ApiException {
            ApiResponse<V1Status> localVarResp = deleteCollectionNamespacedResourceClaimWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionNamespacedResourceClaim request with HTTP info returned
         * @return ApiResponse&lt;V1Status&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1Status> executeWithHttpInfo() throws ApiException {
            return deleteCollectionNamespacedResourceClaimWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        }

        /**
         * Execute deleteCollectionNamespacedResourceClaim request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1Status> _callback) throws ApiException {
            return deleteCollectionNamespacedResourceClaimAsync(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }
    }

    /**
     *
     * delete collection of ResourceClaim
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIdeleteCollectionNamespacedResourceClaimRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionNamespacedResourceClaimRequest deleteCollectionNamespacedResourceClaim(@jakarta.annotation.Nonnull String namespace) {
        return new APIdeleteCollectionNamespacedResourceClaimRequest(namespace);
    }
    private okhttp3.Call deleteCollectionNamespacedResourceClaimTemplateCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaimtemplates"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (_continue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (ignoreStoreReadErrorWithClusterBreakingPotential != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ignoreStoreReadErrorWithClusterBreakingPotential", ignoreStoreReadErrorWithClusterBreakingPotential));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call deleteCollectionNamespacedResourceClaimTemplateValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteCollectionNamespacedResourceClaimTemplate(Async)");
        }

        return deleteCollectionNamespacedResourceClaimTemplateCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);

    }


    private ApiResponse<V1Status> deleteCollectionNamespacedResourceClaimTemplateWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionNamespacedResourceClaimTemplateValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionNamespacedResourceClaimTemplateAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionNamespacedResourceClaimTemplateValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionNamespacedResourceClaimTemplateRequest {
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private Integer gracePeriodSeconds;
        @jakarta.annotation.Nullable
        private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private Boolean orphanDependents;
        @jakarta.annotation.Nullable
        private String propagationPolicy;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private V1DeleteOptions body;

        private APIdeleteCollectionNamespacedResourceClaimTemplateRequest(@jakarta.annotation.Nonnull String namespace) {
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteCollectionNamespacedResourceClaimTemplateRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionNamespacedResourceClaimTemplate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteCollectionNamespacedResourceClaimTemplateCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }

        /**
         * Execute deleteCollectionNamespacedResourceClaimTemplate request
         * @return V1Status
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1Status execute() throws ApiException {
            ApiResponse<V1Status> localVarResp = deleteCollectionNamespacedResourceClaimTemplateWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionNamespacedResourceClaimTemplate request with HTTP info returned
         * @return ApiResponse&lt;V1Status&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1Status> executeWithHttpInfo() throws ApiException {
            return deleteCollectionNamespacedResourceClaimTemplateWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        }

        /**
         * Execute deleteCollectionNamespacedResourceClaimTemplate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1Status> _callback) throws ApiException {
            return deleteCollectionNamespacedResourceClaimTemplateAsync(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }
    }

    /**
     *
     * delete collection of ResourceClaimTemplate
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIdeleteCollectionNamespacedResourceClaimTemplateRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionNamespacedResourceClaimTemplateRequest deleteCollectionNamespacedResourceClaimTemplate(@jakarta.annotation.Nonnull String namespace) {
        return new APIdeleteCollectionNamespacedResourceClaimTemplateRequest(namespace);
    }
    private okhttp3.Call deleteCollectionResourceSliceCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceslices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (_continue != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("continue", _continue));
        }

        if (dryRun != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
        }

        if (fieldSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldSelector", fieldSelector));
        }

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (ignoreStoreReadErrorWithClusterBreakingPotential != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ignoreStoreReadErrorWithClusterBreakingPotential", ignoreStoreReadErrorWithClusterBreakingPotential));
        }

        if (labelSelector != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call deleteCollectionResourceSliceValidateBeforeCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        return deleteCollectionResourceSliceCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);

    }


    private ApiResponse<V1Status> deleteCollectionResourceSliceWithHttpInfo(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionResourceSliceValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionResourceSliceAsync(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionResourceSliceValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionResourceSliceRequest {
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private Integer gracePeriodSeconds;
        @jakarta.annotation.Nullable
        private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private Boolean orphanDependents;
        @jakarta.annotation.Nullable
        private String propagationPolicy;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private V1DeleteOptions body;

        private APIdeleteCollectionResourceSliceRequest() {
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionResourceSliceRequest
         */
        public APIdeleteCollectionResourceSliceRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionResourceSlice
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteCollectionResourceSliceCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }

        /**
         * Execute deleteCollectionResourceSlice request
         * @return V1Status
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1Status execute() throws ApiException {
            ApiResponse<V1Status> localVarResp = deleteCollectionResourceSliceWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionResourceSlice request with HTTP info returned
         * @return ApiResponse&lt;V1Status&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1Status> executeWithHttpInfo() throws ApiException {
            return deleteCollectionResourceSliceWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        }

        /**
         * Execute deleteCollectionResourceSlice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1Status> _callback) throws ApiException {
            return deleteCollectionResourceSliceAsync(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }
    }

    /**
     *
     * delete collection of ResourceSlice
     * @return APIdeleteCollectionResourceSliceRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionResourceSliceRequest deleteCollectionResourceSlice() {
        return new APIdeleteCollectionResourceSliceRequest();
    }
    private okhttp3.Call deleteDeviceClassCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/deviceclasses/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (ignoreStoreReadErrorWithClusterBreakingPotential != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ignoreStoreReadErrorWithClusterBreakingPotential", ignoreStoreReadErrorWithClusterBreakingPotential));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call deleteDeviceClassValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteDeviceClass(Async)");
        }

        return deleteDeviceClassCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);

    }


    private ApiResponse<V1beta2DeviceClass> deleteDeviceClassWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteDeviceClassValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteDeviceClassAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteDeviceClassValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteDeviceClassRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private Integer gracePeriodSeconds;
        @jakarta.annotation.Nullable
        private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;
        @jakarta.annotation.Nullable
        private Boolean orphanDependents;
        @jakarta.annotation.Nullable
        private String propagationPolicy;
        @jakarta.annotation.Nullable
        private V1DeleteOptions body;

        private APIdeleteDeviceClassRequest(@jakarta.annotation.Nonnull String name) {
            this.name = name;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteDeviceClassRequest
         */
        public APIdeleteDeviceClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteDeviceClassRequest
         */
        public APIdeleteDeviceClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteDeviceClassRequest
         */
        public APIdeleteDeviceClassRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteDeviceClassRequest
         */
        public APIdeleteDeviceClassRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteDeviceClassRequest
         */
        public APIdeleteDeviceClassRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteDeviceClassRequest
         */
        public APIdeleteDeviceClassRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteDeviceClassRequest
         */
        public APIdeleteDeviceClassRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteDeviceClass
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteDeviceClassCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }

        /**
         * Execute deleteDeviceClass request
         * @return V1beta2DeviceClass
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2DeviceClass execute() throws ApiException {
            ApiResponse<V1beta2DeviceClass> localVarResp = deleteDeviceClassWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteDeviceClass request with HTTP info returned
         * @return ApiResponse&lt;V1beta2DeviceClass&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2DeviceClass> executeWithHttpInfo() throws ApiException {
            return deleteDeviceClassWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
        }

        /**
         * Execute deleteDeviceClass request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {
            return deleteDeviceClassAsync(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }
    }

    /**
     *
     * delete a DeviceClass
     * @param name name of the DeviceClass (required)
     * @return APIdeleteDeviceClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteDeviceClassRequest deleteDeviceClass(@jakarta.annotation.Nonnull String name) {
        return new APIdeleteDeviceClassRequest(name);
    }
    private okhttp3.Call deleteNamespacedResourceClaimCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (ignoreStoreReadErrorWithClusterBreakingPotential != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ignoreStoreReadErrorWithClusterBreakingPotential", ignoreStoreReadErrorWithClusterBreakingPotential));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call deleteNamespacedResourceClaimValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedResourceClaim(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedResourceClaim(Async)");
        }

        return deleteNamespacedResourceClaimCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);

    }


    private ApiResponse<V1beta2ResourceClaim> deleteNamespacedResourceClaimWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteNamespacedResourceClaimValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteNamespacedResourceClaimAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNamespacedResourceClaimValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteNamespacedResourceClaimRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private Integer gracePeriodSeconds;
        @jakarta.annotation.Nullable
        private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;
        @jakarta.annotation.Nullable
        private Boolean orphanDependents;
        @jakarta.annotation.Nullable
        private String propagationPolicy;
        @jakarta.annotation.Nullable
        private V1DeleteOptions body;

        private APIdeleteNamespacedResourceClaimRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteNamespacedResourceClaimRequest
         */
        public APIdeleteNamespacedResourceClaimRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteNamespacedResourceClaimRequest
         */
        public APIdeleteNamespacedResourceClaimRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteNamespacedResourceClaimRequest
         */
        public APIdeleteNamespacedResourceClaimRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteNamespacedResourceClaimRequest
         */
        public APIdeleteNamespacedResourceClaimRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteNamespacedResourceClaimRequest
         */
        public APIdeleteNamespacedResourceClaimRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteNamespacedResourceClaimRequest
         */
        public APIdeleteNamespacedResourceClaimRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteNamespacedResourceClaimRequest
         */
        public APIdeleteNamespacedResourceClaimRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteNamespacedResourceClaim
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteNamespacedResourceClaimCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }

        /**
         * Execute deleteNamespacedResourceClaim request
         * @return V1beta2ResourceClaim
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaim execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaim> localVarResp = deleteNamespacedResourceClaimWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteNamespacedResourceClaim request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaim&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaim> executeWithHttpInfo() throws ApiException {
            return deleteNamespacedResourceClaimWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
        }

        /**
         * Execute deleteNamespacedResourceClaim request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {
            return deleteNamespacedResourceClaimAsync(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }
    }

    /**
     *
     * delete a ResourceClaim
     * @param name name of the ResourceClaim (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIdeleteNamespacedResourceClaimRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteNamespacedResourceClaimRequest deleteNamespacedResourceClaim(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
        return new APIdeleteNamespacedResourceClaimRequest(name, namespace);
    }
    private okhttp3.Call deleteNamespacedResourceClaimTemplateCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaimtemplates/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (ignoreStoreReadErrorWithClusterBreakingPotential != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ignoreStoreReadErrorWithClusterBreakingPotential", ignoreStoreReadErrorWithClusterBreakingPotential));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call deleteNamespacedResourceClaimTemplateValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedResourceClaimTemplate(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedResourceClaimTemplate(Async)");
        }

        return deleteNamespacedResourceClaimTemplateCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimTemplate> deleteNamespacedResourceClaimTemplateWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteNamespacedResourceClaimTemplateValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteNamespacedResourceClaimTemplateAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNamespacedResourceClaimTemplateValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteNamespacedResourceClaimTemplateRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private Integer gracePeriodSeconds;
        @jakarta.annotation.Nullable
        private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;
        @jakarta.annotation.Nullable
        private Boolean orphanDependents;
        @jakarta.annotation.Nullable
        private String propagationPolicy;
        @jakarta.annotation.Nullable
        private V1DeleteOptions body;

        private APIdeleteNamespacedResourceClaimTemplateRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteNamespacedResourceClaimTemplateRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteNamespacedResourceClaimTemplateRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteNamespacedResourceClaimTemplateRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteNamespacedResourceClaimTemplateRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteNamespacedResourceClaimTemplateRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteNamespacedResourceClaimTemplateRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteNamespacedResourceClaimTemplateRequest
         */
        public APIdeleteNamespacedResourceClaimTemplateRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteNamespacedResourceClaimTemplate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteNamespacedResourceClaimTemplateCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }

        /**
         * Execute deleteNamespacedResourceClaimTemplate request
         * @return V1beta2ResourceClaimTemplate
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimTemplate execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimTemplate> localVarResp = deleteNamespacedResourceClaimTemplateWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteNamespacedResourceClaimTemplate request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimTemplate&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimTemplate> executeWithHttpInfo() throws ApiException {
            return deleteNamespacedResourceClaimTemplateWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
        }

        /**
         * Execute deleteNamespacedResourceClaimTemplate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {
            return deleteNamespacedResourceClaimTemplateAsync(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }
    }

    /**
     *
     * delete a ResourceClaimTemplate
     * @param name name of the ResourceClaimTemplate (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIdeleteNamespacedResourceClaimTemplateRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteNamespacedResourceClaimTemplateRequest deleteNamespacedResourceClaimTemplate(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
        return new APIdeleteNamespacedResourceClaimTemplateRequest(name, namespace);
    }
    private okhttp3.Call deleteResourceSliceCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceslices/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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

        if (gracePeriodSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
        }

        if (ignoreStoreReadErrorWithClusterBreakingPotential != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ignoreStoreReadErrorWithClusterBreakingPotential", ignoreStoreReadErrorWithClusterBreakingPotential));
        }

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call deleteResourceSliceValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteResourceSlice(Async)");
        }

        return deleteResourceSliceCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);

    }


    private ApiResponse<V1beta2ResourceSlice> deleteResourceSliceWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteResourceSliceValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteResourceSliceAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteResourceSliceValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteResourceSliceRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private Integer gracePeriodSeconds;
        @jakarta.annotation.Nullable
        private Boolean ignoreStoreReadErrorWithClusterBreakingPotential;
        @jakarta.annotation.Nullable
        private Boolean orphanDependents;
        @jakarta.annotation.Nullable
        private String propagationPolicy;
        @jakarta.annotation.Nullable
        private V1DeleteOptions body;

        private APIdeleteResourceSliceRequest(@jakarta.annotation.Nonnull String name) {
            this.name = name;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteResourceSliceRequest
         */
        public APIdeleteResourceSliceRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteResourceSliceRequest
         */
        public APIdeleteResourceSliceRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteResourceSliceRequest
         */
        public APIdeleteResourceSliceRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteResourceSliceRequest
         */
        public APIdeleteResourceSliceRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteResourceSliceRequest
         */
        public APIdeleteResourceSliceRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteResourceSliceRequest
         */
        public APIdeleteResourceSliceRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteResourceSliceRequest
         */
        public APIdeleteResourceSliceRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteResourceSlice
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteResourceSliceCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }

        /**
         * Execute deleteResourceSlice request
         * @return V1beta2ResourceSlice
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceSlice execute() throws ApiException {
            ApiResponse<V1beta2ResourceSlice> localVarResp = deleteResourceSliceWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteResourceSlice request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceSlice&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceSlice> executeWithHttpInfo() throws ApiException {
            return deleteResourceSliceWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
        }

        /**
         * Execute deleteResourceSlice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {
            return deleteResourceSliceAsync(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }
    }

    /**
     *
     * delete a ResourceSlice
     * @param name name of the ResourceSlice (required)
     * @return APIdeleteResourceSliceRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteResourceSliceRequest deleteResourceSlice(@jakarta.annotation.Nonnull String name) {
        return new APIdeleteResourceSliceRequest(name);
    }
    private okhttp3.Call getAPIResourcesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call getAPIResourcesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAPIResourcesCall(_callback);

    }


    private ApiResponse<V1APIResourceList> getAPIResourcesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<V1APIResourceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAPIResourcesAsync(final ApiCallback<V1APIResourceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<V1APIResourceList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetAPIResourcesRequest {

        private APIgetAPIResourcesRequest() {
        }

        /**
         * Build call for getAPIResources
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAPIResourcesCall(_callback);
        }

        /**
         * Execute getAPIResources request
         * @return V1APIResourceList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1APIResourceList execute() throws ApiException {
            ApiResponse<V1APIResourceList> localVarResp = getAPIResourcesWithHttpInfo();
            return localVarResp.getData();
        }

        /**
         * Execute getAPIResources request with HTTP info returned
         * @return ApiResponse&lt;V1APIResourceList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1APIResourceList> executeWithHttpInfo() throws ApiException {
            return getAPIResourcesWithHttpInfo();
        }

        /**
         * Execute getAPIResources request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1APIResourceList> _callback) throws ApiException {
            return getAPIResourcesAsync(_callback);
        }
    }

    /**
     *
     * get available resources
     * @return APIgetAPIResourcesRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetAPIResourcesRequest getAPIResources() {
        return new APIgetAPIResourcesRequest();
    }
    private okhttp3.Call listDeviceClassCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/deviceclasses";

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

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor",
            "application/json;stream=watch",
            "application/vnd.kubernetes.protobuf;stream=watch",
            "application/cbor-seq"
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
    private okhttp3.Call listDeviceClassValidateBeforeCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        return listDeviceClassCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1beta2DeviceClassList> listDeviceClassWithHttpInfo(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listDeviceClassValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClassList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listDeviceClassAsync(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1beta2DeviceClassList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listDeviceClassValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClassList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistDeviceClassRequest {
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private Boolean allowWatchBookmarks;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private Boolean watch;

        private APIlistDeviceClassRequest() {
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistDeviceClassRequest
         */
        public APIlistDeviceClassRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listDeviceClass
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listDeviceClassCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listDeviceClass request
         * @return V1beta2DeviceClassList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2DeviceClassList execute() throws ApiException {
            ApiResponse<V1beta2DeviceClassList> localVarResp = listDeviceClassWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listDeviceClass request with HTTP info returned
         * @return ApiResponse&lt;V1beta2DeviceClassList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2DeviceClassList> executeWithHttpInfo() throws ApiException {
            return listDeviceClassWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listDeviceClass request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2DeviceClassList> _callback) throws ApiException {
            return listDeviceClassAsync(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind DeviceClass
     * @return APIlistDeviceClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistDeviceClassRequest listDeviceClass() {
        return new APIlistDeviceClassRequest();
    }
    private okhttp3.Call listNamespacedResourceClaimCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor",
            "application/json;stream=watch",
            "application/vnd.kubernetes.protobuf;stream=watch",
            "application/cbor-seq"
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
    private okhttp3.Call listNamespacedResourceClaimValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listNamespacedResourceClaim(Async)");
        }

        return listNamespacedResourceClaimCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimList> listNamespacedResourceClaimWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listNamespacedResourceClaimValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listNamespacedResourceClaimAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1beta2ResourceClaimList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listNamespacedResourceClaimValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistNamespacedResourceClaimRequest {
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private Boolean allowWatchBookmarks;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private Boolean watch;

        private APIlistNamespacedResourceClaimRequest(@jakarta.annotation.Nonnull String namespace) {
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistNamespacedResourceClaimRequest
         */
        public APIlistNamespacedResourceClaimRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listNamespacedResourceClaim
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listNamespacedResourceClaimCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listNamespacedResourceClaim request
         * @return V1beta2ResourceClaimList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimList execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimList> localVarResp = listNamespacedResourceClaimWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listNamespacedResourceClaim request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimList> executeWithHttpInfo() throws ApiException {
            return listNamespacedResourceClaimWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listNamespacedResourceClaim request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimList> _callback) throws ApiException {
            return listNamespacedResourceClaimAsync(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind ResourceClaim
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIlistNamespacedResourceClaimRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistNamespacedResourceClaimRequest listNamespacedResourceClaim(@jakarta.annotation.Nonnull String namespace) {
        return new APIlistNamespacedResourceClaimRequest(namespace);
    }
    private okhttp3.Call listNamespacedResourceClaimTemplateCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaimtemplates"
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor",
            "application/json;stream=watch",
            "application/vnd.kubernetes.protobuf;stream=watch",
            "application/cbor-seq"
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
    private okhttp3.Call listNamespacedResourceClaimTemplateValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listNamespacedResourceClaimTemplate(Async)");
        }

        return listNamespacedResourceClaimTemplateCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimTemplateList> listNamespacedResourceClaimTemplateWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listNamespacedResourceClaimTemplateValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplateList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listNamespacedResourceClaimTemplateAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1beta2ResourceClaimTemplateList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listNamespacedResourceClaimTemplateValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplateList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistNamespacedResourceClaimTemplateRequest {
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private Boolean allowWatchBookmarks;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private Boolean watch;

        private APIlistNamespacedResourceClaimTemplateRequest(@jakarta.annotation.Nonnull String namespace) {
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistNamespacedResourceClaimTemplateRequest
         */
        public APIlistNamespacedResourceClaimTemplateRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listNamespacedResourceClaimTemplate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listNamespacedResourceClaimTemplateCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listNamespacedResourceClaimTemplate request
         * @return V1beta2ResourceClaimTemplateList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimTemplateList execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimTemplateList> localVarResp = listNamespacedResourceClaimTemplateWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listNamespacedResourceClaimTemplate request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimTemplateList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimTemplateList> executeWithHttpInfo() throws ApiException {
            return listNamespacedResourceClaimTemplateWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listNamespacedResourceClaimTemplate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimTemplateList> _callback) throws ApiException {
            return listNamespacedResourceClaimTemplateAsync(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind ResourceClaimTemplate
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIlistNamespacedResourceClaimTemplateRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistNamespacedResourceClaimTemplateRequest listNamespacedResourceClaimTemplate(@jakarta.annotation.Nonnull String namespace) {
        return new APIlistNamespacedResourceClaimTemplateRequest(namespace);
    }
    private okhttp3.Call listResourceClaimForAllNamespacesCall(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceclaims";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor",
            "application/json;stream=watch",
            "application/vnd.kubernetes.protobuf;stream=watch",
            "application/cbor-seq"
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
    private okhttp3.Call listResourceClaimForAllNamespacesValidateBeforeCall(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        return listResourceClaimForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimList> listResourceClaimForAllNamespacesWithHttpInfo(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listResourceClaimForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listResourceClaimForAllNamespacesAsync(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1beta2ResourceClaimList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listResourceClaimForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistResourceClaimForAllNamespacesRequest {
        @jakarta.annotation.Nullable
        private Boolean allowWatchBookmarks;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private Boolean watch;

        private APIlistResourceClaimForAllNamespacesRequest() {
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistResourceClaimForAllNamespacesRequest
         */
        public APIlistResourceClaimForAllNamespacesRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listResourceClaimForAllNamespaces
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listResourceClaimForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listResourceClaimForAllNamespaces request
         * @return V1beta2ResourceClaimList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimList execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimList> localVarResp = listResourceClaimForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listResourceClaimForAllNamespaces request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimList> executeWithHttpInfo() throws ApiException {
            return listResourceClaimForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listResourceClaimForAllNamespaces request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimList> _callback) throws ApiException {
            return listResourceClaimForAllNamespacesAsync(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind ResourceClaim
     * @return APIlistResourceClaimForAllNamespacesRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistResourceClaimForAllNamespacesRequest listResourceClaimForAllNamespaces() {
        return new APIlistResourceClaimForAllNamespacesRequest();
    }
    private okhttp3.Call listResourceClaimTemplateForAllNamespacesCall(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceclaimtemplates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        if (resourceVersion != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
        }

        if (resourceVersionMatch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
        }

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor",
            "application/json;stream=watch",
            "application/vnd.kubernetes.protobuf;stream=watch",
            "application/cbor-seq"
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
    private okhttp3.Call listResourceClaimTemplateForAllNamespacesValidateBeforeCall(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        return listResourceClaimTemplateForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimTemplateList> listResourceClaimTemplateForAllNamespacesWithHttpInfo(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listResourceClaimTemplateForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplateList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listResourceClaimTemplateForAllNamespacesAsync(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1beta2ResourceClaimTemplateList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listResourceClaimTemplateForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplateList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistResourceClaimTemplateForAllNamespacesRequest {
        @jakarta.annotation.Nullable
        private Boolean allowWatchBookmarks;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private Boolean watch;

        private APIlistResourceClaimTemplateForAllNamespacesRequest() {
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistResourceClaimTemplateForAllNamespacesRequest
         */
        public APIlistResourceClaimTemplateForAllNamespacesRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listResourceClaimTemplateForAllNamespaces
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listResourceClaimTemplateForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listResourceClaimTemplateForAllNamespaces request
         * @return V1beta2ResourceClaimTemplateList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimTemplateList execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimTemplateList> localVarResp = listResourceClaimTemplateForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listResourceClaimTemplateForAllNamespaces request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimTemplateList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimTemplateList> executeWithHttpInfo() throws ApiException {
            return listResourceClaimTemplateForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listResourceClaimTemplateForAllNamespaces request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimTemplateList> _callback) throws ApiException {
            return listResourceClaimTemplateForAllNamespacesAsync(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind ResourceClaimTemplate
     * @return APIlistResourceClaimTemplateForAllNamespacesRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistResourceClaimTemplateForAllNamespacesRequest listResourceClaimTemplateForAllNamespaces() {
        return new APIlistResourceClaimTemplateForAllNamespacesRequest();
    }
    private okhttp3.Call listResourceSliceCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceslices";

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

        if (sendInitialEvents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sendInitialEvents", sendInitialEvents));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (watch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor",
            "application/json;stream=watch",
            "application/vnd.kubernetes.protobuf;stream=watch",
            "application/cbor-seq"
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
    private okhttp3.Call listResourceSliceValidateBeforeCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        return listResourceSliceCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1beta2ResourceSliceList> listResourceSliceWithHttpInfo(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listResourceSliceValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSliceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listResourceSliceAsync(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1beta2ResourceSliceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listResourceSliceValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSliceList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistResourceSliceRequest {
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private Boolean allowWatchBookmarks;
        @jakarta.annotation.Nullable
        private String _continue;
        @jakarta.annotation.Nullable
        private String fieldSelector;
        @jakarta.annotation.Nullable
        private String labelSelector;
        @jakarta.annotation.Nullable
        private Integer limit;
        @jakarta.annotation.Nullable
        private String resourceVersion;
        @jakarta.annotation.Nullable
        private String resourceVersionMatch;
        @jakarta.annotation.Nullable
        private Boolean sendInitialEvents;
        @jakarta.annotation.Nullable
        private Integer timeoutSeconds;
        @jakarta.annotation.Nullable
        private Boolean watch;

        private APIlistResourceSliceRequest() {
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistResourceSliceRequest
         */
        public APIlistResourceSliceRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listResourceSlice
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listResourceSliceCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listResourceSlice request
         * @return V1beta2ResourceSliceList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceSliceList execute() throws ApiException {
            ApiResponse<V1beta2ResourceSliceList> localVarResp = listResourceSliceWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listResourceSlice request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceSliceList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceSliceList> executeWithHttpInfo() throws ApiException {
            return listResourceSliceWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listResourceSlice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceSliceList> _callback) throws ApiException {
            return listResourceSliceAsync(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind ResourceSlice
     * @return APIlistResourceSliceRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistResourceSliceRequest listResourceSlice() {
        return new APIlistResourceSliceRequest();
    }
    private okhttp3.Call patchDeviceClassCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/deviceclasses/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call patchDeviceClassValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchDeviceClass(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchDeviceClass(Async)");
        }

        return patchDeviceClassCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1beta2DeviceClass> patchDeviceClassWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchDeviceClassValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchDeviceClassAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchDeviceClassValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchDeviceClassRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final V1Patch body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;
        @jakarta.annotation.Nullable
        private Boolean force;

        private APIpatchDeviceClassRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body) {
            this.name = name;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchDeviceClassRequest
         */
        public APIpatchDeviceClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchDeviceClassRequest
         */
        public APIpatchDeviceClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchDeviceClassRequest
         */
        public APIpatchDeviceClassRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchDeviceClassRequest
         */
        public APIpatchDeviceClassRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchDeviceClassRequest
         */
        public APIpatchDeviceClassRequest force(@jakarta.annotation.Nullable Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchDeviceClass
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchDeviceClassCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchDeviceClass request
         * @return V1beta2DeviceClass
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2DeviceClass execute() throws ApiException {
            ApiResponse<V1beta2DeviceClass> localVarResp = patchDeviceClassWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchDeviceClass request with HTTP info returned
         * @return ApiResponse&lt;V1beta2DeviceClass&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2DeviceClass> executeWithHttpInfo() throws ApiException {
            return patchDeviceClassWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchDeviceClass request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {
            return patchDeviceClassAsync(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update the specified DeviceClass
     * @param name name of the DeviceClass (required)
     * @param body  (required)
     * @return APIpatchDeviceClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchDeviceClassRequest patchDeviceClass(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body) {
        return new APIpatchDeviceClassRequest(name, body);
    }
    private okhttp3.Call patchNamespacedResourceClaimCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call patchNamespacedResourceClaimValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedResourceClaim(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedResourceClaim(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedResourceClaim(Async)");
        }

        return patchNamespacedResourceClaimCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1beta2ResourceClaim> patchNamespacedResourceClaimWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedResourceClaimValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedResourceClaimAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedResourceClaimValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedResourceClaimRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1Patch body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;
        @jakarta.annotation.Nullable
        private Boolean force;

        private APIpatchNamespacedResourceClaimRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchNamespacedResourceClaimRequest
         */
        public APIpatchNamespacedResourceClaimRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedResourceClaimRequest
         */
        public APIpatchNamespacedResourceClaimRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedResourceClaimRequest
         */
        public APIpatchNamespacedResourceClaimRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchNamespacedResourceClaimRequest
         */
        public APIpatchNamespacedResourceClaimRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedResourceClaimRequest
         */
        public APIpatchNamespacedResourceClaimRequest force(@jakarta.annotation.Nullable Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedResourceClaim
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchNamespacedResourceClaimCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedResourceClaim request
         * @return V1beta2ResourceClaim
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaim execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaim> localVarResp = patchNamespacedResourceClaimWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedResourceClaim request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaim&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaim> executeWithHttpInfo() throws ApiException {
            return patchNamespacedResourceClaimWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedResourceClaim request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {
            return patchNamespacedResourceClaimAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update the specified ResourceClaim
     * @param name name of the ResourceClaim (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIpatchNamespacedResourceClaimRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedResourceClaimRequest patchNamespacedResourceClaim(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
        return new APIpatchNamespacedResourceClaimRequest(name, namespace, body);
    }
    private okhttp3.Call patchNamespacedResourceClaimStatusCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims/{name}/status"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call patchNamespacedResourceClaimStatusValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedResourceClaimStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedResourceClaimStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedResourceClaimStatus(Async)");
        }

        return patchNamespacedResourceClaimStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1beta2ResourceClaim> patchNamespacedResourceClaimStatusWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedResourceClaimStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedResourceClaimStatusAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedResourceClaimStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedResourceClaimStatusRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1Patch body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;
        @jakarta.annotation.Nullable
        private Boolean force;

        private APIpatchNamespacedResourceClaimStatusRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchNamespacedResourceClaimStatusRequest
         */
        public APIpatchNamespacedResourceClaimStatusRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedResourceClaimStatusRequest
         */
        public APIpatchNamespacedResourceClaimStatusRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedResourceClaimStatusRequest
         */
        public APIpatchNamespacedResourceClaimStatusRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchNamespacedResourceClaimStatusRequest
         */
        public APIpatchNamespacedResourceClaimStatusRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedResourceClaimStatusRequest
         */
        public APIpatchNamespacedResourceClaimStatusRequest force(@jakarta.annotation.Nullable Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedResourceClaimStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchNamespacedResourceClaimStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedResourceClaimStatus request
         * @return V1beta2ResourceClaim
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaim execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaim> localVarResp = patchNamespacedResourceClaimStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedResourceClaimStatus request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaim&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaim> executeWithHttpInfo() throws ApiException {
            return patchNamespacedResourceClaimStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedResourceClaimStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {
            return patchNamespacedResourceClaimStatusAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update status of the specified ResourceClaim
     * @param name name of the ResourceClaim (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIpatchNamespacedResourceClaimStatusRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedResourceClaimStatusRequest patchNamespacedResourceClaimStatus(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
        return new APIpatchNamespacedResourceClaimStatusRequest(name, namespace, body);
    }
    private okhttp3.Call patchNamespacedResourceClaimTemplateCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaimtemplates/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call patchNamespacedResourceClaimTemplateValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedResourceClaimTemplate(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedResourceClaimTemplate(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedResourceClaimTemplate(Async)");
        }

        return patchNamespacedResourceClaimTemplateCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimTemplate> patchNamespacedResourceClaimTemplateWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedResourceClaimTemplateValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedResourceClaimTemplateAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedResourceClaimTemplateValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedResourceClaimTemplateRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1Patch body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;
        @jakarta.annotation.Nullable
        private Boolean force;

        private APIpatchNamespacedResourceClaimTemplateRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchNamespacedResourceClaimTemplateRequest
         */
        public APIpatchNamespacedResourceClaimTemplateRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedResourceClaimTemplateRequest
         */
        public APIpatchNamespacedResourceClaimTemplateRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedResourceClaimTemplateRequest
         */
        public APIpatchNamespacedResourceClaimTemplateRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchNamespacedResourceClaimTemplateRequest
         */
        public APIpatchNamespacedResourceClaimTemplateRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedResourceClaimTemplateRequest
         */
        public APIpatchNamespacedResourceClaimTemplateRequest force(@jakarta.annotation.Nullable Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedResourceClaimTemplate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchNamespacedResourceClaimTemplateCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedResourceClaimTemplate request
         * @return V1beta2ResourceClaimTemplate
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimTemplate execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimTemplate> localVarResp = patchNamespacedResourceClaimTemplateWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedResourceClaimTemplate request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimTemplate&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimTemplate> executeWithHttpInfo() throws ApiException {
            return patchNamespacedResourceClaimTemplateWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedResourceClaimTemplate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {
            return patchNamespacedResourceClaimTemplateAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update the specified ResourceClaimTemplate
     * @param name name of the ResourceClaimTemplate (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIpatchNamespacedResourceClaimTemplateRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedResourceClaimTemplateRequest patchNamespacedResourceClaimTemplate(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
        return new APIpatchNamespacedResourceClaimTemplateRequest(name, namespace, body);
    }
    private okhttp3.Call patchResourceSliceCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceslices/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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

        if (force != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call patchResourceSliceValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchResourceSlice(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchResourceSlice(Async)");
        }

        return patchResourceSliceCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1beta2ResourceSlice> patchResourceSliceWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchResourceSliceValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchResourceSliceAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchResourceSliceValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchResourceSliceRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final V1Patch body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;
        @jakarta.annotation.Nullable
        private Boolean force;

        private APIpatchResourceSliceRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body) {
            this.name = name;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchResourceSliceRequest
         */
        public APIpatchResourceSliceRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchResourceSliceRequest
         */
        public APIpatchResourceSliceRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchResourceSliceRequest
         */
        public APIpatchResourceSliceRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchResourceSliceRequest
         */
        public APIpatchResourceSliceRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchResourceSliceRequest
         */
        public APIpatchResourceSliceRequest force(@jakarta.annotation.Nullable Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchResourceSlice
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return patchResourceSliceCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchResourceSlice request
         * @return V1beta2ResourceSlice
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceSlice execute() throws ApiException {
            ApiResponse<V1beta2ResourceSlice> localVarResp = patchResourceSliceWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchResourceSlice request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceSlice&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceSlice> executeWithHttpInfo() throws ApiException {
            return patchResourceSliceWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchResourceSlice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {
            return patchResourceSliceAsync(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update the specified ResourceSlice
     * @param name name of the ResourceSlice (required)
     * @param body  (required)
     * @return APIpatchResourceSliceRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchResourceSliceRequest patchResourceSlice(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body) {
        return new APIpatchResourceSliceRequest(name, body);
    }
    private okhttp3.Call readDeviceClassCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/deviceclasses/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call readDeviceClassValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readDeviceClass(Async)");
        }

        return readDeviceClassCall(name, pretty, _callback);

    }


    private ApiResponse<V1beta2DeviceClass> readDeviceClassWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty) throws ApiException {
        okhttp3.Call localVarCall = readDeviceClassValidateBeforeCall(name, pretty, null);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readDeviceClassAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = readDeviceClassValidateBeforeCall(name, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadDeviceClassRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nullable
        private String pretty;

        private APIreadDeviceClassRequest(@jakarta.annotation.Nonnull String name) {
            this.name = name;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadDeviceClassRequest
         */
        public APIreadDeviceClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readDeviceClass
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return readDeviceClassCall(name, pretty, _callback);
        }

        /**
         * Execute readDeviceClass request
         * @return V1beta2DeviceClass
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2DeviceClass execute() throws ApiException {
            ApiResponse<V1beta2DeviceClass> localVarResp = readDeviceClassWithHttpInfo(name, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readDeviceClass request with HTTP info returned
         * @return ApiResponse&lt;V1beta2DeviceClass&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2DeviceClass> executeWithHttpInfo() throws ApiException {
            return readDeviceClassWithHttpInfo(name, pretty);
        }

        /**
         * Execute readDeviceClass request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {
            return readDeviceClassAsync(name, pretty, _callback);
        }
    }

    /**
     *
     * read the specified DeviceClass
     * @param name name of the DeviceClass (required)
     * @return APIreadDeviceClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadDeviceClassRequest readDeviceClass(@jakarta.annotation.Nonnull String name) {
        return new APIreadDeviceClassRequest(name);
    }
    private okhttp3.Call readNamespacedResourceClaimCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call readNamespacedResourceClaimValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedResourceClaim(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedResourceClaim(Async)");
        }

        return readNamespacedResourceClaimCall(name, namespace, pretty, _callback);

    }


    private ApiResponse<V1beta2ResourceClaim> readNamespacedResourceClaimWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedResourceClaimValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readNamespacedResourceClaimAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedResourceClaimValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadNamespacedResourceClaimRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;

        private APIreadNamespacedResourceClaimRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadNamespacedResourceClaimRequest
         */
        public APIreadNamespacedResourceClaimRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readNamespacedResourceClaim
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return readNamespacedResourceClaimCall(name, namespace, pretty, _callback);
        }

        /**
         * Execute readNamespacedResourceClaim request
         * @return V1beta2ResourceClaim
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaim execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaim> localVarResp = readNamespacedResourceClaimWithHttpInfo(name, namespace, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readNamespacedResourceClaim request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaim&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaim> executeWithHttpInfo() throws ApiException {
            return readNamespacedResourceClaimWithHttpInfo(name, namespace, pretty);
        }

        /**
         * Execute readNamespacedResourceClaim request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {
            return readNamespacedResourceClaimAsync(name, namespace, pretty, _callback);
        }
    }

    /**
     *
     * read the specified ResourceClaim
     * @param name name of the ResourceClaim (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIreadNamespacedResourceClaimRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadNamespacedResourceClaimRequest readNamespacedResourceClaim(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
        return new APIreadNamespacedResourceClaimRequest(name, namespace);
    }
    private okhttp3.Call readNamespacedResourceClaimStatusCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims/{name}/status"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call readNamespacedResourceClaimStatusValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedResourceClaimStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedResourceClaimStatus(Async)");
        }

        return readNamespacedResourceClaimStatusCall(name, namespace, pretty, _callback);

    }


    private ApiResponse<V1beta2ResourceClaim> readNamespacedResourceClaimStatusWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedResourceClaimStatusValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readNamespacedResourceClaimStatusAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedResourceClaimStatusValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadNamespacedResourceClaimStatusRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;

        private APIreadNamespacedResourceClaimStatusRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadNamespacedResourceClaimStatusRequest
         */
        public APIreadNamespacedResourceClaimStatusRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readNamespacedResourceClaimStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return readNamespacedResourceClaimStatusCall(name, namespace, pretty, _callback);
        }

        /**
         * Execute readNamespacedResourceClaimStatus request
         * @return V1beta2ResourceClaim
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaim execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaim> localVarResp = readNamespacedResourceClaimStatusWithHttpInfo(name, namespace, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readNamespacedResourceClaimStatus request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaim&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaim> executeWithHttpInfo() throws ApiException {
            return readNamespacedResourceClaimStatusWithHttpInfo(name, namespace, pretty);
        }

        /**
         * Execute readNamespacedResourceClaimStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {
            return readNamespacedResourceClaimStatusAsync(name, namespace, pretty, _callback);
        }
    }

    /**
     *
     * read status of the specified ResourceClaim
     * @param name name of the ResourceClaim (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIreadNamespacedResourceClaimStatusRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadNamespacedResourceClaimStatusRequest readNamespacedResourceClaimStatus(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
        return new APIreadNamespacedResourceClaimStatusRequest(name, namespace);
    }
    private okhttp3.Call readNamespacedResourceClaimTemplateCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaimtemplates/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call readNamespacedResourceClaimTemplateValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedResourceClaimTemplate(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedResourceClaimTemplate(Async)");
        }

        return readNamespacedResourceClaimTemplateCall(name, namespace, pretty, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimTemplate> readNamespacedResourceClaimTemplateWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedResourceClaimTemplateValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readNamespacedResourceClaimTemplateAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedResourceClaimTemplateValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadNamespacedResourceClaimTemplateRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;

        private APIreadNamespacedResourceClaimTemplateRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadNamespacedResourceClaimTemplateRequest
         */
        public APIreadNamespacedResourceClaimTemplateRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readNamespacedResourceClaimTemplate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return readNamespacedResourceClaimTemplateCall(name, namespace, pretty, _callback);
        }

        /**
         * Execute readNamespacedResourceClaimTemplate request
         * @return V1beta2ResourceClaimTemplate
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimTemplate execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimTemplate> localVarResp = readNamespacedResourceClaimTemplateWithHttpInfo(name, namespace, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readNamespacedResourceClaimTemplate request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimTemplate&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimTemplate> executeWithHttpInfo() throws ApiException {
            return readNamespacedResourceClaimTemplateWithHttpInfo(name, namespace, pretty);
        }

        /**
         * Execute readNamespacedResourceClaimTemplate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {
            return readNamespacedResourceClaimTemplateAsync(name, namespace, pretty, _callback);
        }
    }

    /**
     *
     * read the specified ResourceClaimTemplate
     * @param name name of the ResourceClaimTemplate (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIreadNamespacedResourceClaimTemplateRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadNamespacedResourceClaimTemplateRequest readNamespacedResourceClaimTemplate(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
        return new APIreadNamespacedResourceClaimTemplateRequest(name, namespace);
    }
    private okhttp3.Call readResourceSliceCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceslices/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call readResourceSliceValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readResourceSlice(Async)");
        }

        return readResourceSliceCall(name, pretty, _callback);

    }


    private ApiResponse<V1beta2ResourceSlice> readResourceSliceWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty) throws ApiException {
        okhttp3.Call localVarCall = readResourceSliceValidateBeforeCall(name, pretty, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readResourceSliceAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {

        okhttp3.Call localVarCall = readResourceSliceValidateBeforeCall(name, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadResourceSliceRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nullable
        private String pretty;

        private APIreadResourceSliceRequest(@jakarta.annotation.Nonnull String name) {
            this.name = name;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadResourceSliceRequest
         */
        public APIreadResourceSliceRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readResourceSlice
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return readResourceSliceCall(name, pretty, _callback);
        }

        /**
         * Execute readResourceSlice request
         * @return V1beta2ResourceSlice
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceSlice execute() throws ApiException {
            ApiResponse<V1beta2ResourceSlice> localVarResp = readResourceSliceWithHttpInfo(name, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readResourceSlice request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceSlice&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceSlice> executeWithHttpInfo() throws ApiException {
            return readResourceSliceWithHttpInfo(name, pretty);
        }

        /**
         * Execute readResourceSlice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {
            return readResourceSliceAsync(name, pretty, _callback);
        }
    }

    /**
     *
     * read the specified ResourceSlice
     * @param name name of the ResourceSlice (required)
     * @return APIreadResourceSliceRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadResourceSliceRequest readResourceSlice(@jakarta.annotation.Nonnull String name) {
        return new APIreadResourceSliceRequest(name);
    }
    private okhttp3.Call replaceDeviceClassCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2DeviceClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/deviceclasses/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call replaceDeviceClassValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2DeviceClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceDeviceClass(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceDeviceClass(Async)");
        }

        return replaceDeviceClassCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2DeviceClass> replaceDeviceClassWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2DeviceClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceDeviceClassValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceDeviceClassAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2DeviceClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceDeviceClassValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2DeviceClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceDeviceClassRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final V1beta2DeviceClass body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIreplaceDeviceClassRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2DeviceClass body) {
            this.name = name;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceDeviceClassRequest
         */
        public APIreplaceDeviceClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceDeviceClassRequest
         */
        public APIreplaceDeviceClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceDeviceClassRequest
         */
        public APIreplaceDeviceClassRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceDeviceClassRequest
         */
        public APIreplaceDeviceClassRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceDeviceClass
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceDeviceClassCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceDeviceClass request
         * @return V1beta2DeviceClass
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2DeviceClass execute() throws ApiException {
            ApiResponse<V1beta2DeviceClass> localVarResp = replaceDeviceClassWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceDeviceClass request with HTTP info returned
         * @return ApiResponse&lt;V1beta2DeviceClass&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2DeviceClass> executeWithHttpInfo() throws ApiException {
            return replaceDeviceClassWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceDeviceClass request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2DeviceClass> _callback) throws ApiException {
            return replaceDeviceClassAsync(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified DeviceClass
     * @param name name of the DeviceClass (required)
     * @param body  (required)
     * @return APIreplaceDeviceClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceDeviceClassRequest replaceDeviceClass(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2DeviceClass body) {
        return new APIreplaceDeviceClassRequest(name, body);
    }
    private okhttp3.Call replaceNamespacedResourceClaimCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call replaceNamespacedResourceClaimValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedResourceClaim(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedResourceClaim(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedResourceClaim(Async)");
        }

        return replaceNamespacedResourceClaimCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2ResourceClaim> replaceNamespacedResourceClaimWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedResourceClaimValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedResourceClaimAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedResourceClaimValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedResourceClaimRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1beta2ResourceClaim body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIreplaceNamespacedResourceClaimRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceNamespacedResourceClaimRequest
         */
        public APIreplaceNamespacedResourceClaimRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedResourceClaimRequest
         */
        public APIreplaceNamespacedResourceClaimRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedResourceClaimRequest
         */
        public APIreplaceNamespacedResourceClaimRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceNamespacedResourceClaimRequest
         */
        public APIreplaceNamespacedResourceClaimRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedResourceClaim
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceNamespacedResourceClaimCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedResourceClaim request
         * @return V1beta2ResourceClaim
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaim execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaim> localVarResp = replaceNamespacedResourceClaimWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedResourceClaim request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaim&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaim> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedResourceClaimWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedResourceClaim request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {
            return replaceNamespacedResourceClaimAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified ResourceClaim
     * @param name name of the ResourceClaim (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIreplaceNamespacedResourceClaimRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedResourceClaimRequest replaceNamespacedResourceClaim(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body) {
        return new APIreplaceNamespacedResourceClaimRequest(name, namespace, body);
    }
    private okhttp3.Call replaceNamespacedResourceClaimStatusCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaims/{name}/status"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call replaceNamespacedResourceClaimStatusValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedResourceClaimStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedResourceClaimStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedResourceClaimStatus(Async)");
        }

        return replaceNamespacedResourceClaimStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2ResourceClaim> replaceNamespacedResourceClaimStatusWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedResourceClaimStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedResourceClaimStatusAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedResourceClaimStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaim>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedResourceClaimStatusRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1beta2ResourceClaim body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIreplaceNamespacedResourceClaimStatusRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceNamespacedResourceClaimStatusRequest
         */
        public APIreplaceNamespacedResourceClaimStatusRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedResourceClaimStatusRequest
         */
        public APIreplaceNamespacedResourceClaimStatusRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedResourceClaimStatusRequest
         */
        public APIreplaceNamespacedResourceClaimStatusRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceNamespacedResourceClaimStatusRequest
         */
        public APIreplaceNamespacedResourceClaimStatusRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedResourceClaimStatus
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceNamespacedResourceClaimStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedResourceClaimStatus request
         * @return V1beta2ResourceClaim
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaim execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaim> localVarResp = replaceNamespacedResourceClaimStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedResourceClaimStatus request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaim&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaim> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedResourceClaimStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedResourceClaimStatus request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaim> _callback) throws ApiException {
            return replaceNamespacedResourceClaimStatusAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace status of the specified ResourceClaim
     * @param name name of the ResourceClaim (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIreplaceNamespacedResourceClaimStatusRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedResourceClaimStatusRequest replaceNamespacedResourceClaimStatus(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaim body) {
        return new APIreplaceNamespacedResourceClaimStatusRequest(name, namespace, body);
    }
    private okhttp3.Call replaceNamespacedResourceClaimTemplateCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/namespaces/{namespace}/resourceclaimtemplates/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()))
            .replace("{" + "namespace" + "}", localVarApiClient.escapeString(namespace.toString()));

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call replaceNamespacedResourceClaimTemplateValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedResourceClaimTemplate(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedResourceClaimTemplate(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedResourceClaimTemplate(Async)");
        }

        return replaceNamespacedResourceClaimTemplateCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2ResourceClaimTemplate> replaceNamespacedResourceClaimTemplateWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedResourceClaimTemplateValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedResourceClaimTemplateAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedResourceClaimTemplateValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceClaimTemplate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedResourceClaimTemplateRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1beta2ResourceClaimTemplate body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIreplaceNamespacedResourceClaimTemplateRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceNamespacedResourceClaimTemplateRequest
         */
        public APIreplaceNamespacedResourceClaimTemplateRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedResourceClaimTemplateRequest
         */
        public APIreplaceNamespacedResourceClaimTemplateRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedResourceClaimTemplateRequest
         */
        public APIreplaceNamespacedResourceClaimTemplateRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceNamespacedResourceClaimTemplateRequest
         */
        public APIreplaceNamespacedResourceClaimTemplateRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedResourceClaimTemplate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceNamespacedResourceClaimTemplateCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedResourceClaimTemplate request
         * @return V1beta2ResourceClaimTemplate
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceClaimTemplate execute() throws ApiException {
            ApiResponse<V1beta2ResourceClaimTemplate> localVarResp = replaceNamespacedResourceClaimTemplateWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedResourceClaimTemplate request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceClaimTemplate&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceClaimTemplate> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedResourceClaimTemplateWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedResourceClaimTemplate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceClaimTemplate> _callback) throws ApiException {
            return replaceNamespacedResourceClaimTemplateAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified ResourceClaimTemplate
     * @param name name of the ResourceClaimTemplate (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIreplaceNamespacedResourceClaimTemplateRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedResourceClaimTemplateRequest replaceNamespacedResourceClaimTemplate(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1beta2ResourceClaimTemplate body) {
        return new APIreplaceNamespacedResourceClaimTemplateRequest(name, namespace, body);
    }
    private okhttp3.Call replaceResourceSliceCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2ResourceSlice body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/resource.k8s.io/v1beta2/resourceslices/{name}"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

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
            "application/json",
            "application/yaml",
            "application/vnd.kubernetes.protobuf",
            "application/cbor"
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
    private okhttp3.Call replaceResourceSliceValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2ResourceSlice body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceResourceSlice(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceResourceSlice(Async)");
        }

        return replaceResourceSliceCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1beta2ResourceSlice> replaceResourceSliceWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2ResourceSlice body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceResourceSliceValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceResourceSliceAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2ResourceSlice body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceResourceSliceValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1beta2ResourceSlice>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceResourceSliceRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final V1beta2ResourceSlice body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIreplaceResourceSliceRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2ResourceSlice body) {
            this.name = name;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceResourceSliceRequest
         */
        public APIreplaceResourceSliceRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceResourceSliceRequest
         */
        public APIreplaceResourceSliceRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceResourceSliceRequest
         */
        public APIreplaceResourceSliceRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceResourceSliceRequest
         */
        public APIreplaceResourceSliceRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceResourceSlice
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return replaceResourceSliceCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceResourceSlice request
         * @return V1beta2ResourceSlice
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1beta2ResourceSlice execute() throws ApiException {
            ApiResponse<V1beta2ResourceSlice> localVarResp = replaceResourceSliceWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceResourceSlice request with HTTP info returned
         * @return ApiResponse&lt;V1beta2ResourceSlice&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1beta2ResourceSlice> executeWithHttpInfo() throws ApiException {
            return replaceResourceSliceWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceResourceSlice request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1beta2ResourceSlice> _callback) throws ApiException {
            return replaceResourceSliceAsync(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified ResourceSlice
     * @param name name of the ResourceSlice (required)
     * @param body  (required)
     * @return APIreplaceResourceSliceRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceResourceSliceRequest replaceResourceSlice(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1beta2ResourceSlice body) {
        return new APIreplaceResourceSliceRequest(name, body);
    }
}
