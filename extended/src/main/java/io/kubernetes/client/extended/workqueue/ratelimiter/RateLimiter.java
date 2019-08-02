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
