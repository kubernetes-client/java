package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2FlowSchemaSpecBuilder extends io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluentImpl<io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpec,io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecBuilder>{
  public V1beta2FlowSchemaSpecBuilder() {
    this(false);
  }
  public V1beta2FlowSchemaSpecBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2FlowSchemaSpec(), validationEnabled);
  }
  public V1beta2FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchemaSpec(), validationEnabled);
  }
  public V1beta2FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpec instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDistinguisherMethod(instance.getDistinguisherMethod());

    fluent.withMatchingPrecedence(instance.getMatchingPrecedence());

    fluent.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());

    fluent.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpec instance) {
    this(instance,false);
  }
  public V1beta2FlowSchemaSpecBuilder(io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpec instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withDistinguisherMethod(instance.getDistinguisherMethod());

    this.withMatchingPrecedence(instance.getMatchingPrecedence());

    this.withPriorityLevelConfiguration(instance.getPriorityLevelConfiguration());

    this.withRules(instance.getRules());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpecFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2FlowSchemaSpec build() {
    V1beta2FlowSchemaSpec buildable = new V1beta2FlowSchemaSpec();
    buildable.setDistinguisherMethod(fluent.getDistinguisherMethod());
    buildable.setMatchingPrecedence(fluent.getMatchingPrecedence());
    buildable.setPriorityLevelConfiguration(fluent.getPriorityLevelConfiguration());
    buildable.setRules(fluent.getRules());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2FlowSchemaSpecBuilder that = (V1beta2FlowSchemaSpecBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}