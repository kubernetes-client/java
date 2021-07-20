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
import org.junit.Test;

public class DefaultDelayingQueueTest {

  @Test
  public void testSimpleDelayingQueue() throws Exception {
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
    queue.addAfter("foo", Duration.ofMillis(50));

    assertTrue(waitForWaitingQueueToFill(queue));
    assertTrue(queue.length() == 0);

    Thread.sleep(60L);
    assertTrue(waitForAdded(queue, 1));
    String item = queue.get();
    queue.done(item);

    Thread.sleep(10 * 1000L);
    assertTrue(queue.length() == 0);
  }

  @Test
  public void testDeduping() throws Exception {
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
    String item = "foo";

    queue.addAfter(item, Duration.ofMillis(50));
    assertTrue(waitForWaitingQueueToFill(queue));
    queue.addAfter(item, Duration.ofMillis(70));
    assertTrue(waitForWaitingQueueToFill(queue));
    assertTrue("should not have added", queue.length() == 0);

    // step past the first block, we should receive now
    Thread.sleep(60L);
    assertTrue(waitForAdded(queue, 1));
    item = queue.get();
    queue.done(item);

    // step past the second add
    Thread.sleep(20L);
    assertTrue("should not have added", queue.length() == 0);

    // test again, but this time the earlier should override
    queue.addAfter(item, Duration.ofMillis(50));
    queue.addAfter(item, Duration.ofMillis(30));
    assertTrue(waitForWaitingQueueToFill(queue));
    assertTrue("should not have added", queue.length() == 0);

    Thread.sleep(40L);
    assertTrue(waitForAdded(queue, 1));
    item = queue.get();
    queue.done(item);

    // step past the second add
    Thread.sleep(1L);
    assertTrue("should not have added", queue.length() == 0);
  }

  @Test
  public void testCopyShifting() throws Exception {
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
    final String first = "foo";
    final String second = "bar";
    final String third = "baz";

    queue.addAfter(first, Duration.ofSeconds(1));
    queue.addAfter(second, Duration.ofMillis(500));
    queue.addAfter(third, Duration.ofMillis(250));
    assertTrue(waitForWaitingQueueToFill(queue));
    assertTrue("should not have added", queue.length() == 0);

    Thread.sleep(2000L);
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
