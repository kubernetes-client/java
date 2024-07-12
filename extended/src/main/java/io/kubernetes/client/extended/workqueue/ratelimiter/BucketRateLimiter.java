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
package io.kubernetes.client.extended.workqueue.ratelimiter;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;
import io.github.bucket4j.local.SynchronizationStrategy;
import java.time.Duration;

/** A light-weight token bucket implementation for RateLimiter. */
public class BucketRateLimiter<T> implements RateLimiter<T> {
  private Bucket bucket;

  /**
   * @param capacity Capacity is the maximum number of tokens can be consumed.
   * @param tokensGeneratedInPeriod Tokens generated in period.
   * @param period Period that generating specific number of tokens.
   */
  public BucketRateLimiter(long capacity, long tokensGeneratedInPeriod, Duration period) {
    Bandwidth bandwidth =
        Bandwidth.classic(capacity, Refill.greedy(tokensGeneratedInPeriod, period));
    this.bucket =
        Bucket.builder()
            .addLimit(bandwidth)
            .withSynchronizationStrategy(SynchronizationStrategy.SYNCHRONIZED)
            .build();
  }

  @Override
  public Duration when(T item) {
    long overdraftNanos = bucket.consumeIgnoringRateLimits(1);
    return Duration.ofNanos(overdraftNanos);
  }

  @Override
  public void forget(T item) {}

  @Override
  public int numRequeues(T item) {
    return 0;
  }
}
