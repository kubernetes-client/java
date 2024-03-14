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

import io.kubernetes.client.extended.wait.Wait;
import java.time.Duration;
import java.time.Instant;
import org.junit.jupiter.api.Test;

class DefaultDelayingQueueTest {

  @Test
  void simpleDelayingQueue() throws Exception {
    final Instant staticTime = Instant.now();
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
    // Hold time still
    queue.injectTimeSource(
        () -> {
          return staticTime.toEpochMilli();
        });
    queue.addAfter("foo", Duration.ofMillis(50));

    // Verify that we haven't released it
    assertThat(waitForWaitingQueueToFill(queue)).isTrue();
    assertThat(0).isEqualTo(queue.length());

    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(100).toEpochMilli();
        });
    assertThat(waitForAdded(queue, 1)).isTrue();
    String item = queue.get();
    queue.done(item);

    Thread.sleep(10 * 1000L);
    assertThat(0).isEqualTo(queue.length());
  }

  @Test
  void deduping() throws Exception {
    final Instant staticTime = Instant.now();
    DefaultDelayingQueue<String> queue = new DefaultDelayingQueue<>();
    String item = "foo";

    // Hold time still
    queue.injectTimeSource(
        () -> {
          return staticTime.toEpochMilli();
        });

    queue.addAfter(item, Duration.ofMillis(50));
    assertThat(waitForWaitingQueueToFill(queue)).isTrue();
    queue.addAfter(item, Duration.ofMillis(70));
    assertThat(waitForWaitingQueueToFill(queue)).isTrue();
    assertThat(queue.length()).withFailMessage("should not have added").isZero();

    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(60).toEpochMilli();
        });
    assertThat(waitForAdded(queue, 1)).isTrue();
    item = queue.get();
    queue.done(item);

    // step past the second add
    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(90).toEpochMilli();
        });
    assertThat(queue.length()).withFailMessage("should not have added").isZero();

    // test again, but this time the earlier should override
    queue.addAfter(item, Duration.ofMillis(50));
    queue.addAfter(item, Duration.ofMillis(30));
    assertThat(waitForWaitingQueueToFill(queue)).isTrue();
    assertThat(queue.length()).withFailMessage("should not have added").isZero();

    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(150).toEpochMilli();
        });
    assertThat(waitForAdded(queue, 1)).isTrue();
    item = queue.get();
    queue.done(item);

    // step past the second add
    // Advance time
    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(190).toEpochMilli();
        });
    assertThat(queue.length()).withFailMessage("should not have added").isZero();
  }

  @Test
  void copyShifting() throws Exception {
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
    assertThat(waitForWaitingQueueToFill(queue)).isTrue();
    assertThat(queue.length()).withFailMessage("should not have added").isZero();

    queue.injectTimeSource(
        () -> {
          return staticTime.plusMillis(2000).toEpochMilli();
        });
    assertThat(waitForAdded(queue, 3)).isTrue();
    String actualFirst = queue.get();
    assertThat(third).isEqualTo(actualFirst);
    String actualSecond = queue.get();
    assertThat(second).isEqualTo(actualSecond);
    String actualThird = queue.get();
    assertThat(first).isEqualTo(actualThird);
  }

  private boolean waitForAdded(DefaultDelayingQueue queue, int size) {
    return Wait.poll(Duration.ofMillis(10), Duration.ofSeconds(10), () -> queue.length() == size);
  }

  private boolean waitForWaitingQueueToFill(DefaultDelayingQueue queue) {
    return Wait.poll(
        Duration.ofMillis(10), Duration.ofSeconds(10), () -> queue.waitingForAddQueue.size() == 0);
  }
}
