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
