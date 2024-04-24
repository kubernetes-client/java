package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingAdmissionPolicySpecBuilder extends V1ValidatingAdmissionPolicySpecFluent<V1ValidatingAdmissionPolicySpecBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicySpec,V1ValidatingAdmissionPolicySpecBuilder>{
  public V1ValidatingAdmissionPolicySpecBuilder() {
    this(new V1ValidatingAdmissionPolicySpec());
  }
  
  public V1ValidatingAdmissionPolicySpecBuilder(V1ValidatingAdmissionPolicySpecFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicySpec());
  }
  
  public V1ValidatingAdmissionPolicySpecBuilder(V1ValidatingAdmissionPolicySpecFluent<?> fluent,V1ValidatingAdmissionPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicySpecBuilder(V1ValidatingAdmissionPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingAdmissionPolicySpecFluent<?> fluent;
  
  public V1ValidatingAdmissionPolicySpec build() {
    V1ValidatingAdmissionPolicySpec buildable = new V1ValidatingAdmissionPolicySpec();
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