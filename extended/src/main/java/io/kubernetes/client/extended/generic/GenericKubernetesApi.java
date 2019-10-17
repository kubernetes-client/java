package io.kubernetes.client.extended.generic;

import com.google.common.annotations.Beta;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.extended.generic.options.CreateOptions;
import io.kubernetes.client.extended.generic.options.DeleteOptions;
import io.kubernetes.client.extended.generic.options.GetOptions;
import io.kubernetes.client.extended.generic.options.ListOptions;
import io.kubernetes.client.extended.generic.options.PatchOptions;
import io.kubernetes.client.extended.generic.options.UpdateOptions;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.PatchUtils;
import io.kubernetes.client.util.Reflect;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.net.SocketTimeoutException;
import okhttp3.Call;

/**
 * The Generic kubernetes api provides a unified client interface for not only the non-core-group
 * built-in resources from kuberntes but also the custom-resources models meet the following
 * requirements:
 *
 * <p>1. there's a `V1ObjectMeta` field in the model along with its getter/setter. 2. there's a
 * `V1ListMeta` field in the list model along with its getter/setter. - supports Gson
 * serialization/deserialization. 3. the generic kubernetes api covers all the basic operations over
 * the custom resources including {get, list, watch, create, update, patch, delete}.
 *
 * @param <ApiType> the api type parameter
 * @param <ApiListType> the api list type parameter
 */
@Beta
public class GenericKubernetesApi<ApiType, ApiListType> {

  // TODO(yue9944882): supports status operations..
  // TODO(yue9944882): supports generic sub-resoruce operations..
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
    if ("".equals(apiGroup)) {
      throw new IllegalArgumentException(
          "core group (\"v1\") api not supported, use CoreV1Api instead");
    }
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
    CustomObjectsApi customObjectsApi = new CustomObjectsApi();
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        () -> {
          return customObjectsApi.getClusterCustomObjectCall(
              this.apiGroup, this.apiVersion, this.resourcePlural, name, null);
        });
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
              null,
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
              null,
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
    V1ObjectMeta objectMeta;
    try {
      objectMeta = Reflect.objectMetadata(object);
    } catch (ObjectMetaReflectException e) {
      throw new IllegalArgumentException("fail to extract object metadata");
    }

    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        () -> {
          // TODO(yue9944882): judge namespaced object via api discovery
          boolean isNamespaced = !Strings.isNullOrEmpty(objectMeta.getNamespace());
          if (isNamespaced) {
            return customObjectsApi.createNamespacedCustomObjectCall(
                this.apiGroup,
                this.apiVersion,
                objectMeta.getNamespace(),
                this.resourcePlural,
                object,
                null,
                null);
          } else {
            return customObjectsApi.createClusterCustomObjectCall(
                this.apiGroup, this.apiVersion, this.resourcePlural, object, null, null);
          }
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
    V1ObjectMeta objectMeta;
    try {
      objectMeta = Reflect.objectMetadata(object);
    } catch (ObjectMetaReflectException e) {
      throw new IllegalArgumentException("fail to extract object metadata");
    }
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
                null);
          } else {
            return customObjectsApi.replaceClusterCustomObjectCall(
                this.apiGroup,
                this.apiVersion,
                this.resourcePlural,
                objectMeta.getName(),
                object,
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
    return executeCall(
        customObjectsApi.getApiClient(),
        apiTypeClass,
        () -> {
          return customObjectsApi.patchClusterCustomObjectCall(
              this.apiGroup, this.apiVersion, this.resourcePlural, name, patch, null);
        });
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
                return customObjectsApi.patchNamespacedCustomObjectCall(
                    this.apiGroup,
                    this.apiVersion,
                    namespace,
                    this.resourcePlural,
                    name,
                    patch,
                    null);
              },
              patchType);
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
            null,
            null);

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
            null,
            null);

    return Watch.createWatch(
        customObjectsApi.getApiClient(),
        call,
        TypeToken.getParameterized(Watch.Response.class, apiTypeClass).getType());
  }

  private static <DataType> KubernetesApiResponse<DataType> getKubernetesApiResponse(
      Class<DataType> dataClass, JsonElement element, Gson gson) {
    return getKubernetesApiResponse(dataClass, element, gson, 200);
  }

  private static <DataType> KubernetesApiResponse<DataType> getKubernetesApiResponse(
      Class<DataType> dataClass, JsonElement element, Gson gson, int httpStatusCode) {
    JsonElement kindElement = element.getAsJsonObject().get("kind");
    boolean isStatus = kindElement != null && "Status".equals(kindElement.getAsString());
    if (isStatus) {
      return new KubernetesApiResponse<>(gson.fromJson(element, V1Status.class), httpStatusCode);
    }
    return new KubernetesApiResponse<>(gson.fromJson(element, dataClass));
  }

  private static <DataType> KubernetesApiResponse<DataType> executeCall(
      ApiClient apiClient, Class<DataType> dataClass, CallBuilder callBuilder) {
    try {
      Call call = callBuilder.build();
      JsonElement element = apiClient.<JsonElement>execute(call, JsonElement.class).getData();
      return getKubernetesApiResponse(dataClass, element, apiClient.getJSON().getGson());
    } catch (ApiException e) {
      if (e.getCause() instanceof SocketTimeoutException) {
        throw new IllegalStateException(e.getCause()); // make this a checked exception?
      }
      V1Status status = apiClient.getJSON().deserialize(e.getResponseBody(), V1Status.class);
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
}
