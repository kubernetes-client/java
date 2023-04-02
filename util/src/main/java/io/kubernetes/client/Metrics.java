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
package io.kubernetes.client;

import io.kubernetes.client.custom.NodeMetrics;
import io.kubernetes.client.custom.NodeMetricsList;
import io.kubernetes.client.custom.PodMetrics;
import io.kubernetes.client.custom.PodMetricsList;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.generic.GenericKubernetesApi;

public class Metrics {
  private ApiClient apiClient;

  /** Simple Metrics API constructor, uses default configuration */
  public Metrics() {
    this(Configuration.getDefaultApiClient());
  }

  /**
   * Metrics API Constructor
   *
   * @param apiClient The api client to use.
   */
  public Metrics(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client for these Attach operations.
   *
   * @return The API client that will be used.
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client for subsequent Attach operations.
   *
   * @param apiClient The new API client to use.
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public NodeMetricsList getNodeMetrics() throws ApiException {
    GenericKubernetesApi<NodeMetrics, NodeMetricsList> metricsClient =
        new GenericKubernetesApi<>(
            NodeMetrics.class,
            NodeMetricsList.class,
            "metrics.k8s.io",
            "v1beta1",
            "nodes",
            apiClient);
    return metricsClient.list().throwsApiException().getObject();
  }

  public PodMetricsList getPodMetrics(String namespace) throws ApiException {
    GenericKubernetesApi<PodMetrics, PodMetricsList> metricsClient =
        new GenericKubernetesApi<>(
            PodMetrics.class, PodMetricsList.class, "metrics.k8s.io", "v1beta1", "pods", apiClient);
    return metricsClient.list(namespace).throwsApiException().getObject();
  }
}
