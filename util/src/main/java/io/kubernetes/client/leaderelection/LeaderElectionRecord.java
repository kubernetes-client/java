package io.kubernetes.client.leaderelection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * LeaderElectionRecord is the record that is stored in the leader election annotation. This
 * information should be used for observational purposes only and could be replaced with a random
 * string (e.g. UUID) with only slight modification of this code.
 */
public class LeaderElectionRecord {

  private static SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd'T'HH:mm:ss'Z'");

  /**
   * HolderIdentity is the ID that owns the lease. If empty, no one owns this lease and all callers
   * may acquire. Versions of this library prior to Kubernetes 1.14 will not attempt to acquire
   * leases with empty identities and will wait for the full lease interval to expire before
   * attempting to reacquire. This value is set to empty when a client voluntarily steps down.
   */
  private String holderIdentity;
  private int leaseDurationSeconds;
  private String acquireTime;
  private String renewTime;
  private int leaderTransitions = 0;

  public LeaderElectionRecord() {
  }

  public LeaderElectionRecord(String holderIdentity, int leaseDurationSeconds, String acquireTime,
      String renewTime) {
    dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

    this.holderIdentity = holderIdentity;
    this.leaseDurationSeconds = leaseDurationSeconds;
    this.acquireTime = acquireTime;
    this.renewTime = renewTime;
  }

  public LeaderElectionRecord(String holderIdentity, int leaseDurationSeconds, long acquireTime,
      long renewTime) {
    dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

    this.holderIdentity = holderIdentity;
    this.leaseDurationSeconds = leaseDurationSeconds;
    setAcquireTime(acquireTime);
    setRenewTime(renewTime);
  }

  @Override
  public String toString() {
    return String.format(
        "LeaderElectionRecord<HolderIdentity=%s,LeaseDurationSeconds=%s,AcquireTime=%s,RenewTime=%s>",
        holderIdentity, leaseDurationSeconds, acquireTime, renewTime);
  }

  @Override
  public int hashCode() {
    return toString().hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof LeaderElectionRecord && obj.hashCode() == hashCode();
  }

  /**
   * HolderIdentity is the ID that owns the lease. If empty, no one owns this lease and all callers
   * may acquire. Versions of this library prior to Kubernetes 1.14 will not attempt to acquire
   * leases with empty identities and will wait for the full lease interval to expire before
   * attempting to reacquire. This value is set to empty when a client voluntarily steps down.
   */
  public String getHolderIdentity() {
    return holderIdentity;
  }

  public void setHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
  }

  public int getLeaseDurationSeconds() {
    return leaseDurationSeconds;
  }

  public void setLeaseDurationSeconds(int leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
  }

  public String getAcquireTime() {
    return acquireTime;
  }

  public void setAcquireTime(String acquireTime) {
    this.acquireTime = acquireTime;
  }

  public void setAcquireTime(long acquireTime) {
    this.acquireTime = dateFormat.format(new Date(acquireTime));
  }

  public String getRenewTime() {
    return renewTime;
  }

  public void setRenewTime(String renewTime) {
    this.renewTime = renewTime;
  }

  public void setRenewTime(long renewTime) {
    this.renewTime = dateFormat.format(new Date(renewTime));
  }

  public int getLeaderTransitions() {
    return leaderTransitions;
  }

  public void setLeaderTransitions(int leaderTransitions) {
    this.leaderTransitions = leaderTransitions;
  }
}
