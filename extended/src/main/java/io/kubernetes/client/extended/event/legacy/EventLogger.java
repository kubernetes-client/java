package io.kubernetes.client.extended.event.legacy;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import io.kubernetes.client.custom.V1Patch;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1Event;
import java.util.function.Function;
import org.apache.commons.lang3.tuple.MutablePair;
import org.joda.time.DateTime;

public class EventLogger {
  public EventLogger(int lruCacheEntries, Function<V1Event, String> eventKeyFunc) {
    this.eventCache = CacheBuilder.newBuilder().maximumSize(lruCacheEntries).build();
    this.eventKeyFunc = eventKeyFunc;
  }

  private Cache<String, EventLog> eventCache;
  private Function<V1Event, String> eventKeyFunc;

  public MutablePair<V1Event, V1Patch> observe(V1Event event, String key) {
    DateTime now = DateTime.now();
    EventLog lastObserved = this.eventCache.getIfPresent(key);
    V1Patch patch = null;
    if (lastObserved != null && lastObserved.count != null && lastObserved.count > 0) {
      event.setCount(lastObserved.count + 1);
      event.setFirstTimestamp(lastObserved.firstTimestamp);
      event.getMetadata().setName(lastObserved.name);
      event.getMetadata().setResourceVersion(lastObserved.resourceVersion);

      patch =
          new V1Patch(
              String.format(
                  "{\"message\":\"%s\",\"count\":\"%d\",\"lastTimestamp\":%s}",
                  event.getMessage(),
                  event.getCount(),
                  Configuration.getDefaultApiClient().getJSON().serialize(now)));
    }
    EventLog log = new EventLog();
    log.count = event.getCount();
    log.firstTimestamp = event.getFirstTimestamp();
    log.name = event.getMetadata().getName();
    log.resourceVersion = event.getMetadata().getResourceVersion();
    this.eventCache.put(key, log);
    return new MutablePair<>(event, patch);
  }

  public void updateState(V1Event event) {
    String key = this.eventKeyFunc.apply(event);
    EventLog log = new EventLog();
    log.count = event.getCount();
    log.firstTimestamp = event.getFirstTimestamp();
    log.name = event.getMetadata().getName();
    log.resourceVersion = event.getMetadata().getResourceVersion();
    this.eventCache.put(key, log);
  }

  private class EventLog {
    private Integer count;
    private DateTime firstTimestamp;
    private String name;
    private String resourceVersion;
  }
}
