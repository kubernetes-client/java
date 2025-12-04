package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SelfSubjectRulesReviewSpecFluent<A extends io.kubernetes.client.openapi.models.V1SelfSubjectRulesReviewSpecFluent<A>> extends BaseFluent<A>{

  private String namespace;

  public V1SelfSubjectRulesReviewSpecFluent() {
  }
  
  public V1SelfSubjectRulesReviewSpecFluent(V1SelfSubjectRulesReviewSpec instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1SelfSubjectRulesReviewSpec instance) {
    instance = instance != null ? instance : new V1SelfSubjectRulesReviewSpec();
    if (instance != null) {
      this.withNamespace(instance.getNamespace());
    }
  }
  
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1SelfSubjectRulesReviewSpecFluent that = (V1SelfSubjectRulesReviewSpecFluent) o;
    if (!(Objects.equals(namespace, that.namespace))) {
      return false;
    }
    return true;
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public int hashCode() {
    return Objects.hash(namespace);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(namespace == null)) {
        sb.append("namespace:");
        sb.append(namespace);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
}