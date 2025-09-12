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
import io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundle;
import io.kubernetes.client.openapi.models.V1alpha1ClusterTrustBundleList;
import io.kubernetes.client.openapi.models.V1alpha1PodCertificateRequest;
import io.kubernetes.client.openapi.models.V1alpha1PodCertificateRequestList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CertificatesV1alpha1Api {
    private ApiClient localVarApiClient;

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

    /**
     * Build call for createClusterTrustBundle
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call createClusterTrustBundleCall(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createClusterTrustBundleValidateBeforeCall(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createClusterTrustBundle(Async)");
        }


        okhttp3.Call localVarCall = createClusterTrustBundleCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        return localVarCall;

    }

    /**
     *
     * create a ClusterTrustBundle
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public V1alpha1ClusterTrustBundle createClusterTrustBundle(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        ApiResponse<V1alpha1ClusterTrustBundle> localVarResp = createClusterTrustBundleWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
        return localVarResp.getData();
    }

    /**
     *
     * create a ClusterTrustBundle
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public ApiResponse<V1alpha1ClusterTrustBundle> createClusterTrustBundleWithHttpInfo(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createClusterTrustBundleValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * create a ClusterTrustBundle
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public okhttp3.Call createClusterTrustBundleAsync(V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {

        okhttp3.Call localVarCall = createClusterTrustBundleValidateBeforeCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createNamespacedPodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call createNamespacedPodCertificateRequestCall(String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests"
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNamespacedPodCertificateRequestValidateBeforeCall(String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling createNamespacedPodCertificateRequest(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createNamespacedPodCertificateRequest(Async)");
        }


        okhttp3.Call localVarCall = createNamespacedPodCertificateRequestCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        return localVarCall;

    }

    /**
     *
     * create a PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @return V1alpha1PodCertificateRequest
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
    public V1alpha1PodCertificateRequest createNamespacedPodCertificateRequest(String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequest> localVarResp = createNamespacedPodCertificateRequestWithHttpInfo(namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        return localVarResp.getData();
    }

    /**
     *
     * create a PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequest&gt;
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
    public ApiResponse<V1alpha1PodCertificateRequest> createNamespacedPodCertificateRequestWithHttpInfo(String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = createNamespacedPodCertificateRequestValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * create a PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public okhttp3.Call createNamespacedPodCertificateRequestAsync(String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1alpha1PodCertificateRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNamespacedPodCertificateRequestValidateBeforeCall(namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call deleteClusterTrustBundleCall(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteClusterTrustBundleValidateBeforeCall(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteClusterTrustBundle(Async)");
        }


        okhttp3.Call localVarCall = deleteClusterTrustBundleCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        return localVarCall;

    }

    /**
     *
     * delete a ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param body  (optional)
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
    public V1Status deleteClusterTrustBundle(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body) throws ApiException {
        ApiResponse<V1Status> localVarResp = deleteClusterTrustBundleWithHttpInfo(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
        return localVarResp.getData();
    }

    /**
     *
     * delete a ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param body  (optional)
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
    public ApiResponse<V1Status> deleteClusterTrustBundleWithHttpInfo(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteClusterTrustBundleValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * delete a ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param body  (optional)
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
    public okhttp3.Call deleteClusterTrustBundleAsync(String name, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteClusterTrustBundleValidateBeforeCall(name, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCollectionClusterTrustBundle
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCollectionClusterTrustBundleCall(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCollectionClusterTrustBundleValidateBeforeCall(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = deleteCollectionClusterTrustBundleCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        return localVarCall;

    }

    /**
     *
     * delete collection of ClusterTrustBundle
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param body  (optional)
     * @return V1Status
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1Status deleteCollectionClusterTrustBundle(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body) throws ApiException {
        ApiResponse<V1Status> localVarResp = deleteCollectionClusterTrustBundleWithHttpInfo(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        return localVarResp.getData();
    }

    /**
     *
     * delete collection of ClusterTrustBundle
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param body  (optional)
     * @return ApiResponse&lt;V1Status&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1Status> deleteCollectionClusterTrustBundleWithHttpInfo(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionClusterTrustBundleValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * delete collection of ClusterTrustBundle
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param body  (optional)
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
    public okhttp3.Call deleteCollectionClusterTrustBundleAsync(String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionClusterTrustBundleValidateBeforeCall(pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteCollectionNamespacedPodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCollectionNamespacedPodCertificateRequestCall(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests"
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCollectionNamespacedPodCertificateRequestValidateBeforeCall(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteCollectionNamespacedPodCertificateRequest(Async)");
        }


        okhttp3.Call localVarCall = deleteCollectionNamespacedPodCertificateRequestCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        return localVarCall;

    }

    /**
     *
     * delete collection of PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param body  (optional)
     * @return V1Status
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1Status deleteCollectionNamespacedPodCertificateRequest(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body) throws ApiException {
        ApiResponse<V1Status> localVarResp = deleteCollectionNamespacedPodCertificateRequestWithHttpInfo(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body);
        return localVarResp.getData();
    }

    /**
     *
     * delete collection of PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param body  (optional)
     * @return ApiResponse&lt;V1Status&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1Status> deleteCollectionNamespacedPodCertificateRequestWithHttpInfo(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteCollectionNamespacedPodCertificateRequestValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * delete collection of PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param body  (optional)
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
    public okhttp3.Call deleteCollectionNamespacedPodCertificateRequestAsync(String namespace, String pretty, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCollectionNamespacedPodCertificateRequestValidateBeforeCall(namespace, pretty, _continue, dryRun, fieldSelector, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, labelSelector, limit, orphanDependents, propagationPolicy, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNamespacedPodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call deleteNamespacedPodCertificateRequestCall(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteNamespacedPodCertificateRequestValidateBeforeCall(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling deleteNamespacedPodCertificateRequest(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling deleteNamespacedPodCertificateRequest(Async)");
        }


        okhttp3.Call localVarCall = deleteNamespacedPodCertificateRequestCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        return localVarCall;

    }

    /**
     *
     * delete a PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param body  (optional)
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
    public V1Status deleteNamespacedPodCertificateRequest(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body) throws ApiException {
        ApiResponse<V1Status> localVarResp = deleteNamespacedPodCertificateRequestWithHttpInfo(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body);
        return localVarResp.getData();
    }

    /**
     *
     * delete a PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param body  (optional)
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
    public ApiResponse<V1Status> deleteNamespacedPodCertificateRequestWithHttpInfo(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body) throws ApiException {
        okhttp3.Call localVarCall = deleteNamespacedPodCertificateRequestValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, null);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * delete a PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value must be non-negative integer. The value zero indicates delete immediately. If this value is nil, the default grace period for the specified type will be used. Defaults to a per object value if not specified. zero means delete immediately. (optional)
     * @param ignoreStoreReadErrorWithClusterBreakingPotential if set to true, it will trigger an unsafe deletion of the resource in case the normal deletion flow fails with a corrupt object error. A resource is considered corrupt if it can not be retrieved from the underlying storage successfully because of a) its data can not be transformed e.g. decryption failure, or b) it fails to decode into an object. NOTE: unsafe deletion ignores finalizer constraints, skips precondition checks, and removes the object from the storage. WARNING: This may potentially break the cluster if the workload associated with the resource being unsafe-deleted relies on normal deletion flow. Use only if you REALLY know what you are doing. The default value is false, and the user must opt in to enable it (optional)
     * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers list. Either this field or PropagationPolicy may be set, but not both. (optional)
     * @param propagationPolicy Whether and how garbage collection will be performed. Either this field or OrphanDependents may be set, but not both. The default policy is decided by the existing finalizer set in the metadata.finalizers and the resource-specific default policy. Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; - allow the garbage collector to delete the dependents in the background; &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground. (optional)
     * @param body  (optional)
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
    public okhttp3.Call deleteNamespacedPodCertificateRequestAsync(String name, String namespace, String pretty, String dryRun, Integer gracePeriodSeconds, Boolean ignoreStoreReadErrorWithClusterBreakingPotential, Boolean orphanDependents, String propagationPolicy, V1DeleteOptions body, final ApiCallback<V1Status> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteNamespacedPodCertificateRequestValidateBeforeCall(name, namespace, pretty, dryRun, gracePeriodSeconds, ignoreStoreReadErrorWithClusterBreakingPotential, orphanDependents, propagationPolicy, body, _callback);
        Type localVarReturnType = new TypeToken<V1Status>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAPIResources
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAPIResourcesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAPIResourcesValidateBeforeCall(final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = getAPIResourcesCall(_callback);
        return localVarCall;

    }

    /**
     *
     * get available resources
     * @return V1APIResourceList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1APIResourceList getAPIResources() throws ApiException {
        ApiResponse<V1APIResourceList> localVarResp = getAPIResourcesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     *
     * get available resources
     * @return ApiResponse&lt;V1APIResourceList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1APIResourceList> getAPIResourcesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<V1APIResourceList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * get available resources
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
    public okhttp3.Call getAPIResourcesAsync(final ApiCallback<V1APIResourceList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<V1APIResourceList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listClusterTrustBundle
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listClusterTrustBundleCall(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch", "application/cbor-seq"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listClusterTrustBundleValidateBeforeCall(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = listClusterTrustBundleCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        return localVarCall;

    }

    /**
     *
     * list or watch objects of kind ClusterTrustBundle
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @return V1alpha1ClusterTrustBundleList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1ClusterTrustBundleList listClusterTrustBundle(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        ApiResponse<V1alpha1ClusterTrustBundleList> localVarResp = listClusterTrustBundleWithHttpInfo(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        return localVarResp.getData();
    }

    /**
     *
     * list or watch objects of kind ClusterTrustBundle
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @return ApiResponse&lt;V1alpha1ClusterTrustBundleList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1ClusterTrustBundleList> listClusterTrustBundleWithHttpInfo(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listClusterTrustBundleValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundleList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * list or watch objects of kind ClusterTrustBundle
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
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
    public okhttp3.Call listClusterTrustBundleAsync(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback<V1alpha1ClusterTrustBundleList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listClusterTrustBundleValidateBeforeCall(pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundleList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listNamespacedPodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listNamespacedPodCertificateRequestCall(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests"
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch", "application/cbor-seq"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listNamespacedPodCertificateRequestValidateBeforeCall(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling listNamespacedPodCertificateRequest(Async)");
        }


        okhttp3.Call localVarCall = listNamespacedPodCertificateRequestCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        return localVarCall;

    }

    /**
     *
     * list or watch objects of kind PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @return V1alpha1PodCertificateRequestList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1PodCertificateRequestList listNamespacedPodCertificateRequest(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequestList> localVarResp = listNamespacedPodCertificateRequestWithHttpInfo(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        return localVarResp.getData();
    }

    /**
     *
     * list or watch objects of kind PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequestList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1PodCertificateRequestList> listNamespacedPodCertificateRequestWithHttpInfo(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listNamespacedPodCertificateRequestValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequestList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * list or watch objects of kind PodCertificateRequest
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
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
    public okhttp3.Call listNamespacedPodCertificateRequestAsync(String namespace, String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback<V1alpha1PodCertificateRequestList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listNamespacedPodCertificateRequestValidateBeforeCall(namespace, pretty, allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequestList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPodCertificateRequestForAllNamespaces
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPodCertificateRequestForAllNamespacesCall(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/podcertificaterequests";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor", "application/json;stream=watch", "application/vnd.kubernetes.protobuf;stream=watch", "application/cbor-seq"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPodCertificateRequestForAllNamespacesValidateBeforeCall(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback _callback) throws ApiException {


        okhttp3.Call localVarCall = listPodCertificateRequestForAllNamespacesCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        return localVarCall;

    }

    /**
     *
     * list or watch objects of kind PodCertificateRequest
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @return V1alpha1PodCertificateRequestList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1PodCertificateRequestList listPodCertificateRequestForAllNamespaces(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequestList> localVarResp = listPodCertificateRequestForAllNamespacesWithHttpInfo(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch);
        return localVarResp.getData();
    }

    /**
     *
     * list or watch objects of kind PodCertificateRequest
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequestList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1PodCertificateRequestList> listPodCertificateRequestForAllNamespacesWithHttpInfo(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch) throws ApiException {
        okhttp3.Call localVarCall = listPodCertificateRequestForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequestList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * list or watch objects of kind PodCertificateRequest
     * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are returned at any specific interval, nor may they assume the server will send any BOOKMARK event during a session. If this is not a watch, this field is ignored. (optional)
     * @param _continue The continue option should be set when retrieving more results from the server. Since this value is server defined, clients may only use the continue value from a previous query result with identical query parameters (except for the value of continue) and the server may reject a continue value it does not recognize. If the specified continue value is no longer valid whether due to expiration (generally five to fifteen minutes) or a configuration change on the server, the server will respond with a 410 ResourceExpired error together with a continue token. If the client needs a consistent list, it must restart their list without the continue field. Otherwise, the client may send another list request with the token received with the 410 error, the server will respond with a list starting from the next key, but from the latest snapshot, which is inconsistent from the previous list results - objects that are created, modified, or deleted after the first list request will be included in the response, as long as their keys are after the \&quot;next key\&quot;.  This field is not supported when watch is true. Clients may start a watch from the last resourceVersion value returned by the server and not miss any modifications. (optional)
     * @param fieldSelector A selector to restrict the list of returned objects by their fields. Defaults to everything. (optional)
     * @param labelSelector A selector to restrict the list of returned objects by their labels. Defaults to everything. (optional)
     * @param limit limit is a maximum number of responses to return for a list call. If more items exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value that can be used with the same initial query to retrieve the next set of results. Setting a limit may return fewer than the requested amount of items (up to zero items) in the event all requested objects are filtered out and clients should only use the presence of the continue field to determine whether more results are available. Servers may choose not to support the limit argument and will return all of the available results. If limit is specified and the continue field is empty, clients may assume that no more results are available. This field is not supported if watch is true.  The server guarantees that the objects returned when using continue will be identical to issuing a single list call without a limit - that is, no objects created, modified, or deleted after the first request is issued will be included in any subsequent continued requests. This is sometimes referred to as a consistent snapshot, and ensures that a client that is using limit to receive smaller chunks of a very large result can ensure they see all possible objects. If objects are updated during a chunked list the version of the object that was present at the time the first list result was calculated is returned. (optional)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param resourceVersion resourceVersion sets a constraint on what resource versions a request may be served from. See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to list calls. It is highly recommended that resourceVersionMatch be set for list calls where resourceVersion is set See https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.  Defaults to unset (optional)
     * @param sendInitialEvents &#x60;sendInitialEvents&#x3D;true&#x60; may be set together with &#x60;watch&#x3D;true&#x60;. In that case, the watch stream will begin with synthetic events to produce the current state of objects in the collection. Once all such events have been sent, a synthetic \&quot;Bookmark\&quot; event  will be sent. The bookmark will report the ResourceVersion (RV) corresponding to the set of objects, and be marked with &#x60;\&quot;k8s.io/initial-events-end\&quot;: \&quot;true\&quot;&#x60; annotation. Afterwards, the watch stream will proceed as usual, sending watch events corresponding to changes (subsequent to the RV) to objects watched.  When &#x60;sendInitialEvents&#x60; option is set, we require &#x60;resourceVersionMatch&#x60; option to also be set. The semantic of the watch request is as following: - &#x60;resourceVersionMatch&#x60; &#x3D; NotOlderThan   is interpreted as \&quot;data at least as new as the provided &#x60;resourceVersion&#x60;\&quot;   and the bookmark event is send when the state is synced   to a &#x60;resourceVersion&#x60; at least as fresh as the one provided by the ListOptions.   If &#x60;resourceVersion&#x60; is unset, this is interpreted as \&quot;consistent read\&quot; and the   bookmark event is send when the state is synced at least to the moment   when request started being processed. - &#x60;resourceVersionMatch&#x60; set to any other value or unset   Invalid error is returned.  Defaults to true if &#x60;resourceVersion&#x3D;\&quot;\&quot;&#x60; or &#x60;resourceVersion&#x3D;\&quot;0\&quot;&#x60; (for backward compatibility reasons) and to false otherwise. (optional)
     * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call, regardless of any activity or inactivity. (optional)
     * @param watch Watch for changes to the described resources and return them as a stream of add, update, and remove notifications. Specify resourceVersion. (optional)
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
    public okhttp3.Call listPodCertificateRequestForAllNamespacesAsync(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, String resourceVersionMatch, Boolean sendInitialEvents, Integer timeoutSeconds, Boolean watch, final ApiCallback<V1alpha1PodCertificateRequestList> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPodCertificateRequestForAllNamespacesValidateBeforeCall(allowWatchBookmarks, _continue, fieldSelector, labelSelector, limit, pretty, resourceVersion, resourceVersionMatch, sendInitialEvents, timeoutSeconds, watch, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequestList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call patchClusterTrustBundleCall(String name, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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


        okhttp3.Call localVarCall = patchClusterTrustBundleCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        return localVarCall;

    }

    /**
     *
     * partially update the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
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
    public V1alpha1ClusterTrustBundle patchClusterTrustBundle(String name, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        ApiResponse<V1alpha1ClusterTrustBundle> localVarResp = patchClusterTrustBundleWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation, force);
        return localVarResp.getData();
    }

    /**
     *
     * partially update the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
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
    public ApiResponse<V1alpha1ClusterTrustBundle> patchClusterTrustBundleWithHttpInfo(String name, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchClusterTrustBundleValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * partially update the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
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
    public okhttp3.Call patchClusterTrustBundleAsync(String name, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchClusterTrustBundleValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchNamespacedPodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call patchNamespacedPodCertificateRequestCall(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchNamespacedPodCertificateRequestValidateBeforeCall(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedPodCertificateRequest(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedPodCertificateRequest(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedPodCertificateRequest(Async)");
        }


        okhttp3.Call localVarCall = patchNamespacedPodCertificateRequestCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        return localVarCall;

    }

    /**
     *
     * partially update the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
     * @return V1alpha1PodCertificateRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1PodCertificateRequest patchNamespacedPodCertificateRequest(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequest> localVarResp = patchNamespacedPodCertificateRequestWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        return localVarResp.getData();
    }

    /**
     *
     * partially update the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1PodCertificateRequest> patchNamespacedPodCertificateRequestWithHttpInfo(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedPodCertificateRequestValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * partially update the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
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
    public okhttp3.Call patchNamespacedPodCertificateRequestAsync(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<V1alpha1PodCertificateRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedPodCertificateRequestValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchNamespacedPodCertificateRequestStatus
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call patchNamespacedPodCertificateRequestStatusCall(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchNamespacedPodCertificateRequestStatusValidateBeforeCall(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling patchNamespacedPodCertificateRequestStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling patchNamespacedPodCertificateRequestStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling patchNamespacedPodCertificateRequestStatus(Async)");
        }


        okhttp3.Call localVarCall = patchNamespacedPodCertificateRequestStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        return localVarCall;

    }

    /**
     *
     * partially update status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
     * @return V1alpha1PodCertificateRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1PodCertificateRequest patchNamespacedPodCertificateRequestStatus(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequest> localVarResp = patchNamespacedPodCertificateRequestStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
        return localVarResp.getData();
    }

    /**
     *
     * partially update status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1PodCertificateRequest> patchNamespacedPodCertificateRequestStatusWithHttpInfo(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force) throws ApiException {
        okhttp3.Call localVarCall = patchNamespacedPodCertificateRequestStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * partially update status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is required for apply requests (application/apply-patch) but optional for non-apply patch types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply patch requests. (optional)
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
    public okhttp3.Call patchNamespacedPodCertificateRequestStatusAsync(String name, String namespace, V1Patch body, String pretty, String dryRun, String fieldManager, String fieldValidation, Boolean force, final ApiCallback<V1alpha1PodCertificateRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchNamespacedPodCertificateRequestStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call readClusterTrustBundleCall(String name, String pretty, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call readClusterTrustBundleValidateBeforeCall(String name, String pretty, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readClusterTrustBundle(Async)");
        }


        okhttp3.Call localVarCall = readClusterTrustBundleCall(name, pretty, _callback);
        return localVarCall;

    }

    /**
     *
     * read the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @return V1alpha1ClusterTrustBundle
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1ClusterTrustBundle readClusterTrustBundle(String name, String pretty) throws ApiException {
        ApiResponse<V1alpha1ClusterTrustBundle> localVarResp = readClusterTrustBundleWithHttpInfo(name, pretty);
        return localVarResp.getData();
    }

    /**
     *
     * read the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @return ApiResponse&lt;V1alpha1ClusterTrustBundle&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1ClusterTrustBundle> readClusterTrustBundleWithHttpInfo(String name, String pretty) throws ApiException {
        okhttp3.Call localVarCall = readClusterTrustBundleValidateBeforeCall(name, pretty, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * read the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
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
    public okhttp3.Call readClusterTrustBundleAsync(String name, String pretty, final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {

        okhttp3.Call localVarCall = readClusterTrustBundleValidateBeforeCall(name, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readNamespacedPodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call readNamespacedPodCertificateRequestCall(String name, String namespace, String pretty, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call readNamespacedPodCertificateRequestValidateBeforeCall(String name, String namespace, String pretty, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedPodCertificateRequest(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedPodCertificateRequest(Async)");
        }


        okhttp3.Call localVarCall = readNamespacedPodCertificateRequestCall(name, namespace, pretty, _callback);
        return localVarCall;

    }

    /**
     *
     * read the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @return V1alpha1PodCertificateRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1PodCertificateRequest readNamespacedPodCertificateRequest(String name, String namespace, String pretty) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequest> localVarResp = readNamespacedPodCertificateRequestWithHttpInfo(name, namespace, pretty);
        return localVarResp.getData();
    }

    /**
     *
     * read the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1PodCertificateRequest> readNamespacedPodCertificateRequestWithHttpInfo(String name, String namespace, String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedPodCertificateRequestValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * read the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
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
    public okhttp3.Call readNamespacedPodCertificateRequestAsync(String name, String namespace, String pretty, final ApiCallback<V1alpha1PodCertificateRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedPodCertificateRequestValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for readNamespacedPodCertificateRequestStatus
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call readNamespacedPodCertificateRequestStatusCall(String name, String namespace, String pretty, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (pretty != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {

        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call readNamespacedPodCertificateRequestStatusValidateBeforeCall(String name, String namespace, String pretty, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling readNamespacedPodCertificateRequestStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling readNamespacedPodCertificateRequestStatus(Async)");
        }


        okhttp3.Call localVarCall = readNamespacedPodCertificateRequestStatusCall(name, namespace, pretty, _callback);
        return localVarCall;

    }

    /**
     *
     * read status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @return V1alpha1PodCertificateRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1PodCertificateRequest readNamespacedPodCertificateRequestStatus(String name, String namespace, String pretty) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequest> localVarResp = readNamespacedPodCertificateRequestStatusWithHttpInfo(name, namespace, pretty);
        return localVarResp.getData();
    }

    /**
     *
     * read status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1PodCertificateRequest> readNamespacedPodCertificateRequestStatusWithHttpInfo(String name, String namespace, String pretty) throws ApiException {
        okhttp3.Call localVarCall = readNamespacedPodCertificateRequestStatusValidateBeforeCall(name, namespace, pretty, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * read status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
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
    public okhttp3.Call readNamespacedPodCertificateRequestStatusAsync(String name, String namespace, String pretty, final ApiCallback<V1alpha1PodCertificateRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = readNamespacedPodCertificateRequestStatusValidateBeforeCall(name, namespace, pretty, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for replaceClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call replaceClusterTrustBundleCall(String name, V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/clustertrustbundles/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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


        okhttp3.Call localVarCall = replaceClusterTrustBundleCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        return localVarCall;

    }

    /**
     *
     * replace the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public V1alpha1ClusterTrustBundle replaceClusterTrustBundle(String name, V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        ApiResponse<V1alpha1ClusterTrustBundle> localVarResp = replaceClusterTrustBundleWithHttpInfo(name, body, pretty, dryRun, fieldManager, fieldValidation);
        return localVarResp.getData();
    }

    /**
     *
     * replace the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public ApiResponse<V1alpha1ClusterTrustBundle> replaceClusterTrustBundleWithHttpInfo(String name, V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceClusterTrustBundleValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * replace the specified ClusterTrustBundle
     * @param name name of the ClusterTrustBundle (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public okhttp3.Call replaceClusterTrustBundleAsync(String name, V1alpha1ClusterTrustBundle body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1alpha1ClusterTrustBundle> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceClusterTrustBundleValidateBeforeCall(name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1ClusterTrustBundle>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for replaceNamespacedPodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call replaceNamespacedPodCertificateRequestCall(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceNamespacedPodCertificateRequestValidateBeforeCall(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedPodCertificateRequest(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedPodCertificateRequest(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedPodCertificateRequest(Async)");
        }


        okhttp3.Call localVarCall = replaceNamespacedPodCertificateRequestCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        return localVarCall;

    }

    /**
     *
     * replace the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @return V1alpha1PodCertificateRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1PodCertificateRequest replaceNamespacedPodCertificateRequest(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequest> localVarResp = replaceNamespacedPodCertificateRequestWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        return localVarResp.getData();
    }

    /**
     *
     * replace the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1PodCertificateRequest> replaceNamespacedPodCertificateRequestWithHttpInfo(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedPodCertificateRequestValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * replace the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public okhttp3.Call replaceNamespacedPodCertificateRequestAsync(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1alpha1PodCertificateRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedPodCertificateRequestValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for replaceNamespacedPodCertificateRequestStatus
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @param _callback Callback for upload/download progress
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
    public okhttp3.Call replaceNamespacedPodCertificateRequestStatusCall(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apis/certificates.k8s.io/v1alpha1/namespaces/{namespace}/podcertificaterequests/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "application/yaml", "application/vnd.kubernetes.protobuf", "application/cbor"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "BearerToken" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call replaceNamespacedPodCertificateRequestStatusValidateBeforeCall(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback _callback) throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling replaceNamespacedPodCertificateRequestStatus(Async)");
        }

        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling replaceNamespacedPodCertificateRequestStatus(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling replaceNamespacedPodCertificateRequestStatus(Async)");
        }


        okhttp3.Call localVarCall = replaceNamespacedPodCertificateRequestStatusCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        return localVarCall;

    }

    /**
     *
     * replace status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @return V1alpha1PodCertificateRequest
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public V1alpha1PodCertificateRequest replaceNamespacedPodCertificateRequestStatus(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        ApiResponse<V1alpha1PodCertificateRequest> localVarResp = replaceNamespacedPodCertificateRequestStatusWithHttpInfo(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
        return localVarResp.getData();
    }

    /**
     *
     * replace status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
     * @return ApiResponse&lt;V1alpha1PodCertificateRequest&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<V1alpha1PodCertificateRequest> replaceNamespacedPodCertificateRequestStatusWithHttpInfo(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation) throws ApiException {
        okhttp3.Call localVarCall = replaceNamespacedPodCertificateRequestStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * replace status of the specified PodCertificateRequest
     * @param name name of the PodCertificateRequest (required)
     * @param namespace object name and auth scope, such as for teams and projects (required)
     * @param body  (required)
     * @param pretty If &#39;true&#39;, then the output is pretty printed. Defaults to &#39;false&#39; unless the user-agent indicates a browser or command-line HTTP tool (curl and wget). (optional)
     * @param dryRun When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed (optional)
     * @param fieldManager fieldManager is a name associated with the actor or entity that is making these changes. The value must be less than or 128 characters long, and only contain printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
     * @param fieldValidation fieldValidation instructs the server on how to handle objects in the request (POST/PUT/PATCH) containing unknown or duplicate fields. Valid values are: - Ignore: This will ignore any unknown fields that are silently dropped from the object, and will ignore all but the last duplicate field that the decoder encounters. This is the default behavior prior to v1.23. - Warn: This will send a warning via the standard warning response header for each unknown field that is dropped from the object, and for each duplicate field that is encountered. The request will still succeed if there are no other errors, and will only persist the last of any duplicate fields. This is the default in v1.23+ - Strict: This will fail the request with a BadRequest error if any unknown fields would be dropped from the object, or if any duplicate fields are present. The error returned from the server will contain all unknown and duplicate fields encountered. (optional)
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
    public okhttp3.Call replaceNamespacedPodCertificateRequestStatusAsync(String name, String namespace, V1alpha1PodCertificateRequest body, String pretty, String dryRun, String fieldManager, String fieldValidation, final ApiCallback<V1alpha1PodCertificateRequest> _callback) throws ApiException {

        okhttp3.Call localVarCall = replaceNamespacedPodCertificateRequestStatusValidateBeforeCall(name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
        Type localVarReturnType = new TypeToken<V1alpha1PodCertificateRequest>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
