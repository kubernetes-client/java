package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3PolicyRulesWithSubjectsBuilder extends V1beta3PolicyRulesWithSubjectsFluent<V1beta3PolicyRulesWithSubjectsBuilder> implements VisitableBuilder<V1beta3PolicyRulesWithSubjects,V1beta3PolicyRulesWithSubjectsBuilder>{
  public V1beta3PolicyRulesWithSubjectsBuilder() {
    this(new V1beta3PolicyRulesWithSubjects());
  }
  
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjectsFluent<?> fluent) {
    this(fluent, new V1beta3PolicyRulesWithSubjects());
  }
  
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjectsFluent<?> fluent,V1beta3PolicyRulesWithSubjects instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3PolicyRulesWithSubjectsBuilder(V1beta3PolicyRulesWithSubjects instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3PolicyRulesWithSubjectsFluent<?> fluent;
  
  public V1beta3PolicyRulesWithSubjects build() {
    V1beta3PolicyRulesWithSubjects buildable = new V1beta3PolicyRulesWithSubjects();
    buildable.setNonResourceRules(fluent.buildNonResourceRules());
    buildable.setResourceRules(fluent.buildResourceRules());
    buildable.setSubjects(fluent.buildSubjects());
    return buildable;
  }
  

}