package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2ExternalMetricStatusBuilder extends V2beta2ExternalMetricStatusFluentImpl<V2beta2ExternalMetricStatusBuilder> implements VisitableBuilder<V2beta2ExternalMetricStatus,V2beta2ExternalMetricStatusBuilder>{
  public V2beta2ExternalMetricStatusBuilder() {
    this(false);
  }
  public V2beta2ExternalMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2ExternalMetricStatus(), validationEnabled);
  }
  public V2beta2ExternalMetricStatusBuilder(V2beta2ExternalMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2ExternalMetricStatusBuilder(V2beta2ExternalMetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2ExternalMetricStatus(), validationEnabled);
  }
  public V2beta2ExternalMetricStatusBuilder(V2beta2ExternalMetricStatusFluent<?> fluent,V2beta2ExternalMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2beta2ExternalMetricStatusBuilder(V2beta2ExternalMetricStatusFluent<?> fluent,V2beta2ExternalMetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2ExternalMetricStatusBuilder(V2beta2ExternalMetricStatus instance) {
    this(instance,false);
  }
  public V2beta2ExternalMetricStatusBuilder(V2beta2ExternalMetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2ExternalMetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2ExternalMetricStatus build() {
    V2beta2ExternalMetricStatus buildable = new V2beta2ExternalMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
  
}