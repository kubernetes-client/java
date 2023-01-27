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
package io.kubernetes.client.util.generic;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.gson.Gson;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubernetesApiResponseTest {
  @Rule public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().dynamicPort());

  private GenericKubernetesApi<V1Pod, V1PodList> podClient;

  @Before
  public void setup() throws IOException {
    ApiClient apiClient =
        new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
    podClient =
        new GenericKubernetesApi<>(V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);
  }

  @Test
  public void testErrorStatusHandler() throws ApiException {
    V1Status forbiddenStatus = new V1Status().code(403).message("Forbidden");
    wireMockRule.stubFor(
        delete(urlEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(aResponse().withStatus(403).withBody(new Gson().toJson(forbiddenStatus))));
    AtomicBoolean catched = new AtomicBoolean(false);
    assertNull(
        podClient
            .delete("default", "foo")
            .onFailure(
                (code, errStatus) -> {
                  catched.set(true);
                })
            .getObject());
    assertTrue(catched.get());
  }

  @Test
  public void testNotDeserializableResponse() {
    String message = "-foobar";
    wireMockRule.stubFor(
        get(urlEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(aResponse().withStatus(403).withBody(message)));
    KubernetesApiResponse response = podClient.get("default", "foo");
    assertFalse(response.isSuccess());
    assertEquals(response.getStatus().getMessage(), message);
  }
}
