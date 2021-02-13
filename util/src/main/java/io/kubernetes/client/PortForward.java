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

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.Pair;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.WebSocketStreamHandler;
import io.kubernetes.client.util.WebSockets;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Utility class for setting up port-forwarding connections. Uses the WebSockets API, not the SPDY
 * API (which the Go client uses)
 *
 * <p>The protocol is undocumented as far as I can tell, but the PR that added it is here:
 * github.com/kubernetes/kubernetes/pull/33684
 *
 * <p>And the protocol is:
 *
 * <p>web sockets on server/api/v1/namespaces/&lt;namespace&gt;/pods/&lt;pod&gt;/portforward with
 * args ports=80 and ports=8080
 *
 * <p>I/O for first port (80) is on Channel 0 Err for first port (80) is on Channel 1 I/O for second
 * port (8080) is on Channel 2 Err for second port (8080) is on Channel 3 < and so on for remaining
 * ports>
 *
 * <p>The first two bytes of each output stream is the port that is being forwarded in little-endian
 * format.
 */
public class PortForward {
  private ApiClient apiClient;

  /** Simple PortForward API constructor, uses default configuration */
  public PortForward() {
    this(Configuration.getDefaultApiClient());
  }

  /**
   * PortForward API Constructor
   *
   * @param apiClient The api client to use.
   */
  public PortForward(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client for these PortForward operations.
   *
   * @return The API client that will be used.
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client for subsequent PortForward operations.
   *
   * @param apiClient The new API client to use.
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  private String makePath(String namespace, String name) {
    return "/api/v1/namespaces/" + namespace + "/pods/" + name + "/portforward";
  }

  /**
   * PortForward to a container
   *
   * @param pod The pod where the port forward is run.
   * @param ports The ports to forward
   * @return The result of the Port Forward request.
   */
  public PortForwardResult forward(V1Pod pod, List<Integer> ports)
      throws ApiException, IOException {
    return forward(pod.getMetadata().getNamespace(), pod.getMetadata().getName(), ports);
  }

  /**
   * PortForward to a container.
   *
   * @param namespace The namespace of the Pod
   * @param name The name of the Pod
   * @param ports The ports to forward
   * @return The result of the Port Forward request.
   */
  public PortForwardResult forward(String namespace, String name, List<Integer> ports)
      throws ApiException, IOException {
    String path = makePath(namespace, name);
    WebSocketStreamHandler handler = new WebSocketStreamHandler();
    PortForwardResult result = new PortForwardResult(handler, ports);
    List<Pair> queryParams = new ArrayList<>(ports.size());
    for (Integer port : ports) {
      queryParams.add(new Pair("ports", port.toString()));
    }
    WebSockets.stream(path, "GET", queryParams, apiClient, handler);
    try {
      handler.waitForInitialized();
    } catch (InterruptedException ex) {
      throw new ApiException(ex);
    }
    Throwable err = handler.getError();
    if (err != null) {
      throw new ApiException(err);
    }
    // Wait for streams to start.
    result.init();

    return result;
  }

  /**
   * PortForwardResult contains the result of an Attach call, it includes streams for stdout stderr
   * and stdin.
   */
  public static class PortForwardResult {
    private WebSocketStreamHandler handler;
    private HashMap<Integer, Integer> streams;
    private List<Integer> ports;

    /**
     * Constructor
     *
     * @param handler The web socket handler
     * @param ports The list of ports that are being forwarded.
     */
    public PortForwardResult(WebSocketStreamHandler handler, List<Integer> ports)
        throws IOException {
      this.handler = handler;
      this.streams = new HashMap<>();
      this.ports = ports;
    }

    /** Initialize the connection. Must be called after the web socket has been opened. */
    public void init() throws IOException {
      for (int i = 0; i < ports.size(); i++) {
        InputStream is = handler.getInputStream(i * 2);
        byte[] data = new byte[2];
        int readAmount = is.read(data);
        if (readAmount != 2) {
          throw new IOException("Failed to read port");
        }
        int port = (data[0] & 0xFF) + (data[1] & 0xFF) * 256;
        streams.put(port, i);
      }
    }

    private int findPortIndex(int portNumber) {
      Integer ix = streams.get(portNumber);
      if (ix == null) {
        return -1;
      }
      return ix.intValue();
    }

    /**
     * Get the output stream for the specified port number (e.g. 80)
     *
     * @param port The port number to get the stream for.
     * @return The OutputStream for the specified port, null if there is no such port.
     */
    public OutputStream getOutboundStream(int port) {
      int portIndex = findPortIndex(port);
      if (portIndex == -1) {
        return null;
      }
      return handler.getOutputStream(portIndex * 2);
    }

    /**
     * Get the error stream for a port number (e.g. 80)
     *
     * @param port The port number to get the stream for.
     * @return The error stream, or null if there is no such port.
     */
    public InputStream getErrorStream(int port) {
      int portIndex = findPortIndex(port);
      if (portIndex == -1) {
        return null;
      }
      return handler.getInputStream(portIndex * 2 + 1);
    }

    /**
     * Get the input stream for a port number (e.g. 80)
     *
     * @param port The port number to get the stream for.
     * @return The input stream, or null if no such port exists.
     */
    public InputStream getInputStream(int port) throws IOException {
      int portIndex = findPortIndex(port);
      if (portIndex == -1) {
        return null;
      }
      return handler.getInputStream(portIndex * 2);
    }
  }
}
