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
import io.kubernetes.client.openapi.models.V1HorizontalPodAutoscaler;
import io.kubernetes.client.openapi.models.V1HorizontalPodAutoscalerList;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.models.V1Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoscalingV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AutoscalingV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AutoscalingV1Api(ApiClient apiClient) {
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

    private okhttp3.Call createNamespacedHorizontalPodAutoscalerCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers"
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
    private okhttp3.Call createNamespacedHorizontalPodAutoscalerValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedHorizontalPodAutoscaler(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedHorizontalPodAutoscaler(Async)");
        }

        return createNamespacedHorizontalPodAutoscalerCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscaler> createNamespacedHorizontalPodAutoscalerWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createNamespacedHorizontalPodAutoscalerValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNamespacedHorizontalPodAutoscalerAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNamespacedHorizontalPodAutoscalerValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateNamespacedHorizontalPodAutoscalerRequest {
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1HorizontalPodAutoscaler body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIcreateNamespacedHorizontalPodAutoscalerRequest(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body) {
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateNamespacedHorizontalPodAutoscalerRequest
         */
        public APIcreateNamespacedHorizontalPodAutoscalerRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateNamespacedHorizontalPodAutoscalerRequest
         */
        public APIcreateNamespacedHorizontalPodAutoscalerRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateNamespacedHorizontalPodAutoscalerRequest
         */
        public APIcreateNamespacedHorizontalPodAutoscalerRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateNamespacedHorizontalPodAutoscalerRequest
         */
        public APIcreateNamespacedHorizontalPodAutoscalerRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createNamespacedHorizontalPodAutoscaler
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
            return createNamespacedHorizontalPodAutoscalerCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createNamespacedHorizontalPodAutoscaler request
         * @return V1HorizontalPodAutoscaler
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
        public V1HorizontalPodAutoscaler execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscaler> localVarResp = createNamespacedHorizontalPodAutoscalerWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createNamespacedHorizontalPodAutoscaler request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscaler&gt;
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
        public ApiResponse<V1HorizontalPodAutoscaler> executeWithHttpInfo() throws ApiException {
            return createNamespacedHorizontalPodAutoscalerWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createNamespacedHorizontalPodAutoscaler request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {
            return createNamespacedHorizontalPodAutoscalerAsync(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * create a HorizontalPodAutoscaler
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIcreateNamespacedHorizontalPodAutoscalerRequest
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
    public APIcreateNamespacedHorizontalPodAutoscalerRequest createNamespacedHorizontalPodAutoscaler(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body) {
        return new APIcreateNamespacedHorizontalPodAutoscalerRequest(namespace, body);
    }
    private okhttp3.Call deleteCollectionNamespacedHorizontalPodAutoscalerCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers"
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
    private okhttp3.Call deleteCollectionNamespacedHorizontalPodAutoscalerValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteCollectionNamespacedHorizontalPodAutoscaler(Async)");
        }

        return deleteCollectionNamespacedHorizontalPodAutoscalerCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);

    }


    private ApiResponse<V1Status> deleteCollectionNamespacedHorizontalPodAutoscalerWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionNamespacedHorizontalPodAutoscalerValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionNamespacedHorizontalPodAutoscalerAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionNamespacedHorizontalPodAutoscalerValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest {
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

        private APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest(@jakarta.annotation.Nonnull String namespace) {
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionNamespacedHorizontalPodAutoscaler
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
            return deleteCollectionNamespacedHorizontalPodAutoscalerCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }

        /**
         * Execute deleteCollectionNamespacedHorizontalPodAutoscaler request
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
            ApiResponse<V1Status> localVarResp = deleteCollectionNamespacedHorizontalPodAutoscalerWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionNamespacedHorizontalPodAutoscaler request with HTTP info returned
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
            return deleteCollectionNamespacedHorizontalPodAutoscalerWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        }

        /**
         * Execute deleteCollectionNamespacedHorizontalPodAutoscaler request (asynchronously)
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
            return deleteCollectionNamespacedHorizontalPodAutoscalerAsync(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }
    }

    /**
     *
     * delete collection of HorizontalPodAutoscaler
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest deleteCollectionNamespacedHorizontalPodAutoscaler(@jakarta.annotation.Nonnull String namespace) {
        return new APIdeleteCollectionNamespacedHorizontalPodAutoscalerRequest(namespace);
    }
    private okhttp3.Call deleteNamespacedHorizontalPodAutoscalerCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}"
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
    private okhttp3.Call deleteNamespacedHorizontalPodAutoscalerValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedHorizontalPodAutoscaler(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedHorizontalPodAutoscaler(Async)");
        }

        return deleteNamespacedHorizontalPodAutoscalerCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);

    }


    private ApiResponse<V1Status> deleteNamespacedHorizontalPodAutoscalerWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteNamespacedHorizontalPodAutoscalerValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteNamespacedHorizontalPodAutoscalerAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable Integer gracePeriodSeconds, @jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential, @jakarta.annotation.Nullable Boolean orphanDependents, @jakarta.annotation.Nullable String propagationPolicy, @jakarta.annotation.Nullable V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNamespacedHorizontalPodAutoscalerValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteNamespacedHorizontalPodAutoscalerRequest {
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

        private APIdeleteNamespacedHorizontalPodAutoscalerRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteNamespacedHorizontalPodAutoscalerRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteNamespacedHorizontalPodAutoscalerRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteNamespacedHorizontalPodAutoscalerRequest gracePeriodSeconds(@jakarta.annotation.Nullable Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set ignoreStoreReadErrorWithClusterBreakingPotential
         * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
         * @return APIdeleteNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteNamespacedHorizontalPodAutoscalerRequest ignoreStoreReadErrorWithClusterBreakingPotential(@jakarta.annotation.Nullable Boolean ignoreStoreReadErrorWithClusterBreakingPotential) {
            this.ignoreStoreReadErrorWithClusterBreakingPotential = ignoreStoreReadErrorWithClusterBreakingPotential;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteNamespacedHorizontalPodAutoscalerRequest orphanDependents(@jakarta.annotation.Nullable Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteNamespacedHorizontalPodAutoscalerRequest propagationPolicy(@jakarta.annotation.Nullable String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteNamespacedHorizontalPodAutoscalerRequest
         */
        public APIdeleteNamespacedHorizontalPodAutoscalerRequest body(@jakarta.annotation.Nullable V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteNamespacedHorizontalPodAutoscaler
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
            return deleteNamespacedHorizontalPodAutoscalerCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }

        /**
         * Execute deleteNamespacedHorizontalPodAutoscaler request
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
            ApiResponse<V1Status> localVarResp = deleteNamespacedHorizontalPodAutoscalerWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteNamespacedHorizontalPodAutoscaler request with HTTP info returned
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
            return deleteNamespacedHorizontalPodAutoscalerWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
        }

        /**
         * Execute deleteNamespacedHorizontalPodAutoscaler request (asynchronously)
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
            return deleteNamespacedHorizontalPodAutoscalerAsync(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        }
    }

    /**
     *
     * delete a HorizontalPodAutoscaler
     * @param name name of the HorizontalPodAutoscaler (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIdeleteNamespacedHorizontalPodAutoscalerRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteNamespacedHorizontalPodAutoscalerRequest deleteNamespacedHorizontalPodAutoscaler(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
        return new APIdeleteNamespacedHorizontalPodAutoscalerRequest(name, namespace);
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
        String localVarPath = "/apis/autoscaling/v1/";

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
    private okhttp3.Call listHorizontalPodAutoscalerForAllNamespacesCall(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/horizontalpodautoscalers";

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
    private okhttp3.Call listHorizontalPodAutoscalerForAllNamespacesValidateBeforeCall(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        return listHorizontalPodAutoscalerForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscalerList> listHorizontalPodAutoscalerForAllNamespacesWithHttpInfo(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listHorizontalPodAutoscalerForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscalerList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listHorizontalPodAutoscalerForAllNamespacesAsync(@jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1HorizontalPodAutoscalerList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listHorizontalPodAutoscalerForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscalerList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistHorizontalPodAutoscalerForAllNamespacesRequest {
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

        private APIlistHorizontalPodAutoscalerForAllNamespacesRequest() {
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
         */
        public APIlistHorizontalPodAutoscalerForAllNamespacesRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listHorizontalPodAutoscalerForAllNamespaces
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
            return listHorizontalPodAutoscalerForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listHorizontalPodAutoscalerForAllNamespaces request
         * @return V1HorizontalPodAutoscalerList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1HorizontalPodAutoscalerList execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscalerList> localVarResp = listHorizontalPodAutoscalerForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listHorizontalPodAutoscalerForAllNamespaces request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscalerList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1HorizontalPodAutoscalerList> executeWithHttpInfo() throws ApiException {
            return listHorizontalPodAutoscalerForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listHorizontalPodAutoscalerForAllNamespaces request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscalerList> _callback) throws ApiException {
            return listHorizontalPodAutoscalerForAllNamespacesAsync(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind HorizontalPodAutoscaler
     * @return APIlistHorizontalPodAutoscalerForAllNamespacesRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistHorizontalPodAutoscalerForAllNamespacesRequest listHorizontalPodAutoscalerForAllNamespaces() {
        return new APIlistHorizontalPodAutoscalerForAllNamespacesRequest();
    }
    private okhttp3.Call listNamespacedHorizontalPodAutoscalerCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers"
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
    private okhttp3.Call listNamespacedHorizontalPodAutoscalerValidateBeforeCall(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listNamespacedHorizontalPodAutoscaler(Async)");
        }

        return listNamespacedHorizontalPodAutoscalerCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscalerList> listNamespacedHorizontalPodAutoscalerWithHttpInfo(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listNamespacedHorizontalPodAutoscalerValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscalerList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listNamespacedHorizontalPodAutoscalerAsync(@jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable Boolean allowWatchBookmarks, @jakarta.annotation.Nullable String _continue, @jakarta.annotation.Nullable String fieldSelector, @jakarta.annotation.Nullable String labelSelector, @jakarta.annotation.Nullable Integer limit, @jakarta.annotation.Nullable String resourceVersion, @jakarta.annotation.Nullable String resourceVersionMatch, @jakarta.annotation.Nullable Boolean sendInitialEvents, @jakarta.annotation.Nullable Integer timeoutSeconds, @jakarta.annotation.Nullable Boolean watch, final ApiCallback<V1HorizontalPodAutoscalerList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listNamespacedHorizontalPodAutoscalerValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscalerList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistNamespacedHorizontalPodAutoscalerRequest {
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

        private APIlistNamespacedHorizontalPodAutoscalerRequest(@jakarta.annotation.Nonnull String namespace) {
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest allowWatchBookmarks(@jakarta.annotation.Nullable Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest _continue(@jakarta.annotation.Nullable String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest fieldSelector(@jakarta.annotation.Nullable String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest labelSelector(@jakarta.annotation.Nullable String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest limit(@jakarta.annotation.Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest resourceVersion(@jakarta.annotation.Nullable String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest resourceVersionMatch(@jakarta.annotation.Nullable String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest sendInitialEvents(@jakarta.annotation.Nullable Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest timeoutSeconds(@jakarta.annotation.Nullable Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistNamespacedHorizontalPodAutoscalerRequest
         */
        public APIlistNamespacedHorizontalPodAutoscalerRequest watch(@jakarta.annotation.Nullable Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listNamespacedHorizontalPodAutoscaler
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
            return listNamespacedHorizontalPodAutoscalerCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listNamespacedHorizontalPodAutoscaler request
         * @return V1HorizontalPodAutoscalerList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1HorizontalPodAutoscalerList execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscalerList> localVarResp = listNamespacedHorizontalPodAutoscalerWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listNamespacedHorizontalPodAutoscaler request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscalerList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1HorizontalPodAutoscalerList> executeWithHttpInfo() throws ApiException {
            return listNamespacedHorizontalPodAutoscalerWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listNamespacedHorizontalPodAutoscaler request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscalerList> _callback) throws ApiException {
            return listNamespacedHorizontalPodAutoscalerAsync(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind HorizontalPodAutoscaler
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIlistNamespacedHorizontalPodAutoscalerRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistNamespacedHorizontalPodAutoscalerRequest listNamespacedHorizontalPodAutoscaler(@jakarta.annotation.Nonnull String namespace) {
        return new APIlistNamespacedHorizontalPodAutoscalerRequest(namespace);
    }
    private okhttp3.Call patchNamespacedHorizontalPodAutoscalerCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}"
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
    private okhttp3.Call patchNamespacedHorizontalPodAutoscalerValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedHorizontalPodAutoscaler(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedHorizontalPodAutoscaler(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedHorizontalPodAutoscaler(Async)");
        }

        return patchNamespacedHorizontalPodAutoscalerCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscaler> patchNamespacedHorizontalPodAutoscalerWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedHorizontalPodAutoscalerValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedHorizontalPodAutoscalerAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedHorizontalPodAutoscalerValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedHorizontalPodAutoscalerRequest {
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

        private APIpatchNamespacedHorizontalPodAutoscalerRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerRequest force(@jakarta.annotation.Nullable Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedHorizontalPodAutoscaler
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
            return patchNamespacedHorizontalPodAutoscalerCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedHorizontalPodAutoscaler request
         * @return V1HorizontalPodAutoscaler
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
        public V1HorizontalPodAutoscaler execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscaler> localVarResp = patchNamespacedHorizontalPodAutoscalerWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedHorizontalPodAutoscaler request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscaler&gt;
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
        public ApiResponse<V1HorizontalPodAutoscaler> executeWithHttpInfo() throws ApiException {
            return patchNamespacedHorizontalPodAutoscalerWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedHorizontalPodAutoscaler request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {
            return patchNamespacedHorizontalPodAutoscalerAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update the specified HorizontalPodAutoscaler
     * @param name name of the HorizontalPodAutoscaler (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIpatchNamespacedHorizontalPodAutoscalerRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedHorizontalPodAutoscalerRequest patchNamespacedHorizontalPodAutoscaler(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
        return new APIpatchNamespacedHorizontalPodAutoscalerRequest(name, namespace, body);
    }
    private okhttp3.Call patchNamespacedHorizontalPodAutoscalerStatusCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status"
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
    private okhttp3.Call patchNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedHorizontalPodAutoscalerStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedHorizontalPodAutoscalerStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedHorizontalPodAutoscalerStatus(Async)");
        }

        return patchNamespacedHorizontalPodAutoscalerStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscaler> patchNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedHorizontalPodAutoscalerStatusAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, @jakarta.annotation.Nullable Boolean force, final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedHorizontalPodAutoscalerStatusRequest {
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

        private APIpatchNamespacedHorizontalPodAutoscalerStatusRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerStatusRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerStatusRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerStatusRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerStatusRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIpatchNamespacedHorizontalPodAutoscalerStatusRequest force(@jakarta.annotation.Nullable Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedHorizontalPodAutoscalerStatus
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
            return patchNamespacedHorizontalPodAutoscalerStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedHorizontalPodAutoscalerStatus request
         * @return V1HorizontalPodAutoscaler
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
        public V1HorizontalPodAutoscaler execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscaler> localVarResp = patchNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedHorizontalPodAutoscalerStatus request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscaler&gt;
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
        public ApiResponse<V1HorizontalPodAutoscaler> executeWithHttpInfo() throws ApiException {
            return patchNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedHorizontalPodAutoscalerStatus request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {
            return patchNamespacedHorizontalPodAutoscalerStatusAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update status of the specified HorizontalPodAutoscaler
     * @param name name of the HorizontalPodAutoscaler (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIpatchNamespacedHorizontalPodAutoscalerStatusRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedHorizontalPodAutoscalerStatusRequest patchNamespacedHorizontalPodAutoscalerStatus(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1Patch body) {
        return new APIpatchNamespacedHorizontalPodAutoscalerStatusRequest(name, namespace, body);
    }
    private okhttp3.Call readNamespacedHorizontalPodAutoscalerCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}"
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
    private okhttp3.Call readNamespacedHorizontalPodAutoscalerValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedHorizontalPodAutoscaler(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedHorizontalPodAutoscaler(Async)");
        }

        return readNamespacedHorizontalPodAutoscalerCall(name, namespace, pretty, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscaler> readNamespacedHorizontalPodAutoscalerWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedHorizontalPodAutoscalerValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readNamespacedHorizontalPodAutoscalerAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedHorizontalPodAutoscalerValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadNamespacedHorizontalPodAutoscalerRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;

        private APIreadNamespacedHorizontalPodAutoscalerRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadNamespacedHorizontalPodAutoscalerRequest
         */
        public APIreadNamespacedHorizontalPodAutoscalerRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readNamespacedHorizontalPodAutoscaler
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
            return readNamespacedHorizontalPodAutoscalerCall(name, namespace, pretty, _callback);
        }

        /**
         * Execute readNamespacedHorizontalPodAutoscaler request
         * @return V1HorizontalPodAutoscaler
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1HorizontalPodAutoscaler execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscaler> localVarResp = readNamespacedHorizontalPodAutoscalerWithHttpInfo(name, namespace, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readNamespacedHorizontalPodAutoscaler request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscaler&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1HorizontalPodAutoscaler> executeWithHttpInfo() throws ApiException {
            return readNamespacedHorizontalPodAutoscalerWithHttpInfo(name, namespace, pretty);
        }

        /**
         * Execute readNamespacedHorizontalPodAutoscaler request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {
            return readNamespacedHorizontalPodAutoscalerAsync(name, namespace, pretty, _callback);
        }
    }

    /**
     *
     * read the specified HorizontalPodAutoscaler
     * @param name name of the HorizontalPodAutoscaler (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIreadNamespacedHorizontalPodAutoscalerRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadNamespacedHorizontalPodAutoscalerRequest readNamespacedHorizontalPodAutoscaler(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
        return new APIreadNamespacedHorizontalPodAutoscalerRequest(name, namespace);
    }
    private okhttp3.Call readNamespacedHorizontalPodAutoscalerStatusCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status"
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
    private okhttp3.Call readNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedHorizontalPodAutoscalerStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedHorizontalPodAutoscalerStatus(Async)");
        }

        return readNamespacedHorizontalPodAutoscalerStatusCall(name, namespace, pretty, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscaler> readNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readNamespacedHorizontalPodAutoscalerStatusAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nullable String pretty, final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadNamespacedHorizontalPodAutoscalerStatusRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nullable
        private String pretty;

        private APIreadNamespacedHorizontalPodAutoscalerStatusRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIreadNamespacedHorizontalPodAutoscalerStatusRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readNamespacedHorizontalPodAutoscalerStatus
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
            return readNamespacedHorizontalPodAutoscalerStatusCall(name, namespace, pretty, _callback);
        }

        /**
         * Execute readNamespacedHorizontalPodAutoscalerStatus request
         * @return V1HorizontalPodAutoscaler
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1HorizontalPodAutoscaler execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscaler> localVarResp = readNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(name, namespace, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readNamespacedHorizontalPodAutoscalerStatus request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscaler&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1HorizontalPodAutoscaler> executeWithHttpInfo() throws ApiException {
            return readNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(name, namespace, pretty);
        }

        /**
         * Execute readNamespacedHorizontalPodAutoscalerStatus request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {
            return readNamespacedHorizontalPodAutoscalerStatusAsync(name, namespace, pretty, _callback);
        }
    }

    /**
     *
     * read status of the specified HorizontalPodAutoscaler
     * @param name name of the HorizontalPodAutoscaler (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIreadNamespacedHorizontalPodAutoscalerStatusRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadNamespacedHorizontalPodAutoscalerStatusRequest readNamespacedHorizontalPodAutoscalerStatus(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace) {
        return new APIreadNamespacedHorizontalPodAutoscalerStatusRequest(name, namespace);
    }
    private okhttp3.Call replaceNamespacedHorizontalPodAutoscalerCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}"
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
    private okhttp3.Call replaceNamespacedHorizontalPodAutoscalerValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedHorizontalPodAutoscaler(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedHorizontalPodAutoscaler(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedHorizontalPodAutoscaler(Async)");
        }

        return replaceNamespacedHorizontalPodAutoscalerCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscaler> replaceNamespacedHorizontalPodAutoscalerWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedHorizontalPodAutoscalerValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedHorizontalPodAutoscalerAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedHorizontalPodAutoscalerValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedHorizontalPodAutoscalerRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1HorizontalPodAutoscaler body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIreplaceNamespacedHorizontalPodAutoscalerRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceNamespacedHorizontalPodAutoscalerRequest
         */
        public APIreplaceNamespacedHorizontalPodAutoscalerRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedHorizontalPodAutoscalerRequest
         */
        public APIreplaceNamespacedHorizontalPodAutoscalerRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedHorizontalPodAutoscalerRequest
         */
        public APIreplaceNamespacedHorizontalPodAutoscalerRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceNamespacedHorizontalPodAutoscalerRequest
         */
        public APIreplaceNamespacedHorizontalPodAutoscalerRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedHorizontalPodAutoscaler
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
            return replaceNamespacedHorizontalPodAutoscalerCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedHorizontalPodAutoscaler request
         * @return V1HorizontalPodAutoscaler
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
        public V1HorizontalPodAutoscaler execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscaler> localVarResp = replaceNamespacedHorizontalPodAutoscalerWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedHorizontalPodAutoscaler request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscaler&gt;
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
        public ApiResponse<V1HorizontalPodAutoscaler> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedHorizontalPodAutoscalerWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedHorizontalPodAutoscaler request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {
            return replaceNamespacedHorizontalPodAutoscalerAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified HorizontalPodAutoscaler
     * @param name name of the HorizontalPodAutoscaler (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIreplaceNamespacedHorizontalPodAutoscalerRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedHorizontalPodAutoscalerRequest replaceNamespacedHorizontalPodAutoscaler(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body) {
        return new APIreplaceNamespacedHorizontalPodAutoscalerRequest(name, namespace, body);
    }
    private okhttp3.Call replaceNamespacedHorizontalPodAutoscalerStatusCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/autoscaling/v1/namespaces/{namespace}/horizontalpodautoscalers/{name}/status"
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
    private okhttp3.Call replaceNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedHorizontalPodAutoscalerStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedHorizontalPodAutoscalerStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedHorizontalPodAutoscalerStatus(Async)");
        }

        return replaceNamespacedHorizontalPodAutoscalerStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1HorizontalPodAutoscaler> replaceNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedHorizontalPodAutoscalerStatusAsync(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body, @jakarta.annotation.Nullable String pretty, @jakarta.annotation.Nullable String dryRun, @jakarta.annotation.Nullable String fieldManager, @jakarta.annotation.Nullable String fieldValidation, final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedHorizontalPodAutoscalerStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1HorizontalPodAutoscaler>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest {
        @jakarta.annotation.Nonnull
        private final String name;
        @jakarta.annotation.Nonnull
        private final String namespace;
        @jakarta.annotation.Nonnull
        private final V1HorizontalPodAutoscaler body;
        @jakarta.annotation.Nullable
        private String pretty;
        @jakarta.annotation.Nullable
        private String dryRun;
        @jakarta.annotation.Nullable
        private String fieldManager;
        @jakarta.annotation.Nullable
        private String fieldValidation;

        private APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest pretty(@jakarta.annotation.Nullable String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest dryRun(@jakarta.annotation.Nullable String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest fieldManager(@jakarta.annotation.Nullable String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest
         */
        public APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest fieldValidation(@jakarta.annotation.Nullable String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedHorizontalPodAutoscalerStatus
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
            return replaceNamespacedHorizontalPodAutoscalerStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedHorizontalPodAutoscalerStatus request
         * @return V1HorizontalPodAutoscaler
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
        public V1HorizontalPodAutoscaler execute() throws ApiException {
            ApiResponse<V1HorizontalPodAutoscaler> localVarResp = replaceNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedHorizontalPodAutoscalerStatus request with HTTP info returned
         * @return ApiResponse&lt;V1HorizontalPodAutoscaler&gt;
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
        public ApiResponse<V1HorizontalPodAutoscaler> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedHorizontalPodAutoscalerStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedHorizontalPodAutoscalerStatus request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1HorizontalPodAutoscaler> _callback) throws ApiException {
            return replaceNamespacedHorizontalPodAutoscalerStatusAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace status of the specified HorizontalPodAutoscaler
     * @param name name of the HorizontalPodAutoscaler (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest replaceNamespacedHorizontalPodAutoscalerStatus(@jakarta.annotation.Nonnull String name, @jakarta.annotation.Nonnull String namespace, @jakarta.annotation.Nonnull V1HorizontalPodAutoscaler body) {
        return new APIreplaceNamespacedHorizontalPodAutoscalerStatusRequest(name, namespace, body);
    }
}
