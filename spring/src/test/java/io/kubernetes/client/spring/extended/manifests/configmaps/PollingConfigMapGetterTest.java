/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.spring.extended.manifests.configmaps;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.test.util.ReflectionTestUtils;

class PollingConfigMapGetterTest {

  @RegisterExtension
  static WireMockExtension firstServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @RegisterExtension
  static WireMockExtension secondServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @Test
  void cachesAreIsolatedBetweenClients() {
    String path = "/api/v1/namespaces/default/configmaps/shared";
    V1ConfigMap firstConfigMap =
        new V1ConfigMap()
            .metadata(new V1ObjectMeta().namespace("default").name("shared"))
            .putDataItem("cluster", "first");
    V1ConfigMap secondConfigMap =
        new V1ConfigMap()
            .metadata(new V1ObjectMeta().namespace("default").name("shared"))
            .putDataItem("cluster", "second");
    firstServer.stubFor(
        get(urlPathEqualTo(path))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(JSON.serialize(firstConfigMap))));
    secondServer.stubFor(
        get(urlPathEqualTo(path))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(JSON.serialize(secondConfigMap))));

    PollingConfigMapGetter firstGetter = new PollingConfigMapGetter();
    PollingConfigMapGetter secondGetter = new PollingConfigMapGetter();
    ReflectionTestUtils.setField(
        firstGetter, "apiClient", new ApiClient().setBasePath(firstServer.baseUrl()));
    ReflectionTestUtils.setField(
        secondGetter, "apiClient", new ApiClient().setBasePath(secondServer.baseUrl()));

    V1ConfigMap firstResult = firstGetter.get("default", "shared");
    V1ConfigMap secondResult = secondGetter.get("default", "shared");
    assertThat(firstResult).isEqualTo(firstConfigMap);
    assertThat(secondResult).isEqualTo(secondConfigMap);
    assertThat(firstGetter.get("default", "shared")).isSameAs(firstResult);
    assertThat(secondGetter.get("default", "shared")).isSameAs(secondResult);
    firstServer.verify(1, getRequestedFor(urlPathEqualTo(path)));
    secondServer.verify(1, getRequestedFor(urlPathEqualTo(path)));
  }
}
