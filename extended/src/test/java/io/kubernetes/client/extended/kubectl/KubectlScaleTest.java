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
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubectlScaleTest {

  private ApiClient apiClient;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort(), false);

  @Before
  public void setup() throws IOException {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
  }

  @Test
  public void testKubectlScaleShouldWork() throws KubectlException {
    wireMockRule.stubFor(
        patch(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    V1Deployment scaled =
        Kubectl.scale(apiClient, V1Deployment.class)
            .name("foo")
            .namespace("default")
            .replicas(2)
            .execute();
    wireMockRule.verify(
        1,
        patchRequestedFor(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))
            .withRequestBody(
                equalToJson("[{\"op\":\"replace\",\"path\":\"/spec/replicas\",\"value\":2}]")));
    assertNotNull(scaled);
  }

  @Test
  public void testKubectlScaleReplicaSetShouldWork() throws KubectlException {
    wireMockRule.stubFor(
        patch(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody("{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"}}")));
    KubectlScale<V1ReplicaSet> s =
        Kubectl.scale(apiClient, V1ReplicaSet.class).replicas(4).name("foo").namespace("default");
    V1ReplicaSet scaled = s.execute();
    wireMockRule.verify(
        1,
        patchRequestedFor(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets/foo"))
            .withRequestBody(
                equalToJson("[{\"op\":\"replace\",\"path\":\"/spec/replicas\",\"value\":4}]")));
    assertNotNull(scaled);
  }

  @Test
  public void testKubectlScaleShouldThrow() {
    assertThrows(
        KubectlException.class,
        () -> {
          V1Pod scaled =
              Kubectl.scale(apiClient, V1Pod.class)
                  .name("foo")
                  .namespace("default")
                  .replicas(2)
                  .execute();
        });
  }
}
