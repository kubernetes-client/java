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

/** RateLimitingQueue defines a queue that rate limits items being added to the queue. */
public interface RateLimitingQueue<T> extends DelayingQueue<T> {

  /**
   * addRateLimited adds an item to the workqueue after the rate limiter says its ok.
   *
   * @param item item to add
   */
  void addRateLimited(T item);

  /**
   * forget indicates that an item is finished being retried. Doesn't matter whether its for perm
   * failing or for success, we'll stop the rate limiter from tracking it. This only clears the
   * `rateLimiter`, you still have to call `Done` on the queue.
   *
   * @param item item which is finished being retried
   */
  void forget(T item);

  /**
   * numRequeues returns back how many times the item was requeued.
   *
   * @param item specific item
   * @return times the item was requeued
   */
  int numRequeues(T item);
}
