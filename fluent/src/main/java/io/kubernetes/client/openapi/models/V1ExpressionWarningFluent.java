package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1ExpressionWarningFluent<A extends V1ExpressionWarningFluent<A>> extends BaseFluent<A>{
  public V1ExpressionWarningFluent() {
  }
  
  public V1ExpressionWarningFluent(V1ExpressionWarning instance) {
    this.copyInstance(instance);
  }
  private String fieldRef;
  private String warning;
  
  protected void copyInstance(V1ExpressionWarning instance) {
    instance = (instance != null ? instance : new V1ExpressionWarning());
    if (instance != null) {
          this.withFieldRef(instance.getFieldRef());
          this.withWarning(instance.getWarning());
        }
  }
  
  public String getFieldRef() {
    return this.fieldRef;
  }
  
  public A withFieldRef(String fieldRef) {
    this.fieldRef = fieldRef;
    return (A) this;
  }
  
  public boolean hasFieldRef() {
    return this.fieldRef != null;
  }
  
  public String getWarning() {
    return this.warning;
  }
  
  public A withWarning(String warning) {
    this.warning = warning;
    return (A) this;
  }
  
  public boolean hasWarning() {
    return this.warning != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1ExpressionWarningFluent that = (V1ExpressionWarningFluent) o;
    if (!java.util.Objects.equals(fieldRef, that.fieldRef)) return false;
    if (!java.util.Objects.equals(warning, that.warning)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(fieldRef,  warning,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (fieldRef != null) { sb.append("fieldRef:"); sb.append(fieldRef + ","); }
    if (warning != null) { sb.append("warning:"); sb.append(warning); }
    sb.append("}");
    return sb.toString();
  }
  

}