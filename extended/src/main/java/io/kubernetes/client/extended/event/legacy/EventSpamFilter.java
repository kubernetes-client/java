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
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Refill;
import io.github.bucket4j.local.LocalBucket;
import io.github.bucket4j.local.SynchronizationStrategy;
import io.kubernetes.client.openapi.models.CoreV1Event;
import java.time.Duration;
import java.util.function.Function;

public class EventSpamFilter {

  public static final Duration DEFAULT_TOKEN_BUCKET_REFILLING_PERIOD = Duration.ofMinutes(5);
  public static final int DEFAULT_TOKEN_BUCKET_REFILLING_TOKEN = 1;
  public static final int DEFAULT_TOKEN_BUCKET_CAPACITY = 25;

  public EventSpamFilter(int maxLRUCacheEntries, Function<CoreV1Event, String> spamKeyFunc) {
    this(
        maxLRUCacheEntries,
        spamKeyFunc,
        DEFAULT_TOKEN_BUCKET_CAPACITY,
        DEFAULT_TOKEN_BUCKET_REFILLING_PERIOD,
        DEFAULT_TOKEN_BUCKET_REFILLING_TOKEN);
  }

  public EventSpamFilter(
      int maxLRUCacheEntries,
      Function<CoreV1Event, String> spamKeyFunc,
      long tokenBucketCapacity,
      Duration refillingPeriod,
      long refillingTokensPerPeriod) {
    this.spamKeyFunc = spamKeyFunc;
    this.capacity = tokenBucketCapacity;
    this.refillingTokensPerPeriod = refillingTokensPerPeriod;
    this.refillingPeriod = refillingPeriod;
    this.spamRecordCache = Caffeine.newBuilder().maximumSize(maxLRUCacheEntries).build();
  }

  private final long capacity;
  private final long refillingTokensPerPeriod;
  private final Duration refillingPeriod;
  private Cache<String, SpamRecord> spamRecordCache;
  private Function<CoreV1Event, String> spamKeyFunc;

  public boolean filter(CoreV1Event event) {
    String spamKey = spamKeyFunc.apply(event);
    SpamRecord record = spamRecordCache.get(spamKey, k -> new SpamRecord());
    return record.tokenBucket.tryConsume(1);
  }

  private class SpamRecord {
    private LocalBucket tokenBucket =
        Bucket.builder()
            .addLimit(
                Bandwidth.classic(
                    capacity, Refill.greedy(refillingTokensPerPeriod, refillingPeriod)))
            .withSynchronizationStrategy(SynchronizationStrategy.LOCK_FREE)
            .build();
  }
}
