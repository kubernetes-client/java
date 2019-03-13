package io.kubernetes.client.pager;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static org.junit.Assert.assertEquals;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.common.io.Resources;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.models.V1NamespaceList;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.PagerParams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class PagerTest {

  private ApiClient client;
  private static final String LIST_FILE_PATH =
      Resources.getResource("namespace-list.json").getPath();
  private static final int PORT = 8087;
  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + PORT).build();
  }

  @Test
  public void testPaginationForNamespaceList() throws IOException {
    String namespaceListStr = new String(Files.readAllBytes(Paths.get(LIST_FILE_PATH)));
    CoreV1Api api = new CoreV1Api(client);

    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("limit", equalTo("1"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody(namespaceListStr)));
    Pager pager =
        new Pager(
            (PagerParams param) -> {
              try {
                return api.listNamespaceCall(
                    null,
                    null,
                    param.getContinue(),
                    null,
                    null,
                    param.getLimit(),
                    null,
                    null,
                    null,
                    null,
                    null);
              } catch (Exception e) {
                throw new RuntimeException(e);
              }
            },
            client,
            1,
            V1NamespaceList.class);
    while (pager.hasNext()) {
      V1NamespaceList list = pager.next();
      List<V1Namespace> items = list.getItems();
      assertEquals(1, items.size());
      for (V1Namespace namespace : items) {
        assertEquals("default", namespace.getMetadata().getName());
      }
    }

    verify(
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces"))
            .withQueryParam("limit", equalTo("1")));
  }
}
