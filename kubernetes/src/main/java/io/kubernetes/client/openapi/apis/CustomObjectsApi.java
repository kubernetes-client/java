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
import io.kubernetes.client.openapi.models.V1DeleteOptions;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomObjectsApi {
  private ApiClient localVarApiClient;

  public CustomObjectsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomObjectsApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for createClusterCustomObject
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param body The JSON schema of the Resource to create. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createClusterCustomObjectCall(
      String group,
      String version,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()));

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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call createClusterCustomObjectValidateBeforeCall(
      String group,
      String version,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling createClusterCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling createClusterCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling createClusterCustomObject(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createClusterCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        createClusterCustomObjectCall(
            group, version, plural, body, pretty, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * Creates a cluster scoped Custom object
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param body The JSON schema of the Resource to create. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object createClusterCustomObject(
      String group,
      String version,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        createClusterCustomObjectWithHttpInfo(
            group, version, plural, body, pretty, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * Creates a cluster scoped Custom object
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param body The JSON schema of the Resource to create. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> createClusterCustomObjectWithHttpInfo(
      String group,
      String version,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        createClusterCustomObjectValidateBeforeCall(
            group, version, plural, body, pretty, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Creates a cluster scoped Custom object
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param body The JSON schema of the Resource to create. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createClusterCustomObjectAsync(
      String group,
      String version,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createClusterCustomObjectValidateBeforeCall(
            group, version, plural, body, pretty, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for createNamespacedCustomObject
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param body The JSON schema of the Resource to create. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createNamespacedCustomObjectCall(
      String group,
      String version,
      String namespace,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll(
                "\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()));

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

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call createNamespacedCustomObjectValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling createNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling createNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling createNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling createNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling createNamespacedCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        createNamespacedCustomObjectCall(
            group, version, namespace, plural, body, pretty, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * Creates a namespace scoped Custom object
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param body The JSON schema of the Resource to create. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object createNamespacedCustomObject(
      String group,
      String version,
      String namespace,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        createNamespacedCustomObjectWithHttpInfo(
            group, version, namespace, plural, body, pretty, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * Creates a namespace scoped Custom object
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param body The JSON schema of the Resource to create. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> createNamespacedCustomObjectWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        createNamespacedCustomObjectValidateBeforeCall(
            group, version, namespace, plural, body, pretty, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Creates a namespace scoped Custom object
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param body The JSON schema of the Resource to create. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call createNamespacedCustomObjectAsync(
      String group,
      String version,
      String namespace,
      String plural,
      Object body,
      String pretty,
      String dryRun,
      String fieldManager,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        createNamespacedCustomObjectValidateBeforeCall(
            group, version, namespace, plural, body, pretty, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteClusterCustomObject
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
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
  public okhttp3.Call deleteClusterCustomObjectCall(
      String group,
      String version,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call deleteClusterCustomObjectValidateBeforeCall(
      String group,
      String version,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling deleteClusterCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling deleteClusterCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling deleteClusterCustomObject(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling deleteClusterCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        deleteClusterCustomObjectCall(
            group,
            version,
            plural,
            name,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * Deletes the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param body (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object deleteClusterCustomObject(
      String group,
      String version,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        deleteClusterCustomObjectWithHttpInfo(
            group,
            version,
            plural,
            name,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body);
    return localVarResp.getData();
  }

  /**
   * Deletes the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param body (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> deleteClusterCustomObjectWithHttpInfo(
      String group,
      String version,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteClusterCustomObjectValidateBeforeCall(
            group,
            version,
            plural,
            name,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Deletes the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
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
  public okhttp3.Call deleteClusterCustomObjectAsync(
      String group,
      String version,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteClusterCustomObjectValidateBeforeCall(
            group,
            version,
            plural,
            name,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteCollectionClusterCustomObject
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
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
  public okhttp3.Call deleteCollectionClusterCustomObjectCall(
      String group,
      String version,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
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

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call deleteCollectionClusterCustomObjectValidateBeforeCall(
      String group,
      String version,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling deleteCollectionClusterCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling deleteCollectionClusterCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling deleteCollectionClusterCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        deleteCollectionClusterCustomObjectCall(
            group,
            version,
            plural,
            pretty,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * Delete collection of cluster scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param body (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object deleteCollectionClusterCustomObject(
      String group,
      String version,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        deleteCollectionClusterCustomObjectWithHttpInfo(
            group,
            version,
            plural,
            pretty,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body);
    return localVarResp.getData();
  }

  /**
   * Delete collection of cluster scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param body (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> deleteCollectionClusterCustomObjectWithHttpInfo(
      String group,
      String version,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteCollectionClusterCustomObjectValidateBeforeCall(
            group,
            version,
            plural,
            pretty,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Delete collection of cluster scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
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
  public okhttp3.Call deleteCollectionClusterCustomObjectAsync(
      String group,
      String version,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionClusterCustomObjectValidateBeforeCall(
            group,
            version,
            plural,
            pretty,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteCollectionNamespacedCustomObject
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
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
  public okhttp3.Call deleteCollectionNamespacedCustomObjectCall(
      String group,
      String version,
      String namespace,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll(
                "\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (pretty != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("pretty", pretty));
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

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call deleteCollectionNamespacedCustomObjectValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling deleteCollectionNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling deleteCollectionNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling deleteCollectionNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling deleteCollectionNamespacedCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        deleteCollectionNamespacedCustomObjectCall(
            group,
            version,
            namespace,
            plural,
            pretty,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * Delete collection of namespace scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param body (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object deleteCollectionNamespacedCustomObject(
      String group,
      String version,
      String namespace,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        deleteCollectionNamespacedCustomObjectWithHttpInfo(
            group,
            version,
            namespace,
            plural,
            pretty,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body);
    return localVarResp.getData();
  }

  /**
   * Delete collection of namespace scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param body (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> deleteCollectionNamespacedCustomObjectWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteCollectionNamespacedCustomObjectValidateBeforeCall(
            group,
            version,
            namespace,
            plural,
            pretty,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Delete collection of namespace scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
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
  public okhttp3.Call deleteCollectionNamespacedCustomObjectAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String pretty,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteCollectionNamespacedCustomObjectValidateBeforeCall(
            group,
            version,
            namespace,
            plural,
            pretty,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for deleteNamespacedCustomObject
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
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
  public okhttp3.Call deleteNamespacedCustomObjectCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call deleteNamespacedCustomObjectValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling deleteNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling deleteNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling deleteNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling deleteNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling deleteNamespacedCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        deleteNamespacedCustomObjectCall(
            group,
            version,
            namespace,
            plural,
            name,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            _callback);
    return localVarCall;
  }

  /**
   * Deletes the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param body (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object deleteNamespacedCustomObject(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        deleteNamespacedCustomObjectWithHttpInfo(
            group,
            version,
            namespace,
            plural,
            name,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body);
    return localVarResp.getData();
  }

  /**
   * Deletes the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param body (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> deleteNamespacedCustomObjectWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body)
      throws ApiException {
    okhttp3.Call localVarCall =
        deleteNamespacedCustomObjectValidateBeforeCall(
            group,
            version,
            namespace,
            plural,
            name,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Deletes the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
   *     (optional)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
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
  public okhttp3.Call deleteNamespacedCustomObjectAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Integer gracePeriodSeconds,
      Boolean orphanDependents,
      String propagationPolicy,
      String dryRun,
      V1DeleteOptions body,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        deleteNamespacedCustomObjectValidateBeforeCall(
            group,
            version,
            namespace,
            plural,
            name,
            gracePeriodSeconds,
            orphanDependents,
            propagationPolicy,
            dryRun,
            body,
            _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getAPIResources
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
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
  public okhttp3.Call getAPIResourcesCall(String group, String version, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call getAPIResourcesValidateBeforeCall(
      String group, String version, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling getAPIResources(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling getAPIResources(Async)");
    }

    okhttp3.Call localVarCall = getAPIResourcesCall(group, version, _callback);
    return localVarCall;
  }

  /**
   * get available resources
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
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
  public V1APIResourceList getAPIResources(String group, String version) throws ApiException {
    ApiResponse<V1APIResourceList> localVarResp = getAPIResourcesWithHttpInfo(group, version);
    return localVarResp.getData();
  }

  /**
   * get available resources
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
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
  public ApiResponse<V1APIResourceList> getAPIResourcesWithHttpInfo(String group, String version)
      throws ApiException {
    okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(group, version, null);
    Type localVarReturnType = new TypeToken<V1APIResourceList>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) get available resources
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
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
  public okhttp3.Call getAPIResourcesAsync(
      String group, String version, final ApiCallback<V1APIResourceList> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = getAPIResourcesValidateBeforeCall(group, version, _callback);
    Type localVarReturnType = new TypeToken<V1APIResourceList>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getClusterCustomObject
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getClusterCustomObjectCall(
      String group, String version, String plural, String name, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call getClusterCustomObjectValidateBeforeCall(
      String group, String version, String plural, String name, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling getClusterCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling getClusterCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling getClusterCustomObject(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling getClusterCustomObject(Async)");
    }

    okhttp3.Call localVarCall = getClusterCustomObjectCall(group, version, plural, name, _callback);
    return localVarCall;
  }

  /**
   * Returns a cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object getClusterCustomObject(String group, String version, String plural, String name)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        getClusterCustomObjectWithHttpInfo(group, version, plural, name);
    return localVarResp.getData();
  }

  /**
   * Returns a cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> getClusterCustomObjectWithHttpInfo(
      String group, String version, String plural, String name) throws ApiException {
    okhttp3.Call localVarCall =
        getClusterCustomObjectValidateBeforeCall(group, version, plural, name, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Returns a cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getClusterCustomObjectAsync(
      String group, String version, String plural, String name, final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getClusterCustomObjectValidateBeforeCall(group, version, plural, name, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getClusterCustomObjectScale
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
  public okhttp3.Call getClusterCustomObjectScaleCall(
      String group, String version, String plural, String name, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}/scale"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

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
  private okhttp3.Call getClusterCustomObjectScaleValidateBeforeCall(
      String group, String version, String plural, String name, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling getClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling getClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling getClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling getClusterCustomObjectScale(Async)");
    }

    okhttp3.Call localVarCall =
        getClusterCustomObjectScaleCall(group, version, plural, name, _callback);
    return localVarCall;
  }

  /**
   * read scale of the specified custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object getClusterCustomObjectScale(
      String group, String version, String plural, String name) throws ApiException {
    ApiResponse<Object> localVarResp =
        getClusterCustomObjectScaleWithHttpInfo(group, version, plural, name);
    return localVarResp.getData();
  }

  /**
   * read scale of the specified custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> getClusterCustomObjectScaleWithHttpInfo(
      String group, String version, String plural, String name) throws ApiException {
    okhttp3.Call localVarCall =
        getClusterCustomObjectScaleValidateBeforeCall(group, version, plural, name, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read scale of the specified custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
  public okhttp3.Call getClusterCustomObjectScaleAsync(
      String group, String version, String plural, String name, final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getClusterCustomObjectScaleValidateBeforeCall(group, version, plural, name, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getClusterCustomObjectStatus
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
  public okhttp3.Call getClusterCustomObjectStatusCall(
      String group, String version, String plural, String name, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}/status"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

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
  private okhttp3.Call getClusterCustomObjectStatusValidateBeforeCall(
      String group, String version, String plural, String name, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling getClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling getClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling getClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling getClusterCustomObjectStatus(Async)");
    }

    okhttp3.Call localVarCall =
        getClusterCustomObjectStatusCall(group, version, plural, name, _callback);
    return localVarCall;
  }

  /**
   * read status of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object getClusterCustomObjectStatus(
      String group, String version, String plural, String name) throws ApiException {
    ApiResponse<Object> localVarResp =
        getClusterCustomObjectStatusWithHttpInfo(group, version, plural, name);
    return localVarResp.getData();
  }

  /**
   * read status of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> getClusterCustomObjectStatusWithHttpInfo(
      String group, String version, String plural, String name) throws ApiException {
    okhttp3.Call localVarCall =
        getClusterCustomObjectStatusValidateBeforeCall(group, version, plural, name, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read status of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
  public okhttp3.Call getClusterCustomObjectStatusAsync(
      String group, String version, String plural, String name, final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getClusterCustomObjectStatusValidateBeforeCall(group, version, plural, name, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getNamespacedCustomObject
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getNamespacedCustomObjectCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call getNamespacedCustomObjectValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling getNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling getNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling getNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling getNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling getNamespacedCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        getNamespacedCustomObjectCall(group, version, namespace, plural, name, _callback);
    return localVarCall;
  }

  /**
   * Returns a namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object getNamespacedCustomObject(
      String group, String version, String namespace, String plural, String name)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        getNamespacedCustomObjectWithHttpInfo(group, version, namespace, plural, name);
    return localVarResp.getData();
  }

  /**
   * Returns a namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> getNamespacedCustomObjectWithHttpInfo(
      String group, String version, String namespace, String plural, String name)
      throws ApiException {
    okhttp3.Call localVarCall =
        getNamespacedCustomObjectValidateBeforeCall(group, version, namespace, plural, name, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) Returns a namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> A single Resource </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call getNamespacedCustomObjectAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getNamespacedCustomObjectValidateBeforeCall(
            group, version, namespace, plural, name, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getNamespacedCustomObjectScale
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
  public okhttp3.Call getNamespacedCustomObjectScaleCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

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
  private okhttp3.Call getNamespacedCustomObjectScaleValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling getNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling getNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling getNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling getNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling getNamespacedCustomObjectScale(Async)");
    }

    okhttp3.Call localVarCall =
        getNamespacedCustomObjectScaleCall(group, version, namespace, plural, name, _callback);
    return localVarCall;
  }

  /**
   * read scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object getNamespacedCustomObjectScale(
      String group, String version, String namespace, String plural, String name)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        getNamespacedCustomObjectScaleWithHttpInfo(group, version, namespace, plural, name);
    return localVarResp.getData();
  }

  /**
   * read scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> getNamespacedCustomObjectScaleWithHttpInfo(
      String group, String version, String namespace, String plural, String name)
      throws ApiException {
    okhttp3.Call localVarCall =
        getNamespacedCustomObjectScaleValidateBeforeCall(
            group, version, namespace, plural, name, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
  public okhttp3.Call getNamespacedCustomObjectScaleAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getNamespacedCustomObjectScaleValidateBeforeCall(
            group, version, namespace, plural, name, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getNamespacedCustomObjectStatus
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
  public okhttp3.Call getNamespacedCustomObjectStatusCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

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
  private okhttp3.Call getNamespacedCustomObjectStatusValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling getNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling getNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling getNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling getNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling getNamespacedCustomObjectStatus(Async)");
    }

    okhttp3.Call localVarCall =
        getNamespacedCustomObjectStatusCall(group, version, namespace, plural, name, _callback);
    return localVarCall;
  }

  /**
   * read status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object getNamespacedCustomObjectStatus(
      String group, String version, String namespace, String plural, String name)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        getNamespacedCustomObjectStatusWithHttpInfo(group, version, namespace, plural, name);
    return localVarResp.getData();
  }

  /**
   * read status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> getNamespacedCustomObjectStatusWithHttpInfo(
      String group, String version, String namespace, String plural, String name)
      throws ApiException {
    okhttp3.Call localVarCall =
        getNamespacedCustomObjectStatusValidateBeforeCall(
            group, version, namespace, plural, name, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) read status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
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
  public okhttp3.Call getNamespacedCustomObjectStatusAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getNamespacedCustomObjectStatusValidateBeforeCall(
            group, version, namespace, plural, name, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for listClusterCustomObject
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
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
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. (optional)
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
  public okhttp3.Call listClusterCustomObjectCall(
      String group,
      String version,
      String plural,
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
        "/apis/{group}/{version}/{plural}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()));

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
    final String[] localVarAccepts = {"application/json", "application/json;stream=watch"};
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
  private okhttp3.Call listClusterCustomObjectValidateBeforeCall(
      String group,
      String version,
      String plural,
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

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling listClusterCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling listClusterCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling listClusterCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        listClusterCustomObjectCall(
            group,
            version,
            plural,
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
   * list or watch cluster scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
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
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object listClusterCustomObject(
      String group,
      String version,
      String plural,
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
    ApiResponse<Object> localVarResp =
        listClusterCustomObjectWithHttpInfo(
            group,
            version,
            plural,
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
   * list or watch cluster scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
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
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> listClusterCustomObjectWithHttpInfo(
      String group,
      String version,
      String plural,
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
        listClusterCustomObjectValidateBeforeCall(
            group,
            version,
            plural,
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
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) list or watch cluster scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
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
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. (optional)
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
  public okhttp3.Call listClusterCustomObjectAsync(
      String group,
      String version,
      String plural,
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
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listClusterCustomObjectValidateBeforeCall(
            group,
            version,
            plural,
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
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for listNamespacedCustomObject
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
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
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. (optional)
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
  public okhttp3.Call listNamespacedCustomObjectCall(
      String group,
      String version,
      String namespace,
      String plural,
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
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll(
                "\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()));

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
    final String[] localVarAccepts = {"application/json", "application/json;stream=watch"};
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
  private okhttp3.Call listNamespacedCustomObjectValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
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

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling listNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling listNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling listNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling listNamespacedCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        listNamespacedCustomObjectCall(
            group,
            version,
            namespace,
            plural,
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
   * list or watch namespace scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
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
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object listNamespacedCustomObject(
      String group,
      String version,
      String namespace,
      String plural,
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
    ApiResponse<Object> localVarResp =
        listNamespacedCustomObjectWithHttpInfo(
            group,
            version,
            namespace,
            plural,
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
   * list or watch namespace scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
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
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> listNamespacedCustomObjectWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
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
        listNamespacedCustomObjectValidateBeforeCall(
            group,
            version,
            namespace,
            plural,
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
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) list or watch namespace scoped custom objects
   *
   * @param group The custom resource&#39;s group name (required)
   * @param version The custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural The custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param pretty If &#39;true&#39;, then the output is pretty printed. (optional)
   * @param allowWatchBookmarks allowWatchBookmarks requests watch events with type
   *     \&quot;BOOKMARK\&quot;. Servers that do not implement bookmarks may ignore this flag and
   *     bookmarks are sent at the server&#39;s discretion. Clients should not assume bookmarks are
   *     returned at any specific interval, nor may they assume the server will send any BOOKMARK
   *     event during a session. If this is not a watch, this field is ignored. If the feature gate
   *     WatchBookmarks is not enabled in apiserver, this field is ignored. (optional)
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
   * @param resourceVersion When specified with a watch call, shows changes that occur after that
   *     particular version of a resource. Defaults to changes from the beginning of history. When
   *     specified for list: - if unset, then the result is returned from remote storage based on
   *     quorum-read flag; - if it&#39;s 0, then we simply return what we currently have in cache,
   *     no guarantee; - if set to non zero, then the result is at least as fresh as given rv.
   *     (optional)
   * @param resourceVersionMatch resourceVersionMatch determines how resourceVersion is applied to
   *     list calls. It is highly recommended that resourceVersionMatch be set for list calls where
   *     resourceVersion is set See
   *     https://kubernetes.io/docs/reference/using-api/api-concepts/#resource-versions for details.
   *     Defaults to unset (optional)
   * @param timeoutSeconds Timeout for the list/watch call. This limits the duration of the call,
   *     regardless of any activity or inactivity. (optional)
   * @param watch Watch for changes to the described resources and return them as a stream of add,
   *     update, and remove notifications. (optional)
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
  public okhttp3.Call listNamespacedCustomObjectAsync(
      String group,
      String version,
      String namespace,
      String plural,
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
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        listNamespacedCustomObjectValidateBeforeCall(
            group,
            version,
            namespace,
            plural,
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
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchClusterCustomObject
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to patch. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchClusterCustomObjectCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/merge-patch+json"
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
  private okhttp3.Call patchClusterCustomObjectValidateBeforeCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling patchClusterCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling patchClusterCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling patchClusterCustomObject(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchClusterCustomObject(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchClusterCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        patchClusterCustomObjectCall(
            group, version, plural, name, body, dryRun, fieldManager, force, _callback);
    return localVarCall;
  }

  /**
   * patch the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to patch. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object patchClusterCustomObject(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        patchClusterCustomObjectWithHttpInfo(
            group, version, plural, name, body, dryRun, fieldManager, force);
    return localVarResp.getData();
  }

  /**
   * patch the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to patch. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> patchClusterCustomObjectWithHttpInfo(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchClusterCustomObjectValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, force, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) patch the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to patch. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchClusterCustomObjectAsync(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchClusterCustomObjectValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, force, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchClusterCustomObjectScale
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchClusterCustomObjectScaleCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}/scale"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
      "application/json-patch+json", "application/merge-patch+json"
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
  private okhttp3.Call patchClusterCustomObjectScaleValidateBeforeCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling patchClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling patchClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling patchClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchClusterCustomObjectScale(Async)");
    }

    okhttp3.Call localVarCall =
        patchClusterCustomObjectScaleCall(
            group, version, plural, name, body, dryRun, fieldManager, force, _callback);
    return localVarCall;
  }

  /**
   * partially update scale of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object patchClusterCustomObjectScale(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        patchClusterCustomObjectScaleWithHttpInfo(
            group, version, plural, name, body, dryRun, fieldManager, force);
    return localVarResp.getData();
  }

  /**
   * partially update scale of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> patchClusterCustomObjectScaleWithHttpInfo(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchClusterCustomObjectScaleValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, force, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update scale of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchClusterCustomObjectScaleAsync(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchClusterCustomObjectScaleValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, force, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchClusterCustomObjectStatus
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchClusterCustomObjectStatusCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}/status"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
      "application/json-patch+json", "application/merge-patch+json"
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
  private okhttp3.Call patchClusterCustomObjectStatusValidateBeforeCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling patchClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling patchClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling patchClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchClusterCustomObjectStatus(Async)");
    }

    okhttp3.Call localVarCall =
        patchClusterCustomObjectStatusCall(
            group, version, plural, name, body, dryRun, fieldManager, force, _callback);
    return localVarCall;
  }

  /**
   * partially update status of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object patchClusterCustomObjectStatus(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        patchClusterCustomObjectStatusWithHttpInfo(
            group, version, plural, name, body, dryRun, fieldManager, force);
    return localVarResp.getData();
  }

  /**
   * partially update status of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> patchClusterCustomObjectStatusWithHttpInfo(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchClusterCustomObjectStatusValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, force, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update status of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchClusterCustomObjectStatusAsync(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchClusterCustomObjectStatusValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, force, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchNamespacedCustomObject
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to patch. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedCustomObjectCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    if (force != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("force", force));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {
      "application/json-patch+json", "application/merge-patch+json"
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
  private okhttp3.Call patchNamespacedCustomObjectValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling patchNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling patchNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling patchNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling patchNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchNamespacedCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, _callback);
    return localVarCall;
  }

  /**
   * patch the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to patch. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object patchNamespacedCustomObject(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        patchNamespacedCustomObjectWithHttpInfo(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force);
    return localVarResp.getData();
  }

  /**
   * patch the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to patch. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> patchNamespacedCustomObjectWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) patch the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to patch. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedCustomObjectAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchNamespacedCustomObjectScale
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedCustomObjectScaleCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
      "application/json-patch+json", "application/merge-patch+json", "application/apply-patch+yaml"
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
  private okhttp3.Call patchNamespacedCustomObjectScaleValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling patchNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling patchNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling patchNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling patchNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchNamespacedCustomObjectScale(Async)");
    }

    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectScaleCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, _callback);
    return localVarCall;
  }

  /**
   * partially update scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object patchNamespacedCustomObjectScale(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        patchNamespacedCustomObjectScaleWithHttpInfo(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force);
    return localVarResp.getData();
  }

  /**
   * partially update scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> patchNamespacedCustomObjectScaleWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectScaleValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedCustomObjectScaleAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectScaleValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for patchNamespacedCustomObjectStatus
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedCustomObjectStatusCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
      "application/json-patch+json", "application/merge-patch+json", "application/apply-patch+yaml"
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
  private okhttp3.Call patchNamespacedCustomObjectStatusValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling patchNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling patchNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling patchNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling patchNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling patchNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling patchNamespacedCustomObjectStatus(Async)");
    }

    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectStatusCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, _callback);
    return localVarCall;
  }

  /**
   * partially update status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object patchNamespacedCustomObjectStatus(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        patchNamespacedCustomObjectStatusWithHttpInfo(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force);
    return localVarResp.getData();
  }

  /**
   * partially update status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
   * @param force Force is going to \&quot;force\&quot; Apply requests. It means user will
   *     re-acquire conflicting fields owned by other people. Force flag must be unset for non-apply
   *     patch requests. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> patchNamespacedCustomObjectStatusWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force)
      throws ApiException {
    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectStatusValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) partially update status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. This field is
   *     required for apply requests (application/apply-patch) but optional for non-apply patch
   *     types (JsonPatch, MergePatch, StrategicMergePatch). (optional)
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
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public okhttp3.Call patchNamespacedCustomObjectStatusAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      Boolean force,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        patchNamespacedCustomObjectStatusValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, force, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceClusterCustomObject
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to replace. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceClusterCustomObjectCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call replaceClusterCustomObjectValidateBeforeCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling replaceClusterCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling replaceClusterCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling replaceClusterCustomObject(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceClusterCustomObject(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceClusterCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        replaceClusterCustomObjectCall(
            group, version, plural, name, body, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * replace the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to replace. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object replaceClusterCustomObject(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        replaceClusterCustomObjectWithHttpInfo(
            group, version, plural, name, body, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * replace the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to replace. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> replaceClusterCustomObjectWithHttpInfo(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceClusterCustomObjectValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom object&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to replace. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceClusterCustomObjectAsync(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceClusterCustomObjectValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceClusterCustomObjectScale
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceClusterCustomObjectScaleCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}/scale"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
  private okhttp3.Call replaceClusterCustomObjectScaleValidateBeforeCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling replaceClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling replaceClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling replaceClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceClusterCustomObjectScale(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceClusterCustomObjectScale(Async)");
    }

    okhttp3.Call localVarCall =
        replaceClusterCustomObjectScaleCall(
            group, version, plural, name, body, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * replace scale of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return Object
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
  public Object replaceClusterCustomObjectScale(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        replaceClusterCustomObjectScaleWithHttpInfo(
            group, version, plural, name, body, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * replace scale of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> replaceClusterCustomObjectScaleWithHttpInfo(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceClusterCustomObjectScaleValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace scale of the specified cluster scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceClusterCustomObjectScaleAsync(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceClusterCustomObjectScaleValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceClusterCustomObjectStatus
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceClusterCustomObjectStatusCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/{plural}/{name}/status"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
  private okhttp3.Call replaceClusterCustomObjectStatusValidateBeforeCall(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling replaceClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling replaceClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling replaceClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceClusterCustomObjectStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceClusterCustomObjectStatus(Async)");
    }

    okhttp3.Call localVarCall =
        replaceClusterCustomObjectStatusCall(
            group, version, plural, name, body, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * replace status of the cluster scoped specified custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return Object
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
  public Object replaceClusterCustomObjectStatus(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        replaceClusterCustomObjectStatusWithHttpInfo(
            group, version, plural, name, body, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * replace status of the cluster scoped specified custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> replaceClusterCustomObjectStatusWithHttpInfo(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceClusterCustomObjectStatusValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace status of the cluster scoped specified custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceClusterCustomObjectStatusAsync(
      String group,
      String version,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceClusterCustomObjectStatusValidateBeforeCall(
            group, version, plural, name, body, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceNamespacedCustomObject
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to replace. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceNamespacedCustomObjectCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json"};
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
  private okhttp3.Call replaceNamespacedCustomObjectValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling replaceNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling replaceNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling replaceNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling replaceNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceNamespacedCustomObject(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceNamespacedCustomObject(Async)");
    }

    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * replace the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to replace. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return Object
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public Object replaceNamespacedCustomObject(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        replaceNamespacedCustomObjectWithHttpInfo(
            group, version, namespace, plural, name, body, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * replace the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to replace. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;Object&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @http.response.details
   *     <table summary="Response Details" border="1">
   * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   * <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   * <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   * </table>
   */
  public ApiResponse<Object> replaceNamespacedCustomObjectWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body The JSON schema of the Resource to replace. (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceNamespacedCustomObjectAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceNamespacedCustomObjectScale
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceNamespacedCustomObjectScaleCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/scale"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
  private okhttp3.Call replaceNamespacedCustomObjectScaleValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling replaceNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling replaceNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling replaceNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling replaceNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceNamespacedCustomObjectScale(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceNamespacedCustomObjectScale(Async)");
    }

    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectScaleCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * replace scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return Object
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
  public Object replaceNamespacedCustomObjectScale(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        replaceNamespacedCustomObjectScaleWithHttpInfo(
            group, version, namespace, plural, name, body, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * replace scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> replaceNamespacedCustomObjectScaleWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectScaleValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace scale of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceNamespacedCustomObjectScaleAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectScaleValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for replaceNamespacedCustomObjectStatus
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceNamespacedCustomObjectStatusCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = body;

    // create path and map variables
    String localVarPath =
        "/apis/{group}/{version}/namespaces/{namespace}/{plural}/{name}/status"
            .replaceAll("\\{" + "group" + "\\}", localVarApiClient.escapeString(group.toString()))
            .replaceAll(
                "\\{" + "version" + "\\}", localVarApiClient.escapeString(version.toString()))
            .replaceAll(
                "\\{" + "namespace" + "\\}", localVarApiClient.escapeString(namespace.toString()))
            .replaceAll("\\{" + "plural" + "\\}", localVarApiClient.escapeString(plural.toString()))
            .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (dryRun != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("dryRun", dryRun));
    }

    if (fieldManager != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldManager", fieldManager));
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
  private okhttp3.Call replaceNamespacedCustomObjectStatusValidateBeforeCall(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'group' is set
    if (group == null) {
      throw new ApiException(
          "Missing the required parameter 'group' when calling replaceNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'version' is set
    if (version == null) {
      throw new ApiException(
          "Missing the required parameter 'version' when calling replaceNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'namespace' is set
    if (namespace == null) {
      throw new ApiException(
          "Missing the required parameter 'namespace' when calling replaceNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'plural' is set
    if (plural == null) {
      throw new ApiException(
          "Missing the required parameter 'plural' when calling replaceNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(
          "Missing the required parameter 'name' when calling replaceNamespacedCustomObjectStatus(Async)");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          "Missing the required parameter 'body' when calling replaceNamespacedCustomObjectStatus(Async)");
    }

    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectStatusCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, _callback);
    return localVarCall;
  }

  /**
   * replace status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return Object
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
  public Object replaceNamespacedCustomObjectStatus(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    ApiResponse<Object> localVarResp =
        replaceNamespacedCustomObjectStatusWithHttpInfo(
            group, version, namespace, plural, name, body, dryRun, fieldManager);
    return localVarResp.getData();
  }

  /**
   * replace status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
   * @return ApiResponse&lt;Object&gt;
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
  public ApiResponse<Object> replaceNamespacedCustomObjectStatusWithHttpInfo(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager)
      throws ApiException {
    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectStatusValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, null);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * (asynchronously) replace status of the specified namespace scoped custom object
   *
   * @param group the custom resource&#39;s group (required)
   * @param version the custom resource&#39;s version (required)
   * @param namespace The custom resource&#39;s namespace (required)
   * @param plural the custom resource&#39;s plural name. For TPRs this would be lowercase plural
   *     kind. (required)
   * @param name the custom object&#39;s name (required)
   * @param body (required)
   * @param dryRun When present, indicates that modifications should not be persisted. An invalid or
   *     unrecognized dryRun directive will result in an error response and no further processing of
   *     the request. Valid values are: - All: all dry run stages will be processed (optional)
   * @param fieldManager fieldManager is a name associated with the actor or entity that is making
   *     these changes. The value must be less than or 128 characters long, and only contain
   *     printable characters, as defined by https://golang.org/pkg/unicode/#IsPrint. (optional)
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
  public okhttp3.Call replaceNamespacedCustomObjectStatusAsync(
      String group,
      String version,
      String namespace,
      String plural,
      String name,
      Object body,
      String dryRun,
      String fieldManager,
      final ApiCallback<Object> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        replaceNamespacedCustomObjectStatusValidateBeforeCall(
            group, version, namespace, plural, name, body, dryRun, fieldManager, _callback);
    Type localVarReturnType = new TypeToken<Object>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
