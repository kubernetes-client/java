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

import io.kubernetes.client.Configuration;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.util.WebSockets;
import io.kubernetes.client.util.WebSocketStreamHandler;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Reader;

import org.apache.commons.lang.StringUtils;

public class Attach {
    private ApiClient apiClient;

    /**
     * Simple Attach API constructor, uses default configuration
     */
    public Attach() {
        this(Configuration.getDefaultApiClient());
    }

    /**
     * Attach API Constructor
     * @param apiClient The api client to use.
     */
    public Attach(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the API client for these Attach operations.
     * @return The API client that will be used.
     */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Set the API client for subsequent Attach operations.
     * @param apiClient The new API client to use.
     */
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    private String makePath(String namespace, String name, String container, boolean stdin, boolean tty) {
          return "/api/v1/namespaces/" +
            namespace +
            "/pods/" +
            name +
            "/attach?" +
            "stdin=" + stdin +
            "&tty=" + tty +
            (container != null ? "&container=" + container : "");
    }

    /**
     * Attach to a running AttachResult in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param namespace The namespace of the Pod
     * @param name The name of the Pod
     * @param stdin If true, pass a stdin stream into the container
     */
    public AttachResult attach(String namespace, String name, boolean stdin) throws ApiException, IOException {
        return attach(namespace, name, null, stdin, false);
    }

    /**
     * Attach to a running AttachResult in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param pod The pod where the command is run.
     * @param stdin If true, pass a stdin stream into the container 
     */
    public AttachResult attach(V1Pod pod, boolean stdin) throws ApiException, IOException {
        return attach(pod, stdin, false);
    }


    /**
     * Attach to a running AttachResult in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param pod The pod where the command is run.
     * @param stdin If true, pass a stdin stream into the container 
     * @param tty If true, stdin is a tty.
     */
    public AttachResult attach(V1Pod pod, boolean stdin, boolean tty) throws ApiException, IOException {
        return attach(pod, null, stdin, tty);
    }

    /**
     * Attach to a running AttachResult in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param pod The pod where the command is run.
     * @param container The container in the Pod where the command is run.
     * @param stdin If true, pass a stdin stream into the container.
     * @param tty If true, stdin is a TTY (only applies if stdin is true)
     */
    public AttachResult attach(V1Pod pod, String container, boolean stdin, boolean tty) throws ApiException, IOException {
        return attach(pod.getMetadata().getNamespace(), pod.getMetadata().getName(), container, stdin, tty);
    }

    /**
     * Attach to a running AttachResult in a container. If there are multiple containers in the pod, uses
     * the first container in the Pod.
     * 
     * @param namespace The namespace of the Pod
     * @param name The name of the Pod
     * @param container The container in the Pod where the command is run.
     * @param stdin If true, pass a stdin stream into the container.
     * @param tty If true, stdin is a TTY (only applies if stdin is true)
     */
    public AttachResult attach(String namespace, String name, String container, boolean stdin, boolean tty) throws ApiException, IOException {
        String path = makePath(namespace, name, container, stdin, tty);

        WebSocketStreamHandler handler = new WebSocketStreamHandler();
        AttachResult result = new AttachResult(handler);
        WebSockets.stream(path, "GET", apiClient, handler);

        return result;
    }

    /**
     * AttachResult contains the result of an Attach call, it includes streams for stdout
     * stderr and stdin. 
     */
    public static class AttachResult implements java.io.Closeable {        
        private WebSocketStreamHandler handler;


        public AttachResult(WebSocketStreamHandler handler) throws IOException {
            this.handler = handler;
        }

        public OutputStream getStandardInputStream() {
            return handler.getOutputStream(0);
        }

        public InputStream getStandardOutputStream() throws IOException {
            return handler.getInputStream(1);
        }

        public InputStream getErrorStream() throws IOException {
            return handler.getInputStream(2);
        }

        public void close() {
            handler.close();
        }
    }
}