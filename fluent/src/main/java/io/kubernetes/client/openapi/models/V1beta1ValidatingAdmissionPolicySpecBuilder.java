package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ValidatingAdmissionPolicySpecBuilder extends V1beta1ValidatingAdmissionPolicySpecFluent<V1beta1ValidatingAdmissionPolicySpecBuilder> implements VisitableBuilder<V1beta1ValidatingAdmissionPolicySpec,V1beta1ValidatingAdmissionPolicySpecBuilder>{
  public V1beta1ValidatingAdmissionPolicySpecBuilder() {
    this(new V1beta1ValidatingAdmissionPolicySpec());
  }
  
  public V1beta1ValidatingAdmissionPolicySpecBuilder(V1beta1ValidatingAdmissionPolicySpecFluent<?> fluent) {
    this(fluent, new V1beta1ValidatingAdmissionPolicySpec());
  }
  
  public V1beta1ValidatingAdmissionPolicySpecBuilder(V1beta1ValidatingAdmissionPolicySpecFluent<?> fluent,V1beta1ValidatingAdmissionPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ValidatingAdmissionPolicySpecBuilder(V1beta1ValidatingAdmissionPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ValidatingAdmissionPolicySpecFluent<?> fluent;
  
  public V1beta1ValidatingAdmissionPolicySpec build() {
    V1beta1ValidatingAdmissionPolicySpec buildable = new V1beta1ValidatingAdmissionPolicySpec();
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