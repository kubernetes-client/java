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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MetricsTest {

  private ApiClient client;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort());

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
  }

  @Test
  public void getPodMetricsThrowsAPIExceptionWhenServerReturnsError() {
    String namespace = "default";
    Metrics metrics = new Metrics(client);
    wireMockRule.stubFor(
        get(urlPathMatching("^/apis/metrics.k8s.io/v1beta1/namespaces/" + namespace + "/pods.*"))
            .willReturn(
                aResponse()
                    .withStatus(503)
                    .withHeader("Content-Type", "text/plain")
                    .withBody("Service Unavailable")));
    try {
      metrics.getPodMetrics(namespace);
      fail("Expected ApiException to be thrown");
    } catch (ApiException ex) {
      assertEquals(503, ex.getCode());
    }
  }

  @Test
  public void getNodeMetricsThrowsAPIExceptionWhenServerReturnsError() {
    Metrics metrics = new Metrics(client);
    wireMockRule.stubFor(
        get(urlPathMatching("^/apis/metrics.k8s.io/v1beta1/nodes.*"))
            .willReturn(
                aResponse()
                    .withStatus(503)
                    .withHeader("Content-Type", "text/plain")
                    .withBody("Service Unavailable")));
    try {
      metrics.getNodeMetrics();
      fail("Expected ApiException to be thrown");
    } catch (ApiException ex) {
      assertEquals(503, ex.getCode());
    }
  }
}
