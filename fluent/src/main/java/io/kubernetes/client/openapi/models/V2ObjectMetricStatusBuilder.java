package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2ObjectMetricStatusBuilder extends V2ObjectMetricStatusFluentImpl<V2ObjectMetricStatusBuilder> implements VisitableBuilder<V2ObjectMetricStatus,V2ObjectMetricStatusBuilder>{
  public V2ObjectMetricStatusBuilder() {
    this(false);
  }
  public V2ObjectMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2ObjectMetricStatus(), validationEnabled);
  }
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2ObjectMetricStatus(), validationEnabled);
  }
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatusFluent<?> fluent,V2ObjectMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatusFluent<?> fluent,V2ObjectMetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withDescribedObject(instance.getDescribedObject());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatus instance) {
    this(instance,false);
  }
  public V2ObjectMetricStatusBuilder(V2ObjectMetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  V2ObjectMetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2ObjectMetricStatus build() {
    V2ObjectMetricStatus buildable = new V2ObjectMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setDescribedObject(fluent.getDescribedObject());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
  
}