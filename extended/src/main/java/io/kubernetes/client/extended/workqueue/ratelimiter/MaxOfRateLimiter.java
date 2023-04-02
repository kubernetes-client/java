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

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 * MaxOfRateLimiter calls every RateLimiter and returns the worst case response When used with a
 * token bucket limiter, the burst could be apparently exceeded in cases where particular items were
 * separately delayed a longer time.
 */
public class MaxOfRateLimiter<T> implements RateLimiter<T> {
  private List<RateLimiter<T>> rateLimiters;

  public MaxOfRateLimiter(List<RateLimiter<T>> rateLimiters) {
    this.rateLimiters = rateLimiters;
  }

  @SafeVarargs
  @SuppressWarnings("varargs")
  public MaxOfRateLimiter(RateLimiter<T>... rateLimiters) {
    this(Arrays.asList(rateLimiters));
  }

  @Override
  public Duration when(T item) {
    Duration max = Duration.ZERO;
    for (RateLimiter<T> r : rateLimiters) {
      Duration current = r.when(item);
      if (current.compareTo(max) > 0) {
        max = current;
      }
    }

    return max;
  }

  @Override
  public void forget(T item) {
    rateLimiters.forEach(r -> r.forget(item));
  }

  @Override
  public int numRequeues(T item) {
    int max = 0;
    for (RateLimiter<T> r : rateLimiters) {
      int current = r.numRequeues(item);
      if (current > max) {
        max = current;
      }
    }

    return max;
  }
}
