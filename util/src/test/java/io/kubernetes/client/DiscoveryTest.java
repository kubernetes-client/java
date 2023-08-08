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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DiscoveryTest {

  private ApiClient apiClient;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort());

  @Before
  public void setup() throws IOException {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
  }

  @Test
  public void testDiscoveryRequest() throws ApiException {
    wireMockRule.stubFor(
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
    wireMockRule.verify(1, getRequestedFor(urlPathEqualTo("/foo")));
    assertEquals(2, versions.getVersions().size());
  }

  @Test
  public void testGroupResourcesByName() {
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
    assertEquals(2, discoveredResources.size());

    Discovery.APIResource meow =
        discoveredResources.stream()
            .filter(r -> r.getResourcePlural().equals("meows"))
            .findFirst()
            .get();
    assertEquals(1, meow.getSubResources().size());
    assertEquals("meows", meow.getResourcePlural());
    assertEquals("meow", meow.getResourceSingular());
    assertEquals(true, meow.getNamespaced());
    assertEquals("mouse", meow.getSubResources().get(0));
  }

  @Test
  public void findAllShouldReturnAllApiResourceWhenAllResourceDiscoveryApiResponseAreSuccess() throws ApiException {
    Discovery discovery = new Discovery(apiClient);

    wireMockRule.stubFor(
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
    String path="/apis/"+group+'/'+version;

    wireMockRule.stubFor(
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
                                    .preferredVersion(new V1GroupVersionForDiscovery().version(version))
                                    .versions(Arrays.asList(
                                        new V1GroupVersionForDiscovery().version(version))))))));

    wireMockRule.stubFor(
        get(urlPathEqualTo(path))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIResourceList()
                                .resources(
                                    Arrays.asList(
                                      new V1APIResource()
                                        .name("first"),
                                      new V1APIResource()
                                        .name("second")))))));

    List<String> versions = new ArrayList<>();
    versions.add(version);
    Set<APIResource> apiResources = discovery.findAll();
    wireMockRule.verify(1, getRequestedFor(urlPathEqualTo(path)));
    assertEquals(2, apiResources.size());
  }

  @Test
  public void findAllShouldThrowImcompleteDiscoveryExceptionWhenAtLeastOneResourceDiscoveryApiResponseIsNotSuccess() throws ApiException {
    Discovery discovery = new Discovery(apiClient);

    wireMockRule.stubFor(
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
    String pathSuccess="/apis/"+groupSuccess+'/'+version;

    String groupError = "testError.com";
    String pathError="/apis/"+groupError+'/'+version;

    wireMockRule.stubFor(
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
                                    .preferredVersion(new V1GroupVersionForDiscovery().version(version))
                                    .versions(Arrays.asList(
                                        new V1GroupVersionForDiscovery().version(version))))
                                .addGroupsItem(new V1APIGroup()
                                    .name(groupSuccess)
                                    .preferredVersion(new V1GroupVersionForDiscovery().version(version))
                                    .versions(Arrays.asList(
                                        new V1GroupVersionForDiscovery().version(version))))))));

    wireMockRule.stubFor(
        get(urlPathEqualTo(pathError))
            .willReturn(
                aResponse()
                    .withStatus(503)));

    wireMockRule.stubFor(
        get(urlPathEqualTo(pathSuccess))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(
                        apiClient
                            .getJSON()
                            .serialize(new V1APIResourceList()
                                .resources(
                                    Arrays.asList(
                                      new V1APIResource()
                                        .name("first"),
                                      new V1APIResource()
                                        .name("second")))))));

    List<String> versions = new ArrayList<>();
    versions.add(version);
    Set<APIResource> apiResources = null;
    try{
      discovery.findAll();
      fail("Should have throw ImcompleteDiscoveryException");
    } catch (IncompleteDiscoveryException e) {
      apiResources = e.getDiscoveredResources();
    }
    wireMockRule.verify(1, getRequestedFor(urlPathEqualTo(pathError)));
    wireMockRule.verify(1, getRequestedFor(urlPathEqualTo(pathSuccess)));
    assertEquals(2, apiResources.size());
  }
}
