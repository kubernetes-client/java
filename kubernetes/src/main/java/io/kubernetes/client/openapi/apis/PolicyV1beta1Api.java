/*
Copyright 2021 The Kubernetes Authors.
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
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiCallback;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.Pair;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudget;
import io.kubernetes.client.openapi.models.V1beta1PodDisruptionBudgetList;
import io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicy;
import io.kubernetes.client.openapi.models.V1beta1PodSecurityPolicyList;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolicyV1beta1Api {
  private ApiClient localVarApiClient;

  public PolicyV1beta1Api() {
    this(Configuration.getDefaultApiClient());
  }

  public PolicyV1beta1Api(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for createNamespacedPodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
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
  public okhttp3.Call createNamespacedPodDisruptionBudgetCall(
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets"
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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
  private okhttp3.Call createNamespacedPodDisruptionBudgetValidateBeforeCall(
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling createNamespacedPodDisruptionBudget(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createNamespacedPodDisruptionBudget(Async)");
    }

    okhttp3.Call localVarCall =
        createNamespacedPodDisruptionBudgetCall(
            namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * create a PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta1PodDisruptionBudget
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
  public V1beta1PodDisruptionBudget createNamespacedPodDisruptionBudget(
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudget> localVarResp =
        createNamespacedPodDisruptionBudgetWithHttpInfo(
            namespace, body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * create a PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudget&gt;
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
  public ApiResponse<V1beta1PodDisruptionBudget> createNamespacedPodDisruptionBudgetWithHttpInfo(
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    okhttp3.Call localVarCall =
        createNamespacedPodDisruptionBudgetValidateBeforeCall(
            namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
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
  public okhttp3.Call createNamespacedPodDisruptionBudgetAsync(
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta1PodDisruptionBudget> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createNamespacedPodDisruptionBudgetValidateBeforeCall(
            namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for createPodSecurityPolicy
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
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
  public okhttp3.Call createPodSecurityPolicyCall(
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/policy/v1beta1/podsecuritypolicies";

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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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
  private okhttp3.Call createPodSecurityPolicyValidateBeforeCall(
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createPodSecurityPolicy(Async)");
    }

    okhttp3.Call localVarCall =
        createPodSecurityPolicyCall(body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * create a PodSecurityPolicy
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta1PodSecurityPolicy
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
  public V1beta1PodSecurityPolicy createPodSecurityPolicy(
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta1PodSecurityPolicy> localVarResp =
        createPodSecurityPolicyWithHttpInfo(body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * create a PodSecurityPolicy
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta1PodSecurityPolicy&gt;
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
  public ApiResponse<V1beta1PodSecurityPolicy> createPodSecurityPolicyWithHttpInfo(
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    okhttp3.Call localVarCall =
        createPodSecurityPolicyValidateBeforeCall(
            body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) create a PodSecurityPolicy
   *
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
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
  public okhttp3.Call createPodSecurityPolicyAsync(
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta1PodSecurityPolicy> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createPodSecurityPolicyValidateBeforeCall(
            body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteCollectionNamespacedPodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
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
  public okhttp3.Call deleteCollectionNamespacedPodDisruptionBudgetCall(
      String namespace,
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets"
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (labelSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
    }

    if (resourceVersion != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
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
        "DELETE",
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
  private okhttp3.Call deleteCollectionNamespacedPodDisruptionBudgetValidateBeforeCall(
      String namespace,
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling deleteCollectionNamespacedPodDisruptionBudget(Async)");
    }

    okhttp3.Call localVarCall =
        deleteCollectionNamespacedPodDisruptionBudgetCall(
            namespace,
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete collection of PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deleteCollectionNamespacedPodDisruptionBudget(
      String namespace,
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deleteCollectionNamespacedPodDisruptionBudgetWithHttpInfo(
            namespace,
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body);
    return localVarResp.getData();
  }

  /**
   * delete collection of PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deleteCollectionNamespacedPodDisruptionBudgetWithHttpInfo(
      String namespace,
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteCollectionNamespacedPodDisruptionBudgetValidateBeforeCall(
            namespace,
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete collection of PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
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
  public okhttp3.Call deleteCollectionNamespacedPodDisruptionBudgetAsync(
      String namespace,
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionNamespacedPodDisruptionBudgetValidateBeforeCall(
            namespace,
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteCollectionPodSecurityPolicy
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
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
  public okhttp3.Call deleteCollectionPodSecurityPolicyCall(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath = "/apis/policy/v1beta1/podsecuritypolicies";

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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (labelSelector != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("labelSelector", labelSelector));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
    }

    if (resourceVersion != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
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
        "DELETE",
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
  private okhttp3.Call deleteCollectionPodSecurityPolicyValidateBeforeCall(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionPodSecurityPolicyCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete collection of PodSecurityPolicy
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deleteCollectionPodSecurityPolicy(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deleteCollectionPodSecurityPolicyWithHttpInfo(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body);
    return localVarResp.getData();
  }

  /**
   * delete collection of PodSecurityPolicy
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deleteCollectionPodSecurityPolicyWithHttpInfo(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteCollectionPodSecurityPolicyValidateBeforeCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete collection of PodSecurityPolicy
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param body (optional)
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
  public okhttp3.Call deleteCollectionPodSecurityPolicyAsync(
      String pretty,
      String _continue,
      String dryRun,
      String fieldSelector,
      Integer gracePeriodSeconds,
      String labelSelector,
      Integer limit,
      Boolean orphanDependents,
      String propagationPolicy,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionPodSecurityPolicyValidateBeforeCall(
            pretty,
            _continue,
            dryRun,
            fieldSelector,
            gracePeriodSeconds,
            labelSelector,
            limit,
            orphanDependents,
            propagationPolicy,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteNamespacedPodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteNamespacedPodDisruptionBudgetCall(
      String name,
      String namespace,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (gracePeriodSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
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
        "DELETE",
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
  private okhttp3.Call deleteNamespacedPodDisruptionBudgetValidateBeforeCall(
      String name,
      String namespace,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling deleteNamespacedPodDisruptionBudget(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling deleteNamespacedPodDisruptionBudget(Async)");
    }

    okhttp3.Call localVarCall =
        deleteNamespacedPodDisruptionBudgetCall(
            name,
            namespace,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete a PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return V1Status
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1Status deleteNamespacedPodDisruptionBudget(
      String name,
      String namespace,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1Status> localVarResp =
        deleteNamespacedPodDisruptionBudgetWithHttpInfo(
            name,
            namespace,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body);
    return localVarResp.getData();
  }

  /**
   * delete a PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1Status&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1Status> deleteNamespacedPodDisruptionBudgetWithHttpInfo(
      String name,
      String namespace,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteNamespacedPodDisruptionBudgetValidateBeforeCall(
            name,
            namespace,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete a PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deleteNamespacedPodDisruptionBudgetAsync(
      String name,
      String namespace,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback<V1Status> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteNamespacedPodDisruptionBudgetValidateBeforeCall(
            name,
            namespace,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1Status>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deletePodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deletePodSecurityPolicyCall(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/podsecuritypolicies/{name}"
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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("gracePeriodSeconds", gracePeriodSeconds));
    }

    if (orphanDependents != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("orphanDependents", orphanDependents));
    }

    if (propagationPolicy != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("propagationPolicy", propagationPolicy));
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
        "DELETE",
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
  private okhttp3.Call deletePodSecurityPolicyValidateBeforeCall(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling deletePodSecurityPolicy(Async)");
    }

    okhttp3.Call localVarCall =
        deletePodSecurityPolicyCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * delete a PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return V1beta1PodSecurityPolicy
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodSecurityPolicy deletePodSecurityPolicy(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<V1beta1PodSecurityPolicy> localVarResp =
        deletePodSecurityPolicyWithHttpInfo(
            name, pretty, dryRun, gracePeriodSeconds, orphanDependents, propagationPolicy, body);
    return localVarResp.getData();
  }

  /**
   * delete a PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @return ApiResponse&lt;V1beta1PodSecurityPolicy&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodSecurityPolicy> deletePodSecurityPolicyWithHttpInfo(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deletePodSecurityPolicyValidateBeforeCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            null);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) delete a PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param gracePeriodSeconds The duration in seconds before the object should be deleted. Value
   *     must be non-negative integer. The value zero indicates delete immediately. If this value is
   *     nil, the default grace period for the specified type will be used. Defaults to a per object
   *     value if not specified. zero means delete immediately. (optional)
   * @param orphanDependents Deprecated: please use the PropagationPolicy, this field will be
   *     deprecated in 1.7. Should the dependent objects be orphaned. If true/false, the
   *     \&quot;orphan\&quot; finalizer will be added to/removed from the object&#39;s finalizers
   *     list. Either this field or PropagationPolicy may be set, but not both. (optional)
   * @param propagationPolicy Whether and how garbage collection will be performed. Either this
   *     field or OrphanDependents may be set, but not both. The default policy is decided by the
   *     existing finalizer set in the metadata.finalizers and the resource-specific default policy.
   *     Acceptable values are: &#39;Orphan&#39; - orphan the dependents; &#39;Background&#39; -
   *     allow the garbage collector to delete the dependents in the background;
   *     &#39;Foreground&#39; - a cascading policy that deletes all dependents in the foreground.
   *     (optional)
   * @param body (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call deletePodSecurityPolicyAsync(
      String name,
      String pretty,
      String dryRun,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      V1DeleteOptions body,
      final ApiCallback<V1beta1PodSecurityPolicy> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deletePodSecurityPolicyValidateBeforeCall(
            name,
            pretty,
            dryRun,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
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
    String localVarPath = "/apis/policy/v1beta1/";

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
  /**
   * Build call for listNamespacedPodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
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
  public okhttp3.Call listNamespacedPodDisruptionBudgetCall(
      String namespace,
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets"
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (allowWatchBookmarks != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
    }

    if (watch != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
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
  private okhttp3.Call listNamespacedPodDisruptionBudgetValidateBeforeCall(
      String namespace,
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling listNamespacedPodDisruptionBudget(Async)");
    }

    okhttp3.Call localVarCall =
        listNamespacedPodDisruptionBudgetCall(
            namespace,
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    return localVarCall;
  }

  /**
   * list or watch objects of kind PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return V1beta1PodDisruptionBudgetList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodDisruptionBudgetList listNamespacedPodDisruptionBudget(
      String namespace,
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudgetList> localVarResp =
        listNamespacedPodDisruptionBudgetWithHttpInfo(
            namespace,
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch);
    return localVarResp.getData();
  }

  /**
   * list or watch objects of kind PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudgetList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodDisruptionBudgetList> listNamespacedPodDisruptionBudgetWithHttpInfo(
      String namespace,
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    okhttp3.Call localVarCall =
        listNamespacedPodDisruptionBudgetValidateBeforeCall(
            namespace,
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudgetList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) list or watch objects of kind PodDisruptionBudget
   *
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
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
  public okhttp3.Call listNamespacedPodDisruptionBudgetAsync(
      String namespace,
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback<V1beta1PodDisruptionBudgetList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listNamespacedPodDisruptionBudgetValidateBeforeCall(
            namespace,
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudgetList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for listPodDisruptionBudgetForAllNamespaces
   *
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
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
  public okhttp3.Call listPodDisruptionBudgetForAllNamespacesCall(
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String pretty,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/apis/policy/v1beta1/poddisruptionbudgets";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (allowWatchBookmarks != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
    }

    if (watch != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
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
  private okhttp3.Call listPodDisruptionBudgetForAllNamespacesValidateBeforeCall(
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String pretty,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listPodDisruptionBudgetForAllNamespacesCall(
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            pretty,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    return localVarCall;
  }

  /**
   * list or watch objects of kind PodDisruptionBudget
   *
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return V1beta1PodDisruptionBudgetList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodDisruptionBudgetList listPodDisruptionBudgetForAllNamespaces(
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String pretty,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudgetList> localVarResp =
        listPodDisruptionBudgetForAllNamespacesWithHttpInfo(
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            pretty,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch);
    return localVarResp.getData();
  }

  /**
   * list or watch objects of kind PodDisruptionBudget
   *
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudgetList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodDisruptionBudgetList>
      listPodDisruptionBudgetForAllNamespacesWithHttpInfo(
          Boolean allowWatchBookmarks,
          String _continue,
          String fieldSelector,
          String labelSelector,
          Integer limit,
          String pretty,
          String resourceVersion,
          String resourceVersionMatch,
          Integer timeoutSeconds,
          Boolean watch)
          throws ApiException {
    okhttp3.Call localVarCall =
        listPodDisruptionBudgetForAllNamespacesValidateBeforeCall(
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            pretty,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudgetList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) list or watch objects of kind PodDisruptionBudget
   *
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
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
  public okhttp3.Call listPodDisruptionBudgetForAllNamespacesAsync(
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String pretty,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback<V1beta1PodDisruptionBudgetList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listPodDisruptionBudgetForAllNamespacesValidateBeforeCall(
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            pretty,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudgetList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for listPodSecurityPolicy
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
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
  public okhttp3.Call listPodSecurityPolicyCall(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/apis/policy/v1beta1/podsecuritypolicies";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
    }

    if (allowWatchBookmarks != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("allowWatchBookmarks", allowWatchBookmarks));
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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersion", resourceVersion));
    }

    if (resourceVersionMatch != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("resourceVersionMatch", resourceVersionMatch));
    }

    if (timeoutSeconds != null) {
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
    }

    if (watch != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("watch", watch));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
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
  private okhttp3.Call listPodSecurityPolicyValidateBeforeCall(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listPodSecurityPolicyCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    return localVarCall;
  }

  /**
   * list or watch objects of kind PodSecurityPolicy
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return V1beta1PodSecurityPolicyList
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodSecurityPolicyList listPodSecurityPolicy(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    ApiResponse<V1beta1PodSecurityPolicyList> localVarResp =
        listPodSecurityPolicyWithHttpInfo(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch);
    return localVarResp.getData();
  }

  /**
   * list or watch objects of kind PodSecurityPolicy
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
   * @return ApiResponse&lt;V1beta1PodSecurityPolicyList&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodSecurityPolicyList> listPodSecurityPolicyWithHttpInfo(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch)
      throws ApiException {
    okhttp3.Call localVarCall =
        listPodSecurityPolicyValidateBeforeCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            null);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicyList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) list or watch objects of kind PodSecurityPolicy
   *
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. (optional)
   * @param _continue The continue option should be set when retrieving more results from the
   *     server. Since this value is server defined, clients may only use the continue value from a
   *     previous query result with identical query parameters (except for the value of continue)
   *     and the server may reject a continue value it does not recognize. If the specified continue
   *     value is no longer valid whether due to expiration (generally five to fifteen minutes) or a
   *     configuration change on the server, the server will respond with a 410 ResourceExpired
   *     error together with a continue token. If the client needs a consistent list, it must
   *     restart their list without the continue field. Otherwise, the client may send another list
   *     request with the token received with the 410 error, the server will respond with a list
   *     starting from the next key, but from the latest snapshot, which is inconsistent from the
   *     previous list results - objects that are created, modified, or deleted after the first list
   *     request will be included in the response, as long as their keys are after the \&quot;next
   *     key\&quot;. This field is not supported when watch is true. Clients may start a watch from
   *     the last resourceVersion value returned by the server and not miss any modifications.
   *     (optional)
   * @param fieldSelector A selector to restrict the list of returned objects by their fields.
   *     Defaults to everything. (optional)
   * @param labelSelector A selector to restrict the list of returned objects by their labels.
   *     Defaults to everything. (optional)
   * @param limit limit is a maximum number of responses to return for a list call. If more items
   *     exist, the server will set the &#x60;continue&#x60; field on the list metadata to a value
   *     that can be used with the same initial query to retrieve the next set of results. Setting a
   *     limit may return fewer than the requested amount of items (up to zero items) in the event
   *     all requested objects are filtered out and clients should only use the presence of the
   *     continue field to determine whether more results are available. Servers may choose not to
   *     support the limit argument and will return all of the available results. If limit is
   *     specified and the continue field is empty, clients may assume that no more results are
   *     available. This field is not supported if watch is true. The server guarantees that the
   *     objects returned when using continue will be identical to issuing a single list call
   *     without a limit - that is, no objects created, modified, or deleted after the first request
   *     is issued will be included in any subsequent continued requests. This is sometimes referred
   *     to as a consistent snapshot, and ensures that a client that is using limit to receive
   *     smaller chunks of a very large result can ensure they see all possible objects. If objects
   *     are updated during a chunked list the version of the object that was present at the time
   *     the first list result was calculated is returned. (optional)
   * @param resourceVersion resourceVersion sets a constraint on what resource versions a request
   *     may be served from. See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. Specify resourceVersion. (optional)
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
  public okhttp3.Call listPodSecurityPolicyAsync(
      String pretty,
      Boolean allowWatchBookmarks,
      String _continue,
      String fieldSelector,
      String labelSelector,
      Integer limit,
      String resourceVersion,
      String resourceVersionMatch,
      Integer timeoutSeconds,
      Boolean watch,
      final ApiCallback<V1beta1PodSecurityPolicyList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listPodSecurityPolicyValidateBeforeCall(
            pretty,
            allowWatchBookmarks,
            _continue,
            fieldSelector,
            labelSelector,
            limit,
            resourceVersion,
            resourceVersionMatch,
            timeoutSeconds,
            watch,
            _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicyList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchNamespacedPodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedPodDisruptionBudgetCall(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
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

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
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
  private okhttp3.Call patchNamespacedPodDisruptionBudgetValidateBeforeCall(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchNamespacedPodDisruptionBudget(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling patchNamespacedPodDisruptionBudget(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchNamespacedPodDisruptionBudget(Async)");
    }

    okhttp3.Call localVarCall =
        patchNamespacedPodDisruptionBudgetCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    return localVarCall;
  }

  /**
   * partially update the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta1PodDisruptionBudget
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodDisruptionBudget patchNamespacedPodDisruptionBudget(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudget> localVarResp =
        patchNamespacedPodDisruptionBudgetWithHttpInfo(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
    return localVarResp.getData();
  }

  /**
   * partially update the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudget&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodDisruptionBudget> patchNamespacedPodDisruptionBudgetWithHttpInfo(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchNamespacedPodDisruptionBudgetValidateBeforeCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedPodDisruptionBudgetAsync(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback<V1beta1PodDisruptionBudget> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchNamespacedPodDisruptionBudgetValidateBeforeCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchNamespacedPodDisruptionBudgetStatus
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedPodDisruptionBudgetStatusCall(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
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

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
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
  private okhttp3.Call patchNamespacedPodDisruptionBudgetStatusValidateBeforeCall(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchNamespacedPodDisruptionBudgetStatus(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling patchNamespacedPodDisruptionBudgetStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchNamespacedPodDisruptionBudgetStatus(Async)");
    }

    okhttp3.Call localVarCall =
        patchNamespacedPodDisruptionBudgetStatusCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    return localVarCall;
  }

  /**
   * partially update status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta1PodDisruptionBudget
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodDisruptionBudget patchNamespacedPodDisruptionBudgetStatus(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudget> localVarResp =
        patchNamespacedPodDisruptionBudgetStatusWithHttpInfo(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force);
    return localVarResp.getData();
  }

  /**
   * partially update status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudget&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodDisruptionBudget>
      patchNamespacedPodDisruptionBudgetStatusWithHttpInfo(
          String name,
          String namespace,
          V1Patch body,
          String pretty,
          String dryRun,
          String fieldManager,
          String fieldValidation,
          Boolean force)
          throws ApiException {
    okhttp3.Call localVarCall =
        patchNamespacedPodDisruptionBudgetStatusValidateBeforeCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedPodDisruptionBudgetStatusAsync(
      String name,
      String namespace,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback<V1beta1PodDisruptionBudget> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchNamespacedPodDisruptionBudgetStatusValidateBeforeCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchPodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchPodSecurityPolicyCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/podsecuritypolicies/{name}"
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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
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

    final String[] localVarContentTypes = {
      "application/json-patch+json",
      "application/merge-patch+json",
      "application/strategic-merge-patch+json",
      "application/apply-patch+yaml"
    };
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames = new String[] {"BearerToken"};
    return localVarApiClient.buildCall(
        localVarPath,
        "PATCH",
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
  private okhttp3.Call patchPodSecurityPolicyValidateBeforeCall(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchPodSecurityPolicy(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchPodSecurityPolicy(Async)");
    }

    okhttp3.Call localVarCall =
        patchPodSecurityPolicyCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    return localVarCall;
  }

  /**
   * partially update the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return V1beta1PodSecurityPolicy
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodSecurityPolicy patchPodSecurityPolicy(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    ApiResponse<V1beta1PodSecurityPolicy> localVarResp =
        patchPodSecurityPolicyWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force);
    return localVarResp.getData();
  }

  /**
   * partially update the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;V1beta1PodSecurityPolicy&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodSecurityPolicy> patchPodSecurityPolicyWithHttpInfo(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchPodSecurityPolicyValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, null);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchPodSecurityPolicyAsync(
      String name,
      V1Patch body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      Boolean force,
      final ApiCallback<V1beta1PodSecurityPolicy> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchPodSecurityPolicyValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, force, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readNamespacedPodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
  public okhttp3.Call readNamespacedPodDisruptionBudgetCall(
      String name, String namespace, String pretty, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
  private okhttp3.Call readNamespacedPodDisruptionBudgetValidateBeforeCall(
      String name, String namespace, String pretty, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readNamespacedPodDisruptionBudget(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling readNamespacedPodDisruptionBudget(Async)");
    }

    okhttp3.Call localVarCall =
        readNamespacedPodDisruptionBudgetCall(name, namespace, pretty, _callback);
    return localVarCall;
  }

  /**
   * read the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta1PodDisruptionBudget
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodDisruptionBudget readNamespacedPodDisruptionBudget(
      String name, String namespace, String pretty) throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudget> localVarResp =
        readNamespacedPodDisruptionBudgetWithHttpInfo(name, namespace, pretty);
    return localVarResp.getData();
  }

  /**
   * read the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudget&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodDisruptionBudget> readNamespacedPodDisruptionBudgetWithHttpInfo(
      String name, String namespace, String pretty) throws ApiException {
    okhttp3.Call localVarCall =
        readNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
  public okhttp3.Call readNamespacedPodDisruptionBudgetAsync(
      String name,
      String namespace,
      String pretty,
      final ApiCallback<V1beta1PodDisruptionBudget> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        readNamespacedPodDisruptionBudgetValidateBeforeCall(name, namespace, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readNamespacedPodDisruptionBudgetStatus
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
  public okhttp3.Call readNamespacedPodDisruptionBudgetStatusCall(
      String name, String namespace, String pretty, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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
  private okhttp3.Call readNamespacedPodDisruptionBudgetStatusValidateBeforeCall(
      String name, String namespace, String pretty, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readNamespacedPodDisruptionBudgetStatus(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling readNamespacedPodDisruptionBudgetStatus(Async)");
    }

    okhttp3.Call localVarCall =
        readNamespacedPodDisruptionBudgetStatusCall(name, namespace, pretty, _callback);
    return localVarCall;
  }

  /**
   * read status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta1PodDisruptionBudget
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodDisruptionBudget readNamespacedPodDisruptionBudgetStatus(
      String name, String namespace, String pretty) throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudget> localVarResp =
        readNamespacedPodDisruptionBudgetStatusWithHttpInfo(name, namespace, pretty);
    return localVarResp.getData();
  }

  /**
   * read status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudget&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodDisruptionBudget>
      readNamespacedPodDisruptionBudgetStatusWithHttpInfo(
          String name, String namespace, String pretty) throws ApiException {
    okhttp3.Call localVarCall =
        readNamespacedPodDisruptionBudgetStatusValidateBeforeCall(name, namespace, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
  public okhttp3.Call readNamespacedPodDisruptionBudgetStatusAsync(
      String name,
      String namespace,
      String pretty,
      final ApiCallback<V1beta1PodDisruptionBudget> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        readNamespacedPodDisruptionBudgetStatusValidateBeforeCall(
            name, namespace, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for readPodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
  public okhttp3.Call readPodSecurityPolicyCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/podsecuritypolicies/{name}"
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
  private okhttp3.Call readPodSecurityPolicyValidateBeforeCall(
      String name, String pretty, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling readPodSecurityPolicy(Async)");
    }

    okhttp3.Call localVarCall = readPodSecurityPolicyCall(name, pretty, _callback);
    return localVarCall;
  }

  /**
   * read the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return V1beta1PodSecurityPolicy
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodSecurityPolicy readPodSecurityPolicy(String name, String pretty)
      throws ApiException {
    ApiResponse<V1beta1PodSecurityPolicy> localVarResp =
        readPodSecurityPolicyWithHttpInfo(name, pretty);
    return localVarResp.getData();
  }

  /**
   * read the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @return ApiResponse&lt;V1beta1PodSecurityPolicy&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodSecurityPolicy> readPodSecurityPolicyWithHttpInfo(
      String name, String pretty) throws ApiException {
    okhttp3.Call localVarCall = readPodSecurityPolicyValidateBeforeCall(name, pretty, null);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
  public okhttp3.Call readPodSecurityPolicyAsync(
      String name, String pretty, final ApiCallback<V1beta1PodSecurityPolicy> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = readPodSecurityPolicyValidateBeforeCall(name, pretty, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceNamespacedPodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceNamespacedPodDisruptionBudgetCall(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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
        "PUT",
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
  private okhttp3.Call replaceNamespacedPodDisruptionBudgetValidateBeforeCall(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceNamespacedPodDisruptionBudget(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling replaceNamespacedPodDisruptionBudget(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceNamespacedPodDisruptionBudget(Async)");
    }

    okhttp3.Call localVarCall =
        replaceNamespacedPodDisruptionBudgetCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * replace the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta1PodDisruptionBudget
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodDisruptionBudget replaceNamespacedPodDisruptionBudget(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudget> localVarResp =
        replaceNamespacedPodDisruptionBudgetWithHttpInfo(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * replace the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudget&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodDisruptionBudget> replaceNamespacedPodDisruptionBudgetWithHttpInfo(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceNamespacedPodDisruptionBudgetValidateBeforeCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceNamespacedPodDisruptionBudgetAsync(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta1PodDisruptionBudget> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceNamespacedPodDisruptionBudgetValidateBeforeCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceNamespacedPodDisruptionBudgetStatus
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceNamespacedPodDisruptionBudgetStatusCall(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/namespaces/{namespace}/poddisruptionbudgets/{name}/status"
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()));

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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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
        "PUT",
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
  private okhttp3.Call replaceNamespacedPodDisruptionBudgetStatusValidateBeforeCall(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceNamespacedPodDisruptionBudgetStatus(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling replaceNamespacedPodDisruptionBudgetStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceNamespacedPodDisruptionBudgetStatus(Async)");
    }

    okhttp3.Call localVarCall =
        replaceNamespacedPodDisruptionBudgetStatusCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * replace status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta1PodDisruptionBudget
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodDisruptionBudget replaceNamespacedPodDisruptionBudgetStatus(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta1PodDisruptionBudget> localVarResp =
        replaceNamespacedPodDisruptionBudgetStatusWithHttpInfo(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * replace status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta1PodDisruptionBudget&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodDisruptionBudget>
      replaceNamespacedPodDisruptionBudgetStatusWithHttpInfo(
          String name,
          String namespace,
          V1beta1PodDisruptionBudget body,
          String pretty,
          String dryRun,
          String fieldManager,
          String fieldValidation)
          throws ApiException {
    okhttp3.Call localVarCall =
        replaceNamespacedPodDisruptionBudgetStatusValidateBeforeCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace status of the specified PodDisruptionBudget
   *
   * @param name name of the PodDisruptionBudget (required)
   * @param namespace object name and auth scope, such as for teams and projects (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replaceNamespacedPodDisruptionBudgetStatusAsync(
      String name,
      String namespace,
      V1beta1PodDisruptionBudget body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta1PodDisruptionBudget> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceNamespacedPodDisruptionBudgetStatusValidateBeforeCall(
            name, namespace, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodDisruptionBudget>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replacePodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replacePodSecurityPolicyCall(
      String name,
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/policy/v1beta1/podsecuritypolicies/{name}"
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
      localVarQueryParams.addAll(
          localVarApiClient.parameterToPair("fieldValidation", fieldValidation));
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
        "PUT",
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
  private okhttp3.Call replacePodSecurityPolicyValidateBeforeCall(
      String name,
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replacePodSecurityPolicy(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replacePodSecurityPolicy(Async)");
    }

    okhttp3.Call localVarCall =
        replacePodSecurityPolicyCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    return localVarCall;
  }

  /**
   * replace the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return V1beta1PodSecurityPolicy
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public V1beta1PodSecurityPolicy replacePodSecurityPolicy(
      String name,
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    ApiResponse<V1beta1PodSecurityPolicy> localVarResp =
        replacePodSecurityPolicyWithHttpInfo(
            name, body, pretty, dryRun, fieldManager, fieldValidation);
    return localVarResp.getData();
  }

  /**
   * replace the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @return ApiResponse&lt;V1beta1PodSecurityPolicy&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<V1beta1PodSecurityPolicy> replacePodSecurityPolicyWithHttpInfo(
      String name,
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation)
      throws ApiException {
    okhttp3.Call localVarCall =
        replacePodSecurityPolicyValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, null);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace the specified PodSecurityPolicy
   *
   * @param name name of the PodSecurityPolicy (required)
   * @param body (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param fieldValidation fieldValidation determines how the server should respond to
   *     unknown/duplicate fields in the object in the request. Introduced as alpha in 1.23, older
   *     servers or servers with the &#x60;ServerSideFieldValidation&#x60; feature disabled will
   *     discard valid values specified in this param and not perform any server side field
   *     validation. Valid values are: - Ignore: ignores unknown/duplicate fields. - Warn: responds
   *     with a warning for each unknown/duplicate field, but successfully serves the request. -
   *     Strict: fails the request on unknown/duplicate fields. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call replacePodSecurityPolicyAsync(
      String name,
      V1beta1PodSecurityPolicy body,
      String pretty,
      String dryRun,
      String fieldManager,
      String fieldValidation,
      final ApiCallback<V1beta1PodSecurityPolicy> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replacePodSecurityPolicyValidateBeforeCall(
            name, body, pretty, dryRun, fieldManager, fieldValidation, _callback);
    Type localVarReturnType = new TypeToken<V1beta1PodSecurityPolicy>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
