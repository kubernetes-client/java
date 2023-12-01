package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;

/**
 * Generated
 */
@SuppressWarnings("unchecked")
public class V1alpha1VariableFluent<A extends V1alpha1VariableFluent<A>> extends BaseFluent<A>{
  public V1alpha1VariableFluent() {
  }
  
  public V1alpha1VariableFluent(V1alpha1Variable instance) {
    this.copyInstance(instance);
  }
  private String expression;
  private String name;
  
  protected void copyInstance(V1alpha1Variable instance) {
    instance = (instance != null ? instance : new V1alpha1Variable());
    if (instance != null) {
          this.withExpression(instance.getExpression());
          this.withName(instance.getName());
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
  
  public String getName() {
    return this.name;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1VariableFluent that = (V1alpha1VariableFluent) o;
    if (!java.util.Objects.equals(expression, that.expression)) return false;
    if (!java.util.Objects.equals(name, that.name)) return false;
    return true;
  }
  
  public int hashCode() {
    return java.util.Objects.hash(expression,  name,  super.hashCode());
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (expression != null) { sb.append("expression:"); sb.append(expression + ","); }
    if (name != null) { sb.append("name:"); sb.append(name); }
    sb.append("}");
    return sb.toString();
  }
  

}