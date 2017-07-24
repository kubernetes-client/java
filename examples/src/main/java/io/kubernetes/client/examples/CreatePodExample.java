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
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Container;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodSpec;
import io.kubernetes.client.util.Config;

import java.io.IOException;
import java.util.Collections;

/**
 * A simple example of how to use the Java API
 * 
 * Easiest way to run this:
 *   mvn exec:java -Dexec.mainClass="io.kubernetes.client.examples.CreatePodExample"
 * 
 * From inside $REPO_DIR/kubernetes
 */
public class CreatePodExample {
    public static void main(String[] args) throws IOException, ApiException{
        ApiClient client = Config.defaultClient();
        Configuration.setDefaultApiClient(client);
        String namespace = "default";

        V1Pod pod = new V1Pod();
        pod.setApiVersion("v1");

        V1ObjectMeta objectMeta = new V1ObjectMeta();
        objectMeta.setName("demo-pod-nginx");
        objectMeta.setNamespace(namespace);

        pod.setMetadata(objectMeta);

        V1PodSpec podSpec = new V1PodSpec();
        V1Container container = new V1Container();
        container.setImage("nginx");
        container.setName("nginx");

        podSpec.setContainers(Collections.singletonList(container));
        pod.setSpec(podSpec);

        CoreV1Api api = new CoreV1Api();
        api.createNamespacedPod(namespace, pod, "false");
    }
}