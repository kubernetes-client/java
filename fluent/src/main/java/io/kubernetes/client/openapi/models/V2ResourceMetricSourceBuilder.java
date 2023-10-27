package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2ResourceMetricSourceBuilder extends V2ResourceMetricSourceFluent<V2ResourceMetricSourceBuilder> implements VisitableBuilder<V2ResourceMetricSource,V2ResourceMetricSourceBuilder>{
  public V2ResourceMetricSourceBuilder() {
    this(new V2ResourceMetricSource());
  }
  
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent) {
    this(fluent, new V2ResourceMetricSource());
  }
  
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent,V2ResourceMetricSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2ResourceMetricSourceFluent<?> fluent;
  
  public V2ResourceMetricSource build() {
    V2ResourceMetricSource buildable = new V2ResourceMetricSource();
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  

}