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
import java.time.Duration;

public class LeaderElectionConfig {

  private Lock lock;

  private Duration leaseDuration;

  private Duration renewDeadline;

  private Duration retryPeriod;

  private V1OwnerReference ownerReference;

  public LeaderElectionConfig() {}

  public LeaderElectionConfig(
      Lock lock, Duration leaseDuration, Duration renewDeadline, Duration retryPeriod) {
    this(lock, leaseDuration, renewDeadline, retryPeriod, null);
  }

  public LeaderElectionConfig(
      Lock lock,
      Duration leaseDuration,
      Duration renewDeadline,
      Duration retryPeriod,
      V1OwnerReference ownerReference) {
    this.lock = lock;
    this.leaseDuration = leaseDuration;
    this.renewDeadline = renewDeadline;
    this.retryPeriod = retryPeriod;
    this.ownerReference = ownerReference;
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

  public V1OwnerReference getOwnerReference() {
    return ownerReference;
  }

  public void setOwnerReference(V1OwnerReference ownerReference) {
    this.ownerReference = ownerReference;
  }
}
