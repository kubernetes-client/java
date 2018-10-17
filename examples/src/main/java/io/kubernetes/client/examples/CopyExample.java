/*
Copyright 2017, 2018 The Kubernetes Authors.
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

import com.google.common.io.ByteStreams;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.Copy;
import io.kubernetes.client.util.Config;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.CopyExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class CopyExample {
  public static void main(String[] args) throws IOException, ApiException, InterruptedException {
    String podName = "kube-addon-manager-minikube";
    String namespace = "kube-system";

    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    Copy copy = new Copy();
    InputStream dataStream = copy.copyFileFromPod(namespace, podName, "/etc/motd");
    ByteStreams.copy(dataStream, System.out);

    copy.copyDirectoryFromPod(namespace, podName, null, "/etc", Paths.get("/tmp/etc"));

    System.out.println("Done!");
  }
}
