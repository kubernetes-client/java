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
package io.kubernetes.client.extended.workqueue;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.junit.jupiter.api.Test;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

class DefaultWorkQueueTest {

  private static final long TIMEOUT_SECONDS = 10;

  @Test
  void multiProducerAndConsumers() throws Exception {
    DefaultWorkQueue<String> queue = new DefaultWorkQueue<>();
    final int producerCount = 10;
    final int consumerCount = 5;
    Semaphore start = new Semaphore(0);
    ConcurrentLinkedQueue<Throwable> failures = new ConcurrentLinkedQueue<>();

    // Start producers
    CountDownLatch producerLatch = new CountDownLatch(producerCount);
    for (int i = 0; i < producerCount; i++) {
      final int num = i;
      Thread t =
          new Thread(
              () -> {
                try {
                  start.acquire();
                  for (int j = 0; j < 50; j++) {
                    queue.add(String.valueOf(num));
                  }
                } catch (InterruptedException e) {
                  failures.add(e);
                  Thread.currentThread().interrupt();
                } finally {
                  producerLatch.countDown();
                }
              });
      t.start();
    }

    // Start consumers
    CountDownLatch consumerLatch = new CountDownLatch(consumerCount);
    for (int i = 0; i < consumerCount; i++) {
      Thread t =
          new Thread(
              () -> {
                try {
                  start.acquire();
                  for (; ; ) {
                    String item = queue.get();
                    if (item == null) {
                      return;
                    }
                    if ("added after shutdown!".equals(item)) {
                      failures.add(new AssertionError("Got an item added after shutdown"));
                    }
                    queue.done(item);
                  }
                } catch (InterruptedException e) {
                  failures.add(e);
                  Thread.currentThread().interrupt();
                } finally {
                  consumerLatch.countDown();
                }
              });
      t.start();
    }

    start.release(producerCount + consumerCount);

    boolean producersFinished;
    try {
      producersFinished = producerLatch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS);
    } finally {
      queue.shutDown();
    }
    queue.add("added after shutdown!");

    assertThat(producersFinished).as("producers finished").isTrue();
    assertThat(consumerLatch.await(TIMEOUT_SECONDS, TimeUnit.SECONDS))
        .as("consumers finished")
        .isTrue();
    assertThat(failures).isEmpty();
    assertThat(queue.length()).isZero();
  }

  @Test
  void addWhileProcessing() throws Exception {
    DefaultWorkQueue<String> queue = new DefaultWorkQueue<>();
    final int producerCount = 10;
    final int consumerCount = 5;

    // Start producers
    CountDownLatch producerLatch = new CountDownLatch(producerCount);
    for (int i = 0; i < producerCount; i++) {
      final int num = i;
      Thread t =
          new Thread(
              () -> {
                queue.add(String.valueOf(num));
                producerLatch.countDown();
              });
      t.start();
    }

    // Start consumers
    CountDownLatch consumerLatch = new CountDownLatch(consumerCount);
    for (int i = 0; i < consumerCount; i++) {
      Thread t =
          new Thread(
              () -> {
                // Every worker will re-add every item up to two times.
                // This tests the dirty-while-processing case.
                Map<String, Integer> counters = new HashMap<>();
                try {
                  for (; ; ) {
                    String item = queue.get();
                    if (item == null) {
                      return;
                    }
                    counters.putIfAbsent(item, 1);
                    counters.computeIfPresent(item, (s, integer) -> counters.get(s) + 1);
                    if (counters.get(item) < 2) {
                      queue.add(item);
                    }
                    queue.done(item);
                  }
                } catch (Exception e) {
                  // empty body
                } finally {
                  consumerLatch.countDown();
                }
              });
      t.start();
    }

    producerLatch.await();
    queue.shutDown();
    consumerLatch.await();
  }

  @Test
  void len() {
    DefaultWorkQueue<String> queue = new DefaultWorkQueue<>();
    queue.add("foo");
    assertThat(queue.length()).isEqualTo(1);
    queue.add("bar");
    assertThat(queue.length()).isEqualTo(2);
    queue.add("foo"); // should not increase the queue length.
    assertThat(queue.length()).isEqualTo(2);
  }

  @Test
  void reinsert() throws Exception {
    DefaultWorkQueue<String> queue = new DefaultWorkQueue<>();
    queue.add("foo");

    // Start processing
    String item = queue.get();
    assertThat(item).isEqualTo("foo");

    // Add it back while processing
    queue.add(item);

    // Finish it up
    queue.done(item);

    // It should be back on the queue
    item = queue.get();
    assertThat(item).isEqualTo("foo");

    // Finish that one up
    queue.done(item);

    assertThat(queue.length()).isZero();
  }
}
