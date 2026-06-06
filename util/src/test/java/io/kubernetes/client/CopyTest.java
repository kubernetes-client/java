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
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/** Tests for the Copy helper class */
class CopyTest {
  private String namespace;
  private String podName;
  private String[] cmd;

  private ApiClient client;

  private static class MockProcess extends Process {
    private final InputStream inputStream;

    MockProcess(String stdout) {
      this.inputStream = new ByteArrayInputStream(stdout.getBytes());
    }

    @Override
    public OutputStream getOutputStream() {
      return OutputStream.nullOutputStream();
    }

    @Override
    public InputStream getInputStream() {
      return inputStream;
    }

    @Override
    public InputStream getErrorStream() {
      return InputStream.nullInputStream();
    }

    @Override
    public int waitFor() {
      return 0;
    }

    @Override
    public int exitValue() {
      return 0;
    }

    @Override
    public void destroy() {
      // no-op for tests
    }
  }

  private static class MockCopy extends Copy {
    private final Map<String, String> listingsByPath;

    MockCopy(Map<String, String> listingsByPath) {
      this.listingsByPath = listingsByPath;
    }

    @Override
    public Process exec(
        String namespace,
        String name,
        String[] command,
        String container,
        boolean stdin,
        boolean tty) {
      String cmd = command[2];
      String srcPath = cmd.substring("ls -F ".length());
      return new MockProcess(listingsByPath.getOrDefault(srcPath, ""));
    }

    @Override
    public InputStream copyFileFromPod(String namespace, String pod, String srcPath)
        throws ApiException, IOException {
      return new ByteArrayInputStream("test-data".getBytes());
    }
  }

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

  @Test
  void rejectsPathTraversalInNonTarCopy(@TempDir Path tempDir) throws Exception {
    Path sourceRoot = Paths.get("/src");
    Path destinationRoot = tempDir.resolve("dest");
    Path escapedFile = tempDir.resolve("escape.txt");

    Map<String, String> listingsByPath = new HashMap<>();
    listingsByPath.put(sourceRoot.toString(), "../escape.txt\n");

    Copy copy = new MockCopy(listingsByPath);

    assertThrows(
        IOException.class,
        () ->
            copy.copyDirectoryFromPod(
                namespace,
                podName,
                null,
                sourceRoot.toString(),
                destinationRoot,
                false));

    assertFalse(Files.exists(escapedFile));
  }

  @Test
  void copiesSafeEntriesInNonTarMode(@TempDir Path tempDir) throws Exception {
    Path sourceRoot = Paths.get("/src");
    Path destinationRoot = tempDir.resolve("dest");
    Files.createDirectories(destinationRoot);

    Map<String, String> listingsByPath = new HashMap<>();
    listingsByPath.put(sourceRoot.toString(), "safe.txt\n");

    Copy copy = new MockCopy(listingsByPath);

    copy.copyDirectoryFromPod(
        namespace,
        podName,
        null,
        sourceRoot.toString(),
        destinationRoot,
        false);

    Path copied = destinationRoot.resolve("safe.txt");
    assertTrue(Files.exists(copied));
    assertEquals("test-data", Files.readString(copied));
  }
}
