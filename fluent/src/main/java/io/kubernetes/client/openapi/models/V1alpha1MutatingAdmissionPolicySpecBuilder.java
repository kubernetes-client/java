package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MutatingAdmissionPolicySpecBuilder extends V1alpha1MutatingAdmissionPolicySpecFluent<V1alpha1MutatingAdmissionPolicySpecBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicySpec,V1alpha1MutatingAdmissionPolicySpecBuilder>{
  public V1alpha1MutatingAdmissionPolicySpecBuilder() {
    this(new V1alpha1MutatingAdmissionPolicySpec());
  }
  
  public V1alpha1MutatingAdmissionPolicySpecBuilder(V1alpha1MutatingAdmissionPolicySpecFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicySpec());
  }
  
  public V1alpha1MutatingAdmissionPolicySpecBuilder(V1alpha1MutatingAdmissionPolicySpecFluent<?> fluent,V1alpha1MutatingAdmissionPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicySpecBuilder(V1alpha1MutatingAdmissionPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MutatingAdmissionPolicySpecFluent<?> fluent;
  
  public V1alpha1MutatingAdmissionPolicySpec build() {
    V1alpha1MutatingAdmissionPolicySpec buildable = new V1alpha1MutatingAdmissionPolicySpec();
    buildable.setFailurePolicy(fluent.getFailurePolicy());
    buildable.setMatchConditions(fluent.buildMatchConditions());
    buildable.setMatchConstraints(fluent.buildMatchConstraints());
    buildable.setMutations(fluent.buildMutations());
    buildable.setParamKind(fluent.buildParamKind());
    buildable.setReinvocationPolicy(fluent.getReinvocationPolicy());
    buildable.setVariables(fluent.buildVariables());
    return buildable;
  }
  

}