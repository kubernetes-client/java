package io.kubernetes.client.extended.workqueue;

import java.time.Duration;

/**
 * DelayingQueue defines a queue that can Add an item at a later time. This makes it easier to
 * requeue items after failures without ending up in a hot-loop.
 */
public interface DelayingQueue<T> extends WorkQueue<T> {

  /**
   * addAfter adds an item to the workqueue after the indicated duration has passed.
   *
   * @param item item to add
   * @param duration specific duration
   */
  void addAfter(T item, Duration duration);
}
