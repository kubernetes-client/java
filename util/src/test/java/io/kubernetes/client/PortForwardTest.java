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
import static io.kubernetes.client.ExecTest.makeStream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import io.kubernetes.client.PortForward.PortForwardResult;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.WebSocketStreamHandler;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/** Tests for the PortForward helper class */
public class PortForwardTest {
  private String namespace;
  private String podName;

  private ApiClient client;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort());

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();

    namespace = "default";
    podName = "apod";
  }

  @Test
  public void testUrl() throws IOException, ApiException, InterruptedException {
    PortForward forward = new PortForward(client);

    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name(podName).namespace(namespace));

    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/portforward"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    int portNumber = 8080;
    List<Integer> ports = new ArrayList<>();
    ports.add(portNumber);
    assertThrows(
        ApiException.class,
        () -> {
          InputStream inputStream = forward.forward(pod, ports).getInputStream(portNumber);
          // block until the connection is established
          inputStream.read();
          inputStream.close();
        });

    wireMockRule.verify(
        getRequestedFor(
                urlPathEqualTo(
                    "/api/v1/namespaces/" + namespace + "/pods/" + podName + "/portforward"))
            .withQueryParam("ports", equalTo(Integer.toString(portNumber))));
  }

  @Test
  public void testPortForwardResult() throws IOException, InterruptedException {
    WebSocketStreamHandler handler = new WebSocketStreamHandler();
    List<Integer> ports = new ArrayList<>();
    ports.add(80);
    ports.add(800);

    final PortForwardResult result = new PortForwardResult(handler, ports);

    String msgData = "this is a test datum";
    String msgData2 = "this is a different test datum";

    handler.open("wss", null);
    handler.bytesMessage(
        makeStream(new byte[] {0, 80, 0}, msgData.getBytes(StandardCharsets.UTF_8)));
    handler.bytesMessage(
        makeStream(new byte[] {2, 32, 3}, msgData2.getBytes(StandardCharsets.UTF_8)));

    final Object block = new Object();
    Thread t =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  result.init();
                  synchronized (block) {
                    block.notifyAll();
                  }
                } catch (IOException ex) {
                  ex.printStackTrace();
                }
              }
            });
    synchronized (block) {
      t.start();
      block.wait();
    }

    InputStream is = result.getInputStream(80);
    assertNotNull(is);

    InputStream is2 = result.getInputStream(800);
    assertNotNull(is2);

    byte[] bytes = new byte[msgData.length()];
    for (int i = 0; i < msgData.length(); i++) {
      bytes[i] = (byte) is.read();
    }

    assertEquals(msgData, new String(bytes, StandardCharsets.UTF_8));

    bytes = new byte[msgData2.length()];
    for (int i = 0; i < msgData2.length(); i++) {
      bytes[i] = (byte) is2.read();
    }

    assertEquals(msgData2, new String(bytes, StandardCharsets.UTF_8));

    assertEquals(null, result.getInputStream(8080));
    assertEquals(null, result.getErrorStream(8080));
    assertEquals(null, result.getOutboundStream(8080));
  }

  private Exception thrownException;

  @Test
  public void testBrokenPortPassing() throws IOException, InterruptedException {
    WebSocketStreamHandler handler = new WebSocketStreamHandler();
    List<Integer> ports = new ArrayList<>();
    ports.add(80);

    final PortForwardResult result = new PortForwardResult(handler, ports);

    String msgData = "this is a test datum";
    handler.open("wss", null);
    handler.bytesMessage(makeStream(new byte[] {66}, msgData.getBytes(StandardCharsets.UTF_8)));

    final Object block = new Object();
    Thread t =
        new Thread(
            () -> {
              try {
                result.init();
              } catch (IOException ex) {
                thrownException = ex;
              } finally {
                synchronized (block) {
                  block.notifyAll();
                }
              }
            });
    synchronized (block) {
      t.start();
      Thread.sleep(2000);
      handler.close();
      block.wait();
    }

    assertNotNull(thrownException);
    assertTrue(thrownException instanceof IOException);
  }
}
