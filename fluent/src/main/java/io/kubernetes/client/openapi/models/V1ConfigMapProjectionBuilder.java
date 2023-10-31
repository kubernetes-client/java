package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ConfigMapProjectionBuilder extends V1ConfigMapProjectionFluent<V1ConfigMapProjectionBuilder> implements VisitableBuilder<V1ConfigMapProjection,V1ConfigMapProjectionBuilder>{
  public V1ConfigMapProjectionBuilder() {
    this(new V1ConfigMapProjection());
  }
  
  public V1ConfigMapProjectionBuilder(V1ConfigMapProjectionFluent<?> fluent) {
    this(fluent, new V1ConfigMapProjection());
  }
  
  public V1ConfigMapProjectionBuilder(V1ConfigMapProjectionFluent<?> fluent,V1ConfigMapProjection instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ConfigMapProjectionBuilder(V1ConfigMapProjection instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ConfigMapProjectionFluent<?> fluent;
  
  public V1ConfigMapProjection build() {
    V1ConfigMapProjection buildable = new V1ConfigMapProjection();
    buildable.setItems(fluent.buildItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}