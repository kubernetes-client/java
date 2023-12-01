package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1VariableBuilder extends V1alpha1VariableFluent<V1alpha1VariableBuilder> implements VisitableBuilder<V1alpha1Variable,V1alpha1VariableBuilder>{
  public V1alpha1VariableBuilder() {
    this(new V1alpha1Variable());
  }
  
  public V1alpha1VariableBuilder(V1alpha1VariableFluent<?> fluent) {
    this(fluent, new V1alpha1Variable());
  }
  
  public V1alpha1VariableBuilder(V1alpha1VariableFluent<?> fluent,V1alpha1Variable instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1VariableBuilder(V1alpha1Variable instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1VariableFluent<?> fluent;
  
  public V1alpha1Variable build() {
    V1alpha1Variable buildable = new V1alpha1Variable();
    buildable.setExpression(fluent.getExpression());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}