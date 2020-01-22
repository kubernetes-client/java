package io.kubernetes.client.extended.generic;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.gson.Gson;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.util.ClientBuilder;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * @author zuoxiu.jm
 * @version : GenericKubernetesGetApiTest.java, v 0.1 2019年10月18日 1:52 PM zuoxiu.jm Exp $
 */
public class GenericKubernetesGetApiTest {

  @Rule public WireMockRule wireMockRule = new WireMockRule(8181);

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
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(job))));
    stubFor(
        get(urlEqualTo("/apis/example.io/v1/namespaces/default/foos/noxu"))
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(foo))));

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
            .willReturn(aResponse().withStatus(403).withBody(new Gson().toJson(forbiddenStatus))));
    stubFor(
        get(urlEqualTo("/apis/example.io/v1/namespaces/default/foos/noxu"))
            .willReturn(aResponse().withStatus(403).withBody(new Gson().toJson(forbiddenStatus))));

    KubernetesApiResponse<V1Job> jobResp = jobClient.get("default", "noxu");
    KubernetesApiResponse<FooCustomResource> fooResp = fooClient.get("default", "noxu");

    assertEquals(forbiddenStatus, jobResp.getStatus());
    assertEquals(forbiddenStatus, fooResp.getStatus());
    assertNull(jobResp.getObject());
    assertNull(fooResp.getObject());
  }
}
