package io.kubernetes.client.extended.workqueue.ratelimiter;

import com.google.common.util.concurrent.AtomicLongMap;
import java.time.Duration;

/**
 * ItemExponentialFailureRateLimiter does a simple baseDelay*10<sup>num-failures</sup> limit dealing
 * with max failures and expiration are up to the caller
 */
public class ItemExponentialFailureRateLimiter<T> implements RateLimiter<T> {

  private Duration baseDelay;
  private Duration maxDelay;

  private AtomicLongMap<T> failures;

  public ItemExponentialFailureRateLimiter(Duration baseDelay, Duration maxDelay) {
    this.baseDelay = baseDelay;
    this.maxDelay = maxDelay;

    failures = AtomicLongMap.create();
  }

  @Override
  public Duration when(T item) {
    long exp = failures.getAndIncrement(item);
    long d = maxDelay.toMillis() >> exp;
    return d > baseDelay.toMillis() ? baseDelay.multipliedBy(1 << exp) : maxDelay;
  }

  @Override
  public void forget(T item) {
    failures.remove(item);
  }

  @Override
  public int numRequeues(T item) {
    return (int) failures.get(item);
  }
}
