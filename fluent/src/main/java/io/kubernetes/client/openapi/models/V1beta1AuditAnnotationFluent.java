package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1AuditAnnotationFluent<A extends V1beta1AuditAnnotationFluent<A>> extends BaseFluent<A>{
  public V1beta1AuditAnnotationFluent() {
  }
  
  public V1beta1AuditAnnotationFluent(V1beta1AuditAnnotation instance) {
    this.copyInstance(instance);
  }
  private String key;
  private String valueExpression;
  
  protected void copyInstance(V1beta1AuditAnnotation instance) {
    instance = (instance != null ? instance : new V1beta1AuditAnnotation());
    if (instance != null) {
          this.withKey(instance.getKey());
          this.withValueExpression(instance.getValueExpression());
        }
  }
  
  public String getKey() {
    return this.key;
  }
  
  public A withKey(String key) {
    this.key = key;
    return (A) this;
  }
  
  public boolean hasKey() {
    return this.key != null;
  }
  
  public String getValueExpression() {
    return this.valueExpression;
  }
  
  public A withValueExpression(String valueExpression) {
    this.valueExpression = valueExpression;
    return (A) this;
  }
  
  public boolean hasValueExpression() {
    return this.valueExpression != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1AuditAnnotationFluent that = (V1beta1AuditAnnotationFluent) o;
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