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

import io.kubernetes.client.openapi.models.V1OwnerReference;
import java.util.Date;

public class LeaderElectionRecord {

  private String holderIdentity;

  private int leaseDurationSeconds;

  private Date acquireTime;

  private Date renewTime;

  private int leaderTransitions;

  private V1OwnerReference ownerReference;

  public LeaderElectionRecord() {}

  public LeaderElectionRecord(
      String holderIdentity,
      int leaseDurationSeconds,
      Date acquireTime,
      Date renewTime,
      int leaderTransitions) {
    this(holderIdentity, leaseDurationSeconds, acquireTime, renewTime, leaderTransitions, null);
  }

  public LeaderElectionRecord(
      String holderIdentity,
      int leaseDurationSeconds,
      Date acquireTime,
      Date renewTime,
      int leaderTransitions,
      V1OwnerReference ownerReference) {
    this.holderIdentity = holderIdentity;
    this.leaseDurationSeconds = leaseDurationSeconds;
    this.acquireTime = acquireTime;
    this.renewTime = renewTime;
    this.leaderTransitions = leaderTransitions;
    this.ownerReference = ownerReference;
  }

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

  public Date getAcquireTime() {
    return acquireTime;
  }

  public void setAcquireTime(Date acquireTime) {
    this.acquireTime = acquireTime;
  }

  public Date getRenewTime() {
    return renewTime;
  }

  public void setRenewTime(Date renewTime) {
    this.renewTime = renewTime;
  }

  public int getLeaderTransitions() {
    return leaderTransitions;
  }

  public void setLeaderTransitions(int leaderTransitions) {
    this.leaderTransitions = leaderTransitions;
  }

  public V1OwnerReference getOwnerReference() {
    return ownerReference;
  }

  public void setOwnerReference(V1OwnerReference ownerReference) {
    this.ownerReference = ownerReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof LeaderElectionRecord)) return false;

    LeaderElectionRecord that = (LeaderElectionRecord) o;

    if (leaseDurationSeconds != that.leaseDurationSeconds) return false;
    if (leaderTransitions != that.leaderTransitions) return false;
    if (holderIdentity == null) {
      if (that.holderIdentity != null) return false;
    } else {
      if (!holderIdentity.equals(that.holderIdentity)) return false;
    }
    if (ownerReference == null) {
      if (that.ownerReference != null) return false;
    } else {
      if (!ownerReference.equals(that.ownerReference)) return false;
    }
    if (acquireTime == null) {
      if (that.acquireTime != null) return false;
    } else {
      if (!acquireTime.equals(that.acquireTime)) return false;
    }
    if (renewTime == null) {
      return that.holderIdentity == null;
    }
    return renewTime.equals(that.renewTime);
  }
}
