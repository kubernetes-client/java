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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.JSON;
import io.kubernetes.client.openapi.models.V1Job;
import io.kubernetes.client.openapi.models.V1JobList;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class GenericKubernetesGetApiTest {

  @Rule public WireMockRule wireMockRule = new WireMockRule(8181);

  private JSON json = new JSON();
  private GenericKubernetesApi<V1Job, V1JobList> jobClient; // non-core built-in resource
  private GenericKubernetesApi<FooCustomResource, FooCustomResourceList>
      fooClient; // custom resource

  @Before
  public void setup() {
    ApiClient apiClient = new ClientBuilder().setBasePath("http://localhost:" + 8181).build();
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
  public void returningNormalObjectShouldWork() {
    V1Job job = new V1Job().kind("Job");
    FooCustomResource foo = new FooCustomResource();

    stubFor(
        get(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/noxu"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(job))));
    stubFor(
        get(urlEqualTo("/apis/example.io/v1/namespaces/default/foos/noxu"))
            .willReturn(aResponse().withStatus(200).withBody(json.serialize(foo))));

    KubernetesApiResponse<V1Job> jobResp = jobClient.get("default", "noxu");
    KubernetesApiResponse<FooCustomResource> fooResp = fooClient.get("default", "noxu");

    assertEquals(job, jobResp.getObject());
    assertEquals(foo, fooResp.getObject());
    assertNull(jobResp.getStatus());
    assertNull(fooResp.getStatus());
  }

  @Test
  public void returningStatusShouldWork() {
    V1Status forbiddenStatus = new V1Status().kind("Status");

    stubFor(
        get(urlEqualTo("/apis/batch/v1/namespaces/default/jobs/noxu"))
            .willReturn(aResponse().withStatus(403).withBody(json.serialize(forbiddenStatus))));
    stubFor(
        get(urlEqualTo("/apis/example.io/v1/namespaces/default/foos/noxu"))
            .willReturn(aResponse().withStatus(403).withBody(json.serialize(forbiddenStatus))));

    KubernetesApiResponse<V1Job> jobResp = jobClient.get("default", "noxu");
    KubernetesApiResponse<FooCustomResource> fooResp = fooClient.get("default", "noxu");

    assertEquals(forbiddenStatus, jobResp.getStatus());
    assertEquals(forbiddenStatus, fooResp.getStatus());
    assertNull(jobResp.getObject());
    assertNull(fooResp.getObject());
  }
}
