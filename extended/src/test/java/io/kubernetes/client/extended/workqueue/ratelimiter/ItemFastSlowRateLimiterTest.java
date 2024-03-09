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

import static org.assertj.core.api.Assertions.assertThat;

import java.time.Duration;
import org.junit.jupiter.api.Test;

class ItemFastSlowRateLimiterTest {

  @Test
  void fastSlowRateLimiter() {
    RateLimiter<String> rateLimiter =
        new ItemFastSlowRateLimiter<>(Duration.ofMillis(5), Duration.ofSeconds(10), 3);

    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(5));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(5));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(5));

    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(10));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(10));

    assertThat(rateLimiter.numRequeues("one")).isEqualTo(5);

    assertThat(rateLimiter.when("two")).isEqualTo(Duration.ofMillis(5));
    assertThat(rateLimiter.when("two")).isEqualTo(Duration.ofMillis(5));
    assertThat(rateLimiter.numRequeues("two")).isEqualTo(2);

    rateLimiter.forget("one");
    assertThat(rateLimiter.numRequeues("one")).isZero();
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(5));
  }

  @Test
  void negativeOrZeroAttempts() {
    RateLimiter<String> rateLimiter =
        new ItemFastSlowRateLimiter<>(Duration.ofMillis(5), Duration.ofSeconds(10), -1);

    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(10));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(10));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(10));

    rateLimiter = new ItemFastSlowRateLimiter<>(Duration.ofMillis(5), Duration.ofSeconds(10), 0);
    assertThat(rateLimiter.when("two")).isEqualTo(Duration.ofSeconds(10));
    assertThat(rateLimiter.when("two")).isEqualTo(Duration.ofSeconds(10));
    assertThat(rateLimiter.when("two")).isEqualTo(Duration.ofSeconds(10));
  }
}
