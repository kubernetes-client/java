/*
Copyright 2026 The Kubernetes Authors.
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
import io.kubernetes.client.openapi.models.V1RuntimeClass;
import io.kubernetes.client.openapi.models.V1RuntimeClassList;
import io.kubernetes.client.openapi.models.V1Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NodeV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NodeV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public NodeV1Api(ApiClient apiClient) {
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

    private okhttp3.Call createRuntimeClassCall(@jakarta.annotation.Nonnull V1RuntimeClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/node.k8s.io/v1/runtimeclasses";

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
    private okhttp3.Call createRuntimeClassValidateBeforeCall(@jakarta.annotation.Nonnull V1RuntimeClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createRuntimeClass(Async)");
        }

        return createRuntimeClassCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1RuntimeClass> createRuntimeClassWithHttpInfo(@jakarta.annotation.Nonnull V1RuntimeClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createRuntimeClassValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1RuntimeClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createRuntimeClassAsync(@jakarta.annotation.Nonnull V1RuntimeClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1RuntimeClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = createRuntimeClassValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1RuntimeClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateRuntimeClassRequest {
        @jakarta.annotation.Nonnull
        private final V1RuntimeClass body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIcreateRuntimeClassRequest(@jakarta.annotation.Nonnull V1RuntimeClass body) {
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateRuntimeClassRequest
         */
        public APIcreateRuntimeClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateRuntimeClassRequest
         */
        public APIcreateRuntimeClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateRuntimeClassRequest
         */
        public APIcreateRuntimeClassRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateRuntimeClassRequest
         */
        public APIcreateRuntimeClassRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createRuntimeClass
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
            return createRuntimeClassCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createRuntimeClass request
         * @return V1RuntimeClass
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
        public V1RuntimeClass execute() throws ApiException {
            ApiResponse<V1RuntimeClass> localVarResp = createRuntimeClassWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createRuntimeClass request with HTTP info returned
         * @return ApiResponse&lt;V1RuntimeClass&gt;
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
        public ApiResponse<V1RuntimeClass> executeWithHttpInfo() throws ApiException {
            return createRuntimeClassWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createRuntimeClass request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1RuntimeClass> _callback) throws ApiException {
            return createRuntimeClassAsync(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * create a RuntimeClass
     * @param body  (required)
     * @return APIcreateRuntimeClassRequest
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
    public APIcreateRuntimeClassRequest createRuntimeClass(@jakarta.annotation.Nonnull V1RuntimeClass body) {
        return new APIcreateRuntimeClassRequest(body);
    }
    private okhttp3.Call deleteCollectionRuntimeClassCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/node.k8s.io/v1/runtimeclasses";

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
    private okhttp3.Call deleteCollectionRuntimeClassValidateBeforeCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        return deleteCollectionRuntimeClassCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);

    }


    private ApiResponse<V1Status> deleteCollectionRuntimeClassWithHttpInfo(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionRuntimeClassValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionRuntimeClassAsync(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionRuntimeClassValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionRuntimeClassRequest {
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

        private APIdeleteCollectionRuntimeClassRequest() {
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionRuntimeClassRequest
         */
        public APIdeleteCollectionRuntimeClassRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionRuntimeClass
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
            return deleteCollectionRuntimeClassCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }

        /**
         * Execute deleteCollectionRuntimeClass request
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
            ApiResponse<V1Status> localVarResp = deleteCollectionRuntimeClassWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionRuntimeClass request with HTTP info returned
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
            return deleteCollectionRuntimeClassWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        }

        /**
         * Execute deleteCollectionRuntimeClass request (asynchronously)
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
            return deleteCollectionRuntimeClassAsync(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }
    }

    /**
     *
     * delete collection of RuntimeClass
     * @return APIdeleteCollectionRuntimeClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionRuntimeClassRequest deleteCollectionRuntimeClass() {
        return new APIdeleteCollectionRuntimeClassRequest();
    }
    private okhttp3.Call deleteRuntimeClassCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/node.k8s.io/v1/runtimeclasses/{name}"
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
    private okhttp3.Call deleteRuntimeClassValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteRuntimeClass(Async)");
        }

        return deleteRuntimeClassCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);

    }


    private ApiResponse<V1Status> deleteRuntimeClassWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteRuntimeClassValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteRuntimeClassAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteRuntimeClassValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteRuntimeClassRequest {
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

        private APIdeleteRuntimeClassRequest(@jakarta.annotation.Nonnull String name) {
            this.name = name;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteRuntimeClassRequest
         */
        public APIdeleteRuntimeClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteRuntimeClassRequest
         */
        public APIdeleteRuntimeClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteRuntimeClassRequest
         */
        public APIdeleteRuntimeClassRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteRuntimeClassRequest
         */
        public APIdeleteRuntimeClassRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteRuntimeClassRequest
         */
        public APIdeleteRuntimeClassRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteRuntimeClassRequest
         */
        public APIdeleteRuntimeClassRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteRuntimeClassRequest
         */
        public APIdeleteRuntimeClassRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteRuntimeClass
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
            return deleteRuntimeClassCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }

        /**
         * Execute deleteRuntimeClass request
         * @return V1Status
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
        public V1Status execute() throws ApiException {
            ApiResponse<V1Status> localVarResp = deleteRuntimeClassWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteRuntimeClass request with HTTP info returned
         * @return ApiResponse&lt;V1Status&gt;
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
        public ApiResponse<V1Status> executeWithHttpInfo() throws ApiException {
            return deleteRuntimeClassWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
        }

        /**
         * Execute deleteRuntimeClass request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1Status> _callback) throws ApiException {
            return deleteRuntimeClassAsync(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }
    }

    /**
     *
     * delete a RuntimeClass
     * @param name name of the RuntimeClass (required)
     * @return APIdeleteRuntimeClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteRuntimeClassRequest deleteRuntimeClass(@jakarta.annotation.Nonnull String name) {
        return new APIdeleteRuntimeClassRequest(name);
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
        String localVarPath = "/apis/node.k8s.io/v1/";

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
    private okhttp3.Call listRuntimeClassCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/node.k8s.io/v1/runtimeclasses";

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
    private okhttp3.Call listRuntimeClassValidateBeforeCall(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        return listRuntimeClassCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1RuntimeClassList> listRuntimeClassWithHttpInfo(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listRuntimeClassValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1RuntimeClassList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listRuntimeClassAsync(@jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1RuntimeClassList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listRuntimeClassValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1RuntimeClassList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistRuntimeClassRequest {
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

        private APIlistRuntimeClassRequest() {
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistRuntimeClassRequest
         */
        public APIlistRuntimeClassRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listRuntimeClass
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
            return listRuntimeClassCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listRuntimeClass request
         * @return V1RuntimeClassList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1RuntimeClassList execute() throws ApiException {
            ApiResponse<V1RuntimeClassList> localVarResp = listRuntimeClassWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listRuntimeClass request with HTTP info returned
         * @return ApiResponse&lt;V1RuntimeClassList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1RuntimeClassList> executeWithHttpInfo() throws ApiException {
            return listRuntimeClassWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listRuntimeClass request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1RuntimeClassList> _callback) throws ApiException {
            return listRuntimeClassAsync(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind RuntimeClass
     * @return APIlistRuntimeClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistRuntimeClassRequest listRuntimeClass() {
        return new APIlistRuntimeClassRequest();
    }
    private okhttp3.Call patchRuntimeClassCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/node.k8s.io/v1/runtimeclasses/{name}"
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
    private okhttp3.Call patchRuntimeClassValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchRuntimeClass(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchRuntimeClass(Async)");
        }

        return patchRuntimeClassCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1RuntimeClass> patchRuntimeClassWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchRuntimeClassValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1RuntimeClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchRuntimeClassAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback<V1RuntimeClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchRuntimeClassValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1RuntimeClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchRuntimeClassRequest {
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

        private APIpatchRuntimeClassRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body) {
            this.name = name;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchRuntimeClassRequest
         */
        public APIpatchRuntimeClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchRuntimeClassRequest
         */
        public APIpatchRuntimeClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchRuntimeClassRequest
         */
        public APIpatchRuntimeClassRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchRuntimeClassRequest
         */
        public APIpatchRuntimeClassRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchRuntimeClassRequest
         */
        public APIpatchRuntimeClassRequest force(@jakarta.annotation.Nullable Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchRuntimeClass
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
            return patchRuntimeClassCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchRuntimeClass request
         * @return V1RuntimeClass
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
        public V1RuntimeClass execute() throws ApiException {
            ApiResponse<V1RuntimeClass> localVarResp = patchRuntimeClassWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchRuntimeClass request with HTTP info returned
         * @return ApiResponse&lt;V1RuntimeClass&gt;
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
        public ApiResponse<V1RuntimeClass> executeWithHttpInfo() throws ApiException {
            return patchRuntimeClassWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchRuntimeClass request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1RuntimeClass> _callback) throws ApiException {
            return patchRuntimeClassAsync(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update the specified RuntimeClass
     * @param name name of the RuntimeClass (required)
     * @param body  (required)
     * @return APIpatchRuntimeClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchRuntimeClassRequest patchRuntimeClass(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1Patch body) {
        return new APIpatchRuntimeClassRequest(name, body);
    }
    private okhttp3.Call readRuntimeClassCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/node.k8s.io/v1/runtimeclasses/{name}"
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
    private okhttp3.Call readRuntimeClassValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readRuntimeClass(Async)");
        }

        return readRuntimeClassCall(name, pretty, _callback);

    }


    private ApiResponse<V1RuntimeClass> readRuntimeClassWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty) throws ApiException {
        okhttp3.Call localVarCall = readRuntimeClassValidateBeforeCall(name, pretty, null);
        Type localVarReturnType = new TypeToken<V1RuntimeClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readRuntimeClassAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nullable String pretty, final ApiCallback<V1RuntimeClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = readRuntimeClassValidateBeforeCall(name, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1RuntimeClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadRuntimeClassRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nullable
        private String pretty;

        private APIreadRuntimeClassRequest(@jakarta.annotation.Nonnull String name) {
            this.name = name;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadRuntimeClassRequest
         */
        public APIreadRuntimeClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readRuntimeClass
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
            return readRuntimeClassCall(name, pretty, _callback);
        }

        /**
         * Execute readRuntimeClass request
         * @return V1RuntimeClass
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1RuntimeClass execute() throws ApiException {
            ApiResponse<V1RuntimeClass> localVarResp = readRuntimeClassWithHttpInfo(name, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readRuntimeClass request with HTTP info returned
         * @return ApiResponse&lt;V1RuntimeClass&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1RuntimeClass> executeWithHttpInfo() throws ApiException {
            return readRuntimeClassWithHttpInfo(name, pretty);
        }

        /**
         * Execute readRuntimeClass request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1RuntimeClass> _callback) throws ApiException {
            return readRuntimeClassAsync(name, pretty, _callback);
        }
    }

    /**
     *
     * read the specified RuntimeClass
     * @param name name of the RuntimeClass (required)
     * @return APIreadRuntimeClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadRuntimeClassRequest readRuntimeClass(@jakarta.annotation.Nonnull String name) {
        return new APIreadRuntimeClassRequest(name);
    }
    private okhttp3.Call replaceRuntimeClassCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1RuntimeClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/node.k8s.io/v1/runtimeclasses/{name}"
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
    private okhttp3.Call replaceRuntimeClassValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1RuntimeClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceRuntimeClass(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceRuntimeClass(Async)");
        }

        return replaceRuntimeClassCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1RuntimeClass> replaceRuntimeClassWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1RuntimeClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceRuntimeClassValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1RuntimeClass>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceRuntimeClassAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1RuntimeClass body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1RuntimeClass> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceRuntimeClassValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1RuntimeClass>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceRuntimeClassRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final V1RuntimeClass body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIreplaceRuntimeClassRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1RuntimeClass body) {
            this.name = name;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceRuntimeClassRequest
         */
        public APIreplaceRuntimeClassRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceRuntimeClassRequest
         */
        public APIreplaceRuntimeClassRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceRuntimeClassRequest
         */
        public APIreplaceRuntimeClassRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceRuntimeClassRequest
         */
        public APIreplaceRuntimeClassRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceRuntimeClass
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
            return replaceRuntimeClassCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceRuntimeClass request
         * @return V1RuntimeClass
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
        public V1RuntimeClass execute() throws ApiException {
            ApiResponse<V1RuntimeClass> localVarResp = replaceRuntimeClassWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceRuntimeClass request with HTTP info returned
         * @return ApiResponse&lt;V1RuntimeClass&gt;
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
        public ApiResponse<V1RuntimeClass> executeWithHttpInfo() throws ApiException {
            return replaceRuntimeClassWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceRuntimeClass request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1RuntimeClass> _callback) throws ApiException {
            return replaceRuntimeClassAsync(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified RuntimeClass
     * @param name name of the RuntimeClass (required)
     * @param body  (required)
     * @return APIreplaceRuntimeClassRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceRuntimeClassRequest replaceRuntimeClass(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull V1RuntimeClass body) {
        return new APIreplaceRuntimeClassRequest(name, body);
    }
}
