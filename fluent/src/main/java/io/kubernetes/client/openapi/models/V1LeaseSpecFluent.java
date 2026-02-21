package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1LeaseSpecFluent<A extends io.kubernetes.client.openapi.models.V1LeaseSpecFluent<A>> extends BaseFluent<A>{

  private OffsetDateTime acquireTime;
  private String holderIdentity;
  private Integer leaseDurationSeconds;
  private Integer leaseTransitions;
  private String preferredHolder;
  private OffsetDateTime renewTime;
  private String strategy;

  public V1LeaseSpecFluent() {
  }
  
  public V1LeaseSpecFluent(V1LeaseSpec instance) {
    this.copyInstance(instance);
  }

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
  
  public OffsetDateTime getAcquireTime() {
    return this.acquireTime;
  }
  
  public String getHolderIdentity() {
    return this.holderIdentity;
  }
  
  public Integer getLeaseDurationSeconds() {
    return this.leaseDurationSeconds;
  }
  
  public Integer getLeaseTransitions() {
    return this.leaseTransitions;
  }
  
  public String getPreferredHolder() {
    return this.preferredHolder;
  }
  
  public OffsetDateTime getRenewTime() {
    return this.renewTime;
  }
  
  public String getStrategy() {
    return this.strategy;
  }
  
  public boolean hasAcquireTime() {
    return this.acquireTime != null;
  }
  
  public boolean hasHolderIdentity() {
    return this.holderIdentity != null;
  }
  
  public boolean hasLeaseDurationSeconds() {
    return this.leaseDurationSeconds != null;
  }
  
  public boolean hasLeaseTransitions() {
    return this.leaseTransitions != null;
  }
  
  public boolean hasPreferredHolder() {
    return this.preferredHolder != null;
  }
  
  public boolean hasRenewTime() {
    return this.renewTime != null;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
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
  
  public A withAcquireTime(OffsetDateTime acquireTime) {
    this.acquireTime = acquireTime;
    return (A) this;
  }
  
  public A withHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
    return (A) this;
  }
  
  public A withLeaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
    return (A) this;
  }
  
  public A withLeaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
    return (A) this;
  }
  
  public A withPreferredHolder(String preferredHolder) {
    this.preferredHolder = preferredHolder;
    return (A) this;
  }
  
  public A withRenewTime(OffsetDateTime renewTime) {
    this.renewTime = renewTime;
    return (A) this;
  }
  
  public A withStrategy(String strategy) {
    this.strategy = strategy;
    return (A) this;
  }
  
}