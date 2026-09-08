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
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.github.tomakehurst.wiremock.matching.EqualToPattern;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1ReplicaSet;
import io.kubernetes.client.openapi.models.V1ReplicaSetList;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class DeploymentHelperTest {
  private static String readResource(String name) {
    try (java.io.InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(name)) {
      return new String(is.readAllBytes());
    } catch (java.io.IOException e) {
      throw new RuntimeException(e);
    }
  }


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
  void getAllReplicaSetsShouldWork() throws IOException, ApiException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(readResource("replicaset-list.json"))));
    AppsV1Api api = new AppsV1Api(this.apiClient);

    V1Deployment deployment =
        new JSON()
            .deserialize(readResource("deployment.json"), V1Deployment.class);
    List<V1ReplicaSet> oldRSes = new ArrayList<>();
    List<V1ReplicaSet> allOldRSes = new ArrayList<>();
    V1ReplicaSet newRs = DeploymentHelper.getAllReplicaSets(deployment, api, oldRSes, allOldRSes);
    apiServer.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    assertThat(newRs).isNotNull();
    assertThat(oldRSes).hasSize(1);
    assertThat(allOldRSes).hasSize(2);
  }

  @Test
  void getAllReplicaSetsShouldWorkWhenTemplateHasNoLabels() throws IOException, ApiException {
    // Regression test: pod template metadata with no labels at all (so getLabels() is null)
    // used to throw a NullPointerException in DeploymentHelper.equalIgnoreHash.
    String deploymentJson =
        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\",\"uid\":\"dep-uid\"},"
            + "\"spec\":{\"selector\":{\"matchLabels\":{\"app\":\"bar\"}},"
            + "\"template\":{\"spec\":{\"containers\":[{\"name\":\"c\",\"image\":\"busybox\"}]}}}}";
    String replicaSetListJson =
            "{\"items\":[{\"metadata\":{\"name\":\"foo-rs\",\"namespace\":\"default\",\"uid\":\"rs-uid\","
                    + "\"creationTimestamp\":\"2021-08-05T08:20:22.000000Z\","
                    + "\"ownerReferences\":[{\"apiVersion\":\"apps/v1\",\"kind\":\"Deployment\",\"name\":\"foo\","
                    + "\"uid\":\"dep-uid\",\"controller\":true}]},"
                    + "\"spec\":{\"replicas\":3,\"selector\":{\"matchLabels\":{\"app\":\"bar\"}},"
                    + "\"template\":{\"spec\":{\"containers\":[{\"name\":\"c\",\"image\":\"busybox\"}]}}}}]}";

    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(aResponse().withStatus(200).withBody(replicaSetListJson)));
    AppsV1Api api = new AppsV1Api(this.apiClient);

    V1Deployment deployment = new JSON().deserialize(deploymentJson, V1Deployment.class);
    List<V1ReplicaSet> oldRSes = new ArrayList<>();
    List<V1ReplicaSet> allOldRSes = new ArrayList<>();

    V1ReplicaSet newRs = DeploymentHelper.getAllReplicaSets(deployment, api, oldRSes, allOldRSes);

    assertThat(newRs).isNotNull();
    assertThat(newRs.getMetadata().getName()).isEqualTo("foo-rs");
    assertThat(oldRSes).isEmpty();
    assertThat(allOldRSes).isEmpty();
  }

  @Test
  void revisionShouldWork() throws IOException {
    V1ReplicaSetList replicaSetList =
        new JSON()
            .deserialize(
                readResource("replicaset-list.json"), V1ReplicaSetList.class);
    List<Long> revisions = new ArrayList<>();
    for (V1ReplicaSet rs : replicaSetList.getItems()) {
      revisions.add(DeploymentHelper.revision(rs.getMetadata()));
    }
    revisions.sort(Long::compareTo);
    List<Long> exceptRevisions = Arrays.asList(1L, 2L, 2L, 3L, 4L);
    assertThat(revisions).isEqualTo(exceptRevisions);
  }
}
