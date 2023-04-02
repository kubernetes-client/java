package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V2PodsMetricStatusBuilder extends V2PodsMetricStatusFluentImpl<V2PodsMetricStatusBuilder> implements VisitableBuilder<V2PodsMetricStatus,V2PodsMetricStatusBuilder>{
  public V2PodsMetricStatusBuilder() {
    this(false);
  }
  public V2PodsMetricStatusBuilder(Boolean validationEnabled) {
    this(new V2PodsMetricStatus(), validationEnabled);
  }
  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V2PodsMetricStatus(), validationEnabled);
  }
  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent,V2PodsMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2PodsMetricStatusBuilder(V2PodsMetricStatusFluent<?> fluent,V2PodsMetricStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  public V2PodsMetricStatusBuilder(V2PodsMetricStatus instance) {
    this(instance,false);
  }
  public V2PodsMetricStatusBuilder(V2PodsMetricStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  V2PodsMetricStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V2PodsMetricStatus build() {
    V2PodsMetricStatus buildable = new V2PodsMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
  
}