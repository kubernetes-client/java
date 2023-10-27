package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1SelfSubjectRulesReviewSpecFluent<A extends V1SelfSubjectRulesReviewSpecFluent<A>> extends BaseFluent<A>{
  public V1SelfSubjectRulesReviewSpecFluent() {
  }
  
  public V1SelfSubjectRulesReviewSpecFluent(V1SelfSubjectRulesReviewSpec instance) {
    this.copyInstance(instance);
  }
  private String namespace;
  
  protected void copyInstance(V1SelfSubjectRulesReviewSpec instance) {
    instance = (instance != null ? instance : new V1SelfSubjectRulesReviewSpec());
    if (instance != null) {
          this.withNamespace(instance.getNamespace());
        }
  }
  
  public String getNamespace() {
    return this.namespace;
  }
  
  public A withNamespace(String namespace) {
    this.namespace = namespace;
    return (A) this;
  }
  
  public boolean hasNamespace() {
    return this.namespace != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1SelfSubjectRulesReviewSpecFluent that = (V1SelfSubjectRulesReviewSpecFluent) o;
    if (!java.util.Objects.equals(namespace, that.namespace)) return false;
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