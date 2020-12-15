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
package io.kubernetes.client.examples;

import io.kubernetes.client.PortForward;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.Streams;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.PortForwardExample" from inside
 * $REPO_DIR/examples
 *
 * <p>Then: curl localhost:8080 from a different terminal (but be quick about it, the socket times
 * out pretty fast...)
 */
public class PortForwardExample {
  public static void main(String[] args) throws IOException, ApiException, InterruptedException {
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    PortForward forward = new PortForward();
    List<Integer> ports = new ArrayList<>();
    int localPort = 8080;
    int targetPort = 8080;
    ports.add(targetPort);
    final PortForward.PortForwardResult result =
        forward.forward("default", "camera-viz-7949dbf7c6-lpxkd", ports);
    System.out.println("Forwarding!");
    ServerSocket ss = new ServerSocket(localPort);

    final Socket s = ss.accept();
    System.out.println("Connected!");

    new Thread(
            new Runnable() {
              public void run() {
                try {
                  Streams.copy(result.getInputStream(targetPort), s.getOutputStream());
                } catch (IOException ex) {
                  ex.printStackTrace();
                } catch (Exception ex) {
                  ex.printStackTrace();
                }
              }
            })
        .start();

    new Thread(
            new Runnable() {
              public void run() {
                try {
                  Streams.copy(s.getInputStream(), result.getOutboundStream(targetPort));
                } catch (IOException ex) {
                  ex.printStackTrace();
                } catch (Exception ex) {
                  ex.printStackTrace();
                }
              }
            })
        .start();

    Thread.sleep(10 * 1000);

    System.exit(0);
  }
}
