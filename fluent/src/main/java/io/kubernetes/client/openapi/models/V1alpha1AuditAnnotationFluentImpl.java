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
  public class V1alpha1AuditAnnotationFluentImpl<A extends V1alpha1AuditAnnotationFluent<A>> extends BaseFluent<A> implements V1alpha1AuditAnnotationFluent<A>{
  public V1alpha1AuditAnnotationFluentImpl() {
  }
  public V1alpha1AuditAnnotationFluentImpl(V1alpha1AuditAnnotation instance) {
    if (instance != null) {
      this.withKey(instance.getKey());
      this.withValueExpression(instance.getValueExpression());
    }
  }
  private String key;
  private String valueExpression;
  public String getKey() {
    return this.key;
  }
  public A withKey(String key) {
    this.key=key; return (A) this;
  }
  public Boolean hasKey() {
    return this.key != null;
  }
  public String getValueExpression() {
    return this.valueExpression;
  }
  public A withValueExpression(String valueExpression) {
    this.valueExpression=valueExpression; return (A) this;
  }
  public Boolean hasValueExpression() {
    return this.valueExpression != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1AuditAnnotationFluentImpl that = (V1alpha1AuditAnnotationFluentImpl) o;
    if (!java.util.Objects.equals(key, that.key)) return false;

    if (!java.util.Objects.equals(valueExpression, that.valueExpression)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(key,  valueExpression,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (key != null) { sb.append("key:"); sb.append(key + ","); }
    if (valueExpression != null) { sb.append("valueExpression:"); sb.append(valueExpression); }
    sb.append("}");
    return sb.toString();
  }
  
}