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
public class V1beta1JSONPatchFluent<A extends io.kubernetes.client.openapi.models.V1beta1JSONPatchFluent<A>> extends BaseFluent<A>{

  private String expression;

  public V1beta1JSONPatchFluent() {
  }
  
  public V1beta1JSONPatchFluent(V1beta1JSONPatch instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1beta1JSONPatch instance) {
    instance = instance != null ? instance : new V1beta1JSONPatch();
    if (instance != null) {
      this.withExpression(instance.getExpression());
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
    V1beta1JSONPatchFluent that = (V1beta1JSONPatchFluent) o;
    if (!(Objects.equals(expression, that.expression))) {
      return false;
    }
    return true;
  }
  
  public String getExpression() {
    return this.expression;
  }
  
  public boolean hasExpression() {
    return this.expression != null;
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
  
  public A withExpression(String expression) {
    this.expression = expression;
    return (A) this;
  }
  
}