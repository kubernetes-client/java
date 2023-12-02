package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2PodsMetricSourceBuilder extends V2PodsMetricSourceFluent<V2PodsMetricSourceBuilder> implements VisitableBuilder<V2PodsMetricSource,V2PodsMetricSourceBuilder>{
  public V2PodsMetricSourceBuilder() {
    this(new V2PodsMetricSource());
  }
  
  public V2PodsMetricSourceBuilder(V2PodsMetricSourceFluent<?> fluent) {
    this(fluent, new V2PodsMetricSource());
  }
  
  public V2PodsMetricSourceBuilder(V2PodsMetricSourceFluent<?> fluent,V2PodsMetricSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2PodsMetricSourceBuilder(V2PodsMetricSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2PodsMetricSourceFluent<?> fluent;
  
  public V2PodsMetricSource build() {
    V2PodsMetricSource buildable = new V2PodsMetricSource();
    buildable.setMetric(fluent.buildMetric());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  

}