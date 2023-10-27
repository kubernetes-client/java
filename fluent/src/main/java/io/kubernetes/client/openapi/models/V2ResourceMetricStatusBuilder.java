package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2ResourceMetricStatusBuilder extends V2ResourceMetricStatusFluent<V2ResourceMetricStatusBuilder> implements VisitableBuilder<V2ResourceMetricStatus,V2ResourceMetricStatusBuilder>{
  public V2ResourceMetricStatusBuilder() {
    this(new V2ResourceMetricStatus());
  }
  
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent) {
    this(fluent, new V2ResourceMetricStatus());
  }
  
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent,V2ResourceMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2ResourceMetricStatusFluent<?> fluent;
  
  public V2ResourceMetricStatus build() {
    V2ResourceMetricStatus buildable = new V2ResourceMetricStatus();
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}