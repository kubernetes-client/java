package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2ResourceMetricSourceBuilder extends V2ResourceMetricSourceFluentImpl<V2ResourceMetricSourceBuilder> implements VisitableBuilder<V2ResourceMetricSource,V2ResourceMetricSourceBuilder>{
  public V2ResourceMetricSourceBuilder() {
    this(false);
  }
  public V2ResourceMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2ResourceMetricSource(), validationEnabled);
  }
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2ResourceMetricSource(), validationEnabled);
  }
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent,V2ResourceMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSourceFluent<?> fluent,V2ResourceMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSource instance) {
    this(instance,false);
  }
  public V2ResourceMetricSourceBuilder(V2ResourceMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2ResourceMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2ResourceMetricSource build() {
    V2ResourceMetricSource buildable = new V2ResourceMetricSource();
    buildable.setName(fluent.getName());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}