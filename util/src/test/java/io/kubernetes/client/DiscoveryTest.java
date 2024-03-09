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
package io.kubernetes.client;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.Discovery.APIResource;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1APIGroup;
import io.kubernetes.client.openapi.models.V1APIGroupList;
import io.kubernetes.client.openapi.models.V1APIResource;
import io.kubernetes.client.openapi.models.V1APIResourceList;
import io.kubernetes.client.openapi.models.V1APIVersions;
import io.kubernetes.client.openapi.models.V1GroupVersionForDiscovery;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.exception.IncompleteDiscoveryException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class DiscoveryTest {

  private ApiClient apiClient;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @BeforeEach
  void setup() {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
  }

  @Test
  void discoveryRequest() throws ApiException {
    apiServer.stubFor(
        get(urlPathEqualTo("/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIVersions().versions(Arrays.asList("v1", "v2"))))));
    Discovery discovery = new Discovery(apiClient);
    V1APIVersions versions = discovery.versionDiscovery("/foo");
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/foo")));
    assertThat(versions.getVersions()).hasSize(2);
  }

  @Test
  void groupResourcesByName() {
    Discovery discovery = new Discovery(apiClient);
    Set<Discovery.APIResource> discoveredResources =
        discovery.groupResourcesByName(
            "foo",
            Arrays.asList("v1", "v2"),
            "v1",
            new V1APIResourceList()
                .resources(
                    Arrays.asList(
                        new V1APIResource()
                            .name("meows")
                            .kind("Meow")
                            .namespaced(true)
                            .singularName("meow"),
                        new V1APIResource()
                            .name("meows/mouse")
                            .kind("MeowMouse")
                            .namespaced(true)
                            .singularName(""),
                        new V1APIResource()
                            .name("zigs")
                            .kind("Zig")
                            .namespaced(false)
                            .singularName("zig"))));
    assertThat(discoveredResources).hasSize(2);

    Discovery.APIResource meow =
        discoveredResources.stream()
            .filter(r -> r.getResourcePlural().equals("meows"))
            .findFirst()
            .get();
    assertThat(meow.getSubResources()).hasSize(1);
    assertThat(meow.getResourcePlural()).isEqualTo("meows");
    assertThat(meow.getResourceSingular()).isEqualTo("meow");
    assertThat(meow.getNamespaced()).isTrue();
    assertThat(meow.getSubResources()).containsExactly("mouse");
  }

  @Test
  void findAllShouldReturnAllApiResourceWhenAllResourceDiscoveryApiResponseAreSuccess() throws ApiException {
    Discovery discovery = new Discovery(apiClient);

    apiServer.stubFor(
        get("/api")
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIVersions()))));

    String group = "test.com";
    String version = "v1";
    String groupVersion = "test.com/v1";
    String path="/apis/"+group+'/'+version;

    apiServer.stubFor(
        get("/apis")
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIGroupList()
                                .addGroupsItem(new V1APIGroup()
                                    .name(group)
                                    .preferredVersion(new V1GroupVersionForDiscovery().groupVersion(groupVersion).version(version))
                                    .versions(Arrays.asList(
                                        new V1GroupVersionForDiscovery().groupVersion(groupVersion).version(version))))))));

    apiServer.stubFor(
        get(urlPathEqualTo(path))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIResourceList()
                                    .groupVersion(group)
                                .resources(
                                    Arrays.asList(
                                      new V1APIResource()
                                              .kind("First")
                                              .namespaced(true)
                                              .singularName("first")
                                              .group(group)
                                              .version(version)
                                        .name("first"),
                                      new V1APIResource()
                                              .kind("Second")
                                              .namespaced(true)
                                              .singularName("second")
                                              .group(group)
                                              .version(version)
                                        .name("second")))))));

    List<String> versions = new ArrayList<>();
    versions.add(version);
    Set<APIResource> apiResources = discovery.findAll();
    apiServer.verify(1, getRequestedFor(urlPathEqualTo(path)));
    assertThat(apiResources).hasSize(2);
  }

  @Test
  void findAllShouldThrowImcompleteDiscoveryExceptionWhenAtLeastOneResourceDiscoveryApiResponseIsNotSuccess() throws ApiException {
    Discovery discovery = new Discovery(apiClient);

    apiServer.stubFor(
        get("/api")
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIVersions()))));

    String groupSuccess = "test.com";
    String version = "v1";
    String groupVersionSuccess = "test.com/v1";
    String pathSuccess="/apis/"+groupSuccess+'/'+version;

    String groupError = "testError.com";
    String groupVersionError = "test.com/v1";
    String pathError="/apis/"+groupError+'/'+version;

    apiServer.stubFor(
        get("/apis")
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIGroupList()
                                .addGroupsItem(new V1APIGroup()
                                    .name(groupError)
                                    .preferredVersion(new V1GroupVersionForDiscovery().groupVersion(groupVersionError).version(version))
                                    .versions(Arrays.asList(
                                        new V1GroupVersionForDiscovery().groupVersion(groupVersionError).version(version))))
                                .addGroupsItem(new V1APIGroup()
                                    .name(groupSuccess)
                                    .preferredVersion(new V1GroupVersionForDiscovery().groupVersion(groupVersionSuccess).version(version))
                                    .versions(Arrays.asList(
                                        new V1GroupVersionForDiscovery().groupVersion(groupVersionSuccess).version(version))))))));

    apiServer.stubFor(
        get(urlPathEqualTo(pathError))
            .willReturn(
                aResponse()
                    .withStatus(503)));

    apiServer.stubFor(
        get(urlPathEqualTo(pathSuccess))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIResourceList()
                                    .groupVersion(groupVersionSuccess)
                                .resources(
                                    Arrays.asList(
                                      new V1APIResource()
                                              .kind("First")
                                              .namespaced(true)
                                              .singularName("first")
                                              .group(groupSuccess)
                                              .version(version)
                                        .name("first"),
                                      new V1APIResource()
                                              .kind("Second")
                                              .namespaced(true)
                                              .singularName("second")
                                              .group(groupSuccess)
                                              .version(version)
                                        .name("second")))))));

    List<String> versions = new ArrayList<>();
    versions.add(version);
    Set<APIResource> apiResources = null;
    try{
      discovery.findAll();
      failBecauseExceptionWasNotThrown(IncompleteDiscoveryException.class);
    } catch (IncompleteDiscoveryException e) {
      apiResources = e.getDiscoveredResources();
    }
    apiServer.verify(1, getRequestedFor(urlPathEqualTo(pathError)));
    apiServer.verify(1, getRequestedFor(urlPathEqualTo(pathSuccess)));
    assertThat(apiResources).hasSize(2);
  }
}
