package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2MetricValueStatusBuilder extends V2beta2MetricValueStatusFluentImpl<V2beta2MetricValueStatusBuilder> implements VisitableBuilder<V2beta2MetricValueStatus,V2beta2MetricValueStatusBuilder>{
  public V2beta2MetricValueStatusBuilder() {
    this(false);
  }
  public V2beta2MetricValueStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2MetricValueStatus(), validationEnabled);
  }
  public V2beta2MetricValueStatusBuilder(V2beta2MetricValueStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2MetricValueStatusBuilder(V2beta2MetricValueStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2MetricValueStatus(), validationEnabled);
  }
  public V2beta2MetricValueStatusBuilder(V2beta2MetricValueStatusFluent<?> fluent,V2beta2MetricValueStatus instance) {
    this(fluent, instance, false);
  }
  public V2beta2MetricValueStatusBuilder(V2beta2MetricValueStatusFluent<?> fluent,V2beta2MetricValueStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2MetricValueStatusBuilder(V2beta2MetricValueStatus instance) {
    this(instance,false);
  }
  public V2beta2MetricValueStatusBuilder(V2beta2MetricValueStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2MetricValueStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2MetricValueStatus build() {
    V2beta2MetricValueStatus buildable = new V2beta2MetricValueStatus();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}