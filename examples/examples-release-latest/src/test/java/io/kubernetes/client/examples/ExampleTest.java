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

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class ExampleTest {
  private static final int PORT = 8089;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(WireMockConfiguration.options().port(PORT)).build();

  @Test
  void exactUrlOnly() throws ApiException {
    ApiClient client = new ApiClient();
    client.setBasePath("http://localhost:" + PORT);
    Configuration.setDefaultApiClient(client);

    V1Namespace ns1 = new V1Namespace().metadata(new V1ObjectMeta().name("name"));

    apiServer.stubFor(
        get(urlEqualTo("/api/v1/namespaces/name"))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(client.getJSON().serialize(ns1))));

    CoreV1Api api = new CoreV1Api();
    V1Namespace ns2 = api.readNamespace("name").execute();
    assertEquals(ns1, ns2);
  }
}
