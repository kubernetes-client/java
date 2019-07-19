package io.kubernetes.client.extended.workqueue;

/** The workqueue interface defines the queue behavior. */
public interface WorkQueue<T> {

  /**
   * add marks item as needing processing.
   *
   * @param item item to add
   */
  void add(T item);

  /**
   * length returns the current queue length, for informational purposes only.
   *
   * @return current queue length
   */
  int length();

  /**
   * Get blocks until it can return an item to be processed. If shutdown = true, the caller should
   * end their process.
   *
   * @return the object
   */
  T get() throws InterruptedException;

  /**
   * Done marks item as done processing, and if it has been marked as dirty again,
   *
   * @param item specific item
   */
  void done(T item);

  /** ShutDown will cause q to ignore all new items added to it. */
  void shutDown();

  /**
   * returns whether the queue shutdown.
   *
   * @return returns {@code true} if the
   */
  boolean isShuttingDown();
}
