package io.kubernetes.client.informer.cache;

import static org.junit.Assert.*;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.EnvironmentVariables;

public class ControllerTest {

  @Rule public final EnvironmentVariables environmentVariables = new EnvironmentVariables();

  @Test
  public void testControllerProcessDeltas() throws InterruptedException {

    AtomicInteger receivingDeltasCount = new AtomicInteger(0);
    V1Pod foo1 = new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default"));
    V1Pod foo2 = new V1Pod().metadata(new V1ObjectMeta().name("foo2").namespace("default"));
    V1Pod foo3 = new V1Pod().metadata(new V1ObjectMeta().name("foo3").namespace("default"));

    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta()).items(Arrays.asList(foo1, foo2, foo3));
    DeltaFIFO<V1Pod> deltaFIFO =
        new DeltaFIFO<>(Cache::deletionHandlingMetaNamespaceKeyFunc, new Cache());

    AtomicBoolean runOnce = new AtomicBoolean(false);
    ListerWatcher<V1Pod, V1PodList> listerWatcher =
        new ListerWatcher<V1Pod, V1PodList>() {
          @Override
          public V1PodList list(CallGeneratorParams params) throws ApiException {
            return podList;
          }

          @Override
          public Watchable<V1Pod> watch(CallGeneratorParams params) throws ApiException {
            if (!runOnce.get()) {
              runOnce.set(true);
              return new MockWatch<V1Pod>(
                  new Watch.Response<V1Pod>(EventType.MODIFIED.name(), foo3));
            } else {
              return new MockWatch<V1Pod>();
            }
          }
        };

    Controller<V1Pod, V1PodList> controller =
        new Controller<>(
            V1Pod.class,
            deltaFIFO,
            listerWatcher,
            (deltas) -> {
              receivingDeltasCount.incrementAndGet();
            });
    Thread controllerThread = new Thread(controller::run);
    controllerThread.setDaemon(true);
    controllerThread.start();

    // sleep 1s for processing all the deltas
    Thread.sleep(1000);

    try {
      assertEquals(4, receivingDeltasCount.get());

    } catch (Throwable t) {
      throw new RuntimeException(t);
    } finally {
      controller.stop();
    }
  }
}
