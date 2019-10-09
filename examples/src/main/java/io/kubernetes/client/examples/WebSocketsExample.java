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
package io.kubernetes.client.examples;

import com.squareup.okhttp.ws.WebSocket;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.WebSockets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * This is a pretty low level, most people won't need to use WebSockets directly.
 *
 * <p>If you do need to run it, you can run: mvn exec:java \
 * -Dexec.mainClass=io.kubernetes.client.examples.WebSocketsExample \
 * -Dexec.args=/api/v1/namespaces/default/pods/<podname>/attach?stdout=true
 *
 * <p>Note that you'd think 'watch' calls were WebSockets, but you'd be wrong, they're straight HTTP
 * GET calls.
 */
public class WebSocketsExample {
  public static void main(String... args) throws ApiException, IOException {
    final ApiClient client = Config.defaultClient();
    WebSockets.stream(
        args[0],
        "GET",
        client,
        new WebSockets.SocketListener() {
          public void open(String protocol, WebSocket socket) {}

          public void close() {
            // Trigger shutdown of the dispatcher's executor so this process can exit cleanly.
            client.getHttpClient().getDispatcher().getExecutorService().shutdown();
          }

          public void bytesMessage(InputStream is) {}

          public void failure(Exception ex) {
            ex.printStackTrace();
          }

          public void textMessage(Reader in) {
            try {
              BufferedReader reader = new BufferedReader(in);
              for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                System.out.println(line);
              }
            } catch (IOException ex) {
              ex.printStackTrace();
            }
          }
        });
  }
}
