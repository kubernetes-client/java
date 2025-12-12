package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1MutatingAdmissionPolicySpecBuilder extends V1beta1MutatingAdmissionPolicySpecFluent<V1beta1MutatingAdmissionPolicySpecBuilder> implements VisitableBuilder<V1beta1MutatingAdmissionPolicySpec,V1beta1MutatingAdmissionPolicySpecBuilder>{

  V1beta1MutatingAdmissionPolicySpecFluent<?> fluent;

  public V1beta1MutatingAdmissionPolicySpecBuilder() {
    this(new V1beta1MutatingAdmissionPolicySpec());
  }
  
  public V1beta1MutatingAdmissionPolicySpecBuilder(V1beta1MutatingAdmissionPolicySpecFluent<?> fluent) {
    this(fluent, new V1beta1MutatingAdmissionPolicySpec());
  }
  
  public V1beta1MutatingAdmissionPolicySpecBuilder(V1beta1MutatingAdmissionPolicySpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1MutatingAdmissionPolicySpecBuilder(V1beta1MutatingAdmissionPolicySpecFluent<?> fluent,V1beta1MutatingAdmissionPolicySpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1MutatingAdmissionPolicySpec build() {
    V1beta1MutatingAdmissionPolicySpec buildable = new V1beta1MutatingAdmissionPolicySpec();
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