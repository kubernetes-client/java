package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2ContainerResourceMetricStatusBuilder extends V2ContainerResourceMetricStatusFluent<V2ContainerResourceMetricStatusBuilder> implements VisitableBuilder<V2ContainerResourceMetricStatus,V2ContainerResourceMetricStatusBuilder>{
  public V2ContainerResourceMetricStatusBuilder() {
    this(new V2ContainerResourceMetricStatus());
  }
  
  public V2ContainerResourceMetricStatusBuilder(V2ContainerResourceMetricStatusFluent<?> fluent) {
    this(fluent, new V2ContainerResourceMetricStatus());
  }
  
  public V2ContainerResourceMetricStatusBuilder(V2ContainerResourceMetricStatusFluent<?> fluent,V2ContainerResourceMetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2ContainerResourceMetricStatusBuilder(V2ContainerResourceMetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2ContainerResourceMetricStatusFluent<?> fluent;
  
  public V2ContainerResourceMetricStatus build() {
    V2ContainerResourceMetricStatus buildable = new V2ContainerResourceMetricStatus();
    buildable.setContainer(fluent.getContainer());
    buildable.setCurrent(fluent.buildCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  

}