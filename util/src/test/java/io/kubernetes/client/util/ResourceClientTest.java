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
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.deleteRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.patch;
import static com.github.tomakehurst.wiremock.client.WireMock.patchRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.put;
import static com.github.tomakehurst.wiremock.client.WireMock.putRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodCondition;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.openapi.models.V1PodStatus;
import io.kubernetes.client.openapi.models.V1Status;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class ResourceClientTest {

    @RegisterExtension
    static WireMockExtension apiServer =
            WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

    private final JSON json = new JSON();
    private ApiClient apiClient;
    private ResourceClient<V1Pod, V1PodList> podClient;

    @BeforeEach
    void setup() {
        apiClient = new ClientBuilder()
                .setBasePath("http://localhost:" + apiServer.getPort())
                .build();
        podClient = ResourceClient.create(
                apiClient, V1Pod.class, V1PodList.class, "", "v1", "pods");
    }

    // ========== Get Tests ==========

    @Test
    void get_namespacedPod_returnsResource() throws ApiException {
        V1Pod pod = createPod("test-pod", "default");
        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(pod))));

        V1Pod result = podClient.inNamespace("default").withName("test-pod").get();

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("test-pod");
        assertThat(result.getMetadata().getNamespace()).isEqualTo("default");

        apiServer.verify(getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/test-pod")));
    }

    @Test
    void get_clusterScopedResource_returnsResource() throws ApiException {
        V1Pod pod = createPod("cluster-pod", null);
        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/pods/cluster-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(pod))));

        V1Pod result = podClient.withName("cluster-pod").get();

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("cluster-pod");

        apiServer.verify(getRequestedFor(urlPathEqualTo("/api/v1/pods/cluster-pod")));
    }

    @Test
    void get_notFound_returnsNull() throws ApiException {
        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/namespaces/default/pods/missing"))
                        .willReturn(aResponse()
                                .withStatus(404)
                                .withBody("{\"kind\": \"Status\", \"code\": 404}")));

        V1Pod result = podClient.inNamespace("default").withName("missing").get();

        assertThat(result).isNull();
    }

    // ========== List Tests ==========

    @Test
    void list_namespacedPods_returnsList() throws ApiException {
        V1PodList podList = new V1PodList()
                .metadata(new V1ListMeta())
                .items(List.of(
                        createPod("pod1", "default"),
                        createPod("pod2", "default")));

        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/namespaces/default/pods"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(podList))));

        V1PodList result = podClient.inNamespace("default").list();

        assertThat(result).isNotNull();
        assertThat(result.getItems()).hasSize(2);

        apiServer.verify(getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods")));
    }

    @Test
    void list_allNamespaces_returnsList() throws ApiException {
        V1PodList podList = new V1PodList()
                .metadata(new V1ListMeta())
                .items(List.of(
                        createPod("pod1", "ns1"),
                        createPod("pod2", "ns2")));

        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/pods"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(podList))));

        V1PodList result = podClient.list();

        assertThat(result).isNotNull();
        assertThat(result.getItems()).hasSize(2);

        apiServer.verify(getRequestedFor(urlPathEqualTo("/api/v1/pods")));
    }

    // ========== Create Tests ==========

    @Test
    void create_namespacedPod_createsResource() throws ApiException {
        V1Pod pod = createPod("new-pod", "default");
        apiServer.stubFor(
                post(urlPathEqualTo("/api/v1/namespaces/default/pods"))
                        .willReturn(aResponse()
                                .withStatus(201)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(pod))));

        V1Pod result = podClient.inNamespace("default").create(pod);

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("new-pod");

        apiServer.verify(postRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods")));
    }

    @Test
    void create_clusterScopedResource_createsResource() throws ApiException {
        V1Pod pod = createPod("cluster-pod", null);
        apiServer.stubFor(
                post(urlPathEqualTo("/api/v1/pods"))
                        .willReturn(aResponse()
                                .withStatus(201)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(pod))));

        V1Pod result = podClient.create(pod);

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("cluster-pod");

        apiServer.verify(postRequestedFor(urlPathEqualTo("/api/v1/pods")));
    }

    // ========== Update Tests ==========

    @Test
    void update_namespacedPod_updatesResource() throws ApiException {
        V1Pod pod = createPod("existing-pod", "default");
        pod.getMetadata().setResourceVersion("12345");
        
        apiServer.stubFor(
                put(urlPathEqualTo("/api/v1/namespaces/default/pods/existing-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(pod))));

        V1Pod result = podClient.inNamespace("default").withName("existing-pod").update(pod);

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("existing-pod");

        apiServer.verify(putRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/existing-pod")));
    }

    // ========== Delete Tests ==========

    @Test
    void delete_namespacedPod_deletesResource() throws ApiException {
        V1Status status = new V1Status().kind("Status").code(200).message("deleted");
        apiServer.stubFor(
                delete(urlPathEqualTo("/api/v1/namespaces/default/pods/delete-me"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(status))));

        boolean result = podClient.inNamespace("default").withName("delete-me").delete();

        assertThat(result).isTrue();
        apiServer.verify(deleteRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/delete-me")));
    }

    @Test
    void delete_notFound_returnsFalse() throws ApiException {
        apiServer.stubFor(
                delete(urlPathEqualTo("/api/v1/namespaces/default/pods/not-found"))
                        .willReturn(aResponse()
                                .withStatus(404)
                                .withBody("{\"kind\": \"Status\", \"code\": 404}")));

        boolean result = podClient.inNamespace("default").withName("not-found").delete();

        assertThat(result).isFalse();
    }

    // ========== Server-Side Apply Tests ==========

    @Test
    void serverSideApply_namespacedPod_appliesResource() throws ApiException {
        V1Pod pod = createPod("apply-pod", "default");
        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/apply-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(pod))));

        V1Pod result = podClient.inNamespace("default").withName("apply-pod")
                .serverSideApply(pod, "test-manager");

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("apply-pod");

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/apply-pod"))
                        .withQueryParam("fieldManager", equalTo("test-manager")));
    }

    @Test
    void serverSideApply_withForceConflicts_sendsForceParameter() throws ApiException {
        V1Pod pod = createPod("apply-pod", "default");
        apiServer.stubFor(
                patch(urlPathEqualTo("/api/v1/namespaces/default/pods/apply-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(pod))));

        V1Pod result = podClient.inNamespace("default").withName("apply-pod")
                .serverSideApply(pod, "test-manager", true);

        assertThat(result).isNotNull();

        apiServer.verify(
                patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/apply-pod"))
                        .withQueryParam("force", equalTo("true")));
    }

    // ========== Fluent Interface Tests ==========

    @Test
    void fluentInterface_chainedCalls_preservesState() throws ApiException {
        V1Pod pod = createPod("chained-pod", "test-ns");
        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/namespaces/test-ns/pods/chained-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(pod))));

        ResourceClient<V1Pod, V1PodList> namespacedClient = podClient.inNamespace("test-ns");
        ResourceClient<V1Pod, V1PodList> namedClient = namespacedClient.withName("chained-pod");
        V1Pod result = namedClient.get();

        assertThat(result).isNotNull();
        assertThat(result.getMetadata().getName()).isEqualTo("chained-pod");
    }

    @Test
    void inNamespace_returnsNewClient() {
        ResourceClient<V1Pod, V1PodList> namespacedClient = podClient.inNamespace("my-namespace");
        
        assertThat(namespacedClient).isNotNull();
        assertThat(namespacedClient).isNotSameAs(podClient);
    }

    @Test
    void withName_returnsNewClient() {
        ResourceClient<V1Pod, V1PodList> namedClient = podClient.withName("my-pod");
        
        assertThat(namedClient).isNotNull();
        assertThat(namedClient).isNotSameAs(podClient);
    }

    @Test
    void withLabel_addsLabelSelector() throws ApiException {
        V1PodList podList = new V1PodList()
                .metadata(new V1ListMeta())
                .items(List.of(createPod("labeled-pod", "default")));

        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/namespaces/default/pods"))
                        .withQueryParam("labelSelector", equalTo("app=test"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(podList))));

        V1PodList result = podClient.inNamespace("default").withLabel("app", "test").list();

        assertThat(result.getItems()).hasSize(1);
    }

    // ========== Error Handling Tests ==========

    @Test
    void get_serverError_throwsApiException() {
        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/namespaces/default/pods/error-pod"))
                        .willReturn(aResponse()
                                .withStatus(500)
                                .withBody("{\"message\": \"Internal Server Error\"}")));

        assertThatThrownBy(() -> 
                podClient.inNamespace("default").withName("error-pod").get())
                .isInstanceOf(ApiException.class);
    }

    @Test
    void create_conflict_throwsApiException() {
        V1Pod pod = createPod("conflict-pod", "default");
        apiServer.stubFor(
                post(urlPathEqualTo("/api/v1/namespaces/default/pods"))
                        .willReturn(aResponse()
                                .withStatus(409)
                                .withBody("{\"message\": \"AlreadyExists\"}")));

        assertThatThrownBy(() -> 
                podClient.inNamespace("default").create(pod))
                .isInstanceOf(ApiException.class);
    }

    // ========== CreateOrReplace Tests ==========

    @Test
    void createOrReplace_existingResource_updatesResource() throws ApiException {
        V1Pod existingPod = createPod("existing-pod", "default");
        existingPod.getMetadata().setResourceVersion("12345");
        
        V1Pod updatedPod = createPod("existing-pod", "default");
        updatedPod.getMetadata().setResourceVersion("12346");

        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/namespaces/default/pods/existing-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(existingPod))));

        apiServer.stubFor(
                put(urlPathEqualTo("/api/v1/namespaces/default/pods/existing-pod"))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(updatedPod))));

        V1Pod result = podClient.inNamespace("default").createOrReplace(existingPod);

        assertThat(result).isNotNull();
        apiServer.verify(putRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/existing-pod")));
    }

    @Test
    void createOrReplace_newResource_createsResource() throws ApiException {
        V1Pod newPod = createPod("new-pod", "default");

        apiServer.stubFor(
                get(urlPathEqualTo("/api/v1/namespaces/default/pods/new-pod"))
                        .willReturn(aResponse()
                                .withStatus(404)
                                .withBody("{\"kind\": \"Status\", \"code\": 404}")));

        apiServer.stubFor(
                post(urlPathEqualTo("/api/v1/namespaces/default/pods"))
                        .willReturn(aResponse()
                                .withStatus(201)
                                .withHeader("Content-Type", "application/json")
                                .withBody(json.serialize(newPod))));

        V1Pod result = podClient.inNamespace("default").createOrReplace(newPod);

        assertThat(result).isNotNull();
        apiServer.verify(postRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods")));
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

    private V1Pod createReadyPod(String name, String namespace) {
        return createPod(name, namespace)
                .status(new V1PodStatus()
                        .phase("Running")
                        .conditions(List.of(
                                new V1PodCondition()
                                        .type("Ready")
                                        .status("True"))));
    }
}
