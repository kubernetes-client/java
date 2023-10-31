package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2ObjectMetricSourceBuilder extends V2ObjectMetricSourceFluent<V2ObjectMetricSourceBuilder> implements VisitableBuilder<V2ObjectMetricSource,V2ObjectMetricSourceBuilder>{
  public V2ObjectMetricSourceBuilder() {
    this(new V2ObjectMetricSource());
  }
  
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSourceFluent<?> fluent) {
    this(fluent, new V2ObjectMetricSource());
  }
  
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSourceFluent<?> fluent,V2ObjectMetricSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2ObjectMetricSourceFluent<?> fluent;
  
  public V2ObjectMetricSource build() {
    V2ObjectMetricSource buildable = new V2ObjectMetricSource();
    buildable.setDescribedObject(fluent.buildDescribedObject());
    buildable.setMetric(fluent.buildMetric());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  

}