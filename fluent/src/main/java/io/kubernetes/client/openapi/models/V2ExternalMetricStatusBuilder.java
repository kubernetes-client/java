package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2ExternalMetricStatusBuilder extends V2ExternalMetricStatusFluent<V2ExternalMetricStatusBuilder> implements VisitableBuilder<V2ExternalMetricStatus,V2ExternalMetricStatusBuilder>{
  public V2ExternalMetricStatusBuilder() {
    this(new V2ExternalMetricStatus());
  }
  
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent) {
    this(fluent, new V2ExternalMetricStatus());
  }
  
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent,V2ExternalMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2ExternalMetricStatusFluent<?> fluent;
  
  public V2ExternalMetricStatus build() {
    V2ExternalMetricStatus buildable = new V2ExternalMetricStatus();
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setMetric(fluent.buildMetric());
    return buildable;
  }
  

}