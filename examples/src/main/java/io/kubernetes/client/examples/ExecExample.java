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

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.Exec;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.util.Config;

import com.google.common.io.ByteStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStream;

/**
 * A simple example of how to use the Java API
 * 
 * <p>Easiest way to run this:
 *   mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.Example"
 * 
 * <p>From inside $REPO_DIR/examples
 */
public class ExecExample {
    public static void main(String[] args) throws IOException, ApiException, InterruptedException {
        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);

        Exec exec = new Exec();
        boolean tty = System.console() != null;
//        final Process proc = exec.exec("default", "nginx-2371676037-czqx3", new String[] {"sh", "-c", "echo foo"}, true, tty);
        final Process proc = exec.exec("default", "nginx-4217019353-k5sn9", new String[] {"sh"}, true, tty);


        new Thread(new Runnable() {
            public void run() {
                try {
                    ByteStreams.copy(System.in, proc.getOutputStream());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    ByteStreams.copy(proc.getInputStream(), System.out);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }).start();

        proc.waitFor();
        try {
            // Wait for buffers to flush.
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        proc.destroy();

        System.exit(0);
    }
}