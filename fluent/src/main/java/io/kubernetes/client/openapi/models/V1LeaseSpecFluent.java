package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LeaseSpecFluent<A extends V1LeaseSpecFluent<A>> extends BaseFluent<A>{
  public V1LeaseSpecFluent() {
  }
  
  public V1LeaseSpecFluent(V1LeaseSpec instance) {
    this.copyInstance(instance);
  }
  private OffsetDateTime acquireTime;
  private String holderIdentity;
  private Integer leaseDurationSeconds;
  private Integer leaseTransitions;
  private OffsetDateTime renewTime;
  
  protected void copyInstance(V1LeaseSpec instance) {
    instance = (instance != null ? instance : new V1LeaseSpec());
    if (instance != null) {
          this.withAcquireTime(instance.getAcquireTime());
          this.withHolderIdentity(instance.getHolderIdentity());
          this.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());
          this.withLeaseTransitions(instance.getLeaseTransitions());
          this.withRenewTime(instance.getRenewTime());
        }
  }
  
  public OffsetDateTime getAcquireTime() {
    return this.acquireTime;
  }
  
  public A withAcquireTime(OffsetDateTime acquireTime) {
    this.acquireTime = acquireTime;
    return (A) this;
  }
  
  public boolean hasAcquireTime() {
    return this.acquireTime != null;
  }
  
  public String getHolderIdentity() {
    return this.holderIdentity;
  }
  
  public A withHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
    return (A) this;
  }
  
  public boolean hasHolderIdentity() {
    return this.holderIdentity != null;
  }
  
  public Integer getLeaseDurationSeconds() {
    return this.leaseDurationSeconds;
  }
  
  public A withLeaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
    return (A) this;
  }
  
  public boolean hasLeaseDurationSeconds() {
    return this.leaseDurationSeconds != null;
  }
  
  public Integer getLeaseTransitions() {
    return this.leaseTransitions;
  }
  
  public A withLeaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
    return (A) this;
  }
  
  public boolean hasLeaseTransitions() {
    return this.leaseTransitions != null;
  }
  
  public OffsetDateTime getRenewTime() {
    return this.renewTime;
  }
  
  public A withRenewTime(OffsetDateTime renewTime) {
    this.renewTime = renewTime;
    return (A) this;
  }
  
  public boolean hasRenewTime() {
    return this.renewTime != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1LeaseSpecFluent that = (V1LeaseSpecFluent) o;
    if (!java.util.Objects.equals(acquireTime, that.acquireTime)) return false;
    if (!java.util.Objects.equals(holderIdentity, that.holderIdentity)) return false;
    if (!java.util.Objects.equals(leaseDurationSeconds, that.leaseDurationSeconds)) return false;
    if (!java.util.Objects.equals(leaseTransitions, that.leaseTransitions)) return false;
    if (!java.util.Objects.equals(renewTime, that.renewTime)) return false;
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