package io.kubernetes.client.workqueue;

import com.google.common.collect.Sets;

import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * The default workqueue implementation.
 */
public class DefaultWorkQueue implements WorkQueue {

    // queue defines the order in which we will work on items. Every element of queue
    // should be in the dirty set and not in the processing set.
    private LinkedList<Object> queue;

    // dirty defines all of the items that need to be processed.
    private Set<Object> dirty;

    // Things that are currently being processed are in the processing set.
    // These things may be simultaneously in the dirty set. When we finish
    // processing something and remove it from this set, we'll check if
    // it's in the dirty set, and if so, add it to the queue.
    private Set<Object>         processing;

    private AtomicBoolean shuttingDown = new AtomicBoolean(false);

    private final ReentrantLock lock = new ReentrantLock();

    private final Condition notEmpty = lock.newCondition();

    public DefaultWorkQueue() {
        this.queue = new LinkedList<>();
        this.dirty = Sets.newHashSet();
        this.processing = Sets.newHashSet();
    }

    @Override
    public void add(Object item) {
        lock.lock();
        try {

            if (shuttingDown.get()) {
                return;
            }

            if (this.dirty.contains(item)) {
                return;
            }

            this.dirty.add(item);
            if (this.processing.contains(item)) {
                return;
            }

            this.queue.add(item);
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int length() {
        lock.lock();
        try {
            return this.queue.size();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Object get() {
        lock.lock();
        try {
            while (queue.size() == 0 && !shuttingDown.get()) {
                notEmpty.await();
            }
            if (queue.size() == 0) {
                // We must be shutting down
                return null;
            }
            Object obj = this.queue.poll();
            this.processing.add(obj);
            this.dirty.remove(obj);
            return obj;
        } catch (Throwable t) {
            // just use empty body
            // potential NPE danger?
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void done(Object item) {
        lock.lock();
        try {
            this.processing.remove(item);
            if (this.dirty.contains(item)) {
                this.queue.add(item);
                notEmpty.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void shutDown() {
        this.shuttingDown.compareAndSet(false, true);
    }

    @Override
    public boolean shuttingDown() {
        return shuttingDown.get();
    }
}
