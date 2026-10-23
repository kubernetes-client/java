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
package io.kubernetes.client.util.wait;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.Test;

class WaitTest {

  /**
   * Regression test: {@link Wait#poll} must shut down the internal scheduled executor before
   * returning. Prior to the fix the executor was never shut down, so its (non-daemon) worker thread
   * stayed alive after the call, leaking a thread on every invocation.
   */
  @Test
  void pollShutsDownExecutorThreadAfterReturning() throws InterruptedException {
    AtomicReference<Thread> workerThread = new AtomicReference<>();

    boolean finished =
        Wait.poll(
            Duration.ofMillis(1),
            Duration.ofMillis(1),
            Duration.ofSeconds(5),
            () -> {
              workerThread.compareAndSet(null, Thread.currentThread());
              return true;
            });

    assertThat(finished).isTrue();

    Thread worker = workerThread.get();
    assertThat(worker).as("condition should have executed on an executor thread").isNotNull();

    // After poll returns the executor must have been shut down, so its worker thread terminates.
    // Allow a short grace period for the interrupt/shutdown to take effect.
    long deadline = System.currentTimeMillis() + 2000;
    while (worker.isAlive() && System.currentTimeMillis() < deadline) {
      Thread.sleep(10);
    }

    assertThat(worker.isAlive())
        .as("Wait.poll must shut down its executor so the worker thread is not leaked")
        .isFalse();
  }
}
