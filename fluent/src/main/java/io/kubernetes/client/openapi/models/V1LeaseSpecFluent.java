package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.StringBuilder;
import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LeaseSpecFluent<A extends io.kubernetes.client.openapi.models.V1LeaseSpecFluent<A>> extends BaseFluent<A>{
  public V1LeaseSpecFluent() {
  }
  
  public V1LeaseSpecFluent(V1LeaseSpec instance) {
    this.copyInstance(instance);
  }
  private OffsetDateTime acquireTime;
  private String holderIdentity;
  private Integer leaseDurationSeconds;
  private Integer leaseTransitions;
  private String preferredHolder;
  private OffsetDateTime renewTime;
  private String strategy;
  
  protected void copyInstance(V1LeaseSpec instance) {
    instance = instance != null ? instance : new V1LeaseSpec();
    if (instance != null) {
        this.withAcquireTime(instance.getAcquireTime());
        this.withHolderIdentity(instance.getHolderIdentity());
        this.withLeaseDurationSeconds(instance.getLeaseDurationSeconds());
        this.withLeaseTransitions(instance.getLeaseTransitions());
        this.withPreferredHolder(instance.getPreferredHolder());
        this.withRenewTime(instance.getRenewTime());
        this.withStrategy(instance.getStrategy());
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
  
  public String getPreferredHolder() {
    return this.preferredHolder;
  }
  
  public A withPreferredHolder(String preferredHolder) {
    this.preferredHolder = preferredHolder;
    return (A) this;
  }
  
  public boolean hasPreferredHolder() {
    return this.preferredHolder != null;
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
  
  public String getStrategy() {
    return this.strategy;
  }
  
  public A withStrategy(String strategy) {
    this.strategy = strategy;
    return (A) this;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1LeaseSpecFluent that = (V1LeaseSpecFluent) o;
    if (!(Objects.equals(acquireTime, that.acquireTime))) {
      return false;
    }
    if (!(Objects.equals(holderIdentity, that.holderIdentity))) {
      return false;
    }
    if (!(Objects.equals(leaseDurationSeconds, that.leaseDurationSeconds))) {
      return false;
    }
    if (!(Objects.equals(leaseTransitions, that.leaseTransitions))) {
      return false;
    }
    if (!(Objects.equals(preferredHolder, that.preferredHolder))) {
      return false;
    }
    if (!(Objects.equals(renewTime, that.renewTime))) {
      return false;
    }
    if (!(Objects.equals(strategy, that.strategy))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, preferredHolder, renewTime, strategy);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(acquireTime == null)) {
        sb.append("acquireTime:");
        sb.append(acquireTime);
        sb.append(",");
    }
    if (!(holderIdentity == null)) {
        sb.append("holderIdentity:");
        sb.append(holderIdentity);
        sb.append(",");
    }
    if (!(leaseDurationSeconds == null)) {
        sb.append("leaseDurationSeconds:");
        sb.append(leaseDurationSeconds);
        sb.append(",");
    }
    if (!(leaseTransitions == null)) {
        sb.append("leaseTransitions:");
        sb.append(leaseTransitions);
        sb.append(",");
    }
    if (!(preferredHolder == null)) {
        sb.append("preferredHolder:");
        sb.append(preferredHolder);
        sb.append(",");
    }
    if (!(renewTime == null)) {
        sb.append("renewTime:");
        sb.append(renewTime);
        sb.append(",");
    }
    if (!(strategy == null)) {
        sb.append("strategy:");
        sb.append(strategy);
    }
    sb.append("}");
    return sb.toString();
  }
  

}