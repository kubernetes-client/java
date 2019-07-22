package io.kubernetes.client.extended.workqueue.ratelimiter;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.junit.Test;

public class MaxOfRateLimiterTest {

  @Test
  public void testMaxOfRateLimiter() {
    RateLimiter<String> rateLimiter =
        new MaxOfRateLimiter<>(
            new ItemFastSlowRateLimiter<>(Duration.ofMillis(5), Duration.ofSeconds(3), 3),
            new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(1), Duration.ofSeconds(1)));

    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));

    assertEquals(Duration.ofSeconds(3), rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(3), rateLimiter.when("one"));

    assertEquals(5, rateLimiter.numRequeues("one"));

    assertEquals(Duration.ofMillis(5), rateLimiter.when("two"));
    assertEquals(Duration.ofMillis(5), rateLimiter.when("two"));
    assertEquals(2, rateLimiter.numRequeues("two"));

    rateLimiter.forget("one");
    assertEquals(0, rateLimiter.numRequeues("one"));
    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));
  }
}
