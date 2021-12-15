package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2ObjectMetricSourceBuilder extends io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluentImpl<io.kubernetes.client.openapi.models.V2ObjectMetricSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2ObjectMetricSource,io.kubernetes.client.openapi.models.V2ObjectMetricSourceBuilder>{
  public V2ObjectMetricSourceBuilder() {
    this(false);
  }
  public V2ObjectMetricSourceBuilder(java.lang.Boolean validationEnabled) {
    this(new V2ObjectMetricSource(), validationEnabled);
  }
  public V2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2ObjectMetricSource(), validationEnabled);
  }
  public V2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2ObjectMetricSource instance) {
    this(fluent, instance, false);
  }
  public V2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V2ObjectMetricSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDescribedObject(instance.getDescribedObject());

    fluent.withMetric(instance.getMetric());

    fluent.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  public V2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ObjectMetricSource instance) {
    this(instance,false);
  }
  public V2ObjectMetricSourceBuilder(io.kubernetes.client.openapi.models.V2ObjectMetricSource instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withDescribedObject(instance.getDescribedObject());

    this.withMetric(instance.getMetric());

    this.withTarget(instance.getTarget());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2ObjectMetricSourceFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2ObjectMetricSource build() {
    V2ObjectMetricSource buildable = new V2ObjectMetricSource();
    buildable.setDescribedObject(fluent.getDescribedObject());
    buildable.setMetric(fluent.getMetric());
    buildable.setTarget(fluent.getTarget());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2ObjectMetricSourceBuilder that = (V2ObjectMetricSourceBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}