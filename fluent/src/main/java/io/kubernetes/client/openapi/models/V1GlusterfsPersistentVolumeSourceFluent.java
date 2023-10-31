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
public class V1GlusterfsPersistentVolumeSourceFluent<A extends V1GlusterfsPersistentVolumeSourceFluent<A>> extends BaseFluent<A>{
  public V1GlusterfsPersistentVolumeSourceFluent() {
  }
  
  public V1GlusterfsPersistentVolumeSourceFluent(V1GlusterfsPersistentVolumeSource instance) {
    this.copyInstance(instance);
  }
  private String endpoints;
  private String endpointsNamespace;
  private String path;
  private Boolean readOnly;
  
  protected void copyInstance(V1GlusterfsPersistentVolumeSource instance) {
    instance = (instance != null ? instance : new V1GlusterfsPersistentVolumeSource());
    if (instance != null) {
          this.withEndpoints(instance.getEndpoints());
          this.withEndpointsNamespace(instance.getEndpointsNamespace());
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
  
  public String getEndpointsNamespace() {
    return this.endpointsNamespace;
  }
  
  public A withEndpointsNamespace(String endpointsNamespace) {
    this.endpointsNamespace = endpointsNamespace;
    return (A) this;
  }
  
  public boolean hasEndpointsNamespace() {
    return this.endpointsNamespace != null;
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
    V1GlusterfsPersistentVolumeSourceFluent that = (V1GlusterfsPersistentVolumeSourceFluent) o;
    if (!java.util.Objects.equals(endpoints, that.endpoints)) return false;
    if (!java.util.Objects.equals(endpointsNamespace, that.endpointsNamespace)) return false;
    if (!java.util.Objects.equals(path, that.path)) return false;
    if (!java.util.Objects.equals(readOnly, that.readOnly)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(endpoints,  endpointsNamespace,  path,  readOnly,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (endpoints != null) { sb.append("endpoints:"); sb.append(endpoints + ","); }
    if (endpointsNamespace != null) { sb.append("endpointsNamespace:"); sb.append(endpointsNamespace + ","); }
    if (path != null) { sb.append("path:"); sb.append(path + ","); }
    if (readOnly != null) { sb.append("readOnly:"); sb.append(readOnly); }
    sb.append("}");
    return sb.toString();
  }
  
  public A withReadOnly() {
    return withReadOnly(true);
  }
  

}