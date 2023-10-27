package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V2MetricValueStatusBuilder extends V2MetricValueStatusFluent<V2MetricValueStatusBuilder> implements VisitableBuilder<V2MetricValueStatus,V2MetricValueStatusBuilder>{
  public V2MetricValueStatusBuilder() {
    this(new V2MetricValueStatus());
  }
  
  public V2MetricValueStatusBuilder(V2MetricValueStatusFluent<?> fluent) {
    this(fluent, new V2MetricValueStatus());
  }
  
  public V2MetricValueStatusBuilder(V2MetricValueStatusFluent<?> fluent,V2MetricValueStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V2MetricValueStatusBuilder(V2MetricValueStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V2MetricValueStatusFluent<?> fluent;
  
  public V2MetricValueStatus build() {
    V2MetricValueStatus buildable = new V2MetricValueStatus();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  

}