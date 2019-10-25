package io.kubernetes.client.examples;

import com.google.common.collect.Lists;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.extended.informer.FilterField;
import io.kubernetes.client.extended.informer.PageSharedInformerFactory;
import io.kubernetes.client.extended.informer.PagerCallGeneratorParams;
import io.kubernetes.client.extended.informer.SerializeFilterJSON;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.models.V1Node;
import io.kubernetes.client.models.V1NodeList;
import io.kubernetes.client.models.V1NodeStatus;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.util.CallGenerator;
import io.kubernetes.client.util.Config;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/**
 * Created by 烛坤 on 2019/10/18.
 *
 * @author 烛坤
 * @date 2019/10/18
 */
public class FieldFilterPageInformerExample {

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
                params.getContinueToken(),
                null,
                null,
                params.getLimit(),
                params.resourceVersion,
                params.timeoutSeconds,
                params.watch,
                null,
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

    V1Node nodeToCreate = new V1Node();
    V1ObjectMeta metadata = new V1ObjectMeta();
    metadata.setName("noxu");
    nodeToCreate.setMetadata(metadata);
    V1Node createdNode = coreV1Api.createNode(nodeToCreate, null, null, null);
    Thread.sleep(3000);

    Lister<V1Node> nodeLister = new Lister<>(nodeInformer.getIndexer());
    V1Node node = nodeLister.get("noxu");
    System.out.printf("noxu created! %s\n", node.getMetadata().getCreationTimestamp());
    factory.stopAllRegisteredInformers();
    Thread.sleep(3000);
    System.out.println("informer stopped..");
  }
}
