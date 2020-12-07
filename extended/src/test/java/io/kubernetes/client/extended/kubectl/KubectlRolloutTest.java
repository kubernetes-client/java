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
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.patch;
import static com.github.tomakehurst.wiremock.client.WireMock.patchRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.common.io.Resources;
import com.sun.tools.javac.util.List;
import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.extended.kubectl.rollout.response.RolloutHistory;
import io.kubernetes.client.extended.kubectl.rollout.response.RolloutResponse;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1StatefulSet;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class KubectlRolloutTest {

  private ApiClient apiClient;

  private static final String DISCOVERY_API = Resources.getResource("discovery-api.json").getPath();

  private static final String DISCOVERY_APIV1 =
      Resources.getResource("discovery-api-v1.json").getPath();

  private static final String DISCOVERY_APIS =
      Resources.getResource("discovery-apis.json").getPath();

  private static final String RESTART_ANNOTATION_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";

  private static final String STS_CONTROLLER_REF_LIST_API =
      Resources.getResource("sts-controller-reference-list.json").getPath();

  private static final String STS_REF_API = Resources.getResource("statefulset.json").getPath();

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort(), false);

  @Before
  public void setup() throws IOException {
    apiClient = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_API))))));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIS))))));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(DISCOVERY_APIV1))))));
  }

  @Test
  public void testRolloutDeploymentResumeShouldWork() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":true}}")));
    wireMockRule.stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":false}}")));
    try {
      Kubectl.rollout(V1Deployment.class)
          .apiClient(apiClient)
          .name("foo")
          .namespace("default")
          .resume()
          .execute();
    } catch (KubectlException e) {
      Assert.fail("Assertion failed with exception " + e.getMessage());
    }
    wireMockRule.verify(
        1,
        patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .withRequestBody(equalToJson("{\"spec\":{\"paused\":false}}")));
  }

  @Test
  public void testRolloutDeploymentResumeWithNoPauseShouldThrowException() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":false}}")));
    assertThrows(
        KubectlException.class,
        () -> {
          RolloutResponse response =
              Kubectl.rollout(V1Deployment.class)
                  .apiClient(apiClient)
                  .name("foo")
                  .namespace("default")
                  .resume()
                  .execute();
        });
  }

  @Test
  public void testRolloutDeploymentResumeWithNoResourceShouldThrowException() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo1"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withBody(
                        "{\"kind\":\"Status\",\"apiVersion\":\"v1\",\"metadata\":{},\"status\":\"Failure\",\"message\":\"deployments.apps \\\"foo1\\\" not found\",\"reason\":\"NotFound\",\"details\":{\"name\":\"foo1\",\"group\":\"apps\",\"kind\":\"deployments\"},\"code\":404}")));
    assertThrows(
        KubectlException.class,
        () -> {
          Kubectl.rollout(V1Deployment.class)
              .apiClient(apiClient)
              .name("foo1")
              .namespace("default")
              .resume()
              .execute();
        });
  }

  @Test
  public void testRolloutDeploymentPauseShouldWork() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":false}}")));
    wireMockRule.stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":true}}")));
    try {
      Kubectl.rollout(V1Deployment.class)
          .apiClient(apiClient)
          .name("foo")
          .namespace("default")
          .pause()
          .execute();
    } catch (KubectlException e) {
      Assert.fail("Assertion failed with exception " + e.getMessage());
    }
    wireMockRule.verify(
        1,
        patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .withRequestBody(equalToJson("{\"spec\":{\"paused\":true}}")));
  }

  @Test
  public void testRolloutDeploymentPauseWithAlreadyPausedShouldThrowException() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":true}}")));
    assertThrows(
        KubectlException.class,
        () -> {
          RolloutResponse response =
              Kubectl.rollout(V1Deployment.class)
                  .apiClient(apiClient)
                  .name("foo")
                  .namespace("default")
                  .pause()
                  .execute();
        });
  }

  @Test
  public void testRolloutDeploymentPauseWithNoResourceShouldThrowException() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo1"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withBody(
                        "{\"kind\":\"Status\",\"apiVersion\":\"v1\",\"metadata\":{},\"status\":\"Failure\",\"message\":\"deployments.apps \\\"foo1\\\" not found\",\"reason\":\"NotFound\",\"details\":{\"name\":\"foo1\",\"group\":\"apps\",\"kind\":\"deployments\"},\"code\":404}")));
    assertThrows(
        KubectlException.class,
        () -> {
          Kubectl.rollout(V1Deployment.class)
              .apiClient(apiClient)
              .name("foo1")
              .namespace("default")
              .pause()
              .execute();
        });
  }

  @Test
  public void testRolloutDeploymentRestartShouldWork() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":false}}")));
    wireMockRule.stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":false}}")));
    try {
      Kubectl.rollout(V1Deployment.class)
          .apiClient(apiClient)
          .name("foo")
          .namespace("default")
          .restart()
          .execute();
    } catch (KubectlException e) {
      Assert.fail("Assertion failed with exception " + e.getMessage());
    }
    wireMockRule.verify(
        1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo")));
  }

  @Test
  public void testRolloutDeploymentRestartShouldThrowException() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        "{\"metadata\":{\"name\":\"foo\",\"namespace\":\"default\"},\"spec\":{\"paused\":true}}")));
    assertThrows(
        KubectlException.class,
        () -> {
          Kubectl.rollout(V1Deployment.class)
              .apiClient(apiClient)
              .name("foo")
              .namespace("default")
              .restart()
              .execute();
        });
  }

  @Test
  public void testRolloutDeploymentRestartWithNoResourceShouldThrowException() {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/deployments/foo1"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withBody(
                        "{\"kind\":\"Status\",\"apiVersion\":\"v1\",\"metadata\":{},\"status\":\"Failure\",\"message\":\"deployments.apps \\\"foo1\\\" not found\",\"reason\":\"NotFound\",\"details\":{\"name\":\"foo1\",\"group\":\"apps\",\"kind\":\"deployments\"},\"code\":404}")));
    assertThrows(
        KubectlException.class,
        () -> {
          Kubectl.rollout(V1Deployment.class)
              .apiClient(apiClient)
              .name("foo1")
              .namespace("default")
              .resume()
              .execute();
        });
  }

  @Test
  public void testRolloutStatefulSetHistoryShouldWork() throws IOException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/statefulsets/web"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(new String(Files.readAllBytes(Paths.get(STS_REF_API))))));
    wireMockRule.stubFor(
        get(urlPathEqualTo("/apis/apps/v1/namespaces/default/controllerrevisions"))
            .withQueryParam("labelSelector", equalTo("app=nginx"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new String(Files.readAllBytes(Paths.get(STS_CONTROLLER_REF_LIST_API))))));
    try {
      RolloutResponse<Map<Long, RolloutHistory>> response =
          Kubectl.rollout(V1StatefulSet.class)
              .apiClient(apiClient)
              .name("web")
              .namespace("default")
              .history()
              .execute();
      Map<Long, RolloutHistory> rolloutHistoryMap = response.getResponse();
      List<String> image = List.of("k8s.gcr.io/nginx-slim:0.8", "nginx:1.14.2");
      for (Map.Entry<Long, RolloutHistory> each : rolloutHistoryMap.entrySet()) {
        Assert.assertTrue(
            "Matching image change", image.contains(getImage(each.getValue().getResource())));
      }
    } catch (KubectlException e) {
      fail("Fetching history of statefulset failed : " + e.getMessage());
    }
  }

  private String getImage(V1PodTemplateSpec spec) {
    return spec.getSpec().getContainers().get(0).getImage();
  }

  @Test
  public void testRolloutStatefulSetWithNoHistoryShouldThrow() throws IOException {
    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/default/statefulsets/foo1"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withBody(
                        "{\n"
                            + "  \"kind\": \"Status\",\n"
                            + "  \"apiVersion\": \"v1\",\n"
                            + "  \"metadata\": {},\n"
                            + "  \"status\": \"Failure\",\n"
                            + "  \"message\": \"statefulsets.apps \\\"foo1\\\" not found\",\n"
                            + "  \"reason\": \"NotFound\",\n"
                            + "  \"details\": {\n"
                            + "    \"name\": \"foo1\",\n"
                            + "    \"group\": \"apps\",\n"
                            + "    \"kind\": \"statefulsets\"\n"
                            + "  },\n"
                            + "  \"code\": 404\n"
                            + "}")));
    assertThrows(
        KubectlException.class,
        () -> {
          Kubectl.rollout(V1StatefulSet.class)
              .apiClient(apiClient)
              .name("foo1")
              .namespace("default")
              .history()
              .execute();
        });
  }
}
