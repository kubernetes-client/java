package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3PolicyRulesWithSubjectsBuilder extends V1beta3PolicyRulesWithSubjectsFluentImpl<V1beta3PolicyRulesWithSubjectsBuilder> implements VisitableBuilder<V1beta3PolicyRulesWithSubjects,V1beta3PolicyRulesWithSubjectsBuilder>{
  public V1beta3PolicyRulesWithSubjectsBuilder() {
    this(false);
  }
  public V1beta3PolicyRulesWithSubjectsBuilder(Boolean validationEnabled) {
    this(new V1beta3PolicyRulesWithSubjects(), validationEnabled);
  }
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjectsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjectsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3PolicyRulesWithSubjects(), validationEnabled);
  }
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjectsFluent<?> fluent,V1beta3PolicyRulesWithSubjects instance) {
    this(fluent, instance, false);
  }
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjectsFluent<?> fluent,V1beta3PolicyRulesWithSubjects instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withNonResourceRules(instance.getNonResourceRules());
      fluent.withResourceRules(instance.getResourceRules());
      fluent.withSubjects(instance.getSubjects());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjects instance) {
    this(instance,false);
  }
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjects instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withNonResourceRules(instance.getNonResourceRules());
      this.withResourceRules(instance.getResourceRules());
      this.withSubjects(instance.getSubjects());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3PolicyRulesWithSubjectsFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3PolicyRulesWithSubjects build() {
    V1beta3PolicyRulesWithSubjects buildable = new V1beta3PolicyRulesWithSubjects();
    buildable.setNonResourceRules(fluent.getNonResourceRules());
    buildable.setResourceRules(fluent.getResourceRules());
    buildable.setSubjects(fluent.getSubjects());
    return buildable;
  }
  
}