/*
Copyright 2020 The Kubernetes Authors.
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
package io.kubernetes.client.util.generic;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.common.KubernetesType;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiCallback;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.ApiResponse;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.ProxyContentTypeRequestBody;
import io.kubernetes.client.util.Strings;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import io.kubernetes.client.util.generic.options.CreateOptions;
import io.kubernetes.client.util.generic.options.DeleteOptions;
import io.kubernetes.client.util.generic.options.GetOptions;
import io.kubernetes.client.util.generic.options.ListOptions;
import io.kubernetes.client.util.generic.options.PatchOptions;
import io.kubernetes.client.util.generic.options.UpdateOptions;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import javax.annotation.Nonnull;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Request;

/**
 * The Generic kubernetes api provides a unified client interface for not only the non-core-group
 * built-in resources from kubernetes but also the custom-resources models meet the following
 * requirements:
 *
 * <p>1. there's a `V1ObjectMeta` field in the model along with its getter/setter. 2. there's a
 * `V1ListMeta` field in the list model along with its getter/setter. - supports Gson
 * serialization/deserialization. 3. the generic kubernetes api covers all the basic operations over
 * the custom resources including {get, list, watch, create, update, patch, delete}.
 *
 * <p>The Generic kubernetes api is expected to have the following behaviors upon failures where
 * {@link KubernetesApiResponse#isSuccess()} returns false:
 *
 * <p>- For kubernetes-defined failures, the server will return a {@link V1Status} with 4xx/5xx
 * code. The status object will be nested in {@link KubernetesApiResponse#getStatus()} - For the
 * other unknown reason (including network, JVM..), throws an unchecked exception.
 *
 * @param <ApiType> the api type parameter
 * @param <ApiListType> the api list type parameter
 */
public class GenericKubernetesApi<
    ApiType extends KubernetesObject, ApiListType extends KubernetesListObject> {

  private static final String PARTIAL_OBJECT_METADATA_HEADER =
      "application/json;as=PartialObjectMetadata;g=meta.k8s.io;v=v1,application/json";

  private static final String PARTIAL_OBJECT_METADATA_LIST_HEADER =
      "application/json;as=PartialObjectMetadataList;g=meta.k8s.io;v=v1,application/json";

  // TODO(yue9944882): supports status operations..
  // TODO(yue9944882): supports generic sub-resource operations..
  // TODO(yue9944882): supports delete-collections..

  private final Class<ApiType> apiTypeClass;
  private final Class<ApiListType> apiListTypeClass;
  private final String apiGroup;
  private final String apiVersion;
  private final String resourcePlural;
  private final CustomObjectsApi customObjectsApi;

  /**
   * Instantiates a new Generic kubernetes api.
   *
   * @param apiTypeClass the api type class
   * @param apiListTypeClass the api list type class
   * @param apiGroup the api group
   * @param apiVersion the api version
   * @param resourcePlural the resource plural
   */
  public GenericKubernetesApi(
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass,
      String apiGroup,
      String apiVersion,
      String resourcePlural) {
    this(
        apiTypeClass,
        apiListTypeClass,
        apiGroup,
        apiVersion,
        resourcePlural,
        new CustomObjectsApi(Configuration.getDefaultApiClient()));
  }

  /**
   * Instantiates a new Generic kubernetes api.
   *
   * @param apiTypeClass the api type class, e.g. V1Job.class
   * @param apiListTypeClass the api list type class e.g. V1JobList.class
   * @param apiGroup the api group
   * @param apiVersion the api version
   * @param resourcePlural the resource plural, e.g. "jobs"
   * @param apiClient the api client
   */
  public GenericKubernetesApi(
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass,
      String apiGroup,
      String apiVersion,
      String resourcePlural,
      ApiClient apiClient) {
    this(
        apiTypeClass,
        apiListTypeClass,
        apiGroup,
        apiVersion,
        resourcePlural,
        new CustomObjectsApi(apiClient));
  }

  /**
   * Instantiates a new Generic kubernetes api with the ApiClient specified.
   *
   * @param apiTypeClass the api type class, e.g. V1Job.class
   * @param apiListTypeClass the api list type class e.g. V1JobList.class
   * @param apiGroup the api group
   * @param apiVersion the api version
   * @param resourcePlural the resource plural, e.g. "jobs"
   * @param customObjectsApi the custom objects api
   */
  public GenericKubernetesApi(
      Class<ApiType> apiTypeClass,
      Class<ApiListType> apiListTypeClass,
      String apiGroup,
      String apiVersion,
      String resourcePlural,
      CustomObjectsApi customObjectsApi) {
    this.apiGroup = apiGroup;
    this.apiVersion = apiVersion;
    this.resourcePlural = resourcePlural;
    this.apiTypeClass = apiTypeClass;
    this.apiListTypeClass = apiListTypeClass;
    this.customObjectsApi = customObjectsApi;
  }

  // For unit-test
  ApiClient getApiClient() {
    return customObjectsApi.getApiClient();
  }

  /**
   * Get kubernetes api response.
   *
   * @param name the name
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> get(String name) {
    return get(name, new GetOptions());
  }

  /**
   * Get kubernetes api response under the namespace.
   *
   * @param namespace the namespace
   * @param name the name
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> get(String namespace, String name) {
    return get(namespace, name, new GetOptions());
  }

  /**
   * Get kubernetes api response.
   *
   * @param name the name
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> getAsync(
      String name, @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return getAsync(name, new GetOptions(), callback);
  }

  /**
   * Get kubernetes api response under the namespace.
   *
   * @param namespace the namespace
   * @param name the name
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> getAsync(
      String namespace, String name, @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return getAsync(namespace, name, new GetOptions(), callback);
  }

  /**
   * List kubernetes api response cluster-scoped.
   *
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiListType> list() {
    return list(new ListOptions());
  }

  /**
   * List kubernetes api response under the namespace.
   *
   * @param namespace the namespace
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiListType> list(String namespace) {
    return list(namespace, new ListOptions());
  }

  /**
   * List kubernetes api response cluster-scoped.
   *
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiListType>> listAsync(
      @Nonnull Consumer<KubernetesApiResponse<ApiListType>> callback) {
    return listAsync(new ListOptions(), callback);
  }

  /**
   * List kubernetes api response under the namespace.
   *
   * @param namespace the namespace
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiListType>> listAsync(
      String namespace, @Nonnull Consumer<KubernetesApiResponse<ApiListType>> callback) {
    return listAsync(namespace, new ListOptions(), callback);
  }

  /**
   * Create kubernetes api response, if the namespace in the object is present, it will send a
   * namespace-scoped requests, vice versa.
   *
   * @param object the object
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> create(ApiType object) {
    return create(object, new CreateOptions());
  }

  /**
   * Create kubernetes api response, if the namespace in the object is present, it will send a
   * namespace-scoped requests, vice versa.
   *
   * @param object the object
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> createAsync(
      ApiType object, @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return createAsync(object, new CreateOptions(), callback);
  }

  /**
   * Create kubernetes api response, if the namespace in the object is present, it will send a
   * namespace-scoped requests, vice versa.
   *
   * @param object the object
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> update(ApiType object) {
    return update(object, new UpdateOptions());
  }

  /**
   * Create kubernetes api response, if the namespace in the object is present, it will send a
   * namespace-scoped requests, vice versa.
   *
   * @param object the object
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> updateAsync(
      ApiType object, @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return updateAsync(object, new UpdateOptions(), callback);
  }

  /**
   * Patch kubernetes api response.
   *
   * @param name the name
   * @param patchType the patch type, supported values defined in V1Patch
   * @param patch the string patch content
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> patch(String name, String patchType, V1Patch patch) {
    return patch(name, patchType, patch, new PatchOptions());
  }

  /**
   * Patch kubernetes api response under the namespace.
   *
   * @param namespace the namespace
   * @param name the name
   * @param patchType the patch type, supported values defined in V1Patch
   * @param patch the string patch content
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> patch(
      String namespace, String name, String patchType, V1Patch patch) {
    return patch(namespace, name, patchType, patch, new PatchOptions());
  }

  /**
   * Patch kubernetes api response.
   *
   * @param name the name
   * @param patchType the patch type, supported values defined in V1Patch
   * @param patch the string patch content
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> patchAsync(
      String name,
      String patchType,
      V1Patch patch,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return patchAsync(name, patchType, patch, new PatchOptions(), callback);
  }

  /**
   * Patch kubernetes api response under the namespace.
   *
   * @param namespace the namespace
   * @param name the name
   * @param patchType the patch type, supported values defined in V1Patch
   * @param patch the string patch content
   * @return the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> patchAsync(
      String namespace,
      String name,
      String patchType,
      V1Patch patch,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return patchAsync(namespace, name, patchType, patch, new PatchOptions(), callback);
  }

  /**
   * Delete kubernetes api response.
   *
   * @param name the name
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> delete(String name) {
    return delete(name, new DeleteOptions());
  }

  /**
   * Delete kubernetes api response under the namespace.
   *
   * @param namespace the namespace
   * @param name the name
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> delete(String namespace, String name) {
    return delete(namespace, name, new DeleteOptions());
  }

  /**
   * Delete kubernetes api response.
   *
   * @param name the name
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> deleteAsync(
      String name, @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return deleteAsync(name, new DeleteOptions(), callback);
  }

  /**
   * Delete kubernetes api response under the namespace.
   *
   * @param namespace the namespace
   * @param name the name
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> deleteAsync(
      String namespace, String name, @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return deleteAsync(namespace, name, new DeleteOptions(), callback);
  }

  /**
   * Creates a cluster-scoped Watch on the resource.
   *
   * @return the watchable
   * @throws ApiException the api exception
   */
  public Watchable<ApiType> watch() throws ApiException {
    return watch(new ListOptions());
  }

  /**
   * Creates a namespace-scoped Watch on the resource.
   *
   * @param namespace the namespace
   * @return the watchable
   * @throws ApiException the api exception
   */
  public Watchable<ApiType> watch(String namespace) throws ApiException {
    return watch(namespace, new ListOptions());
  }

  // TODO(yue9944882): watch one resource?

  /**
   * Get kubernetes api response.
   *
   * @param name the name
   * @param getOptions the get options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> get(String name, final GetOptions getOptions) {
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    return executeCall(
        customObjectsApi.getApiClient(), apiTypeClass, makeClusterGetCallBuilder(name, getOptions));
  }

  private CallBuilder makeClusterGetCallBuilder(String name, final GetOptions getOptions) {
    return () ->
        adaptGetCall(
            customObjectsApi.getApiClient(),
            customObjectsApi.getClusterCustomObject(
                this.apiGroup, this.apiVersion, this.resourcePlural, name)
                    .buildCall(null),
            getOptions);
  }

  private Call adaptGetCall(ApiClient apiClient, Call call, GetOptions getOptions) {
    if (Optional.ofNullable(getOptions)
        .map(GetOptions::isPartialObjectMetadataRequest)
        .orElse(Boolean.FALSE)) {
      Request request = call.request();
      return apiClient
          .getHttpClient()
          .newCall(request.newBuilder().header("Accept", PARTIAL_OBJECT_METADATA_HEADER).build());
    }
    return call;
  }

  /**
   * Get kubernetes api response.
   *
   * @param name the name
   * @param getOptions the get options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> getAsync(
      String name,
      final GetOptions getOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeClusterGetCallBuilder(name, getOptions),
        callback);
  }

  /**
   * Get kubernetes api response.
   *
   * @param namespace the namespace
   * @param name the name
   * @param getOptions the get options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> get(
      String namespace, String name, final GetOptions getOptions) {
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeNamespacedGetCallBuilder(namespace, name, getOptions));
  }

  private CallBuilder makeNamespacedGetCallBuilder(
      String namespace, String name, final GetOptions getOptions) {
    return () ->
        adaptGetCall(
            customObjectsApi.getApiClient(),
            customObjectsApi.getNamespacedCustomObject(
                this.apiGroup, this.apiVersion, namespace, this.resourcePlural, name)
                    .buildCall(null),
            getOptions);
  }

  /**
   * Get kubernetes api response.
   *
   * @param namespace the namespace
   * @param name the name
   * @param getOptions the get options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> getAsync(
      String namespace,
      String name,
      final GetOptions getOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeNamespacedGetCallBuilder(namespace, name, getOptions),
        callback);
  }

  /**
   * List kubernetes api response.
   *
   * @param listOptions the list options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiListType> list(final ListOptions listOptions) {
    return executeCall(
        customObjectsApi.getApiClient(), apiListTypeClass, makeClusterListCallBuilder(listOptions));
  }

  private CallBuilder makeClusterListCallBuilder(final ListOptions listOptions) {
    return () ->
        adaptListCall(
            customObjectsApi.getApiClient(),
            customObjectsApi.listClusterCustomObject( this.apiGroup, this.apiVersion, this.resourcePlural)
                    .fieldSelector(listOptions.getFieldSelector())
                    .labelSelector(listOptions.getLabelSelector())
                    .limit(listOptions.getLimit())
                    .resourceVersion(listOptions.getResourceVersion())
                    .timeoutSeconds(listOptions.getTimeoutSeconds())
                    .watch(false)
                    .buildCall(null),
            listOptions);
  }

  private Call adaptListCall(ApiClient apiClient, Call call, ListOptions listOptions) {
    if (Optional.ofNullable(listOptions)
        .map(ListOptions::isPartialObjectMetadataListRequest)
        .orElse(Boolean.FALSE)) {
      Request request = call.request();
      return apiClient
          .getHttpClient()
          .newCall(
              request.newBuilder().header("Accept", PARTIAL_OBJECT_METADATA_LIST_HEADER).build());
    }
    return call;
  }

  /**
   * List kubernetes api response.
   *
   * @param namespace the namespace
   * @param listOptions the list options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiListType> list(String namespace, final ListOptions listOptions) {
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    return executeCall(
        customObjectsApi.getApiClient(),
        apiListTypeClass,
        makeNamespacedListCallBuilder(namespace, listOptions));
  }

  private CallBuilder makeNamespacedListCallBuilder(
      String namespace, final ListOptions listOptions) {
    return () ->
        adaptListCall(
            customObjectsApi.getApiClient(),
            customObjectsApi.listNamespacedCustomObject(this.apiGroup, this.apiVersion, namespace, this.resourcePlural)
                    ._continue(listOptions.getContinue())
                    .fieldSelector(listOptions.getFieldSelector())
                    .labelSelector(listOptions.getLabelSelector())
                    .limit(listOptions.getLimit())
                    .resourceVersion(listOptions.getResourceVersion())
                    .timeoutSeconds(listOptions.getTimeoutSeconds())
                    .watch(false)
                    .buildCall(null),
            listOptions);
  }

  /**
   * List kubernetes api response.
   *
   * @param listOptions the list options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiListType>> listAsync(
      final ListOptions listOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiListType>> callback) {
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiListTypeClass,
        makeClusterListCallBuilder(listOptions),
        callback);
  }

  /**
   * List kubernetes api response.
   *
   * @param namespace the namespace
   * @param listOptions the list options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiListType>> listAsync(
      String namespace,
      final ListOptions listOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiListType>> callback) {
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiListTypeClass,
        makeNamespacedListCallBuilder(namespace, listOptions),
        callback);
  }

  /**
   * Create kubernetes api response.
   *
   * @param object the object
   * @param createOptions the create options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> create(ApiType object, final CreateOptions createOptions) {
    V1ObjectMeta objectMeta = object.getMetadata();

    boolean isNamespaced = !Strings.isNullOrEmpty(objectMeta.getNamespace());
    if (isNamespaced) {
      return create(objectMeta.getNamespace(), object, createOptions);
    }

    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeClusterCreateCallBuilder(object, createOptions));
  }

  private CallBuilder makeClusterCreateCallBuilder(
      ApiType object, final CreateOptions createOptions) {
    // TODO(yue9944882): judge namespaced object via api discovery
    return () ->
        customObjectsApi.createClusterCustomObject(
            this.apiGroup,
            this.apiVersion,
            this.resourcePlural,
            object)
                .dryRun(createOptions.getDryRun())
                .dryRun(createOptions.getFieldManager())
                .buildCall(null);
  }

  /**
   * Create kubernetes api response.
   *
   * @param namespace the namespace
   * @param object the object
   * @param createOptions the create options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> create(
      String namespace, ApiType object, final CreateOptions createOptions) {
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeNamespacedCreateCallBuilder(namespace, object, createOptions));
  }

  private CallBuilder makeNamespacedCreateCallBuilder(
      String namespace, ApiType object, final CreateOptions createOptions) {
    // TODO(yue9944882): judge namespaced object via api discovery
    return () ->
        customObjectsApi.createNamespacedCustomObject(
            this.apiGroup,
            this.apiVersion,
            namespace,
            this.resourcePlural,
            object)
                .dryRun(createOptions.getDryRun())
                .fieldManager(createOptions.getFieldManager())
                .buildCall(null);
  }

  /**
   * Create kubernetes api response.
   *
   * @param object the object
   * @param createOptions the create options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> createAsync(
      ApiType object,
      final CreateOptions createOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    V1ObjectMeta objectMeta = object.getMetadata();

    boolean isNamespaced = !Strings.isNullOrEmpty(objectMeta.getNamespace());
    if (isNamespaced) {
      return createAsync(objectMeta.getNamespace(), object, createOptions, callback);
    }
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeClusterCreateCallBuilder(object, createOptions),
        callback);
  }

  /**
   * Create kubernetes api response.
   *
   * @param namespace the namespace
   * @param object the object
   * @param createOptions the create options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> createAsync(
      String namespace,
      ApiType object,
      final CreateOptions createOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeNamespacedCreateCallBuilder(namespace, object, createOptions),
        callback);
  }

  /**
   * Update kubernetes api response.
   *
   * @param object the object
   * @param updateOptions the update options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> update(ApiType object, final UpdateOptions updateOptions) {
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeUpdateCallBuilder(object, updateOptions));
  }

  private CallBuilder makeUpdateCallBuilder(ApiType object, final UpdateOptions updateOptions) {
    V1ObjectMeta objectMeta = object.getMetadata();
    boolean isNamespaced = !Strings.isNullOrEmpty(objectMeta.getNamespace());
    return () ->
        //// TODO(yue9944882): judge namespaced object via api discovery
        isNamespaced
            ? customObjectsApi.replaceNamespacedCustomObject(
                this.apiGroup,
                this.apiVersion,
                objectMeta.getNamespace(),
                this.resourcePlural,
                objectMeta.getName(),
                object)
                .dryRun(updateOptions.getDryRun())
                .fieldManager(updateOptions.getFieldManager())
                .buildCall(null)
            : customObjectsApi.replaceClusterCustomObject(
                this.apiGroup,
                this.apiVersion,
                this.resourcePlural,
                objectMeta.getName(),
                object)
                .dryRun(updateOptions.getDryRun())
                .fieldManager(updateOptions.getFieldManager())
                .buildCall(null);
  }

  /**
   * Update kubernetes api response.
   *
   * @param object the object
   * @param updateOptions the update options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> updateAsync(
      ApiType object,
      final UpdateOptions updateOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeUpdateCallBuilder(object, updateOptions),
        callback);
  }

  /**
   * Create kubernetes api response, if the namespace in the object is present, it will send a
   * namespace-scoped requests, vice versa.
   *
   * @param object the object
   * @param status function to extract the status from the object
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> updateStatus(
      ApiType object, Function<ApiType, Object> status) {
    return updateStatus(object, status, new UpdateOptions());
  }

  /**
   * Update status of kubernetes api response.
   *
   * @param object the object
   * @param status function to extract the status from the object
   * @param updateOptions the update options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> updateStatus(
      ApiType object, Function<ApiType, Object> status, final UpdateOptions updateOptions) {
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeUpdateStatusCallBuilder(object, status, updateOptions));
  }

  private CallBuilder makeUpdateStatusCallBuilder(
      ApiType object, Function<ApiType, Object> status, final UpdateOptions updateOptions) {
    V1ObjectMeta objectMeta = object.getMetadata();
    boolean isNamespaced = !Strings.isNullOrEmpty(objectMeta.getNamespace());
    return () ->
        //// TODO(yue9944882): judge namespaced object via api discovery
        isNamespaced
            ? customObjectsApi.patchNamespacedCustomObjectStatus(
                this.apiGroup,
                this.apiVersion,
                objectMeta.getNamespace(),
                this.resourcePlural,
                objectMeta.getName(),
                Arrays.asList(new StatusPatch(status.apply(object))))
                .dryRun(updateOptions.getDryRun())
                .fieldManager(updateOptions.getFieldManager())
                .buildCall(null)
            : customObjectsApi.patchClusterCustomObjectStatus(
                this.apiGroup,
                this.apiVersion,
                this.resourcePlural,
                objectMeta.getName(),
                Arrays.asList(new StatusPatch(status.apply(object))))
                .dryRun(updateOptions.getDryRun())
                .fieldManager(updateOptions.getFieldManager())
                .buildCall(null);
  }

  /**
   * Create kubernetes api response, if the namespace in the object is present, it will send a
   * namespace-scoped requests, vice versa.
   *
   * @param object the object
   * @param status function to extract the status from the object
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> updateStatusAsync(
      ApiType object,
      Function<ApiType, Object> status,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return updateStatusAsync(object, status, new UpdateOptions(), callback);
  }

  /**
   * Update status of kubernetes api response.
   *
   * @param object the object
   * @param status function to extract the status from the object
   * @param updateOptions the update options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> updateStatusAsync(
      ApiType object,
      Function<ApiType, Object> status,
      final UpdateOptions updateOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeUpdateStatusCallBuilder(object, status, updateOptions),
        callback);
  }

  private Call adaptPatchCall(ApiClient apiClient, Call call, String patchType) {
    Request request = call.request();
    return apiClient
        .getHttpClient()
        .newCall(
            request
                .newBuilder()
                .patch(new ProxyContentTypeRequestBody(request.body(), patchType))
                .build());
  }

  /**
   * Patch kubernetes api response.
   *
   * @param name the name
   * @param patchType the patch type
   * @param patch the patch
   * @param patchOptions the patch options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> patch(
      String name, String patchType, V1Patch patch, final PatchOptions patchOptions) {
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }

    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeClusterPatchCallBuilder(name, patchType, patch, patchOptions));
  }

  private CallBuilder makeClusterPatchCallBuilder(
      String name, String patchType, V1Patch patch, final PatchOptions patchOptions) {
    return () ->
        adaptPatchCall(
            customObjectsApi.getApiClient(),
            customObjectsApi.patchClusterCustomObject(
                this.apiGroup,
                this.apiVersion,
                this.resourcePlural,
                name,
                patch)
                    .dryRun(patchOptions.getDryRun())
                    .fieldManager(patchOptions.getFieldManager())
                    .force(patchOptions.getForce())
                    .buildCall(null),
            patchType);
  }

  /**
   * Patch kubernetes api response.
   *
   * @param namespace the namespace
   * @param name the name
   * @param patchType the patch type
   * @param patch the patch
   * @param patchOptions the patch options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> patch(
      String namespace,
      String name,
      String patchType,
      V1Patch patch,
      final PatchOptions patchOptions) {
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeNamespacedPatchCallBuilder(namespace, name, patchType, patch, patchOptions));
  }

  private CallBuilder makeNamespacedPatchCallBuilder(
      String namespace,
      String name,
      String patchType,
      V1Patch patch,
      final PatchOptions patchOptions) {
    return () ->
        adaptPatchCall(
            customObjectsApi.getApiClient(),
            customObjectsApi.patchNamespacedCustomObject(
                this.apiGroup,
                this.apiVersion,
                namespace,
                this.resourcePlural,
                name,
                patch)
                    .dryRun(patchOptions.getDryRun())
                    .fieldManager(patchOptions.getFieldManager())
                    .force(patchOptions.getForce())
                    .buildCall(null),
            patchType);
  }

  /**
   * Patch kubernetes api response.
   *
   * @param name the name
   * @param patchType the patch type
   * @param patch the patch
   * @param patchOptions the patch options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> patchAsync(
      String name,
      String patchType,
      V1Patch patch,
      final PatchOptions patchOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }

    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeClusterPatchCallBuilder(name, patchType, patch, patchOptions),
        callback);
  }

  /**
   * Patch kubernetes api response.
   *
   * @param namespace the namespace
   * @param name the name
   * @param patchType the patch type
   * @param patch the patch
   * @param patchOptions the patch options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> patchAsync(
      String namespace,
      String name,
      String patchType,
      V1Patch patch,
      final PatchOptions patchOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeNamespacedPatchCallBuilder(namespace, name, patchType, patch, patchOptions),
        callback);
  }

  /**
   * Delete kubernetes api response.
   *
   * @param name the name
   * @param deleteOptions the delete options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> delete(String name, final DeleteOptions deleteOptions) {
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeClusterDeleteCallBuilder(name, deleteOptions));
  }

  private CallBuilder makeClusterDeleteCallBuilder(String name, final DeleteOptions deleteOptions) {
    return () ->
        customObjectsApi.deleteClusterCustomObject(
            this.apiGroup,
            this.apiVersion,
            this.resourcePlural,
            name)
                // TODO: fill/convert the option
                .buildCall(null);
  }

  /**
   * Delete kubernetes api response.
   *
   * @param namespace the namespace
   * @param name the name
   * @param deleteOptions the delete options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> delete(
      String namespace, String name, final DeleteOptions deleteOptions) {
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeNamespacedDeleteCallBuilder(namespace, name, deleteOptions));
  }

  private CallBuilder makeNamespacedDeleteCallBuilder(
      String namespace, String name, final DeleteOptions deleteOptions) {
    return () ->
        customObjectsApi.deleteNamespacedCustomObject(
            this.apiGroup,
            this.apiVersion,
            namespace,
            this.resourcePlural,
            name)
                .body(deleteOptions)
                .buildCall(null);
  }

  /**
   * Delete kubernetes api response.
   *
   * @param name the name
   * @param deleteOptions the delete options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> deleteAsync(
      String name,
      final DeleteOptions deleteOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeClusterDeleteCallBuilder(name, deleteOptions),
        callback);
  }

  /**
   * Delete kubernetes api response.
   *
   * @param namespace the namespace
   * @param name the name
   * @param deleteOptions the delete options
   * @param callback the callback
   * @return future for the kubernetes api response
   */
  public Future<KubernetesApiResponse<ApiType>> deleteAsync(
      String namespace,
      String name,
      final DeleteOptions deleteOptions,
      @Nonnull Consumer<KubernetesApiResponse<ApiType>> callback) {
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    if (Strings.isNullOrEmpty(name)) {
      throw new IllegalArgumentException("invalid name");
    }
    return executeCallAsync(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        makeNamespacedDeleteCallBuilder(namespace, name, deleteOptions),
        callback);
  }

  /**
   * Watch watchable.
   *
   * @param listOptions the list options
   * @return the watchable
   * @throws ApiException the api exception
   */
  public Watchable<ApiType> watch(final ListOptions listOptions) throws ApiException {
    Call call =
        customObjectsApi.listClusterCustomObject(
            this.apiGroup,
            this.apiVersion,
            this.resourcePlural)
                ._continue(listOptions.getContinue())
                .fieldSelector(listOptions.getFieldSelector())
                .labelSelector(listOptions.getLabelSelector())
                .limit(listOptions.getLimit())
                .resourceVersion(listOptions.getResourceVersion())
                .timeoutSeconds(listOptions.getTimeoutSeconds())
                .watch(true)
                .buildCall(null);

    call = tweakCallForCoreV1Group(call);
    return Watch.createWatch(
        customObjectsApi.getApiClient(),
        call,
        TypeToken.getParameterized(Watch.Response.class, apiTypeClass).getType());
  }

  /**
   * Watch watchable.
   *
   * @param namespace the namespace
   * @param listOptions the list options
   * @return the watchable
   * @throws ApiException the api exception
   */
  public Watchable<ApiType> watch(String namespace, final ListOptions listOptions)
      throws ApiException {
    if (Strings.isNullOrEmpty(namespace)) {
      throw new IllegalArgumentException("invalid namespace");
    }
    Call call =
        customObjectsApi.listNamespacedCustomObject(
            this.apiGroup,
            this.apiVersion,
            namespace,
            this.resourcePlural)
                ._continue(listOptions.getContinue())
                .fieldSelector(listOptions.getFieldSelector())
                .labelSelector(listOptions.getLabelSelector())
                .limit(listOptions.getLimit())
                .resourceVersion(listOptions.getResourceVersion())
                .timeoutSeconds(listOptions.getTimeoutSeconds())
                .watch(true)
                .buildCall(null);

    call = tweakCallForCoreV1Group(call);
    return Watch.createWatch(
        customObjectsApi.getApiClient(),
        call,
        TypeToken.getParameterized(Watch.Response.class, apiTypeClass).getType());
  }

  private static <DataType extends KubernetesType>
      KubernetesApiResponse<DataType> getKubernetesApiResponse(
          Class<DataType> dataClass, JsonElement element, Gson gson) {
    return getKubernetesApiResponse(dataClass, element, gson, 200);
  }

  private static <DataType extends KubernetesType>
      KubernetesApiResponse<DataType> getKubernetesApiResponse(
          Class<DataType> dataClass, JsonElement element, Gson gson, int httpStatusCode) {
    JsonElement kindElement = element.getAsJsonObject().get("kind");
    boolean isStatus = kindElement != null && "Status".equals(kindElement.getAsString());
    if (isStatus) {
      return new KubernetesApiResponse<>(gson.fromJson(element, V1Status.class), httpStatusCode);
    }
    return new KubernetesApiResponse<>(gson.fromJson(element, dataClass));
  }

  private Call prepareCall(CallBuilder callBuilder) throws ApiException {
    Call call = callBuilder.build();
    return tweakCallForCoreV1Group(call);
  }

  private void checkForIOException(ApiException e) {
    if (e.getCause() instanceof IOException) {
      throw new IllegalStateException(e.getCause()); // make this a checked exception?
    }
  }

  private <DataType extends KubernetesType>
      KubernetesApiResponse<DataType> responseFromApiException(
          ApiClient apiClient, ApiException e) {
    checkForIOException(e);
    final V1Status status;
    try {
      status = apiClient.getJSON().deserialize(e.getResponseBody(), V1Status.class);
    } catch (JsonSyntaxException jsonEx) {
      // craft a status object
      return new KubernetesApiResponse<>(
          new V1Status().code(e.getCode()).message(e.getResponseBody()), e.getCode());
    }
    if (null == status) { // the response body can be something unexpected sometimes...
      // this line should never reach?
      throw new RuntimeException(e);
    }
    return new KubernetesApiResponse<>(status, e.getCode());
  }

  private <DataType extends KubernetesType> KubernetesApiResponse<DataType> executeCall(
      ApiClient apiClient, Class<DataType> dataClass, CallBuilder callBuilder) {
    try {
      Call call = prepareCall(callBuilder);
      ApiResponse<JsonElement> response = apiClient.execute(call, JsonElement.class);
      JsonElement element = response.getData();
      if (element == null) {
        throw new ApiException(null, response.getStatusCode(), null, "Unexpected response body");
      }
      return getKubernetesApiResponse(dataClass, element, apiClient.getJSON().getGson());
    } catch (ApiException e) {
      return responseFromApiException(apiClient, e);
    }
  }

  // For unit-test
  interface CallAdapter extends UnaryOperator<Call> {}

  private <DataType extends KubernetesType> Call prepareCall(
      CallBuilder callBuilder, @Nonnull Consumer<KubernetesApiResponse<DataType>> callback)
      throws ApiException {
    Call call = prepareCall(callBuilder);

    // For unit-test
    if (callback instanceof CallAdapter) {
      call = ((CallAdapter) callback).apply(call);
    }

    return call;
  }

  private <DataType extends KubernetesType>
      Future<KubernetesApiResponse<DataType>> executeCallAsync(
          ApiClient apiClient,
          Class<DataType> dataClass,
          CallBuilder callBuilder,
          @Nonnull Consumer<KubernetesApiResponse<DataType>> callback) {
    try {
      Call call = prepareCall(callBuilder, callback);
      CountDownLatch latch = new CountDownLatch(1);
      AtomicReference<KubernetesApiResponse<DataType>> result = new AtomicReference<>();

      apiClient.executeAsync(
          call,
          JsonElement.class,
          new ApiCallback<JsonElement>() {
            @Override
            public void onFailure(
                ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
              if (latch.getCount() > 0) {
                KubernetesApiResponse<DataType> r = responseFromApiException(apiClient, e);
                result.set(r);
                latch.countDown();
                callback.accept(r);
              }
            }

            @Override
            public void onSuccess(
                JsonElement element, int statusCode, Map<String, List<String>> responseHeaders) {
              KubernetesApiResponse<DataType> r =
                  getKubernetesApiResponse(dataClass, element, apiClient.getJSON().getGson());
              if (latch.getCount() > 0) {
                result.set(r);
                latch.countDown();
                callback.accept(r);
              }
            }

            @Override
            public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
              // no-op
            }

            @Override
            public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
              // no-op
            }
          });

      return new Future<KubernetesApiResponse<DataType>>() {
        private final AtomicBoolean isCanceled = new AtomicBoolean(false);

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
          if (isDone()) {
            return false;
          }
          call.cancel();
          isCanceled.set(true);
          latch.countDown();
          return true;
        }

        @Override
        public boolean isCancelled() {
          return isCanceled.get();
        }

        @Override
        public boolean isDone() {
          return latch.getCount() == 0;
        }

        @Override
        public KubernetesApiResponse<DataType> get() throws InterruptedException {
          latch.await();
          if (isCancelled()) {
            throw new CancellationException();
          }
          return result.get();
        }

        @Override
        public KubernetesApiResponse<DataType> get(long timeout, @Nonnull TimeUnit unit)
            throws InterruptedException, TimeoutException {
          if (latch.await(timeout, unit)) {
            if (isCancelled()) {
              throw new CancellationException();
            }
            return result.get();
          } else {
            throw new TimeoutException();
          }
        }
      };
    } catch (ApiException e) {
      checkForIOException(e);
      throw new RuntimeException(e);
    }
  }

  // CallBuilder builds a call and throws ApiException otherwise.
  private interface CallBuilder {
    /**
     * Build call.
     *
     * @return the call
     * @throws ApiException the api exception
     */
    Call build() throws ApiException;
  }

  private Call tweakCallForCoreV1Group(Call call) {
    if (!apiGroup.equals("")) {
      return call;
    }
    HttpUrl url = call.request().url();
    String basePath = customObjectsApi.getApiClient().getBasePath();
    // count segments in the basePath
    int offset = 0;
    for (int i = basePath.indexOf("://") + 3; i < basePath.length(); ++i) {
      if (basePath.charAt(i) == '/') {
        ++offset;
      }
    }
    HttpUrl tweakedUrl =
        url.newBuilder().removePathSegment(offset + 1).setPathSegment(offset, "api").build();

    return this.customObjectsApi
        .getApiClient()
        .getHttpClient()
        .newCall(call.request().newBuilder().url(tweakedUrl).build());
  }

  public static class StatusPatch {

    private String op = "replace";

    private String path = "/status";

    private Object value;

    public StatusPatch(Object value) {
      this.value = value;
    }

    public String getOp() {
      return op;
    }

    public void setOp(String op) {
      this.op = op;
    }

    public String getPath() {
      return path;
    }

    public void setPath(String path) {
      this.path = path;
    }

    public Object getValue() {
      return value;
    }

    public void setValue(Object value) {
      this.value = value;
    }
  }
}
