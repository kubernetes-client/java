package io.kubernetes.client.examples;

import com.google.common.collect.Lists;
import io.kubernetes.client.extended.informer.FilterField;
import io.kubernetes.client.extended.informer.PageSharedInformerFactory;
import io.kubernetes.client.extended.informer.PagerCallGeneratorParams;
import io.kubernetes.client.extended.informer.SerializeFilterJSON;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import io.kubernetes.client.util.CallGenerator;
import io.kubernetes.client.util.Config;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.collections4.CollectionUtils;

public class SimpleFieldFilterPageInformerExample {

  private static final ResourceEventHandler<V1Node> RESOURCE_EVENT_HANDLER =
      new ResourceEventHandler<V1Node>() {

        @Override
        public void onAdd(V1Node node) {

          assert CollectionUtils.isEmpty(node.getStatus().getImages());

          System.out.printf("%s node added!\n", node.getMetadata().getName());
        }

        @Override
        public void onUpdate(V1Node oldNode, V1Node newNode) {

          assert CollectionUtils.isEmpty(oldNode.getStatus().getImages());

          assert CollectionUtils.isEmpty(newNode.getStatus().getImages());

          System.out.printf(
              "%s => %s node updated!\n",
              oldNode.getMetadata().getName(), newNode.getMetadata().getName());
        }

        @Override
        public void onDelete(V1Node node, boolean deletedFinalStateUnknown) {

          assert CollectionUtils.isEmpty(node.getStatus().getImages());

          System.out.printf("%s node deleted!\n", node.getMetadata().getName());
        }
      };

  public static void main(String[] args) throws Exception {

    ApiClient client = Config.defaultClient();

    Configuration.setDefaultApiClient(client);

    CoreV1Api coreV1Api = new CoreV1Api(client);

    CallGenerator<PagerCallGeneratorParams> callGenerator =
        params ->
            coreV1Api.listNodeCall(
                null,
                null,
                params.getContinueToken(),
                null,
                null,
                params.getLimit(),
                params.resourceVersion,
                params.timeoutSeconds,
                params.watch,
                null);

    List<FilterField> filterFields =
        Lists.newArrayList(
            new FilterField().setSerializedName("images").setDeclaringClass(V1NodeStatus.class));

    client.setJSON(new SerializeFilterJSON(filterFields));

    PageSharedInformerFactory factory = new PageSharedInformerFactory();

    SharedIndexInformer<V1Node> nodeInformer =
        factory.sharedIndexInformerFor(callGenerator, V1Node.class, V1NodeList.class);

    nodeInformer.addEventHandler(RESOURCE_EVENT_HANDLER);

    factory.startAllRegisteredInformers();

    while (!nodeInformer.hasSynced()) {
      TimeUnit.SECONDS.sleep(1);
    }

    System.out.println(nodeInformer.getIndexer().size());
  }
}
