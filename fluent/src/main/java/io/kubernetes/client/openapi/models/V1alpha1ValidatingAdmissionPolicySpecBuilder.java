package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ValidatingAdmissionPolicySpecBuilder extends V1alpha1ValidatingAdmissionPolicySpecFluentImpl<V1alpha1ValidatingAdmissionPolicySpecBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicySpec,V1alpha1ValidatingAdmissionPolicySpecBuilder>{
  public V1alpha1ValidatingAdmissionPolicySpecBuilder() {
    this(false);
  }
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(Boolean validationEnabled) {
    this(new V1alpha1ValidatingAdmissionPolicySpec(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicySpec(), validationEnabled);
  }
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpecFluent<?> fluent,V1alpha1ValidatingAdmissionPolicySpec instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpecFluent<?> fluent,V1alpha1ValidatingAdmissionPolicySpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withAuditAnnotations(instance.getAuditAnnotations());
      fluent.withFailurePolicy(instance.getFailurePolicy());
      fluent.withMatchConditions(instance.getMatchConditions());
      fluent.withMatchConstraints(instance.getMatchConstraints());
      fluent.withParamKind(instance.getParamKind());
      fluent.withValidations(instance.getValidations());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpec instance) {
    this(instance,false);
  }
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withAuditAnnotations(instance.getAuditAnnotations());
      this.withFailurePolicy(instance.getFailurePolicy());
      this.withMatchConditions(instance.getMatchConditions());
      this.withMatchConstraints(instance.getMatchConstraints());
      this.withParamKind(instance.getParamKind());
      this.withValidations(instance.getValidations());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ValidatingAdmissionPolicySpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ValidatingAdmissionPolicySpec build() {
    V1alpha1ValidatingAdmissionPolicySpec buildable = new V1alpha1ValidatingAdmissionPolicySpec();
    buildable.setAuditAnnotations(fluent.getAuditAnnotations());
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchConditions(fluent.getMatchConditions());
    buildable.setMatchConstraints(fluent.getMatchConstraints());
    buildable.setParamKind(fluent.getParamKind());
    buildable.setValidations(fluent.getValidations());
    return buildable;
  }
  
}