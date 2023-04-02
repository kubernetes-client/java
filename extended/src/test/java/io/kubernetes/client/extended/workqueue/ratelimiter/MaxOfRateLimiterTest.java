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

  @Test
  public void testDefaultRateLimiter() {
    RateLimiter<String> rateLimiter = new DefaultControllerRateLimiter<>();

    assertEquals(Duration.ofMillis(5), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(10), rateLimiter.when("one"));
    assertEquals(Duration.ofMillis(20), rateLimiter.when("one"));

    for (int i = 0; i < 20; i++) {
      rateLimiter.when("one");
    }

    assertEquals(Duration.ofSeconds(1000), rateLimiter.when("one"));
    assertEquals(Duration.ofSeconds(1000), rateLimiter.when("one"));

    for (int i = 0; i < 75; i++) {
      rateLimiter.when("one");
    }

    assertTrue(rateLimiter.when("one").getSeconds() > 0);
    assertTrue(rateLimiter.when("two").getSeconds() > 0);
  }
}
