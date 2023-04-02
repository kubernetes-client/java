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
