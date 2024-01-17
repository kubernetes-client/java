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
package io.kubernetes.client.util;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Pair;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebSockets {
  private static final Logger log = LoggerFactory.getLogger(WebSockets.class);

  // Only support v4 stream protocol as it was available since k8s 1.4
  public static final String V4_STREAM_PROTOCOL = "v4.channel.k8s.io";
  public static final String STREAM_PROTOCOL_HEADER = "Sec-WebSocket-Protocol";
  public static final String SPDY_3_1 = "SPDY/3.1";
  public static final String CONNECTION = "Connection";
  public static final String UPGRADE = "Upgrade";

  /** A simple interface for a listener on a web socket */
  public interface SocketListener {
    /** Called when the socket is opened */
    void open(String protocol, WebSocket socket);

    /**
     * Called when a binary media type message is received
     *
     * @param in The input stream containing the binary data
     */
    void bytesMessage(InputStream in);

    /**
     * Called when a text media type message is received
     *
     * @param in The character stream containing the message
     */
    void textMessage(Reader in);

    /**
     * Called when there has been a failure
     *
     * @param t the exception associated with the failure.
     */
    void failure(Throwable t);

    /** Called when the stream is closed. */
    void close();
  }

  /**
   * Create a new WebSocket stream
   *
   * @param path The HTTP Path to request from the API
   * @param method The HTTP method to use for the call
   * @param client The ApiClient for communicating with the API
   * @param listener The socket listener to handle socket events
   */
  public static void stream(String path, String method, ApiClient client, SocketListener listener)
      throws ApiException, IOException {
    stream(path, method, new ArrayList<Pair>(), client, listener);
  }

  public static void stream(
      String path, String method, List<Pair> queryParams, ApiClient client, SocketListener listener)
      throws ApiException, IOException {

    HashMap<String, String> headers = new HashMap<String, String>();
    headers.put(STREAM_PROTOCOL_HEADER, V4_STREAM_PROTOCOL);
    headers.put(WebSockets.CONNECTION, WebSockets.UPGRADE);
    headers.put(WebSockets.UPGRADE, SPDY_3_1);
    String[] localVarAuthNames = new String[] {"BearerToken"};

    Request request =
        client.buildRequest(
            client.getBasePath(),
            path,
            method,
            queryParams,
            new ArrayList<Pair>(),
            null,
            headers,
            new HashMap<String, String>(),
            new HashMap<String, Object>(),
            localVarAuthNames,
            null);
    streamRequest(request, client, listener);
  }

  public static void stream(Call call, ApiClient client, SocketListener listener) {
    streamRequest(call.request(), client, listener);
  }

  private static void streamRequest(Request request, ApiClient client, SocketListener listener) {
    client.getHttpClient().newWebSocket(request, new Listener(listener));
  }

  public static class Listener extends WebSocketListener {
    private SocketListener listener;

    public Listener(SocketListener listener) {
      this.listener = listener;
    }

    @Override
    public void onOpen(final WebSocket webSocket, Response response) {
      String protocol = response.header(STREAM_PROTOCOL_HEADER, "missing");
      listener.open(protocol, webSocket);
    }

    @Override
    public void onMessage(WebSocket webSocket, String text) {
      listener.textMessage(new StringReader(text));
    }

    @Override
    public void onMessage(WebSocket webSocket, ByteString bytes) {
      listener.bytesMessage(new ByteArrayInputStream(bytes.toByteArray()));
    }

    @Override
    public void onClosing(WebSocket webSocket, int code, String reason) {
      super.onClosing(webSocket, code, reason);
      if (code == 1000) {
        webSocket.close(1000, "Normal close");
      } else {
        log.warn("Unexpected WebSocket ({}) closure: {} {}", webSocket, code, reason);
        webSocket.close(1002, "Abnormal close");
      }
    }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
      listener.close();
    }

    @Override
    public void onFailure(WebSocket webSocket, Throwable t, @Nullable Response response) {
      listener.failure(t);
      listener.close();
    }
  }
}
