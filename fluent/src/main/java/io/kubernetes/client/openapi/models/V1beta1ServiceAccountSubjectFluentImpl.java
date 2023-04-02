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
  public class V1beta1ServiceAccountSubjectFluentImpl<A extends V1beta1ServiceAccountSubjectFluent<A>> extends BaseFluent<A> implements V1beta1ServiceAccountSubjectFluent<A>{
  public V1beta1ServiceAccountSubjectFluentImpl() {
  }
  public V1beta1ServiceAccountSubjectFluentImpl(V1beta1ServiceAccountSubject instance) {
    this.withName(instance.getName());

    this.withNamespace(instance.getNamespace());

  }
  private String name;
  private String namespace;
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
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1beta1ServiceAccountSubjectFluentImpl that = (V1beta1ServiceAccountSubjectFluentImpl) o;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(name,  namespace,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (name != null) { sb.append("name:"); sb.append(name + ","); }
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace); }
    sb.append("}");
    return sb.toString();
  }
  
}