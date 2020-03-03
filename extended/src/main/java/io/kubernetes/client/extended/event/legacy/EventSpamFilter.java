package io.kubernetes.client.extended.event.legacy;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import io.github.bucket4j.local.LocalBucket;
import io.github.bucket4j.local.SynchronizationStrategy;
import io.kubernetes.client.openapi.models.V1Event;
import java.time.Duration;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

public class EventSpamFilter {

  public static final Duration DEFAULT_TOKEN_BUCKET_REFILLING_PERIOD = Duration.ofMinutes(5);
  public static final int DEFAULT_TOKEN_BUCKET_REFILLING_TOKEN = 1;
  public static final int DEFAULT_TOKEN_BUCKET_CAPACITY = 25;

  public EventSpamFilter(int maxLRUCacheEntries, Function<V1Event, String> spamKeyFunc) {
    this(
        maxLRUCacheEntries,
        spamKeyFunc,
        DEFAULT_TOKEN_BUCKET_CAPACITY,
        DEFAULT_TOKEN_BUCKET_REFILLING_PERIOD,
        DEFAULT_TOKEN_BUCKET_REFILLING_TOKEN);
  }

  public EventSpamFilter(
      int maxLRUCacheEntries,
      Function<V1Event, String> spamKeyFunc,
      long tokenBucketCapacity,
      Duration refillingPeriod,
      long refillingTokensPerPeriod) {
    this.spamKeyFunc = spamKeyFunc;
    this.capacity = tokenBucketCapacity;
    this.refillingTokensPerPeriod = refillingTokensPerPeriod;
    this.refillingPeriod = refillingPeriod;
    this.spamRecordCache = CacheBuilder.newBuilder().maximumSize(maxLRUCacheEntries).build();
  }

  private final long capacity;
  private final long refillingTokensPerPeriod;
  private final Duration refillingPeriod;
  private Cache<String, SpamRecord> spamRecordCache;
  private Function<V1Event, String> spamKeyFunc;

  public boolean filter(V1Event event) {
    String spamKey = spamKeyFunc.apply(event);
    SpamRecord record;
    try {
      record = spamRecordCache.get(spamKey, SpamRecord::new);
    } catch (ExecutionException e) {
      throw new IllegalStateException(e);
    }
    return record.tokenBucket.tryConsume(1);
  }

  private class SpamRecord {
    private LocalBucket tokenBucket =
        Bucket4j.builder()
            .addLimit(
                Bandwidth.classic(
                    capacity, Refill.greedy(refillingTokensPerPeriod, refillingPeriod)))
            .withSynchronizationStrategy(SynchronizationStrategy.LOCK_FREE)
            .build();
  }
}
