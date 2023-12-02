package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ConfigMapKeySelectorBuilder extends V1ConfigMapKeySelectorFluent<V1ConfigMapKeySelectorBuilder> implements VisitableBuilder<V1ConfigMapKeySelector,V1ConfigMapKeySelectorBuilder>{
  public V1ConfigMapKeySelectorBuilder() {
    this(new V1ConfigMapKeySelector());
  }
  
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelectorFluent<?> fluent) {
    this(fluent, new V1ConfigMapKeySelector());
  }
  
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelectorFluent<?> fluent,V1ConfigMapKeySelector instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ConfigMapKeySelectorBuilder(V1ConfigMapKeySelector instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ConfigMapKeySelectorFluent<?> fluent;
  
  public V1ConfigMapKeySelector build() {
    V1ConfigMapKeySelector buildable = new V1ConfigMapKeySelector();
    buildable.setKey(fluent.getKey());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}