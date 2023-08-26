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
package io.kubernetes.client.informer.cache;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.ResyncRunnable;
import io.kubernetes.client.util.Threads;
import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.MutablePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller is a java port of k/client-go's informer#Controller. It plumbs reflector and the queue
 * implementation and it runs re-sync function periodically.
 */
public class Controller<
    ApiType extends KubernetesObject, ApiListType extends KubernetesListObject> {

  private static final Logger log = LoggerFactory.getLogger(Controller.class);

  private static final long DEFAULT_PERIOD = 1000L;

  /** resync fifo internal in millis */
  private long fullResyncPeriod;

  /** Queue stores deltas produced by reflector */
  private DeltaFIFO queue;

  private ListerWatcher<ApiType, ApiListType> listerWatcher;

  private ReflectorRunnable<ApiType, ApiListType> reflector;

  private Supplier<Boolean> resyncFunc;

  /** how we actually process items from the queue */
  private Consumer<Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>>> processFunc;

  private ScheduledExecutorService reflectExecutor;

  private ScheduledExecutorService resyncExecutor;

  private ScheduledFuture resyncFuture;

  private Class<ApiType> apiTypeClass;

  private ScheduledFuture reflectorFuture;

  /* visible for testing */ BiConsumer<Class<ApiType>, Throwable> exceptionHandler;

  public Controller(
      Class<ApiType> apiTypeClass,
      DeltaFIFO queue,
      ListerWatcher<ApiType, ApiListType> listerWatcher,
      Consumer<Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>>> processFunc,
      Supplier<Boolean> resyncFunc,
      long fullResyncPeriod) {
    this(apiTypeClass, queue, listerWatcher, processFunc, resyncFunc, fullResyncPeriod, null);
  }

  public Controller(
      Class<ApiType> apiTypeClass,
      DeltaFIFO queue,
      ListerWatcher<ApiType, ApiListType> listerWatcher,
      Consumer<Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>>> processFunc,
      Supplier<Boolean> resyncFunc,
      long fullResyncPeriod,
      BiConsumer<Class<ApiType>, Throwable> exceptionHandler) {

    this.queue = queue;
    this.listerWatcher = listerWatcher;
    this.apiTypeClass = apiTypeClass;
    this.processFunc = processFunc;
    this.resyncFunc = resyncFunc;
    this.fullResyncPeriod = fullResyncPeriod;
    this.exceptionHandler = exceptionHandler;

    // starts one daemon thread for reflector
    this.reflectExecutor =
        Executors.newSingleThreadScheduledExecutor(
            Threads.threadFactory("controller-reflector-" + apiTypeClass.getName() + "-%d"));

    // starts one daemon thread for resync
    this.resyncExecutor =
        Executors.newSingleThreadScheduledExecutor(
            Threads.threadFactory("controller-resync-" + apiTypeClass.getName() + "-%d"));
  }

  public Controller(
      Class<ApiType> apiTypeClass,
      DeltaFIFO queue,
      ListerWatcher<ApiType, ApiListType> listerWatcher,
      Consumer<Deque<MutablePair<DeltaFIFO.DeltaType, KubernetesObject>>> popProcessFunc) {
    this(apiTypeClass, queue, listerWatcher, popProcessFunc, null, 0);
  }

  public void run() {
    log.info("informer#Controller: ready to run resync & reflector runnable");

    // start the resync runnable
    if (fullResyncPeriod > 0) {
      ResyncRunnable resyncRunnable = new ResyncRunnable(queue, resyncFunc);
      resyncFuture =
          resyncExecutor.scheduleAtFixedRate(
              resyncRunnable::run, fullResyncPeriod, fullResyncPeriod, TimeUnit.MILLISECONDS);
    } else {
      log.info("informer#Controller: resync skipped due to 0 full resync period");
    }

    synchronized (this) {
      // TODO(yue9944882): proper naming for reflector
      reflector = newReflector();
      try {
        reflectorFuture =
            reflectExecutor.scheduleWithFixedDelay(
                reflector::run, 0L, DEFAULT_PERIOD, TimeUnit.MILLISECONDS);
      } catch (RejectedExecutionException e) {
        // submitting reflector list-watching job can fail due to concurrent invocation of
        // `shutdown`. handling exception with a warning then return.
        log.warn("reflector list-watching job exiting because the thread-pool is shutting down");
        return;
      }
    }

    // start the process loop
    this.processLoop();
  }

  /* visible for testing */ ReflectorRunnable<ApiType, ApiListType> newReflector() {
    return new ReflectorRunnable<>(apiTypeClass, listerWatcher, queue, exceptionHandler);
  }

  /** stops the resync thread pool firstly, then stop the reflector */
  public void stop() {
    synchronized (this) {
      if (reflectorFuture != null) {
        reflector.stop();
        reflectorFuture.cancel(true);
      }
    }
    reflectExecutor.shutdownNow();
    resyncExecutor.shutdownNow();
  }

  /** returns true if the queue has been resycned */
  public boolean hasSynced() {
    return this.queue.hasSynced();
  }

  /** returns the latest resource version watched by controller */
  public String lastSyncResourceVersion() {
    if (reflector == null) {
      return "";
    }
    return reflector.getLastSyncResourceVersion();
  }

  /** processLoop drains the work queue. */
  private void processLoop() {
    while (true) {
      try {
        this.queue.pop(this.processFunc);
      } catch (InterruptedException t) {
        log.error("DefaultController#processLoop get interrupted {}", t.getMessage(), t);
        return;
      } catch (Throwable t) {
        log.error("DefaultController#processLoop recovered from crashing {}", t.getMessage(), t);
      }
    }
  }
}
