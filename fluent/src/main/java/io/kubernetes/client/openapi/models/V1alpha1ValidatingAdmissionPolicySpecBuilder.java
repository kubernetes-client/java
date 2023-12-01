package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ValidatingAdmissionPolicySpecBuilder extends V1alpha1ValidatingAdmissionPolicySpecFluent<V1alpha1ValidatingAdmissionPolicySpecBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicySpec,V1alpha1ValidatingAdmissionPolicySpecBuilder>{
  public V1alpha1ValidatingAdmissionPolicySpecBuilder() {
    this(new V1alpha1ValidatingAdmissionPolicySpec());
  }
  
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpecFluent<?> fluent) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicySpec());
  }
  
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpecFluent<?> fluent,V1alpha1ValidatingAdmissionPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ValidatingAdmissionPolicySpecBuilder(V1alpha1ValidatingAdmissionPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ValidatingAdmissionPolicySpecFluent<?> fluent;
  
  public V1alpha1ValidatingAdmissionPolicySpec build() {
    V1alpha1ValidatingAdmissionPolicySpec buildable = new V1alpha1ValidatingAdmissionPolicySpec();
    buildable.setAuditAnnotations(fluent.buildAuditAnnotations());
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchConditions(fluent.buildMatchConditions());
    buildable.setMatchConstraints(fluent.buildMatchConstraints());
    buildable.setParamKind(fluent.buildParamKind());
    buildable.setValidations(fluent.buildValidations());
    buildable.setVariables(fluent.buildVariables());
    return buildable;
  }
  

}