package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIServiceStatusBuilder extends V1APIServiceStatusFluent<V1APIServiceStatusBuilder> implements VisitableBuilder<V1APIServiceStatus,V1APIServiceStatusBuilder>{
  public V1APIServiceStatusBuilder() {
    this(new V1APIServiceStatus());
  }
  
  public V1APIServiceStatusBuilder(V1APIServiceStatusFluent<?> fluent) {
    this(fluent, new V1APIServiceStatus());
  }
  
  public V1APIServiceStatusBuilder(V1APIServiceStatusFluent<?> fluent,V1APIServiceStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIServiceStatusBuilder(V1APIServiceStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIServiceStatusFluent<?> fluent;
  
  public V1APIServiceStatus build() {
    V1APIServiceStatus buildable = new V1APIServiceStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}