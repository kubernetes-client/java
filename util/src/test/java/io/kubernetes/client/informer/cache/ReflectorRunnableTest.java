package io.kubernetes.client.informer.cache;

import static org.junit.Assert.*;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.models.*;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class ReflectorRunnableTest {

  @Rule public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  @Test
  public void testReflectorRunOnce() throws InterruptedException {
    Cache<V1Pod> cache = new Cache<>();
    String mockResourceVersion = "1000";
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(
            V1Pod.class,
            new ListerWatcher<V1Pod, V1PodList>() {
              @Override
              public V1PodList list(CallGeneratorParams params) throws ApiException {
                return new V1PodList()
                    .metadata(new V1ListMeta().resourceVersion(mockResourceVersion));
              }

              @Override
              public Watchable<V1Pod> watch(CallGeneratorParams params) throws ApiException {
                return new MockWatch<V1Pod>(
                    new Watch.Response<V1Pod>(
                        EventType.ADDED.name(),
                        new V1Pod()
                            .metadata(new V1ObjectMeta().name("test").namespace("default"))));
              }
            },
            cache);

    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();

      // sleep 1s for starting list-watch
      Thread.sleep(1000);

      List objs = cache.list();
      assertEquals(1, objs.size());
      assertEquals("test", ((V1Pod) objs.get(0)).getMetadata().getName());
      assertEquals("default", ((V1Pod) objs.get(0)).getMetadata().getNamespace());
    } finally {
      reflectorRunnable.stop();
    }
  }

  @Test
  public void testReflectorWatchConnectionCloseOnError() throws InterruptedException {
    Watchable<V1Pod> watch =
        new MockWatch<V1Pod>(
            new Watch.Response<V1Pod>(EventType.ERROR.name(), new V1Status().status("403")));
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(
            V1Pod.class,
            new ListerWatcher<V1Pod, V1PodList>() {
              @Override
              public V1PodList list(CallGeneratorParams params) throws ApiException {
                return new V1PodList().metadata(new V1ListMeta());
              }

              @Override
              public Watchable<V1Pod> watch(CallGeneratorParams params) throws ApiException {
                return watch;
              }
            },
            new Cache<>());
    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();

      Thread.sleep(1000);

      assertTrue(((MockWatch<V1Pod>) watch).isClosed());
    } finally {
      reflectorRunnable.stop();
    }
  }
}
