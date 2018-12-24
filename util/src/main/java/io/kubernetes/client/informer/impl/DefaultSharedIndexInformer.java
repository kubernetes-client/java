package io.kubernetes.client.informer.impl;

import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.ResourceEventHandler;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.cache.*;
import io.kubernetes.client.util.common.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.tuple.MutablePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultSharedIndexInformer<ApiType, ApiListType>
    implements SharedIndexInformer<ApiType> {

  private static final Logger log = LoggerFactory.getLogger(DefaultSharedIndexInformer.class);

  private static final long MINIMUM_RESYNC_PERIOD_MILLIS = 1000L;

  // resyncCheckPeriod is how often we want the reflector's resync timer to fire so it can call
  // shouldResync to check if any of our listeners need a resync.
  private long resyncCheckPeriodMillis;
  // defaultEventHandlerResyncPeriod is the default resync period for any handlers added via
  // AddEventHandler (i.e. they don't specify one and just want to use the shared informer's default
  // value).
  private long defaultEventHandlerResyncPeriod;

  private Indexer<ApiType> indexer;

  private SharedProcessor<ApiType> processor;

  private Controller<ApiType, ApiListType> controller;

  private Thread controllerThread;

  private volatile boolean started = false;
  private volatile boolean stopped = false;

  public DefaultSharedIndexInformer(
      Class<ApiType> apiTypeClass, ListerWatcher listerWatcher, long resyncPeriod) {
    this.resyncCheckPeriodMillis = resyncPeriod;
    this.defaultEventHandlerResyncPeriod = resyncPeriod;

    this.processor = new SharedProcessor<>();
    this.indexer = new Cache();

    DeltaFIFO<ApiType> fifo = new DeltaFIFO<ApiType>(Cache::metaNamespaceKeyFunc, this.indexer);

    this.controller =
        new Controller<ApiType, ApiListType>(
            apiTypeClass,
            fifo,
            listerWatcher,
            this::handleDeltas,
            processor::shouldResync,
            resyncCheckPeriodMillis);

    controllerThread = new Thread(controller::run);
  }

  /** add event callback */
  @Override
  public void addEventHandler(ResourceEventHandler<ApiType> handler) {
    addEventHandlerWithResyncPeriod(handler, defaultEventHandlerResyncPeriod);
  }

  /** add event callback with a resync period */
  @Override
  public void addEventHandlerWithResyncPeriod(
      ResourceEventHandler<ApiType> handler, long resyncPeriodMillis) {
    if (stopped) {
      log.info(
          "DefaultSharedIndexInformer#Handler was not added to shared informer because it has stopped already");
      return;
    }

    if (resyncPeriodMillis > 0) {
      if (resyncPeriodMillis < MINIMUM_RESYNC_PERIOD_MILLIS) {
        log.warn(
            "DefaultSharedIndexInformer#resyncPeriod {} is too small. Changing it to the minimum allowed rule of {}",
            resyncPeriodMillis,
            MINIMUM_RESYNC_PERIOD_MILLIS);
        resyncPeriodMillis = MINIMUM_RESYNC_PERIOD_MILLIS;
      }

      if (resyncPeriodMillis < this.resyncCheckPeriodMillis) {
        if (started) {
          log.warn(
              "DefaultSharedIndexInformer#resyncPeriod {} is smaller than resyncCheckPeriod {} and the informer has already started. Changing it to {}",
              resyncPeriodMillis,
              resyncCheckPeriodMillis);
          resyncPeriodMillis = resyncCheckPeriodMillis;
        } else {
          // if the event handler's resyncPeriod is smaller than the current resyncCheckPeriod,
          // update resyncCheckPeriod to match resyncPeriod and adjust the resync periods of all
          // the listeners accordingly
          this.resyncCheckPeriodMillis = resyncPeriodMillis;
        }
      }
    }

    ProcessorListener<ApiType> listener =
        new ProcessorListener(
            handler, determineResyncPeriod(resyncCheckPeriodMillis, this.resyncCheckPeriodMillis));
    if (!started) {
      this.processor.addListener(listener);
      return;
    }

    this.processor.addAndStartListener(listener);
    List<ApiType> objectList = this.indexer.list();
    for (Object item : objectList) {
      listener.add(new ProcessorListener.AddNotification(item));
    }
  }

  @Override
  public String lastSyncResourceVersion() {
    if (!started) {
      return "";
    }

    return this.controller.lastSyncResourceVersion();
  }

  @Override
  public void run() {
    if (started) {
      return;
    }

    started = true;

    this.processor.run();

    controllerThread.start();
  }

  @Override
  public void stop() {
    if (!started) {
      return;
    }

    stopped = true;

    controller.stop();
    controllerThread.interrupt();

    processor.stop();
  }

  @Override
  public boolean hasSynced() {
    // Waiting for controller initialize.
    // Because informer.run() and hasSynced() are called by different threads.
    return controller != null && this.controller.hasSynced();
  }

  /**
   * handleDeltas handles deltas and call processor distribute.
   *
   * @param deltas deltas
   */
  private void handleDeltas(Deque<MutablePair<DeltaFIFO.DeltaType, Object>> deltas) {
    if (Collections.isEmptyCollection(deltas)) {
      return;
    }

    // from oldest to newest
    for (MutablePair<DeltaFIFO.DeltaType, Object> delta : deltas) {
      DeltaFIFO.DeltaType deltaType = delta.getLeft();
      switch (deltaType) {
        case Sync:
        case Added:
        case Updated:
          boolean isSync = deltaType == DeltaFIFO.DeltaType.Sync;
          Object oldObj = this.indexer.get((ApiType) delta.getRight());
          if (oldObj != null) {
            this.indexer.update((ApiType) delta.getRight());
            this.processor.distribute(
                new ProcessorListener.UpdateNotification(oldObj, delta.getRight()), isSync);
          } else {
            this.indexer.add((ApiType) delta.getRight());
            this.processor.distribute(
                new ProcessorListener.AddNotification(delta.getRight()), isSync);
          }
          break;
        case Deleted:
          this.indexer.delete((ApiType) delta.getRight());
          this.processor.distribute(
              new ProcessorListener.DeleteNotification(delta.getRight()), false);
          break;
      }
    }
  }

  @Override
  public void addIndexers(Map indexers) {
    throw new RuntimeException("unimplemented!");
  }

  @Override
  public Indexer getIndexer() {
    return this.indexer;
  }

  private long determineResyncPeriod(long desired, long check) {
    if (desired == 0) {
      return desired;
    }
    if (check == 0) {
      return 0;
    }
    if (desired < check) {
      return check;
    }
    return desired;
  }
}
