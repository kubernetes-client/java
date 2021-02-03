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
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ItemFastSlowRateLimiter does a quick retry for a certain number of attempts, then a slow retry
 * after that
 */
public class ItemFastSlowRateLimiter<T> implements RateLimiter<T> {

  private Duration fastDelay;
  private Duration slowDelay;
  private int maxFastAttempts;

  private ConcurrentMap<T, AtomicInteger> failures = new ConcurrentHashMap<>();

  public ItemFastSlowRateLimiter(Duration fastDelay, Duration slowDelay, int maxFastAttempts) {
    this.fastDelay = fastDelay;
    this.slowDelay = slowDelay;
    this.maxFastAttempts = maxFastAttempts;
  }

  @Override
  public Duration when(T item) {
    int attempts = failures.computeIfAbsent(item, k -> new AtomicInteger()).incrementAndGet();
    if (attempts <= maxFastAttempts) {
      return fastDelay;
    }
    return slowDelay;
  }

  @Override
  public void forget(T item) {
    failures.remove(item);
  }

  @Override
  public int numRequeues(T item) {
    return (int) failures.computeIfAbsent(item, k -> new AtomicInteger()).get();
  }
}
