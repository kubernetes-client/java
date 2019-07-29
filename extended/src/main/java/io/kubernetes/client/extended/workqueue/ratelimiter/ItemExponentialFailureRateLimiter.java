package io.kubernetes.client.extended.workqueue.ratelimiter;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * ItemExponentialFailureRateLimiter does a simple baseDelay*10<sup>num-failures</sup> limit dealing
 * with max failures and expiration are up to the caller
 */
public class ItemExponentialFailureRateLimiter<T> implements RateLimiter<T> {

  private Duration baseDelay;
  private Duration maxDelay;

  private Map<T, Integer> failures;

  public ItemExponentialFailureRateLimiter(Duration baseDelay, Duration maxDelay) {
    this.baseDelay = baseDelay;
    this.maxDelay = maxDelay;

    failures = new HashMap<>();
  }

  @Override
  public synchronized Duration when(T item) {
    int exp = failures.getOrDefault(item, 0);
    failures.put(item, exp + 1);
    long d = maxDelay.toMillis() >> exp;
    return d > baseDelay.toMillis() ? baseDelay.multipliedBy(1 << exp) : maxDelay;
  }

  @Override
  public synchronized void forget(T item) {
    failures.remove(item);
  }

  @Override
  public synchronized int numRequeues(T item) {
    return failures.getOrDefault(item, 0);
  }
}
