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
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.github.tomakehurst.wiremock.matching.AnythingPattern;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.exception.CopyNotSupportedException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.io.TempDir;

/** Tests for the Copy helper class */
class CopyTest {
  private String namespace;
  private String podName;
  private String[] cmd;

  private ApiClient client;

  @RegisterExtension
  static WireMockExtension apiServer =
      WireMockExtension.newInstance().options(wireMockConfig().dynamicPort()).build();

  @BeforeEach
  void setup() {
    client = new ClientBuilder().setBasePath("http://localhost:" + apiServer.getPort()).build();

    namespace = "default";
    podName = "apod";
  }

  @Test
  void url() {
    Copy copy = new Copy(client);

    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name(podName).namespace(namespace));

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    try {
      InputStream inputStream = copy.copyFileFromPod(pod, "container", "/some/path/to/file");
      // block until the connection is established
      inputStream.read();
      inputStream.close();
    } catch (IOException | ApiException | IllegalStateException e) {
      e.printStackTrace();
    }

    apiServer.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .withQueryParam("stdin", equalTo("false"))
            .withQueryParam("stdout", equalTo("true"))
            .withQueryParam("stderr", equalTo("true"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("command", new AnythingPattern()));
  }

  @Test
  void copyFileToPod(@TempDir Path tempDir) throws Exception {

    Path testFile = Files.createTempFile(tempDir, "testfile", null);

    Copy copy = new Copy(client);

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    // When attempting to write to the process outputstream in copyFileToPod, the
    // WebSocketStreamHandler is in a wait state because no websocket is created by mock, which
    // blocks the main thread. So here we execute the method in a thread.
    Thread t =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  copy.copyFileToPod(
                      namespace, podName, "", testFile, Paths.get("/copied-testfile"));
                } catch (IOException | ApiException ex) {
                  ex.printStackTrace();
                }
              }
            });
    t.start();
    Thread.sleep(2000);
    t.interrupt();

    apiServer.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .withQueryParam("stdin", equalTo("true"))
            .withQueryParam("stdout", equalTo("true"))
            .withQueryParam("stderr", equalTo("true"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("command", equalTo("sh"))
            .withQueryParam("command", equalTo("-c"))
            .withQueryParam("command", equalTo("tar -xmf - -C /")));
  }

  @Test
  void copyBinaryDataToPod() throws InterruptedException {

    byte[] testSrc = new byte[0];

    Copy copy = new Copy(client);

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    // When attempting to write to the process outputstream in copyFileToPod, the
    // WebSocketStreamHandler is in a wait state because no websocket is created by mock, which
    // blocks the main thread. So here we execute the method in a thread.
    Thread t =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  copy.copyFileToPod(
                      namespace, podName, "", testSrc, Paths.get("/copied-binarydata"));
                } catch (IOException | ApiException ex) {
                  ex.printStackTrace();
                }
              }
            });
    t.start();
    Thread.sleep(2000);
    t.interrupt();

    apiServer.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .withQueryParam("stdin", equalTo("true"))
            .withQueryParam("stdout", equalTo("true"))
            .withQueryParam("stderr", equalTo("true"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("command", equalTo("sh"))
            .withQueryParam("command", equalTo("-c"))
            .withQueryParam("command", equalTo("tar -xmf - -C /")));
  }

  @Test
  void testCopyDirectoryFromPod(@TempDir Path tempDir) throws Exception {
    Copy copy = new Copy(client);

    apiServer.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    Thread t =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  copy.copyDirectoryFromPod(
                      namespace,
                      podName,
                      "",
                      tempDir.toString(),
                      Paths.get("/copied-testDir"));
                } catch (IOException | ApiException | CopyNotSupportedException ex) {
                  ex.printStackTrace();
                }
              }
            });
    t.start();
    Thread.sleep(2000);
    t.interrupt();

    apiServer.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .withQueryParam("stdin", equalTo("false"))
            .withQueryParam("stdout", equalTo("true"))
            .withQueryParam("stderr", equalTo("true"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("command", equalTo("sh"))
            .withQueryParam("command", equalTo("-c"))
            .withQueryParam("command", equalTo("tar --version")));
  }
}
