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
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.PatchUtils;
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
import java.util.function.Function;
import okhttp3.Call;
import okhttp3.HttpUrl;

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

  // TODO(yue9944882): supports status operations..
  // TODO(yue9944882): supports generic sub-resource operations..
  // TODO(yue9944882): supports delete-collections..

  private Class<ApiType> apiTypeClass;
  private Class<ApiListType> apiListTypeClass;
  private String apiGroup;
  private String apiVersion;
  private String resourcePlural;
  private CustomObjectsApi customObjectsApi;

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
   * @param apiListTypeClass the api list type class e.g V1JobList.class
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
   * @param apiListTypeClass the api list type class e.g V1JobList.class
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
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> update(ApiType object) {
    return update(object, new UpdateOptions());
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
      throw new IllegalArgumentException("invalid namespace");
    }
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        () ->
            customObjectsApi.getClusterCustomObjectCall(
                this.apiGroup, this.apiVersion, this.resourcePlural, name, null));
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
        () -> {
          return customObjectsApi.getNamespacedCustomObjectCall(
              this.apiGroup, this.apiVersion, namespace, this.resourcePlural, name, null);
        });
  }

  /**
   * List kubernetes api response.
   *
   * @param listOptions the list options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiListType> list(final ListOptions listOptions) {
    return executeCall(
        customObjectsApi.getApiClient(),
        apiListTypeClass,
        () -> {
          return customObjectsApi.listClusterCustomObjectCall(
              this.apiGroup,
              this.apiVersion,
              this.resourcePlural,
              null,
              listOptions.getContinue(),
              listOptions.getFieldSelector(),
              listOptions.getLabelSelector(),
              listOptions.getLimit(),
              listOptions.getResourceVersion(),
              listOptions.getTimeoutSeconds(),
              false,
              null);
        });
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
        () -> {
          return customObjectsApi.listNamespacedCustomObjectCall(
              this.apiGroup,
              this.apiVersion,
              namespace,
              this.resourcePlural,
              null,
              listOptions.getContinue(),
              listOptions.getFieldSelector(),
              listOptions.getLabelSelector(),
              listOptions.getLimit(),
              listOptions.getResourceVersion(),
              listOptions.getTimeoutSeconds(),
              false,
              null);
        });
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
        () -> {
          // TODO(yue9944882): judge namespaced object via api discovery
          return customObjectsApi.createClusterCustomObjectCall(
              this.apiGroup,
              this.apiVersion,
              this.resourcePlural,
              object,
              null,
              createOptions.getDryRun(),
              createOptions.getFieldManager(),
              null);
        });
  }

  public KubernetesApiResponse<ApiType> create(
      String namespace, ApiType object, final CreateOptions createOptions) {
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        () -> {
          // TODO(yue9944882): judge namespaced object via api discovery
          return customObjectsApi.createNamespacedCustomObjectCall(
              this.apiGroup,
              this.apiVersion,
              namespace,
              this.resourcePlural,
              object,
              null,
              createOptions.getDryRun(),
              createOptions.getFieldManager(),
              null);
        });
  }

  /**
   * Update kubernetes api response.
   *
   * @param object the object
   * @param updateOptions the update options
   * @return the kubernetes api response
   */
  public KubernetesApiResponse<ApiType> update(ApiType object, final UpdateOptions updateOptions) {
    V1ObjectMeta objectMeta = object.getMetadata();
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        () -> {
          //// TODO(yue9944882): judge namespaced object via api discovery
          boolean isNamespaced = !Strings.isNullOrEmpty(objectMeta.getNamespace());
          if (isNamespaced) {
            return customObjectsApi.replaceNamespacedCustomObjectCall(
                this.apiGroup,
                this.apiVersion,
                objectMeta.getNamespace(),
                this.resourcePlural,
                objectMeta.getName(),
                object,
                updateOptions.getDryRun(),
                updateOptions.getFieldManager(),
                null);
          } else {
            return customObjectsApi.replaceClusterCustomObjectCall(
                this.apiGroup,
                this.apiVersion,
                this.resourcePlural,
                objectMeta.getName(),
                object,
                updateOptions.getDryRun(),
                updateOptions.getFieldManager(),
                null);
          }
        });
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
    V1ObjectMeta objectMeta = object.getMetadata();
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        () -> {
          //// TODO(yue9944882): judge namespaced object via api discovery
          boolean isNamespaced = !Strings.isNullOrEmpty(objectMeta.getNamespace());
          if (isNamespaced) {
            return customObjectsApi.patchNamespacedCustomObjectStatusCall(
                this.apiGroup,
                this.apiVersion,
                objectMeta.getNamespace(),
                this.resourcePlural,
                objectMeta.getName(),
                Arrays.asList(new StatusPatch(status.apply(object))),
                updateOptions.getDryRun(),
                updateOptions.getFieldManager(),
                null,
                null);
          } else {
            return customObjectsApi.patchClusterCustomObjectStatusCall(
                this.apiGroup,
                this.apiVersion,
                this.resourcePlural,
                objectMeta.getName(),
                Arrays.asList(new StatusPatch(status.apply(object))),
                updateOptions.getDryRun(),
                updateOptions.getFieldManager(),
                null,
                null);
          }
        });
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
    try {
      ApiType object =
          PatchUtils.patch(
              apiTypeClass,
              () -> {
                Call call =
                    customObjectsApi.patchClusterCustomObjectCall(
                        this.apiGroup,
                        this.apiVersion,
                        this.resourcePlural,
                        name,
                        patch,
                        patchOptions.getDryRun(),
                        patchOptions.getFieldManager(),
                        patchOptions.getForce(),
                        null);
                return tweakCallForCoreV1Group(call);
              },
              patchType,
              this.customObjectsApi.getApiClient());
      return new KubernetesApiResponse<ApiType>(object);
    } catch (ApiException e) {
      V1Status status =
          customObjectsApi
              .getApiClient()
              .getJSON()
              .deserialize(e.getResponseBody(), V1Status.class);
      return new KubernetesApiResponse<>(status, e.getCode());
    }
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
    try {
      ApiType object =
          PatchUtils.patch(
              apiTypeClass,
              () -> {
                Call call =
                    customObjectsApi.patchNamespacedCustomObjectCall(
                        this.apiGroup,
                        this.apiVersion,
                        namespace,
                        this.resourcePlural,
                        name,
                        patch,
                        patchOptions.getDryRun(),
                        patchOptions.getFieldManager(),
                        patchOptions.getForce(),
                        null);
                return tweakCallForCoreV1Group(call);
              },
              patchType,
              this.customObjectsApi.getApiClient());
      return new KubernetesApiResponse<ApiType>(object);
    } catch (ApiException e) {
      V1Status status =
          customObjectsApi
              .getApiClient()
              .getJSON()
              .deserialize(e.getResponseBody(), V1Status.class);
      return new KubernetesApiResponse<>(status, e.getCode());
    }
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
        () -> {
          return customObjectsApi.deleteClusterCustomObjectCall(
              this.apiGroup,
              this.apiVersion,
              this.resourcePlural,
              name,
              null,
              null,
              null,
              null,
              deleteOptions, // TODO: fill/convert the option
              null);
        });
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
        () -> {
          return customObjectsApi.deleteNamespacedCustomObjectCall(
              this.apiGroup,
              this.apiVersion,
              namespace,
              this.resourcePlural,
              name,
              null,
              null,
              null,
              null,
              deleteOptions, // TODO: fill/convert the option
              null);
        });
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
        customObjectsApi.listClusterCustomObjectCall(
            this.apiGroup,
            this.apiVersion,
            this.resourcePlural,
            null,
            listOptions.getContinue(),
            listOptions.getFieldSelector(),
            listOptions.getLabelSelector(),
            listOptions.getLimit(),
            listOptions.getResourceVersion(),
            listOptions.getTimeoutSeconds(),
            true,
            null);

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
        customObjectsApi.listNamespacedCustomObjectCall(
            this.apiGroup,
            this.apiVersion,
            namespace,
            this.resourcePlural,
            null,
            listOptions.getContinue(),
            listOptions.getFieldSelector(),
            listOptions.getLabelSelector(),
            listOptions.getLimit(),
            listOptions.getResourceVersion(),
            listOptions.getTimeoutSeconds(),
            true,
            null);

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

  private <DataType extends KubernetesType> KubernetesApiResponse<DataType> executeCall(
      ApiClient apiClient, Class<DataType> dataClass, CallBuilder callBuilder) {
    try {
      Call call = callBuilder.build();
      call = tweakCallForCoreV1Group(call);
      JsonElement element = apiClient.<JsonElement>execute(call, JsonElement.class).getData();
      return getKubernetesApiResponse(dataClass, element, apiClient.getJSON().getGson());
    } catch (ApiException e) {
      if (e.getCause() instanceof IOException) {
        throw new IllegalStateException(e.getCause()); // make this a checked exception?
      }
      final V1Status status;
      try {
        status = apiClient.getJSON().deserialize(e.getResponseBody(), V1Status.class);
      } catch (JsonSyntaxException jsonEx) {
        // craft a status object
        return new KubernetesApiResponse<>(
            new V1Status().code(e.getCode()).message(e.getResponseBody()), e.getCode());
      }
      if (null == status) { // the response body can be something unexpected sometimes..
        // this line should never reach?
        throw new RuntimeException(e);
      }
      return new KubernetesApiResponse<>(status, e.getCode());
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
    HttpUrl tweakedUrl = url.newBuilder().removePathSegment(1).setPathSegment(0, "api").build();
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
