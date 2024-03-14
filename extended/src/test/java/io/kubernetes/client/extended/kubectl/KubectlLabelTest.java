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
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath;
import static com.github.tomakehurst.wiremock.client.WireMock.put;
import static com.github.tomakehurst.wiremock.client.WireMock.putRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class KubectlLabelTest {

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
  void kubectlLabelNamespacedResourceShouldWork() throws KubectlException {
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    apiServer.stubFor(
        put(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withRequestBody(
                matchingJsonPath(
                    "$.metadata.labels", equalToJson("{ \"k1\": \"v1\", \"k2\": \"v2\" }")))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    V1Pod labelledPod =
        Kubectl.label(V1Pod.class)
            .apiClient(apiClient)
            .skipDiscovery()
            .namespace("default")
            .name("foo")
            .addLabel("k1", "v1")
            .addLabel("k2", "v2")
            .execute();
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
    apiServer.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
    assertThat(labelledPod).isNotNull();
  }

  @Test
  void kubectlDeleteLabelNamespacedResourceShouldWork() throws KubectlException {
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    apiServer.stubFor(
        put(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withRequestBody(
                matchingJsonPath("$.metadata.labels", equalToJson("{}")))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));

    V1Pod unlabelledPod =
        Kubectl.label(V1Pod.class)
            .apiClient(apiClient)
            .skipDiscovery()
            .namespace("default")
            .name("foo")
            .deleteLabel("k1")
            .execute();

    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
    apiServer.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
    assertThat(unlabelledPod).isNotNull();
  }

  @Test
  void kubectlLabelNamespacedResourceReceiveForbiddenShouldThrowException()
      throws KubectlException {
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    apiServer.stubFor(
        put(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withRequestBody(
                matchingJsonPath(
                    "$.metadata.labels", equalToJson("{ \"k1\": \"v1\", \"k2\": \"v2\" }")))
            .willReturn(aResponse().withStatus(403).withBody("{\"metadata\":{}}")));
    assertThatThrownBy(
            () ->
                Kubectl.label(V1Pod.class)
                    .apiClient(apiClient)
                    .skipDiscovery()
                    .namespace("default")
                    .name("foo")
                    .addLabel("k1", "v1")
                    .addLabel("k2", "v2")
                    .execute())
        .isInstanceOf(KubectlException.class);
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
    apiServer.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }

  @Test
  void kubectlLabelClusterResourceShouldWork() throws KubectlException {
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/nodes/foo"))
            .willReturn(aResponse().withStatus(200).withBody("{\"metadata\":{\"name\":\"foo\"}}")));
    apiServer.stubFor(
        put(urlPathEqualTo("/api/v1/nodes/foo"))
            .withRequestBody(
                matchingJsonPath(
                    "$.metadata.labels", equalToJson("{ \"k1\": \"v1\", \"k2\": \"v2\" }")))
            .willReturn(aResponse().withStatus(200).withBody("{\"metadata\":{\"name\":\"foo\"}}")));
    V1Node labelledNode =
        Kubectl.label(V1Node.class)
            .apiClient(apiClient)
            .skipDiscovery()
            .name("foo")
            .addLabel("k1", "v1")
            .addLabel("k2", "v2")
            .execute();
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
    apiServer.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
    assertThat(labelledNode).isNotNull();
  }

  @Test
  void kubectlDeleteLabelClusterResourceShouldWork() throws KubectlException {
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/nodes/foo"))
            .willReturn(aResponse().withStatus(200).withBody("{\"metadata\":{\"name\":\"foo\"}}")));
    apiServer.stubFor(
        put(urlPathEqualTo("/api/v1/nodes/foo"))
            .withRequestBody(
                matchingJsonPath("$.metadata.labels", equalToJson("{}")))
            .willReturn(aResponse().withStatus(200).withBody("{\"metadata\":{\"name\":\"foo\"}}")));

    V1Node unlabelledNode =
        Kubectl.label(V1Node.class)
            .apiClient(apiClient)
            .skipDiscovery()
            .name("foo")
            .deleteLabel("k1")
            .execute();
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
    apiServer.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
    assertThat(unlabelledNode).isNotNull();
  }

  @Test
  void kubectlLabelClusterResourceReceiveForbiddenShouldThrowException()
      throws KubectlException {
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/nodes/foo"))
            .willReturn(aResponse().withStatus(200).withBody("{\"metadata\":{\"name\":\"foo\"}}")));
    apiServer.stubFor(
        put(urlPathEqualTo("/api/v1/nodes/foo"))
            .withRequestBody(
                matchingJsonPath(
                    "$.metadata.labels", equalToJson("{ \"k1\": \"v1\", \"k2\": \"v2\" }")))
            .willReturn(aResponse().withStatus(403).withBody("{\"metadata\":{}}")));
    assertThatThrownBy(
            () ->
                Kubectl.label(V1Node.class)
                    .apiClient(apiClient)
                    .skipDiscovery()
                    .name("foo")
                    .addLabel("k1", "v1")
                    .addLabel("k2", "v2")
                    .execute())
        .isInstanceOf(KubectlException.class);
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
    apiServer.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
  }

  @Test
  void missingArgumentsShouldFail() throws KubectlException {
    assertThatThrownBy(
            () ->
                Kubectl.label(V1Node.class)
                    .apiClient(apiClient)
                    .skipDiscovery()
                    // .name("foo") # missing name
                    .addLabel("k1", "v1")
                    .addLabel("k2", "v2")
                    .execute())
        .isInstanceOf(KubectlException.class);
  }
}
