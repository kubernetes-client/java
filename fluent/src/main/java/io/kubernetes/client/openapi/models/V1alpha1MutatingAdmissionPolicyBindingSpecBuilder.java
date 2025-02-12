package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MutatingAdmissionPolicyBindingSpecBuilder extends V1alpha1MutatingAdmissionPolicyBindingSpecFluent<V1alpha1MutatingAdmissionPolicyBindingSpecBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicyBindingSpec,V1alpha1MutatingAdmissionPolicyBindingSpecBuilder>{
  public V1alpha1MutatingAdmissionPolicyBindingSpecBuilder() {
    this(new V1alpha1MutatingAdmissionPolicyBindingSpec());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingSpecBuilder(V1alpha1MutatingAdmissionPolicyBindingSpecFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicyBindingSpec());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingSpecBuilder(V1alpha1MutatingAdmissionPolicyBindingSpecFluent<?> fluent,V1alpha1MutatingAdmissionPolicyBindingSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingSpecBuilder(V1alpha1MutatingAdmissionPolicyBindingSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MutatingAdmissionPolicyBindingSpecFluent<?> fluent;
  
  public V1alpha1MutatingAdmissionPolicyBindingSpec build() {
    V1alpha1MutatingAdmissionPolicyBindingSpec buildable = new V1alpha1MutatingAdmissionPolicyBindingSpec();
    buildable.setMatchResources(fluent.buildMatchResources());
    buildable.setParamRef(fluent.buildParamRef());
    buildable.setPolicyName(fluent.getPolicyName());
    return buildable;
  }
  

}