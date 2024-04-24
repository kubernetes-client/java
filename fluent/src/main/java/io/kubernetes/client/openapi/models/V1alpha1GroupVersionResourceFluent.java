package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1GroupVersionResourceFluent<A extends V1alpha1GroupVersionResourceFluent<A>> extends BaseFluent<A>{
  public V1alpha1GroupVersionResourceFluent() {
  }
  
  public V1alpha1GroupVersionResourceFluent(V1alpha1GroupVersionResource instance) {
    this.copyInstance(instance);
  }
  private String group;
  private String resource;
  private String version;
  
  protected void copyInstance(V1alpha1GroupVersionResource instance) {
    instance = (instance != null ? instance : new V1alpha1GroupVersionResource());
    if (instance != null) {
          this.withGroup(instance.getGroup());
          this.withResource(instance.getResource());
          this.withVersion(instance.getVersion());
        }
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public A withGroup(String group) {
    this.group = group;
    return (A) this;
  }
  
  public boolean hasGroup() {
    return this.group != null;
  }
  
  public String getResource() {
    return this.resource;
  }
  
  public A withResource(String resource) {
    this.resource = resource;
    return (A) this;
  }
  
  public boolean hasResource() {
    return this.resource != null;
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
    V1alpha1GroupVersionResourceFluent that = (V1alpha1GroupVersionResourceFluent) o;
    if (!java.util.Objects.equals(group, that.group)) return false;
    if (!java.util.Objects.equals(resource, that.resource)) return false;
    if (!java.util.Objects.equals(version, that.version)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(group,  resource,  version,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (group != null) { sb.append("group:"); sb.append(group + ","); }
    if (resource != null) { sb.append("resource:"); sb.append(resource + ","); }
    if (version != null) { sb.append("version:"); sb.append(version); }
    sb.append("}");
    return sb.toString();
  }
  

}