package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1PodOSBuilder extends io.kubernetes.client.openapi.models.V1PodOSFluentImpl<io.kubernetes.client.openapi.models.V1PodOSBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PodOS,io.kubernetes.client.openapi.models.V1PodOSBuilder>{
  public V1PodOSBuilder() {
    this(false);
  }
  public V1PodOSBuilder(java.lang.Boolean validationEnabled) {
    this(new V1PodOS(), validationEnabled);
  }
  public V1PodOSBuilder(io.kubernetes.client.openapi.models.V1PodOSFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodOSBuilder(io.kubernetes.client.openapi.models.V1PodOSFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1PodOS(), validationEnabled);
  }
  public V1PodOSBuilder(io.kubernetes.client.openapi.models.V1PodOSFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodOS instance) {
    this(fluent, instance, false);
  }
  public V1PodOSBuilder(io.kubernetes.client.openapi.models.V1PodOSFluent<?> fluent,io.kubernetes.client.openapi.models.V1PodOS instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodOSBuilder(io.kubernetes.client.openapi.models.V1PodOS instance) {
    this(instance,false);
  }
  public V1PodOSBuilder(io.kubernetes.client.openapi.models.V1PodOS instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withName(instance.getName());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1PodOSFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1PodOS build() {
    V1PodOS buildable = new V1PodOS();
    buildable.setName(fluent.getName());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1PodOSBuilder that = (V1PodOSBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}