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

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.kubernetes.client.Attach.AttachResult;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

/** Tests for the Attach helper class */
class AttachTest {
  private String namespace;
  private String podName;
  private String container;

  private ApiClient client;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(options().dynamicPort()).build();

  @BeforeEach
  void setup() {
    client = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();

    namespace = "default";
    podName = "apod";
    container = "acontainer";
  }

  @Test
  void url() throws IOException, ApiException {
    Attach attach = new Attach(client);

    apiServer.stubFor(
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

    apiServer.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .withQueryParam("stdin", equalTo("false"))
            .withQueryParam("stdout", equalTo("false"))
            .withQueryParam("stderr", equalTo("false"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("container", equalTo(container)));

    apiServer.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .withQueryParam("stdin", equalTo("true"))
            .withQueryParam("stdout", equalTo("false"))
            .withQueryParam("stderr", equalTo("false"))
            .withQueryParam("tty", equalTo("false")));

    apiServer.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/attach"))
            .withQueryParam("stdin", equalTo("false"))
            .withQueryParam("stdout", equalTo("true"))
            .withQueryParam("stderr", equalTo("false"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("container", equalTo(container)));
  }
}
