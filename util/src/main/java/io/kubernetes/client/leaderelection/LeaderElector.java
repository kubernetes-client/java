package io.kubernetes.client.leaderelection;

import io.kubernetes.client.ApiException;
import io.kubernetes.client.leaderelection.resourcelock.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * LeaderElector is a leader election client.
 */
public class LeaderElector implements Runnable {

  private Random random = new Random();
  private Logger logger = LoggerFactory.getLogger(LeaderElector.class);

  private LeaderElectionConfig config;
  /**
   * internal bookkeeping
   */
  private LeaderElectionRecord observedRecord;
  private Long observedTime;
  /**
   * used to implement OnNewLeader(), may lag slightly from the value observedRecord.HolderIdentity
   * if the transition has not yet been reported.
   */
  private String reportedLeader;

  private AtomicBoolean cancel = new AtomicBoolean(false);

  private ExecutorService executor;

  private static final double JITTER_FACTOR = 1.2;

  public LeaderElector(LeaderElectionConfig config) {
    this(config, 10);
  }

  public LeaderElector(LeaderElectionConfig config, int corePoolSize) {
    String reason = checkLeaderElectionConfig(config);
    if (reason != null) {
      throw new RuntimeException(reason);
    }
    this.config = config;
    executor = Executors.newScheduledThreadPool(corePoolSize);
  }

  public LeaderElector(LeaderElectionConfig config, int corePoolSize, ThreadFactory threadFactory) {
    String reason = checkLeaderElectionConfig(config);
    if (reason != null) {
      throw new RuntimeException(reason);
    }
    this.config = config;
    executor = Executors.newScheduledThreadPool(corePoolSize, threadFactory);
  }

  /**
   * @param config -- the config to check
   * @return null for no problem; otherwise return fail reason
   */
  public static String checkLeaderElectionConfig(LeaderElectionConfig config) {
    if (config.getLeaseDuration() <= config.getRenewDeadline()) {
      return "leaseDuration must be greater than renewDeadline";
    }
    if (config.getRenewDeadline() <= JITTER_FACTOR * config.getRetryPeriod()) {
      return "renewDeadline must be greater than retryPeriod*JitterFactor";
    }
    if (config.getLeaseDuration() < 1) {
      return "leaseDuration must be greater than zero";
    }
    if (config.getRenewDeadline() < 1) {
      return "renewDeadline must be greater than zero";
    }
    if (config.getRetryPeriod() < 1) {
      return "retryPeriod must be greater than zero";
    }
    if (config.getLock() == null) {
      return "Lock must not be null.";
    }
    return null;
  }

  /**
   * this method will block until lost the lock just like RunOrDie() method in client-go
   */
  @Override
  public void run() {
    try {
      if (!acquire(cancel)) {
        return;
      }
      Runnable runnable = () -> config.getCallbacks().onStartedLeading();
      executor.submit(runnable);
      renew(cancel);
    } finally {
      config.getCallbacks().onStopLeading();
      executor.shutdown();
    }
  }

  public void cancel() {
    cancel.set(false);
  }

  /**
   * GetLeader returns the identity of the last observed leader or returns the empty string if no
   * leader has yet been observed.
   */
  public String getLeader() {
    return observedRecord.getHolderIdentity();
  }

  /**
   * IsLeader returns true if the last observed leader was this client else returns false.
   */
  public boolean isLeader() {
    return config.getLock().identity().equals(observedRecord.getHolderIdentity());
  }

  /**
   * Check will determine if the current lease is expired by more than timeout.
   *
   * @return true for expired;
   */
  public boolean check(long maxTolerableExpiredLease) {
    if (isLeader()) {
      // If we are more than timeout seconds after the lease duration that is past the timeout
      // on the lease renew. Time to start reporting ourselves as unhealthy. We should have
      // died but conditions like deadlock can prevent this. (See #70819)
      // failed election to renew leadership on lease
      return System.currentTimeMillis() - observedTime
          > config.getLeaseDuration() + maxTolerableExpiredLease;
    }
    return false;
  }

  /**
   * acquire loops calling tryAcquireOrRenew and returns true immediately when tryAcquireOrRenew
   * succeeds. return false if ctx signals done.
   */
  private boolean acquire(AtomicBoolean cancel) {
    String desc = config.getLock().describe();
    logger.info("attempting to acquire leader lease {}...", desc);
    try {
      while (!cancel.get()) {
        boolean success = tryAcquireOrRenew();
        maybeReportTransition();
        if (success) {
          config.getLock().recordEvent("became leader");
          logger.info("successfully acquired lease {}", desc);
          return true;
        } else {
          logger.debug("failed to acuqire lease {}", desc);
        }
        // sleep time jittered
        Thread.sleep(config.getRetryPeriod()
            + (long) (random.nextDouble() * JITTER_FACTOR * config.getRetryPeriod()));
      }
    } catch (InterruptedException e) {
      logger.warn("acquire thread interrupted", e);
    }
    return false;
  }

  /**
   * renew loops calling tryAcquireOrRenew and returns immediately when tryAcquireOrRenew fails or
   * ctx signals done.
   */
  private void renew(AtomicBoolean cancel) {
    try {
      while (!cancel.get()) {
        String desc = config.getLock().describe();
        try {
          Callable<Boolean> callable = () -> {
            boolean done = false;
            while (!done && !cancel.get()) {
              done = tryAcquireOrRenew();
              Thread.sleep(config.getRetryPeriod());
            }
            return done;
          };
          executor.invokeAll(
              Arrays.asList(callable), config.getRenewDeadline(), TimeUnit.MILLISECONDS);
          maybeReportTransition();
          logger.debug("successfully renewed lease {}", desc);
        } catch (InterruptedException e) {
          logger.warn("failed to tryAcquireOrRenew", e);
        } catch (Exception e) {
          config.getLock().recordEvent("stopped leading");
          logger.info("failed to renew lease {}", desc, e);
        }
        Thread.sleep(config.getRetryPeriod());
      }
    } catch (InterruptedException e) {
      logger.warn("renew thread interrupted", e);
    } finally {
      if (config.isReleaseOnCancel()) {
        release();
      }
    }
  }

  /**
   * tryAcquireOrRenew tries to acquire a leader lease if it is not already acquired, else it tries
   * to renew the lease if it has already been acquired. Returns true on success else returns
   * false.
   *
   * @return return true when acquire (or renew) lock success, otherwise false
   */
  private boolean tryAcquireOrRenew() {
    final long now = System.currentTimeMillis();
    LeaderElectionRecord leaderElectionRecord = new LeaderElectionRecord(
        config.getLock().identity(),
        (int) TimeUnit.MILLISECONDS.toSeconds(config.getLeaseDuration()), now, now);
    LeaderElectionRecord oldLeaderElectionRecord;
    try {
      // 1. obtain or create the ElectionRecord
      oldLeaderElectionRecord = config.getLock().get();
    } catch (ResourceNotFoundException e) {
      try {
        config.getLock().create(leaderElectionRecord);
      } catch (ApiException e1) {
        logger.error("error initially creating leader election record", e1);
        return false;
      }
      observedRecord = leaderElectionRecord;
      observedTime = now;
      return true;
    } catch (ApiException e) {
      logger.error("error retrieving resource lock, {}", config.getLock().describe(), e);
      return false;
    }

    // 2. Record obtained, check the Identity & Time
    if (!oldLeaderElectionRecord.equals(observedRecord)) {
      observedRecord = oldLeaderElectionRecord;
      observedTime = System.currentTimeMillis();
    }
    if (observedRecord.getHolderIdentity().length() > 0
        && (observedTime + config.getLeaseDuration() > System.currentTimeMillis())
        && !isLeader()) {
      logger.debug("lock is held by {} and has not yet expired",
          oldLeaderElectionRecord.getHolderIdentity());
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

    // update lock itself
    try {
      config.getLock().update(leaderElectionRecord);
      observedRecord = leaderElectionRecord;
      observedTime = System.currentTimeMillis();
      return true;
    } catch (ApiException e) {
      logger.error("Failed to update lock", e);
      return false;
    }
  }

  private void maybeReportTransition() {
    if (reportedLeader != null && reportedLeader.equals(observedRecord.getHolderIdentity())) {
      return;
    }
    reportedLeader = observedRecord.getHolderIdentity();
    Callable<Boolean> callable = () -> {
      config.getCallbacks().onNewLeader(reportedLeader);
      return true;
    };
    executor.submit(callable);
  }

  /**
   * release attempts to release the leader lease if we have acquired it.
   */
  private boolean release() {
    if (!isLeader()) {
      return true;
    }
    LeaderElectionRecord leaderElectionRecord = new LeaderElectionRecord();
    leaderElectionRecord.setLeaderTransitions(observedRecord.getLeaderTransitions());
    try {
      config.getLock().update(leaderElectionRecord);
    } catch (ApiException e) {
      logger.error("Failed to release lock", e);
      return false;
    }
    observedRecord = leaderElectionRecord;
    observedTime = System.currentTimeMillis();
    return true;
  }
}
