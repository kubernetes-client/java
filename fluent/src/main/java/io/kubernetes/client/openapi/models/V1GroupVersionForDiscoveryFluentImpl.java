package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1GroupVersionForDiscoveryFluentImpl<A extends V1GroupVersionForDiscoveryFluent<A>> extends BaseFluent<A> implements V1GroupVersionForDiscoveryFluent<A>{
  public V1GroupVersionForDiscoveryFluentImpl() {
  }
  public V1GroupVersionForDiscoveryFluentImpl(V1GroupVersionForDiscovery instance) {
    this.withGroupVersion(instance.getGroupVersion());

    this.withVersion(instance.getVersion());

  }
  private String groupVersion;
  private String version;
  public String getGroupVersion() {
    return this.groupVersion;
  }
  public A withGroupVersion(String groupVersion) {
    this.groupVersion=groupVersion; return (A) this;
  }
  public Boolean hasGroupVersion() {
    return this.groupVersion != null;
  }
  public String getVersion() {
    return this.version;
  }
  public A withVersion(String version) {
    this.version=version; return (A) this;
  }
  public Boolean hasVersion() {
    return this.version != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1GroupVersionForDiscoveryFluentImpl that = (V1GroupVersionForDiscoveryFluentImpl) o;
    if (groupVersion != null ? !groupVersion.equals(that.groupVersion) :that.groupVersion != null) return false;
    if (version != null ? !version.equals(that.version) :that.version != null) return false;
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