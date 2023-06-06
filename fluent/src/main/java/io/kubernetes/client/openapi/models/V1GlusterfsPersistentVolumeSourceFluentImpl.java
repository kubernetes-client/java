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
  public class V1GlusterfsPersistentVolumeSourceFluentImpl<A extends V1GlusterfsPersistentVolumeSourceFluent<A>> extends BaseFluent<A> implements V1GlusterfsPersistentVolumeSourceFluent<A>{
  public V1GlusterfsPersistentVolumeSourceFluentImpl() {
  }
  public V1GlusterfsPersistentVolumeSourceFluentImpl(V1GlusterfsPersistentVolumeSource instance) {
    if (instance != null) {
      this.withEndpoints(instance.getEndpoints());
      this.withEndpointsNamespace(instance.getEndpointsNamespace());
      this.withPath(instance.getPath());
      this.withReadOnly(instance.getReadOnly());
    }
  }
  private String endpoints;
  private String endpointsNamespace;
  private String path;
  private Boolean readOnly;
  public String getEndpoints() {
    return this.endpoints;
  }
  public A withEndpoints(String endpoints) {
    this.endpoints=endpoints; return (A) this;
  }
  public Boolean hasEndpoints() {
    return this.endpoints != null;
  }
  public String getEndpointsNamespace() {
    return this.endpointsNamespace;
  }
  public A withEndpointsNamespace(String endpointsNamespace) {
    this.endpointsNamespace=endpointsNamespace; return (A) this;
  }
  public Boolean hasEndpointsNamespace() {
    return this.endpointsNamespace != null;
  }
  public String getPath() {
    return this.path;
  }
  public A withPath(String path) {
    this.path=path; return (A) this;
  }
  public Boolean hasPath() {
    return this.path != null;
  }
  public Boolean getReadOnly() {
    return this.readOnly;
  }
  public A withReadOnly(Boolean readOnly) {
    this.readOnly=readOnly; return (A) this;
  }
  public Boolean hasReadOnly() {
    return this.readOnly != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1GlusterfsPersistentVolumeSourceFluentImpl that = (V1GlusterfsPersistentVolumeSourceFluentImpl) o;
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