package io.kubernetes.client.leaderelection;

import io.kubernetes.client.leaderelection.resourcelock.Lock;


public class LeaderElectionConfig {

  /**
   * Lock is the resource that will be used for locking
   */
  private Lock lock;
  /**
   * LeaseDuration is the duration that non-leader candidates will wait to force acquire leadership.
   * This is measured against time of last observed ack.
   */
  private long leaseDuration;
  /**
   * RenewDeadline is the duration that the acting master will retry refreshing leadership before
   * giving up.
   */
  private long renewDeadline;
  /**
   * RetryPeriod is the duration the LeaderElector clients should wait between tries of actions.
   */
  private long retryPeriod;
  /**
   * Callbacks are callbacks that are triggered during certain lifecycle events of the
   * LeaderElector
   */
  private LeaderCallbacks callbacks;
  /**
   * ReleaseOnCancel should be set true if the lock should be released when the run context is
   * cancelled. If you set this to true, you must ensure all code guarded by this lease has
   * successfully completed prior to cancelling the context, or you may have two processes
   * simultaneously acting on the critical path.
   */
  private boolean releaseOnCancel;
  /**
   * Name is the name of the resource lock for debugging
   */
  private String name;

  public LeaderElectionConfig(
      Lock lock, long leaseDuration, long renewDeadline, long retryPeriod,
      LeaderCallbacks callbacks,
      boolean releaseOnCancel, String name) {
    this.lock = lock;
    this.leaseDuration = leaseDuration;
    this.renewDeadline = renewDeadline;
    this.retryPeriod = retryPeriod;
    this.callbacks = callbacks;
    this.releaseOnCancel = releaseOnCancel;
    this.name = name;
  }

  /**
   * Lock is the resource that will be used for locking
   */
  public Lock getLock() {
    return lock;
  }

  public void setLock(Lock lock) {
    this.lock = lock;
  }

  /**
   * LeaseDuration is the duration that non-leader candidates will wait to force acquire leadership.
   * This is measured against time of last observed ack.
   */
  public long getLeaseDuration() {
    return leaseDuration;
  }

  public void setLeaseDuration(long leaseDuration) {
    this.leaseDuration = leaseDuration;
  }

  /**
   * RenewDeadline is the duration that the acting master will retry refreshing leadership before
   * giving up.
   */
  public long getRenewDeadline() {
    return renewDeadline;
  }

  public void setRenewDeadline(long renewDeadline) {
    this.renewDeadline = renewDeadline;
  }

  /**
   * RetryPeriod is the duration the LeaderElector clients should wait between tries of actions.
   */
  public long getRetryPeriod() {
    return retryPeriod;
  }

  public void setRetryPeriod(long retryPeriod) {
    this.retryPeriod = retryPeriod;
  }

  /**
   * ReleaseOnCancel should be set true if the lock should be released when the run context is
   * cancelled. If you set this to true, you must ensure all code guarded by this lease has
   * successfully completed prior to cancelling the context, or you may have two processes
   * simultaneously acting on the critical path.
   */
  public boolean isReleaseOnCancel() {
    return releaseOnCancel;
  }

  public void setReleaseOnCancel(boolean releaseOnCancel) {
    this.releaseOnCancel = releaseOnCancel;
  }

  /**
   * Name is the name of the resource lock for debugging
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Callbacks are callbacks that are triggered during certain lifecycle events of the
   * LeaderElector
   */
  public LeaderCallbacks getCallbacks() {
    return callbacks;
  }

  public void setCallbacks(LeaderCallbacks callbacks) {
    this.callbacks = callbacks;
  }
}
