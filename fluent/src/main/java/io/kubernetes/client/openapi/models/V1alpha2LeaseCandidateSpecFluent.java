package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha2LeaseCandidateSpecFluent<A extends V1alpha2LeaseCandidateSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha2LeaseCandidateSpecFluent() {
  }
  
  public V1alpha2LeaseCandidateSpecFluent(V1alpha2LeaseCandidateSpec instance) {
    this.copyInstance(instance);
  }
  private String binaryVersion;
  private String emulationVersion;
  private String leaseName;
  private OffsetDateTime pingTime;
  private OffsetDateTime renewTime;
  private String strategy;
  
  protected void copyInstance(V1alpha2LeaseCandidateSpec instance) {
    instance = (instance != null ? instance : new V1alpha2LeaseCandidateSpec());
    if (instance != null) {
          this.withBinaryVersion(instance.getBinaryVersion());
          this.withEmulationVersion(instance.getEmulationVersion());
          this.withLeaseName(instance.getLeaseName());
          this.withPingTime(instance.getPingTime());
          this.withRenewTime(instance.getRenewTime());
          this.withStrategy(instance.getStrategy());
        }
  }
  
  public String getBinaryVersion() {
    return this.binaryVersion;
  }
  
  public A withBinaryVersion(String binaryVersion) {
    this.binaryVersion = binaryVersion;
    return (A) this;
  }
  
  public boolean hasBinaryVersion() {
    return this.binaryVersion != null;
  }
  
  public String getEmulationVersion() {
    return this.emulationVersion;
  }
  
  public A withEmulationVersion(String emulationVersion) {
    this.emulationVersion = emulationVersion;
    return (A) this;
  }
  
  public boolean hasEmulationVersion() {
    return this.emulationVersion != null;
  }
  
  public String getLeaseName() {
    return this.leaseName;
  }
  
  public A withLeaseName(String leaseName) {
    this.leaseName = leaseName;
    return (A) this;
  }
  
  public boolean hasLeaseName() {
    return this.leaseName != null;
  }
  
  public OffsetDateTime getPingTime() {
    return this.pingTime;
  }
  
  public A withPingTime(OffsetDateTime pingTime) {
    this.pingTime = pingTime;
    return (A) this;
  }
  
  public boolean hasPingTime() {
    return this.pingTime != null;
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
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha2LeaseCandidateSpecFluent that = (V1alpha2LeaseCandidateSpecFluent) o;
    if (!java.util.Objects.equals(binaryVersion, that.binaryVersion)) return false;
    if (!java.util.Objects.equals(emulationVersion, that.emulationVersion)) return false;
    if (!java.util.Objects.equals(leaseName, that.leaseName)) return false;
    if (!java.util.Objects.equals(pingTime, that.pingTime)) return false;
    if (!java.util.Objects.equals(renewTime, that.renewTime)) return false;
    if (!java.util.Objects.equals(strategy, that.strategy)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(binaryVersion,  emulationVersion,  leaseName,  pingTime,  renewTime,  strategy,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (binaryVersion != null) { sb.append("binaryVersion:"); sb.append(binaryVersion + ","); }
    if (emulationVersion != null) { sb.append("emulationVersion:"); sb.append(emulationVersion + ","); }
    if (leaseName != null) { sb.append("leaseName:"); sb.append(leaseName + ","); }
    if (pingTime != null) { sb.append("pingTime:"); sb.append(pingTime + ","); }
    if (renewTime != null) { sb.append("renewTime:"); sb.append(renewTime + ","); }
    if (strategy != null) { sb.append("strategy:"); sb.append(strategy); }
    sb.append("}");
    return sb.toString();
  }
  

}