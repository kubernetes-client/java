package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2PodsMetricSourceBuilder extends V2PodsMetricSourceFluentImpl<V2PodsMetricSourceBuilder> implements VisitableBuilder<V2PodsMetricSource,V2PodsMetricSourceBuilder>{
  public V2PodsMetricSourceBuilder() {
    this(false);
  }
  public V2PodsMetricSourceBuilder(Boolean validationEnabled) {
    this(new V2PodsMetricSource(), validationEnabled);
  }
  public V2PodsMetricSourceBuilder(V2PodsMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2PodsMetricSourceBuilder(V2PodsMetricSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2PodsMetricSource(), validationEnabled);
  }
  public V2PodsMetricSourceBuilder(V2PodsMetricSourceFluent<?> fluent,V2PodsMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2PodsMetricSourceBuilder(V2PodsMetricSourceFluent<?> fluent,V2PodsMetricSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2PodsMetricSourceBuilder(V2PodsMetricSource instance) {
    this(instance,false);
  }
  public V2PodsMetricSourceBuilder(V2PodsMetricSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  V2PodsMetricSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V2PodsMetricSource build() {
    V2PodsMetricSource buildable = new V2PodsMetricSource();
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  
}