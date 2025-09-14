package io.kubernetes.client.openapi.models;

import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.util.Objects;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1AuditAnnotationFluent<A extends io.kubernetes.client.openapi.models.V1AuditAnnotationFluent<A>> extends BaseFluent<A>{
  public V1AuditAnnotationFluent() {
  }
  
  public V1AuditAnnotationFluent(V1AuditAnnotation instance) {
    this.copyInstance(instance);
  }
  private String key;
  private String valueExpression;
  
  protected void copyInstance(V1AuditAnnotation instance) {
    instance = instance != null ? instance : new V1AuditAnnotation();
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1AuditAnnotationFluent that = (V1AuditAnnotationFluent) o;
    if (!(Objects.equals(key, that.key))) {
      return false;
    }
    if (!(Objects.equals(valueExpression, that.valueExpression))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(key, valueExpression);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(key == null)) {
        sb.append("key:");
        sb.append(key);
        sb.append(",");
    }
    if (!(valueExpression == null)) {
        sb.append("valueExpression:");
        sb.append(valueExpression);
    }
    sb.append("}");
    return sb.toString();
  }
  

}