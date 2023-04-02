package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1PolicyRulesWithSubjectsBuilder extends V1beta1PolicyRulesWithSubjectsFluentImpl<V1beta1PolicyRulesWithSubjectsBuilder> implements VisitableBuilder<V1beta1PolicyRulesWithSubjects,V1beta1PolicyRulesWithSubjectsBuilder>{
  public V1beta1PolicyRulesWithSubjectsBuilder() {
    this(false);
  }
  public V1beta1PolicyRulesWithSubjectsBuilder(Boolean validationEnabled) {
    this(new V1beta1PolicyRulesWithSubjects(), validationEnabled);
  }
  public V1beta1PolicyRulesWithSubjectsBuilder(V1beta1PolicyRulesWithSubjectsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PolicyRulesWithSubjectsBuilder(V1beta1PolicyRulesWithSubjectsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1PolicyRulesWithSubjects(), validationEnabled);
  }
  public V1beta1PolicyRulesWithSubjectsBuilder(V1beta1PolicyRulesWithSubjectsFluent<?> fluent,V1beta1PolicyRulesWithSubjects instance) {
    this(fluent, instance, false);
  }
  public V1beta1PolicyRulesWithSubjectsBuilder(V1beta1PolicyRulesWithSubjectsFluent<?> fluent,V1beta1PolicyRulesWithSubjects instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNonResourceRules(instance.getNonResourceRules());

    fluent.withResourceRules(instance.getResourceRules());

    fluent.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PolicyRulesWithSubjectsBuilder(V1beta1PolicyRulesWithSubjects instance) {
    this(instance,false);
  }
  public V1beta1PolicyRulesWithSubjectsBuilder(V1beta1PolicyRulesWithSubjects instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNonResourceRules(instance.getNonResourceRules());

    this.withResourceRules(instance.getResourceRules());

    this.withSubjects(instance.getSubjects());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1PolicyRulesWithSubjectsFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1PolicyRulesWithSubjects build() {
    V1beta1PolicyRulesWithSubjects buildable = new V1beta1PolicyRulesWithSubjects();
    buildable.setNonResourceRules(fluent.getNonResourceRules());
    buildable.setResourceRules(fluent.getResourceRules());
    buildable.setSubjects(fluent.getSubjects());
    return buildable;
  }
  
}