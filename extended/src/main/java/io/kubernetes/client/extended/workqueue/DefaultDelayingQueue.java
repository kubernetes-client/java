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

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/** The default delaying queue implementation. */
public class DefaultDelayingQueue<T> extends DefaultWorkQueue<T> implements DelayingQueue<T> {

  public static Duration heartBeatInterval = Duration.ofSeconds(10);

  private DelayQueue<WaitForEntry<T>> delayQueue;
  private ConcurrentMap<T, WaitForEntry<T>> waitingEntryByData;
  protected BlockingQueue<WaitForEntry<T>> waitingForAddQueue;
  private Supplier<Long> timeSource;

  private static Long now() {
    return System.nanoTime() / 1000000;
  }

  public DefaultDelayingQueue(ExecutorService waitingWorker) {
    this.timeSource = DefaultDelayingQueue::now;
    this.delayQueue = new DelayQueue<>();
    this.waitingEntryByData = new ConcurrentHashMap<>();
    this.waitingForAddQueue = new LinkedBlockingQueue<>(1000);
    waitingWorker.submit(this::waitingLoop);
  }

  public DefaultDelayingQueue() {
    this(Executors.newSingleThreadExecutor());
  }

  public void addAfter(T item, Duration duration) {
    // don't add if we're already shutting down
    if (super.isShuttingDown()) {
      return;
    }

    // immediately add things w/o delay
    if (duration.isZero()) {
      super.add(item);
      return;
    }
    WaitForEntry<T> entry =
        new WaitForEntry<>(item, this.timeSource.get() + duration.toMillis(), this.timeSource);
    this.waitingForAddQueue.offer(entry);
  }

  // Visible for testing
  protected void injectTimeSource(Supplier<Long> fn) {
    this.timeSource = fn;
  }

  private void waitingLoop() {
    try {
      while (true) {
        // underlying work-queue is shutting down, quit the loop.
        if (super.isShuttingDown()) {
          return;
        }
        // peek the first item from the delay queue
        WaitForEntry<T> entry = delayQueue.peek();
        // default next ready-at time to "never"
        Duration nextReadyAt = heartBeatInterval;
        if (entry != null) {
          // the delay-queue isn't empty, so we deal with the item in the following logic:
          // 1. check if the item is ready to fire
          //   a. if ready, remove it from the delay-queue and push it into underlying
          // work-queue
          //   b. if not, refresh the next ready-at time.
          long now = this.timeSource.get();
          if (!((now - entry.readyAtMillis) < 0)) {
            delayQueue.remove(entry);
            super.add(entry.data);
            this.waitingEntryByData.remove(entry.data);
            continue;
          } else {
            nextReadyAt = Duration.ofMillis(entry.readyAtMillis - now);
          }
        }

        WaitForEntry<T> waitForEntry =
            waitingForAddQueue.poll(nextReadyAt.toMillis(), TimeUnit.MILLISECONDS);
        if (waitForEntry != null) {
          if (this.timeSource.get() - waitForEntry.readyAtMillis < 0) {
            // the item is not yet ready, insert it to the delay-queue
            insert(this.delayQueue, this.waitingEntryByData, waitForEntry);
          } else {
            // the item is ready as soon as received, fire it to the work-queue directly
            super.add(waitForEntry.data);
          }
        }
      }
    } catch (InterruptedException e) {
      // empty block
    }
  }

  private void insert(
      DelayQueue<WaitForEntry<T>> q, Map<T, WaitForEntry<T>> knownEntries, WaitForEntry entry) {
    WaitForEntry existing = knownEntries.get((T) entry.data);
    if (existing != null) {
      if ((entry.readyAtMillis - existing.readyAtMillis) < 0) {
        q.remove(existing);
        existing.readyAtMillis = entry.readyAtMillis;
        q.add(existing);
      }

      return;
    }

    q.offer(entry);
    knownEntries.put((T) entry.data, entry);
  }

  // WaitForEntry holds the data to add and the time it should be added.
  private static class WaitForEntry<T> implements Delayed {

    private WaitForEntry(T data, long readyAtMillis, Supplier<Long> timeSource) {
      this.data = data;
      this.readyAtMillis = readyAtMillis;
      this.timeSource = timeSource;
    }

    private T data;
    private long readyAtMillis;
    private Supplier<Long> timeSource;

    @Override
    public long getDelay(TimeUnit unit) {
      long duration = readyAtMillis - this.timeSource.get();
      return unit.convert(duration, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
      return Long.compare(getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }
  }
}
