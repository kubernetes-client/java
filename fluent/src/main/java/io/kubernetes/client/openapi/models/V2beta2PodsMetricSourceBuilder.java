package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2PodsMetricSourceBuilder extends V2beta2PodsMetricSourceFluentImpl<V2beta2PodsMetricSourceBuilder> implements VisitableBuilder<V2beta2PodsMetricSource,V2beta2PodsMetricSourceBuilder>{
  public V2beta2PodsMetricSourceBuilder() {
    this(false);
  }
  public V2beta2PodsMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2beta2PodsMetricSource(), validationEnabled);
  }
  public V2beta2PodsMetricSourceBuilder(V2beta2PodsMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2PodsMetricSourceBuilder(V2beta2PodsMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2PodsMetricSource(), validationEnabled);
  }
  public V2beta2PodsMetricSourceBuilder(V2beta2PodsMetricSourceFluent<?> fluent,V2beta2PodsMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2beta2PodsMetricSourceBuilder(V2beta2PodsMetricSourceFluent<?> fluent,V2beta2PodsMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2PodsMetricSourceBuilder(V2beta2PodsMetricSource instance) {
    this(instance,false);
  }
  public V2beta2PodsMetricSourceBuilder(V2beta2PodsMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2PodsMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2PodsMetricSource build() {
    V2beta2PodsMetricSource buildable = new V2beta2PodsMetricSource();
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}