package io.kubernetes.client.examples;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.informer.*;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.models.V1Node;
import io.kubernetes.client.models.V1NodeList;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Config;
import java.util.concurrent.TimeUnit;

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
    ApiClient client = Config.defaultClient();
    client.getHttpClient().setReadTimeout(0, TimeUnit.SECONDS); // infinite timeout
    Configuration.setDefaultApiClient(client);

    SharedInformerFactory factory = new SharedInformerFactory();

    CoreV1Api coreV1Api = new CoreV1Api();

    // Node informer
    SharedIndexInformer<V1Node> nodeInformer =
        factory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              return coreV1Api.listNodeCall(
                  null,
                  null,
                  null,
                  null,
                  null,
                  params.resourceVersion,
                  params.timeoutSeconds,
                  params.watch,
                  null,
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
    V1Node createdNode = coreV1Api.createNode(nodeToCreate, null, null, null);
    Thread.sleep(3000);

    Lister<V1Node> nodeLister = new Lister<V1Node>(nodeInformer.getIndexer());
    V1Node node = nodeLister.get("noxu");
    System.out.printf("noxu created! %s\n", node.getMetadata().getCreationTimestamp());
    factory.stopAllRegisteredInformers();
    Thread.sleep(3000);
    System.out.println("informer stopped..");
  }
}
