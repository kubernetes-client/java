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
package io.kubernetes.client.extended.leaderelection;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.Threads;
import java.net.HttpURLConnection;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LeaderElector implements AutoCloseable {

  private static final Logger log = LoggerFactory.getLogger(LeaderElector.class);

  private static final double JITTER_FACTOR = 1.2;

  private final LeaderElectionConfig config;

  // internal bookkeeping
  private LeaderElectionRecord observedRecord;
  private long observedTimeMilliSeconds;
  private final Consumer<Throwable> exceptionHandler;
  // used to implement OnNewLeader(), may lag slightly from the
  // value observedRecord.HolderIdentity if the transition has
  // not yet been reported.
  private String reportedLeader;
  private Consumer<String> onNewLeaderHook;

  private final ScheduledExecutorService scheduledWorkers =
      Executors.newSingleThreadScheduledExecutor(
          Threads.threadFactory("leader-elector-scheduled-worker-%d"));
  private final ExecutorService leaseWorkers =
      Executors.newSingleThreadExecutor(Threads.threadFactory("leader-elector-lease-worker-%d"));
  private final ExecutorService hookWorkers =
      Executors.newSingleThreadExecutor(Threads.threadFactory("leader-elector-hook-worker-%d"));

  public LeaderElector(LeaderElectionConfig config) {
    this(
        config,
        (t) -> {
          log.error("Unexpected error on acquiring or renewing the lease", t);
        });
  }

  public LeaderElector(LeaderElectionConfig config, Consumer<Throwable> exceptionHandler) {
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
    this.exceptionHandler = exceptionHandler;
  }

  /**
   * Runs the leader election in foreground. The process will enter an acquisition loop trying to
   * get a lease of the lock object set in configuration. The acquisition loop stops in either of
   * these scenarios:
   *
   * <p>1) An error occurs that prevents us from aquiring a lease.
   *
   * <p>2) The LeaderElector successfully acquires leadership. At this point, we will enter a
   * renewal loop where we will continuously renew the lease following the provided configuration.
   *
   * <p>Note that in both cases the LeaderElector will NOT return to the acquisition loop. This is
   * most relevant when a leader instance loses leadership as the LeaderElector will not try to
   * re-acquire leadership. To do this, the caller is responsible for explicitly invoking the "run"
   * method again.
   *
   * @param startLeadingHook called when a LeaderElector client starts leading
   * @param stopLeadingHook called when a LeaderElector client stops leading
   */
  public void run(Runnable startLeadingHook, Runnable stopLeadingHook) {
    run(startLeadingHook, stopLeadingHook, null);
  }

  /**
   * Runs the leader election in foreground. The process will enter an acquisition loop trying to
   * get a lease of the lock object set in configuration. The acquisition loop stops in either of
   * these scenarios:
   *
   * <p>1) An error occurs that prevents us from aquiring a lease.
   *
   * <p>2) The LeaderElector successfully acquires leadership. At this point, we will enter a
   * renewal loop where we will continuously renew the lease following the provided configuration.
   *
   * <p>Note that in both cases the LeaderElector will NOT return to the acquisition loop. This is
   * most relevant when a leader instance loses leadership as the LeaderElector will not try to
   * re-acquire leadership. To do this, the caller is responsible for explicitly invoking the "run"
   * method again.
   *
   * @param startLeadingHook called when a LeaderElector client starts leading
   * @param stopLeadingHook called when a LeaderElector client stops leading
   * @param onNewLeaderHook called when the client observes a leader that is not the previously
   *     observed leader. This includes the first observed leader when the client starts.
   */
  public void run(
      Runnable startLeadingHook, Runnable stopLeadingHook, Consumer<String> onNewLeaderHook) {
    this.onNewLeaderHook = onNewLeaderHook;
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
    } catch (Throwable t) {
      log.error("Leader elector stopped due to an exception", t);
    } finally {
      // Hook on stop leading
      log.info("Failed to renew lease, lose leadership");
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
                this.exceptionHandler.accept(t);
                future.cancel(true); // make sure the acquire work doesn't overlap
              } finally {
                maybeReportTransition();
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
      log.error("LeaderElection acquire loop gets interrupted", e);
      return false;
    } catch (RejectedExecutionException e) {
      log.info("scheduledWorkers were closed", e);
    }finally {
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
                      maybeReportTransition();
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
        } catch (Throwable t) {
          log.error("Unexpected exception when renewing lease in the background", t);
          renewResult = false;
        } finally {
          future.cancel(true); // make the lease worker doesn't overlap
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
      log.error("LeaderElection renew loop gets interrupted", e);
    } catch (RejectedExecutionException e) {
      log.info("leaseWorkers were closed", e);
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
            0,
            config.getOwnerReference());

    // 1. obtain or create the ElectionRecord
    LeaderElectionRecord oldLeaderElectionRecord;
    try {
      oldLeaderElectionRecord = lock.get();
    } catch (ApiException e) {
      if (e.getCode() != HttpURLConnection.HTTP_NOT_FOUND) {
        log.error("Error retrieving resource lock {}", lock.describe(), e);
        return false;
      }

      if (log.isDebugEnabled()) {
        log.debug("Lock not found, try to create it");
      }

      // No Lock resource exists, try to get leadership by creating it
      return createLock(lock, leaderElectionRecord);
    }

    // alright, we have an existing lock resource
    // 1. Is Lock Empty? --> try to get leadership by updating it
    // 2. Am I the Leader? --> update info and renew lease by updating it
    // 3. I am not the Leader?
    // 3.1 is Lock expired? --> try to get leadership by updating it
    // 3.2 Lock not expired? --> update info, try later

    if (oldLeaderElectionRecord == null
        || oldLeaderElectionRecord.getAcquireTime() == null
        || oldLeaderElectionRecord.getRenewTime() == null
        || oldLeaderElectionRecord.getHolderIdentity() == null) {
      // We found the lock resource with an empty LeaderElectionRecord, try to get leadership by
      // updating it
      if (log.isDebugEnabled()) {
        log.debug("Update lock to get lease");
      }

      if (oldLeaderElectionRecord != null) {
        // maintain the leaderTransitions
        leaderElectionRecord.setLeaderTransitions(
            oldLeaderElectionRecord.getLeaderTransitions() + 1);
      }

      return updateLock(lock, leaderElectionRecord);
    }

    // 2. Record obtained with LeaderElectionRecord, check the Identity & Time
    if (!oldLeaderElectionRecord.equals(this.observedRecord)) {
      this.observedRecord = oldLeaderElectionRecord;
      this.observedTimeMilliSeconds = System.currentTimeMillis();
    }

    if (observedTimeMilliSeconds + config.getLeaseDuration().toMillis() > now.getTime()
        && !isLeader()) {
      log.debug(
          "Lock is held by {} and has not yet expired",
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

    if (log.isDebugEnabled()) {
      log.debug("Update lock to renew lease");
    }

    boolean renewalStatus = updateLock(lock, leaderElectionRecord);

    if (renewalStatus && log.isDebugEnabled()) {
      log.debug("TryAcquireOrRenew return success");
    }

    return renewalStatus;
  }

  private boolean createLock(Lock lock, LeaderElectionRecord leaderElectionRecord) {
    boolean createSuccess = lock.create(leaderElectionRecord);
    if (!createSuccess) {
      return false;
    }
    this.observedRecord = leaderElectionRecord;
    this.observedTimeMilliSeconds = System.currentTimeMillis();
    return true;
  }

  private boolean updateLock(Lock lock, LeaderElectionRecord leaderElectionRecord) {
    boolean updateSuccess = lock.update(leaderElectionRecord);
    if (!updateSuccess) {
      return false;
    }
    this.observedRecord = leaderElectionRecord;
    this.observedTimeMilliSeconds = System.currentTimeMillis();
    return true;
  }

  private boolean isLeader() {
    return this.config.getLock().identity().equals(this.observedRecord.getHolderIdentity());
  }

  private void maybeReportTransition() {
    if (this.observedRecord == null) {
      return;
    }
    if (this.observedRecord.getHolderIdentity().equals(this.reportedLeader)) {
      return;
    }
    this.reportedLeader = this.observedRecord.getHolderIdentity();

    if (this.onNewLeaderHook != null) {
      this.hookWorkers.submit(
          () -> {
            log.info(
                "LeaderElection lock is currently held by {}",
                this.observedRecord.getHolderIdentity());
            onNewLeaderHook.accept(this.reportedLeader);
          });
    }
  }

  @Override
  public void close() {
    log.info("Closing...");
    scheduledWorkers.shutdown();
    leaseWorkers.shutdown();
    hookWorkers.shutdown();

    // Ensure that all executors have stopped
    try {
      boolean isTerminated = scheduledWorkers.awaitTermination(config.getRetryPeriod().getSeconds(), TimeUnit.SECONDS);
      if (!isTerminated) {
        log.warn("Timed out waiting to terminate scheduledWorkers.");
        scheduledWorkers.shutdownNow();
      }
    } catch (InterruptedException ex) {
      log.warn("Failed to ensure scheduledWorkers termination.", ex);
      scheduledWorkers.shutdownNow();
    }
    try {
      boolean isTerminated = leaseWorkers.awaitTermination(config.getRetryPeriod().getSeconds(), TimeUnit.SECONDS);
      if (!isTerminated) {
        log.warn("Timed out waiting to terminate leaseWorkers.");
        leaseWorkers.shutdownNow();
      }
    } catch (InterruptedException ex) {
      log.warn("Failed to ensure leaseWorkers termination.", ex);
      leaseWorkers.shutdownNow();
    }
    try {
      boolean isTerminated = hookWorkers.awaitTermination(config.getRetryPeriod().getSeconds(), TimeUnit.SECONDS);
      if (!isTerminated) {
        log.warn("Timed out waiting to terminate hookWorkers.");
        hookWorkers.shutdownNow();
      }
    } catch (InterruptedException ex) {
      log.warn("Failed to ensure hookWorkers termination.", ex);
      hookWorkers.shutdownNow();
    }

    // If I am the leader, free the lock so that other candidates can take it immediately
    if (observedRecord != null && isLeader()) {
      log.info("Giving up the lock....");
      LeaderElectionRecord emptyRecord = new LeaderElectionRecord();
      // maintain leaderTransitions count
      emptyRecord.setLeaderTransitions(observedRecord.getLeaderTransitions());
      // LeaseLock impl requires a non-zero value for leaseDuration
      emptyRecord.setLeaseDurationSeconds(
          Long.valueOf(config.getLeaseDuration().getSeconds()).intValue());
      boolean status = this.config.getLock().update(emptyRecord);

      if (!status) {
        log.warn("Failed to give up the lock.");
      }
    }

    log.info("Closed");
  }
}
