package io.kubernetes.client.workqueue;

import java.time.Duration;

public interface RateLimiter {

    /**
     * when gets an item and gets to decide how long that item should wait.
     *
     * @param item specific item
     * @return how long the item should wait
     */
    Duration when(Object item);

    /**
     * forget indicates that an item is finished being retried.  Doesn't matter
     * whether its for perm failing or for success, we'll stop tracking it
     *
     * @param item item that is finished being retried
     */
    void forget(Object item);

    /**
     * numRequeues returns back how many failures the item has had.
     *
     * @param item specific item
     * @return how many failures the item has had
     */
    int numRequeues(Object item);
}
