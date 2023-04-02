package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2ExternalMetricSourceBuilder extends V2beta2ExternalMetricSourceFluentImpl<V2beta2ExternalMetricSourceBuilder> implements VisitableBuilder<V2beta2ExternalMetricSource,V2beta2ExternalMetricSourceBuilder>{
  public V2beta2ExternalMetricSourceBuilder() {
    this(false);
  }
  public V2beta2ExternalMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta2ExternalMetricSource(), validationEnabled);
  }
  public V2beta2ExternalMetricSourceBuilder(V2beta2ExternalMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2ExternalMetricSourceBuilder(V2beta2ExternalMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2ExternalMetricSource(), validationEnabled);
  }
  public V2beta2ExternalMetricSourceBuilder(V2beta2ExternalMetricSourceFluent<?> fluent,V2beta2ExternalMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2beta2ExternalMetricSourceBuilder(V2beta2ExternalMetricSourceFluent<?> fluent,V2beta2ExternalMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2ExternalMetricSourceBuilder(V2beta2ExternalMetricSource instance) {
    this(instance,false);
  }
  public V2beta2ExternalMetricSourceBuilder(V2beta2ExternalMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2ExternalMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2ExternalMetricSource build() {
    V2beta2ExternalMetricSource buildable = new V2beta2ExternalMetricSource();
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}