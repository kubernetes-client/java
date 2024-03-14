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
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.google.gson.Gson;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.ClientBuilder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class KubernetesApiResponseTest {
  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

  private GenericKubernetesApi<V1Pod, V1PodList> podClient;

  @BeforeEach
  void setup() {
    ApiClient apiClient =
        new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
    podClient =
        new GenericKubernetesApi<>(V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);
  }

  @Test
  void errorStatusHandler() throws ApiException {
    V1Status forbiddenStatus = new V1Status().code(403).message("Forbidden");
    apiServer.stubFor(
        delete(urlEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(aResponse().withStatus(403).withBody(new Gson().toJson(forbiddenStatus))));
    AtomicBoolean catched = new AtomicBoolean(false);
    assertThat(
        podClient
            .delete("default", "foo")
            .onFailure(
                (code, errStatus) -> {
                  catched.set(true);
                })
            .getObject()).isNull();
    assertThat(catched).isTrue();
  }

  @Test
  void notDeserializableResponse() {
    String message = "-foobar";
    apiServer.stubFor(
        get(urlEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(aResponse().withStatus(403).withBody(message)));
    KubernetesApiResponse response = podClient.get("default", "foo");
    assertThat(response.isSuccess()).isFalse();
    assertThat(message).isEqualTo(response.getStatus().getMessage());
  }
}
