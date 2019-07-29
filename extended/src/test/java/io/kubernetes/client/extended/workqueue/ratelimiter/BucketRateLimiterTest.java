package io.kubernetes.client.extended.workqueue.ratelimiter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class BucketRateLimiterTest {
  @Rule public ExpectedException thrown = ExpectedException.none();

  @Test
  public void testBucketRateLimiterBasic() {
    RateLimiter<String> rateLimiter = new BucketRateLimiter<>(2, 1, Duration.ofMinutes(10));
    assertEquals(Duration.ZERO, rateLimiter.when("one"));
    assertEquals(Duration.ZERO, rateLimiter.when("one"));

    Duration waitDuration = rateLimiter.when("one");
    Duration expectDuration = Duration.ofMinutes(10);

    Duration diff = waitDuration.minus(expectDuration);
    // waitDuration might be smaller than expect duration because of time is elapsed.
    assertTrue(diff.isZero() || (diff.isNegative() && !diff.plusSeconds(1).isNegative()));

    waitDuration = rateLimiter.when("one");
    expectDuration = Duration.ofMinutes(20);
    diff = waitDuration.minus(expectDuration);

    assertTrue(diff.isZero() || (diff.isNegative() && !diff.plusSeconds(1).isNegative()));
  }

  @Test
  public void testBucketRateLimiterTokenAdded() throws InterruptedException {
    RateLimiter<String> rateLimiter = new BucketRateLimiter<>(2, 1, Duration.ofSeconds(2));

    assertEquals(Duration.ZERO, rateLimiter.when("one"));
    assertEquals(Duration.ZERO, rateLimiter.when("one"));

    Duration waitDuration = rateLimiter.when("one");
    assertTrue(waitDuration.getSeconds() > 0);

    Thread.sleep(4000);

    assertEquals(Duration.ZERO, rateLimiter.when("two"));

    waitDuration = rateLimiter.when("two");
    assertTrue(waitDuration.getSeconds() > 0);
  }

  @Test
  public void testNegativeCapacity() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("-2 is wrong value for capacity, because capacity should be positive");
    RateLimiter<String> rateLimiter = new BucketRateLimiter<>(-2, 1, Duration.ofSeconds(2));
  }

  @Test
  public void testNegativeTokensGeneratedInPeriod() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("-1 is wrong value for period tokens, because tokens should be positive");
    RateLimiter<String> rateLimiter = new BucketRateLimiter<>(2, -1, Duration.ofSeconds(2));
  }

  @Test
  public void testNegativePeriod() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage(
        "-1 is wrong value for period of bandwidth, because period should be positive");
    RateLimiter<String> rateLimiter = new BucketRateLimiter<>(2, 1, Duration.ofNanos(-1));
  }

  @Test
  public void testTokensLargerThanNanos() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage(
        "100 token/nanosecond is not permitted refill rate, because highest supported rate is 1 token/nanosecond");
    RateLimiter<String> rateLimiter = new BucketRateLimiter<>(2, 100, Duration.ofNanos(1));
  }
}
