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
import static com.github.tomakehurst.wiremock.client.WireMock.equalToJson;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static org.junit.Assert.assertEquals;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.exception.CreateConfigmapException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class ConfigmapsTest {

  private String namespace;
  private String configmapName;
  private String tempFileName;
  private ApiClient client;

  private static final int PORT = 8089;
  @Rule public WireMockRule wireMockRule = new WireMockRule(PORT);
  @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

  @Before
  public void setup() {
    client = new ClientBuilder().setBasePath("http://localhost:" + PORT).build();

    namespace = "default";
    configmapName = "foo-configmap";
    tempFileName = "foo.properties";
  }

  @Test
  public void testCreateFromFile() throws IOException, InterruptedException {
    Configmaps configmaps = new Configmaps(client);
    final File tempFile = tempFolder.newFile(tempFileName);
    FileUtils.writeStringToFile(tempFile, "foo=bar");
    tempFile.deleteOnExit();

    wireMockRule.stubFor(
        post(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  configmaps.create(namespace, configmapName, Paths.get(tempFile.getPath()));
                } catch (IOException | ApiException | CreateConfigmapException e) {
                  e.printStackTrace();
                }
              }
            });
    t.start();
    Thread.sleep(2000);
    t.interrupt();

    verify(
        postRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .withQueryParam("pretty", equalTo("false"))
            .withRequestBody(
                equalToJson(
                    "{\"apiVersion\": \"v1\",\"kind\": \"ConfigMap\",\"metadata\": {\"name\": \"foo-configmap\"}}")));
  }

  @Test
  public void testCreateFromStream() throws IOException, InterruptedException {
    Configmaps configmaps = new Configmaps(client);
    final File tempFile = tempFolder.newFile(tempFileName);
    FileUtils.writeStringToFile(tempFile, "foo=bar");
    InputStream inputStream = new FileInputStream(tempFile);
    tempFile.deleteOnExit();

    wireMockRule.stubFor(
        post(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  configmaps.create(namespace, configmapName, inputStream);
                } catch (IOException | ApiException | CreateConfigmapException e) {
                  e.printStackTrace();
                }
              }
            });
    t.start();
    Thread.sleep(2000);
    t.interrupt();

    verify(
        postRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .withQueryParam("pretty", equalTo("false"))
            .withRequestBody(
                equalToJson(
                    "{\"kind\": \"ConfigMap\",\"apiVersion\": \"v1\",\"metadata\": {\"name\": \"foo-configmap\"}}")));
  }

  @Test
  public void testCreateFromString() throws InterruptedException {
    Configmaps configmaps = new Configmaps(client);

    wireMockRule.stubFor(
        post(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  configmaps.create(namespace, configmapName, "foo=bar");
                } catch (IOException | ApiException | CreateConfigmapException e) {
                  e.printStackTrace();
                }
              }
            });
    t.start();
    Thread.sleep(2000);
    t.interrupt();

    verify(
        postRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .withQueryParam("pretty", equalTo("false"))
            .withRequestBody(
                equalToJson(
                    "{\"kind\": \"ConfigMap\",\"apiVersion\": \"v1\",\"metadata\": {\"name\": \"foo-configmap\"}}")));
  }

  @Test
  public void testCreateFromReader() throws InterruptedException, IOException {
    Configmaps configmaps = new Configmaps(client);
    final File tempFile = tempFolder.newFile(tempFileName);
    FileUtils.writeStringToFile(tempFile, "foo=bar");
    BufferedReader reader =
        new BufferedReader(new InputStreamReader(new FileInputStream(tempFile)));
    tempFile.deleteOnExit();

    wireMockRule.stubFor(
        post(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  configmaps.create(namespace, configmapName, reader);
                } catch (IOException | ApiException | CreateConfigmapException e) {
                  e.printStackTrace();
                }
              }
            });
    t.start();
    Thread.sleep(2000);
    t.interrupt();

    verify(
        postRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .withQueryParam("pretty", equalTo("false"))
            .withRequestBody(
                equalToJson(
                    "{\"kind\": \"ConfigMap\",\"apiVersion\": \"v1\",\"metadata\": {\"name\": \"foo-configmap\"}}")));
  }

  @Test
  public void testIfPathIsADirectory() throws IOException, ApiException {
    Configmaps configmaps = new Configmaps(client);
    final File tempFile = tempFolder.newFolder("subfolder");
    tempFile.deleteOnExit();

    boolean thrown = false;
    try {
      configmaps.create(namespace, configmapName, Paths.get(tempFile.getPath()));
    } catch (CreateConfigmapException ex) {
      thrown = true;
    }
    assertEquals(thrown, true);
  }

  @Test
  public void testIfConfigmapNameIsInvalid() throws IOException, ApiException {
    Configmaps configmaps = new Configmaps(client);
    final File tempFile = tempFolder.newFile(tempFileName);
    tempFile.deleteOnExit();

    boolean thrown = false;
    try {
      configmaps.create(namespace, null, Paths.get(tempFile.getPath()));
    } catch (CreateConfigmapException ex) {
      thrown = true;
    }
    assertEquals(thrown, true);
  }

  @Test
  public void testEncoding() throws IOException, InterruptedException {
    Configmaps configmaps = new Configmaps(client);
    final File tempFile = tempFolder.newFile(tempFileName);
    FileUtils.writeStringToFile(tempFile, "key=véälue");
    tempFile.deleteOnExit();

    wireMockRule.stubFor(
        post(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    Thread t =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                try {
                  configmaps.create(namespace, configmapName, Paths.get(tempFile.getPath()));
                } catch (IOException | ApiException | CreateConfigmapException e) {
                  e.printStackTrace();
                }
              }
            });
    t.start();
    Thread.sleep(2000);
    t.interrupt();

    verify(
        postRequestedFor(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/configmaps"))
            .withQueryParam("pretty", equalTo("false")));
  }
}
