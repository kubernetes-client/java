package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1LeaseSpecFluentImpl<A extends V1LeaseSpecFluent<A>> extends BaseFluent<A> implements V1LeaseSpecFluent<A>{
  public V1LeaseSpecFluentImpl() {
  }
  public V1LeaseSpecFluentImpl(V1LeaseSpec instance) {
    this.withAcquireTime(instance.getAcquireTime());

    this.withHolderIdentity(instance.getHolderIdentity());

    this.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());

    this.withLeaseTransitions(instance.getLeaseTransitions());

    this.withRenewTime(instance.getRenewTime());

  }
  private OffsetDateTime acquireTime;
  private String holderIdentity;
  private Integer leaseDurationSeconds;
  private Integer leaseTransitions;
  private OffsetDateTime renewTime;
  public OffsetDateTime getAcquireTime() {
    return this.acquireTime;
  }
  public A withAcquireTime(OffsetDateTime acquireTime) {
    this.acquireTime=acquireTime; return (A) this;
  }
  public Boolean hasAcquireTime() {
    return this.acquireTime != null;
  }
  public String getHolderIdentity() {
    return this.holderIdentity;
  }
  public A withHolderIdentity(String holderIdentity) {
    this.holderIdentity=holderIdentity; return (A) this;
  }
  public Boolean hasHolderIdentity() {
    return this.holderIdentity != null;
  }
  public Integer getLeaseDurationSeconds() {
    return this.leaseDurationSeconds;
  }
  public A withLeaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds=leaseDurationSeconds; return (A) this;
  }
  public Boolean hasLeaseDurationSeconds() {
    return this.leaseDurationSeconds != null;
  }
  public Integer getLeaseTransitions() {
    return this.leaseTransitions;
  }
  public A withLeaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions=leaseTransitions; return (A) this;
  }
  public Boolean hasLeaseTransitions() {
    return this.leaseTransitions != null;
  }
  public OffsetDateTime getRenewTime() {
    return this.renewTime;
  }
  public A withRenewTime(OffsetDateTime renewTime) {
    this.renewTime=renewTime; return (A) this;
  }
  public Boolean hasRenewTime() {
    return this.renewTime != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1LeaseSpecFluentImpl that = (V1LeaseSpecFluentImpl) o;
    if (acquireTime != null ? !acquireTime.equals(that.acquireTime) :that.acquireTime != null) return false;
    if (holderIdentity != null ? !holderIdentity.equals(that.holderIdentity) :that.holderIdentity != null) return false;
    if (leaseDurationSeconds != null ? !leaseDurationSeconds.equals(that.leaseDurationSeconds) :that.leaseDurationSeconds != null) return false;
    if (leaseTransitions != null ? !leaseTransitions.equals(that.leaseTransitions) :that.leaseTransitions != null) return false;
    if (renewTime != null ? !renewTime.equals(that.renewTime) :that.renewTime != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(acquireTime,  holderIdentity,  leaseDurationSeconds,  leaseTransitions,  renewTime,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (acquireTime != null) { sb.append("acquireTime:"); sb.append(acquireTime + ","); }
    if (holderIdentity != null) { sb.append("holderIdentity:"); sb.append(holderIdentity + ","); }
    if (leaseDurationSeconds != null) { sb.append("leaseDurationSeconds:"); sb.append(leaseDurationSeconds + ","); }
    if (leaseTransitions != null) { sb.append("leaseTransitions:"); sb.append(leaseTransitions + ","); }
    if (renewTime != null) { sb.append("renewTime:"); sb.append(renewTime); }
    sb.append("}");
    return sb.toString();
  }
  
}