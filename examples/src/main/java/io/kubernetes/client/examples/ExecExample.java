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
 * Requires kubectl proxy running
 * 
 * Easiest way to run this:
 *   mvn exec:java -Dex.mainClass="io.kubernetes.client.examples.Example"
 * 
 * From inside $REPO_DIR/kubernetes
 */
public class ExecExample {
    public static void main(String[] args) throws IOException, ApiException, InterruptedException {
        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);

        Exec exec = new Exec();
        final Process proc = exec.exec("default", "nginx-2371676037-czqx3", new String[] {"sh", "-c", "echo foo"}, true);

        new Thread(new Runnable() {
            public void run() {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                OutputStream output = proc.getOutputStream();
                try {
                    while (true) {
                        String line = in.readLine();
                        output.write(line.getBytes());
                        output.write('\n');
                        output.flush();
                    }
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

        System.exit(0);
    }
}