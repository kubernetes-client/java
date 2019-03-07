package io.kubernetes.client.informer.cache;

import io.kubernetes.client.util.common.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.joda.time.DateTime;

/*
 * SharedProcessor class manages all the registered ProcessorListener and distributes notifications.
 */
public class SharedProcessor<ApiType> {

  private ReadWriteLock lock = new ReentrantReadWriteLock();

  private List<ProcessorListener<ApiType>> listeners;
  private List<ProcessorListener<ApiType>> syncingListeners;

  private ExecutorService executorService;

  public SharedProcessor() {
    this(Executors.newCachedThreadPool());
  }

  public SharedProcessor(ExecutorService threadPool) {
    this.listeners = new ArrayList<>();
    this.syncingListeners = new ArrayList<>();

    this.executorService = threadPool;
  }

  /**
   * addAndStartListener first adds the specific processorListener then starts the listener with
   * executor.
   *
   * @param processorListener specific processor listener
   */
  public void addAndStartListener(final ProcessorListener<ApiType> processorListener) {
    lock.writeLock().lock();
    try {
      addListenerLocked(processorListener);

      executorService.execute(processorListener);
    } finally {
      lock.writeLock().unlock();
    }
  }

  /**
   * addListener adds the specific processorListener, but not start it.
   *
   * @param processorListener specific processor listener
   */
  public void addListener(final ProcessorListener<ApiType> processorListener) {
    lock.writeLock().lock();
    try {
      addListenerLocked(processorListener);
    } finally {
      lock.writeLock().unlock();
    }
  }

  private void addListenerLocked(final ProcessorListener<ApiType> processorListener) {
    this.listeners.add(processorListener);
    this.syncingListeners.add(processorListener);
  }

  /** starts the processor listeners. */
  public void run() {
    lock.readLock().lock();
    try {
      if (Collections.isEmptyCollection(listeners)) {
        return;
      }
      for (ProcessorListener listener : listeners) {
        executorService.execute(listener);
      }
    } finally {
      lock.readLock().unlock();
    }
  }

  /**
   * distribute the object among listeners.
   *
   * @param obj specific obj
   * @param isSync is sync or not
   */
  public void distribute(ProcessorListener.Notification<ApiType> obj, boolean isSync) {
    lock.readLock().lock();
    try {
      if (isSync) {
        for (ProcessorListener<ApiType> listener : syncingListeners) {
          listener.add(obj);
        }
      } else {
        for (ProcessorListener<ApiType> listener : listeners) {
          listener.add(obj);
        }
      }
    } finally {
      lock.readLock().unlock();
    }
  }

  public boolean shouldResync() {
    lock.writeLock().lock();
    boolean resyncNeeded = false;
    try {
      this.syncingListeners = new ArrayList<>();

      DateTime now = DateTime.now();
      for (ProcessorListener listener : this.listeners) {
        if (listener.shouldResync(now)) {
          resyncNeeded = true;
          this.syncingListeners.add(listener);
          listener.determineNextResync(now);
        }
      }
    } finally {
      lock.writeLock().unlock();
    }
    return resyncNeeded;
  }

  public void stop() {
    lock.writeLock().lock();
    try {
      listeners = null;
    } finally {
      lock.writeLock().unlock();
    }
    // TODO(yue9944882): gracefully shutdown listener pool
    executorService.shutdownNow();
  }
}
