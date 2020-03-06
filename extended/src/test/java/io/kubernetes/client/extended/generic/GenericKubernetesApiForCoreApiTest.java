package io.kubernetes.client.extended.generic;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.*;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.gson.Gson;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class GenericKubernetesApiForCoreApiTest {

  @Rule public WireMockRule wireMockRule = new WireMockRule(8181);

  private GenericKubernetesApi<V1Pod, V1PodList> podClient;

  @Before
  public void setup() throws IOException {
    ApiClient apiClient = new ClientBuilder().setBasePath("http://localhost:" + 8181).build();
    podClient =
        new GenericKubernetesApi<>(V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);
  }

  // test delete
  @Test
  public void deleteNamespacedPodReturningStatus() {
    V1Status status = new V1Status().kind("Status").code(200).message("good!");
    stubFor(
        delete(urlEqualTo("/api/v1/namespaces/default/pods/foo1"))
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(status))));

    KubernetesApiResponse<V1Pod> deletePodResp = podClient.delete("default", "foo1", null);
    assertTrue(deletePodResp.isSuccess());
    assertEquals(status, deletePodResp.getStatus());
    assertNull(deletePodResp.getObject());
    verify(1, deleteRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1")));
  }

  @Test
  public void deleteNamespacedPodReturningDeletedObject() {
    V1Pod foo1 =
        new V1Pod().kind("Pod").metadata(new V1ObjectMeta().namespace("default").name("foo1"));

    stubFor(
        delete(urlEqualTo("/api/v1/namespaces/default/pods/foo1"))
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(foo1))));

    KubernetesApiResponse<V1Pod> deletePodResp = podClient.delete("default", "foo1");
    assertTrue(deletePodResp.isSuccess());
    assertEquals(foo1, deletePodResp.getObject());
    assertNull(deletePodResp.getStatus());
    verify(1, deleteRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1")));
  }

  @Test
  public void deleteNamespacedPodReturningForbiddenStatus() {
    V1Status status = new V1Status().kind("Status").code(403).message("good!");

    stubFor(
        delete(urlEqualTo("/api/v1/namespaces/default/pods/foo1"))
            .willReturn(aResponse().withStatus(403).withBody(new Gson().toJson(status))));

    KubernetesApiResponse<V1Pod> deletePodResp = podClient.delete("default", "foo1");
    assertFalse(deletePodResp.isSuccess());
    assertEquals(status, deletePodResp.getStatus());
    assertNull(deletePodResp.getObject());
    verify(1, deleteRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1")));
  }

  @Test
  public void listNamespacedPodReturningObject() {
    V1PodList podList = new V1PodList().kind("PodList").metadata(new V1ListMeta());

    stubFor(
        get(urlEqualTo("/api/v1/namespaces/default/pods"))
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(podList))));
    KubernetesApiResponse<V1PodList> podListResp = podClient.list("default");
    assertTrue(podListResp.isSuccess());
    assertEquals(podList, podListResp.getObject());
    assertNull(podListResp.getStatus());
    verify(1, getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods")));
  }

  @Test
  public void listClusterPodReturningObject() {
    V1PodList podList = new V1PodList().kind("PodList").metadata(new V1ListMeta());

    stubFor(
        get(urlEqualTo("/api/v1/pods"))
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(podList))));
    KubernetesApiResponse<V1PodList> podListResp = podClient.list();
    assertTrue(podListResp.isSuccess());
    assertEquals(podList, podListResp.getObject());
    assertNull(podListResp.getStatus());
    verify(1, getRequestedFor(urlPathEqualTo("/api/v1/pods")));
  }

  @Test
  public void createNamespacedPodReturningObject() {
    V1Pod foo1 =
        new V1Pod().kind("Pod").metadata(new V1ObjectMeta().namespace("default").name("foo1"));

    stubFor(
        post(urlEqualTo("/api/v1/namespaces/default/pods"))
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(foo1))));
    KubernetesApiResponse<V1Pod> podListResp = podClient.create(foo1);
    assertTrue(podListResp.isSuccess());
    assertEquals(foo1, podListResp.getObject());
    assertNull(podListResp.getStatus());
    verify(1, postRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods")));
  }

  @Test
  public void updateNamespacedPodReturningObject() {
    V1Pod foo1 =
        new V1Pod().kind("Pod").metadata(new V1ObjectMeta().namespace("default").name("foo1"));

    stubFor(
        put(urlEqualTo("/api/v1/namespaces/default/pods/foo1"))
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(foo1))));
    KubernetesApiResponse<V1Pod> podListResp = podClient.update(foo1);
    assertTrue(podListResp.isSuccess());
    assertEquals(foo1, podListResp.getObject());
    assertNull(podListResp.getStatus());
    verify(1, putRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1")));
  }

  @Test
  public void patchNamespacedPodReturningObject() {
    V1Patch v1Patch = new V1Patch("{}");
    V1Pod foo1 =
        new V1Pod().kind("Pod").metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    stubFor(
        patch(urlEqualTo("/api/v1/namespaces/default/pods/foo1"))
            .withHeader("Content-Type", containing(V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH))
            .willReturn(aResponse().withStatus(200).withBody(new Gson().toJson(foo1))));
    KubernetesApiResponse<V1Pod> podPatchResp =
        podClient.patch("default", "foo1", V1Patch.PATCH_FORMAT_STRATEGIC_MERGE_PATCH, v1Patch);

    assertTrue(podPatchResp.isSuccess());
    assertEquals(foo1, podPatchResp.getObject());
    assertNull(podPatchResp.getStatus());
    verify(1, patchRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/pods/foo1")));
  }

  @Test
  public void testReadTimeoutShouldThrowException() {
    ApiClient apiClient = new ClientBuilder().setBasePath("http://localhost:" + 8181).build();
    apiClient.setHttpClient(
        apiClient
            .getHttpClient()
            .newBuilder()
            .readTimeout(1, TimeUnit.MILLISECONDS) // timeout everytime
            .build());
    podClient =
        new GenericKubernetesApi<>(V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);
    try {
      KubernetesApiResponse<V1Pod> response = podClient.get("foo", "test");
    } catch (Throwable t) {
      assertTrue(t.getCause() instanceof SocketTimeoutException);
      return;
    }
    fail("no exception happened");
  }
}
