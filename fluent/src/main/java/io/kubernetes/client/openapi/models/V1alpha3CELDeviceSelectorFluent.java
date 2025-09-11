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
public class V1alpha3CELDeviceSelectorFluent<A extends io.kubernetes.client.openapi.models.V1alpha3CELDeviceSelectorFluent<A>> extends BaseFluent<A>{
  public V1alpha3CELDeviceSelectorFluent() {
  }
  
  public V1alpha3CELDeviceSelectorFluent(V1alpha3CELDeviceSelector instance) {
    this.copyInstance(instance);
  }
  private String expression;
  
  protected void copyInstance(V1alpha3CELDeviceSelector instance) {
    instance = instance != null ? instance : new V1alpha3CELDeviceSelector();
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1alpha3CELDeviceSelectorFluent that = (V1alpha3CELDeviceSelectorFluent) o;
    if (!(Objects.equals(expression, that.expression))) {
      return false;
    }
    return true;
  }
  
  public int hashCode() {
    return Objects.hash(expression);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(expression == null)) {
        sb.append("expression:");
        sb.append(expression);
    }
    sb.append("}");
    return sb.toString();
  }
  

}