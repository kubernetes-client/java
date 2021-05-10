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
import static com.github.tomakehurst.wiremock.client.WireMock.patch;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1ServiceAccount;
import io.kubernetes.client.spring.extended.manifests.annotation.KubectlApply;
import io.kubernetes.client.spring.extended.manifests.annotation.KubectlCreate;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KubernetesManifestTest {

  private static final Resource DISCOVERY_API = new ClassPathResource("discovery-api.json");

  private static final Resource DISCOVERY_APIV1 = new ClassPathResource("discovery-api-v1.json");

  private static final Resource DISCOVERY_APIS = new ClassPathResource("discovery-apis.json");

  @ClassRule public static WireMockRule wireMockRule = new WireMockRule(8288);

  @SpringBootConfiguration
  static class App {
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

    @Bean
    public KubernetesKubectlApplyProcessor kubernetesApplyManifestsProcessor() {
      return new KubernetesKubectlApplyProcessor();
    }

    @Bean
    @KubectlApply
    public V1Pod testApplyPod(V1Namespace testNamespace) {
      return new V1Pod()
          .metadata(
              new V1ObjectMeta()
                  .namespace(testNamespace.getMetadata().getName())
                  .name("spring-boot-test-pod"));
    }
  }

  @Autowired private ApiClient client;

  @Autowired private V1Namespace createdNamespace;

  @Autowired private V1ServiceAccount createdServiceAccount;

  @Autowired private V1Pod createdPod;

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

  private static final V1Pod returningCreatedPod =
      new V1Pod()
          .metadata(
              new V1ObjectMeta()
                  .name("spring-boot-test-pod")
                  .namespace("spring-boot-test-namespace")
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

    wireMockRule.stubFor(
        patch(
                urlEqualTo(
                    "/api/v1/namespaces/spring-boot-test-namespace/pods/spring-boot-test-pod?fieldManager=kubernetes-java-kubectl-apply&force=false"))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        Configuration.getDefaultApiClient()
                            .getJSON()
                            .serialize(returningCreatedPod))));

    try {
      wireMockRule.stubFor(
          get(urlPathEqualTo("/api"))
              .willReturn(
                  aResponse()
                      .withStatus(200)
                      .withBody(
                          new String(Files.readAllBytes(Paths.get(DISCOVERY_API.getURI()))))));
      wireMockRule.stubFor(
          get(urlPathEqualTo("/apis"))
              .willReturn(
                  aResponse()
                      .withStatus(200)
                      .withBody(
                          new String(Files.readAllBytes(Paths.get(DISCOVERY_APIS.getURI()))))));
      wireMockRule.stubFor(
          get(urlPathEqualTo("/api/v1"))
              .willReturn(
                  aResponse()
                      .withStatus(200)
                      .withBody(
                          new String(Files.readAllBytes(Paths.get(DISCOVERY_APIV1.getURI()))))));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test() {
    assertNotNull(createdNamespace);
    assertNotNull(createdServiceAccount);
    assertNotNull(createdPod);

    assertEquals("true", createdNamespace.getMetadata().getLabels().get("created"));
    assertEquals("true", createdServiceAccount.getMetadata().getLabels().get("created"));
    assertEquals("true", createdPod.getMetadata().getLabels().get("created"));
  }
}
