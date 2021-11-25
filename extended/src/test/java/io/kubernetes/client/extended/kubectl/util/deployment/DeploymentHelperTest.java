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
package io.kubernetes.client.extended.kubectl.util.deployment;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.matching.EqualToPattern;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import io.kubernetes.client.openapi.models.V1ReplicaSetList;
import io.kubernetes.client.util.ClientBuilder;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class DeploymentHelperTest {

  private ApiClient apiClient;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort(), false);

  private static final String DEPLOYMENT =
      new File(DeploymentHelperTest.class.getClassLoader().getResource("deployment.json").getPath())
          .toString();

  private static final String REPLICASET_LIST =
      new File(
              DeploymentHelperTest.class
                  .getClassLoader()
                  .getResource("replicaset-list.json")
                  .getPath())
          .toString();

  @Before
  public void setup() throws IOException {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
  }

  @Test
  public void testGetAllReplicaSetsShouldWork() throws IOException, ApiException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(REPLICASET_LIST))))));
    AppsV1Api api = new AppsV1Api(this.apiClient);

    V1Deployment deployment =
        new JSON()
            .deserialize(new String(Files.readAllBytes(Paths.get(DEPLOYMENT))), V1Deployment.class);
    List<V1ReplicaSet> oldRSes = new ArrayList<>();
    List<V1ReplicaSet> allOldRSes = new ArrayList<>();
    V1ReplicaSet newRs = DeploymentHelper.getAllReplicaSets(deployment, api, oldRSes, allOldRSes);
    wireMockRule.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    Assert.assertNotNull(newRs);
    Assert.assertEquals(1, oldRSes.size());
    Assert.assertEquals(2, allOldRSes.size());
  }

  @Test
  public void testRevisionShouldWork() throws IOException {
    V1ReplicaSetList replicaSetList =
        new JSON()
            .deserialize(
                new String(Files.readAllBytes(Paths.get(REPLICASET_LIST))), V1ReplicaSetList.class);
    List<Long> revisions = new ArrayList<>();
    for (V1ReplicaSet rs : replicaSetList.getItems()) {
      revisions.add(DeploymentHelper.revision(rs.getMetadata()));
    }
    revisions.sort(Long::compareTo);
    List<Long> exceptRevisions = Arrays.asList(1L, 2L, 2L, 3L, 4L);
    Assert.assertEquals(exceptRevisions, revisions);
  }
}
