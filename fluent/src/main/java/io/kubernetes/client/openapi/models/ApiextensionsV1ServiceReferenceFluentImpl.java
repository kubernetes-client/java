package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class ApiextensionsV1ServiceReferenceFluentImpl<A extends io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReferenceFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReferenceFluent<A>{
  public ApiextensionsV1ServiceReferenceFluentImpl() {
  }
  public ApiextensionsV1ServiceReferenceFluentImpl(io.kubernetes.client.openapi.models.ApiextensionsV1ServiceReference instance) {
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withPath(instance.getPath());

    this.withPort(instance.getPort());

  }
  private java.lang.String name;
  private java.lang.String namespace;
  private java.lang.String path;
  private java.lang.Integer port;
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String arg0) {
    return (A)withName(new String(arg0));
  }
  public java.lang.String getNamespace() {
    return this.namespace;
  }
  public A withNamespace(java.lang.String namespace) {
    this.namespace=namespace; return (A) this;
  }
  public java.lang.Boolean hasNamespace() {
    return this.namespace != null;
  }
  
  /**
   * Method is deprecated. use withNamespace instead.
   */
  @java.lang.Deprecated
  public A withNewNamespace(java.lang.String arg0) {
    return (A)withNamespace(new String(arg0));
  }
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
  public java.lang.Integer getPort() {
    return this.port;
  }
  public A withPort(java.lang.Integer port) {
    this.port=port; return (A) this;
  }
  public java.lang.Boolean hasPort() {
    return this.port != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiextensionsV1ServiceReferenceFluentImpl that = (ApiextensionsV1ServiceReferenceFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    if (path != null ? !path.equals(that.path) :that.path != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  namespace,  path,  port,  super.hashCode());
  }
  
}