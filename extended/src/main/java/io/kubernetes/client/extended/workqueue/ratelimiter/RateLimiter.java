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

public interface RateLimiter<T> {
  /**
   * When gets an item and gets to decide how long that item should wait
   *
   * @param item Item that should wait
   */
  Duration when(T item);

  /**
   * Forget indicates that an item is finished being retried. Doesn't matter whether its for perm
   * failing or for success, we'll stop tracking it
   *
   * @param item Item will be forget
   */
  void forget(T item);

  /** @return number of how many failures the item has had */
  int numRequeues(T item);
}
