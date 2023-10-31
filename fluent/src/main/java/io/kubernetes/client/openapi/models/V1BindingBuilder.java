package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1BindingBuilder extends V1BindingFluent<V1BindingBuilder> implements VisitableBuilder<V1Binding,V1BindingBuilder>{
  public V1BindingBuilder() {
    this(new V1Binding());
  }
  
  public V1BindingBuilder(V1BindingFluent<?> fluent) {
    this(fluent, new V1Binding());
  }
  
  public V1BindingBuilder(V1BindingFluent<?> fluent,V1Binding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1BindingBuilder(V1Binding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1BindingFluent<?> fluent;
  
  public V1Binding build() {
    V1Binding buildable = new V1Binding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  

}