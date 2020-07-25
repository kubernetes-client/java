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

import static io.kubernetes.client.extended.kubectl.Kubectl.scale;

import io.kubernetes.client.extended.kubectl.exception.KubectlException;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1Deployment;
import io.kubernetes.client.util.Config;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.Kubectl"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class Kubectl {
  public static void main(String[] args) throws java.io.IOException, KubectlException {
    ApiClient client = Config.defaultClient();

    String verb = args[0];
    String ns = args[1];
    String name = args[2];

    switch (verb) {
      case "scale":
        int replicas = Integer.parseInt(args[3]);
        scale(client, V1Deployment.class).namespace(ns).name(name).replicas(replicas).execute();
        System.out.println("Deployment scaled.");
        System.exit(0);
      default:
        System.out.println("Unknown verb: " + verb);
        System.exit(-1);
    }
  }
}
