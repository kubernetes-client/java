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
package io.kubernetes.client.extended.kubectl;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.Assert.assertThrows;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.EqualToPattern;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubectlRolloutHistoryTest {

  private ApiClient apiClient;

  @Rule public WireMockRule wireMockRule = new WireMockRule(wireMockConfig().dynamicPort());

  private static final String DEPLOYMENT =
      KubectlRolloutHistoryTest.class.getClassLoader().getResource("deployment.json").getPath();

  private static final String REPLICASET_LIST =
      KubectlRolloutHistoryTest.class
          .getClassLoader()
          .getResource("replicaset-list.json")
          .getPath();

  @Before
  public void setup() throws IOException {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
  }

  @Test
  public void testKubectlRolloutHistoryDeploymentShouldWork() throws KubectlException, IOException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DEPLOYMENT))))));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(REPLICASET_LIST))))));
    KubectlRolloutHistory<V1Deployment> rolloutHistory =
        Kubectl.rolloutHistory(V1Deployment.class)
            .apiClient(apiClient)
            .name("foo")
            .namespace("default");
    rolloutHistory.execute();
    wireMockRule.verify(
        1, getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))));
    wireMockRule.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    Assert.assertEquals(3, rolloutHistory.getHistories().size());
  }

  @Test
  public void testKubectlRolloutHistoryDeploymentWithRevisionShouldWork()
      throws KubectlException, IOException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DEPLOYMENT))))));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(REPLICASET_LIST))))));
    KubectlRolloutHistory<V1Deployment> rolloutHistory =
        Kubectl.rolloutHistory(V1Deployment.class)
            .apiClient(apiClient)
            .name("foo")
            .namespace("default")
            .revision(3);
    rolloutHistory.execute();
    wireMockRule.verify(
        1, getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))));
    wireMockRule.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    Assert.assertNotNull(rolloutHistory.getTemplate());
  }

  @Test
  public void testKubectlRolloutHistoryWithInvalidRevisionShouldThrow() throws IOException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DEPLOYMENT))))));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(REPLICASET_LIST))))));
    KubectlRolloutHistory<V1Deployment> rolloutHistory =
        Kubectl.rolloutHistory(V1Deployment.class)
            .apiClient(apiClient)
            .name("foo")
            .namespace("default")
            .revision(999);
    assertThrows(KubectlException.class, rolloutHistory::execute);
    rolloutHistory.revision(-1);
    assertThrows(KubectlException.class, rolloutHistory::execute);
  }
}
