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
package io.kubernetes.client;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.Attach.AttachResult;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.io.InputStream;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/** Tests for the Attach helper class */
public class AttachTest {
  private String namespace;
  private String podName;
  private String container;

  private ApiClient client;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort());

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();

    namespace = "default";
    podName = "apod";
    container = "acontainer";
  }

  @Test
  public void testUrl() throws IOException, ApiException, InterruptedException {
    Attach attach = new Attach(client);

    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .willReturn(
                aResponse()
                    .withFixedDelay(
                        5000) // A longer delay so the attach stream won't be closed too soon
                    .withStatus(404)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    AttachResult res1 = attach.attach(namespace, podName, container, false, false);
    AttachResult res2 = attach.attach(namespace, podName, true);
    AttachResult res3 =
        attach
            .newConnectionBuilder(namespace, podName)
            .setContainer(container)
            .setStdin(false)
            .setStdout(true)
            .connect();

    InputStream inputStream1 = res1.getStandardOutputStream();
    InputStream inputStream2 = res2.getStandardOutputStream();
    InputStream inputStream3 = res3.getStandardOutputStream();

    // block until responses are returned
    inputStream1.read();
    inputStream2.read();
    inputStream3.read();

    inputStream1.close();
    inputStream2.close();
    inputStream3.close();

    res1.close();
    res2.close();
    res3.close();

    wireMockRule.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .withQueryParam("stdin", equalTo("false"))
            .withQueryParam("stdout", equalTo("false"))
            .withQueryParam("stderr", equalTo("false"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("container", equalTo(container)));

    wireMockRule.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .withQueryParam("stdin", equalTo("true"))
            .withQueryParam("stdout", equalTo("false"))
            .withQueryParam("stderr", equalTo("false"))
            .withQueryParam("tty", equalTo("false")));

    wireMockRule.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .withQueryParam("stdin", equalTo("false"))
            .withQueryParam("stdout", equalTo("true"))
            .withQueryParam("stderr", equalTo("false"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("container", equalTo(container)));
  }
}
