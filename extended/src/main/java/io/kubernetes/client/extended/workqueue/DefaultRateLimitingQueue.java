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
package io.kubernetes.client.extended.workqueue;

import io.kubernetes.client.extended.workqueue.ratelimiter.DefaultControllerRateLimiter;
import io.kubernetes.client.extended.workqueue.ratelimiter.RateLimiter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** The default rate limiting queue implementation. */
public class DefaultRateLimitingQueue<T> extends DefaultDelayingQueue<T>
    implements RateLimitingQueue<T> {

  private RateLimiter<T> rateLimiter;

  public DefaultRateLimitingQueue() {
    this(Executors.newSingleThreadExecutor());
  }

  public DefaultRateLimitingQueue(ExecutorService waitingWorker) {
    this(waitingWorker, new DefaultControllerRateLimiter<>());
  }

  public DefaultRateLimitingQueue(ExecutorService waitingWorker, RateLimiter<T> rateLimiter) {
    super(waitingWorker);
    this.rateLimiter = rateLimiter;
  }

  @Override
  public int numRequeues(T item) {
    return rateLimiter.numRequeues(item);
  }

  @Override
  public void forget(T item) {
    rateLimiter.forget(item);
  }

  @Override
  public void addRateLimited(T item) {
    super.addAfter(item, rateLimiter.when(item));
  }
}
