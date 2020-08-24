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

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;

/**
 * Kubectl provides a set of helper functions that has the same functionalities as corresponding
 * kubectl commands.
 */
public class Kubectl {

  /**
   * Equivalent for `kubectl create`
   *
   * @return the kubectl create
   */
  public static KubectlCreate create() {
    return new KubectlCreate();
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

  /*
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

  abstract static class ApiClientBuilder<T extends ApiClientBuilder> {

    ApiClient apiClient = Configuration.getDefaultApiClient();

    public T apiClient(ApiClient apiClient) {
      this.apiClient = apiClient;
      return (T) this;
    }
  }

  abstract static class ResourceBuilder<
          ApiType extends KubernetesObject, T extends ResourceBuilder<ApiType, T>>
      extends ApiClientBuilder<T> {
    final Class<ApiType> apiTypeClass;
    String namespace;
    String name;
    String apiGroup;
    String apiVersion;
    String resourceNamePlural;

    ResourceBuilder(Class<ApiType> apiTypeClass) {
      this.apiTypeClass = apiTypeClass;
    }

    public T name(String name) {
      this.name = name;
      return (T) this;
    }

    public T namespace(String namespace) {
      this.namespace = namespace;
      return (T) this;
    }

    public T apiGroup(String apiGroup) {
      this.apiGroup = apiGroup;
      return (T) this;
    }

    public T apiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
      return (T) this;
    }

    public T resourceNamePlural(String resourceNamePlural) {
      this.resourceNamePlural = resourceNamePlural;
      return (T) this;
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
