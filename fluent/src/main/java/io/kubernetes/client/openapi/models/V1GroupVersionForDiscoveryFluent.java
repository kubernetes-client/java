package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1GroupVersionForDiscoveryFluent<A extends io.kubernetes.client.openapi.models.V1GroupVersionForDiscoveryFluent<A>> extends BaseFluent<A>{

  private String groupVersion;
  private String version;

  public V1GroupVersionForDiscoveryFluent() {
  }
  
  public V1GroupVersionForDiscoveryFluent(V1GroupVersionForDiscovery instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1GroupVersionForDiscovery instance) {
    instance = instance != null ? instance : new V1GroupVersionForDiscovery();
    if (instance != null) {
        this.withGroupVersion(instance.getGroupVersion());
        this.withVersion(instance.getVersion());
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
    V1GroupVersionForDiscoveryFluent that = (V1GroupVersionForDiscoveryFluent) o;
    if (!(Objects.equals(groupVersion, that.groupVersion))) {
      return false;
    }
    if (!(Objects.equals(version, that.version))) {
      return false;
    }
    return true;
  }
  
  public String getGroupVersion() {
    return this.groupVersion;
  }
  
  public String getVersion() {
    return this.version;
  }
  
  public boolean hasGroupVersion() {
    return this.groupVersion != null;
  }
  
  public boolean hasVersion() {
    return this.version != null;
  }
  
  public int hashCode() {
    return Objects.hash(groupVersion, version);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(groupVersion == null)) {
        sb.append("groupVersion:");
        sb.append(groupVersion);
        sb.append(",");
    }
    if (!(version == null)) {
        sb.append("version:");
        sb.append(version);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withGroupVersion(String groupVersion) {
    this.groupVersion = groupVersion;
    return (A) this;
  }
  
  public A withVersion(String version) {
    this.version = version;
    return (A) this;
  }
  
}