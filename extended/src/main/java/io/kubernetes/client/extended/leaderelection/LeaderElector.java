package io.kubernetes.client.extended.leaderelection;

import io.kubernetes.client.ApiException;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.Date;
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
    AtomicBoolean renewed = new AtomicBoolean(true);

    ScheduledFuture scheduledFuture =
        scheduledWorkers.scheduleAtFixedRate(
            () -> {
              Future<Boolean> future = leaseWorkers.submit(this::tryAcquireOrRenew);
              try {
                //  set renew success
                renewed.set(future.get(retryPeriodMillis, TimeUnit.MILLISECONDS));
              } catch (Throwable t) {
                future.cancel(true);
              }
            },
            0,
            retryPeriodMillis,
            TimeUnit.MILLISECONDS);

    try {
      while (renewed.get()) {
        if (log.isDebugEnabled()) {
          log.debug("Successfully renewed lease");
        }
        Thread.sleep(retryPeriodMillis);
      }
    } catch (InterruptedException e) {
      log.error("LeaderElection renew loop gets interrupted {}", e.getMessage());
    } finally {
      scheduledFuture.cancel(true);
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
