package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PolicyRulesWithSubjectsBuilder extends V1PolicyRulesWithSubjectsFluent<V1PolicyRulesWithSubjectsBuilder> implements VisitableBuilder<V1PolicyRulesWithSubjects,V1PolicyRulesWithSubjectsBuilder>{
  public V1PolicyRulesWithSubjectsBuilder() {
    this(new V1PolicyRulesWithSubjects());
  }
  
  public V1PolicyRulesWithSubjectsBuilder(V1PolicyRulesWithSubjectsFluent<?> fluent) {
    this(fluent, new V1PolicyRulesWithSubjects());
  }
  
  public V1PolicyRulesWithSubjectsBuilder(V1PolicyRulesWithSubjectsFluent<?> fluent,V1PolicyRulesWithSubjects instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PolicyRulesWithSubjectsBuilder(V1PolicyRulesWithSubjects instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PolicyRulesWithSubjectsFluent<?> fluent;
  
  public V1PolicyRulesWithSubjects build() {
    V1PolicyRulesWithSubjects buildable = new V1PolicyRulesWithSubjects();
    buildable.setNonResourceRules(fluent.buildNonResourceRules());
    buildable.setResourceRules(fluent.buildResourceRules());
    buildable.setSubjects(fluent.buildSubjects());
    return buildable;
  }
  

}