package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2PodsMetricStatusBuilder extends V2PodsMetricStatusFluent<V2PodsMetricStatusBuilder> implements VisitableBuilder<V2PodsMetricStatus,V2PodsMetricStatusBuilder>{
  public V2PodsMetricStatusBuilder() {
    this(new V2PodsMetricStatus());
  }
  
  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent) {
    this(fluent, new V2PodsMetricStatus());
  }
  
  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent,V2PodsMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2PodsMetricStatusBuilder(V2PodsMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2PodsMetricStatusFluent<?> fluent;
  
  public V2PodsMetricStatus build() {
    V2PodsMetricStatus buildable = new V2PodsMetricStatus();
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setMetric(fluent.buildMetric());
    return buildable;
  }
  

}