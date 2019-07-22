package io.kubernetes.client.extended.workqueue.ratelimiter;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import org.junit.Test;

public class BucketRateLimiterTest {

  @Test
  public void testBucketRateLimiterBasic() {
    RateLimiter<String> rateLimiter = new BucketRateLimiter<>(2, 1, Duration.ofMinutes(10));
    assertEquals(Duration.ZERO, rateLimiter.when("one"));
    assertEquals(Duration.ZERO, rateLimiter.when("one"));

    assertEquals(Duration.ofMinutes(10), rateLimiter.when("one"));
    assertEquals(Duration.ofMinutes(20), rateLimiter.when("one"));
    assertEquals(Duration.ofMinutes(30), rateLimiter.when("one"));
  }

  @Test
  public void testBucketRateLimiterTokenAdded() throws InterruptedException {
    RateLimiter<String> rateLimiter = new BucketRateLimiter<>(2, 1, Duration.ofSeconds(2));

    assertEquals(Duration.ZERO, rateLimiter.when("one"));
    assertEquals(Duration.ZERO, rateLimiter.when("one"));

    assertEquals(Duration.ofSeconds(2), rateLimiter.when("one"));

    Thread.sleep(4000);

    assertEquals(Duration.ZERO, rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(2), rateLimiter.when("one"));
  }
}
