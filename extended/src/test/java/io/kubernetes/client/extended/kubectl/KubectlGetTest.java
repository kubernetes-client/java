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

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class KubectlGetTest {

  private ApiClient apiClient;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

  @BeforeEach
  void setup() {
    ModelMapper.addModelMap("", "v1", "Pod", "pods", true, V1Pod.class);
    ModelMapper.addModelMap("", "v1", "Node", "nodes", false, V1Node.class);
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
  }

  @Test
  void getAllNamespacePods() throws KubectlException {
    V1PodList podList =
        new V1PodList()
            .items(
                Arrays.asList(
                    new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo1")),
                    new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo2"))));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
            .willReturn(
                aResponse().withStatus(200).withBody(apiClient.getJSON().serialize(podList))));

    List<V1Pod> pods = Kubectl.get(V1Pod.class).apiClient(apiClient).skipDiscovery().execute();

    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/pods")));
    assertThat(pods).hasSize(2);
  }

  @Test
  void getDefaultNamespacePods() throws KubectlException {
    V1PodList podList =
        new V1PodList()
            .items(
                Arrays.asList(
                    new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo1")),
                    new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo2"))));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/pods"))
            .willReturn(
                aResponse().withStatus(200).withBody(apiClient.getJSON().serialize(podList))));

    List<V1Pod> pods =
        Kubectl.get(V1Pod.class)
            .apiClient(apiClient)
            .skipDiscovery()
            .namespace("default")
            .execute();

    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods")));
    assertThat(pods).hasSize(2);
  }

  @Test
  void getDefaultNamespaceOnePod() throws KubectlException {
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1"))
            .willReturn(aResponse().withStatus(200).withBody(apiClient.getJSON().serialize(pod))));

    Kubectl.get(V1Pod.class)
        .apiClient(apiClient)
        .skipDiscovery()
        .namespace("default")
        .name("foo1")
        .execute();

    Kubectl.get(V1Pod.class)
        .apiClient(apiClient)
        .skipDiscovery()
        .name("foo1")
        .namespace("default")
        .execute();

    apiServer.verify(2, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1")));
  }

  @Test
  void getDefaultNamespaceOnePodForbiddenShouldThrowException() {
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1"))
            .willReturn(
                aResponse()
                    .withStatus(403)
                    .withBody(apiClient.getJSON().serialize(new V1Status().code(403)))));
    try {
      Kubectl.get(V1Pod.class)
          .apiClient(apiClient)
          .skipDiscovery()
          .namespace("default") // no namespace specified
          .name("foo1")
          .execute();
      failBecauseExceptionWasNotThrown(KubectlException.class);
    } catch (KubectlException e) {
      assertThat(e).hasCauseInstanceOf(ApiException.class);
    } finally {
      apiServer.verify(
          1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1")));
    }
  }

  @Test
  void getAllNodes() throws KubectlException {
    V1NodeList nodeList =
        new V1NodeList()
            .items(
                Arrays.asList(
                    new V1Node().metadata(new V1ObjectMeta().name("foo1")),
                    new V1Node().metadata(new V1ObjectMeta().name("foo2"))));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/nodes"))
            .willReturn(
                aResponse().withStatus(200).withBody(apiClient.getJSON().serialize(nodeList))));

    List<V1Node> nodes = Kubectl.get(V1Node.class).apiClient(apiClient).skipDiscovery().execute();

    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/nodes")));
    assertThat(nodes).hasSize(2);
  }

  @Test
  void getOneNode() throws KubectlException {
    V1Node node = new V1Node().metadata(new V1ObjectMeta().name("foo1"));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/nodes/foo1"))
            .willReturn(aResponse().withStatus(200).withBody(apiClient.getJSON().serialize(node))));

    V1Node getNode =
        Kubectl.get(V1Node.class).apiClient(apiClient).skipDiscovery().name("foo1").execute();

    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/nodes/foo1")));
    assertThat(getNode).isEqualTo(node);
  }
}
