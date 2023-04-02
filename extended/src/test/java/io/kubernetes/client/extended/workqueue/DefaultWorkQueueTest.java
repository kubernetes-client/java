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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultWorkQueueTest {

  private static final Logger LOGGER = LoggerFactory.getLogger(DefaultWorkQueueTest.class);

  @Test
  public void testMultiProducerAndConsumers() throws Exception {
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
                try {
                  for (int j = 0; j < 50; j++) {
                    queue.add(String.valueOf(num));
                    Thread.sleep(10);
                  }
                } catch (Exception e) {
                  // empty body
                } finally {
                  producerLatch.countDown();
                }
              });
      t.start();
    }

    // Start consumers
    CountDownLatch consumerLatch = new CountDownLatch(consumerCount);
    for (int i = 0; i < consumerCount; i++) {
      final int num = i;
      Thread t =
          new Thread(
              () -> {
                try {
                  for (; ; ) {
                    String item = queue.get();
                    assertNotEquals(
                        "Got an item added after shutdown.", "added after shutdown!", item);
                    if (item == null) {
                      return;
                    }

                    LOGGER.info("Worker {}: begin processing {}", num, item);
                    Thread.sleep(50);
                    LOGGER.info("Worker {}: done processing {}", num, item);
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
    queue.add("added after shutdown!");
    consumerLatch.await();
  }

  @Test
  public void testAddWhileProcessing() throws Exception {
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
  public void testLen() throws Exception {
    DefaultWorkQueue<String> queue = new DefaultWorkQueue<>();
    queue.add("foo");
    assertEquals(1, queue.length());
    queue.add("bar");
    assertEquals(2, queue.length());
    queue.add("foo"); // should not increase the queue length.
    assertEquals(2, queue.length());
  }

  @Test
  public void testReinsert() throws Exception {
    DefaultWorkQueue<String> queue = new DefaultWorkQueue<>();
    queue.add("foo");

    // Start processing
    String item = queue.get();
    assertEquals("foo", item);

    // Add it back while processing
    queue.add(item);

    // Finish it up
    queue.done(item);

    // It should be back on the queue
    item = queue.get();
    assertEquals("foo", item);

    // Finish that one up
    queue.done(item);

    assertEquals(0, queue.length());
  }
}
