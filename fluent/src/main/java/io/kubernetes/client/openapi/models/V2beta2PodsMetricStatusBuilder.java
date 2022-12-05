package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2beta2PodsMetricStatusBuilder extends V2beta2PodsMetricStatusFluentImpl<V2beta2PodsMetricStatusBuilder> implements VisitableBuilder<V2beta2PodsMetricStatus,V2beta2PodsMetricStatusBuilder>{
  public V2beta2PodsMetricStatusBuilder() {
    this(false);
  }
  public V2beta2PodsMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2beta2PodsMetricStatus(), validationEnabled);
  }
  public V2beta2PodsMetricStatusBuilder(V2beta2PodsMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2beta2PodsMetricStatusBuilder(V2beta2PodsMetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2beta2PodsMetricStatus(), validationEnabled);
  }
  public V2beta2PodsMetricStatusBuilder(V2beta2PodsMetricStatusFluent<?> fluent,V2beta2PodsMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2beta2PodsMetricStatusBuilder(V2beta2PodsMetricStatusFluent<?> fluent,V2beta2PodsMetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  public V2beta2PodsMetricStatusBuilder(V2beta2PodsMetricStatus instance) {
    this(instance,false);
  }
  public V2beta2PodsMetricStatusBuilder(V2beta2PodsMetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  V2beta2PodsMetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2beta2PodsMetricStatus build() {
    V2beta2PodsMetricStatus buildable = new V2beta2PodsMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
  
}