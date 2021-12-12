package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2PodsMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2PodsMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2PodsMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2PodsMetricSource,io.kubernetes.client.openapi.models.V2PodsMetricSourceBuilder>{
  public V2PodsMetricSourceBuilder() {
    this(false);
  }
  public V2PodsMetricSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V2PodsMetricSource(), validationEnabled);
  }
  public V2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2PodsMetricSource(), validationEnabled);
  }
  public V2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2PodsMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2PodsMetricSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2PodsMetricSource instance) {
    this(instance,false);
  }
  public V2PodsMetricSourceBuilder(io.kubernetes.client.openapi.models.V2PodsMetricSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2PodsMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2PodsMetricSource build() {
    V2PodsMetricSource buildable = new V2PodsMetricSource();
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2PodsMetricSourceBuilder that = (V2PodsMetricSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}