package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2MetricTargetBuilder extends V2MetricTargetFluent<V2MetricTargetBuilder> implements VisitableBuilder<V2MetricTarget,V2MetricTargetBuilder>{
  public V2MetricTargetBuilder() {
    this(new V2MetricTarget());
  }
  
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent) {
    this(fluent, new V2MetricTarget());
  }
  
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent,V2MetricTarget instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2MetricTargetBuilder(V2MetricTarget instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2MetricTargetFluent<?> fluent;
  
  public V2MetricTarget build() {
    V2MetricTarget buildable = new V2MetricTarget();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}