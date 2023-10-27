package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ValidatingAdmissionPolicyBindingBuilder extends V1alpha1ValidatingAdmissionPolicyBindingFluent<V1alpha1ValidatingAdmissionPolicyBindingBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyBinding,V1alpha1ValidatingAdmissionPolicyBindingBuilder>{
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder() {
    this(new V1alpha1ValidatingAdmissionPolicyBinding());
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBindingFluent<?> fluent) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyBinding());
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBindingFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingBuilder(V1alpha1ValidatingAdmissionPolicyBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ValidatingAdmissionPolicyBindingFluent<?> fluent;
  
  public V1alpha1ValidatingAdmissionPolicyBinding build() {
    V1alpha1ValidatingAdmissionPolicyBinding buildable = new V1alpha1ValidatingAdmissionPolicyBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}