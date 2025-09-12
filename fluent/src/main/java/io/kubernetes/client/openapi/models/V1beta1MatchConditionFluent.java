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
public class V1beta1MatchConditionFluent<A extends io.kubernetes.client.openapi.models.V1beta1MatchConditionFluent<A>> extends BaseFluent<A>{
  public V1beta1MatchConditionFluent() {
  }
  
  public V1beta1MatchConditionFluent(V1beta1MatchCondition instance) {
    this.copyInstance(instance);
  }
  private String expression;
  private String name;
  
  protected void copyInstance(V1beta1MatchCondition instance) {
    instance = instance != null ? instance : new V1beta1MatchCondition();
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
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    if (!(super.equals(o))) {
      return false;
    }
    V1beta1MatchConditionFluent that = (V1beta1MatchConditionFluent) o;
    if (!(Objects.equals(expression, that.expression))) {
      return false;
    }
    if (!(Objects.equals(name, that.name))) {
      return false;
    }
    return true;
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
  

}