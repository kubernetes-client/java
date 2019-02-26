package io.kubernetes.client.informer.cache;

import static org.junit.Assert.*;

import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1Pod;
import java.util.Arrays;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class ListerTest {
  @Rule public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  @Test
  public void testListerBasic() {
    Cache<V1Pod> podCache = new Cache<>();

    Lister<V1Pod> namespacedPodLister = new Lister<>(podCache, "default");
    List<V1Pod> emptyPodList = namespacedPodLister.list();
    assertEquals(0, emptyPodList.size());

    podCache.replace(
        Arrays.asList(
            new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default")),
            new V1Pod().metadata(new V1ObjectMeta().name("foo2").namespace("default")),
            new V1Pod().metadata(new V1ObjectMeta().name("foo3").namespace("default"))),
        "0");
    List<V1Pod> namespacedPodList = namespacedPodLister.list();
    assertEquals(3, namespacedPodList.size());

    Lister<V1Pod> allNamespacedPodLister = new Lister<>(podCache);
    List<V1Pod> allPodList = allNamespacedPodLister.list();
    assertEquals(3, allPodList.size());

    namespacedPodList = allNamespacedPodLister.namespace("default").list();
    assertEquals(3, namespacedPodList.size());
  }
}
