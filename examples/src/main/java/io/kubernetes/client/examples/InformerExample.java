package io.kubernetes.client.examples;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.informer.*;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.models.V1Node;
import io.kubernetes.client.models.V1NodeList;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Config;

public class InformerExample {
  public static void main(String[] args) throws Exception {

    ApiClient client = Config.defaultClient();
    Configuration.setDefaultApiClient(client);

    SharedInformerFactory factory = new SharedInformerFactory();

    CoreV1Api coreV1Api = new CoreV1Api();

    // Node informer
    SharedIndexInformer<V1Node> nodeInformer =
        factory.sharedIndexInformerFor(
            (CallGeneratorParams params) -> {
              try {
                return coreV1Api.listNodeCall(
                    null,
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
              } catch (ApiException e) {
                throw new RuntimeException(e);
              }
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
    String s = coreV1Api.getApiClient().getJSON().serialize(nodeToCreate);
    V1Node createdNode = coreV1Api.createNode(nodeToCreate, null, null, null);
    Thread.sleep(3000);

    Lister<V1Node> nodeLister = new Lister<V1Node>(nodeInformer);
    V1Node node = nodeLister.get("noxu");
    System.out.printf("noxu created! %s\n", node.getMetadata().getCreationTimestamp());
    factory.stopAllRegisteredInformers();
    Thread.sleep(3000);
    System.out.println("informer stopped..");
  }
}
