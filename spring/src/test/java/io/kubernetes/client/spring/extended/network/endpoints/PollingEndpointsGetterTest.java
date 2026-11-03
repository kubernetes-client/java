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
package io.kubernetes.client.spring.extended.network.endpoints;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1EndpointAddress;
import io.kubernetes.client.openapi.models.V1EndpointSubset;
import io.kubernetes.client.openapi.models.V1Endpoints;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class PollingEndpointsGetterTest {

  @RegisterExtension
  static WireMockExtension firstServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @RegisterExtension
  static WireMockExtension secondServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @Test
  void cachesAreIsolatedBetweenClients() {
    String path = "/api/v1/namespaces/default/endpoints/shared";
    V1Endpoints firstEndpoints =
        new V1Endpoints()
            .metadata(new V1ObjectMeta().namespace("default").name("shared"))
            .addSubsetsItem(
                new V1EndpointSubset()
                    .addAddressesItem(new V1EndpointAddress().ip("10.0.0.1")));
    V1Endpoints secondEndpoints =
        new V1Endpoints()
            .metadata(new V1ObjectMeta().namespace("default").name("shared"))
            .addSubsetsItem(
                new V1EndpointSubset()
                    .addAddressesItem(new V1EndpointAddress().ip("10.0.0.2")));
    firstServer.stubFor(
        get(urlPathEqualTo(path))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(JSON.serialize(firstEndpoints))));
    secondServer.stubFor(
        get(urlPathEqualTo(path))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(JSON.serialize(secondEndpoints))));

    PollingEndpointsGetter firstGetter =
        new PollingEndpointsGetter(new ApiClient().setBasePath(firstServer.baseUrl()));
    PollingEndpointsGetter secondGetter =
        new PollingEndpointsGetter(new ApiClient().setBasePath(secondServer.baseUrl()));

    V1Endpoints firstResult = firstGetter.get("default", "shared");
    V1Endpoints secondResult = secondGetter.get("default", "shared");
    assertThat(firstResult).isEqualTo(firstEndpoints);
    assertThat(secondResult).isEqualTo(secondEndpoints);
    assertThat(firstGetter.get("default", "shared")).isSameAs(firstResult);
    assertThat(secondGetter.get("default", "shared")).isSameAs(secondResult);
    firstServer.verify(1, getRequestedFor(urlPathEqualTo(path)));
    secondServer.verify(1, getRequestedFor(urlPathEqualTo(path)));
  }
}
