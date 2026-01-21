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
public class V1alpha1MatchConditionFluent<A extends io.kubernetes.client.openapi.models.V1alpha1MatchConditionFluent<A>> extends BaseFluent<A>{

  private String expression;
  private String name;

  public V1alpha1MatchConditionFluent() {
  }
  
  public V1alpha1MatchConditionFluent(V1alpha1MatchCondition instance) {
    this.copyInstance(instance);
  }

  protected void copyInstance(V1alpha1MatchCondition instance) {
    instance = instance != null ? instance : new V1alpha1MatchCondition();
    if (instance != null) {
        this.withExpression(instance.getExpression());
        this.withName(instance.getName());
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
    V1alpha1MatchConditionFluent that = (V1alpha1MatchConditionFluent) o;
    if (!(Objects.equals(expression, that.expression))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
  }
  
  public String getExpression() {
    return this.expression;
  }
  
  public String getName() {
    return this.name;
  }
  
  public boolean hasExpression() {
    return this.expression != null;
  }
  
  public boolean hasName() {
    return this.name != null;
  }
  
  public int hashCode() {
    return Objects.hash(expression, name);
  }
  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (!(expression == null)) {
        sb.append("expression:");
        sb.append(expression);
        sb.append(",");
    }
    if (!(name == null)) {
        sb.append("name:");
        sb.append(name);
    }
    sb.append("}");
    return sb.toString();
  }
  
  public A withExpression(String expression) {
    this.expression = expression;
    return (A) this;
  }
  
  public A withName(String name) {
    this.name = name;
    return (A) this;
  }
  
}