package io.kubernetes.client.extended.workqueue.ratelimiter;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 * MaxOfRateLimiter calls every RateLimiter and returns the worst case response When used with a
 * token bucket limiter, the burst could be apparently exceeded in cases where particular items were
 * separately delayed a longer time.
 */
public class MaxOfRateLimiter<T> implements RateLimiter<T> {
  private List<RateLimiter<T>> rateLimiters;

  public MaxOfRateLimiter(List<RateLimiter<T>> rateLimiters) {
    this.rateLimiters = rateLimiters;
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public MaxOfRateLimiter(RateLimiter<T>... rateLimiters) {
    this(Arrays.asList(rateLimiters));
  }

  @Override
  public Duration when(T item) {
    Duration max = Duration.ZERO;
    for (RateLimiter<T> r : rateLimiters) {
      Duration current = r.when(item);
      if (current.compareTo(max) > 0) {
        max = current;
      }
    }

    return max;
  }

  @Override
  public void forget(T item) {
    rateLimiters.forEach(r -> r.forget(item));
  }

  @Override
  public int numRequeues(T item) {
    int max = 0;
    for (RateLimiter<T> r : rateLimiters) {
      int current = r.numRequeues(item);
      if (current > max) {
        max = current;
      }
    }

    return max;
  }
}
