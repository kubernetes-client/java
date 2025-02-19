/*
Copyright 2025 The Kubernetes Authors.
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
package io.kubernetes.client.util.generic;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1JobList;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.options.ListOptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class GenericKubernetesListApiTest {
    @RegisterExtension
    static WireMockExtension apiServer =
            WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

    private GenericKubernetesApi<V1Job, V1JobList> jobClient;

    @BeforeEach
    void setup() {
        ApiClient apiClient =
                new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
        jobClient =
                new GenericKubernetesApi<>(V1Job.class, V1JobList.class, "batch", "v1", "jobs", apiClient);
    }

    @Test
    void listNamespacedJobWithAllListOptionsSet() {
        V1JobList jobList = new V1JobList().kind("PartialObjectMetadataList").metadata(new V1ListMeta());

        ListOptions listOptions = new ListOptions()
                ._continue("continue-token")
                .fieldSelector("metadata.name=foo")
                .labelSelector("app=web")
                .limit(10)
                .resourceVersion("12345")
                .timeoutSeconds(30)
                .isPartialObjectMetadataListRequest(true);

        apiServer.stubFor(
                get(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
                        .withHeader(
                                "Accept",
                                equalTo("application/json;as=PartialObjectMetadataList;g=meta.k8s.io;v=v1,application/json"))
                        .withQueryParam("continue", equalTo("continue-token"))
                        .withQueryParam("fieldSelector", equalTo("metadata.name=foo"))
                        .withQueryParam("labelSelector", equalTo("app=web"))
                        .withQueryParam("limit", equalTo("10"))
                        .withQueryParam("resourceVersion", equalTo("12345"))
                        .withQueryParam("timeoutSeconds", equalTo("30"))
                        .willReturn(aResponse().withStatus(200).withBody(JSON.serialize(jobList))));

        KubernetesApiResponse<V1JobList> response = jobClient.list("default", listOptions);

        assertThat(response.isSuccess()).isTrue();
        assertThat(response.getObject()).isEqualTo(jobList);
        assertThat(response.getStatus()).isNull();

        apiServer.verify(
                getRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
                        .withHeader(
                                "Accept",
                                equalTo("application/json;as=PartialObjectMetadataList;g=meta.k8s.io;v=v1,application/json"))
                        .withQueryParam("continue", equalTo("continue-token"))
                        .withQueryParam("fieldSelector", equalTo("metadata.name=foo"))
                        .withQueryParam("labelSelector", equalTo("app=web"))
                        .withQueryParam("limit", equalTo("10"))
                        .withQueryParam("resourceVersion", equalTo("12345"))
                        .withQueryParam("timeoutSeconds", equalTo("30")));
    }

    @Test
    void listNamespacedJobWithNoListOptionsSet() {
        V1JobList jobList = new V1JobList().kind("JobList").metadata(new V1ListMeta());

        apiServer.stubFor(
                get(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
                        .willReturn(aResponse().withStatus(200).withBody(JSON.serialize(jobList))));

        KubernetesApiResponse<V1JobList> response = jobClient.list("default", new ListOptions());

        assertThat(response.isSuccess()).isTrue();
        assertThat(response.getObject()).isEqualTo(jobList);
        assertThat(response.getStatus()).isNull();

        apiServer.verify(
                getRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
                        .withQueryParam("continue", absent())
                        .withQueryParam("fieldSelector", absent())
                        .withQueryParam("labelSelector", absent())
                        .withQueryParam("limit", absent())
                        .withQueryParam("resourceVersion", absent())
                        .withQueryParam("timeoutSeconds", absent()));
    }

    @Test
    void listClusterJobWithAllListOptionsSet() {
        V1JobList jobList = new V1JobList().kind("PartialObjectMetadataList").metadata(new V1ListMeta());

        ListOptions listOptions = new ListOptions()
                ._continue("continue-token")
                .fieldSelector("metadata.name=foo")
                .labelSelector("app=web")
                .limit(10)
                .resourceVersion("12345")
                .timeoutSeconds(30)
                .isPartialObjectMetadataListRequest(true);

        apiServer.stubFor(
                get(urlPathEqualTo("/apis/batch/v1/jobs"))
                        .withHeader(
                                "Accept",
                                equalTo("application/json;as=PartialObjectMetadataList;g=meta.k8s.io;v=v1,application/json"))
                        .withQueryParam("continue", equalTo("continue-token"))
                        .withQueryParam("fieldSelector", equalTo("metadata.name=foo"))
                        .withQueryParam("labelSelector", equalTo("app=web"))
                        .withQueryParam("limit", equalTo("10"))
                        .withQueryParam("resourceVersion", equalTo("12345"))
                        .withQueryParam("timeoutSeconds", equalTo("30"))
                        .willReturn(aResponse().withStatus(200).withBody(JSON.serialize(jobList))));

        KubernetesApiResponse<V1JobList> response = jobClient.list(listOptions);

        assertThat(response.isSuccess()).isTrue();
        assertThat(response.getObject()).isEqualTo(jobList);
        assertThat(response.getStatus()).isNull();

        apiServer.verify(
                getRequestedFor(urlPathEqualTo("/apis/batch/v1/jobs"))
                        .withHeader(
                                "Accept",
                                equalTo("application/json;as=PartialObjectMetadataList;g=meta.k8s.io;v=v1,application/json"))
                        .withQueryParam("continue", equalTo("continue-token"))
                        .withQueryParam("fieldSelector", equalTo("metadata.name=foo"))
                        .withQueryParam("labelSelector", equalTo("app=web"))
                        .withQueryParam("limit", equalTo("10"))
                        .withQueryParam("resourceVersion", equalTo("12345"))
                        .withQueryParam("timeoutSeconds", equalTo("30")));
    }

    @Test
    void listClusterJobWithNoListOptionsSet() {
        V1JobList jobList = new V1JobList().kind("JobList").metadata(new V1ListMeta());

        apiServer.stubFor(
                get(urlPathEqualTo("/apis/batch/v1/jobs"))
                        .willReturn(aResponse().withStatus(200).withBody(JSON.serialize(jobList))));

        KubernetesApiResponse<V1JobList> response = jobClient.list(new ListOptions());

        assertThat(response.isSuccess()).isTrue();
        assertThat(response.getObject()).isEqualTo(jobList);
        assertThat(response.getStatus()).isNull();

        apiServer.verify(
                getRequestedFor(urlPathEqualTo("/apis/batch/v1/jobs"))
                        .withQueryParam("continue", absent())
                        .withQueryParam("fieldSelector", absent())
                        .withQueryParam("labelSelector", absent())
                        .withQueryParam("limit", absent())
                        .withQueryParam("resourceVersion", absent())
                        .withQueryParam("timeoutSeconds", absent()));
    }
}
