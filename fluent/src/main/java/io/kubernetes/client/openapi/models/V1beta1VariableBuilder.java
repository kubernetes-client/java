package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1VariableBuilder extends V1beta1VariableFluent<V1beta1VariableBuilder> implements VisitableBuilder<V1beta1Variable,V1beta1VariableBuilder>{
  public V1beta1VariableBuilder() {
    this(new V1beta1Variable());
  }
  
  public V1beta1VariableBuilder(V1beta1VariableFluent<?> fluent) {
    this(fluent, new V1beta1Variable());
  }
  
  public V1beta1VariableBuilder(V1beta1VariableFluent<?> fluent,V1beta1Variable instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1VariableBuilder(V1beta1Variable instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1VariableFluent<?> fluent;
  
  public V1beta1Variable build() {
    V1beta1Variable buildable = new V1beta1Variable();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}