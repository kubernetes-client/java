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
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.github.tomakehurst.wiremock.core.Admin;
import com.github.tomakehurst.wiremock.extension.Parameters;
import com.github.tomakehurst.wiremock.extension.PostServeAction;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import io.kubernetes.client.Exec.ExecProcess;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.Streams;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/** Tests for the Exec helper class */
public class ExecTest {

  public static class CountRequestAction extends PostServeAction {
    @Override
    public String getName() {
      return "semaphore";
    }

    @Override
    public void doAction(ServeEvent serveEvent, Admin admin, Parameters parameters) {
      Semaphore count = (Semaphore) parameters.get("semaphore");
      count.release();
    }
  }

  private static final String OUTPUT_EXIT0 = "{\"metadata\":{},\"status\":\"Success\"}";
  private static final String OUTPUT_EXIT1 =
      "{\"metadata\":{},\"status\":\"Failure\",\"message\":\"command terminated with non-zero exit code: Error executing in Docker Container: 1\",\"reason\":\"NonZeroExitCode\",\"details\":{\"causes\":[{\"reason\":\"ExitCode\",\"message\":\"1\"}]}}";
  private static final String OUTPUT_EXIT126 =
      "{\"metadata\":{},\"status\":\"Failure\",\"message\":\"command terminated with non-zero exit code: Error executing in Docker Container: 126\",\"reason\":\"NonZeroExitCode\",\"details\":{\"causes\":[{\"reason\":\"ExitCode\",\"message\":\"126\"}]}}";
  private static final String BAD_OUTPUT_INCOMPLETE_MSG1 =
      "{\"metadata\":{},\"status\":\"Failure\",\"message\":\"command terminated with non-zero exit code: Error executing in Docker Container: 1\",\"reas";
  private static final String OUTPUT_EXIT_BAD_INT =
      "{\"metadata\":{},\"status\":\"Failure\",\"message\":\"command terminated with non-zero exit code: Error executing in Docker Container: 126\",\"reason\":\"NonZeroExitCode\",\"details\":{\"causes\":[{\"reason\":\"ExitCode\",\"message\":\"not a number\"}]}}";

  private String namespace;
  private String podName;
  private String[] cmd;

  private ApiClient client;

  @Rule public WireMockRule wireMockRule = new WireMockRule(options().dynamicPort());

  @Before
  public void setup() throws IOException {
    client = new ClientBuilder().setBasePath("http://localhost:" + wireMockRule.port()).build();

    namespace = "default";
    podName = "apod";
    // TODO: When WireMock supports multiple query params with the same name expand
    // this
    // See: https://github.com/tomakehurst/wiremock/issues/398
    cmd = new String[] {"cmd"};
  }

  public static InputStream makeStream(int streamNum, byte[] data) {
    return makeStream(new byte[] {(byte) streamNum}, data);
  }

  public static InputStream makeStream(byte[] prefix, byte[] data) {
    byte[] out = new byte[prefix.length + data.length];
    System.arraycopy(prefix, 0, out, 0, prefix.length);
    System.arraycopy(data, 0, out, prefix.length, data.length);
    return new ByteArrayInputStream(out);
  }

  public static Thread asyncCopy(
      final InputStream is, final OutputStream os, CountDownLatch cLatch) {
    Thread t =
        new Thread(
            new Runnable() {
              public void run() {
                try {
                  Streams.copy(is, os);
                } catch (IOException ex) {
                  ex.printStackTrace();
                } finally {
                  cLatch.countDown();
                }
              }
            });
    t.start();
    return t;
  }

  @Test
  public void testExecProcess() throws IOException, InterruptedException {
    final ExecProcess process = new ExecProcess(client);
    process.getHandler().open("wss", null);
    String msgData = "This is the stdout message";
    String errData = "This is the stderr message";

    process.getHandler().bytesMessage(makeStream(1, msgData.getBytes(StandardCharsets.UTF_8)));
    process.getHandler().bytesMessage(makeStream(2, errData.getBytes(StandardCharsets.UTF_8)));

    final ByteArrayOutputStream stdout = new ByteArrayOutputStream();
    final ByteArrayOutputStream stderr = new ByteArrayOutputStream();
    CountDownLatch cLatch = new CountDownLatch(2);
    Thread t1 = asyncCopy(process.getInputStream(), stdout, cLatch);
    Thread t2 = asyncCopy(process.getErrorStream(), stderr, cLatch);

    process.getHandler().bytesMessage(makeStream(3, OUTPUT_EXIT0.getBytes(StandardCharsets.UTF_8)));

    cLatch.await();
    process.destroy();

    assertEquals(msgData, stdout.toString());
    assertEquals(errData, stderr.toString());
    assertEquals(false, process.isAlive());
    assertEquals(0, process.exitValue());
  }

  @Test
  public void testDefaultUnhandledError() throws IOException, InterruptedException {
    final Throwable throwable = mock(Throwable.class);
    final ExecProcess process = new ExecProcess(client);
    process.getHandler().open("wss", null);

    process.getHandler().failure(throwable);
    process.waitFor();

    verify(throwable, times(1)).printStackTrace();
    assertEquals(false, process.isAlive());
    assertEquals(-1975219, process.exitValue());
  }

  @Test
  public void testCustomUnhandledError() throws IOException, InterruptedException {
    final Consumer<Throwable> consumer = mock(Consumer.class);
    final Throwable throwable = mock(Throwable.class);
    final ExecProcess process = new ExecProcess(client, consumer);
    process.getHandler().open("wss", null);

    process.getHandler().failure(throwable);
    process.waitFor();

    verify(throwable, times(0)).printStackTrace();
    verify(consumer, times(1)).accept(throwable);
    assertEquals(false, process.isAlive());
    assertEquals(-1975219, process.exitValue());
  }

  @Test
  public void testUrl() throws IOException, ApiException, InterruptedException {
    final Consumer<Throwable> consumer = mock(Consumer.class);
    Exec exec = new Exec(client);
    exec.setOnUnhandledError(consumer);

    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name(podName).namespace(namespace));

    Semaphore getCount = new Semaphore(2);
    Parameters getParams = new Parameters();
    getParams.put("semaphore", getCount);

    wireMockRule.stubFor(
        get(urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .withPostServeAction("semaphore", getParams)
            .willReturn(
                aResponse()
                    .withStatus(404)
                    .withHeader("Content-Type", "application/json")
                    .withBody("{}")));

    Process p = exec.exec(pod, cmd, "container", true, false);
    p.waitFor();

    exec.newExecutionBuilder(pod.getMetadata().getNamespace(), pod.getMetadata().getName(), cmd)
        .setContainer("container")
        .setStdin(false)
        .setStderr(false)
        .execute()
        .waitFor();

    // These will be released for each web call above.
    // There is a race between the above waitFor() and the request actually being recorded
    // by WireMock. This fixes it.
    getCount.acquire(2);

    wireMockRule.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .withQueryParam("stdin", equalTo("true"))
            .withQueryParam("stdout", equalTo("true"))
            .withQueryParam("stderr", equalTo("true"))
            .withQueryParam("container", equalTo("container"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("command", equalTo("cmd")));

    wireMockRule.verify(
        getRequestedFor(
                urlPathEqualTo("/api/v1/namespaces/" + namespace + "/pods/" + podName + "/exec"))
            .withQueryParam("stdin", equalTo("false"))
            .withQueryParam("stdout", equalTo("true"))
            .withQueryParam("stderr", equalTo("false"))
            .withQueryParam("container", equalTo("container"))
            .withQueryParam("tty", equalTo("false"))
            .withQueryParam("command", equalTo("cmd")));

    assertEquals(-1975219, p.exitValue());
    verify(consumer, times(1)).accept(any(Throwable.class));
  }

  @Test
  public void testExit0() {
    InputStream inputStream =
        new ByteArrayInputStream(OUTPUT_EXIT0.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(0, exitCode);
  }

  @Test
  public void testExit1() {
    InputStream inputStream =
        new ByteArrayInputStream(OUTPUT_EXIT1.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(1, exitCode);
  }

  @Test
  public void testExit126() {
    InputStream inputStream =
        new ByteArrayInputStream(OUTPUT_EXIT126.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(126, exitCode);
  }

  @Test
  public void testIncompleteData1() {
    InputStream inputStream =
        new ByteArrayInputStream(BAD_OUTPUT_INCOMPLETE_MSG1.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(-1, exitCode);
  }

  @Test
  public void testNonZeroBadIntExit() {
    InputStream inputStream =
        new ByteArrayInputStream(OUTPUT_EXIT_BAD_INT.getBytes(StandardCharsets.UTF_8));
    int exitCode = Exec.parseExitCode(client, inputStream);
    assertEquals(-1, exitCode);
  }
}
