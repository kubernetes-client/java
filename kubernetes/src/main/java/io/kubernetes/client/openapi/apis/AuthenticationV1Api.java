/*
Copyright 2022 The Kubernetes Authors.
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

import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.openapi.ApiCallback;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.Pair;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1TokenReview;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthenticationV1Api {
  private ApiClient localVarApiClient;

  public AuthenticationV1Api() {
    this(Configuration.getDefaultApiClient());
  }

  public AuthenticationV1Api(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for createTokenReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation instructs the server on how to handle objects in the
   *     request (POST/PUT/PATCH) containing unknown or duplicate fields, provided that the
   *     &#x60;ServerSideFieldValidation&#x60; feature gate is also enabled. Valid values are: -
   *     Ignore: This will ignore any unknown fields that are silently dropped from the object, and
   *     will ignore all but the last duplicate field that the decoder encounters. This is the
   *     default behavior prior to v1.23 and is the default behavior when the
   *     &#x60;ServerSideFieldValidation&#x60; feature gate is disabled. - Warn: This will send a
   *     warning via the standard warning response header for each unknown field that is dropped
   *     from the object, and for each duplicate field that is encountered. The request will still
   *     succeed if there are no other errors, and will only persist the last of any duplicate
   *     fields. This is the default when the &#x60;ServerSideFieldValidation&#x60; feature gate is
   *     enabled. - Strict: This will fail the request with a BadRequest error if any unknown fields
   *     would be dropped from the object, or if any duplicate fields are present. The error
   *     returned from the server will contain all unknown and duplicate fields encountered.
   *     (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createTokenReviewCall(
      V1TokenReview body,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/authentication.k8s.io/v1/tokenreviews";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (fieldValidation != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call createTokenReviewValidateBeforeCall(
      V1TokenReview body,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      String pretty,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createTokenReview(Async)");
    }

    okhttp3.Call localVarCall =
        createTokenReviewCall(body, dryRun, fieldManager, fieldValidation, pretty, _callback);
    return localVarCall;
  }

  /**
   * create a TokenReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation instructs the server on how to handle objects in the
   *     request (POST/PUT/PATCH) containing unknown or duplicate fields, provided that the
   *     &#x60;ServerSideFieldValidation&#x60; feature gate is also enabled. Valid values are: -
   *     Ignore: This will ignore any unknown fields that are silently dropped from the object, and
   *     will ignore all but the last duplicate field that the decoder encounters. This is the
   *     default behavior prior to v1.23 and is the default behavior when the
   *     &#x60;ServerSideFieldValidation&#x60; feature gate is disabled. - Warn: This will send a
   *     warning via the standard warning response header for each unknown field that is dropped
   *     from the object, and for each duplicate field that is encountered. The request will still
   *     succeed if there are no other errors, and will only persist the last of any duplicate
   *     fields. This is the default when the &#x60;ServerSideFieldValidation&#x60; feature gate is
   *     enabled. - Strict: This will fail the request with a BadRequest error if any unknown fields
   *     would be dropped from the object, or if any duplicate fields are present. The error
   *     returned from the server will contain all unknown and duplicate fields encountered.
   *     (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1TokenReview
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1TokenReview createTokenReview(
      V1TokenReview body, String dryRun, String fieldManager, String fieldValidation, String pretty)
      throws ApiException {
    ApiResponse<V1TokenReview> localVarResp =
        createTokenReviewWithHttpInfo(body, dryRun, fieldManager, fieldValidation, pretty);
    return localVarResp.getData();
  }

  /**
   * create a TokenReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation instructs the server on how to handle objects in the
   *     request (POST/PUT/PATCH) containing unknown or duplicate fields, provided that the
   *     &#x60;ServerSideFieldValidation&#x60; feature gate is also enabled. Valid values are: -
   *     Ignore: This will ignore any unknown fields that are silently dropped from the object, and
   *     will ignore all but the last duplicate field that the decoder encounters. This is the
   *     default behavior prior to v1.23 and is the default behavior when the
   *     &#x60;ServerSideFieldValidation&#x60; feature gate is disabled. - Warn: This will send a
   *     warning via the standard warning response header for each unknown field that is dropped
   *     from the object, and for each duplicate field that is encountered. The request will still
   *     succeed if there are no other errors, and will only persist the last of any duplicate
   *     fields. This is the default when the &#x60;ServerSideFieldValidation&#x60; feature gate is
   *     enabled. - Strict: This will fail the request with a BadRequest error if any unknown fields
   *     would be dropped from the object, or if any duplicate fields are present. The error
   *     returned from the server will contain all unknown and duplicate fields encountered.
   *     (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1TokenReview&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1TokenReview> createTokenReviewWithHttpInfo(
      V1TokenReview body, String dryRun, String fieldManager, String fieldValidation, String pretty)
      throws ApiException {
    okhttp3.Call localVarCall =
        createTokenReviewValidateBeforeCall(
            body, dryRun, fieldManager, fieldValidation, pretty, null);
    Type localVarReturnType = new TypeToken<V1TokenReview>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a TokenReview
   *
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation instructs the server on how to handle objects in the
   *     request (POST/PUT/PATCH) containing unknown or duplicate fields, provided that the
   *     &#x60;ServerSideFieldValidation&#x60; feature gate is also enabled. Valid values are: -
   *     Ignore: This will ignore any unknown fields that are silently dropped from the object, and
   *     will ignore all but the last duplicate field that the decoder encounters. This is the
   *     default behavior prior to v1.23 and is the default behavior when the
   *     &#x60;ServerSideFieldValidation&#x60; feature gate is disabled. - Warn: This will send a
   *     warning via the standard warning response header for each unknown field that is dropped
   *     from the object, and for each duplicate field that is encountered. The request will still
   *     succeed if there are no other errors, and will only persist the last of any duplicate
   *     fields. This is the default when the &#x60;ServerSideFieldValidation&#x60; feature gate is
   *     enabled. - Strict: This will fail the request with a BadRequest error if any unknown fields
   *     would be dropped from the object, or if any duplicate fields are present. The error
   *     returned from the server will contain all unknown and duplicate fields encountered.
   *     (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createTokenReviewAsync(
      V1TokenReview body,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      String pretty,
      final ApiCallback<V1TokenReview> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createTokenReviewValidateBeforeCall(
            body, dryRun, fieldManager, fieldValidation, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1TokenReview>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getAPIResources
   *
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getAPIResourcesCall(final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/apis/authentication.k8s.io/v1/";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {
      "application/json", "application/yaml", "application/vnd.kubernetes.protobuf"
    };
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call getAPIResourcesValidateBeforeCall(final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall = getAPIResourcesCall(_callback);
    return localVarCall;
  }

  /**
   * get available resources
   *
   * @return V1APIResourceList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1APIResourceList getAPIResources() throws ApiException {
    ApiResponse<V1APIResourceList> localVarResp = getAPIResourcesWithHttpInfo();
    return localVarResp.getData();
  }

  /**
   * get available resources
   *
   * @return ApiResponse&lt;V1APIResourceList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1APIResourceList> getAPIResourcesWithHttpInfo() throws ApiException {
    okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(null);
    Type localVarReturnType = new TypeToken<V1APIResourceList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) get available resources
   *
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getAPIResourcesAsync(final ApiCallback<V1APIResourceList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(_callback);
    Type localVarReturnType = new TypeToken<V1APIResourceList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
