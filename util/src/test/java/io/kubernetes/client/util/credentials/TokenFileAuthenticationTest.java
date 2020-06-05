package io.kubernetes.client.util.credentials;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.common.io.Resources;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import java.io.IOException;
import java.time.Instant;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class TokenFileAuthenticationTest {
  private static final String SERVICEACCOUNT_TOKEN1_PATH =
      Resources.getResource("token1").getPath();
  private static final String SERVICEACCOUNT_TOKEN2_PATH =
      Resources.getResource("token2").getPath();
  private static final int PORT = 8089;
  private TokenFileAuthentication auth;

  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);

  @Before
  public void setup() throws IOException {
    final ApiClient client = new ApiClient();
    client.setBasePath("http://localhost:" + PORT);
    this.auth = new TokenFileAuthentication(SERVICEACCOUNT_TOKEN1_PATH);
    this.auth.provide(client);
    Configuration.setDefaultApiClient(client);
  }

  @Test
  public void testTokenProvided() throws IOException, ApiException {
    stubFor(
        get(urlPathEqualTo("/api/v1/pods")).willReturn(okForContentType("application/json", "{}")));
    CoreV1Api api = new CoreV1Api();

    api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
    WireMock.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods"))
            .withHeader("Authorization", equalTo("Bearer token1")));

    this.auth.setFile(SERVICEACCOUNT_TOKEN2_PATH);
    api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
    WireMock.verify(
        2,
        getRequestedFor(urlPathEqualTo("/api/v1/pods"))
            .withHeader("Authorization", equalTo("Bearer token1")));

    this.auth.setExpiry(Instant.now().minusSeconds(1));
    api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
    WireMock.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods"))
            .withHeader("Authorization", equalTo("Bearer token2")));
  }
}
