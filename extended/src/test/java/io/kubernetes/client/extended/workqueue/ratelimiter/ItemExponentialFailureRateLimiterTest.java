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

class ItemExponentialFailureRateLimiterTest {

  @Test
  void itemExponentialFailureRateLimiter() {
    RateLimiter<String> rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(1), Duration.ofSeconds(1));

    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(1));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(2));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(4));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(8));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(16));

    assertThat(rateLimiter.numRequeues("one")).isEqualTo(5);

    assertThat(rateLimiter.when("two")).isEqualTo(Duration.ofMillis(1));
    assertThat(rateLimiter.when("two")).isEqualTo(Duration.ofMillis(2));
    assertThat(rateLimiter.numRequeues("two")).isEqualTo(2);

    rateLimiter.forget("one");
    assertThat(rateLimiter.numRequeues("one")).isZero();
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(1));
  }

  @Test
  void itemExponentialFailureRateLimiterOverFlow() {
    RateLimiter<String> rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(1), Duration.ofSeconds(1000));

    for (int i = 0; i < 5; i++) {
      rateLimiter.when("one");
    }
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(32));

    for (int i = 0; i < 1000; i++) {
      rateLimiter.when("overflow1");
    }
    assertThat(rateLimiter.when("overflow1")).isEqualTo(Duration.ofSeconds(1000));

    rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMinutes(1), Duration.ofHours(1000));
    for (int i = 0; i < 2; i++) {
      rateLimiter.when("two");
    }
    assertThat(rateLimiter.when("two")).isEqualTo(Duration.ofMinutes(4));

    for (int i = 0; i < 1000; i++) {
      rateLimiter.when("overflow2");
    }
    assertThat(rateLimiter.when("overflow2")).isEqualTo(Duration.ofHours(1000));
  }

  @Test
  void negativeBaseDelay() {
    RateLimiter<String> rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(-1), Duration.ofSeconds(1000));

    for (int i = 0; i < 5; i++) {
      rateLimiter.when("one");
    }
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofMillis(-32));
    for (int i = 0; i < 1000; i++) {
      rateLimiter.when("overflow1");
    }
    assertThat(rateLimiter.when("overflow1")).isNegative();
  }

  @Test
  void negativeMaxDelay() {
    RateLimiter<String> rateLimiter =
        new ItemExponentialFailureRateLimiter<>(Duration.ofMillis(1), Duration.ofSeconds(-1000));

    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(-1000));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(-1000));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(-1000));
    assertThat(rateLimiter.when("one")).isEqualTo(Duration.ofSeconds(-1000));
  }
}
