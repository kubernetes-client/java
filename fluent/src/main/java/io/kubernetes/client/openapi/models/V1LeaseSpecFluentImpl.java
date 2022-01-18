/*
Copyright 2022 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

/** Generated */
public class V1LeaseSpecFluentImpl<
        A extends io.kubernetes.client.openapi.models.V1LeaseSpecFluent<A>>
    extends io.kubernetes.client.fluent.BaseFluent<A>
    implements io.kubernetes.client.openapi.models.V1LeaseSpecFluent<A> {
  public V1LeaseSpecFluentImpl() {}

  public V1LeaseSpecFluentImpl(io.kubernetes.client.openapi.models.V1LeaseSpec instance) {
    this.withAcquireTime(instance.getAcquireTime());

    this.withHolderIdentity(instance.getHolderIdentity());

    this.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());

    this.withLeaseTransitions(instance.getLeaseTransitions());

    this.withRenewTime(instance.getRenewTime());
  }

  private java.time.OffsetDateTime acquireTime;
  private java.lang.String holderIdentity;
  private java.lang.Integer leaseDurationSeconds;
  private java.lang.Integer leaseTransitions;
  private java.time.OffsetDateTime renewTime;

  public java.time.OffsetDateTime getAcquireTime() {
    return this.acquireTime;
  }

  public A withAcquireTime(java.time.OffsetDateTime acquireTime) {
    this.acquireTime = acquireTime;
    return (A) this;
  }

  public java.lang.Boolean hasAcquireTime() {
    return this.acquireTime != null;
  }

  public java.lang.String getHolderIdentity() {
    return this.holderIdentity;
  }

  public A withHolderIdentity(java.lang.String holderIdentity) {
    this.holderIdentity = holderIdentity;
    return (A) this;
  }

  public java.lang.Boolean hasHolderIdentity() {
    return this.holderIdentity != null;
  }

  /** Method is deprecated. use withHolderIdentity instead. */
  @java.lang.Deprecated
  public A withNewHolderIdentity(java.lang.String original) {
    return (A) withHolderIdentity(new String(original));
  }

  public java.lang.Integer getLeaseDurationSeconds() {
    return this.leaseDurationSeconds;
  }

  public A withLeaseDurationSeconds(java.lang.Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
    return (A) this;
  }

  public java.lang.Boolean hasLeaseDurationSeconds() {
    return this.leaseDurationSeconds != null;
  }

  public java.lang.Integer getLeaseTransitions() {
    return this.leaseTransitions;
  }

  public A withLeaseTransitions(java.lang.Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
    return (A) this;
  }

  public java.lang.Boolean hasLeaseTransitions() {
    return this.leaseTransitions != null;
  }

  public java.time.OffsetDateTime getRenewTime() {
    return this.renewTime;
  }

  public A withRenewTime(java.time.OffsetDateTime renewTime) {
    this.renewTime = renewTime;
    return (A) this;
  }

  public java.lang.Boolean hasRenewTime() {
    return this.renewTime != null;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LeaseSpecFluentImpl that = (V1LeaseSpecFluentImpl) o;
    if (acquireTime != null ? !acquireTime.equals(that.acquireTime) : that.acquireTime != null)
      return false;
    if (holderIdentity != null
        ? !holderIdentity.equals(that.holderIdentity)
        : that.holderIdentity != null) return false;
    if (leaseDurationSeconds != null
        ? !leaseDurationSeconds.equals(that.leaseDurationSeconds)
        : that.leaseDurationSeconds != null) return false;
    if (leaseTransitions != null
        ? !leaseTransitions.equals(that.leaseTransitions)
        : that.leaseTransitions != null) return false;
    if (renewTime != null ? !renewTime.equals(that.renewTime) : that.renewTime != null)
      return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(
        acquireTime,
        holderIdentity,
        leaseDurationSeconds,
        leaseTransitions,
        renewTime,
        super.hashCode());
  }
}
