package io.kubernetes.client.informer.cache;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReflectorRunnableTest {

  @Rule public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  @Mock private DeltaFIFO deltaFIFO;

  @Mock private ListerWatcher<V1Pod, V1PodList> listerWatcher;

  @Test
  public void testReflectorRunOnce() throws InterruptedException, ApiException {
    String mockResourceVersion = "1000";
    when(listerWatcher.list(any()))
        .thenReturn(
            new V1PodList().metadata(new V1ListMeta().resourceVersion(mockResourceVersion)));
    when(listerWatcher.watch(any()))
        .then(
            (v) -> {
              Thread.sleep(999999L); // block forever
              return null;
            });
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<V1Pod, V1PodList>(V1Pod.class, listerWatcher, deltaFIFO);

    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();

      // sleep 1s for starting list-watch
      Thread.sleep(1000);

      verify(deltaFIFO, times(1)).replace(any(), any());
      verify(deltaFIFO, never()).add(any());
      verify(listerWatcher, times(1)).list(any());
      verify(listerWatcher, times(1)).watch(any());
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
            deltaFIFO);
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
