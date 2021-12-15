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
package io.kubernetes.client.util;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class PatchUtilsTest {

  private ApiClient client;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort());

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();
  }

  @Test
  public void testJsonPatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_JSON_PATCH))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    PatchUtils.patch(
        V1Pod.class,
        () ->
            coreV1Api.patchNamespacedPodCall(
                "foo", "default", new V1Patch("[]"), null, null, null, null, null, null),
        V1Patch.PATCH_FORMAT_JSON_PATCH,
        client);

    verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }

  @Test
  public void testMergePatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_JSON_MERGE_PATCH))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    PatchUtils.patch(
        V1Pod.class,
        () ->
            coreV1Api.patchNamespacedPodCall(
                "foo", "default", new V1Patch("[]"), null, null, null, null, null, null),
        V1Patch.PATCH_FORMAT_JSON_MERGE_PATCH,
        client);

    verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }

  @Test
  public void testStrategicMergePatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    stubFor(
        patch(urlPathEqualTo("/api/v1/namespaces/default/pods/foo"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    PatchUtils.patch(
        V1Pod.class,
        () ->
            coreV1Api.patchNamespacedPodCall(
                "foo", "default", new V1Patch("[]"), null, null, null, null, null, null),
        V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH,
        client);

    verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }
}
