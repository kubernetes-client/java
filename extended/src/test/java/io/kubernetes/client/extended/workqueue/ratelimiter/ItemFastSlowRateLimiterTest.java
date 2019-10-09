package io.kubernetes.client.extended.workqueue.ratelimiter;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.junit.Test;

public class ItemFastSlowRateLimiterTest {

  @Test
  public void testFastSlowRateLimiter() {
    RateLimiter<String> rateLimiter =
        new ItemFastSlowRateLimiter<>(Duration.ofMillis(5), Duration.ofSeconds(10), 3);

    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));

    assertEquals(Duration.ofSeconds(10), rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(10), rateLimiter.when("one"));

    assertEquals(5, rateLimiter.numRequeues("one"));

    assertEquals(Duration.ofMillis(5), rateLimiter.when("two"));
    assertEquals(Duration.ofMillis(5), rateLimiter.when("two"));
    assertEquals(2, rateLimiter.numRequeues("two"));

    rateLimiter.forget("one");
    assertEquals(0, rateLimiter.numRequeues("one"));
    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));
  }

  @Test
  public void testNegativeOrZeroAttempts() {
    RateLimiter<String> rateLimiter =
        new ItemFastSlowRateLimiter<>(Duration.ofMillis(5), Duration.ofSeconds(10), -1);

    assertEquals(Duration.ofSeconds(10), rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(10), rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(10), rateLimiter.when("one"));

    rateLimiter = new ItemFastSlowRateLimiter<>(Duration.ofMillis(5), Duration.ofSeconds(10), 0);
    assertEquals(Duration.ofSeconds(10), rateLimiter.when("two"));
    assertEquals(Duration.ofSeconds(10), rateLimiter.when("two"));
    assertEquals(Duration.ofSeconds(10), rateLimiter.when("two"));
  }
}
