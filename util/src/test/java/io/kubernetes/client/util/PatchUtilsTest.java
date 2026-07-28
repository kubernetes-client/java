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
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.V1Pod;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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

  private static Stream<Arguments> customObjectPatchFormats() {
    return Stream.of(
        Arguments.of(
            V1Patch.PATCH_FORMAT_JSON_PATCH,
            "[{\"op\":\"replace\",\"path\":\"/spec/size\",\"value\":3}]"),
        Arguments.of(
            V1Patch.PATCH_FORMAT_JSON_MERGE_PATCH, "{\"spec\":{\"size\":3}}"));
  }

  @ParameterizedTest
  @MethodSource("customObjectPatchFormats")
  void patchNamespacedCustomObject(String patchFormat, String patchBody) throws ApiException {
    CustomObjectsApi customObjectsApi = new CustomObjectsApi(client);
    String resourcePath = "/apis/example.com/v1/namespaces/default/widgets/foo";
    apiServer.stubFor(
        patch(urlPathEqualTo(resourcePath))
            .withHeader("Content-Type", containing(patchFormat))
            .withRequestBody(equalToJson(patchBody))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{\"metadata\":{\"name\":\"foo\"}}")));

    Object result =
        PatchUtils.patch(
            Object.class,
            () ->
                customObjectsApi
                    .patchNamespacedCustomObject(
                        "example.com",
                        "v1",
                        "default",
                        "widgets",
                        "foo",
                        new V1Patch(patchBody))
                    .buildCall(null),
            patchFormat,
            client);

    assertEquals("foo", ((Map<?, ?>) ((Map<?, ?>) result).get("metadata")).get("name"));
    apiServer.verify(1, patchRequestedFor(urlPathEqualTo(resourcePath)));
  }

  @Test
  void jsonPatchClusterCustomObject() throws ApiException {
    CustomObjectsApi customObjectsApi = new CustomObjectsApi(client);
    String patchBody = "[{\"op\":\"replace\",\"path\":\"/spec/size\",\"value\":3}]";
    String resourcePath = "/apis/example.com/v1/widgets/foo";
    apiServer.stubFor(
        patch(urlPathEqualTo(resourcePath))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_JSON_PATCH))
            .withRequestBody(equalToJson(patchBody))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    PatchUtils.patch(
        Object.class,
        () ->
            customObjectsApi
                .patchClusterCustomObject(
                    "example.com", "v1", "widgets", "foo", new V1Patch(patchBody))
                .buildCall(null),
        V1Patch.PATCH_FORMAT_JSON_PATCH,
        client);

    apiServer.verify(1, patchRequestedFor(urlPathEqualTo(resourcePath)));
  }
}
