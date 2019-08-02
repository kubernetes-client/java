package io.kubernetes.client.extended.workqueue;

import static org.junit.Assert.assertTrue;

import io.kubernetes.client.extended.workqueue.ratelimiter.RateLimiter;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.junit.Test;

public class DefaultRateLimitQueueTest {

  private static class MockRateLimiter<T> implements RateLimiter<T> {

    private int count;

    @Override
    public Duration when(Object item) {
      return Duration.ofMillis(500);
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
  public void testSimpleRateLimitQueue() throws Exception {
    MockRateLimiter<String> mockRateLimiter = new MockRateLimiter<>();
    DefaultRateLimitingQueue<String> rlq =
        new DefaultRateLimitingQueue<>(Executors.newSingleThreadExecutor(), mockRateLimiter);
    long t1 = System.nanoTime();
    rlq.addRateLimited("foo");
    rlq.get();
    long t2 = System.nanoTime();
    assertTrue(t2 - t1 > TimeUnit.MILLISECONDS.toNanos(500));
  }
}
