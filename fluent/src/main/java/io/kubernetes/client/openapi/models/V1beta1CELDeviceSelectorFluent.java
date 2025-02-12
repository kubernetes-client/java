package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1beta1CELDeviceSelectorFluent<A extends V1beta1CELDeviceSelectorFluent<A>> extends BaseFluent<A>{
  public V1beta1CELDeviceSelectorFluent() {
  }
  
  public V1beta1CELDeviceSelectorFluent(V1beta1CELDeviceSelector instance) {
    this.copyInstance(instance);
  }
  private String expression;
  
  protected void copyInstance(V1beta1CELDeviceSelector instance) {
    instance = (instance != null ? instance : new V1beta1CELDeviceSelector());
    if (instance != null) {
          this.withExpression(instance.getExpression());
        }
  }
  
  public String getExpression() {
    return this.expression;
  }
  
  public A withExpression(String expression) {
    this.expression = expression;
    return (A) this;
  }
  
  public boolean hasExpression() {
    return this.expression != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1CELDeviceSelectorFluent that = (V1beta1CELDeviceSelectorFluent) o;
    if (!java.util.Objects.equals(expression, that.expression)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(expression,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (expression != null) { sb.append("expression:"); sb.append(expression); }
    sb.append("}");
    return sb.toString();
  }
  

}