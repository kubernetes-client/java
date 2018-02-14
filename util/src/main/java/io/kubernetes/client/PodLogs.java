/*
Copyright 2017 The Kubernetes Authors.
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

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Response;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import java.io.IOException;
import java.io.InputStream;

/** Utility class offering streaming access to Pod logs. */
public class PodLogs {
  private ApiClient apiClient;
  private CoreV1Api coreClient;

  /** Simple PodLogs API constructor, uses default configuration */
  public PodLogs() {
    this(Configuration.getDefaultApiClient());
  }

  /**
   * PodLogs API Constructor
   *
   * @param apiClient The api client to use.
   */
  public PodLogs(ApiClient apiClient) {
    this.apiClient = apiClient;
    this.coreClient = new CoreV1Api(apiClient);
  }

  /**
   * Get the API client for these Logs operations.
   *
   * @return The API client that will be used.
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  public InputStream streamNamespacedPodLog(V1Pod pod) throws ApiException, IOException {
    return streamNamespacedPodLog(
        pod.getMetadata().getNamespace(),
        pod.getMetadata().getName(),
        pod.getSpec().getContainers().get(0).getName());
  }

  // Important note. You must close this stream or else you can leak connections.
  public InputStream streamNamespacedPodLog(String namespace, String name, String container)
      throws ApiException, IOException {
    return streamNamespacedPodLog(namespace, name, container, null, null, false);
  }

  // Important note. You must close this stream or else you can leak connections.
  public InputStream streamNamespacedPodLog(
      String namespace,
      String name,
      String container,
      Integer sinceSeconds,
      Integer tailLines,
      boolean timestamps)
      throws ApiException, IOException {
    Call call =
        coreClient.readNamespacedPodLogCall(
            name,
            namespace,
            container,
            true,
            null,
            "false",
            false,
            sinceSeconds,
            tailLines,
            timestamps,
            null,
            null);
    Response response = call.execute();
    if (!response.isSuccessful()) {
      throw new ApiException("Logs request failed: " + response.code());
    }
    return response.body().byteStream();
  }
}
