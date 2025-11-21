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
package io.kubernetes.client.util;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.ClientBuilder;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

/** Test for Yaml.createResource() functionality */
class YamlCreateResourceTest {

  private static final String DISCOVERY_API =
      new File(
              YamlCreateResourceTest.class
                  .getClassLoader()
                  .getResource("discovery-api.json")
                  .getPath())
          .toString();

  private static final String DISCOVERY_APIV1 =
      new File(
              YamlCreateResourceTest.class
                  .getClassLoader()
                  .getResource("discovery-api-v1.json")
                  .getPath())
          .toString();

  private static final String DISCOVERY_APIS =
      new File(
              YamlCreateResourceTest.class
                  .getClassLoader()
                  .getResource("discovery-apis-with-apps.json")
                  .getPath())
          .toString();

  private static final String DISCOVERY_APPS_V1 =
      new File(
              YamlCreateResourceTest.class
                  .getClassLoader()
                  .getResource("discovery-apps-v1.json")
                  .getPath())
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
  void createConfigMapFromYaml() throws IOException, ApiException {
    String configMapYaml =
        "apiVersion: v1\n"
            + "kind: ConfigMap\n"
            + "metadata:\n"
            + "  name: test-config\n"
            + "  namespace: default\n"
            + "data:\n"
            + "  key1: value1\n";

    apiServer.stubFor(
        post(urlPathEqualTo("/api/v1/namespaces/default/configmaps"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"apiVersion\":\"v1\",\"kind\":\"ConfigMap\","
                            + "\"metadata\":{\"name\":\"test-config\",\"namespace\":\"default\"},"
                            + "\"data\":{\"key1\":\"value1\"}}")));
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

    Object result = Yaml.createResource(apiClient, configMapYaml);

    apiServer.verify(1, postRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/configmaps")));
    assertThat(result).isNotNull();
    assertThat(result).isInstanceOf(V1ConfigMap.class);

    V1ConfigMap configMap = (V1ConfigMap) result;
    assertThat(configMap.getMetadata().getName()).isEqualTo("test-config");
    assertThat(configMap.getMetadata().getNamespace()).isEqualTo("default");
    assertThat(configMap.getData()).containsEntry("key1", "value1");
  }

  @Test
  void createPodFromYaml() throws IOException, ApiException {
    String podYaml =
        "apiVersion: v1\n"
            + "kind: Pod\n"
            + "metadata:\n"
            + "  name: test-pod\n"
            + "  namespace: default\n"
            + "spec:\n"
            + "  containers:\n"
            + "  - name: nginx\n"
            + "    image: nginx:latest\n";

    apiServer.stubFor(
        post(urlPathEqualTo("/api/v1/namespaces/default/pods"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"apiVersion\":\"v1\",\"kind\":\"Pod\","
                            + "\"metadata\":{\"name\":\"test-pod\",\"namespace\":\"default\"},"
                            + "\"spec\":{\"containers\":[{\"name\":\"nginx\",\"image\":\"nginx:latest\"}]}}")));
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

    Object result = Yaml.createResource(apiClient, podYaml);

    apiServer.verify(1, postRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods")));
    assertThat(result).isNotNull();
    assertThat(result).isInstanceOf(V1Pod.class);

    V1Pod pod = (V1Pod) result;
    assertThat(pod.getMetadata().getName()).isEqualTo("test-pod");
    assertThat(pod.getMetadata().getNamespace()).isEqualTo("default");
  }

  @Test
  void createDeploymentFromYaml() throws IOException, ApiException {
    String deploymentYaml =
        "apiVersion: apps/v1\n"
            + "kind: Deployment\n"
            + "metadata:\n"
            + "  name: test-deployment\n"
            + "  namespace: default\n"
            + "spec:\n"
            + "  replicas: 3\n"
            + "  selector:\n"
            + "    matchLabels:\n"
            + "      app: test\n"
            + "  template:\n"
            + "    metadata:\n"
            + "      labels:\n"
            + "        app: test\n"
            + "    spec:\n"
            + "      containers:\n"
            + "      - name: nginx\n"
            + "        image: nginx:latest\n";

    apiServer.stubFor(
        post(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"apiVersion\":\"apps/v1\",\"kind\":\"Deployment\","
                            + "\"metadata\":{\"name\":\"test-deployment\",\"namespace\":\"default\"},"
                            + "\"spec\":{\"replicas\":3,\"selector\":{\"matchLabels\":{\"app\":\"test\"}},"
                            + "\"template\":{\"metadata\":{\"labels\":{\"app\":\"test\"}},"
                            + "\"spec\":{\"containers\":[{\"name\":\"nginx\",\"image\":\"nginx:latest\"}]}}}}")));
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
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APPS_V1))))));

    Object result = Yaml.createResource(apiClient, deploymentYaml);

    apiServer.verify(
        1, postRequestedFor(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments")));
    assertThat(result).isNotNull();
    assertThat(result).isInstanceOf(V1Deployment.class);

    V1Deployment deployment = (V1Deployment) result;
    assertThat(deployment.getMetadata().getName()).isEqualTo("test-deployment");
    assertThat(deployment.getMetadata().getNamespace()).isEqualTo("default");
  }
}
