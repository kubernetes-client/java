/*
Copyright 2018 The Kubernetes Authors.
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
package io.kubernetes.client;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.Attach.AttachResult;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/** Tests for the Attach helper class */
public class AttachTest {
  private String namespace;
  private String podName;
  private String container;

  private ApiClient client;

  private static final int PORT = 8089;
  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + PORT).build();

    namespace = "default";
    podName = "apod";
    container = "acontainer";
  }

  @Test
  public void testUrl() throws IOException, ApiException, InterruptedException {
    Attach attach = new Attach(client);

    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    AttachResult res1 = attach.attach(namespace, podName, container, false, false);
    AttachResult res2 = attach.attach(namespace, podName, true);

    // TODO: Kill this sleep, the trouble is that the test tries to validate before the connection
    // event has happened
    Thread.sleep(2000);

    res1.close();
    res2.close();

    verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .withQueryParam("stdin", equalTo("false"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("container", equalTo(container)));

    verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .withQueryParam("stdin", equalTo("true"))
            .withQueryParam("tty", equalTo("false")));
  }
}
