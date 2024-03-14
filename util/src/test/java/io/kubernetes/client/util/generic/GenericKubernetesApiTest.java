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
package io.kubernetes.client.util.generic;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1JobList;
import io.kubernetes.client.openapi.models.V1JobStatus;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.Watchable;
import io.kubernetes.client.util.generic.options.GetOptions;
import io.kubernetes.client.util.generic.options.ListOptions;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class GenericKubernetesApiTest {

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

  private JSON json = new JSON();
  private GenericKubernetesApi<V1Job, V1JobList> jobClient;

  @BeforeEach
  void setup() {
    ApiClient apiClient =
        new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
    jobClient =
        new GenericKubernetesApi<>(V1Job.class, V1JobList.class, "batch", "v1", "jobs", apiClient);
  }

  // test delete
  @Test
  void deleteNamespacedJobReturningStatus() {
    V1Status status = new V1Status().kind("Status").code(200).message("good!");
    apiServer.stubFor(
        delete(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(status))));

    KubernetesApiResponse<V1Job> deleteJobResp = jobClient.delete("default", "foo1", null);
    assertThat(deleteJobResp.isSuccess()).isTrue();
    assertThat(deleteJobResp.getStatus()).isEqualTo(status);
    assertThat(deleteJobResp.getObject()).isNull();
    apiServer.verify(1, deleteRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1")));
  }

  @Test
  void deleteNamespacedJobReturningDeletedObject() {
    V1Job foo1 =
        new V1Job().kind("Job").metadata(new V1ObjectMeta().namespace("default").name("foo1"));

    apiServer.stubFor(
        delete(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(foo1))));

    KubernetesApiResponse<V1Job> deleteJobResp = jobClient.delete("default", "foo1");
    assertThat(deleteJobResp.isSuccess()).isTrue();
    assertThat(deleteJobResp.getObject()).isEqualTo(foo1);
    assertThat(deleteJobResp.getStatus()).isNull();
    apiServer.verify(1, deleteRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1")));
  }

  @Test
  void deleteNamespacedJobReturningForbiddenStatus() {
    V1Status status = new V1Status().kind("Status").code(403).message("good!");

    apiServer.stubFor(
        delete(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1"))
            .willReturn(aResponse().withStatus(403).withBody(json.serialize(status))));

    KubernetesApiResponse<V1Job> deleteJobResp = jobClient.delete("default", "foo1");
    assertThat(deleteJobResp.isSuccess()).isFalse();
    assertThat(deleteJobResp.getStatus()).isEqualTo(status);
    assertThat(deleteJobResp.getObject()).isNull();
    apiServer.verify(1, deleteRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1")));
  }

  @Test
  void listNamespacedJobReturningObject() {
    V1JobList jobList = new V1JobList().kind("JobList").metadata(new V1ListMeta());

    apiServer.stubFor(
        get(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(jobList))));
    KubernetesApiResponse<V1JobList> jobListResp = jobClient.list("default");
    assertThat(jobListResp.isSuccess()).isTrue();
    assertThat(jobListResp.getObject()).isEqualTo(jobList);
    assertThat(jobListResp.getStatus()).isNull();
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs")));
  }

  @Test
  void listNamespacedJobWithPartialMetadataObjectListHeader() {
    V1JobList jobList =
        new V1JobList().kind("PartialObjectMetadataList").metadata(new V1ListMeta());

    apiServer.stubFor(
        get(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(jobList))));

    GenericKubernetesApi<V1Job, V1JobList> pomClient =
        new GenericKubernetesApi<>(
            V1Job.class, V1JobList.class, "batch", "v1", "jobs", jobClient.getApiClient());

    KubernetesApiResponse<V1JobList> jobListResp =
        pomClient.list("default", new ListOptions().isPartialObjectMetadataListRequest(true));
    assertThat(jobListResp.isSuccess()).isTrue();
    assertThat(jobListResp.getObject()).isEqualTo(jobList);
    assertThat(jobListResp.getStatus()).isNull();
    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
            .withHeader(
                "Accept",
                equalTo(
                    "application/json;as=PartialObjectMetadataList;g=meta.k8s.io;v=v1,application/json")));
  }

  @Test
  void getNamespacedJobWithPartialMetadataObjectHeader() {
    V1Job job = new V1Job().kind("PartialObjectMetadata").metadata(new V1ObjectMeta());

    apiServer.stubFor(
        get(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/noxu"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(job))));

    GenericKubernetesApi<V1Job, V1JobList> pomClient =
        new GenericKubernetesApi<>(
            V1Job.class, V1JobList.class, "batch", "v1", "jobs", jobClient.getApiClient());

    KubernetesApiResponse<V1Job> jobResp =
        pomClient.get("default", "noxu", new GetOptions().isPartialObjectMetadataRequest(true));
    assertThat(jobResp.isSuccess()).isTrue();
    assertThat(jobResp.getObject()).isEqualTo(job);
    assertThat(jobResp.getStatus()).isNull();
    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/noxu"))
            .withHeader(
                "Accept",
                equalTo(
                    "application/json;as=PartialObjectMetadata;g=meta.k8s.io;v=v1,application/json")));
  }

  @Test
  void listClusterJobReturningObject() {
    V1JobList jobList = new V1JobList().kind("JobList").metadata(new V1ListMeta());

    apiServer.stubFor(
        get(urlPathEqualTo("/apis/batch/v1/jobs"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(jobList))));
    KubernetesApiResponse<V1JobList> jobListResp = jobClient.list();
    assertThat(jobListResp.isSuccess()).isTrue();
    assertThat(jobListResp.getObject()).isEqualTo(jobList);
    assertThat(jobListResp.getStatus()).isNull();
    apiServer.verify(1, getRequestedFor(urlPathEqualTo("/apis/batch/v1/jobs")));
  }

  @Test
  void createNamespacedJobReturningObject() {
    V1Job foo1 =
        new V1Job().kind("Job").metadata(new V1ObjectMeta().namespace("default").name("foo1"));

    apiServer.stubFor(
        post(urlEqualTo("/apis/batch/v1/namespaces/default/jobs"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(foo1))));
    KubernetesApiResponse<V1Job> jobListResp = jobClient.create(foo1);
    assertThat(jobListResp.isSuccess()).isTrue();
    assertThat(jobListResp.getObject()).isEqualTo(foo1);
    assertThat(jobListResp.getStatus()).isNull();
    apiServer.verify(1, postRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs")));
  }

  @Test
  void updateNamespacedJobReturningObject() {
    V1Job foo1 =
        new V1Job().kind("Job").metadata(new V1ObjectMeta().namespace("default").name("foo1"));

    apiServer.stubFor(
        put(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(foo1))));
    KubernetesApiResponse<V1Job> jobListResp = jobClient.update(foo1);
    assertThat(jobListResp.isSuccess()).isTrue();
    assertThat(jobListResp.getObject()).isEqualTo(foo1);
    assertThat(jobListResp.getStatus()).isNull();
    apiServer.verify(1, putRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1")));
  }

  @Test
  void updateStatusNamespacedJobReturningObject() {
    V1Job foo1 =
        new V1Job().kind("Job").metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    foo1.setStatus(new V1JobStatus().failed(1));

    apiServer.stubFor(
        patch(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1/status"))
            .willReturn(aResponse().withStatus(200).withBody(new JSON().serialize(foo1))));
    KubernetesApiResponse<V1Job> jobListResp = jobClient.updateStatus(foo1, t -> t.getStatus());
    assertThat(jobListResp.isSuccess()).isTrue();
    assertThat(jobListResp.getObject()).isEqualTo(foo1);
    assertThat(jobListResp.getStatus()).isNull();
    apiServer.verify(
        1, patchRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1/status")));
  }

  @Test
  void patchNamespacedJobReturningObject() {
    V1Patch v1Patch = new V1Patch("{}");
    V1Job foo1 =
        new V1Job().kind("Job").metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    apiServer.stubFor(
        patch(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(foo1))));
    KubernetesApiResponse<V1Job> jobPatchResp =
        jobClient.patch("default", "foo1", V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH, v1Patch);

    assertThat(jobPatchResp.isSuccess()).isTrue();
    assertThat(jobPatchResp.getObject()).isEqualTo(foo1);
    assertThat(jobPatchResp.getStatus()).isNull();
    apiServer.verify(1, patchRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1")));
  }

  @Test
  void patchNamespacedJobReturningEmpty() {
    V1Patch v1Patch = new V1Patch("{}");
    apiServer.stubFor(
        patch(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH))
            .willReturn(aResponse().withStatus(200).withBody("")));
    KubernetesApiResponse<V1Job> jobPatchResp =
        jobClient.patch("default", "foo1", V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH, v1Patch);

    assertThat(jobPatchResp.isSuccess()).isTrue();
    assertThat(jobPatchResp.getObject()).isNull();
    assertThat(jobPatchResp.getStatus().getMessage()).isEqualTo("Unexpected response body");
    assertThat(jobPatchResp.getStatus().getCode().intValue()).isEqualTo(200);
    apiServer.verify(1, patchRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs/foo1")));
  }

  @Test
  void watchNamespacedJobReturningObject() throws ApiException {
    V1JobList jobList = new V1JobList().kind("JobList").metadata(new V1ListMeta());

    apiServer.stubFor(
        get(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(jobList))));
    Watchable<V1Job> jobListWatch = jobClient.watch("default", new ListOptions());
    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/apis/batch/v1/namespaces/default/jobs"))
            .withQueryParam("watch", equalTo("true")));
  }

  @Test
  void readTimeoutShouldThrowException() {
    ApiClient apiClient =
        new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
    apiClient.setHttpClient(
        apiClient
            .getHttpClient()
            .newBuilder()
            .readTimeout(1, TimeUnit.MILLISECONDS) // timeout everytime
            .build());
    apiServer.stubFor(
        get(urlEqualTo("/apis/batch/v1/namespaces/foo/jobs/test"))
            .willReturn(aResponse().withFixedDelay(99999).withStatus(200).withBody("")));
    jobClient =
        new GenericKubernetesApi<>(V1Job.class, V1JobList.class, "batch", "v1", "jobs", apiClient);
    try {
      jobClient.get("foo", "test");
      failBecauseExceptionWasNotThrown(IllegalStateException.class);
    } catch (IllegalStateException e) {
      assertThat(e).hasCauseInstanceOf(SocketTimeoutException.class);
    }
  }
}
