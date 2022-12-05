package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class ApiregistrationV1ServiceReferenceFluentImpl<A extends ApiregistrationV1ServiceReferenceFluent<A>> extends BaseFluent<A> implements ApiregistrationV1ServiceReferenceFluent<A>{
  public ApiregistrationV1ServiceReferenceFluentImpl() {
  }
  public ApiregistrationV1ServiceReferenceFluentImpl(ApiregistrationV1ServiceReference instance) {
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

    this.withPort(instance.getPort());

  }
  private String name;
  private String namespace;
  private Integer port;
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public String getNamespace() {
    return this.namespace;
  }
  public A withNamespace(String namespace) {
    this.namespace=namespace; return (A) this;
  }
  public Boolean hasNamespace() {
    return this.namespace != null;
  }
  public Integer getPort() {
    return this.port;
  }
  public A withPort(Integer port) {
    this.port=port; return (A) this;
  }
  public Boolean hasPort() {
    return this.port != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApiregistrationV1ServiceReferenceFluentImpl that = (ApiregistrationV1ServiceReferenceFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  namespace,  port,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace + ","); }
    if (port != null) { sb.append("port:"); sb.append(port); }
    sb.append("}");
    return sb.toString();
  }
  
}