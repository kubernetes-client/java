package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingAdmissionPolicyBindingBuilder extends V1ValidatingAdmissionPolicyBindingFluent<V1ValidatingAdmissionPolicyBindingBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicyBinding,V1ValidatingAdmissionPolicyBindingBuilder>{
  public V1ValidatingAdmissionPolicyBindingBuilder() {
    this(new V1ValidatingAdmissionPolicyBinding());
  }
  
  public V1ValidatingAdmissionPolicyBindingBuilder(V1ValidatingAdmissionPolicyBindingFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicyBinding());
  }
  
  public V1ValidatingAdmissionPolicyBindingBuilder(V1ValidatingAdmissionPolicyBindingFluent<?> fluent,V1ValidatingAdmissionPolicyBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyBindingBuilder(V1ValidatingAdmissionPolicyBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingAdmissionPolicyBindingFluent<?> fluent;
  
  public V1ValidatingAdmissionPolicyBinding build() {
    V1ValidatingAdmissionPolicyBinding buildable = new V1ValidatingAdmissionPolicyBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}