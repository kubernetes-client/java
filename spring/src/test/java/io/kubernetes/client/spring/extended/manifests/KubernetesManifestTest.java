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
package io.kubernetes.client.spring.extended.manifests;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.common.io.Resources;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1ServiceAccount;
import io.kubernetes.client.spring.extended.manifests.annotation.KubectlCreate;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(KubernetesManifestTest.TestConfig.class)
public class KubernetesManifestTest {

  private static final String DISCOVERY_API = Resources.getResource("discovery-api.json").getPath();

  private static final String DISCOVERY_APIV1 =
      Resources.getResource("discovery-api-v1.json").getPath();

  private static final String DISCOVERY_APIS =
      Resources.getResource("discovery-apis.json").getPath();

  @ClassRule public static WireMockRule wireMockRule = new WireMockRule(8288);

  @TestConfiguration
  static class TestConfig {

    @Bean
    public ApiClient testingApiClient() {
      ApiClient apiClient = new ClientBuilder().setBasePath(wireMockRule.baseUrl()).build();
      return apiClient;
    }

    @Bean
    public KubernetesKubectlCreateProcessor kubernetesManifestsProcessor() {
      return new KubernetesKubectlCreateProcessor();
    }

    @Bean
    @KubectlCreate
    public V1Namespace testNamespace() {
      return new V1Namespace().metadata(new V1ObjectMeta().name("spring-boot-test-namespace"));
    }

    @Bean
    @KubectlCreate
    public V1ServiceAccount testServiceAccount(
        V1Namespace testNamespace) { // depends on testNamespace
      return new V1ServiceAccount()
          .metadata(
              new V1ObjectMeta()
                  .namespace(testNamespace.getMetadata().getName())
                  .name("spring-boot-test-serviceaccount"));
    }
  }

  @Autowired private ApiClient client;

  @Autowired private V1Namespace createdNamespace;

  @Autowired private V1ServiceAccount createdServiceAccount;

  private static final V1Namespace returningCreatedNamespace =
      new V1Namespace()
          .metadata(
              new V1ObjectMeta()
                  .name("spring-boot-test-namespace")
                  .putLabelsItem("created", "true"));

  private static final V1ServiceAccount returningCreatedServiceAccount =
      new V1ServiceAccount()
          .metadata(
              new V1ObjectMeta()
                  .name("spring-boot-test-serviceaccount")
                  .putLabelsItem("created", "true"));

  static {
    wireMockRule.resetMappings();
    wireMockRule.resetScenarios();
    wireMockRule.resetRequests();
    wireMockRule.stubFor(
        post(urlEqualTo("/api/v1/namespaces"))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        Configuration.getDefaultApiClient()
                            .getJSON()
                            .serialize(returningCreatedNamespace))));
    wireMockRule.stubFor(
        post(urlEqualTo("/api/v1/namespaces/spring-boot-test-namespace/serviceaccounts"))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        Configuration.getDefaultApiClient()
                            .getJSON()
                            .serialize(returningCreatedServiceAccount))));

    try {
      wireMockRule.stubFor(
          get(urlPathEqualTo("/api"))
              .willReturn(
                  aResponse()
                      .withStatus(200)
                      .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_API))))));
      wireMockRule.stubFor(
          get(urlPathEqualTo("/apis"))
              .willReturn(
                  aResponse()
                      .withStatus(200)
                      .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIS))))));
      wireMockRule.stubFor(
          get(urlPathEqualTo("/api/v1"))
              .willReturn(
                  aResponse()
                      .withStatus(200)
                      .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIV1))))));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test() {
    assertNotNull(createdNamespace);
    assertNotNull(createdServiceAccount);

    assertEquals("true", createdNamespace.getMetadata().getLabels().get("created"));
    assertEquals("true", createdServiceAccount.getMetadata().getLabels().get("created"));
  }
}
