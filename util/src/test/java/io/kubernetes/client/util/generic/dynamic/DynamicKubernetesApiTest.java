/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.util.generic.dynamic;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.put;
import static com.github.tomakehurst.wiremock.client.WireMock.putRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class DynamicKubernetesApiTest {

  private static final String jsonContent =
      new StringBuilder()
          .append("{")
          .append("\"apiVersion\":\"v1\",")
          .append("\"kind\":\"CustomResource\",")
          .append("\"metadata\":{")
          .append("\"namespace\":\"default\",")
          .append("\"name\":\"foo\"")
          .append("}")
          .append("}")
          .toString();

  private ApiClient apiClient;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance()
          .options(options().dynamicPort())
          .failOnUnmatchedRequests(false)
          .build();

  @BeforeEach
  void setup() {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
  }

  @Test
  void listNamespaceShouldWork() throws ApiException {
    V1NamespaceList expectedList =
        new V1NamespaceList()
            .addItemsItem(new V1Namespace().metadata(new V1ObjectMeta().name("foo1")))
            .addItemsItem(new V1Namespace().metadata(new V1ObjectMeta().name("foo2")));
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(apiClient.getJSON().serialize(expectedList))));
    DynamicKubernetesApi api = new DynamicKubernetesApi("", "v1", "namespaces", apiClient);
    DynamicKubernetesListObject listObj = api.list().throwsApiException().getObject();
    assertThat(listObj.getItems()).hasSize(expectedList.getItems().size());
    apiServer.verify(getRequestedFor(urlPathEqualTo("/api/v1/namespaces")));
  }

  @Test
  void updateNamespaceShouldWork() throws ApiException {
    V1Namespace updating = new V1Namespace().metadata(new V1ObjectMeta().name("foo1"));
    apiServer.stubFor(
        put(urlPathEqualTo("/api/v1/namespaces/foo1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(apiClient.getJSON().serialize(updating))));
    DynamicKubernetesApi api = new DynamicKubernetesApi("", "v1", "namespaces", apiClient);
    DynamicKubernetesObject updatingObj =
        Dynamics.newFromJson(apiClient.getJSON().serialize(updating));
    DynamicKubernetesObject updatedObj = api.update(updatingObj).throwsApiException().getObject();
    assertThat(updatedObj).isEqualTo(updatingObj);
    apiServer.verify(putRequestedFor(urlPathEqualTo("/api/v1/namespaces/foo1")));
  }

  @Test
  void listCustomResourceShouldWork() throws ApiException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/mygroup.io/myversion/namespaces/default/customresources"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));
    DynamicKubernetesApi api =
        new DynamicKubernetesApi("mygroup.io", "myversion", "customresources", apiClient);
    DynamicKubernetesListObject listObj = api.list("default").throwsApiException().getObject();
    assertThat(listObj).isNotNull();
    apiServer.verify(
        getRequestedFor(
            urlPathEqualTo("/apis/mygroup.io/myversion/namespaces/default/customresources")));
  }

  @Test
  void updateCustomResourceShouldWork() throws ApiException {
    apiServer.stubFor(
        put(urlPathEqualTo("/apis/mygroup.io/myversion/namespaces/default/customresources/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));
    DynamicKubernetesApi api =
        new DynamicKubernetesApi("mygroup.io", "myversion", "customresources", apiClient);
    DynamicKubernetesObject updatingObj = Dynamics.newFromJson(jsonContent);
    DynamicKubernetesObject updatedObj = api.update(updatingObj).throwsApiException().getObject();
    assertThat(updatedObj).isNotNull();
    assertThat(apiClient.getJSON().serialize(updatedObj)).isEqualTo("{}");
    apiServer.verify(
        putRequestedFor(
            urlPathEqualTo("/apis/mygroup.io/myversion/namespaces/default/customresources/foo")));
  }
}
