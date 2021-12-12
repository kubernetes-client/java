package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2PolicyRulesWithSubjectsBuilder extends io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluentImpl<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects,io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsBuilder>{
  public V1beta2PolicyRulesWithSubjectsBuilder() {
    this(false);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2PolicyRulesWithSubjects(), validationEnabled);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2PolicyRulesWithSubjects(), validationEnabled);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects instance) {
    this(fluent, instance, false);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNonResourceRules(instance.getNonResourceRules());

    fluent.withResourceRules(instance.getResourceRules());

    fluent.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects instance) {
    this(instance,false);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());

    this.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjectsFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2PolicyRulesWithSubjects build() {
    V1beta2PolicyRulesWithSubjects buildable = new V1beta2PolicyRulesWithSubjects();
    buildable.setNonResourceRules(fluent.getNonResourceRules());
    buildable.setResourceRules(fluent.getResourceRules());
    buildable.setSubjects(fluent.getSubjects());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2PolicyRulesWithSubjectsBuilder that = (V1beta2PolicyRulesWithSubjectsBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}