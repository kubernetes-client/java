package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2ExternalMetricStatusBuilder extends V2ExternalMetricStatusFluentImpl<V2ExternalMetricStatusBuilder> implements VisitableBuilder<V2ExternalMetricStatus,V2ExternalMetricStatusBuilder>{
  public V2ExternalMetricStatusBuilder() {
    this(false);
  }
  public V2ExternalMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2ExternalMetricStatus(), validationEnabled);
  }
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2ExternalMetricStatus(), validationEnabled);
  }
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent,V2ExternalMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatusFluent<?> fluent,V2ExternalMetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatus instance) {
    this(instance,false);
  }
  public V2ExternalMetricStatusBuilder(V2ExternalMetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  V2ExternalMetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2ExternalMetricStatus build() {
    V2ExternalMetricStatus buildable = new V2ExternalMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
  
}