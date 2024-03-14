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

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class PatchUtilsTest {

  private ApiClient client;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @BeforeEach
  void setup() {
    client = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
  }

  @Test
  void jsonPatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    apiServer.stubFor(
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
            coreV1Api.patchNamespacedPod(
                "foo", "default", new V1Patch("[]")).buildCall(null),
        V1Patch.PATCH_FORMAT_JSON_PATCH,
        client);

    apiServer.verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }

  @Test
  void mergePatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    apiServer.stubFor(
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
            coreV1Api.patchNamespacedPod(
                "foo", "default", new V1Patch("[]")).buildCall(null),
        V1Patch.PATCH_FORMAT_JSON_MERGE_PATCH,
        client);

    apiServer.verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }

  @Test
  void strategicMergePatchPod() throws ApiException {
    CoreV1Api coreV1Api = new CoreV1Api(client);
    apiServer.stubFor(
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
            coreV1Api.patchNamespacedPod(
                "foo", "default", new V1Patch("[]")).buildCall(null),
        V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH,
        client);

    apiServer.verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo")));
  }
}
