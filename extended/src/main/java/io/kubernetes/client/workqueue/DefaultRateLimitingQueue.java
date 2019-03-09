package io.kubernetes.client.workqueue;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The default rate limiting queue implementation.
 */
public class DefaultRateLimitingQueue extends DefaultDelayingQueue implements RateLimitingQueue {

    private RateLimiter rateLimiter;

    public DefaultRateLimitingQueue() {
        rateLimiter = new ExponentialRateLimiter();
    }

    public DefaultRateLimitingQueue(RateLimiter rateLimiter) {
        this.rateLimiter = rateLimiter;
    }

    @Override
    public int numRequeues(Object item) {
        return rateLimiter.numRequeues(item);
    }

    @Override
    public void forget(Object item) {
        rateLimiter.forget(item);
    }

    @Override
    public void addRateLimited(Object item) {
        super.addAfter(item, rateLimiter.when(item));
    }

    public static class ExponentialRateLimiter implements RateLimiter {

        Duration baseDelay;
        Duration maxDelay;

        private Map<Object, Integer> failures = new ConcurrentHashMap<>();

        public ExponentialRateLimiter() {
            this.baseDelay = Duration.ofMillis(5);
            this.maxDelay = Duration.ofSeconds(1000);
        }

        public ExponentialRateLimiter(Duration baseDelay, Duration maxDelay) {
            this.baseDelay = baseDelay;
            this.maxDelay = maxDelay;
        }

        @Override
        public void forget(Object item) {
            failures.remove(item);
        }

        @Override
        public int numRequeues(Object item) {
            return failures.get(item);
        }

        @Override
        public Duration when(Object item) {
            Integer exp = failures.getOrDefault(item, 0);
            failures.put(item, exp + 1);
            double backoff = baseDelay.toNanos() * Math.pow(2, exp);
            if (backoff > Long.MAX_VALUE) {
                return maxDelay;
            }
            if (backoff > maxDelay.toNanos()) {
                return maxDelay;
            }
            return Duration.ofNanos(Double.valueOf(backoff).longValue());
        }
    }
}
