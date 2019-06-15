package io.kubernetes.client.extended.leaderelection;

import java.time.Duration;

public class LeaderElectionConfig {

  private Lock lock;

  private Duration leaseDuration;

  private Duration renewDeadline;

  private Duration retryPeriod;

  public LeaderElectionConfig() {}

  public LeaderElectionConfig(
      Lock lock, Duration leaseDuration, Duration renewDeadline, Duration retryPeriod) {
    this.lock = lock;
    this.leaseDuration = leaseDuration;
    this.renewDeadline = renewDeadline;
    this.retryPeriod = retryPeriod;
  }

  public Lock getLock() {
    return lock;
  }

  public void setLock(Lock lock) {
    this.lock = lock;
  }

  public Duration getLeaseDuration() {
    return leaseDuration;
  }

  public void setLeaseDuration(Duration leaseDuration) {
    this.leaseDuration = leaseDuration;
  }

  public Duration getRenewDeadline() {
    return renewDeadline;
  }

  public void setRenewDeadline(Duration renewDeadline) {
    this.renewDeadline = renewDeadline;
  }

  public Duration getRetryPeriod() {
    return retryPeriod;
  }

  public void setRetryPeriod(Duration retryPeriod) {
    this.retryPeriod = retryPeriod;
  }
}
