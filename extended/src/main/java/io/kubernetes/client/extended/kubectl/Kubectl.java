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
   * Equivalence for `kubectl label`.
   *
   * @param <ApiType> the target api type
   * @param apiTypeClass the api type class
   * @return the kubectl label
   */
  public static <ApiType extends KubernetesObject> KubectlLabel<ApiType> label(
      Class<ApiType> apiTypeClass) {
    return label(Configuration.getDefaultApiClient(), apiTypeClass);
  }

  /**
   * Equivalence for `kubectl label`.
   *
   * @param <ApiType> the target api type
   * @param apiClient the api client instance
   * @param apiTypeClass the api type class
   * @return the kubectl label
   */
  public static <ApiType extends KubernetesObject> KubectlLabel<ApiType> label(
      ApiClient apiClient, Class<ApiType> apiTypeClass) {
    return new KubectlLabel<>(apiClient, apiTypeClass);
  }

  /**
   * Equivalence for `kubectl version`.
   *
   * @return the kubectl version
   */
  public static KubectlVersion version() {
    return version(Configuration.getDefaultApiClient());
  }

  /**
   * Equivalence for `kubectl version`.
   *
   * @param apiClient the api client instance
   * @return the kubectl version
   */
  public static KubectlVersion version(ApiClient apiClient) {
    return new KubectlVersion(apiClient);
  }

  /**
   * Executable executes a kubectl helper.
   *
   * @param <OUTPUT> the type parameter
   */
  public interface Executable<OUTPUT> {

    /**
     * Run and retrieve the output from the kubectl helpers.
     *
     * @return the output, can be Void
     * @throws KubectlException the kubectl exception
     */
    OUTPUT execute() throws KubectlException;
  }
}
