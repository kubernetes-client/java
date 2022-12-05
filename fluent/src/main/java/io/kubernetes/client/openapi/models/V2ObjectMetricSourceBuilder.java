package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2ObjectMetricSourceBuilder extends V2ObjectMetricSourceFluentImpl<V2ObjectMetricSourceBuilder> implements VisitableBuilder<V2ObjectMetricSource,V2ObjectMetricSourceBuilder>{
  public V2ObjectMetricSourceBuilder() {
    this(false);
  }
  public V2ObjectMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2ObjectMetricSource(), validationEnabled);
  }
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2ObjectMetricSource(), validationEnabled);
  }
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSourceFluent<?> fluent,V2ObjectMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSourceFluent<?> fluent,V2ObjectMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDescribedObject(instance.getDescribedObject());

    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSource instance) {
    this(instance,false);
  }
  public V2ObjectMetricSourceBuilder(V2ObjectMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2ObjectMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2ObjectMetricSource build() {
    V2ObjectMetricSource buildable = new V2ObjectMetricSource();
    buildable.setDescribedObject(fluent.getDescribedObject());
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}