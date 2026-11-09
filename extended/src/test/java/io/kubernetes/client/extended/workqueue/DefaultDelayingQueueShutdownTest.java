/*
Copyright 2026 The Kubernetes Authors.
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
package io.kubernetes.client.extended.workqueue;

import static org.assertj.core.api.Assertions.assertThat;

import io.kubernetes.client.extended.controller.DefaultController;
import io.kubernetes.client.extended.controller.builder.ControllerBuilder;
import io.kubernetes.client.extended.controller.builder.DefaultControllerBuilder;
import io.kubernetes.client.extended.controller.reconciler.Result;
import io.kubernetes.client.extended.wait.Wait;
import io.kubernetes.client.extended.workqueue.ratelimiter.DefaultControllerRateLimiter;
import java.lang.reflect.Field;
import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DefaultDelayingQueueShutdownTest {

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  void defaultDelayingQueueTerminates(boolean delayed) throws Exception {
    assertOwnedExecutorTerminates(new DefaultDelayingQueue<>(), delayed);
  }

  @ParameterizedTest
  @ValueSource(booleans = {false, true})
  void defaultRateLimitingQueueTerminates(boolean delayed) throws Exception {
    assertOwnedExecutorTerminates(new DefaultRateLimitingQueue<>(), delayed);
  }

  private void assertOwnedExecutorTerminates(DefaultDelayingQueue<String> queue, boolean delayed)
      throws Exception {
    ExecutorService executor = ownedExecutor(queue);
    try {
      if (delayed) {
        queue.addAfter("later", Duration.ofDays(1));
        assertThat(
                Wait.poll(
                    Duration.ofMillis(10),
                    Duration.ofSeconds(5),
                    () -> queue.waitingForAddQueue.isEmpty()))
            .isTrue();
      }
      queue.shutDown();
      queue.shutDown();
      assertThat(queue.isShuttingDown()).isTrue();
      assertThat(executor.isShutdown()).isTrue();
      assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue();
      queue.addAfter("ignored", Duration.ZERO);
      assertThat(queue.get()).isNull();
    } finally {
      queue.shutDown();
      executor.shutdownNow();
      assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue();
    }
  }

  @ParameterizedTest
  @ValueSource(ints = {0, 1, 2})
  void suppliedExecutorRemainsUsable(int constructor) throws Exception {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    DefaultDelayingQueue<String> queue = suppliedQueue(executor, constructor);
    try {
      queue.addAfter("later", Duration.ofDays(1));
      assertThat(
              Wait.poll(
                  Duration.ofMillis(10),
                  Duration.ofSeconds(5),
                  () -> queue.waitingForAddQueue.isEmpty()))
          .isTrue();
      queue.shutDown();
      queue.shutDown();
      assertThat(executor.isShutdown()).isFalse();
      // On a single-thread executor this can complete only after the waiting loop exits.
      assertThat(executor.submit(() -> "still usable").get(5, TimeUnit.SECONDS))
          .isEqualTo("still usable");
    } finally {
      queue.shutDown();
      executor.shutdownNow();
      assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue();
    }
  }

  @Test
  void shutdownBeforeWaitingTaskStartsDoesNotInterruptOtherWork() throws Exception {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    CountDownLatch started = new CountDownLatch(1);
    CountDownLatch release = new CountDownLatch(1);
    Future<Boolean> unrelated =
        executor.submit(
            () -> {
              started.countDown();
              return release.await(5, TimeUnit.SECONDS);
            });
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>(executor);
    try {
      assertThat(started.await(5, TimeUnit.SECONDS)).isTrue();
      queue.shutDown();
      queue.shutDown();
      Field field = DefaultDelayingQueue.class.getDeclaredField("waitingTask");
      field.setAccessible(true);
      assertThat(((Future<?>) field.get(queue)).isCancelled()).isTrue();
      assertThat(unrelated.isDone()).isFalse();
      release.countDown();
      assertThat(unrelated.get(5, TimeUnit.SECONDS)).isTrue();
      assertThat(executor.submit(() -> "still usable").get(5, TimeUnit.SECONDS))
          .isEqualTo("still usable");
    } finally {
      release.countDown();
      queue.shutDown();
      executor.shutdownNow();
      assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue();
    }
  }

  @Test
  void controllerShutdownTerminatesQueueExecutor() throws Exception {
    DefaultController controller =
        (DefaultController)
            ControllerBuilder.defaultBuilder(null)
                .withReconciler(request -> new Result(false))
                .build();
    ExecutorService executor =
        ownedExecutor((DefaultDelayingQueue<?>) controller.getWorkQueue());
    try {
      controller.shutdown();
      controller.shutdown();
      assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue();
    } finally {
      controller.shutdown();
      executor.shutdownNow();
      assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue();
    }
  }

  @Test
  void replacingControllerQueueTerminatesOriginalExecutor() throws Exception {
    DefaultControllerBuilder builder = ControllerBuilder.defaultBuilder(null);
    Field field = DefaultControllerBuilder.class.getDeclaredField("workQueue");
    field.setAccessible(true);
    DefaultDelayingQueue<?> queue = (DefaultDelayingQueue<?>) field.get(builder);
    ExecutorService executor = ownedExecutor(queue);
    try {
      builder.withWorkQueue(null);
      assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue();
    } finally {
      queue.shutDown();
      executor.shutdownNow();
      assertThat(executor.awaitTermination(5, TimeUnit.SECONDS)).isTrue();
    }
  }

  private static ExecutorService ownedExecutor(DefaultDelayingQueue<?> queue) throws Exception {
    Field field = DefaultDelayingQueue.class.getDeclaredField("ownedWaitingWorker");
    field.setAccessible(true);
    return (ExecutorService) field.get(queue);
  }

  private static DefaultDelayingQueue<String> suppliedQueue(
      ExecutorService executor, int constructor) {
    switch (constructor) {
      case 0:
        return new DefaultDelayingQueue<>(executor);
      case 1:
        return new DefaultRateLimitingQueue<>(executor);
      default:
        return new DefaultRateLimitingQueue<>(executor, new DefaultControllerRateLimiter<>());
    }
  }
}
