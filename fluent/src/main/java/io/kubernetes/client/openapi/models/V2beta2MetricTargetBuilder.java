package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2MetricTargetBuilder extends V2beta2MetricTargetFluentImpl<V2beta2MetricTargetBuilder> implements VisitableBuilder<V2beta2MetricTarget,V2beta2MetricTargetBuilder>{
  public V2beta2MetricTargetBuilder() {
    this(false);
  }
  public V2beta2MetricTargetBuilder(Boolean validationEnabled) {
    this(new V2beta2MetricTarget(), validationEnabled);
  }
  public V2beta2MetricTargetBuilder(V2beta2MetricTargetFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2MetricTargetBuilder(V2beta2MetricTargetFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2MetricTarget(), validationEnabled);
  }
  public V2beta2MetricTargetBuilder(V2beta2MetricTargetFluent<?> fluent,V2beta2MetricTarget instance) {
    this(fluent, instance, false);
  }
  public V2beta2MetricTargetBuilder(V2beta2MetricTargetFluent<?> fluent,V2beta2MetricTarget instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2MetricTargetBuilder(V2beta2MetricTarget instance) {
    this(instance,false);
  }
  public V2beta2MetricTargetBuilder(V2beta2MetricTarget instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2MetricTargetFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2MetricTarget build() {
    V2beta2MetricTarget buildable = new V2beta2MetricTarget();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}