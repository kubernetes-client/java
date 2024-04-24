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
import io.kubernetes.client.openapi.models.V1alpha1SelfSubjectReview;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.core.GenericType;

public class AuthenticationV1alpha1Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationV1alpha1Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationV1alpha1Api(ApiClient apiClient) {
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

    private okhttp3.Call createSelfSubjectReviewCall(V1alpha1SelfSubjectReview body, String dryRun, String fieldManager, String fieldValidation, String pretty, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/apis/authentication.k8s.io/v1alpha1/selfsubjectreviews";

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
    private okhttp3.Call createSelfSubjectReviewValidateBeforeCall(V1alpha1SelfSubjectReview body, String dryRun, String fieldManager, String fieldValidation, String pretty, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSelfSubjectReview(Async)");
        }

        return createSelfSubjectReviewCall(body, dryRun, fieldManager, fieldValidation, pretty, _callback);

    }


    private ApiResponse<V1alpha1SelfSubjectReview> createSelfSubjectReviewWithHttpInfo(V1alpha1SelfSubjectReview body, String dryRun, String fieldManager, String fieldValidation, String pretty) throws ApiException {
        okhttp3.Call localVarCall = createSelfSubjectReviewValidateBeforeCall(body, dryRun, fieldManager, fieldValidation, pretty, null);
        Type localVarReturnType = new TypeToken<V1alpha1SelfSubjectReview>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call createSelfSubjectReviewAsync(V1alpha1SelfSubjectReview body, String dryRun, String fieldManager, String fieldValidation, String pretty, final ApiCallback<V1alpha1SelfSubjectReview> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSelfSubjectReviewValidateBeforeCall(body, dryRun, fieldManager, fieldValidation, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1SelfSubjectReview>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIcreateSelfSubjectReviewRequest {
        private final V1alpha1SelfSubjectReview body;
        private String dryRun;
        private String fieldManager;
        private String fieldValidation;
        private String pretty;

        private APIcreateSelfSubjectReviewRequest(V1alpha1SelfSubjectReview body) {
            this.body = body;
        }

        /**
         * Set dryRun
         * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
         * @return APIcreateSelfSubjectReviewRequest
         */
        public APIcreateSelfSubjectReviewRequest dryRun(String dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Set fieldManager
         * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
         * @return APIcreateSelfSubjectReviewRequest
         */
        public APIcreateSelfSubjectReviewRequest fieldManager(String fieldManager) {
            this.fieldManager = fieldManager;
            return this;
        }

        /**
         * Set fieldValidation
         * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
         * @return APIcreateSelfSubjectReviewRequest
         */
        public APIcreateSelfSubjectReviewRequest fieldValidation(String fieldValidation) {
            this.fieldValidation = fieldValidation;
            return this;
        }

        /**
         * Set pretty
         * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
         * @return APIcreateSelfSubjectReviewRequest
         */
        public APIcreateSelfSubjectReviewRequest pretty(String pretty) {
            this.pretty = pretty;
            return this;
        }

        /**
         * Build call for createSelfSubjectReview
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
            return createSelfSubjectReviewCall(body, dryRun, fieldManager, fieldValidation, pretty, _callback);
        }

        /**
         * Execute createSelfSubjectReview request
         * @return V1alpha1SelfSubjectReview
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
        public V1alpha1SelfSubjectReview execute() throws ApiException {
            ApiResponse<V1alpha1SelfSubjectReview> localVarResp = createSelfSubjectReviewWithHttpInfo(body, dryRun, fieldManager, fieldValidation, pretty);
            return localVarResp.getData();
        }

        /**
         * Execute createSelfSubjectReview request with HTTP info returned
         * @return ApiResponse&lt;V1alpha1SelfSubjectReview&gt;
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
        public ApiResponse<V1alpha1SelfSubjectReview> executeWithHttpInfo() throws ApiException {
            return createSelfSubjectReviewWithHttpInfo(body, dryRun, fieldManager, fieldValidation, pretty);
        }

        /**
         * Execute createSelfSubjectReview request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<V1alpha1SelfSubjectReview> _callback) throws ApiException {
            return createSelfSubjectReviewAsync(body, dryRun, fieldManager, fieldValidation, pretty, _callback);
        }
    }

    /**
     *
     * create a SelfSubjectReview
     * @param body  (required)
     * @return APIcreateSelfSubjectReviewRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIcreateSelfSubjectReviewRequest createSelfSubjectReview(V1alpha1SelfSubjectReview body) {
        return new APIcreateSelfSubjectReviewRequest(body);
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
        String localVarPath = "/apis/authentication.k8s.io/v1alpha1/";

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
}
