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

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1APIVersions;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DiscoveryTest {

  private ApiClient apiClient;

  private static final int PORT = 8089;

  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);

  @Before
  public void setup() throws IOException {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + PORT).build();
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
    verify(1, getRequestedFor(urlPathEqualTo("/foo")));
    assertEquals(2, versions.getVersions().size());
  }
}
