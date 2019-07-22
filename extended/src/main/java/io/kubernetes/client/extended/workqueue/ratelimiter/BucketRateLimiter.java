package io.kubernetes.client.extended.workqueue.ratelimiter;

import io.github.bucket4j.*;
import java.time.Duration;

/** A light-weight token bucket implementation for RateLimiter. */
public class BucketRateLimiter<T> implements RateLimiter<T> {

  private Bucket bucket;
  private long tokensInQueue;
  private long tokensGeneratedInPeriod;
  private Duration period;

  /**
   * @param capacity Capacity is the maximum number of tokens can be consumed.
   * @param tokensGeneratedInPeriod Tokens generated in period.
   * @param period Period that generating specific number of tokens.
   */
  public BucketRateLimiter(long capacity, long tokensGeneratedInPeriod, Duration period) {
    Bandwidth bandwidth =
        Bandwidth.classic(capacity, Refill.greedy(tokensGeneratedInPeriod, period));

    this.bucket = Bucket4j.builder().addLimit(bandwidth).build();
    this.tokensInQueue = 0;
    this.tokensGeneratedInPeriod = tokensGeneratedInPeriod;
    this.period = period;
  }

  @Override
  public synchronized Duration when(T item) {
    tokensInQueue++;

    long consumedTokens = bucket.tryConsumeAsMuchAsPossible(tokensInQueue);
    if (tokensInQueue - consumedTokens == 0) {
      tokensInQueue = 0;
      return Duration.ZERO;
    }

    tokensInQueue = tokensInQueue - consumedTokens;

    return durationFromTokens(tokensInQueue, tokensGeneratedInPeriod, period);
  }

  @Override
  public void forget(T item) {}

  @Override
  public int numRequeues(T item) {
    return 0;
  }

  private Duration durationFromTokens(
      long tokensNeedToBeConsumed, long tokensGeneratedInPeriod, Duration period) {
    return period.dividedBy(tokensGeneratedInPeriod).multipliedBy(tokensNeedToBeConsumed);
  }
}
