package io.kubernetes.client.informer;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Namespace;
import io.kubernetes.client.models.V1NamespaceList;
import io.kubernetes.client.util.CallGeneratorParams;
import org.junit.Test;

public class SharedInformerFactoryTest {
  @Test
  public void shutdownInformerFactoryInstantlyAfterStarting() {
    CoreV1Api api = new CoreV1Api();
    SharedInformerFactory factory = new SharedInformerFactory();
    factory.sharedIndexInformerFor(
        (CallGeneratorParams params) -> {
          try {
            return api.listNamespaceCall(
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
        V1Namespace.class,
        V1NamespaceList.class);

    factory.startAllRegisteredInformers();
    factory.stopAllRegisteredInformers();
  }
}
