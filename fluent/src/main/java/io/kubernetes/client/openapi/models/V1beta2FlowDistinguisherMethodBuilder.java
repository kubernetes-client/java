package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2FlowDistinguisherMethodBuilder extends io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluentImpl<io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod,io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodBuilder>{
  public V1beta2FlowDistinguisherMethodBuilder() {
    this(false);
  }
  public V1beta2FlowDistinguisherMethodBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2FlowDistinguisherMethod(), validationEnabled);
  }
  public V1beta2FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2FlowDistinguisherMethod(), validationEnabled);
  }
  public V1beta2FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance) {
    this(instance,false);
  }
  public V1beta2FlowDistinguisherMethodBuilder(io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethodFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2FlowDistinguisherMethod build() {
    V1beta2FlowDistinguisherMethod buildable = new V1beta2FlowDistinguisherMethod();
    buildable.setType(fluent.getType());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2FlowDistinguisherMethodBuilder that = (V1beta2FlowDistinguisherMethodBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}