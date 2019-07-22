package io.kubernetes.client.extended.workqueue.ratelimiter;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * ItemFastSlowRateLimiter does a quick retry for a certain number of attempts, then a slow retry
 * after that
 */
public class ItemFastSlowRateLimiter<T> implements RateLimiter<T> {

  private Map<T, Integer> failures;

  private Duration fastDelay;
  private Duration slowDelay;
  private int maxFastAttempts;

  public ItemFastSlowRateLimiter(Duration fastDelay, Duration slowDelay, int maxFastAttempts) {
    this.fastDelay = fastDelay;
    this.slowDelay = slowDelay;
    this.maxFastAttempts = maxFastAttempts;

    failures = new HashMap<>();
  }

  @Override
  public synchronized Duration when(T item) {
    int attempts = failures.getOrDefault(item, 0);
    failures.put(item, attempts + 1);

    if (attempts + 1 <= maxFastAttempts) {
      return fastDelay;
    }

    return slowDelay;
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
