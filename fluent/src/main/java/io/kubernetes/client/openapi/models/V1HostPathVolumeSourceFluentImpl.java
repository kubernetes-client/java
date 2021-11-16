package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class V1HostPathVolumeSourceFluentImpl<A extends io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.V1HostPathVolumeSourceFluent<A>{
  public V1HostPathVolumeSourceFluentImpl() {
  }
  public V1HostPathVolumeSourceFluentImpl(io.kubernetes.client.openapi.models.V1HostPathVolumeSource instance) {
    this.withPath(instance.getPath());

    this.withType(instance.getType());

  }
  private java.lang.String path;
  private java.lang.String type;
  public java.lang.String getPath() {
    return this.path;
  }
  public A withPath(java.lang.String path) {
    this.path=path; return (A) this;
  }
  public java.lang.Boolean hasPath() {
    return this.path != null;
  }
  
  /**
   * Method is deprecated. use withPath instead.
   */
  @java.lang.Deprecated
  public A withNewPath(java.lang.String arg0) {
    return (A)withPath(new String(arg0));
  }
  public java.lang.String getType() {
    return this.type;
  }
  public A withType(java.lang.String type) {
    this.type=type; return (A) this;
  }
  public java.lang.Boolean hasType() {
    return this.type != null;
  }
  
  /**
   * Method is deprecated. use withType instead.
   */
  @java.lang.Deprecated
  public A withNewType(java.lang.String arg0) {
    return (A)withType(new String(arg0));
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1HostPathVolumeSourceFluentImpl that = (V1HostPathVolumeSourceFluentImpl) o;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    if (type != null ? !type.equals(that.type) :that.type != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(path,  type,  super.hashCode());
  }
  
}