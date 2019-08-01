package io.kubernetes.client.extended.workqueue.ratelimiter;

import com.google.common.util.concurrent.AtomicLongMap;
import java.time.Duration;

/**
 * ItemFastSlowRateLimiter does a quick retry for a certain number of attempts, then a slow retry
 * after that
 */
public class ItemFastSlowRateLimiter<T> implements RateLimiter<T> {

  private Duration fastDelay;
  private Duration slowDelay;
  private int maxFastAttempts;

  private AtomicLongMap<T> failures;

  public ItemFastSlowRateLimiter(Duration fastDelay, Duration slowDelay, int maxFastAttempts) {
    this.fastDelay = fastDelay;
    this.slowDelay = slowDelay;
    this.maxFastAttempts = maxFastAttempts;

    failures = AtomicLongMap.create();
  }

  @Override
  public Duration when(T item) {
    long attempts = failures.incrementAndGet(item);
    if (attempts <= maxFastAttempts) {
      return fastDelay;
    }
    return slowDelay;
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
