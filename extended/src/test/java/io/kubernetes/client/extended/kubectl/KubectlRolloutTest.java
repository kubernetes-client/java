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

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.patch;
import static com.github.tomakehurst.wiremock.client.WireMock.patchRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.github.tomakehurst.wiremock.matching.EqualToPattern;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1DaemonSet;
import io.kubernetes.client.openapi.models.V1DaemonSetList;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1DeploymentList;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import io.kubernetes.client.openapi.models.V1StatefulSetList;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.ModelMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class KubectlRolloutTest {

  private ApiClient apiClient;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

  private static final String DEPLOYMENT =
      new File(KubectlRolloutTest.class.getClassLoader().getResource("deployment.json").getPath())
          .toString();

  private static final String REPLICASET_LIST =
      new File(
              KubectlRolloutTest.class
                  .getClassLoader()
                  .getResource("replicaset-list.json")
                  .getPath())
          .toString();

  private static final String DAEMON_SET =
      new File(KubectlRolloutTest.class.getClassLoader().getResource("daemonset.json").getPath())
          .toString();

  private static final String PATCHED_DAEMON_SET =
      new File(
              KubectlRolloutTest.class
                  .getClassLoader()
                  .getResource("patched-daemonset.json")
                  .getPath())
          .toString();

  private static final String DAEMON_SET_CONTROLLER_REVISION_LIST =
      new File(
              KubectlRolloutTest.class
                  .getClassLoader()
                  .getResource("daemonset-controllerrevision-list.json")
                  .getPath())
          .toString();

  private static final String STATEFUL_SET =
      new File(KubectlRolloutTest.class.getClassLoader().getResource("statefulset.json").getPath())
          .toString();

  private static final String PATCHED_STATEFUL_SET =
      new File(
              KubectlRolloutTest.class
                  .getClassLoader()
                  .getResource("patched-statefulset.json")
                  .getPath())
          .toString();

  private static final String STATEFUL_SET_CONTROLLER_REVISION_LIST =
      new File(
              KubectlRolloutTest.class
                  .getClassLoader()
                  .getResource("statefulset-controllerrevision-list.json")
                  .getPath())
          .toString();

  @BeforeEach
  void setup() {
    ModelMapper.addModelMap(
        "apps",
        "v1",
        "Deployment",
        "deployments",
        true,
        V1Deployment.class,
        V1DeploymentList.class);
    ModelMapper.addModelMap(
        "apps", "v1", "DaemonSet", "daemonsets", true, V1DaemonSet.class, V1DaemonSetList.class);
    ModelMapper.addModelMap(
        "apps",
        "v1",
        "StatefulSet",
        "statefulsets",
        true,
        V1StatefulSet.class,
        V1StatefulSetList.class);
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
  }

  @Test
  void kubectlRolloutHistoryDeploymentShouldWork() throws KubectlException, IOException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DEPLOYMENT))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(REPLICASET_LIST))))));
    List<History> histories =
        Kubectl.rollout(V1Deployment.class)
            .history()
            .apiClient(apiClient)
            .name("foo")
            .namespace("default")
            .skipDiscovery()
            .execute();

    apiServer.verify(
        1, getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))));
    apiServer.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    assertThat(histories).hasSize(3);
  }

  @Test
  void kubectlRolloutHistoryDeploymentWithRevisionShouldWork()
      throws KubectlException, IOException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DEPLOYMENT))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(REPLICASET_LIST))))));
    V1PodTemplateSpec template =
        Kubectl.rollout(V1Deployment.class)
            .history()
            .apiClient(apiClient)
            .name("foo")
            .namespace("default")
            .revision(3)
            .skipDiscovery()
            .execute();
    apiServer.verify(
        1, getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))));
    apiServer.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    assertThat(template).isNotNull();
  }

  @Test
  void kubectlRolloutHistoryDaemonSetShouldWork() throws KubectlException, IOException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/daemonsets/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DAEMON_SET))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new String(
                            Files.readAllBytes(Paths.get(DAEMON_SET_CONTROLLER_REVISION_LIST))))));
    List<History> histories =
        Kubectl.rollout(V1DaemonSet.class)
            .history()
            .apiClient(apiClient)
            .name("foo")
            .namespace("default")
            .skipDiscovery()
            .execute();
    apiServer.verify(
        1, getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/daemonsets/foo"))));
    apiServer.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    assertThat(histories).hasSize(3);
  }

  @Test
  void kubectlRolloutHistoryDaemonSetWithRevisionShouldWork()
      throws KubectlException, IOException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/daemonsets/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DAEMON_SET))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new String(
                            Files.readAllBytes(Paths.get(DAEMON_SET_CONTROLLER_REVISION_LIST))))));
    apiServer.stubFor(
        patch(urlPathEqualTo("/apis/apps/v1/namespaces/default/daemonsets/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(PATCHED_DAEMON_SET))))));
    V1PodTemplateSpec template =
        Kubectl.rollout(V1DaemonSet.class)
            .history()
            .apiClient(apiClient)
            .name("foo")
            .namespace("default")
            .revision(2)
            .skipDiscovery()
            .execute();
    apiServer.verify(
        1, getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/daemonsets/foo"))));
    apiServer.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    apiServer.verify(
        1,
        patchRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/daemonsets/foo")))
            .withQueryParam("dryRun", new EqualToPattern("All")));
    assertThat(template).isNotNull();
  }

  @Test
  void kubectlRolloutHistoryStatefulSetShouldWork()
      throws KubectlException, IOException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/statefulsets/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(STATEFUL_SET))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new String(
                            Files.readAllBytes(
                                Paths.get(STATEFUL_SET_CONTROLLER_REVISION_LIST))))));
    List<History> histories =
        Kubectl.rollout(V1StatefulSet.class)
            .history()
            .apiClient(apiClient)
            .name("foo")
            .namespace("default")
            .skipDiscovery()
            .execute();
    apiServer.verify(
        1, getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/statefulsets/foo"))));
    apiServer.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    assertThat(histories).hasSize(3);
  }

  @Test
  void kubectlRolloutHistoryStatefulSetWithRevisionShouldWork()
      throws KubectlException, IOException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/statefulsets/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(STATEFUL_SET))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new String(
                            Files.readAllBytes(
                                Paths.get(STATEFUL_SET_CONTROLLER_REVISION_LIST))))));
    apiServer.stubFor(
        patch(urlPathEqualTo("/apis/apps/v1/namespaces/default/statefulsets/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(PATCHED_STATEFUL_SET))))));
    V1PodTemplateSpec template =
        Kubectl.rollout(V1StatefulSet.class)
            .history()
            .apiClient(apiClient)
            .name("foo")
            .namespace("default")
            .revision(2)
            .skipDiscovery()
            .execute();
    apiServer.verify(
        1, getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/statefulsets/foo"))));
    apiServer.verify(
        1,
        getRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions")))
            .withQueryParam("labelSelector", new EqualToPattern("app = bar")));
    apiServer.verify(
        1,
        patchRequestedFor((urlPathEqualTo("/apis/apps/v1/namespaces/default/statefulsets/foo")))
            .withQueryParam("dryRun", new EqualToPattern("All")));
    assertThat(template).isNotNull();
  }

  @Test
  void kubectlRolloutHistoryWithInvalidRevisionShouldThrow() throws IOException {
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DEPLOYMENT))))));
    apiServer.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/replicasets"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(REPLICASET_LIST))))));

    assertThatThrownBy(
            () ->
                Kubectl.rollout(V1Deployment.class)
                    .history()
                    .apiClient(apiClient)
                    .name("foo")
                    .namespace("default")
                    .revision(999)
                    .skipDiscovery()
                    .execute())
        .isInstanceOf(KubectlException.class);
  }
}
