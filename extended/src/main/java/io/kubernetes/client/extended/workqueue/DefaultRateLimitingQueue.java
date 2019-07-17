package io.kubernetes.client.extended.workqueue;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/** The default rate limiting queue implementation. */
public class DefaultRateLimitingQueue<T> extends DefaultDelayingQueue<T>
    implements RateLimitingQueue<T> {

  private RateLimiter rateLimiter;

  public DefaultRateLimitingQueue(ExecutorService waitingWorker) {
    super(waitingWorker);
    this.rateLimiter = new ExponentialRateLimiter();
  }

  public DefaultRateLimitingQueue(ExecutorService waitingWorker, RateLimiter rateLimiter) {
    super(waitingWorker);
    this.rateLimiter = rateLimiter;
  }

  @Override
  public int numRequeues(T item) {
    return rateLimiter.numRequeues(item);
  }

  @Override
  public void forget(Object item) {
    rateLimiter.forget(item);
  }

  @Override
  public void addRateLimited(T item) {
    super.addAfter(item, rateLimiter.when(item));
  }

  public static class ExponentialRateLimiter implements RateLimiter {

    Duration baseDelay;
    Duration maxDelay;

    private Map<Object, Integer> failures = new ConcurrentHashMap<>();

    public ExponentialRateLimiter() {
      this.baseDelay = Duration.ofMillis(5);
      this.maxDelay = Duration.ofSeconds(1000);
    }

    public ExponentialRateLimiter(Duration baseDelay, Duration maxDelay) {
      this.baseDelay = baseDelay;
      this.maxDelay = maxDelay;
    }

    @Override
    public void forget(Object item) {
      failures.remove(item);
    }

    @Override
    public int numRequeues(Object item) {
      return failures.get(item);
    }

    @Override
    public Duration when(Object item) {
      Integer exp = failures.getOrDefault(item, 0);
      failures.put(item, exp + 1);
      double backoff = baseDelay.toNanos() * Math.pow(2, exp);
      if (backoff > Long.MAX_VALUE) {
        return maxDelay;
      }
      if (backoff > maxDelay.toNanos()) {
        return maxDelay;
      }
      return Duration.ofNanos(Double.valueOf(backoff).longValue());
    }
  }
}
