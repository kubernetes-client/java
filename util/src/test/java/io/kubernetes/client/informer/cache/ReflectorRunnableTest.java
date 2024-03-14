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

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ReflectorRunnableTest {

  private static final Class<V1Pod> anyApiType = V1Pod.class;

  @Mock private DeltaFIFO deltaFIFO;

  @Mock private ListerWatcher<V1Pod, V1PodList> listerWatcher;

  @Mock private BiConsumer<Class<V1Pod>, Throwable> exceptionHandler;

  @Test
  void reflectorRunOnce() throws ApiException {
    String mockResourceVersion = "1000";
    when(listerWatcher.list(any()))
        .thenReturn(
            new V1PodList().metadata(new V1ListMeta().resourceVersion(mockResourceVersion)));
    when(listerWatcher.watch(any()))
        .then(
            (v) -> {
              Awaitility.await().forever(); // block forever
              return null;
            });
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<V1Pod, V1PodList>(V1Pod.class, listerWatcher, deltaFIFO);

    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(() -> mockResourceVersion.equals(reflectorRunnable.getLastSyncResourceVersion()));
    } finally {
      reflectorRunnable.stop();
    }
    verify(deltaFIFO, times(1)).replace(any(), any());
    verify(deltaFIFO, never()).add(any());
    verify(listerWatcher, times(1)).list(any());
    verify(listerWatcher, times(1)).watch(any());
  }

  @Test
  void reflectorWatchConnectionCloseOnError() {
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
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(() -> ((MockWatch<V1Pod>) watch).isClosed());
    } finally {
      reflectorRunnable.stop();
    }
  }

  @Test
  void reflectorRunnableCaptureListRuntimeException() throws ApiException {
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
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(() -> expectedException.equals(actualException.get()));
    } finally {
      reflectorRunnable.stop();
    }
  }

  @Test
  void reflectorRunnableShouldPardonList410ApiException() throws ApiException {
    ApiException expectedException = new ApiException(410, "noxu");
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
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(
              () -> {
                return reflectorRunnable.isLastSyncResourceVersionUnavailable();
              });
    } finally {
      reflectorRunnable.stop();
    }
  }

  @Test
  void reflectorRunnableShouldCaptureListNon410ApiException() throws ApiException {
    ApiException expectedException = new ApiException(403, "noxu");
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
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(() -> expectedException.equals(actualException.get()));
    } finally {
      reflectorRunnable.stop();
    }
  }

  @Test
  void reflectorRunnableCaptureWatchException() throws ApiException {
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
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(() -> expectedException.equals(actualException.get()));
    } finally {
      reflectorRunnable.stop();
    }
  }

  @Test
  void reflectorRelistShouldHonorLastSyncResourceVersion() {
    String expectedResourceVersion = "999";
    AtomicReference<String> requestedResourceVersion = new AtomicReference<>();
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(
            V1Pod.class,
            new ListerWatcher<V1Pod, V1PodList>() {
              @Override
              public V1PodList list(CallGeneratorParams params) throws ApiException {
                requestedResourceVersion.set(params.resourceVersion);
                return new V1PodList()
                    .metadata(new V1ListMeta().resourceVersion(expectedResourceVersion));
              }

              @Override
              public Watchable<V1Pod> watch(CallGeneratorParams params) throws ApiException {
                throw new ApiException("HTTP GONE");
              }
            },
            deltaFIFO);

    // run the reflector twice, and check the requesting resource version at the second time.
    // first run
    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(
              () -> expectedResourceVersion.equals(reflectorRunnable.getLastSyncResourceVersion()));
    } finally {
      reflectorRunnable.stop();
    }
    // second run
    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(() -> expectedResourceVersion.equals(requestedResourceVersion.get()));
    } finally {
      reflectorRunnable.stop();
    }
  }

  @Test
  void reflectorListShouldHandleExpiredResourceVersion() throws ApiException {
    String expectedResourceVersion = "100";
    when(listerWatcher.list(any()))
        .thenReturn(
            new V1PodList().metadata(new V1ListMeta().resourceVersion(expectedResourceVersion)));
    // constantly failing watches will make the reflector run only one time
    when(listerWatcher.watch(any())).thenThrow(new ApiException(HttpURLConnection.HTTP_GONE, ""));
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(V1Pod.class, listerWatcher, deltaFIFO);
    CompletableFuture<Void> future = CompletableFuture.runAsync(reflectorRunnable::run);
    Awaitility.await()
        .atMost(Duration.ofSeconds(2))
        .pollInterval(Duration.ofMillis(100))
        .until(() -> future.isDone());
    assertThat(future.isCompletedExceptionally()).isFalse();
  }

  @Test
  void reflectorWatchShouldRelistUponExpiredWatchItem() throws ApiException {
    String expectedResourceVersion = "100";
    Watchable<V1Pod> expiredWatchable = mock(Watchable.class);
    when(expiredWatchable.hasNext()).thenReturn(true);
    when(expiredWatchable.next())
        .thenReturn(
            new Watch.Response<>(
                EventType.ERROR.name(), new V1Status().code(HttpURLConnection.HTTP_GONE)));
    when(listerWatcher.list(any()))
        .thenReturn(
            new V1PodList().metadata(new V1ListMeta().resourceVersion(expectedResourceVersion)));
    // constantly failing watches will make the reflector run only one time
    when(listerWatcher.watch(any())).thenReturn(expiredWatchable);
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(V1Pod.class, listerWatcher, deltaFIFO);
    CompletableFuture<Void> future = CompletableFuture.runAsync(reflectorRunnable::run);
    Awaitility.await()
        .atMost(Duration.ofSeconds(2))
        .pollInterval(Duration.ofMillis(100))
        .until(() -> future.isDone());
    assertThat(future.isCompletedExceptionally()).isFalse();
  }

  @Test
  void reflectorListShouldHandleExpiredResourceVersionFromWatchHandler()
      throws ApiException {
    String expectedResourceVersion = "100";
    when(listerWatcher.list(any()))
        .thenReturn(
            new V1PodList().metadata(new V1ListMeta().resourceVersion(expectedResourceVersion)));

    V1Status v1Status = new V1Status();
    v1Status.setMessage("dummy-error-message");
    v1Status.setCode(410);
    when(listerWatcher.watch(any()))
        .thenReturn(new MockWatch<>(new Watch.Response("Error", v1Status)));
    ReflectorRunnable<V1Pod, V1PodList> reflectorRunnable =
        new ReflectorRunnable<>(V1Pod.class, listerWatcher, deltaFIFO);
    try {
      Thread thread = new Thread(reflectorRunnable::run);
      thread.setDaemon(true);
      thread.start();
      Awaitility.await()
          .atMost(Duration.ofSeconds(1))
          .pollInterval(Duration.ofMillis(100))
          .until(
              () -> expectedResourceVersion.equals(reflectorRunnable.getLastSyncResourceVersion()));
      assertThat(reflectorRunnable.isLastSyncResourceVersionUnavailable()).isTrue();
    } finally {
      reflectorRunnable.stop();
    }
  }

  @Test
  void defaultExceptionHandlerSetPerDefault() {
    ReflectorRunnable<V1Pod, V1PodList> reflector =
        new ReflectorRunnable<>(anyApiType, listerWatcher, deltaFIFO);

    assertThat(reflector.exceptionHandler).isNotNull();
  }

  @Test
  void givemExceptionHandlerSet() {
    ReflectorRunnable<V1Pod, V1PodList> reflector =
        new ReflectorRunnable<>(anyApiType, listerWatcher, deltaFIFO, exceptionHandler);

    assertThat(reflector.exceptionHandler).isSameAs(exceptionHandler);
  }
}
