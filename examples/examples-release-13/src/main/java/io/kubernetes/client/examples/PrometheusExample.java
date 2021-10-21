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
package io.kubernetes.client.examples;

import io.kubernetes.client.monitoring.Monitoring;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.Config;
import java.io.IOException;

/**
 * A simple example of how to use the Java API with Prometheus metrics
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.PrometheusExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class PrometheusExample {
  public static void main(String[] args) throws IOException, ApiException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    // Install an HTTP Interceptor that adds metrics
    Monitoring.installMetrics(client);

    // Install a simple HTTP server to serve prometheus metrics. If you already are serving
    // metrics elsewhere, this is unnecessary.
    Monitoring.startMetricsServer("localhost", 8080);

    CoreV1Api api = new CoreV1Api();

    while (true) {
      // A request that should return 200
      V1PodList list =
          api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null, null);
      // A request that should return 404
      try {
        V1Pod pod = api.readNamespacedPod("foo", "bar", null);
      } catch (ApiException ex) {
        if (ex.getCode() != 404) {
          throw ex;
        }
      }
      try {
        Thread.sleep(10000);
      } catch (InterruptedException ex) {
        ex.printStackTrace();
      }
    }
  }
}
