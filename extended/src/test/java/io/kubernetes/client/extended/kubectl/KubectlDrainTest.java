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
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.deleteRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.patch;
import static com.github.tomakehurst.wiremock.client.WireMock.patchRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class KubectlDrainTest {

  private static final String POD_LIST_API =
      new File(KubectlDrainTest.class.getClassLoader().getResource("pod-list.json").getPath())
          .toString();

  private ApiClient apiClient;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(WireMockConfiguration.options().port(8384)).build();

  @BeforeEach
  void setup() {
    ModelMapper.addModelMap("", "v1", "Pod", "pods", true, V1Pod.class);
    ModelMapper.addModelMap("", "v1", "Node", "nodes", false, V1Node.class);
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + 8384).build();
  }

  @Test
  void drainNodeNoPods() throws KubectlException {
    // /api/v1/pods?fieldSelector=spec.nodeName%3Dkube3
    apiServer.stubFor(
        patch(urlPathEqualTo("/api/v1/nodes/node1"))
            .willReturn(
                aResponse().withStatus(200).withBody("{\"metadata\": { \"name\": \"node1\" } }")));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
            .withQueryParam("fieldSelector", equalTo("spec.nodeName=node1"))
            .willReturn(aResponse().withStatus(200).withBody("{\"items\":[]}")));
    V1Node node = new KubectlDrain().skipDiscovery().apiClient(apiClient).name("node1").execute();
    apiServer.verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/nodes/node1")));
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/pods")));
    assertThat(node.getMetadata().getName()).isEqualTo("node1");
  }

  @Test
  void drainNodePods() throws KubectlException, IOException {
    // /api/v1/pods?fieldSelector=spec.nodeName%3Dkube3
    apiServer.stubFor(
        patch(urlPathEqualTo("/api/v1/nodes/node1"))
            .willReturn(
                aResponse().withStatus(200).withBody("{\"metadata\": { \"name\": \"node1\" } }")));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/pods"))
            .withQueryParam("fieldSelector", equalTo("spec.nodeName=node1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(POD_LIST_API))))));
    apiServer.stubFor(
        delete(urlPathEqualTo("/api/v1/namespaces/mssql/pods/mssql-75b8b44f6b-znftp"))
            .willReturn(aResponse().withStatus(200).withBody("{}")));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/mssql/pods/mssql-75b8b44f6b-znftp"))
            .willReturn(aResponse().withStatus(404).withBody("{}")));

    V1Node node = new KubectlDrain().skipDiscovery().apiClient(apiClient).name("node1").execute();
    apiServer.verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/nodes/node1")));
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/api/v1/pods")));
    apiServer.verify(
        1,
        deleteRequestedFor(urlPathEqualTo("/api/v1/namespaces/mssql/pods/mssql-75b8b44f6b-znftp")));
    apiServer.verify(
        1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/mssql/pods/mssql-75b8b44f6b-znftp")));
    assertThat(node.getMetadata().getName()).isEqualTo("node1");
    assertThat(apiServer.findUnmatchedRequests().getRequests()).isEmpty();
  }
}
