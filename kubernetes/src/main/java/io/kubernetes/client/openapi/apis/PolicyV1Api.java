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
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.models.V1PodDisruptionBudget;
import io.kubernetes.client.openapi.models.V1PodDisruptionBudgetList;
import io.kubernetes.client.openapi.models.V1Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

public class PolicyV1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PolicyV1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public PolicyV1Api(ApiClient apiClient) {
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

    private okhttp3.Call createNamespacedPodDisruptionBudgetCall(String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNamespacedPodDisruptionBudgetValidateBeforeCall(String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedPodDisruptionBudget(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedPodDisruptionBudget(Async)");
        }

        return createNamespacedPodDisruptionBudgetCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1PodDisruptionBudget> createNamespacedPodDisruptionBudgetWithHttpInfo(String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createNamespacedPodDisruptionBudgetValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createNamespacedPodDisruptionBudgetAsync(String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNamespacedPodDisruptionBudgetValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateNamespacedPodDisruptionBudgetRequest {
        private final String namespace;
        private final V1PodDisruptionBudget body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIcreateNamespacedPodDisruptionBudgetRequest(String namespace, V1PodDisruptionBudget body) {
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateNamespacedPodDisruptionBudgetRequest
         */
        public APIcreateNamespacedPodDisruptionBudgetRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateNamespacedPodDisruptionBudgetRequest
         */
        public APIcreateNamespacedPodDisruptionBudgetRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateNamespacedPodDisruptionBudgetRequest
         */
        public APIcreateNamespacedPodDisruptionBudgetRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateNamespacedPodDisruptionBudgetRequest
         */
        public APIcreateNamespacedPodDisruptionBudgetRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createNamespacedPodDisruptionBudget
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return createNamespacedPodDisruptionBudgetCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createNamespacedPodDisruptionBudget request
         * @return V1PodDisruptionBudget
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudget execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudget> localVarResp = createNamespacedPodDisruptionBudgetWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createNamespacedPodDisruptionBudget request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudget&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudget> executeWithHttpInfo() throws ApiException {
            return createNamespacedPodDisruptionBudgetWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createNamespacedPodDisruptionBudget request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {
            return createNamespacedPodDisruptionBudgetAsync(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * create a PodDisruptionBudget
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIcreateNamespacedPodDisruptionBudgetRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateNamespacedPodDisruptionBudgetRequest createNamespacedPodDisruptionBudget(String namespace, V1PodDisruptionBudget body) {
        return new APIcreateNamespacedPodDisruptionBudgetRequest(namespace, body);
    }
    private okhttp3.Call deleteCollectionNamespacedPodDisruptionBudgetCall(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets"
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCollectionNamespacedPodDisruptionBudgetValidateBeforeCall(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteCollectionNamespacedPodDisruptionBudget(Async)");
        }

        return deleteCollectionNamespacedPodDisruptionBudgetCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);

    }


    private ApiResponse<V1Status> deleteCollectionNamespacedPodDisruptionBudgetWithHttpInfo(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionNamespacedPodDisruptionBudgetValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionNamespacedPodDisruptionBudgetAsync(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionNamespacedPodDisruptionBudgetValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionNamespacedPodDisruptionBudgetRequest {
        private final String namespace;
        private String pretty;
        private String _continue;
        private String dryRun;
        private String fieldSelector;
        private Integer gracePeriodSeconds;
        private String labelSelector;
        private Integer limit;
        private Boolean orphanDependents;
        private String propagationPolicy;
        private String resourceVersion;
        private String resourceVersionMatch;
        private Boolean sendInitialEvents;
        private Integer timeoutSeconds;
        private V1DeleteOptions body;

        private APIdeleteCollectionNamespacedPodDisruptionBudgetRequest(String namespace) {
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest fieldSelector(String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest gracePeriodSeconds(Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest orphanDependents(Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest propagationPolicy(String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest resourceVersionMatch(String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest sendInitialEvents(Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest body(V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionNamespacedPodDisruptionBudget
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
            return deleteCollectionNamespacedPodDisruptionBudgetCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }

        /**
         * Execute deleteCollectionNamespacedPodDisruptionBudget request
         * @return V1Status
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1Status execute() throws ApiException {
            ApiResponse<V1Status> localVarResp = deleteCollectionNamespacedPodDisruptionBudgetWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionNamespacedPodDisruptionBudget request with HTTP info returned
         * @return ApiResponse&lt;V1Status&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1Status> executeWithHttpInfo() throws ApiException {
            return deleteCollectionNamespacedPodDisruptionBudgetWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        }

        /**
         * Execute deleteCollectionNamespacedPodDisruptionBudget request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1Status> _callback) throws ApiException {
            return deleteCollectionNamespacedPodDisruptionBudgetAsync(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }
    }

    /**
     *
     * delete collection of PodDisruptionBudget
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIdeleteCollectionNamespacedPodDisruptionBudgetRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionNamespacedPodDisruptionBudgetRequest deleteCollectionNamespacedPodDisruptionBudget(String namespace) {
        return new APIdeleteCollectionNamespacedPodDisruptionBudgetRequest(namespace);
    }
    private okhttp3.Call deleteNamespacedPodDisruptionBudgetCall(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}"
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

        if (orphanDependents != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
        }

        if (propagationPolicy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteNamespacedPodDisruptionBudgetValidateBeforeCall(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedPodDisruptionBudget(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedPodDisruptionBudget(Async)");
        }

        return deleteNamespacedPodDisruptionBudgetCall(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, _callback);

    }


    private ApiResponse<V1Status> deleteNamespacedPodDisruptionBudgetWithHttpInfo(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteNamespacedPodDisruptionBudgetAsync(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteNamespacedPodDisruptionBudgetRequest {
        private final String name;
        private final String namespace;
        private String pretty;
        private String dryRun;
        private Integer gracePeriodSeconds;
        private Boolean orphanDependents;
        private String propagationPolicy;
        private V1DeleteOptions body;

        private APIdeleteNamespacedPodDisruptionBudgetRequest(String name, String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteNamespacedPodDisruptionBudgetRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteNamespacedPodDisruptionBudgetRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteNamespacedPodDisruptionBudgetRequest gracePeriodSeconds(Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteNamespacedPodDisruptionBudgetRequest orphanDependents(Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteNamespacedPodDisruptionBudgetRequest propagationPolicy(String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteNamespacedPodDisruptionBudgetRequest
         */
        public APIdeleteNamespacedPodDisruptionBudgetRequest body(V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteNamespacedPodDisruptionBudget
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return deleteNamespacedPodDisruptionBudgetCall(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, _callback);
        }

        /**
         * Execute deleteNamespacedPodDisruptionBudget request
         * @return V1Status
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1Status execute() throws ApiException {
            ApiResponse<V1Status> localVarResp = deleteNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteNamespacedPodDisruptionBudget request with HTTP info returned
         * @return ApiResponse&lt;V1Status&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1Status> executeWithHttpInfo() throws ApiException {
            return deleteNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);
        }

        /**
         * Execute deleteNamespacedPodDisruptionBudget request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<V1Status> _callback) throws ApiException {
            return deleteNamespacedPodDisruptionBudgetAsync(name, namespace, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, _callback);
        }
    }

    /**
     *
     * delete a PodDisruptionBudget
     * @param name name of the PodDisruptionBudget (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIdeleteNamespacedPodDisruptionBudgetRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteNamespacedPodDisruptionBudgetRequest deleteNamespacedPodDisruptionBudget(String name, String namespace) {
        return new APIdeleteNamespacedPodDisruptionBudgetRequest(name, namespace);
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
        String localVarPath = "/apis/policy/v1/";

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
         <table summary="Response Details" border="1">
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
         <table summary="Response Details" border="1">
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
         <table summary="Response Details" border="1">
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
         <table summary="Response Details" border="1">
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
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIgetAPIResourcesRequest getAPIResources() {
        return new APIgetAPIResourcesRequest();
    }
    private okhttp3.Call listNamespacedPodDisruptionBudgetCall(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets"
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
            "application/json;stream=watch",
            "application/vnd.kubernetes.protobuf;stream=watch"
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
    private okhttp3.Call listNamespacedPodDisruptionBudgetValidateBeforeCall(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listNamespacedPodDisruptionBudget(Async)");
        }

        return listNamespacedPodDisruptionBudgetCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1PodDisruptionBudgetList> listNamespacedPodDisruptionBudgetWithHttpInfo(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listNamespacedPodDisruptionBudgetValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudgetList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listNamespacedPodDisruptionBudgetAsync(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback<V1PodDisruptionBudgetList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listNamespacedPodDisruptionBudgetValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudgetList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistNamespacedPodDisruptionBudgetRequest {
        private final String namespace;
        private String pretty;
        private Boolean allowWatchBookmarks;
        private String _continue;
        private String fieldSelector;
        private String labelSelector;
        private Integer limit;
        private String resourceVersion;
        private String resourceVersionMatch;
        private Boolean sendInitialEvents;
        private Integer timeoutSeconds;
        private Boolean watch;

        private APIlistNamespacedPodDisruptionBudgetRequest(String namespace) {
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest allowWatchBookmarks(Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest fieldSelector(String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest resourceVersionMatch(String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest sendInitialEvents(Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistNamespacedPodDisruptionBudgetRequest
         */
        public APIlistNamespacedPodDisruptionBudgetRequest watch(Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listNamespacedPodDisruptionBudget
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
            return listNamespacedPodDisruptionBudgetCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listNamespacedPodDisruptionBudget request
         * @return V1PodDisruptionBudgetList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudgetList execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudgetList> localVarResp = listNamespacedPodDisruptionBudgetWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listNamespacedPodDisruptionBudget request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudgetList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudgetList> executeWithHttpInfo() throws ApiException {
            return listNamespacedPodDisruptionBudgetWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listNamespacedPodDisruptionBudget request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudgetList> _callback) throws ApiException {
            return listNamespacedPodDisruptionBudgetAsync(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind PodDisruptionBudget
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIlistNamespacedPodDisruptionBudgetRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistNamespacedPodDisruptionBudgetRequest listNamespacedPodDisruptionBudget(String namespace) {
        return new APIlistNamespacedPodDisruptionBudgetRequest(namespace);
    }
    private okhttp3.Call listPodDisruptionBudgetForAllNamespacesCall(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/poddisruptionbudgets";

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
            "application/json;stream=watch",
            "application/vnd.kubernetes.protobuf;stream=watch"
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
    private okhttp3.Call listPodDisruptionBudgetForAllNamespacesValidateBeforeCall(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
        return listPodDisruptionBudgetForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1PodDisruptionBudgetList> listPodDisruptionBudgetForAllNamespacesWithHttpInfo(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listPodDisruptionBudgetForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudgetList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listPodDisruptionBudgetForAllNamespacesAsync(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback<V1PodDisruptionBudgetList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPodDisruptionBudgetForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudgetList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistPodDisruptionBudgetForAllNamespacesRequest {
        private Boolean allowWatchBookmarks;
        private String _continue;
        private String fieldSelector;
        private String labelSelector;
        private Integer limit;
        private String pretty;
        private String resourceVersion;
        private String resourceVersionMatch;
        private Boolean sendInitialEvents;
        private Integer timeoutSeconds;
        private Boolean watch;

        private APIlistPodDisruptionBudgetForAllNamespacesRequest() {
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest allowWatchBookmarks(Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest fieldSelector(String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest resourceVersionMatch(String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest sendInitialEvents(Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
         */
        public APIlistPodDisruptionBudgetForAllNamespacesRequest watch(Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listPodDisruptionBudgetForAllNamespaces
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
            return listPodDisruptionBudgetForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listPodDisruptionBudgetForAllNamespaces request
         * @return V1PodDisruptionBudgetList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudgetList execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudgetList> localVarResp = listPodDisruptionBudgetForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listPodDisruptionBudgetForAllNamespaces request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudgetList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudgetList> executeWithHttpInfo() throws ApiException {
            return listPodDisruptionBudgetForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listPodDisruptionBudgetForAllNamespaces request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudgetList> _callback) throws ApiException {
            return listPodDisruptionBudgetForAllNamespacesAsync(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind PodDisruptionBudget
     * @return APIlistPodDisruptionBudgetForAllNamespacesRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistPodDisruptionBudgetForAllNamespacesRequest listPodDisruptionBudgetForAllNamespaces() {
        return new APIlistPodDisruptionBudgetForAllNamespacesRequest();
    }
    private okhttp3.Call patchNamespacedPodDisruptionBudgetCall(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}"
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
    private okhttp3.Call patchNamespacedPodDisruptionBudgetValidateBeforeCall(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedPodDisruptionBudget(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedPodDisruptionBudget(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedPodDisruptionBudget(Async)");
        }

        return patchNamespacedPodDisruptionBudgetCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1PodDisruptionBudget> patchNamespacedPodDisruptionBudgetWithHttpInfo(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedPodDisruptionBudgetAsync(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedPodDisruptionBudgetRequest {
        private final String name;
        private final String namespace;
        private final V1Patch body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchNamespacedPodDisruptionBudgetRequest(String name, String namespace, V1Patch body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedPodDisruptionBudget
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
            return patchNamespacedPodDisruptionBudgetCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedPodDisruptionBudget request
         * @return V1PodDisruptionBudget
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudget execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudget> localVarResp = patchNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedPodDisruptionBudget request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudget&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudget> executeWithHttpInfo() throws ApiException {
            return patchNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedPodDisruptionBudget request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {
            return patchNamespacedPodDisruptionBudgetAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update the specified PodDisruptionBudget
     * @param name name of the PodDisruptionBudget (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIpatchNamespacedPodDisruptionBudgetRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedPodDisruptionBudgetRequest patchNamespacedPodDisruptionBudget(String name, String namespace, V1Patch body) {
        return new APIpatchNamespacedPodDisruptionBudgetRequest(name, namespace, body);
    }
    private okhttp3.Call patchNamespacedPodDisruptionBudgetStatusCall(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}/status"
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
    private okhttp3.Call patchNamespacedPodDisruptionBudgetStatusValidateBeforeCall(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedPodDisruptionBudgetStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedPodDisruptionBudgetStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedPodDisruptionBudgetStatus(Async)");
        }

        return patchNamespacedPodDisruptionBudgetStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1PodDisruptionBudget> patchNamespacedPodDisruptionBudgetStatusWithHttpInfo(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedPodDisruptionBudgetStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchNamespacedPodDisruptionBudgetStatusAsync(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedPodDisruptionBudgetStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchNamespacedPodDisruptionBudgetStatusRequest {
        private final String name;
        private final String namespace;
        private final V1Patch body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchNamespacedPodDisruptionBudgetStatusRequest(String name, String namespace, V1Patch body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetStatusRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetStatusRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetStatusRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetStatusRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIpatchNamespacedPodDisruptionBudgetStatusRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchNamespacedPodDisruptionBudgetStatus
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
            return patchNamespacedPodDisruptionBudgetStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchNamespacedPodDisruptionBudgetStatus request
         * @return V1PodDisruptionBudget
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudget execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudget> localVarResp = patchNamespacedPodDisruptionBudgetStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchNamespacedPodDisruptionBudgetStatus request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudget&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudget> executeWithHttpInfo() throws ApiException {
            return patchNamespacedPodDisruptionBudgetStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchNamespacedPodDisruptionBudgetStatus request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {
            return patchNamespacedPodDisruptionBudgetStatusAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update status of the specified PodDisruptionBudget
     * @param name name of the PodDisruptionBudget (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIpatchNamespacedPodDisruptionBudgetStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchNamespacedPodDisruptionBudgetStatusRequest patchNamespacedPodDisruptionBudgetStatus(String name, String namespace, V1Patch body) {
        return new APIpatchNamespacedPodDisruptionBudgetStatusRequest(name, namespace, body);
    }
    private okhttp3.Call readNamespacedPodDisruptionBudgetCall(String name, String namespace, String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}"
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
    private okhttp3.Call readNamespacedPodDisruptionBudgetValidateBeforeCall(String name, String namespace, String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedPodDisruptionBudget(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedPodDisruptionBudget(Async)");
        }

        return readNamespacedPodDisruptionBudgetCall(name, namespace, pretty, _callback);

    }


    private ApiResponse<V1PodDisruptionBudget> readNamespacedPodDisruptionBudgetWithHttpInfo(String name, String namespace, String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readNamespacedPodDisruptionBudgetAsync(String name, String namespace, String pretty, final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadNamespacedPodDisruptionBudgetRequest {
        private final String name;
        private final String namespace;
        private String pretty;

        private APIreadNamespacedPodDisruptionBudgetRequest(String name, String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadNamespacedPodDisruptionBudgetRequest
         */
        public APIreadNamespacedPodDisruptionBudgetRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readNamespacedPodDisruptionBudget
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
            return readNamespacedPodDisruptionBudgetCall(name, namespace, pretty, _callback);
        }

        /**
         * Execute readNamespacedPodDisruptionBudget request
         * @return V1PodDisruptionBudget
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudget execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudget> localVarResp = readNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readNamespacedPodDisruptionBudget request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudget&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudget> executeWithHttpInfo() throws ApiException {
            return readNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, pretty);
        }

        /**
         * Execute readNamespacedPodDisruptionBudget request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {
            return readNamespacedPodDisruptionBudgetAsync(name, namespace, pretty, _callback);
        }
    }

    /**
     *
     * read the specified PodDisruptionBudget
     * @param name name of the PodDisruptionBudget (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIreadNamespacedPodDisruptionBudgetRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadNamespacedPodDisruptionBudgetRequest readNamespacedPodDisruptionBudget(String name, String namespace) {
        return new APIreadNamespacedPodDisruptionBudgetRequest(name, namespace);
    }
    private okhttp3.Call readNamespacedPodDisruptionBudgetStatusCall(String name, String namespace, String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}/status"
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
    private okhttp3.Call readNamespacedPodDisruptionBudgetStatusValidateBeforeCall(String name, String namespace, String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedPodDisruptionBudgetStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedPodDisruptionBudgetStatus(Async)");
        }

        return readNamespacedPodDisruptionBudgetStatusCall(name, namespace, pretty, _callback);

    }


    private ApiResponse<V1PodDisruptionBudget> readNamespacedPodDisruptionBudgetStatusWithHttpInfo(String name, String namespace, String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedPodDisruptionBudgetStatusValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readNamespacedPodDisruptionBudgetStatusAsync(String name, String namespace, String pretty, final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedPodDisruptionBudgetStatusValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadNamespacedPodDisruptionBudgetStatusRequest {
        private final String name;
        private final String namespace;
        private String pretty;

        private APIreadNamespacedPodDisruptionBudgetStatusRequest(String name, String namespace) {
            this.name = name;
            this.namespace = namespace;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIreadNamespacedPodDisruptionBudgetStatusRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readNamespacedPodDisruptionBudgetStatus
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
            return readNamespacedPodDisruptionBudgetStatusCall(name, namespace, pretty, _callback);
        }

        /**
         * Execute readNamespacedPodDisruptionBudgetStatus request
         * @return V1PodDisruptionBudget
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudget execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudget> localVarResp = readNamespacedPodDisruptionBudgetStatusWithHttpInfo(name, namespace, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readNamespacedPodDisruptionBudgetStatus request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudget&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudget> executeWithHttpInfo() throws ApiException {
            return readNamespacedPodDisruptionBudgetStatusWithHttpInfo(name, namespace, pretty);
        }

        /**
         * Execute readNamespacedPodDisruptionBudgetStatus request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {
            return readNamespacedPodDisruptionBudgetStatusAsync(name, namespace, pretty, _callback);
        }
    }

    /**
     *
     * read status of the specified PodDisruptionBudget
     * @param name name of the PodDisruptionBudget (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @return APIreadNamespacedPodDisruptionBudgetStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadNamespacedPodDisruptionBudgetStatusRequest readNamespacedPodDisruptionBudgetStatus(String name, String namespace) {
        return new APIreadNamespacedPodDisruptionBudgetStatusRequest(name, namespace);
    }
    private okhttp3.Call replaceNamespacedPodDisruptionBudgetCall(String name, String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}"
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
    private okhttp3.Call replaceNamespacedPodDisruptionBudgetValidateBeforeCall(String name, String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedPodDisruptionBudget(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedPodDisruptionBudget(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedPodDisruptionBudget(Async)");
        }

        return replaceNamespacedPodDisruptionBudgetCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1PodDisruptionBudget> replaceNamespacedPodDisruptionBudgetWithHttpInfo(String name, String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedPodDisruptionBudgetAsync(String name, String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedPodDisruptionBudgetRequest {
        private final String name;
        private final String namespace;
        private final V1PodDisruptionBudget body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceNamespacedPodDisruptionBudgetRequest(String name, String namespace, V1PodDisruptionBudget body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceNamespacedPodDisruptionBudgetRequest
         */
        public APIreplaceNamespacedPodDisruptionBudgetRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedPodDisruptionBudgetRequest
         */
        public APIreplaceNamespacedPodDisruptionBudgetRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedPodDisruptionBudgetRequest
         */
        public APIreplaceNamespacedPodDisruptionBudgetRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceNamespacedPodDisruptionBudgetRequest
         */
        public APIreplaceNamespacedPodDisruptionBudgetRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedPodDisruptionBudget
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
            return replaceNamespacedPodDisruptionBudgetCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedPodDisruptionBudget request
         * @return V1PodDisruptionBudget
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudget execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudget> localVarResp = replaceNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedPodDisruptionBudget request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudget&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudget> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedPodDisruptionBudget request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {
            return replaceNamespacedPodDisruptionBudgetAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified PodDisruptionBudget
     * @param name name of the PodDisruptionBudget (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIreplaceNamespacedPodDisruptionBudgetRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedPodDisruptionBudgetRequest replaceNamespacedPodDisruptionBudget(String name, String namespace, V1PodDisruptionBudget body) {
        return new APIreplaceNamespacedPodDisruptionBudgetRequest(name, namespace, body);
    }
    private okhttp3.Call replaceNamespacedPodDisruptionBudgetStatusCall(String name, String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/policy/v1/namespaces/{namespace}/poddisruptionbudgets/{name}/status"
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
    private okhttp3.Call replaceNamespacedPodDisruptionBudgetStatusValidateBeforeCall(String name, String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedPodDisruptionBudgetStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedPodDisruptionBudgetStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedPodDisruptionBudgetStatus(Async)");
        }

        return replaceNamespacedPodDisruptionBudgetStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1PodDisruptionBudget> replaceNamespacedPodDisruptionBudgetStatusWithHttpInfo(String name, String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedPodDisruptionBudgetStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceNamespacedPodDisruptionBudgetStatusAsync(String name, String namespace, V1PodDisruptionBudget body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedPodDisruptionBudgetStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1PodDisruptionBudget>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceNamespacedPodDisruptionBudgetStatusRequest {
        private final String name;
        private final String namespace;
        private final V1PodDisruptionBudget body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceNamespacedPodDisruptionBudgetStatusRequest(String name, String namespace, V1PodDisruptionBudget body) {
            this.name = name;
            this.namespace = namespace;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIreplaceNamespacedPodDisruptionBudgetStatusRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIreplaceNamespacedPodDisruptionBudgetStatusRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIreplaceNamespacedPodDisruptionBudgetStatusRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceNamespacedPodDisruptionBudgetStatusRequest
         */
        public APIreplaceNamespacedPodDisruptionBudgetStatusRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceNamespacedPodDisruptionBudgetStatus
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
            return replaceNamespacedPodDisruptionBudgetStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceNamespacedPodDisruptionBudgetStatus request
         * @return V1PodDisruptionBudget
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1PodDisruptionBudget execute() throws ApiException {
            ApiResponse<V1PodDisruptionBudget> localVarResp = replaceNamespacedPodDisruptionBudgetStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceNamespacedPodDisruptionBudgetStatus request with HTTP info returned
         * @return ApiResponse&lt;V1PodDisruptionBudget&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1PodDisruptionBudget> executeWithHttpInfo() throws ApiException {
            return replaceNamespacedPodDisruptionBudgetStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceNamespacedPodDisruptionBudgetStatus request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1PodDisruptionBudget> _callback) throws ApiException {
            return replaceNamespacedPodDisruptionBudgetStatusAsync(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace status of the specified PodDisruptionBudget
     * @param name name of the PodDisruptionBudget (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @return APIreplaceNamespacedPodDisruptionBudgetStatusRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceNamespacedPodDisruptionBudgetStatusRequest replaceNamespacedPodDisruptionBudgetStatus(String name, String namespace, V1PodDisruptionBudget body) {
        return new APIreplaceNamespacedPodDisruptionBudgetStatusRequest(name, namespace, body);
    }
}
