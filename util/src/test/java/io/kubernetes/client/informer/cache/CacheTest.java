package io.kubernetes.client.informer.cache;

import static org.junit.Assert.*;

import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1Pod;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CacheTest {

  @Rule public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  private static String mockIndexName = "mock";

  private static List<String> mockIndexFunc(Object obj) {
    if (obj == null) {
      return Arrays.asList("null");
    }
    return Arrays.asList(obj.getClass().getName());
  }

  private static String mockKeyFunc(Object obj) {
    if (obj == null) {
      return "null";
    }
    return String.valueOf(System.identityHashCode(obj));
  }

  private static Cache cache =
      new Cache<>(mockIndexName, CacheTest::mockIndexFunc, CacheTest::mockKeyFunc);

  public CacheTest(Object obj, String index) {
    this.obj = obj;
    this.index = index;
  }

  private Object obj;
  private String index;

  @Parameterized.Parameters
  public static Collection data() {

    V1Pod normalPod = new V1Pod();
    V1ObjectMeta normalPodMeta = new V1ObjectMeta();
    normalPodMeta.setName("foo");
    normalPodMeta.setNamespace("default");
    normalPod.setMetadata(normalPodMeta);

    V1Pod missingNamespacePod = new V1Pod();
    V1ObjectMeta missingNamespacePodMeta = new V1ObjectMeta();
    missingNamespacePodMeta.setName("foo");
    missingNamespacePodMeta.setNamespace(null);
    missingNamespacePod.setMetadata(missingNamespacePodMeta);

    V1Pod missingNamePod = new V1Pod();
    V1ObjectMeta missingNamePodMeta = new V1ObjectMeta();
    missingNamePodMeta.setName(null);
    missingNamePodMeta.setNamespace("default");
    missingNamePod.setMetadata(missingNamePodMeta);

    return Arrays.asList(
        new Object[][] {
          {normalPod, "io.kubernetes.client.models.V1Pod"},
          {missingNamespacePod, "io.kubernetes.client.models.V1Pod"},
          {missingNamePod, "io.kubernetes.client.models.V1Pod"},
          {null, "null"},
        });
  }

  @Test
  public void testCacheIndex() {
    cache.replace(Arrays.asList(this.obj), "0");

    String index = mockIndexFunc(this.obj).get(0);
    String key = mockKeyFunc(this.obj);
    assertEquals(this.index, index);

    List indexedObjectList = cache.byIndex(mockIndexName, index);
    assertEquals(this.obj, indexedObjectList.get(0));

    List indexedObjectlist2 = cache.index(mockIndexName, this.obj);
    assertEquals(this.obj, indexedObjectlist2.get(0));

    List<String> allExistingKeys = cache.listKeys();
    assertEquals(1, allExistingKeys.size());
    assertEquals(key, allExistingKeys.get(0));
  }

  @Test
  public void testCacheStore() {
    if (this.obj == null) {
      // skip null object storing test b/c it should be checked before invoking cache
      return;
    }

    cache.replace(Arrays.asList(this.obj), "0");

    cache.delete(this.obj);

    V1Pod pod = ((V1Pod) this.obj);
    List indexedObjectList = cache.byIndex(mockIndexName, this.index);
    assertEquals(0, indexedObjectList.size());
    assertEquals(null, pod.getMetadata().getClusterName());

    cache.add(this.obj);

    // replace cached object w/ null value
    String newClusterName = "test_cluster";
    pod.getMetadata().setClusterName(newClusterName);
    cache.update(this.obj);

    assertEquals(1, cache.list().size());
    assertEquals(newClusterName, pod.getMetadata().getClusterName());
  }

  @Test
  public void testDefaultNamespaceIndex() {
    if (this.obj == null) {
      // skip null object storing test b/c it should be checked before invoking cache
      return;
    }

    V1Pod pod = ((V1Pod) this.obj);

    List<String> indices = Cache.metaNamespaceIndexFunc(this.obj);
    assertEquals(pod.getMetadata().getNamespace(), indices.get(0));
  }

  @Test
  public void testDefaultNamespaceNameKey() {
    if (this.obj == null) {
      // skip null object storing test b/c it should be checked before invoking cache
      return;
    }

    Cache.metaNamespaceKeyFunc(this.obj);
  }
}
