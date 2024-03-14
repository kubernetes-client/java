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

import io.kubernetes.client.extended.workqueue.ratelimiter.RateLimiter;
import java.time.Duration;
import java.util.concurrent.Executors;
import org.junit.jupiter.api.Test;

class DefaultRateLimitQueueTest {

  private static class MockRateLimiter<T> implements RateLimiter<T> {

    private int count;

    private static Duration mockConstantBackoff = Duration.ofMillis(500);

    @Override
    public Duration when(Object item) {
      return mockConstantBackoff;
    }

    @Override
    public void forget(Object item) {
      count = 0;
    }

    @Override
    public int numRequeues(Object item) {
      int requeue = count;
      count++;
      return requeue;
    }
  }

  @Test
  void simpleRateLimitQueue() throws Exception {
    MockRateLimiter<String> mockRateLimiter = new MockRateLimiter<>();
    DefaultRateLimitingQueue<String> rlq =
        new DefaultRateLimitingQueue<>(Executors.newSingleThreadExecutor(), mockRateLimiter);
    long t1 = System.nanoTime();
    rlq.addRateLimited("foo");
    rlq.get();
    long t2 = System.nanoTime() - 100000;
    long elapsed = t2-t1;
    long elapsedMillis = Math.round((float) elapsed / 1000_000f);
    long backoffMillis = Math.round((float) MockRateLimiter.mockConstantBackoff.toNanos() / 1000_000f);
    assertThat(elapsedMillis).isGreaterThanOrEqualTo(backoffMillis);
  }
}
