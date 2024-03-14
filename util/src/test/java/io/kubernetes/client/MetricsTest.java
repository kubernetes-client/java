/*
Copyright 2021 The Kubernetes Authors.
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

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class MetricsTest {

  private ApiClient client;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @BeforeEach
  void setup() {
    client = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
  }

  @Test
  void getPodMetricsThrowsAPIExceptionWhenServerReturnsError() {
    String namespace = "default";
    Metrics metrics = new Metrics(client);
    apiServer.stubFor(
        get(urlPathMatching("^/apis/metrics.k8s.io/v1beta1/namespaces/" + namespace + "/pods.*"))
            .willReturn(
                aResponse()
                    .withStatus(503)
                    .withHeader("Content-Type", "text/plain")
                    .withBody("Service Unavailable")));
    try {
      metrics.getPodMetrics(namespace);
      failBecauseExceptionWasNotThrown(ApiException.class);
    } catch (ApiException ex) {
      assertThat(ex.getCode()).isEqualTo(503);
    }
  }

  @Test
  void getNodeMetricsThrowsAPIExceptionWhenServerReturnsError() {
    Metrics metrics = new Metrics(client);
    apiServer.stubFor(
        get(urlPathMatching("^/apis/metrics.k8s.io/v1beta1/nodes.*"))
            .willReturn(
                aResponse()
                    .withStatus(503)
                    .withHeader("Content-Type", "text/plain")
                    .withBody("Service Unavailable")));
    try {
      metrics.getNodeMetrics();
      failBecauseExceptionWasNotThrown(ApiException.class);
    } catch (ApiException ex) {
      assertThat(ex.getCode()).isEqualTo(503);
    }
  }
}
