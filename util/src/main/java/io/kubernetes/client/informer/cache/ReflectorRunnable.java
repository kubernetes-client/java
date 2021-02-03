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
import io.kubernetes.client.informer.EventType;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.util.CallGeneratorParams;
import io.kubernetes.client.util.Strings;
import io.kubernetes.client.util.Watchable;
import java.io.IOException;
import java.net.ConnectException;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReflectorRunnable<
        ApiType extends KubernetesObject, ApiListType extends KubernetesListObject>
    implements Runnable {

  private static final Logger log = LoggerFactory.getLogger(ReflectorRunnable.class);

  private String lastSyncResourceVersion;
  private Watchable<ApiType> watch;

  private ListerWatcher<ApiType, ApiListType> listerWatcher;

  private DeltaFIFO store;

  private Class<ApiType> apiTypeClass;

  private AtomicBoolean isActive = new AtomicBoolean(true);

  private final BiConsumer<Class<ApiType>, Throwable> exceptionHandler;

  public ReflectorRunnable(
      Class<ApiType> apiTypeClass, ListerWatcher listerWatcher, DeltaFIFO store) {
    this(apiTypeClass, listerWatcher, store, ReflectorRunnable::defaultWatchErrorHandler);
  }

  public ReflectorRunnable(
      Class<ApiType> apiTypeClass,
      ListerWatcher listerWatcher,
      DeltaFIFO store,
      BiConsumer<Class<ApiType>, Throwable> exceptionHandler) {
    this.listerWatcher = listerWatcher;
    this.store = store;
    this.apiTypeClass = apiTypeClass;
    this.exceptionHandler = exceptionHandler;
  }

  /**
   * run first lists all items and get the resource version at the moment of call, and then use the
   * resource version to watch.
   */
  public void run() {
    log.info("{}#Start listing and watching...", apiTypeClass);

    try {
      ApiListType list =
          listerWatcher.list(
              new CallGeneratorParams(Boolean.FALSE, getRelistResourceVersion(), null));

      V1ListMeta listMeta = list.getMetadata();
      String resourceVersion = listMeta.getResourceVersion();
      List<? extends KubernetesObject> items = list.getItems();

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
          closeWatch();
          return;
        }

        try {
          if (log.isDebugEnabled()) {
            log.debug(
                "{}#Start watch with resource version {}", apiTypeClass, lastSyncResourceVersion);
          }
          Watchable<ApiType> newWatch =
              listerWatcher.watch(
                  new CallGeneratorParams(
                      Boolean.TRUE,
                      lastSyncResourceVersion,
                      Long.valueOf(Duration.ofMinutes(5).getSeconds()).intValue()));

          synchronized (this) {
            if (!isActive.get()) {
              newWatch.close();
              continue;
            }
            watch = newWatch;
          }
          watchHandler(newWatch);
        } catch (Throwable t) {
          if (isConnectException(t)) {
            // If this is "connection refused" error, it means that most likely
            // apiserver is not
            // responsive.
            // It doesn't make sense to re-list all objects because most likely we will
            // be able to
            // restart
            // watch where we ended.
            // If that's the case wait and resend watch request.
            log.info("{}#Watch get connect exception, retry watch", this.apiTypeClass);
            try {
              Thread.sleep(1000L);
            } catch (InterruptedException e) {
              // no-op
            }
            continue;
          }
          if ((t instanceof RuntimeException)
              && t.getMessage().contains("IO Exception during hasNext")) {
            log.info("{}#Read timeout retry list and watch", this.apiTypeClass);
            return;
          }
          this.exceptionHandler.accept(apiTypeClass, t);
          return;
        } finally {
          closeWatch();
        }
      }
    } catch (Throwable t) {
      this.exceptionHandler.accept(apiTypeClass, t);
    }
  }

  public void stop() {
    try {
      isActive.set(false);
      closeWatch();
    } catch (Throwable t) {
      this.exceptionHandler.accept(apiTypeClass, t);
    }
  }

  private synchronized void closeWatch() throws IOException {
    if (watch != null) {
      watch.close();
      watch = null;
    }
  }

  private void syncWith(List<? extends KubernetesObject> items, String resourceVersion) {
    this.store.replace(
        (List<KubernetesObject>) items, resourceVersion); // down-casting is safe here
  }

  public String getLastSyncResourceVersion() {
    return lastSyncResourceVersion;
  }

  private String getRelistResourceVersion() {
    if (Strings.isNullOrEmpty(lastSyncResourceVersion)) {
      return "0";
    }
    return lastSyncResourceVersion;
  }

  private void watchHandler(Watchable<ApiType> watch) {
    while (watch.hasNext()) {
      io.kubernetes.client.util.Watch.Response<ApiType> item = watch.next();

      Optional<EventType> eventType = EventType.findByType(item.type);
      if (!eventType.isPresent()) {
        log.error("unrecognized event {}", item);
        continue;
      }
      if (eventType.get() == EventType.ERROR) {
        String errorMessage =
            String.format("got ERROR event and its status: %s", item.status.toString());
        log.error(errorMessage);
        throw new RuntimeException(errorMessage);
      }

      ApiType obj = item.object;

      V1ObjectMeta meta = obj.getMetadata();

      String newResourceVersion = meta.getResourceVersion();
      switch (eventType.get()) {
        case ADDED:
          store.add(obj);
          break;
        case MODIFIED:
          store.update(obj);
          break;
        case DELETED:
          store.delete(obj);
          break;
        case BOOKMARK:
          break;
          // A `Bookmark` means watch has synced here, just update the resourceVersion
      }
      lastSyncResourceVersion = newResourceVersion;
      if (log.isDebugEnabled()) {
        log.debug("{}#Receiving resourceVersion {}", apiTypeClass, lastSyncResourceVersion);
      }
    }
  }

  private static <ApiType extends KubernetesObject> void defaultWatchErrorHandler(
      Class<ApiType> watchingApiTypeClass, Throwable t) {
    log.error(String.format("%s#Reflector loop failed unexpectedly", watchingApiTypeClass), t);
  }

  private boolean isConnectException(Throwable t) {
    if (t instanceof ConnectException) {
      return true;
    }
    // ApiException can nest a ConnectException
    Throwable cause = t.getCause();
    return cause instanceof ConnectException;
  }
}
