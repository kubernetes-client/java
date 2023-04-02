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
package io.kubernetes.client.extended.event.legacy;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.CoreV1Event;
import java.time.OffsetDateTime;
import java.util.function.Function;
import org.apache.commons.lang3.tuple.MutablePair;

public class EventLogger {
  public EventLogger(int lruCacheEntries, Function<CoreV1Event, String> eventKeyFunc) {
    this.eventCache = Caffeine.newBuilder().maximumSize(lruCacheEntries).build();
    this.eventKeyFunc = eventKeyFunc;
  }

  private Cache<String, EventLog> eventCache;
  private Function<CoreV1Event, String> eventKeyFunc;

  public MutablePair<CoreV1Event, V1Patch> observe(CoreV1Event event, String key) {
    OffsetDateTime now = OffsetDateTime.now();
    EventLog lastObserved = this.eventCache.getIfPresent(key);
    V1Patch patch = null;
    if (lastObserved != null && lastObserved.count != null && lastObserved.count > 0) {
      event.setCount(lastObserved.count + 1);
      event.setFirstTimestamp(lastObserved.firstTimestamp);
      event.getMetadata().setName(lastObserved.name);
      event.getMetadata().setResourceVersion(lastObserved.resourceVersion);

      patch = buildEventPatch(event.getCount(), event.getMessage(), now);
    }
    EventLog log = new EventLog();
    log.count = event.getCount();
    log.firstTimestamp = event.getFirstTimestamp();
    log.name = event.getMetadata().getName();
    log.resourceVersion = event.getMetadata().getResourceVersion();
    this.eventCache.put(key, log);
    return new MutablePair<>(event, patch);
  }

  public void updateState(CoreV1Event event) {
    String key = this.eventKeyFunc.apply(event);
    EventLog log = new EventLog();
    log.count = event.getCount();
    log.firstTimestamp = event.getFirstTimestamp();
    log.name = event.getMetadata().getName();
    log.resourceVersion = event.getMetadata().getResourceVersion();
    this.eventCache.put(key, log);
  }

  private static class EventLog {
    private Integer count;
    private OffsetDateTime firstTimestamp;
    private String name;
    private String resourceVersion;
  }

  static V1Patch buildEventPatch(int count, String message, OffsetDateTime now) {
    return new V1Patch(
        String.format(
            "{\"message\":\"%s\",\"count\":%d,\"lastTimestamp\":%s}",
            message, count, Configuration.getDefaultApiClient().getJSON().serialize(now)));
  }
}
