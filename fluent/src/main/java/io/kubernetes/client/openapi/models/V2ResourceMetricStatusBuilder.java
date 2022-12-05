package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2ResourceMetricStatusBuilder extends V2ResourceMetricStatusFluentImpl<V2ResourceMetricStatusBuilder> implements VisitableBuilder<V2ResourceMetricStatus,V2ResourceMetricStatusBuilder>{
  public V2ResourceMetricStatusBuilder() {
    this(false);
  }
  public V2ResourceMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2ResourceMetricStatus(), validationEnabled);
  }
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2ResourceMetricStatus(), validationEnabled);
  }
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent,V2ResourceMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatusFluent<?> fluent,V2ResourceMetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatus instance) {
    this(instance,false);
  }
  public V2ResourceMetricStatusBuilder(V2ResourceMetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  V2ResourceMetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2ResourceMetricStatus build() {
    V2ResourceMetricStatus buildable = new V2ResourceMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setName(fluent.getName());
    return buildable;
  }
  
}