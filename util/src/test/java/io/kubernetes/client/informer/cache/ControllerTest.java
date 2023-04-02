/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.informer.cache;

import static org.junit.Assert.*;

import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.Watch;
import java.time.Duration;
import java.util.Arrays;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.MutablePair;
import org.awaitility.Awaitility;
import org.hamcrest.core.IsEqual;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ControllerTest {

  @Rule public MockitoRule mockitoRule = MockitoJUnit.rule();

  private static final Class<V1Pod> anyApiTypeClass = V1Pod.class;
  private static final long anyFullResyncPeriod = 1000L;

  @Mock private DeltaFIFO deltaFIFOMock;
  @Mock private ListerWatcher<V1Pod, V1PodList> listerWatcherMock;

  @Mock
  private Consumer<Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>>> popProcessFuncMock;

  @Mock private Supplier<Boolean> resyncFuncMock;
  @Mock private BiConsumer<Class<V1Pod>, Throwable> exceptionHandlerMock;

  @Test
  public void testControllerProcessDeltas() {

    AtomicInteger receivingDeltasCount = new AtomicInteger(0);
    V1Pod foo1 = new V1Pod().metadata(new V1ObjectMeta().name("foo1").namespace("default"));
    V1Pod foo2 = new V1Pod().metadata(new V1ObjectMeta().name("foo2").namespace("default"));
    V1Pod foo3 =
        new V1Pod()
            .metadata(new V1ObjectMeta().name("foo3").namespace("default").resourceVersion("rva"));
    V1Pod foo3Updated =
        new V1Pod()
            .metadata(new V1ObjectMeta().name("foo3").namespace("default").resourceVersion("rvb"));

    V1PodList podList =
        new V1PodList().metadata(new V1ListMeta()).items(Arrays.asList(foo1, foo2, foo3));
    DeltaFIFO deltaFIFO = new DeltaFIFO(Caches::deletionHandlingMetaNamespaceKeyFunc, new Cache());

    ListerWatcher<V1Pod, V1PodList> listerWatcher =
        new MockRunOnceListerWatcher<V1Pod, V1PodList>(
            podList, new Watch.Response<V1Pod>(EventType.MODIFIED.name(), foo3Updated));

    Controller<V1Pod, V1PodList> controller =
        new Controller<>(
            V1Pod.class,
            deltaFIFO,
            listerWatcher,
            (deltas) -> {
              receivingDeltasCount.addAndGet(deltas.size());
            });
    Thread controllerThread = new Thread(controller::run);
    controllerThread.setDaemon(true);
    controllerThread.start();

    try {
      Awaitility.await()
          .pollInterval(Duration.ofSeconds(1))
          .timeout(Duration.ofSeconds(5))
          .untilAtomic(receivingDeltasCount, IsEqual.equalTo(4));
      assertEquals(4, receivingDeltasCount.get());
    } catch (Throwable t) {
      throw new RuntimeException(t);
    } finally {
      controller.stop();
    }
  }

  @Test
  public void testReflectorIsConstructedWithExeptionHandler() {
    Controller<V1Pod, V1PodList> controller =
        new Controller<>(
            anyApiTypeClass,
            deltaFIFOMock,
            listerWatcherMock,
            popProcessFuncMock,
            resyncFuncMock,
            anyFullResyncPeriod,
            exceptionHandlerMock);
    assertSame(exceptionHandlerMock, controller.exceptionHandler);

    ReflectorRunnable<V1Pod, V1PodList> reflector = controller.newReflector();

    assertSame(exceptionHandlerMock, reflector.exceptionHandler);
  }

  @Test
  public void testControllerHasNoExceptionHandlerPerDefault() {

    Controller<V1Pod, V1PodList> controller =
        new Controller<>(
            anyApiTypeClass,
            deltaFIFOMock,
            listerWatcherMock,
            popProcessFuncMock,
            resyncFuncMock,
            anyFullResyncPeriod);

    assertNull(controller.exceptionHandler);
  }
}
