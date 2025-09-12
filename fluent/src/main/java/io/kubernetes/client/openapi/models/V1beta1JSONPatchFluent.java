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
public class V1beta1JSONPatchFluent<A extends io.kubernetes.client.openapi.models.V1beta1JSONPatchFluent<A>> extends BaseFluent<A>{
  public V1beta1JSONPatchFluent() {
  }
  
  public V1beta1JSONPatchFluent(V1beta1JSONPatch instance) {
    this.copyInstance(instance);
  }
  private String expression;
  
  protected void copyInstance(V1beta1JSONPatch instance) {
    instance = instance != null ? instance : new V1beta1JSONPatch();
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
    V1beta1JSONPatchFluent that = (V1beta1JSONPatchFluent) o;
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