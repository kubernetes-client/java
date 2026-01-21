/*
Copyright 2024 The Kubernetes Authors.
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

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.containing;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.patch;
import static com.github.tomakehurst.wiremock.client.WireMock.patchRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class ServerSideApplyTest {

    @RegisterExtension
    static WireMockExtension apiServer =
            WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

    private final JSON json = new JSON();
    private ApiClient apiClient;
    private GenericKubernetesApi<V1Pod, V1PodList> podApi;

    @BeforeEach
    void setup() {
        apiClient = new ClientBuilder()
                .setBasePath("http://localhost:" + apiServer.getPort())
                .build();
        podApi = new GenericKubernetesApi<>(
                V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);
    }

    @Test
    void apply_namespacedPod_sendsCorrectPatchRequest() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        V1Pod responsePod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .withHeader("Content-Type", containing("application/apply-patch+yaml"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.apply(podApi, pod, "test-manager");

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("test-pod");

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .withQueryParam("fieldManager", equalTo("test-manager")));
    }

    @Test
    void apply_withForceConflicts_sendsForceParameter() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        V1Pod responsePod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.apply(podApi, pod, "test-manager", true);

        assertThat(result).isNotNull();

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .withQueryParam("fieldManager", equalTo("test-manager"))
                        .withQueryParam("force", equalTo("true")));
    }

    @Test
    void apply_usingBuilder_appliesResource() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        V1Pod responsePod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.<V1Pod, V1PodList>builder(apiClient)
                .apiTypeClass(V1Pod.class)
                .apiListTypeClass(V1PodList.class)
                .resource(pod)
                .fieldManager("builder-test")
                .apply();

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("test-pod");

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .withQueryParam("fieldManager", equalTo("builder-test")));
    }

    @Test
    void apply_usingBuilderWithForceConflicts_sendsForceParameter() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        V1Pod responsePod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.<V1Pod, V1PodList>builder(apiClient)
                .apiTypeClass(V1Pod.class)
                .apiListTypeClass(V1PodList.class)
                .resource(pod)
                .fieldManager("builder-test")
                .forceConflicts(true)
                .apply();

        assertThat(result).isNotNull();

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .withQueryParam("force", equalTo("true")));
    }

    @Test
    void apply_usingBuilderWithDryRun_sendsDryRunParameter() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        V1Pod responsePod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.<V1Pod, V1PodList>builder(apiClient)
                .apiTypeClass(V1Pod.class)
                .apiListTypeClass(V1PodList.class)
                .resource(pod)
                .fieldManager("builder-test")
                .dryRun()
                .apply();

        assertThat(result).isNotNull();

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .withQueryParam("dryRun", equalTo("All")));
    }

    @Test
    void apply_clusterScopedResource_sendsCorrectPath() throws ApiException {
        V1Pod pod = createPod("cluster-pod", null);
        V1Pod responsePod = createPod("cluster-pod", null);

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/pods/cluster-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.apply(podApi, pod, "test-manager");

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("cluster-pod");

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/pods/cluster-pod")));
    }

    @Test
    void apply_withNullFieldManager_usesDefault() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        V1Pod responsePod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.apply(podApi, pod, null);

        assertThat(result).isNotNull();

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .withQueryParam("fieldManager", equalTo("kubernetes-java-client")));
    }

    @Test
    void apply_nullResource_throwsNullPointerException() {
        assertThatThrownBy(() -> ServerSideApply.apply(podApi, null, "test-manager"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("Resource must not be null");
    }

    @Test
    void apply_nullApi_throwsNullPointerException() {
        V1Pod pod = createPod("test-pod", "default");
        assertThatThrownBy(() -> 
                ServerSideApply.apply((GenericKubernetesApi<V1Pod, V1PodList>) null, pod, "test-manager"))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void apply_resourceWithNullMetadata_throwsNullPointerException() {
        V1Pod pod = new V1Pod().apiVersion("v1").kind("Pod");
        assertThatThrownBy(() -> ServerSideApply.apply(podApi, pod, "test-manager"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("metadata");
    }

    @Test
    void apply_resourceWithNullName_throwsNullPointerException() {
        V1Pod pod = new V1Pod()
                .apiVersion("v1")
                .kind("Pod")
                .metadata(new V1ObjectMeta().namespace("default"));
        assertThatThrownBy(() -> ServerSideApply.apply(podApi, pod, "test-manager"))
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("name");
    }

    @Test
    void apply_serverError_throwsApiException() {
        V1Pod pod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(500)
                                .withBody("{\"message\": \"Internal Server Error\"}")));

        assertThatThrownBy(() -> ServerSideApply.apply(podApi, pod, "test-manager"))
                .isInstanceOf(ApiException.class);
    }

    @Test
    void apply_conflict_throwsApiException() {
        V1Pod pod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(409)
                                .withBody("{\"message\": \"Conflict\"}")));

        assertThatThrownBy(() -> ServerSideApply.apply(podApi, pod, "test-manager"))
                .isInstanceOf(ApiException.class);
    }

    @Test
    void builder_missingApiTypeClass_throwsNullPointerException() {
        V1Pod pod = createPod("test-pod", "default");

        assertThatThrownBy(() -> 
                ServerSideApply.<V1Pod, V1PodList>builder(apiClient)
                        .apiListTypeClass(V1PodList.class)
                        .resource(pod)
                        .fieldManager("test")
                        .apply())
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("apiTypeClass");
    }

    @Test
    void builder_missingApiListTypeClass_throwsNullPointerException() {
        V1Pod pod = createPod("test-pod", "default");

        assertThatThrownBy(() -> 
                ServerSideApply.<V1Pod, V1PodList>builder(apiClient)
                        .apiTypeClass(V1Pod.class)
                        .resource(pod)
                        .fieldManager("test")
                        .apply())
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("apiListTypeClass");
    }

    @Test
    void builder_missingResource_throwsNullPointerException() {
        assertThatThrownBy(() -> 
                ServerSideApply.<V1Pod, V1PodList>builder(apiClient)
                        .apiTypeClass(V1Pod.class)
                        .apiListTypeClass(V1PodList.class)
                        .fieldManager("test")
                        .apply())
                .isInstanceOf(NullPointerException.class)
                .hasMessageContaining("resource");
    }

    @Test
    void apply_usingStaticMethodWithTypes_appliesResource() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        V1Pod responsePod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.apply(
                apiClient,
                V1Pod.class,
                V1PodList.class,
                pod,
                "static-test");

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("test-pod");
    }

    @Test
    void apply_usingStaticMethodWithTypesAndForce_sendsForceParameter() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        V1Pod responsePod = createPod("test-pod", "default");

        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(responsePod))));

        V1Pod result = ServerSideApply.apply(
                apiClient,
                V1Pod.class,
                V1PodList.class,
                pod,
                "static-test",
                true);

        assertThat(result).isNotNull();

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .withQueryParam("force", equalTo("true")));
    }

    private V1Pod createPod(String name, String namespace) {
        V1ObjectMeta metadata = new V1ObjectMeta().name(name);
        if (namespace != null) {
            metadata.namespace(namespace);
        }
        return new V1Pod()
                .apiVersion("v1")
                .kind("Pod")
                .metadata(metadata)
                .spec(new V1PodSpec());
    }
}
