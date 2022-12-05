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
  public class V1SelfSubjectRulesReviewSpecFluentImpl<A extends V1SelfSubjectRulesReviewSpecFluent<A>> extends BaseFluent<A> implements V1SelfSubjectRulesReviewSpecFluent<A>{
  public V1SelfSubjectRulesReviewSpecFluentImpl() {
  }
  public V1SelfSubjectRulesReviewSpecFluentImpl(V1SelfSubjectRulesReviewSpec instance) {
    this.withNamespace(instance.getNamespace());

  }
  private String namespace;
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
    V1SelfSubjectRulesReviewSpecFluentImpl that = (V1SelfSubjectRulesReviewSpecFluentImpl) o;
    if (namespace != null ? !namespace.equals(that.namespace) :that.namespace != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(namespace,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (namespace != null) { sb.append("namespace:"); sb.append(namespace); }
    sb.append("}");
    return sb.toString();
  }
  
}