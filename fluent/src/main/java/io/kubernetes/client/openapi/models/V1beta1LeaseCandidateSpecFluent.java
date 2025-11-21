package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
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
public class V1beta1LeaseCandidateSpecFluent<A extends io.kubernetes.client.openapi.models.V1beta1LeaseCandidateSpecFluent<A>> extends BaseFluent<A>{

  private String binaryVersion;
  private String emulationVersion;
  private String leaseName;
  private OffsetDateTime pingTime;
  private OffsetDateTime renewTime;
  private String strategy;

  public V1beta1LeaseCandidateSpecFluent() {
  }
  
  public V1beta1LeaseCandidateSpecFluent(V1beta1LeaseCandidateSpec instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta1LeaseCandidateSpec instance) {
    instance = instance != null ? instance : new V1beta1LeaseCandidateSpec();
    if (instance != null) {
        this.withBinaryVersion(instance.getBinaryVersion());
        this.withEmulationVersion(instance.getEmulationVersion());
        this.withLeaseName(instance.getLeaseName());
        this.withPingTime(instance.getPingTime());
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
    V1beta1LeaseCandidateSpecFluent that = (V1beta1LeaseCandidateSpecFluent) o;
    if (!(Objects.equals(binaryVersion, that.binaryVersion))) {
      return false;
    }
    if (!(Objects.equals(emulationVersion, that.emulationVersion))) {
      return false;
    }
    if (!(Objects.equals(leaseName, that.leaseName))) {
      return false;
    }
    if (!(Objects.equals(pingTime, that.pingTime))) {
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
  
  public String getBinaryVersion() {
    return this.binaryVersion;
  }
  
  public String getEmulationVersion() {
    return this.emulationVersion;
  }
  
  public String getLeaseName() {
    return this.leaseName;
  }
  
  public OffsetDateTime getPingTime() {
    return this.pingTime;
  }
  
  public OffsetDateTime getRenewTime() {
    return this.renewTime;
  }
  
  public String getStrategy() {
    return this.strategy;
  }
  
  public boolean hasBinaryVersion() {
    return this.binaryVersion != null;
  }
  
  public boolean hasEmulationVersion() {
    return this.emulationVersion != null;
  }
  
  public boolean hasLeaseName() {
    return this.leaseName != null;
  }
  
  public boolean hasPingTime() {
    return this.pingTime != null;
  }
  
  public boolean hasRenewTime() {
    return this.renewTime != null;
  }
  
  public boolean hasStrategy() {
    return this.strategy != null;
  }
  
  public int hashCode() {
    return Objects.hash(binaryVersion, emulationVersion, leaseName, pingTime, renewTime, strategy);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(binaryVersion == null)) {
        sb.append("binaryVersion:");
        sb.append(binaryVersion);
        sb.append(",");
    }
    if (!(emulationVersion == null)) {
        sb.append("emulationVersion:");
        sb.append(emulationVersion);
        sb.append(",");
    }
    if (!(leaseName == null)) {
        sb.append("leaseName:");
        sb.append(leaseName);
        sb.append(",");
    }
    if (!(pingTime == null)) {
        sb.append("pingTime:");
        sb.append(pingTime);
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
  
  public A withBinaryVersion(String binaryVersion) {
    this.binaryVersion = binaryVersion;
    return (A) this;
  }
  
  public A withEmulationVersion(String emulationVersion) {
    this.emulationVersion = emulationVersion;
    return (A) this;
  }
  
  public A withLeaseName(String leaseName) {
    this.leaseName = leaseName;
    return (A) this;
  }
  
  public A withPingTime(OffsetDateTime pingTime) {
    this.pingTime = pingTime;
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