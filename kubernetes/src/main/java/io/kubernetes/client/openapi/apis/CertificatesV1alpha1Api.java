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
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundle;
import io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundleList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

public class CertificatesV1alpha1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CertificatesV1alpha1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CertificatesV1alpha1Api(ApiClient apiClient) {
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

    private okhttp3.Call createClusterTrustBundleCall(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles";

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
    private okhttp3.Call createClusterTrustBundleValidateBeforeCall(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createClusterTrustBundle(Async)");
        }

        return createClusterTrustBundleCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1alpha1ClusterTrustBundle> createClusterTrustBundleWithHttpInfo(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createClusterTrustBundleValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createClusterTrustBundleAsync(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {

        okhttp3.Call localVarCall = createClusterTrustBundleValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateClusterTrustBundleRequest {
        private final V1alpha1ClusterTrustBundle body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIcreateClusterTrustBundleRequest(V1alpha1ClusterTrustBundle body) {
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateClusterTrustBundleRequest
         */
        public APIcreateClusterTrustBundleRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateClusterTrustBundleRequest
         */
        public APIcreateClusterTrustBundleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateClusterTrustBundleRequest
         */
        public APIcreateClusterTrustBundleRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateClusterTrustBundleRequest
         */
        public APIcreateClusterTrustBundleRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for createClusterTrustBundle
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
            return createClusterTrustBundleCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute createClusterTrustBundle request
         * @return V1alpha1ClusterTrustBundle
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
        public V1alpha1ClusterTrustBundle execute() throws ApiException {
            ApiResponse<V1alpha1ClusterTrustBundle> localVarResp = createClusterTrustBundleWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute createClusterTrustBundle request with HTTP info returned
         * @return ApiResponse&lt;V1alpha1ClusterTrustBundle&gt;
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
        public ApiResponse<V1alpha1ClusterTrustBundle> executeWithHttpInfo() throws ApiException {
            return createClusterTrustBundleWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute createClusterTrustBundle request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {
            return createClusterTrustBundleAsync(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * create a ClusterTrustBundle
     * @param body  (required)
     * @return APIcreateClusterTrustBundleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateClusterTrustBundleRequest createClusterTrustBundle(V1alpha1ClusterTrustBundle body) {
        return new APIcreateClusterTrustBundleRequest(body);
    }
    private okhttp3.Call deleteClusterTrustBundleCall(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles/{name}"
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
    private okhttp3.Call deleteClusterTrustBundleValidateBeforeCall(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteClusterTrustBundle(Async)");
        }

        return deleteClusterTrustBundleCall(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, _callback);

    }


    private ApiResponse<V1Status> deleteClusterTrustBundleWithHttpInfo(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteClusterTrustBundleValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteClusterTrustBundleAsync(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteClusterTrustBundleValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteClusterTrustBundleRequest {
        private final String name;
        private String pretty;
        private String dryRun;
        private Integer gracePeriodSeconds;
        private Boolean orphanDependents;
        private String propagationPolicy;
        private V1DeleteOptions body;

        private APIdeleteClusterTrustBundleRequest(String name) {
            this.name = name;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteClusterTrustBundleRequest
         */
        public APIdeleteClusterTrustBundleRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteClusterTrustBundleRequest
         */
        public APIdeleteClusterTrustBundleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteClusterTrustBundleRequest
         */
        public APIdeleteClusterTrustBundleRequest gracePeriodSeconds(Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteClusterTrustBundleRequest
         */
        public APIdeleteClusterTrustBundleRequest orphanDependents(Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteClusterTrustBundleRequest
         */
        public APIdeleteClusterTrustBundleRequest propagationPolicy(String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteClusterTrustBundleRequest
         */
        public APIdeleteClusterTrustBundleRequest body(V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteClusterTrustBundle
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
            return deleteClusterTrustBundleCall(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, _callback);
        }

        /**
         * Execute deleteClusterTrustBundle request
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
            ApiResponse<V1Status> localVarResp = deleteClusterTrustBundleWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteClusterTrustBundle request with HTTP info returned
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
            return deleteClusterTrustBundleWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);
        }

        /**
         * Execute deleteClusterTrustBundle request (asynchronously)
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
            return deleteClusterTrustBundleAsync(name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body, _callback);
        }
    }

    /**
     *
     * delete a ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @return APIdeleteClusterTrustBundleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteClusterTrustBundleRequest deleteClusterTrustBundle(String name) {
        return new APIdeleteClusterTrustBundleRequest(name);
    }
    private okhttp3.Call deleteCollectionClusterTrustBundleCall(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles";

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
    private okhttp3.Call deleteCollectionClusterTrustBundleValidateBeforeCall(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        return deleteCollectionClusterTrustBundleCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);

    }


    private ApiResponse<V1Status> deleteCollectionClusterTrustBundleWithHttpInfo(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionClusterTrustBundleValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call deleteCollectionClusterTrustBundleAsync(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionClusterTrustBundleValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIdeleteCollectionClusterTrustBundleRequest {
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

        private APIdeleteCollectionClusterTrustBundleRequest() {
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest fieldSelector(String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set gracePeriodSeconds
         * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest gracePeriodSeconds(Integer gracePeriodSeconds) {
            this.gracePeriodSeconds = gracePeriodSeconds;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set orphanDependents
         * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest orphanDependents(Boolean orphanDependents) {
            this.orphanDependents = orphanDependents;
            return this;
        }

        /**
         * Set propagationPolicy
         * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest propagationPolicy(String propagationPolicy) {
            this.propagationPolicy = propagationPolicy;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest resourceVersionMatch(String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest sendInitialEvents(Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set body
         * @param body  (optional)
         * @return APIdeleteCollectionClusterTrustBundleRequest
         */
        public APIdeleteCollectionClusterTrustBundleRequest body(V1DeleteOptions body) {
            this.body = body;
            return this;
        }

        /**
         * Build call for deleteCollectionClusterTrustBundle
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
            return deleteCollectionClusterTrustBundleCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }

        /**
         * Execute deleteCollectionClusterTrustBundle request
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
            ApiResponse<V1Status> localVarResp = deleteCollectionClusterTrustBundleWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
            return localVarResp.getData();
        }

        /**
         * Execute deleteCollectionClusterTrustBundle request with HTTP info returned
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
            return deleteCollectionClusterTrustBundleWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        }

        /**
         * Execute deleteCollectionClusterTrustBundle request (asynchronously)
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
            return deleteCollectionClusterTrustBundleAsync(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        }
    }

    /**
     *
     * delete collection of ClusterTrustBundle
     * @return APIdeleteCollectionClusterTrustBundleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIdeleteCollectionClusterTrustBundleRequest deleteCollectionClusterTrustBundle() {
        return new APIdeleteCollectionClusterTrustBundleRequest();
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
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/";

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
    private okhttp3.Call listClusterTrustBundleCall(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles";

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
    private okhttp3.Call listClusterTrustBundleValidateBeforeCall(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
        return listClusterTrustBundleCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);

    }


    private ApiResponse<V1alpha1ClusterTrustBundleList> listClusterTrustBundleWithHttpInfo(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listClusterTrustBundleValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundleList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listClusterTrustBundleAsync(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback<V1alpha1ClusterTrustBundleList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listClusterTrustBundleValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundleList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIlistClusterTrustBundleRequest {
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

        private APIlistClusterTrustBundleRequest() {
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set allowWatchBookmarks
         * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest allowWatchBookmarks(Boolean allowWatchBookmarks) {
            this.allowWatchBookmarks = allowWatchBookmarks;
            return this;
        }

        /**
         * Set _continue
         * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest _continue(String _continue) {
            this._continue = _continue;
            return this;
        }

        /**
         * Set fieldSelector
         * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest fieldSelector(String fieldSelector) {
            this.fieldSelector = fieldSelector;
            return this;
        }

        /**
         * Set labelSelector
         * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest labelSelector(String labelSelector) {
            this.labelSelector = labelSelector;
            return this;
        }

        /**
         * Set limit
         * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Set resourceVersion
         * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest resourceVersion(String resourceVersion) {
            this.resourceVersion = resourceVersion;
            return this;
        }

        /**
         * Set resourceVersionMatch
         * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest resourceVersionMatch(String resourceVersionMatch) {
            this.resourceVersionMatch = resourceVersionMatch;
            return this;
        }

        /**
         * Set sendInitialEvents
         * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest sendInitialEvents(Boolean sendInitialEvents) {
            this.sendInitialEvents = sendInitialEvents;
            return this;
        }

        /**
         * Set timeoutSeconds
         * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Set watch
         * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
         * @return APIlistClusterTrustBundleRequest
         */
        public APIlistClusterTrustBundleRequest watch(Boolean watch) {
            this.watch = watch;
            return this;
        }

        /**
         * Build call for listClusterTrustBundle
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
            return listClusterTrustBundleCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }

        /**
         * Execute listClusterTrustBundle request
         * @return V1alpha1ClusterTrustBundleList
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1alpha1ClusterTrustBundleList execute() throws ApiException {
            ApiResponse<V1alpha1ClusterTrustBundleList> localVarResp = listClusterTrustBundleWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
            return localVarResp.getData();
        }

        /**
         * Execute listClusterTrustBundle request with HTTP info returned
         * @return ApiResponse&lt;V1alpha1ClusterTrustBundleList&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1alpha1ClusterTrustBundleList> executeWithHttpInfo() throws ApiException {
            return listClusterTrustBundleWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        }

        /**
         * Execute listClusterTrustBundle request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1alpha1ClusterTrustBundleList> _callback) throws ApiException {
            return listClusterTrustBundleAsync(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        }
    }

    /**
     *
     * list or watch objects of kind ClusterTrustBundle
     * @return APIlistClusterTrustBundleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlistClusterTrustBundleRequest listClusterTrustBundle() {
        return new APIlistClusterTrustBundleRequest();
    }
    private okhttp3.Call patchClusterTrustBundleCall(String name, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles/{name}"
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
    private okhttp3.Call patchClusterTrustBundleValidateBeforeCall(String name, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchClusterTrustBundle(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchClusterTrustBundle(Async)");
        }

        return patchClusterTrustBundleCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);

    }


    private ApiResponse<V1alpha1ClusterTrustBundle> patchClusterTrustBundleWithHttpInfo(String name, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchClusterTrustBundleValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call patchClusterTrustBundleAsync(String name, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchClusterTrustBundleValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIpatchClusterTrustBundleRequest {
        private final String name;
        private final V1Patch body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private Boolean force;

        private APIpatchClusterTrustBundleRequest(String name, V1Patch body) {
            this.name = name;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIpatchClusterTrustBundleRequest
         */
        public APIpatchClusterTrustBundleRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIpatchClusterTrustBundleRequest
         */
        public APIpatchClusterTrustBundleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
         * @return APIpatchClusterTrustBundleRequest
         */
        public APIpatchClusterTrustBundleRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIpatchClusterTrustBundleRequest
         */
        public APIpatchClusterTrustBundleRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set force
         * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
         * @return APIpatchClusterTrustBundleRequest
         */
        public APIpatchClusterTrustBundleRequest force(Boolean force) {
            this.force = force;
            return this;
        }

        /**
         * Build call for patchClusterTrustBundle
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
            return patchClusterTrustBundleCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }

        /**
         * Execute patchClusterTrustBundle request
         * @return V1alpha1ClusterTrustBundle
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1alpha1ClusterTrustBundle execute() throws ApiException {
            ApiResponse<V1alpha1ClusterTrustBundle> localVarResp = patchClusterTrustBundleWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
            return localVarResp.getData();
        }

        /**
         * Execute patchClusterTrustBundle request with HTTP info returned
         * @return ApiResponse&lt;V1alpha1ClusterTrustBundle&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1alpha1ClusterTrustBundle> executeWithHttpInfo() throws ApiException {
            return patchClusterTrustBundleWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
        }

        /**
         * Execute patchClusterTrustBundle request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {
            return patchClusterTrustBundleAsync(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        }
    }

    /**
     *
     * partially update the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @return APIpatchClusterTrustBundleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIpatchClusterTrustBundleRequest patchClusterTrustBundle(String name, V1Patch body) {
        return new APIpatchClusterTrustBundleRequest(name, body);
    }
    private okhttp3.Call readClusterTrustBundleCall(String name, String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles/{name}"
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
    private okhttp3.Call readClusterTrustBundleValidateBeforeCall(String name, String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readClusterTrustBundle(Async)");
        }

        return readClusterTrustBundleCall(name, pretty, _callback);

    }


    private ApiResponse<V1alpha1ClusterTrustBundle> readClusterTrustBundleWithHttpInfo(String name, String pretty) throws ApiException {
        okhttp3.Call localVarCall = readClusterTrustBundleValidateBeforeCall(name, pretty, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call readClusterTrustBundleAsync(String name, String pretty, final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {

        okhttp3.Call localVarCall = readClusterTrustBundleValidateBeforeCall(name, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreadClusterTrustBundleRequest {
        private final String name;
        private String pretty;

        private APIreadClusterTrustBundleRequest(String name) {
            this.name = name;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreadClusterTrustBundleRequest
         */
        public APIreadClusterTrustBundleRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for readClusterTrustBundle
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
            return readClusterTrustBundleCall(name, pretty, _callback);
        }

        /**
         * Execute readClusterTrustBundle request
         * @return V1alpha1ClusterTrustBundle
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1alpha1ClusterTrustBundle execute() throws ApiException {
            ApiResponse<V1alpha1ClusterTrustBundle> localVarResp = readClusterTrustBundleWithHttpInfo(name, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute readClusterTrustBundle request with HTTP info returned
         * @return ApiResponse&lt;V1alpha1ClusterTrustBundle&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1alpha1ClusterTrustBundle> executeWithHttpInfo() throws ApiException {
            return readClusterTrustBundleWithHttpInfo(name, pretty);
        }

        /**
         * Execute readClusterTrustBundle request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {
            return readClusterTrustBundleAsync(name, pretty, _callback);
        }
    }

    /**
     *
     * read the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @return APIreadClusterTrustBundleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreadClusterTrustBundleRequest readClusterTrustBundle(String name) {
        return new APIreadClusterTrustBundleRequest(name);
    }
    private okhttp3.Call replaceClusterTrustBundleCall(String name, V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles/{name}"
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
    private okhttp3.Call replaceClusterTrustBundleValidateBeforeCall(String name, V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceClusterTrustBundle(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceClusterTrustBundle(Async)");
        }

        return replaceClusterTrustBundleCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);

    }


    private ApiResponse<V1alpha1ClusterTrustBundle> replaceClusterTrustBundleWithHttpInfo(String name, V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceClusterTrustBundleValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call replaceClusterTrustBundleAsync(String name, V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceClusterTrustBundleValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIreplaceClusterTrustBundleRequest {
        private final String name;
        private final V1alpha1ClusterTrustBundle body;
        private String pretty;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;

        private APIreplaceClusterTrustBundleRequest(String name, V1alpha1ClusterTrustBundle body) {
            this.name = name;
            this.body = body;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIreplaceClusterTrustBundleRequest
         */
        public APIreplaceClusterTrustBundleRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIreplaceClusterTrustBundleRequest
         */
        public APIreplaceClusterTrustBundleRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIreplaceClusterTrustBundleRequest
         */
        public APIreplaceClusterTrustBundleRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIreplaceClusterTrustBundleRequest
         */
        public APIreplaceClusterTrustBundleRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Build call for replaceClusterTrustBundle
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
            return replaceClusterTrustBundleCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }

        /**
         * Execute replaceClusterTrustBundle request
         * @return V1alpha1ClusterTrustBundle
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public V1alpha1ClusterTrustBundle execute() throws ApiException {
            ApiResponse<V1alpha1ClusterTrustBundle> localVarResp = replaceClusterTrustBundleWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
            return localVarResp.getData();
        }

        /**
         * Execute replaceClusterTrustBundle request with HTTP info returned
         * @return ApiResponse&lt;V1alpha1ClusterTrustBundle&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<V1alpha1ClusterTrustBundle> executeWithHttpInfo() throws ApiException {
            return replaceClusterTrustBundleWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
        }

        /**
         * Execute replaceClusterTrustBundle request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {
            return replaceClusterTrustBundleAsync(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        }
    }

    /**
     *
     * replace the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @return APIreplaceClusterTrustBundleRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIreplaceClusterTrustBundleRequest replaceClusterTrustBundle(String name, V1alpha1ClusterTrustBundle body) {
        return new APIreplaceClusterTrustBundleRequest(name, body);
    }
}
