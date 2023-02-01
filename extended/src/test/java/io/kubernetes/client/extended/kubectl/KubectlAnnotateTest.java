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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubectlAnnotateTest {

  private ApiClient apiClient;

  @Rule public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().dynamicPort());

  @Before
  public void setup() throws IOException {
    ModelMapper.addModelMap("", "v1", "Pod", "pods", true, V1Pod.class);
    ModelMapper.addModelMap("", "v1", "Node", "nodes", false, V1Node.class);
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
  }

  @Test
  public void testKubectlAnnotateNamespacedResourceShouldWork() throws KubectlException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    wireMockRule.stubFor(
        put(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    V1Pod annotatedPod =
        Kubectl.annotate(V1Pod.class)
            .apiClient(apiClient)
            .skipDiscovery()
            .namespace("default")
            .name("foo")
            .addAnnotation("k1", "v1")
            .addAnnotation("k2", "v2")
            .execute();
    wireMockRule.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
    wireMockRule.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
    assertNotNull(annotatedPod);
  }

  @Test
  public void testKubectlAnnotateNamespacedResourceReceiveForbiddenShouldThrowException()
      throws KubectlException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    wireMockRule.stubFor(
        put(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .willReturn(aResponse().withStatus(403).withBody("{\"metadata\":{}}")));
    assertThrows(
        KubectlException.class,
        () -> {
          Kubectl.annotate(V1Pod.class)
              .apiClient(apiClient)
              .skipDiscovery()
              .namespace("default")
              .name("foo")
              .addAnnotation("k1", "v1")
              .addAnnotation("k2", "v2")
              .execute();
        });
    wireMockRule.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
    wireMockRule.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }

  @Test
  public void testKubectlAnnotateClusterResourceShouldWork() throws KubectlException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/nodes/foo"))
            .willReturn(aResponse().withStatus(200).withBody("{\"metadata\":{\"name\":\"foo\"}}")));
    wireMockRule.stubFor(
        put(urlPathEqualTo("/api/v1/nodes/foo"))
            .willReturn(aResponse().withStatus(200).withBody("{\"metadata\":{\"name\":\"foo\"}}")));
    V1Node annotatedNode =
        Kubectl.annotate(V1Node.class)
            .apiClient(apiClient)
            .skipDiscovery()
            .name("foo")
            .addAnnotation("k1", "v1")
            .addAnnotation("k2", "v2")
            .execute();
    wireMockRule.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
    wireMockRule.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
    assertNotNull(annotatedNode);
  }

  @Test
  public void testKubectlAnnotateClusterResourceReceiveForbiddenShouldThrowException()
      throws KubectlException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/nodes/foo"))
            .willReturn(aResponse().withStatus(200).withBody("{\"metadata\":{\"name\":\"foo\"}}")));
    wireMockRule.stubFor(
        put(urlPathEqualTo("/api/v1/nodes/foo"))
            .willReturn(aResponse().withStatus(403).withBody("{\"metadata\":{\"name\":\"foo\"}}")));
    assertThrows(
        KubectlException.class,
        () -> {
          Kubectl.annotate(V1Node.class)
              .apiClient(apiClient)
              .skipDiscovery()
              .name("foo")
              .addAnnotation("k1", "v1")
              .addAnnotation("k2", "v2")
              .execute();
        });
    wireMockRule.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
    wireMockRule.verify(1, putRequestedFor(urlPathEqualTo("/api/v1/nodes/foo")));
  }

  @Test
  public void testMissingArgumentsShouldFail() throws KubectlException {
    assertThrows(
        KubectlException.class,
        () -> {
          Kubectl.annotate(V1Node.class)
              .apiClient(apiClient)
              .skipDiscovery()
              // .name("foo") # missing name
              .addAnnotation("k1", "v1")
              .addAnnotation("k2", "v2")
              .execute();
        });
  }
}
