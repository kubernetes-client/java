package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceStatusBuilder extends V1ResourceStatusFluent<V1ResourceStatusBuilder> implements VisitableBuilder<V1ResourceStatus,V1ResourceStatusBuilder>{
  public V1ResourceStatusBuilder() {
    this(new V1ResourceStatus());
  }
  
  public V1ResourceStatusBuilder(V1ResourceStatusFluent<?> fluent) {
    this(fluent, new V1ResourceStatus());
  }
  
  public V1ResourceStatusBuilder(V1ResourceStatusFluent<?> fluent,V1ResourceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceStatusBuilder(V1ResourceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceStatusFluent<?> fluent;
  
  public V1ResourceStatus build() {
    V1ResourceStatus buildable = new V1ResourceStatus();
    buildable.setName(fluent.getName());
    buildable.setResources(fluent.buildResources());
    return buildable;
  }
  

}