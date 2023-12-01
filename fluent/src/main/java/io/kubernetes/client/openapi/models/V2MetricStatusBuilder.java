package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2MetricStatusBuilder extends V2MetricStatusFluent<V2MetricStatusBuilder> implements VisitableBuilder<V2MetricStatus,V2MetricStatusBuilder>{
  public V2MetricStatusBuilder() {
    this(new V2MetricStatus());
  }
  
  public V2MetricStatusBuilder(V2MetricStatusFluent<?> fluent) {
    this(fluent, new V2MetricStatus());
  }
  
  public V2MetricStatusBuilder(V2MetricStatusFluent<?> fluent,V2MetricStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2MetricStatusBuilder(V2MetricStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2MetricStatusFluent<?> fluent;
  
  public V2MetricStatus build() {
    V2MetricStatus buildable = new V2MetricStatus();
    buildable.setContainerResource(fluent.buildContainerResource());
    buildable.setExternal(fluent.buildExternal());
    buildable.setObject(fluent.buildObject());
    buildable.setPods(fluent.buildPods());
    buildable.setResource(fluent.buildResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}