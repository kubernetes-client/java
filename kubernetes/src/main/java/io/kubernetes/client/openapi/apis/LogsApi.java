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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LogsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LogsApi(ApiClient apiClient) {
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

    private okhttp3.Call logFileHandlerCall(@jakarta.annotation.Nonnull String logpath, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/logs/{logpath}"
            .replace("{" + "logpath" + "}", localVarApiClient.escapeString(logpath.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
    private okhttp3.Call logFileHandlerValidateBeforeCall(@jakarta.annotation.Nonnull String logpath, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'logpath' is set
        if (logpath == null) {
            throw new ApiException("Missing the required parameter 'logpath' when calling logFileHandler(Async)");
        }

        return logFileHandlerCall(logpath, _callback);

    }


    private ApiResponse<Void> logFileHandlerWithHttpInfo(@jakarta.annotation.Nonnull String logpath) throws ApiException {
        okhttp3.Call localVarCall = logFileHandlerValidateBeforeCall(logpath, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call logFileHandlerAsync(@jakarta.annotation.Nonnull String logpath, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = logFileHandlerValidateBeforeCall(logpath, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIlogFileHandlerRequest {
        @jakarta.annotation.Nonnull
        private final String logpath;

        private APIlogFileHandlerRequest(@jakarta.annotation.Nonnull String logpath) {
            this.logpath = logpath;
        }

        /**
         * Build call for logFileHandler
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return logFileHandlerCall(logpath, _callback);
        }

        /**
         * Execute logFileHandler request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            logFileHandlerWithHttpInfo(logpath);
        }

        /**
         * Execute logFileHandler request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return logFileHandlerWithHttpInfo(logpath);
        }

        /**
         * Execute logFileHandler request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return logFileHandlerAsync(logpath, _callback);
        }
    }

    /**
     *
     *
     * @param logpath path to the log (required)
     * @return APIlogFileHandlerRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlogFileHandlerRequest logFileHandler(@jakarta.annotation.Nonnull String logpath) {
        return new APIlogFileHandlerRequest(logpath);
    }
    private okhttp3.Call logFileListHandlerCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/logs/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
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
    private okhttp3.Call logFileListHandlerValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return logFileListHandlerCall(_callback);

    }


    private ApiResponse<Void> logFileListHandlerWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = logFileListHandlerValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call logFileListHandlerAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = logFileListHandlerValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIlogFileListHandlerRequest {

        private APIlogFileListHandlerRequest() {
        }

        /**
         * Build call for logFileListHandler
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return logFileListHandlerCall(_callback);
        }

        /**
         * Execute logFileListHandler request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            logFileListHandlerWithHttpInfo();
        }

        /**
         * Execute logFileListHandler request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return logFileListHandlerWithHttpInfo();
        }

        /**
         * Execute logFileListHandler request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table border="1">
       <caption>Response Details</caption>
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return logFileListHandlerAsync(_callback);
        }
    }

    /**
     *
     *
     * @return APIlogFileListHandlerRequest
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public APIlogFileListHandlerRequest logFileListHandler() {
        return new APIlogFileListHandlerRequest();
    }
}
