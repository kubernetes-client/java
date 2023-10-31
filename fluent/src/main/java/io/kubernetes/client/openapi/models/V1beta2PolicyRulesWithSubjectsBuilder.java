package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2PolicyRulesWithSubjectsBuilder extends V1beta2PolicyRulesWithSubjectsFluent<V1beta2PolicyRulesWithSubjectsBuilder> implements VisitableBuilder<V1beta2PolicyRulesWithSubjects,V1beta2PolicyRulesWithSubjectsBuilder>{
  public V1beta2PolicyRulesWithSubjectsBuilder() {
    this(new V1beta2PolicyRulesWithSubjects());
  }
  
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjectsFluent<?> fluent) {
    this(fluent, new V1beta2PolicyRulesWithSubjects());
  }
  
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjectsFluent<?> fluent,V1beta2PolicyRulesWithSubjects instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2PolicyRulesWithSubjectsBuilder(V1beta2PolicyRulesWithSubjects instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2PolicyRulesWithSubjectsFluent<?> fluent;
  
  public V1beta2PolicyRulesWithSubjects build() {
    V1beta2PolicyRulesWithSubjects buildable = new V1beta2PolicyRulesWithSubjects();
    buildable.setNonResourceRules(fluent.buildNonResourceRules());
    buildable.setResourceRules(fluent.buildResourceRules());
    buildable.setSubjects(fluent.buildSubjects());
    return buildable;
  }
  

}