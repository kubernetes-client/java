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
package io.kubernetes.client.monitoring;

import io.kubernetes.client.openapi.ApiClient;
import io.prometheus.client.exporter.HTTPServer;
import java.io.IOException;

public class Monitoring {
  public static void startMetricsServer(int port) throws IOException {
    new HTTPServer(port);
  }

  public static void startMetricsServer(String host, int port) throws IOException {
    new HTTPServer(host, port);
  }

  public static void installMetrics(ApiClient client) throws IOException {
    client.setHttpClient(
        client.getHttpClient().newBuilder().addInterceptor(new PrometheusInterceptor()).build());
  }
}
