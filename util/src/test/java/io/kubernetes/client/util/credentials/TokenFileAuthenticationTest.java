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
package io.kubernetes.client.util.credentials;

import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.okForContentType;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.Resources;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import java.io.File;
import java.time.Instant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class TokenFileAuthenticationTest {
  private static final String SERVICEACCOUNT_TOKEN1_PATH =
      new File(Resources.getResource("token1").getPath()).toString();
  private static final String SERVICEACCOUNT_TOKEN2_PATH =
      new File(Resources.getResource("token2").getPath()).toString();
  private TokenFileAuthentication auth;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @BeforeEach
  void setup() {
    final ApiClient client = new ApiClient();
    client.setBasePath("http://localhost:" + apiServer.getPort());
    this.auth = new TokenFileAuthentication(SERVICEACCOUNT_TOKEN1_PATH);
    this.auth.provide(client);
    Configuration.setDefaultApiClient(client);
  }

  @Test
  void tokenProvided() throws ApiException {
    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/pods")).willReturn(okForContentType("application/json",
                "{\"items\":[]}")));
    CoreV1Api api = new CoreV1Api();

    api.listPodForAllNamespaces().execute();
    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods"))
            .withHeader("Authorization", equalTo("Bearer token1")));

    this.auth.setFile(SERVICEACCOUNT_TOKEN2_PATH);
    api.listPodForAllNamespaces().execute();
    apiServer.verify(
        2,
        getRequestedFor(urlPathEqualTo("/api/v1/pods"))
            .withHeader("Authorization", equalTo("Bearer token1")));

    this.auth.setExpiry(Instant.now().minusSeconds(1));
    api.listPodForAllNamespaces().execute();
    apiServer.verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods"))
            .withHeader("Authorization", equalTo("Bearer token2")));
  }
}
