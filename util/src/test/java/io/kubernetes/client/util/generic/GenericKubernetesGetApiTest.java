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

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1JobList;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class GenericKubernetesGetApiTest {

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

  private GenericKubernetesApi<V1Job, V1JobList> jobClient; // non-core built-in resource
  private GenericKubernetesApi<FooCustomResource, FooCustomResourceList>
      fooClient; // custom resource

  @BeforeEach
  void setup() {
    ApiClient apiClient =
        new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();
    jobClient =
        new GenericKubernetesApi<>(V1Job.class, V1JobList.class, "batch", "v1", "jobs", apiClient);
    fooClient =
        new GenericKubernetesApi<>(
            FooCustomResource.class,
            FooCustomResourceList.class,
            "example.io",
            "v1",
            "foos",
            apiClient);
  }

  @Test
  void returningNormalObjectShouldWork() {
    V1Job job = new V1Job().kind("Job");
    FooCustomResource foo = new FooCustomResource();

    apiServer.stubFor(
        get(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/noxu"))
            .willReturn(aResponse().withStatus(200).withBody(JSON.serialize(job))));
    apiServer.stubFor(
        get(urlEqualTo("/apis/example.io/v1/namespaces/default/foos/noxu"))
            .willReturn(aResponse().withStatus(200).withBody(JSON.serialize(foo))));

    KubernetesApiResponse<V1Job> jobResp = jobClient.get("default", "noxu");
    KubernetesApiResponse<FooCustomResource> fooResp = fooClient.get("default", "noxu");

    assertThat(jobResp.getObject()).isEqualTo(job);
    assertThat(fooResp.getObject()).isEqualTo(foo);
    assertThat(jobResp.getStatus()).isNull();
    assertThat(fooResp.getStatus()).isNull();
  }

  @Test
  void returningStatusShouldWork() {
    V1Status forbiddenStatus = new V1Status().kind("Status");

    apiServer.stubFor(
        get(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/noxu"))
            .willReturn(aResponse().withStatus(403).withBody(JSON.serialize(forbiddenStatus))));
    apiServer.stubFor(
        get(urlEqualTo("/apis/example.io/v1/namespaces/default/foos/noxu"))
            .willReturn(aResponse().withStatus(403).withBody(JSON.serialize(forbiddenStatus))));

    KubernetesApiResponse<V1Job> jobResp = jobClient.get("default", "noxu");
    KubernetesApiResponse<FooCustomResource> fooResp = fooClient.get("default", "noxu");

    assertThat(jobResp.getStatus()).isEqualTo(forbiddenStatus);
    assertThat(fooResp.getStatus()).isEqualTo(forbiddenStatus);
    assertThat(jobResp.getObject()).isNull();
    assertThat(fooResp.getObject()).isNull();
  }
}
