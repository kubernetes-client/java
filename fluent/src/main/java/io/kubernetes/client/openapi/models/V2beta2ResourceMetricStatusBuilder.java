package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2ResourceMetricStatusBuilder extends V2beta2ResourceMetricStatusFluentImpl<V2beta2ResourceMetricStatusBuilder> implements VisitableBuilder<V2beta2ResourceMetricStatus,V2beta2ResourceMetricStatusBuilder>{
  public V2beta2ResourceMetricStatusBuilder() {
    this(false);
  }
  public V2beta2ResourceMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2ResourceMetricStatus(), validationEnabled);
  }
  public V2beta2ResourceMetricStatusBuilder(V2beta2ResourceMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2ResourceMetricStatusBuilder(V2beta2ResourceMetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2ResourceMetricStatus(), validationEnabled);
  }
  public V2beta2ResourceMetricStatusBuilder(V2beta2ResourceMetricStatusFluent<?> fluent,V2beta2ResourceMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2beta2ResourceMetricStatusBuilder(V2beta2ResourceMetricStatusFluent<?> fluent,V2beta2ResourceMetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2ResourceMetricStatusBuilder(V2beta2ResourceMetricStatus instance) {
    this(instance,false);
  }
  public V2beta2ResourceMetricStatusBuilder(V2beta2ResourceMetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2ResourceMetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2ResourceMetricStatus build() {
    V2beta2ResourceMetricStatus buildable = new V2beta2ResourceMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}