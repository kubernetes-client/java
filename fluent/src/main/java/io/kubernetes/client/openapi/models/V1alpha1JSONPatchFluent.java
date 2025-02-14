package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1JSONPatchFluent<A extends V1alpha1JSONPatchFluent<A>> extends BaseFluent<A>{
  public V1alpha1JSONPatchFluent() {
  }
  
  public V1alpha1JSONPatchFluent(V1alpha1JSONPatch instance) {
    this.copyInstance(instance);
  }
  private String expression;
  
  protected void copyInstance(V1alpha1JSONPatch instance) {
    instance = (instance != null ? instance : new V1alpha1JSONPatch());
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
    V1alpha1JSONPatchFluent that = (V1alpha1JSONPatchFluent) o;
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