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

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * The default {@link WorkQueue} implementation that uses a doubly-linked list to store work items.
 * This class ensures the added work items are, not in dirty set or currently processing set, before
 * append them to the list.
 *
 * <p>Usage example, based on a typical producer-consumer scenario. </pre>
 */
public class DefaultWorkQueue<T> implements WorkQueue<T> {

  // queue defines the order in which we will work on items. Every element of queue
  // should be in the dirty set and not in the processing set.
  private LinkedList<T> queue;

  // dirty defines all of the items that need to be processed.
  private Set<T> dirty;

  // Things that are currently being processed are in the processing set.
  // These things may be simultaneously in the dirty set. When we finish
  // processing something and remove it from this set, we'll check if
  // it's in the dirty set, and if so, add it to the queue.
  private Set<T> processing;

  private boolean shuttingDown = false;

  public DefaultWorkQueue() {
    this.queue = new LinkedList<>();
    this.dirty = new HashSet<>();
    this.processing = new HashSet<>();
  }

  @Override
  public synchronized void add(T item) {
    if (shuttingDown) {
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
    this.notify();
  }

  @Override
  public synchronized int length() {
    return this.queue.size();
  }

  @Override
  public synchronized T get() throws InterruptedException {
    while (queue.size() == 0 && !shuttingDown) {
      this.wait();
    }
    if (queue.size() == 0) {
      // We must be shutting down
      return null;
    }
    T obj = this.queue.poll();
    this.processing.add(obj);
    this.dirty.remove(obj);
    return obj;
  }

  @Override
  public synchronized void done(T item) {
    this.processing.remove(item);
    if (this.dirty.contains(item)) {
      this.queue.add(item);
      this.notify();
    }
  }

  @Override
  public synchronized void shutDown() {
    this.shuttingDown = true;
    this.notifyAll();
  }

  @Override
  public synchronized boolean isShuttingDown() {
    return shuttingDown;
  }
}
