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
package io.kubernetes.client.extended.kubectl;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class KubectlCreateTest {

  private static final String DISCOVERY_API =
      new File(KubectlCreateTest.class.getClassLoader().getResource("discovery-api.json").getPath())
          .toString();

  private static final String DISCOVERY_APIV1 =
      new File(
              KubectlCreateTest.class
                  .getClassLoader()
                  .getResource("discovery-api-v1.json")
                  .getPath())
          .toString();

  private static final String DISCOVERY_APIS =
      new File(
              KubectlCreateTest.class.getClassLoader().getResource("discovery-apis.json").getPath())
          .toString();

  private ApiClient apiClient;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

  @BeforeEach
  void setup() {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
  }

  @Test
  void createConfigMap() throws KubectlException, IOException {
    apiServer.stubFor(
        post(urlPathEqualTo("/api/v1/namespaces/foo/configmaps"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"bar\",\"namespace\":\"foo\"}}")));
    apiServer.stubFor(
        get(urlPathEqualTo("/api"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_API))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/apis"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIS))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIV1))))));

    V1ConfigMap configMap =
        (V1ConfigMap)
            Kubectl.create(V1ConfigMap.class)
                .apiClient(apiClient)
                .resource(
                    new V1ConfigMap()
                        .apiVersion("v1")
                        .metadata(new V1ObjectMeta().namespace("foo").name("bar"))
                        .data(
                            new HashMap<String, String>() {
                              {
                                put("key1", "value1");
                              }
                            }))
                .execute();
    apiServer.verify(1, postRequestedFor(urlPathEqualTo("/api/v1/namespaces/foo/configmaps")));
    assertThat(configMap).isNotNull();
  }
}
