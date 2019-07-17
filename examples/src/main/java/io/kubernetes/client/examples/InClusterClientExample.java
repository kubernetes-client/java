/*
Copyright 2019 The Kubernetes Authors.
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
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.util.ClientBuilder;
import java.io.IOException;

/**
 * A simple example of how to use the Java API inside a kubernetes cluster
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.InClusterClientExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class InClusterClientExample {
  public static void main(String[] args) throws IOException, ApiException {

    // loading the in-cluster config, including:
    //   1. service-account CA
    //   2. service-account bearer-token
    //   3. service-account namespace
    //   4. master endpoints(ip, port) from pre-set environment variables
    ApiClient client = ClientBuilder.cluster().build();

    // set the global default api-client to the in-cluster one from above
    Configuration.setDefaultApiClient(client);

    // the CoreV1Api loads default api-client from global configuration.
    CoreV1Api api = new CoreV1Api();

    // invokes the CoreV1Api client
    V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null);
    for (V1Pod item : list.getItems()) {
      System.out.println(item.getMetadata().getName());
    }
  }
}
