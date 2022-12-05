package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2ResourceMetricSourceBuilder extends V2beta2ResourceMetricSourceFluentImpl<V2beta2ResourceMetricSourceBuilder> implements VisitableBuilder<V2beta2ResourceMetricSource,V2beta2ResourceMetricSourceBuilder>{
  public V2beta2ResourceMetricSourceBuilder() {
    this(false);
  }
  public V2beta2ResourceMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta2ResourceMetricSource(), validationEnabled);
  }
  public V2beta2ResourceMetricSourceBuilder(V2beta2ResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2ResourceMetricSourceBuilder(V2beta2ResourceMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2ResourceMetricSource(), validationEnabled);
  }
  public V2beta2ResourceMetricSourceBuilder(V2beta2ResourceMetricSourceFluent<?> fluent,V2beta2ResourceMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2beta2ResourceMetricSourceBuilder(V2beta2ResourceMetricSourceFluent<?> fluent,V2beta2ResourceMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2ResourceMetricSourceBuilder(V2beta2ResourceMetricSource instance) {
    this(instance,false);
  }
  public V2beta2ResourceMetricSourceBuilder(V2beta2ResourceMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2ResourceMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2ResourceMetricSource build() {
    V2beta2ResourceMetricSource buildable = new V2beta2ResourceMetricSource();
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}