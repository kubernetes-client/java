/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.extended.workqueue.ratelimiter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.Duration;
import org.junit.Test;

public class ItemExponentialFailureRateLimiterTest {

  @Test
  public void testItemExponentialFailureRateLimiter() {
    RateLimiter<String> rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(1), Duration.ofSeconds(1));

    assertEquals(Duration.ofMillis(1), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(2), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(4), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(8), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(16), rateLimiter.when("one"));

    assertEquals(5, rateLimiter.numRequeues("one"));

    assertEquals(Duration.ofMillis(1), rateLimiter.when("two"));
    assertEquals(Duration.ofMillis(2), rateLimiter.when("two"));
    assertEquals(2, rateLimiter.numRequeues("two"));

    rateLimiter.forget("one");
    assertEquals(0, rateLimiter.numRequeues("one"));
    assertEquals(Duration.ofMillis(1), rateLimiter.when("one"));
  }

  @Test
  public void testItemExponentialFailureRateLimiterOverFlow() {
    RateLimiter<String> rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(1), Duration.ofSeconds(1000));

    for (int i = 0; i < 5; i++) {
      rateLimiter.when("one");
    }
    assertEquals(Duration.ofMillis(32), rateLimiter.when("one"));

    for (int i = 0; i < 1000; i++) {
      rateLimiter.when("overflow1");
    }
    assertEquals(Duration.ofSeconds(1000), rateLimiter.when("overflow1"));

    rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMinutes(1), Duration.ofHours(1000));
    for (int i = 0; i < 2; i++) {
      rateLimiter.when("two");
    }
    assertEquals(Duration.ofMinutes(4), rateLimiter.when("two"));

    for (int i = 0; i < 1000; i++) {
      rateLimiter.when("overflow2");
    }
    assertEquals(Duration.ofHours(1000), rateLimiter.when("overflow2"));
  }

  @Test
  public void testNegativeBaseDelay() {
    RateLimiter<String> rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(-1), Duration.ofSeconds(1000));

    for (int i = 0; i < 5; i++) {
      rateLimiter.when("one");
    }
    assertEquals(Duration.ofMillis(-32), rateLimiter.when("one"));
    for (int i = 0; i < 1000; i++) {
      rateLimiter.when("overflow1");
    }
    assertTrue(rateLimiter.when("overflow1").isNegative());
  }

  @Test
  public void testNegativeMaxDelay() {
    RateLimiter<String> rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(1), Duration.ofSeconds(-1000));

    assertEquals(Duration.ofSeconds(-1000), rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(-1000), rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(-1000), rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(-1000), rateLimiter.when("one"));
  }
}
