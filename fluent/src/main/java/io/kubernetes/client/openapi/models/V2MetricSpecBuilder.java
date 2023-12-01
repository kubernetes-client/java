package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2MetricSpecBuilder extends V2MetricSpecFluent<V2MetricSpecBuilder> implements VisitableBuilder<V2MetricSpec,V2MetricSpecBuilder>{
  public V2MetricSpecBuilder() {
    this(new V2MetricSpec());
  }
  
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent) {
    this(fluent, new V2MetricSpec());
  }
  
  public V2MetricSpecBuilder(V2MetricSpecFluent<?> fluent,V2MetricSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2MetricSpecBuilder(V2MetricSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2MetricSpecFluent<?> fluent;
  
  public V2MetricSpec build() {
    V2MetricSpec buildable = new V2MetricSpec();
    buildable.setContainerResource(fluent.buildContainerResource());
    buildable.setExternal(fluent.buildExternal());
    buildable.setObject(fluent.buildObject());
    buildable.setPods(fluent.buildPods());
    buildable.setResource(fluent.buildResource());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}