package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ScaleStatusBuilder extends V1ScaleStatusFluent<V1ScaleStatusBuilder> implements VisitableBuilder<V1ScaleStatus,V1ScaleStatusBuilder>{
  public V1ScaleStatusBuilder() {
    this(new V1ScaleStatus());
  }
  
  public V1ScaleStatusBuilder(V1ScaleStatusFluent<?> fluent) {
    this(fluent, new V1ScaleStatus());
  }
  
  public V1ScaleStatusBuilder(V1ScaleStatusFluent<?> fluent,V1ScaleStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ScaleStatusBuilder(V1ScaleStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ScaleStatusFluent<?> fluent;
  
  public V1ScaleStatus build() {
    V1ScaleStatus buildable = new V1ScaleStatus();
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.getSelector());
    return buildable;
  }
  

}