package io.kubernetes.client.extended.event.legacy;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import io.kubernetes.client.fluent.Function;
import io.kubernetes.client.openapi.models.V1Event;
import io.kubernetes.client.openapi.models.V1EventBuilder;
import io.kubernetes.client.openapi.models.V1ObjectMetaBuilder;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.apache.commons.lang3.tuple.MutablePair;
import org.joda.time.DateTime;

public class EventAggregator {

  public static final int DEFAULT_MAX_EVENT_LOCAL_KEYS = 10;
  public static final java.time.Duration DEFAULT_EVENT_AGGREGATE_CACHE_EXPIRATION =
      java.time.Duration.ofSeconds(600);

  public EventAggregator(
      int maxLRUCacheEntries,
      Function<V1Event, MutablePair<String, String>> keyFunc,
      Function<V1Event, String> messageFunc) {
    this.keyFunc = keyFunc;
    this.messageFunc = messageFunc;
    this.maxEvents = DEFAULT_MAX_EVENT_LOCAL_KEYS;
    this.spammingCache =
        CacheBuilder.newBuilder()
            .maximumSize(maxLRUCacheEntries)
            .expireAfterWrite(DEFAULT_EVENT_AGGREGATE_CACHE_EXPIRATION)
            .build();
  }

  private Cache<String, AggregatedRecord> spammingCache;
  private Function<V1Event, MutablePair<String, String>> keyFunc;
  private Function<V1Event, String> messageFunc;

  private final int maxEvents;

  public synchronized MutablePair<V1Event, String> aggregate(V1Event event) {
    DateTime now = DateTime.now();

    MutablePair<String, String> aggregatedKeys = keyFunc.apply(event);
    String aggregatedKey = aggregatedKeys.getLeft();
    String localKey = aggregatedKeys.getRight();

    AggregatedRecord record;
    try {
      record = this.spammingCache.get(aggregatedKey, AggregatedRecord::new);
    } catch (ExecutionException e) {
      throw new IllegalStateException(e);
    }
    record.lastTimestamp = now;
    record.localKeys.add(localKey);

    if (record.localKeys.size() < this.maxEvents) {
      this.spammingCache.put(aggregatedKey, record);
      return new MutablePair<>(event, EventUtils.getEventKey(event));
    }
    record.localKeys.remove(record.localKeys.stream().findAny().get()); // remove any keys
    V1Event aggregatedEvent =
        new V1EventBuilder(event)
            .withMetadata(
                new V1ObjectMetaBuilder()
                    .withName(EventUtils.generateName(event.getInvolvedObject().getName(), now))
                    .withNamespace(event.getInvolvedObject().getNamespace())
                    .build())
            .withCount(1)
            .withFirstTimestamp(now)
            .withLastTimestamp(now)
            .withMessage(this.messageFunc.apply(event))
            .build();
    this.spammingCache.put(aggregatedKey, record);
    return new MutablePair<>(aggregatedEvent, aggregatedKey);
  }

  private class AggregatedRecord {
    private Set<String> localKeys = new HashSet<>();
    private DateTime lastTimestamp;

    @Override
    public boolean equals(Object o) {
      return Objects.equals(this, o);
    }

    @Override
    public int hashCode() {
      return Objects.hashCode(this);
    }
  }

  public int getMaxEvents() {
    return maxEvents;
  }
}
