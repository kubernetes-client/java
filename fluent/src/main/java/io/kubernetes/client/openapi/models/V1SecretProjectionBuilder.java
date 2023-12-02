package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SecretProjectionBuilder extends V1SecretProjectionFluent<V1SecretProjectionBuilder> implements VisitableBuilder<V1SecretProjection,V1SecretProjectionBuilder>{
  public V1SecretProjectionBuilder() {
    this(new V1SecretProjection());
  }
  
  public V1SecretProjectionBuilder(V1SecretProjectionFluent<?> fluent) {
    this(fluent, new V1SecretProjection());
  }
  
  public V1SecretProjectionBuilder(V1SecretProjectionFluent<?> fluent,V1SecretProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SecretProjectionBuilder(V1SecretProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SecretProjectionFluent<?> fluent;
  
  public V1SecretProjection build() {
    V1SecretProjection buildable = new V1SecretProjection();
    buildable.setItems(fluent.buildItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}