package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2PolicyRulesWithSubjectsBuilder extends V1beta2PolicyRulesWithSubjectsFluentImpl<V1beta2PolicyRulesWithSubjectsBuilder> implements VisitableBuilder<V1beta2PolicyRulesWithSubjects,V1beta2PolicyRulesWithSubjectsBuilder>{
  public V1beta2PolicyRulesWithSubjectsBuilder() {
    this(false);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(Boolean validationEnabled) {
    this(new V1beta2PolicyRulesWithSubjects(), validationEnabled);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjectsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjectsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2PolicyRulesWithSubjects(), validationEnabled);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjectsFluent<?> fluent,V1beta2PolicyRulesWithSubjects instance) {
    this(fluent, instance, false);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjectsFluent<?> fluent,V1beta2PolicyRulesWithSubjects instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNonResourceRules(instance.getNonResourceRules());

    fluent.withResourceRules(instance.getResourceRules());

    fluent.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjects instance) {
    this(instance,false);
  }
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjects instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());

    this.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2PolicyRulesWithSubjectsFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2PolicyRulesWithSubjects build() {
    V1beta2PolicyRulesWithSubjects buildable = new V1beta2PolicyRulesWithSubjects();
    buildable.setNonResourceRules(fluent.getNonResourceRules());
    buildable.setResourceRules(fluent.getResourceRules());
    buildable.setSubjects(fluent.getSubjects());
    return buildable;
  }
  
}