package io.kubernetes.client.extended.leaderelection;

import io.kubernetes.client.openapi.ApiException;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeaderElector {

  private static final Logger log = LoggerFactory.getLogger(LeaderElector.class);

  private static final double JITTER_FACTOR = 1.2;

  private final LeaderElectionConfig config;

  // internal bookkeeping
  private LeaderElectionRecord observedRecord;
  private long observedTimeMilliSeconds;

  private ScheduledExecutorService scheduledWorkers = Executors.newSingleThreadScheduledExecutor();
  private ExecutorService leaseWorkers = Executors.newSingleThreadExecutor();
  private ExecutorService hookWorkers = Executors.newSingleThreadExecutor();

  public LeaderElector(LeaderElectionConfig config) {
    if (config == null) {
      throw new IllegalArgumentException("Config must be provided.");
    }
    List<String> errors = new LinkedList<>();
    if (config.getLock() == null) {
      errors.add("Lock must be provided.");
    }
    if (config.getLeaseDuration() == null) {
      errors.add("LeaseDuration must be provided.");
    }
    if (config.getRetryPeriod() == null) {
      errors.add("RetryPeriod must be provided.");
    }
    if (config.getRenewDeadline() == null) {
      errors.add("RenewDeadline must be provided.");
    }
    if (config.getLeaseDuration().compareTo(config.getRenewDeadline()) <= 0) {
      errors.add("LeaseDuration must be greater than renewDeadline.");
    }
    if (config.getRenewDeadline().compareTo(config.getRetryPeriod()) <= 0) {
      errors.add("RenewDeadline must be greater than retryPeriod.");
    }
    if (config.getLeaseDuration().isZero() || config.getLeaseDuration().isNegative()) {
      errors.add("LeaseDuration must be greater than zero.");
    }
    if (config.getRenewDeadline().isZero() || config.getRenewDeadline().isNegative()) {
      errors.add("RenewDeadline must be greater than zero.");
    }
    if (config.getRetryPeriod().isZero() || config.getRetryPeriod().isNegative()) {
      errors.add("RetryPeriod must be greater than zero.");
    }
    if (errors.size() > 0) {
      throw new IllegalArgumentException(String.join(",", errors));
    }
    this.config = config;
  }

  public void run(Runnable startLeadingHook, Runnable stopLeadingHook) {
    log.info("Start leader election with lock {}", config.getLock().describe());
    try {
      if (!acquire()) {
        // Fail to acquire leadership
        return;
      }
      log.info("Successfully acquired lease, became leader");
      // Hook on start leading
      hookWorkers.submit(startLeadingHook);
      renewLoop();
      log.info("Failed to renew lease, lose leadership");
      // Hook on stop leading
      stopLeadingHook.run();
    } catch (Throwable t) {
      stopLeadingHook.run();
    }
  }

  private boolean acquire() {
    if (log.isDebugEnabled()) {
      log.debug("Attempting to acquire leader lease...");
    }
    Duration retryPeriod = config.getRetryPeriod();
    long retryPeriodMillis = retryPeriod.toMillis();
    AtomicBoolean acquired = new AtomicBoolean(false);

    ScheduledFuture scheduledFuture =
        scheduledWorkers.scheduleWithFixedDelay(
            () -> {
              Future<Boolean> future = leaseWorkers.submit(this::tryAcquireOrRenew);
              try {
                Boolean success = future.get(retryPeriodMillis, TimeUnit.MILLISECONDS);
                if (log.isDebugEnabled()) {
                  log.debug("The tryAcquireOrRenew result is {}", success);
                }
                acquired.set(success);
              } catch (CancellationException e) {
                log.info("Processing tryAcquireOrRenew successfully canceled");
              } catch (Throwable t) {
                log.error("Error processing tryAcquireOrRenew as {}", t.getMessage());
                future.cancel(true);
              }
            },
            0,
            Double.valueOf(retryPeriodMillis * (JITTER_FACTOR * Math.random() + 1)).longValue(),
            TimeUnit.MILLISECONDS);

    try {
      while (!acquired.get()) {
        Thread.sleep(retryPeriodMillis);
      }
    } catch (InterruptedException e) {
      log.error("LeaderElection acquire loop gets interrupted {}", e.getMessage());
      return false;
    } finally {
      scheduledFuture.cancel(true);
    }
    return true;
  }

  private void renewLoop() {
    if (log.isDebugEnabled()) {
      log.debug("Attempting to renew leader lease...");
    }
    Duration retryPeriod = config.getRetryPeriod();
    long retryPeriodMillis = retryPeriod.toMillis();
    Duration renewDeadline = config.getRenewDeadline();
    long renewDeadlineMillis = renewDeadline.toMillis();

    try {
      while (true) {
        final Future<Boolean> future =
            leaseWorkers.submit(
                () -> {
                  try {
                    // retry until success or interrupted
                    while (!tryAcquireOrRenew()) {
                      Thread.sleep(retryPeriodMillis);
                    }
                  } catch (InterruptedException e) {
                    return false;
                  }
                  return true;
                });

        boolean renewResult;
        try {
          renewResult = future.get(renewDeadlineMillis, TimeUnit.MILLISECONDS);
        } catch (ExecutionException | TimeoutException t) {
          if (log.isDebugEnabled()) {
            log.debug("failed to tryAcquireOrRenew", t);
          }
          renewResult = false;
        } finally {
          future.cancel(true);
        }
        if (renewResult) {
          if (log.isDebugEnabled()) {
            log.debug("Successfully renewed lease");
          }
          Thread.sleep(retryPeriodMillis);
        } else {
          break;
        }
      }
    } catch (InterruptedException e) {
      log.error("LeaderElection renew loop gets interrupted {}", e.getMessage());
    }
  }

  private boolean tryAcquireOrRenew() {
    Date now = new Date();
    Lock lock = config.getLock();
    LeaderElectionRecord leaderElectionRecord =
        new LeaderElectionRecord(
            lock.identity(),
            Long.valueOf(config.getLeaseDuration().getSeconds()).intValue(),
            now,
            now,
            0);

    // 1. obtain or create the ElectionRecord
    LeaderElectionRecord oldLeaderElectionRecord;
    try {
      oldLeaderElectionRecord = lock.get();
    } catch (ApiException e) {
      if (e.getCode() != HttpURLConnection.HTTP_NOT_FOUND) {
        log.error("Error retrieving resource lock {} as {}", lock.describe(), e.getMessage());
        return false;
      }

      return createLock(lock, leaderElectionRecord);
    }

    if (oldLeaderElectionRecord == null
        || oldLeaderElectionRecord.getAcquireTime() == null
        || oldLeaderElectionRecord.getRenewTime() == null
        || oldLeaderElectionRecord.getHolderIdentity() == null) {
      return createLock(lock, leaderElectionRecord);
    }

    // 2. Record obtained, check the Identity & Time
    if (!oldLeaderElectionRecord.equals(this.observedRecord)) {
      this.observedRecord = oldLeaderElectionRecord;
      this.observedTimeMilliSeconds = System.currentTimeMillis();
    }
    if (observedTimeMilliSeconds + config.getLeaseDuration().toMillis() > now.getTime()
        && !isLeader()) {
      if (log.isDebugEnabled()) {
        log.debug(
            "Lock is held by {} and has not yet expired",
            oldLeaderElectionRecord.getHolderIdentity());
      }
      return false;
    }

    // 3. We're going to try to update. The leaderElectionRecord is set to it's default
    // here. Let's correct it before updating.
    if (isLeader()) {
      leaderElectionRecord.setAcquireTime(oldLeaderElectionRecord.getAcquireTime());
      leaderElectionRecord.setLeaderTransitions(oldLeaderElectionRecord.getLeaderTransitions());
    } else {
      leaderElectionRecord.setLeaderTransitions(oldLeaderElectionRecord.getLeaderTransitions() + 1);
    }

    // update the lock itself
    if (log.isDebugEnabled()) {
      log.debug("Update lock acquire time to keep lease");
    }
    boolean updateSuccess = config.getLock().update(leaderElectionRecord);
    if (!updateSuccess) {
      return false;
    }
    this.observedRecord = leaderElectionRecord;
    this.observedTimeMilliSeconds = System.currentTimeMillis();
    if (log.isDebugEnabled()) {
      log.debug("TryAcquireOrRenew return success");
    }
    return true;
  }

  private boolean createLock(Lock lock, LeaderElectionRecord leaderElectionRecord) {
    if (log.isDebugEnabled()) {
      log.debug("Lock not found, try to create it");
    }
    boolean createSuccess = lock.create(leaderElectionRecord);
    if (!createSuccess) {
      return false;
    }
    this.observedRecord = leaderElectionRecord;
    this.observedTimeMilliSeconds = System.currentTimeMillis();
    return true;
  }

  private boolean isLeader() {
    return this.config.getLock().identity().equals(this.observedRecord.getHolderIdentity());
  }
}
