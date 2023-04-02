package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2ObjectMetricSourceBuilder extends V2beta2ObjectMetricSourceFluentImpl<V2beta2ObjectMetricSourceBuilder> implements VisitableBuilder<V2beta2ObjectMetricSource,V2beta2ObjectMetricSourceBuilder>{
  public V2beta2ObjectMetricSourceBuilder() {
    this(false);
  }
  public V2beta2ObjectMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta2ObjectMetricSource(), validationEnabled);
  }
  public V2beta2ObjectMetricSourceBuilder(V2beta2ObjectMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2ObjectMetricSourceBuilder(V2beta2ObjectMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2ObjectMetricSource(), validationEnabled);
  }
  public V2beta2ObjectMetricSourceBuilder(V2beta2ObjectMetricSourceFluent<?> fluent,V2beta2ObjectMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2beta2ObjectMetricSourceBuilder(V2beta2ObjectMetricSourceFluent<?> fluent,V2beta2ObjectMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDescribedObject(instance.getDescribedObject());

    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2ObjectMetricSourceBuilder(V2beta2ObjectMetricSource instance) {
    this(instance,false);
  }
  public V2beta2ObjectMetricSourceBuilder(V2beta2ObjectMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2ObjectMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2ObjectMetricSource build() {
    V2beta2ObjectMetricSource buildable = new V2beta2ObjectMetricSource();
    buildable.setDescribedObject(fluent.getDescribedObject());
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}