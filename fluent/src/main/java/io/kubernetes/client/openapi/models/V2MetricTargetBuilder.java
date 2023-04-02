package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2MetricTargetBuilder extends V2MetricTargetFluentImpl<V2MetricTargetBuilder> implements VisitableBuilder<V2MetricTarget,V2MetricTargetBuilder>{
  public V2MetricTargetBuilder() {
    this(false);
  }
  public V2MetricTargetBuilder(Boolean validationEnabled) {
    this(new V2MetricTarget(), validationEnabled);
  }
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent) {
    this(fluent, false);
  }
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2MetricTarget(), validationEnabled);
  }
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent,V2MetricTarget instance) {
    this(fluent, instance, false);
  }
  public V2MetricTargetBuilder(V2MetricTargetFluent<?> fluent,V2MetricTarget instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAverageUtilization(instance.getAverageUtilization());

    fluent.withAverageValue(instance.getAverageValue());

    fluent.withType(instance.getType());

    fluent.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  public V2MetricTargetBuilder(V2MetricTarget instance) {
    this(instance,false);
  }
  public V2MetricTargetBuilder(V2MetricTarget instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAverageUtilization(instance.getAverageUtilization());

    this.withAverageValue(instance.getAverageValue());

    this.withType(instance.getType());

    this.withValue(instance.getValue());

    this.validationEnabled = validationEnabled; 
  }
  V2MetricTargetFluent<?> fluent;
  Boolean validationEnabled;
  public V2MetricTarget build() {
    V2MetricTarget buildable = new V2MetricTarget();
    buildable.setAverageUtilization(fluent.getAverageUtilization());
    buildable.setAverageValue(fluent.getAverageValue());
    buildable.setType(fluent.getType());
    buildable.setValue(fluent.getValue());
    return buildable;
  }
  
}