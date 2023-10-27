package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ValidatingAdmissionPolicyBindingBuilder extends V1beta1ValidatingAdmissionPolicyBindingFluent<V1beta1ValidatingAdmissionPolicyBindingBuilder> implements VisitableBuilder<V1beta1ValidatingAdmissionPolicyBinding,V1beta1ValidatingAdmissionPolicyBindingBuilder>{
  public V1beta1ValidatingAdmissionPolicyBindingBuilder() {
    this(new V1beta1ValidatingAdmissionPolicyBinding());
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingBuilder(V1beta1ValidatingAdmissionPolicyBindingFluent<?> fluent) {
    this(fluent, new V1beta1ValidatingAdmissionPolicyBinding());
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingBuilder(V1beta1ValidatingAdmissionPolicyBindingFluent<?> fluent,V1beta1ValidatingAdmissionPolicyBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingBuilder(V1beta1ValidatingAdmissionPolicyBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ValidatingAdmissionPolicyBindingFluent<?> fluent;
  
  public V1beta1ValidatingAdmissionPolicyBinding build() {
    V1beta1ValidatingAdmissionPolicyBinding buildable = new V1beta1ValidatingAdmissionPolicyBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}