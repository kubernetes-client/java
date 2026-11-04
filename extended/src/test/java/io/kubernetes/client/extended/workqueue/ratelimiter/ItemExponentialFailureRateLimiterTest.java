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
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ItemExponentialFailureRateLimiterTest {

  static Stream<Arguments> positiveDelays() {
    return Stream.of(
        Arguments.of(Duration.ofMillis(5), Duration.ofSeconds(1000)),
        Arguments.of(Duration.ofMillis(1), Duration.ofMillis(Long.MAX_VALUE)),
        Arguments.of(Duration.ofSeconds(Long.MAX_VALUE / 4), Duration.ofSeconds(Long.MAX_VALUE)),
        Arguments.of(Duration.ofNanos(1), Duration.ofSeconds(Long.MAX_VALUE, 999_999_999)),
        Arguments.of(Duration.ofNanos(3), Duration.ofNanos(10)),
        Arguments.of(Duration.ofSeconds(2), Duration.ofSeconds(1)),
        Arguments.of(Duration.ofMillis(1), Duration.ZERO),
        Arguments.of(Duration.ZERO, Duration.ofSeconds(1)));
  }

  @ParameterizedTest
  @MethodSource("positiveDelays")
  void repeatedFailuresStayCapped(Duration baseDelay, Duration maxDelay) {
    RateLimiter<String> rateLimiter = new ItemExponentialFailureRateLimiter<>(baseDelay, maxDelay);
    Duration expected = baseDelay.compareTo(maxDelay) < 0 ? baseDelay : maxDelay;

    for (int call = 1; call <= 1024; call++) {
      assertThat(rateLimiter.when("item")).as("call %s", call).isEqualTo(expected);
      assertThat(rateLimiter.numRequeues("item")).isEqualTo(call);
      expected =
          expected.compareTo(maxDelay.minus(expected)) >= 0 ? maxDelay : expected.plus(expected);
    }

    rateLimiter.forget("item");
    assertThat(rateLimiter.numRequeues("item")).isZero();
    assertThat(rateLimiter.when("item"))
        .isEqualTo(baseDelay.compareTo(maxDelay) < 0 ? baseDelay : maxDelay);
    assertThat(rateLimiter.numRequeues("item")).isEqualTo(1);
  }

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

  @Test
  void highFailureCountStaysPositive() {
    // maxDelay is large enough that the baseDelay*2^exp branch is still selected at exp == 31.
    // The multiplier must be computed in long arithmetic; an int shift (1 << 31) overflows to
    // Integer.MIN_VALUE and yields a negative backoff, which is never a valid delay.
    Duration baseDelay = Duration.ofMillis(1);
    Duration maxDelay = Duration.ofMillis(1L << 40);
    RateLimiter<String> rateLimiter = new ItemExponentialFailureRateLimiter<>(baseDelay, maxDelay);

    // Advance to exp == 31 (the 32nd call returns the delay computed with exp == 31).
    for (int i = 0; i < 31; i++) {
      rateLimiter.when("item");
    }

    Duration backoff = rateLimiter.when("item");
    assertThat(backoff).isPositive();
    assertThat(backoff).isEqualTo(baseDelay.multipliedBy(1L << 31));
  }
}
