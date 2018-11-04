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
import static org.junit.Assert.assertEquals;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.common.io.ByteStreams;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodSpec;
import io.kubernetes.client.util.ClientBuilder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/** Tests for the PodLogs helper class */
public class PodLogsTest {
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
    container = "container";
  }

  @Test
  public void testNotFound() throws ApiException, IOException {
    V1Pod pod =
        new V1Pod()
            .metadata(new V1ObjectMeta().name(podName).namespace(namespace))
            .spec(
                new V1PodSpec()
                    .containers(Arrays.asList(new V1Container().name(container).image("nginx"))));

    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/log"))
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withHeader("Content-Type", "text/plain")
                    .withBody("Not Found")));

    PodLogs logs = new PodLogs(client);
    boolean thrown = false;
    try {
      logs.streamNamespacedPodLog(pod);
    } catch (ApiException ex) {
      assertEquals(404, ex.getCode());
      thrown = true;
    }
    assertEquals(thrown, true);
    verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/log"))
            .withQueryParam("container", equalTo(container))
            .withQueryParam("follow", equalTo("true"))
            .withQueryParam("pretty", equalTo("false"))
            .withQueryParam("previous", equalTo("false"))
            .withQueryParam("timestamps", equalTo("false")));
  }

  @Test
  public void testStream() throws ApiException, IOException {
    V1Pod pod =
        new V1Pod()
            .metadata(new V1ObjectMeta().name(podName).namespace(namespace))
            .spec(
                new V1PodSpec()
                    .containers(Arrays.asList(new V1Container().name(container).image("nginx"))));

    String content = "this is some\n content for \n various logs \n done";

    stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/log"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withHeader("Content-Type", "text/plain")
                    .withBody(content)));

    PodLogs logs = new PodLogs(client);
    InputStream is = logs.streamNamespacedPodLog(pod);

    verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/log"))
            .withQueryParam("container", equalTo(container))
            .withQueryParam("follow", equalTo("true"))
            .withQueryParam("pretty", equalTo("false"))
            .withQueryParam("previous", equalTo("false"))
            .withQueryParam("timestamps", equalTo("false")));

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ByteStreams.copy(is, bos);
    assertEquals(content, bos.toString());
  }
}
