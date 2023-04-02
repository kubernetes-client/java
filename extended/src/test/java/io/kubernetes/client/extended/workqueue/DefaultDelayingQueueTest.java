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
import static org.junit.Assert.assertTrue;

import io.kubernetes.client.extended.wait.Wait;
import java.time.Duration;
import java.time.Instant;
import org.junit.Test;

public class DefaultDelayingQueueTest {

  @Test
  public void testSimpleDelayingQueue() throws Exception {
    final Instant staticTime = Instant.now();
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
    // Hold time still
    queue.injectTimeSource(
        () -> {
          return staticTime.toEpochMilli();
        });
    queue.addAfter("foo", Duration.ofMillis(50));

    // Verify that we haven't released it
    assertTrue(waitForWaitingQueueToFill(queue));
    assertEquals(queue.length(), 0);

    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(100).toEpochMilli();
        });
    assertTrue(waitForAdded(queue, 1));
    String item = queue.get();
    queue.done(item);

    Thread.sleep(10 * 1000L);
    assertEquals(queue.length(), 0);
  }

  @Test
  public void testDeduping() throws Exception {
    final Instant staticTime = Instant.now();
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
    String item = "foo";

    // Hold time still
    queue.injectTimeSource(
        () -> {
          return staticTime.toEpochMilli();
        });

    queue.addAfter(item, Duration.ofMillis(50));
    assertTrue(waitForWaitingQueueToFill(queue));
    queue.addAfter(item, Duration.ofMillis(70));
    assertTrue(waitForWaitingQueueToFill(queue));
    assertTrue("should not have added", queue.length() == 0);

    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(60).toEpochMilli();
        });
    assertTrue(waitForAdded(queue, 1));
    item = queue.get();
    queue.done(item);

    // step past the second add
    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(90).toEpochMilli();
        });
    assertTrue("should not have added", queue.length() == 0);

    // test again, but this time the earlier should override
    queue.addAfter(item, Duration.ofMillis(50));
    queue.addAfter(item, Duration.ofMillis(30));
    assertTrue(waitForWaitingQueueToFill(queue));
    assertTrue("should not have added", queue.length() == 0);

    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(150).toEpochMilli();
        });
    assertTrue(waitForAdded(queue, 1));
    item = queue.get();
    queue.done(item);

    // step past the second add
    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(190).toEpochMilli();
        });
    assertTrue("should not have added", queue.length() == 0);
  }

  @Test
  public void testCopyShifting() throws Exception {
    final Instant staticTime = Instant.now();
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
    queue.injectTimeSource(
        () -> {
          return staticTime.toEpochMilli();
        });

    final String first = "foo";
    final String second = "bar";
    final String third = "baz";

    queue.addAfter(first, Duration.ofSeconds(1));
    queue.addAfter(second, Duration.ofMillis(500));
    queue.addAfter(third, Duration.ofMillis(250));
    assertTrue(waitForWaitingQueueToFill(queue));
    assertTrue("should not have added", queue.length() == 0);

    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(2000).toEpochMilli();
        });
    assertTrue(waitForAdded(queue, 3));
    String actualFirst = queue.get();
    assertEquals(actualFirst, third);
    String actualSecond = queue.get();
    assertEquals(actualSecond, second);
    String actualThird = queue.get();
    assertEquals(actualThird, first);
  }

  private boolean waitForAdded(DefaultDelayingQueue queue, int size) {
    return Wait.poll(Duration.ofMillis(10), Duration.ofSeconds(10), () -> queue.length() == size);
  }

  private boolean waitForWaitingQueueToFill(DefaultDelayingQueue queue) {
    return Wait.poll(
        Duration.ofMillis(10), Duration.ofSeconds(10), () -> queue.waitingForAddQueue.size() == 0);
  }
}
