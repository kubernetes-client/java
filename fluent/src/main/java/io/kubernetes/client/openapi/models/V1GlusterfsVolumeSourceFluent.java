package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1GlusterfsVolumeSourceFluent<A extends V1GlusterfsVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1GlusterfsVolumeSourceFluent() {
  }
  
  public V1GlusterfsVolumeSourceFluent(V1GlusterfsVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String endpoints;
  private String path;
  private Boolean readOnly;
  
  protected void copyInstance(V1GlusterfsVolumeSource instance) {
    instance = (instance != null ? instance : new V1GlusterfsVolumeSource());
    if (instance != null) {
          this.withEndpoints(instance.getEndpoints());
          this.withPath(instance.getPath());
          this.withReadOnly(instance.getReadOnly());
        }
  }
  
  public String getEndpoints() {
    return this.endpoints;
  }
  
  public A withEndpoints(String endpoints) {
    this.endpoints = endpoints;
    return (A) this;
  }
  
  public boolean hasEndpoints() {
    return this.endpoints != null;
  }
  
  public String getPath() {
    return this.path;
  }
  
  public A withPath(String path) {
    this.path = path;
    return (A) this;
  }
  
  public boolean hasPath() {
    return this.path != null;
  }
  
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  
  public A withReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return (A) this;
  }
  
  public boolean hasReadOnly() {
    return this.readOnly != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1GlusterfsVolumeSourceFluent that = (V1GlusterfsVolumeSourceFluent) o;
    if (!java.util.Objects.equals(endpoints, that.endpoints)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(endpoints,  path,  readOnly,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (endpoints != null) { sb.append("endpoints:"); sb.append(endpoints + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}