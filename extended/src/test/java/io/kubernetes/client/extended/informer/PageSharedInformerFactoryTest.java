package io.kubernetes.client.extended.informer;

import com.google.common.collect.Lists;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Namespace;
import io.kubernetes.client.openapi.models.V1NamespaceList;
import io.kubernetes.client.openapi.models.V1Node;
import io.kubernetes.client.openapi.models.V1NodeList;
import io.kubernetes.client.openapi.models.V1NodeStatus;
import io.kubernetes.client.util.CallGenerator;
import io.kubernetes.client.util.Config;
import java.io.IOException;
import java.util.List;
import org.junit.Test;

public class PageSharedInformerFactoryTest {

  @Test
  public void shutdownPageInformerFactoryInstantlyAfterStarting() {

    CoreV1Api api = new CoreV1Api();

    PageSharedInformerFactory factory = new PageSharedInformerFactory();

    CallGenerator<PagerCallGeneratorParams> callGenerator =
        params ->
            api.listNamespaceCall(
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

    factory.sharedIndexInformerFor(callGenerator, V1Namespace.class, V1NamespaceList.class);

    factory.startAllRegisteredInformers();

    factory.stopAllRegisteredInformers();
  }

  @Test
  public void shutdownFieldFilterPageInformerFactoryInstantlyAfterStarting() throws IOException {

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

    factory.startAllRegisteredInformers();

    factory.stopAllRegisteredInformers();
  }
}
