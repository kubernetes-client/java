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
package io.kubernetes.client.util;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Pair;

import com.google.common.net.HttpHeaders;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.squareup.okhttp.ws.WebSocket;
import com.squareup.okhttp.ws.WebSocketCall;
import com.squareup.okhttp.ws.WebSocketListener;
import okio.Buffer;

import static com.squareup.okhttp.ws.WebSocket.BINARY;
import static com.squareup.okhttp.ws.WebSocket.TEXT;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

public class WebSockets {
    public static final String V4_STREAM_PROTOCOL = "v4.channel.k8s.io";
    public static final String V3_STREAM_PROTOCOL = "v3.channel.k8s.io";
    public static final String V2_STREAM_PROTOCOL = "v2.channel.k8s.io";
    public static final String V1_STREAM_PROTOCOL = "channel.k8s.io";
    public static final String STREAM_PROTOCOL_HEADER = "X-Stream-Protocol-Version";
    public static final String SPDY_3_1 = "SPDY/3.1";

    /**
     * A simple interface for a listener on a web socket
     */
    public interface SocketListener {
        /**
         * Called when the socket is opened
         */
        public void open();

        /**
         * Callled when a binary media type message is received
         * @param in The input stream containing the binary data
         */
        public void bytesMessage(InputStream in);

        /**
         * Called when a text media type message is received
         * @param in The character stream containing the message
         */
        public void textMessage(Reader in);

        /**
         * Called when the stream is closed.
         */
        public void close();
    }

    /**
     * Create a new WebSocket stream
     * @param path The HTTP Path to request from the API
     * @param method The HTTP method to use for the call
     * @param client The ApiClient for communicating with the API
     * @param listener The socket listener to handle socket events
     */
    public static void stream(String path, String method, ApiClient client, SocketListener listener) throws ApiException, IOException {
        HashMap<String, String> headers = new HashMap<String, String>();
        String allProtocols = String.format("%s,%s,%s,%s", V4_STREAM_PROTOCOL, V3_STREAM_PROTOCOL, V2_STREAM_PROTOCOL, V1_STREAM_PROTOCOL);
        headers.put(STREAM_PROTOCOL_HEADER, allProtocols);
        headers.put(HttpHeaders.CONNECTION, HttpHeaders.UPGRADE);
        headers.put(HttpHeaders.UPGRADE, SPDY_3_1);

        Request request = client.buildRequest(path, method, new ArrayList<Pair>(), null, headers, new HashMap<String, Object>(), new String[0], null);
        WebSocketCall.create(client.getHttpClient(), request).enqueue(new Listener(listener));
    }

    private static class Listener implements WebSocketListener {
        private SocketListener listener;

        public Listener(SocketListener listener) {
            this.listener = listener;
        }

        @Override
        public void onOpen(WebSocket webSocket, Response response) {
            listener.open();
        }

        @Override
        public void onMessage(ResponseBody body) throws IOException {
            if (body.contentType() == TEXT) {
                listener.bytesMessage(body.byteStream());
            } else if (body.contentType() == BINARY) {
                listener.textMessage(body.charStream());
            }
            body.close();
        }

        @Override
        public void onPong(Buffer payload) {
        }

        @Override
        public void onClose(int code, String reason) {
            listener.close();
        }

        @Override
        public void onFailure(IOException e, Response res) {
            e.printStackTrace();
            listener.close();
        }
    }
}
