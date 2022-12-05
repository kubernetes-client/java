package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2ExternalMetricSourceBuilder extends V2ExternalMetricSourceFluentImpl<V2ExternalMetricSourceBuilder> implements VisitableBuilder<V2ExternalMetricSource,V2ExternalMetricSourceBuilder>{
  public V2ExternalMetricSourceBuilder() {
    this(false);
  }
  public V2ExternalMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2ExternalMetricSource(), validationEnabled);
  }
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2ExternalMetricSource(), validationEnabled);
  }
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSourceFluent<?> fluent,V2ExternalMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSourceFluent<?> fluent,V2ExternalMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSource instance) {
    this(instance,false);
  }
  public V2ExternalMetricSourceBuilder(V2ExternalMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2ExternalMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2ExternalMetricSource build() {
    V2ExternalMetricSource buildable = new V2ExternalMetricSource();
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}