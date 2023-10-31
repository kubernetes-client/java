package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1GroupVersionForDiscoveryFluent<A extends V1GroupVersionForDiscoveryFluent<A>> extends BaseFluent<A>{
  public V1GroupVersionForDiscoveryFluent() {
  }
  
  public V1GroupVersionForDiscoveryFluent(V1GroupVersionForDiscovery instance) {
    this.copyInstance(instance);
  }
  private String groupVersion;
  private String version;
  
  protected void copyInstance(V1GroupVersionForDiscovery instance) {
    instance = (instance != null ? instance : new V1GroupVersionForDiscovery());
    if (instance != null) {
          this.withGroupVersion(instance.getGroupVersion());
          this.withVersion(instance.getVersion());
        }
  }
  
  public String getGroupVersion() {
    return this.groupVersion;
  }
  
  public A withGroupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return (A) this;
  }
  
  public boolean hasGroupVersion() {
    return this.groupVersion != null;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1GroupVersionForDiscoveryFluent that = (V1GroupVersionForDiscoveryFluent) o;
    if (!java.util.Objects.equals(groupVersion, that.groupVersion)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(groupVersion,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (groupVersion != null) { sb.append("groupVersion:"); sb.append(groupVersion + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  

}