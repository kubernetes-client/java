package io.kubernetes.client.extended.workqueue.ratelimiter;

import java.time.Duration;
import java.util.Arrays;

/**
 * DefaultControllerRateLimiter is a default rate limiter for workqueue. It has both overall and
 * per-item rate limiting. The overall is a token bucket and the per-item is exponential
 */
public class DefaultControllerRateLimiter<T> implements RateLimiter<T> {

  private RateLimiter<T> internalRateLimiter;

  public DefaultControllerRateLimiter() {
    this.internalRateLimiter =
        new MaxOfRateLimiter<>(
            Arrays.asList(
                new ItemExponentialFailureRateLimiter<>(
                    Duration.ofMillis(5), Duration.ofSeconds(1000)),
                new BucketRateLimiter<>(100, 10, Duration.ofMinutes(1))));
  }

  @Override
  public Duration when(T item) {
    return internalRateLimiter.when(item);
  }

  @Override
  public void forget(T item) {
    internalRateLimiter.forget(item);
  }

  @Override
  public int numRequeues(T item) {
    return internalRateLimiter.numRequeues(item);
  }
}
