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

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.util.Config;
import io.kubernetes.client.util.Yaml;
import java.io.File;
import java.io.IOException;

/**
 * A simple example of how to use Yaml.createResource() to create Kubernetes resources from YAML
 * without specifying the type upfront. This is equivalent to `kubectl create -f <yaml-file>`.
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.YamlCreateResourceExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class YamlCreateResourceExample {
  public static void main(String[] args) throws IOException, ApiException {
    // Initialize the API client
    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    // Example 1: Create a ConfigMap from YAML string
    // This method automatically determines the resource type (ConfigMap)
    // and uses the appropriate API to create it
    String configMapYaml =
        "apiVersion: v1\n"
            + "kind: ConfigMap\n"
            + "metadata:\n"
            + "  name: example-config\n"
            + "  namespace: default\n"
            + "data:\n"
            + "  database.url: jdbc:postgresql://localhost/mydb\n"
            + "  database.user: admin\n";

    System.out.println("Creating ConfigMap from YAML string...");
    Object configMapResult = Yaml.createResource(client, configMapYaml);
    System.out.println("Created: " + configMapResult);

    // Example 2: Create a Pod from YAML string
    // Again, no need to specify V1Pod.class - the method determines it automatically
    String podYaml =
        "apiVersion: v1\n"
            + "kind: Pod\n"
            + "metadata:\n"
            + "  name: example-pod\n"
            + "  namespace: default\n"
            + "spec:\n"
            + "  containers:\n"
            + "  - name: nginx\n"
            + "    image: nginx:1.14.2\n"
            + "    ports:\n"
            + "    - containerPort: 80\n";

    System.out.println("\nCreating Pod from YAML string...");
    Object podResult = Yaml.createResource(client, podYaml);
    System.out.println("Created: " + podResult);

    // Example 3: Create a resource from a YAML file
    // This works with any Kubernetes resource type
    File yamlFile = new File("example-resource.yaml");
    if (yamlFile.exists()) {
      System.out.println("\nCreating resource from YAML file...");
      Object fileResult = Yaml.createResource(client, yamlFile);
      System.out.println("Created: " + fileResult);
    }

    // Example 4: Type casting if you need to access specific fields
    // The returned object is the strongly-typed Kubernetes object
    V1ConfigMap configMap = (V1ConfigMap) configMapResult;
    System.out.println("\nConfigMap name: " + configMap.getMetadata().getName());
    System.out.println("ConfigMap data: " + configMap.getData());

    V1Pod pod = (V1Pod) podResult;
    System.out.println("\nPod name: " + pod.getMetadata().getName());
    System.out.println("Pod phase: " + pod.getStatus().getPhase());

    // Clean up - delete the created resources
    CoreV1Api api = new CoreV1Api();
    System.out.println("\nCleaning up...");
    api.deleteNamespacedConfigMap("example-config", "default").execute();
    System.out.println("Deleted ConfigMap");

    api.deleteNamespacedPod("example-pod", "default").execute();
    System.out.println("Deleted Pod");
  }
}
