package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1GRPCActionBuilder extends io.kubernetes.client.openapi.models.V1GRPCActionFluentImpl<io.kubernetes.client.openapi.models.V1GRPCActionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1GRPCAction,io.kubernetes.client.openapi.models.V1GRPCActionBuilder>{
  public V1GRPCActionBuilder() {
    this(false);
  }
  public V1GRPCActionBuilder(java.lang.Boolean validationEnabled) {
    this(new V1GRPCAction(), validationEnabled);
  }
  public V1GRPCActionBuilder(io.kubernetes.client.openapi.models.V1GRPCActionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1GRPCActionBuilder(io.kubernetes.client.openapi.models.V1GRPCActionFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1GRPCAction(), validationEnabled);
  }
  public V1GRPCActionBuilder(io.kubernetes.client.openapi.models.V1GRPCActionFluent<?> fluent,io.kubernetes.client.openapi.models.V1GRPCAction instance) {
    this(fluent, instance, false);
  }
  public V1GRPCActionBuilder(io.kubernetes.client.openapi.models.V1GRPCActionFluent<?> fluent,io.kubernetes.client.openapi.models.V1GRPCAction instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPort(instance.getPort());

    fluent.withService(instance.getService());

    this.validationEnabled = validationEnabled; 
  }
  public V1GRPCActionBuilder(io.kubernetes.client.openapi.models.V1GRPCAction instance) {
    this(instance,false);
  }
  public V1GRPCActionBuilder(io.kubernetes.client.openapi.models.V1GRPCAction instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withPort(instance.getPort());

    this.withService(instance.getService());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1GRPCActionFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1GRPCAction build() {
    V1GRPCAction buildable = new V1GRPCAction();
    buildable.setPort(fluent.getPort());
    buildable.setService(fluent.getService());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1GRPCActionBuilder that = (V1GRPCActionBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}