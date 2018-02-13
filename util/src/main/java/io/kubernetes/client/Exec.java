/*
Copyright 2017 The Kubernetes Authors.
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

import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.util.WebSocketStreamHandler;
import io.kubernetes.client.util.WebSockets;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.lang3.StringUtils;

public class Exec {
  private ApiClient apiClient;

  /** Simple Exec API constructor, uses default configuration */
  public Exec() {
    this(Configuration.getDefaultApiClient());
  }

  /**
   * Exec API Constructor
   *
   * @param apiClient The api client to use.
   */
  public Exec(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client for these exec operations.
   *
   * @return The API client that will be used.
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client for subsequent exec operations.
   *
   * @param apiClient The new API client to use.
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  private String makePath(
      String namespace,
      String name,
      String[] command,
      String container,
      boolean stdin,
      boolean tty) {
    String path =
        "/api/v1/namespaces/"
            + namespace
            + "/pods/"
            + name
            + "/exec?"
            + "stdin="
            + stdin
            + "&tty="
            + tty
            + (container != null ? "&container=" + container : "")
            + "&command="
            + StringUtils.join(command, "&command=");
    return path;
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param namespace The namespace of the Pod
   * @param name The name of the Pod
   * @param command The command to run
   * @param stdin If true, pass a stdin stream into the container
   */
  public Process exec(String namespace, String name, String[] command, boolean stdin)
      throws ApiException, IOException {
    return exec(namespace, name, command, null, stdin, false);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param pod The pod where the command is run.
   * @param command The command to run
   * @param stdin If true, pass a stdin stream into the container
   */
  public Process exec(V1Pod pod, String[] command, boolean stdin) throws ApiException, IOException {
    return exec(pod, command, null, stdin, false);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param namespace The namespace of the Pod
   * @param name The name of the Pod
   * @param command The command to run
   * @param stdin If true, pass a stdin stream into the container
   * @param tty If true, stdin is a tty.
   */
  public Process exec(String namespace, String name, String[] command, boolean stdin, boolean tty)
      throws ApiException, IOException {
    return exec(namespace, name, command, null, stdin, tty);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param pod The pod where the command is run.
   * @param command The command to run
   * @param stdin If true, pass a stdin stream into the container
   * @param tty If true, stdin is a tty.
   */
  public Process exec(V1Pod pod, String[] command, boolean stdin, boolean tty)
      throws ApiException, IOException {
    return exec(pod, command, null, stdin, tty);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param pod The pod where the command is run.
   * @param command The command to run
   * @param container The container in the Pod where the command is run.
   * @param stdin If true, pass a stdin stream into the container.
   * @param tty If true, stdin is a TTY (only applies if stdin is true)
   */
  public Process exec(V1Pod pod, String[] command, String container, boolean stdin, boolean tty)
      throws ApiException, IOException {
    return exec(
        pod.getMetadata().getNamespace(),
        pod.getMetadata().getName(),
        command,
        container,
        stdin,
        tty);
  }

  /**
   * Execute a command in a container. If there are multiple containers in the pod, uses the first
   * container in the Pod.
   *
   * @param namespace The namespace of the Pod
   * @param name The name of the Pod
   * @param command The command to run
   * @param container The container in the Pod where the command is run.
   * @param stdin If true, pass a stdin stream into the container.
   * @param tty If true, stdin is a TTY (only applies if stdin is true)
   */
  public Process exec(
      String namespace, String name, String[] command, String container, boolean stdin, boolean tty)
      throws ApiException, IOException {
    String path = makePath(namespace, name, command, container, stdin, tty);

    WebSocketStreamHandler handler = new WebSocketStreamHandler();
    ExecProcess exec = new ExecProcess(handler);
    WebSockets.stream(path, "GET", apiClient, handler);

    return exec;
  }

  private static class ExecProcess extends Process {
    WebSocketStreamHandler streamHandler;
    private int statusCode;

    public ExecProcess(WebSocketStreamHandler handler) throws IOException {
      this.streamHandler = handler;
      this.statusCode = -1;
    }

    @Override
    public OutputStream getOutputStream() {
      return streamHandler.getOutputStream(0);
    }

    @Override
    public InputStream getInputStream() {
      return streamHandler.getInputStream(1);
    }

    @Override
    public InputStream getErrorStream() {
      return streamHandler.getInputStream(2);
    }

    @Override
    public int waitFor() throws InterruptedException {
      synchronized (this) {
        this.wait();
      }
      return statusCode;
    }

    public int exitValue() {
      return statusCode;
    }

    public void destroy() {
      streamHandler.close();
    }
  }
}
