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

import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.CallGeneratorParams;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/**
 * A simple example of how to use the Java API
 *
 * <p>Easiest way to run this: mvn exec:java
 * -Dexec.mainClass="io.kubernetes.client.examples.InformerExample"
 *
 * <p>From inside $REPO_DIR/examples
 */
public class InformerExample {
  public static void main(String[] args) throws Exception {
    CoreV1Api coreV1Api = new CoreV1Api();
    ApiClient apiClient = coreV1Api.getApiClient();
    OkHttpClient httpClient =
        apiClient.getHttpClient().newBuilder().readTimeout(0, TimeUnit.SECONDS).build();
    apiClient.setHttpClient(httpClient);

    SharedInformerFactory factory = new SharedInformerFactory(apiClient);

    // Node informer
    SharedIndexInformer<V1Node> nodeInformer =
        factory.sharedIndexInformerFor(
            // **NOTE**:
            // The following "CallGeneratorParams" lambda merely generates a stateless
            // HTTPs requests, the effective apiClient is the one specified when constructing
            // the informer-factory.
            (CallGeneratorParams params) -> {
              return coreV1Api.listNodeCall(
                  null,
                  null,
                  null,
                  null,
                  null,
                  null,
                  params.resourceVersion,
                  null,
                  params.timeoutSeconds,
                  params.watch,
                  null);
            },
            V1Node.class,
            V1NodeList.class);

    nodeInformer.addEventHandler(
        new ResourceEventHandler<V1Node>() {
          @Override
          public void onAdd(V1Node node) {
            System.out.printf("%s node added!\n", node.getMetadata().getName());
          }

          @Override
          public void onUpdate(V1Node oldNode, V1Node newNode) {
            System.out.printf(
                "%s => %s node updated!\n",
                oldNode.getMetadata().getName(), newNode.getMetadata().getName());
          }

          @Override
          public void onDelete(V1Node node, boolean deletedFinalStateUnknown) {
            System.out.printf("%s node deleted!\n", node.getMetadata().getName());
          }
        });

    factory.startAllRegisteredInformers();

    V1Node nodeToCreate = new V1Node();
    V1ObjectMeta metadata = new V1ObjectMeta();
    metadata.setName("noxu");
    nodeToCreate.setMetadata(metadata);
    V1Node createdNode = coreV1Api.createNode(nodeToCreate, null, null, null, null);
    Thread.sleep(3000);

    Lister<V1Node> nodeLister = new Lister<V1Node>(nodeInformer.getIndexer());
    V1Node node = nodeLister.get("noxu");
    System.out.printf("noxu created! %s\n", node.getMetadata().getCreationTimestamp());
    factory.stopAllRegisteredInformers();
    Thread.sleep(3000);
    System.out.println("informer stopped..");
  }
}
