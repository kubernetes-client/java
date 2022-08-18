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
package io.kubernetes.client.extended.kubectl;

import io.kubernetes.client.Discovery;
import io.kubernetes.client.apimachinery.GroupVersionKind;
import io.kubernetes.client.apimachinery.GroupVersionResource;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.ModelMapper;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesListObject;
import io.kubernetes.client.util.generic.dynamic.DynamicKubernetesObject;

/**
 * Kubectl provides a set of helper functions that has the same functionalities as corresponding
 * kubectl commands.
 */
public class Kubectl {

  /** Equivalent for `kubectl get` */
  public static <ApiType extends KubernetesObject> KubectlGet<ApiType> get(
      Class<ApiType> apiTypeClass) {
    return new KubectlGet<>(apiTypeClass);
  }

  /** Equivalent for `kubectl create` */
  public static <ApiType extends KubernetesObject> KubectlCreate<ApiType> create(
      Class<ApiType> clazz) {
    return new KubectlCreate<>(clazz);
  }

  /** Equivalent for `kubectl delete` */
  public static <ApiType extends KubernetesObject> KubectlDelete<ApiType> delete(
      Class<ApiType> clazz) {
    return new KubectlDelete<>(clazz);
  }

  /** Equivalent for `kubectl replace` */
  public static <ApiType extends KubernetesObject> KubectlReplace<ApiType> replace(
      Class<ApiType> clazz) {
    return new KubectlReplace<>(clazz);
  }

  /** Equivalent for `kubectl apply` */
  public static <ApiType extends KubernetesObject> KubectlApply<ApiType> apply(
      Class<ApiType> clazz) {
    return new KubectlApply(clazz);
  }

  /** Equivalent for `kubectl drain` */
  public static KubectlDrain drain() {
    return new KubectlDrain();
  }

  /** Equivalent for `kubectl cordon` */
  public static KubectlCordon cordon() {
    return new KubectlCordon(true);
  }

  /** Equivalent for `kubectl uncordon` */
  public static KubectlCordon uncordon() {
    return new KubectlCordon(false);
  }

  /**
   * Equivalent for `kubectl top`
   *
   * @param apiTypeClass Must be either V1Pod.class or V1Node.class
   * @return the kubectl top implementation
   */
  public static <ApiType extends KubernetesObject, MetricsType>
      KubectlTop<ApiType, MetricsType> top(
          Class<ApiType> apiTypeClass, Class<MetricsType> metricsTypeClass) {
    return new KubectlTop<ApiType, MetricsType>(apiTypeClass);
  }

  /** Equivalence for `kubectl taint`. */
  public static KubectlTaint taint() {
    return new KubectlTaint();
  }

  /**
   * Equivalence for `kubectl cp`.
   *
   * @return the kubectl copy
   */
  public static KubectlCopy copy() {
    return new KubectlCopy();
  }

  /**
   * Equivalence for `kubectl label`.
   *
   * @param <ApiType> the target api type
   * @param apiTypeClass the api type class
   * @return the kubectl label
   */
  public static <ApiType extends KubernetesObject> KubectlLabel<ApiType> label(
      Class<ApiType> apiTypeClass) {
    return new KubectlLabel<>(apiTypeClass);
  }

  /**
   * Equivalence for `kubectl annotate`.
   *
   * @param <ApiType> the target api type
   * @param apiTypeClass the api type class
   * @return the kubectl annotation
   */
  public static <ApiType extends KubernetesObject> KubectlAnnotate<ApiType> annotate(
      Class<ApiType> apiTypeClass) {
    return new KubectlAnnotate<>(apiTypeClass);
  }

  /**
   * Equivalence for `kubectl version`.
   *
   * @return the kubectl version
   */
  public static KubectlVersion version() {
    return new KubectlVersion();
  }

  /**
   * Equivalent for `kubectl scale`
   *
   * @param <ApiType> the target api type
   * @param apiTypeClass the api type class
   * @return the kubectl scale operator
   */
  public static <ApiType extends KubernetesObject> KubectlScale<ApiType> scale(
      Class<ApiType> apiTypeClass) {
    return new KubectlScale<>(apiTypeClass);
  }

  /**
   * Equivalent for `kubectl rollout history`
   *
   * @param <ApiType> the target api type
   * @param apiTypeClass the api type class
   * @return the kubectl rollout history operator
   */
  public static <ApiType extends KubernetesObject> KubectlRollout<ApiType> rollout(
      Class<ApiType> apiTypeClass) {
    return new KubectlRollout<>(apiTypeClass);
  }

  /**
   * Equivalent for `kubectl exec`
   *
   * @return the kubectl exec operator
   */
  public static KubectlExec exec() {
    return new KubectlExec();
  }

  /**
   * Equivalent for `kubectl log`
   *
   * @return the kubectl log operator
   */
  public static KubectlLog log() {
    return new KubectlLog();
  }

  public static KubectlPortForward portforward() {
    return new KubectlPortForward();
  }

  public static KubectlApiResources apiResources() {
    return new KubectlApiResources();
  }

  /**
   * Equivalent for `Kubectl patch`
   *
   * @param apiTypeClass
   * @param <ApiType>
   * @return
   */
  public static <ApiType extends KubernetesObject> KubectlPatch<ApiType> patch(
      Class<ApiType> apiTypeClass) {
    return new KubectlPatch<>(apiTypeClass);
  }

  /**
   * Executable executes a kubectl helper.
   *
   * @param <OUTPUT> the type parameter
   */
  public static interface Executable<OUTPUT> {

    /**
     * Run and retrieve the output from the kubectl helpers.
     *
     * @return the output, can be Void
     * @throws KubectlException the kubectl exception
     */
    OUTPUT execute() throws KubectlException;
  }

  abstract static class NamespacedApiClientBuilder<T extends NamespacedApiClientBuilder>
      extends ApiClientBuilder<T> {
    String namespace;

    public T namespace(String namespace) {
      this.namespace = namespace;
      return (T) this;
    }
  }

  abstract static class ApiClientBuilder<T extends ApiClientBuilder> {
    ApiClient apiClient = Configuration.getDefaultApiClient();
    boolean skipDiscovery = false;

    protected void refreshDiscovery() throws KubectlException {
      if (skipDiscovery) {
        return;
      }
      try {
        ModelMapper.refresh(new Discovery(apiClient));
      } catch (ApiException e) {
        throw new KubectlException(e);
      }
    }

    protected <ApiType extends KubernetesObject>
        GenericKubernetesApi<ApiType, ? extends KubernetesListObject> getGenericApi(
            Class<ApiType> apiTypeClass) throws KubectlException {

      // load list type class dynamically from class-loader
      String apiListTypeClassName = apiTypeClass.getName() + "List";
      try {
        Class<? extends KubernetesListObject> apiTypeListClass;
        apiTypeListClass =
            (Class<? extends KubernetesListObject>)
                apiTypeClass.getClassLoader().loadClass(apiListTypeClassName);
        return getGenericApi(apiTypeClass, apiTypeListClass);
      } catch (ClassNotFoundException e) {
        throw new KubectlException(
            new StringBuilder()
                .append("No such api list type class ")
                .append(apiListTypeClassName)
                .append(", consider explicitly load the class by apiListTypeClass()?")
                .toString());
      }
    }

    protected <ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
        GenericKubernetesApi<ApiType, ApiListType> getGenericApi(
            Class<ApiType> apiTypeClass, Class<ApiListType> apiListTypeClass)
            throws KubectlException {
      GroupVersionResource groupVersionResource =
          ModelMapper.getGroupVersionResourceByClass(apiTypeClass);
      if (groupVersionResource == null) {
        throw new KubectlException("Unexpected unknown resource type: " + apiTypeClass);
      }
      GenericKubernetesApi<ApiType, ApiListType> api =
          new GenericKubernetesApi<>(
              apiTypeClass,
              apiListTypeClass,
              groupVersionResource.getGroup(),
              groupVersionResource.getVersion(),
              groupVersionResource.getResource(),
              apiClient);
      return api;
    }

    public T apiClient(ApiClient apiClient) {
      this.apiClient = apiClient;
      return (T) this;
    }

    public T skipDiscovery() {
      this.skipDiscovery = true;
      return (T) this;
    }
  }

  abstract static class ResourceBuilder<
          ApiType extends KubernetesObject, T extends ResourceBuilder<ApiType, T>>
      extends NamespacedApiClientBuilder<T> {
    final Class<ApiType> apiTypeClass;
    String name;

    ResourceBuilder(Class<ApiType> apiTypeClass) {
      this.apiTypeClass = apiTypeClass;
    }

    public T name(String name) {
      this.name = name;
      return (T) this;
    }

    protected GenericKubernetesApi<ApiType, KubernetesListObject> getGenericApi()
        throws KubectlException {
      return getGenericApi(apiTypeClass, KubernetesListObject.class);
    }

    protected boolean isNamespaced(KubernetesObject obj) {
      if (obj instanceof DynamicKubernetesObject) {
        // This is slightly hacky, but for now CRD objects are all namespaced.
        return true;
      } else {
        return ModelMapper.isNamespaced(obj.getClass());
      }
    }

    protected GenericKubernetesApi<? extends KubernetesObject, ? extends KubernetesListObject>
        getGenericApi(KubernetesObject targetObj) throws KubectlException {
      if (targetObj instanceof DynamicKubernetesObject) {
        DynamicKubernetesObject obj = (DynamicKubernetesObject) targetObj;
        GroupVersionKind gvk =
            ModelMapper.groupVersionKindFromApiVersionAndKind(obj.getApiVersion(), obj.getKind());
        Discovery.APIResource rsrc = ModelMapper.findApiResourceByGroupVersionKind(gvk);
        String plural = rsrc == null ? obj.getKind() + "s" /* hack! */ : rsrc.getResourcePlural();
        return new GenericKubernetesApi<DynamicKubernetesObject, DynamicKubernetesListObject>(
            DynamicKubernetesObject.class,
            DynamicKubernetesListObject.class,
            gvk.getGroup(),
            gvk.getVersion(),
            plural,
            apiClient);
      }
      return getGenericApi();
    }
  }

  abstract static class ResourceAndContainerBuilder<
          ApiType extends KubernetesObject, T extends ResourceAndContainerBuilder<ApiType, T>>
      extends ResourceBuilder<ApiType, T> {
    String container;

    ResourceAndContainerBuilder(Class<ApiType> apiTypeClass) {
      super(apiTypeClass);
    }

    public T container(String container) {
      this.container = container;
      return (T) this;
    }
  }
}
