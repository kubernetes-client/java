package io.kubernetes.client.extended.wait;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

public class Wait {

  /**
   * Poll tries a condition func until it returns true, an exception, or the timeout is reached.
   *
   * @param interval the check interval
   * @param timeout the timeout period
   * @param condition the condition func
   */
  public static boolean poll(Duration interval, Duration timeout, Supplier<Boolean> condition) {
    ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
    AtomicBoolean result = new AtomicBoolean(false);
    long dueDate = System.currentTimeMillis() + timeout.toMillis();
    ScheduledFuture<?> future =
        executorService.scheduleAtFixedRate(
            () -> {
              try {
                result.set(condition.get());
              } catch (Exception e) {
                result.set(false);
              }
            },
            interval.toMillis(),
            interval.toMillis(),
            TimeUnit.MILLISECONDS);
    try {
      while (System.currentTimeMillis() < dueDate) {
        if (result.get()) {
          future.cancel(true);
          return true;
        }
      }
    } catch (Exception e) {
      return result.get();
    }
    future.cancel(true);
    return result.get();
  }
}
