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
import static org.mockito.Mockito.*;

import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.openapi.models.V1Status;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Watch;
import io.kubernetes.client.util.Watchable;
import java.util.concurrent.atomic.AtomicReference;
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

  @Test
  public void testReflectorRunnableCaptureListException()
      throws ApiException, InterruptedException {
    RuntimeException expectedException = new RuntimeException("noxu");
    AtomicReference<Throwable> actualException = new AtomicReference<>();
    when(listerWatcher.list(any())).thenThrow(expectedException);
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(
            V1Pod.class,
            listerWatcher,
            deltaFIFO,
            (apiType, t) -> {
              actualException.set(t);
            });
    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();
      Thread.sleep(1000);
    } finally {
      reflectorRunnable.stop();
    }
    assertEquals(expectedException, actualException.get());
  }

  @Test
  public void testReflectorRunnableCaptureWatchException()
      throws ApiException, InterruptedException {
    RuntimeException expectedException = new RuntimeException("noxu");
    AtomicReference<Throwable> actualException = new AtomicReference<>();
    when(listerWatcher.list(any())).thenReturn(new V1PodList().metadata(new V1ListMeta()));
    when(listerWatcher.watch(any())).thenThrow(expectedException);
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(
            V1Pod.class,
            listerWatcher,
            deltaFIFO,
            (apiType, t) -> {
              actualException.set(t);
            });
    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();
      Thread.sleep(1000);
    } finally {
      reflectorRunnable.stop();
    }
    assertEquals(expectedException, actualException.get());
  }
}
