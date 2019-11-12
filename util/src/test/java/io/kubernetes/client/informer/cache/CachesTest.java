package io.kubernetes.client.informer.cache;

import static org.junit.Assert.assertEquals;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import java.util.List;
import org.junit.Test;

public class CachesTest {

  @Test
  public void testDefaultNamespaceNameKey() {
    String testName = "test-name";
    String testNamespace = "test-namespace";
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name(testName).namespace(testNamespace));
    assertEquals(testNamespace + "/" + testName, Caches.metaNamespaceKeyFunc(pod));
  }

  @Test
  public void testDefaultNamespaceIndex() {
    String testName = "test-name";
    String testNamespace = "test-namespace";
    V1Pod pod = new V1Pod().metadata(new V1ObjectMeta().name(testName).namespace(testNamespace));
    List<String> indices = Caches.metaNamespaceIndexFunc(pod);
    assertEquals(pod.getMetadata().getNamespace(), indices.get(0));
  }
}
