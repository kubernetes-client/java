package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2ExternalMetricSourceBuilder extends V2ExternalMetricSourceFluent<V2ExternalMetricSourceBuilder> implements VisitableBuilder<V2ExternalMetricSource,V2ExternalMetricSourceBuilder>{
  public V2ExternalMetricSourceBuilder() {
    this(new V2ExternalMetricSource());
  }
  
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSourceFluent<?> fluent) {
    this(fluent, new V2ExternalMetricSource());
  }
  
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSourceFluent<?> fluent,V2ExternalMetricSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2ExternalMetricSourceFluent<?> fluent;
  
  public V2ExternalMetricSource build() {
    V2ExternalMetricSource buildable = new V2ExternalMetricSource();
    buildable.setMetric(fluent.buildMetric());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  

}