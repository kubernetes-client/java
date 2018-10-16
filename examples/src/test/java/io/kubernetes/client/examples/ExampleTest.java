package io.kubernetes.client.examples;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.Assert.assertEquals;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.models.V1ObjectMeta;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;

public class ExampleTest {
  private static final int PORT = 8089;
  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);

  @Test
  public void exactUrlOnly() throws IOException, ApiException {
    ApiClient client = new ApiClient();
    client.setBasePath("http://localhost:" + PORT);
    Configuration.setDefaultApiClient(client);

    V1Namespace ns1 = new V1Namespace().metadata(new V1ObjectMeta().name("name"));

    stubFor(
        get(urlEqualTo("/api/v1/namespaces/name"))
            .willReturn(
                aResponse()
                    .withHeader("Content-Type", "application/json")
                    .withBody(client.getJSON().serialize(ns1))));

    CoreV1Api api = new CoreV1Api();
    V1Namespace ns2 = api.readNamespace("name", null, null, null);
    assertEquals(ns1, ns2);
  }
}
