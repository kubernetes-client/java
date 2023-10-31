package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2ObjectMetricStatusBuilder extends V2ObjectMetricStatusFluent<V2ObjectMetricStatusBuilder> implements VisitableBuilder<V2ObjectMetricStatus,V2ObjectMetricStatusBuilder>{
  public V2ObjectMetricStatusBuilder() {
    this(new V2ObjectMetricStatus());
  }
  
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatusFluent<?> fluent) {
    this(fluent, new V2ObjectMetricStatus());
  }
  
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatusFluent<?> fluent,V2ObjectMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2ObjectMetricStatusFluent<?> fluent;
  
  public V2ObjectMetricStatus build() {
    V2ObjectMetricStatus buildable = new V2ObjectMetricStatus();
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setDescribedObject(fluent.buildDescribedObject());
    buildable.setMetric(fluent.buildMetric());
    return buildable;
  }
  

}