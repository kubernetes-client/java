package io.kubernetes.client.workqueue;

/**
 * RateLimitingQueue defines a queue that rate limits items being added to the queue.
 */
public interface RateLimitingQueue extends DelayingQueue {

    /**
     * addRateLimited adds an item to the workqueue after the rate limiter says its ok.
     *
     * @param item item to add
     */
    void addRateLimited(Object item);

    /**
     * forget indicates that an item is finished being retried.  Doesn't matter whether
     * its for perm failing or for success, we'll stop the rate limiter from tracking it.
     * This only clears the `rateLimiter`, you still have to call `Done` on the queue.
     *
     * @param item item which is finished being retried
     */
    void forget(Object item);

    /**
     * numRequeues returns back how many times the item was requeued.
     *
     * @param item specific item
     * @return times the item was requeued
     */
    int numRequeues(Object item);
}
