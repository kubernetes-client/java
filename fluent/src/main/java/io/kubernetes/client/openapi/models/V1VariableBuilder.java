package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VariableBuilder extends V1VariableFluent<V1VariableBuilder> implements VisitableBuilder<V1Variable,V1VariableBuilder>{
  public V1VariableBuilder() {
    this(new V1Variable());
  }
  
  public V1VariableBuilder(V1VariableFluent<?> fluent) {
    this(fluent, new V1Variable());
  }
  
  public V1VariableBuilder(V1VariableFluent<?> fluent,V1Variable instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VariableBuilder(V1Variable instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VariableFluent<?> fluent;
  
  public V1Variable build() {
    V1Variable buildable = new V1Variable();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}