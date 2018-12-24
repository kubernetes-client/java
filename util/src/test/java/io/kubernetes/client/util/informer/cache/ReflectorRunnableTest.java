package io.kubernetes.client.util.informer.cache;

import io.kubernetes.client.informer.cache.ReflectorRunnable;
import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
import org.junit.Assert;
import org.junit.Test;

public class ReflectorRunnableTest {
  @Test
  public void testListerWatcherRunnable() {
    String listingResourceVersion = "1000";
    V1PodList podList = new V1PodList();
    V1ListMeta listMeta = new V1ListMeta();
    listMeta.setResourceVersion(listingResourceVersion);
    podList.setMetadata(listMeta);
    podList.addItemsItem(new V1Pod());
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(
            V1Pod.class, new MockListerWatcher<V1Pod, V1PodList>(podList), new MockStore<V1Pod>());
    reflectorRunnable.run();
    Assert.assertEquals(listingResourceVersion, reflectorRunnable.getLastSyncResourceVersion());
  }
}
