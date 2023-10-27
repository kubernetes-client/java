package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2ContainerResourceMetricSourceBuilder extends V2ContainerResourceMetricSourceFluent<V2ContainerResourceMetricSourceBuilder> implements VisitableBuilder<V2ContainerResourceMetricSource,V2ContainerResourceMetricSourceBuilder>{
  public V2ContainerResourceMetricSourceBuilder() {
    this(new V2ContainerResourceMetricSource());
  }
  
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSourceFluent<?> fluent) {
    this(fluent, new V2ContainerResourceMetricSource());
  }
  
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSourceFluent<?> fluent,V2ContainerResourceMetricSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2ContainerResourceMetricSourceBuilder(V2ContainerResourceMetricSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2ContainerResourceMetricSourceFluent<?> fluent;
  
  public V2ContainerResourceMetricSource build() {
    V2ContainerResourceMetricSource buildable = new V2ContainerResourceMetricSource();
    buildable.setContainer(fluent.getContainer());
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.buildTarget());
    return buildable;
  }
  

}