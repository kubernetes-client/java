package io.kubernetes.client.informer.cache;

import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.models.V1ListMeta;
import io.kubernetes.client.models.V1ObjectMeta;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Reflect;
import io.kubernetes.client.util.Watchable;
import io.kubernetes.client.util.exception.ObjectMetaReflectException;
import java.net.ConnectException;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReflectorRunnable<ApiType, ApiListType> implements Runnable {

  private static final Logger log = LoggerFactory.getLogger(ReflectorRunnable.class);

  private String lastSyncResourceVersion;
  private Watchable<ApiType> watch;

  private ListerWatcher<ApiType, ApiListType> listerWatcher;

  private Store<ApiType> store;

  private Class<ApiType> apiTypeClass;

  private AtomicBoolean isActive = new AtomicBoolean(true);

  public ReflectorRunnable(Class<ApiType> apiTypeClass, ListerWatcher listerWatcher, Store store) {
    this.listerWatcher = listerWatcher;
    this.store = store;
    this.apiTypeClass = apiTypeClass;
  }

  /**
   * run first lists all items and get the resource version at the moment of call, and then use the
   * resource version to watch.
   */
  public void run() {
    try {
      log.info("{}#Start listing and watching...", apiTypeClass);

      ApiListType list = listerWatcher.list(new CallGeneratorParams(Boolean.FALSE, null, null));

      V1ListMeta listMeta = Reflect.listMetadata(list);
      String resourceVersion = listMeta.getResourceVersion();
      List<ApiType> items = Reflect.getItems(list);

      if (log.isDebugEnabled()) {
        log.debug("{}#Extract resourceVersion {} list meta", apiTypeClass, resourceVersion);
      }
      this.syncWith(items, resourceVersion);
      this.lastSyncResourceVersion = resourceVersion;

      if (log.isDebugEnabled()) {
        log.debug("{}#Start watching with {}...", apiTypeClass, lastSyncResourceVersion);
      }
      while (true) {
        if (!isActive.get()) {
          if (watch != null) {
            watch.close();
            return;
          }
        }

        try {
          if (log.isDebugEnabled()) {
            log.debug(
                "{}#Start watch with resource version {}", apiTypeClass, lastSyncResourceVersion);
          }
          watch =
              listerWatcher.watch(
                  new CallGeneratorParams(
                      Boolean.TRUE,
                      lastSyncResourceVersion,
                      Long.valueOf(Duration.ofMinutes(5).toMillis()).intValue()));
          watchHandler(watch);
        } catch (Throwable t) {
          log.info("{}#Watch connection get exception {}", apiTypeClass, t.getMessage());
          Throwable cause = t.getCause();
          // If this is "connection refused" error, it means that most likely apiserver is not
          // responsive.
          // It doesn't make sense to re-list all objects because most likely we will be able to
          // restart
          // watch where we ended.
          // If that's the case wait and resend watch request.
          if (cause != null && (cause instanceof ConnectException)) {
            log.info("{}#Watch get connect exception, retry watch", apiTypeClass);
            Thread.sleep(1000L);
            continue;
          }
          if ((t instanceof RuntimeException)
              && t.getMessage().contains("IO Exception during hasNext")) {
            log.info("{}#Read timeout retry list and watch", apiTypeClass);
            return;
          }
          log.error("{}#Watch failed as {} unexpected", apiTypeClass, t.getMessage(), t);
          continue;
        } finally {
          if (watch != null) {
            watch.close();
            watch = null;
          }
        }
      }
    } catch (Throwable t) {
      log.error("{}#Failed to list-watch: {}", apiTypeClass, t);
    }
  }

  public void stop() {
    isActive.set(false);
  }

  private void syncWith(List<ApiType> items, String resourceVersion) {
    this.store.replace(items, resourceVersion);
  }

  public String getLastSyncResourceVersion() {
    return lastSyncResourceVersion;
  }

  private void watchHandler(Watchable<ApiType> watch) {
    while (watch.hasNext()) {
      io.kubernetes.client.util.Watch.Response<ApiType> item = watch.next();

      EventType eventType = EventType.getByType(item.type);
      if (eventType == null) {
        log.error("unrecognized event {}", item);
        continue;
      }
      if (eventType == EventType.ERROR) {
        String errorMessage =
            String.format("got ERROR event and its status: %s", item.status.toString());
        log.error(errorMessage);
        throw new RuntimeException(errorMessage);
      }

      ApiType obj = item.object;

      V1ObjectMeta meta;
      try {
        meta = Reflect.objectMetadata(obj);
      } catch (ObjectMetaReflectException e) {
        log.error("malformed watch event {}", item);
        continue;
      }

      String newResourceVersion = meta.getResourceVersion();
      switch (eventType) {
        case ADDED:
          store.add(obj);
          break;
        case MODIFIED:
          store.update(obj);
          break;
        case DELETED:
          store.delete(obj);
          break;
      }
      lastSyncResourceVersion = newResourceVersion;
      if (log.isDebugEnabled()) {
        log.debug("{}#Receiving resourceVersion {}", apiTypeClass, lastSyncResourceVersion);
      }
    }
  }
}
