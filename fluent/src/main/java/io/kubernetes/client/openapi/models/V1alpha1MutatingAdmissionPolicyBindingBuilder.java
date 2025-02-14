package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MutatingAdmissionPolicyBindingBuilder extends V1alpha1MutatingAdmissionPolicyBindingFluent<V1alpha1MutatingAdmissionPolicyBindingBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicyBinding,V1alpha1MutatingAdmissionPolicyBindingBuilder>{
  public V1alpha1MutatingAdmissionPolicyBindingBuilder() {
    this(new V1alpha1MutatingAdmissionPolicyBinding());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingBuilder(V1alpha1MutatingAdmissionPolicyBindingFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicyBinding());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingBuilder(V1alpha1MutatingAdmissionPolicyBindingFluent<?> fluent,V1alpha1MutatingAdmissionPolicyBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingBuilder(V1alpha1MutatingAdmissionPolicyBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MutatingAdmissionPolicyBindingFluent<?> fluent;
  
  public V1alpha1MutatingAdmissionPolicyBinding build() {
    V1alpha1MutatingAdmissionPolicyBinding buildable = new V1alpha1MutatingAdmissionPolicyBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}