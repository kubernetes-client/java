package io.kubernetes.client.openapi.models;

import java.time.OffsetDateTime;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.util.function.Predicate;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1LeaseCandidateSpecFluent<A extends V1alpha1LeaseCandidateSpecFluent<A>> extends BaseFluent<A>{
  public V1alpha1LeaseCandidateSpecFluent() {
  }
  
  public V1alpha1LeaseCandidateSpecFluent(V1alpha1LeaseCandidateSpec instance) {
    this.copyInstance(instance);
  }
  private String binaryVersion;
  private String emulationVersion;
  private String leaseName;
  private OffsetDateTime pingTime;
  private List<String> preferredStrategies;
  private OffsetDateTime renewTime;
  
  protected void copyInstance(V1alpha1LeaseCandidateSpec instance) {
    instance = (instance != null ? instance : new V1alpha1LeaseCandidateSpec());
    if (instance != null) {
          this.withBinaryVersion(instance.getBinaryVersion());
          this.withEmulationVersion(instance.getEmulationVersion());
          this.withLeaseName(instance.getLeaseName());
          this.withPingTime(instance.getPingTime());
          this.withPreferredStrategies(instance.getPreferredStrategies());
          this.withRenewTime(instance.getRenewTime());
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
  
  public A addToPreferredStrategies(int index,String item) {
    if (this.preferredStrategies == null) {this.preferredStrategies = new ArrayList<String>();}
    this.preferredStrategies.add(index, item);
    return (A)this;
  }
  
  public A setToPreferredStrategies(int index,String item) {
    if (this.preferredStrategies == null) {this.preferredStrategies = new ArrayList<String>();}
    this.preferredStrategies.set(index, item); return (A)this;
  }
  
  public A addToPreferredStrategies(java.lang.String... items) {
    if (this.preferredStrategies == null) {this.preferredStrategies = new ArrayList<String>();}
    for (String item : items) {this.preferredStrategies.add(item);} return (A)this;
  }
  
  public A addAllToPreferredStrategies(Collection<String> items) {
    if (this.preferredStrategies == null) {this.preferredStrategies = new ArrayList<String>();}
    for (String item : items) {this.preferredStrategies.add(item);} return (A)this;
  }
  
  public A removeFromPreferredStrategies(java.lang.String... items) {
    if (this.preferredStrategies == null) return (A)this;
    for (String item : items) { this.preferredStrategies.remove(item);} return (A)this;
  }
  
  public A removeAllFromPreferredStrategies(Collection<String> items) {
    if (this.preferredStrategies == null) return (A)this;
    for (String item : items) { this.preferredStrategies.remove(item);} return (A)this;
  }
  
  public List<String> getPreferredStrategies() {
    return this.preferredStrategies;
  }
  
  public String getPreferredStrategy(int index) {
    return this.preferredStrategies.get(index);
  }
  
  public String getFirstPreferredStrategy() {
    return this.preferredStrategies.get(0);
  }
  
  public String getLastPreferredStrategy() {
    return this.preferredStrategies.get(preferredStrategies.size() - 1);
  }
  
  public String getMatchingPreferredStrategy(Predicate<String> predicate) {
      for (String item : preferredStrategies) {
        if (predicate.test(item)) {
          return item;
        }
      }
      return null;
  }
  
  public boolean hasMatchingPreferredStrategy(Predicate<String> predicate) {
      for (String item : preferredStrategies) {
        if (predicate.test(item)) {
          return true;
        }
      }
      return false;
  }
  
  public A withPreferredStrategies(List<String> preferredStrategies) {
    if (preferredStrategies != null) {
        this.preferredStrategies = new ArrayList();
        for (String item : preferredStrategies) {
          this.addToPreferredStrategies(item);
        }
    } else {
      this.preferredStrategies = null;
    }
    return (A) this;
  }
  
  public A withPreferredStrategies(java.lang.String... preferredStrategies) {
    if (this.preferredStrategies != null) {
        this.preferredStrategies.clear();
        _visitables.remove("preferredStrategies");
    }
    if (preferredStrategies != null) {
      for (String item : preferredStrategies) {
        this.addToPreferredStrategies(item);
      }
    }
    return (A) this;
  }
  
  public boolean hasPreferredStrategies() {
    return this.preferredStrategies != null && !this.preferredStrategies.isEmpty();
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
    V1alpha1LeaseCandidateSpecFluent that = (V1alpha1LeaseCandidateSpecFluent) o;
    if (!java.util.Objects.equals(binaryVersion, that.binaryVersion)) return false;
    if (!java.util.Objects.equals(emulationVersion, that.emulationVersion)) return false;
    if (!java.util.Objects.equals(leaseName, that.leaseName)) return false;
    if (!java.util.Objects.equals(pingTime, that.pingTime)) return false;
    if (!java.util.Objects.equals(preferredStrategies, that.preferredStrategies)) return false;
    if (!java.util.Objects.equals(renewTime, that.renewTime)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(binaryVersion,  emulationVersion,  leaseName,  pingTime,  preferredStrategies,  renewTime,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (binaryVersion != null) { sb.append("binaryVersion:"); sb.append(binaryVersion + ","); }
    if (emulationVersion != null) { sb.append("emulationVersion:"); sb.append(emulationVersion + ","); }
    if (leaseName != null) { sb.append("leaseName:"); sb.append(leaseName + ","); }
    if (pingTime != null) { sb.append("pingTime:"); sb.append(pingTime + ","); }
    if (preferredStrategies != null && !preferredStrategies.isEmpty()) { sb.append("preferredStrategies:"); sb.append(preferredStrategies + ","); }
    if (renewTime != null) { sb.append("renewTime:"); sb.append(renewTime); }
    sb.append("}");
    return sb.toString();
  }
  

}