package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1MatchConditionFluentImpl<A extends V1alpha1MatchConditionFluent<A>> extends BaseFluent<A> implements V1alpha1MatchConditionFluent<A>{
  public V1alpha1MatchConditionFluentImpl() {
  }
  public V1alpha1MatchConditionFluentImpl(V1alpha1MatchCondition instance) {
    if (instance != null) {
      this.withExpression(instance.getExpression());
      this.withName(instance.getName());
    }
  }
  private String expression;
  private String name;
  public String getExpression() {
    return this.expression;
  }
  public A withExpression(String expression) {
    this.expression=expression; return (A) this;
  }
  public Boolean hasExpression() {
    return this.expression != null;
  }
  public String getName() {
    return this.name;
  }
  public A withName(String name) {
    this.name=name; return (A) this;
  }
  public Boolean hasName() {
    return this.name != null;
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1MatchConditionFluentImpl that = (V1alpha1MatchConditionFluentImpl) o;
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