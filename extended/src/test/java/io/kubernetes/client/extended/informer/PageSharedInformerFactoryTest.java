package io.kubernetes.client.extended.informer;

import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.models.V1NamespaceList;
import io.kubernetes.client.util.CallGenerator;
import org.junit.Test;

/**
 * Created by 烛坤 on 2019/10/21.
 *
 * @author 烛坤
 * @date 2019/10/21
 */
public class PageSharedInformerFactoryTest {

  @Test
  public void shutdownInformerFactoryInstantlyAfterStarting() {

    CoreV1Api api = new CoreV1Api();

    PageSharedInformerFactory factory = new PageSharedInformerFactory();

    CallGenerator<PagerCallGeneratorParams> callGenerator =
        params ->
            api.listNamespaceCall(
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

    factory.sharedIndexInformerFor(callGenerator, V1Namespace.class, V1NamespaceList.class);

    factory.startAllRegisteredInformers();

    factory.stopAllRegisteredInformers();
  }
}
