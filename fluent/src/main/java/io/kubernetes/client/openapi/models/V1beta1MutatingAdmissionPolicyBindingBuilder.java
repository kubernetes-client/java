package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1MutatingAdmissionPolicyBindingBuilder extends V1beta1MutatingAdmissionPolicyBindingFluent<V1beta1MutatingAdmissionPolicyBindingBuilder> implements VisitableBuilder<V1beta1MutatingAdmissionPolicyBinding,V1beta1MutatingAdmissionPolicyBindingBuilder>{

  V1beta1MutatingAdmissionPolicyBindingFluent<?> fluent;

  public V1beta1MutatingAdmissionPolicyBindingBuilder() {
    this(new V1beta1MutatingAdmissionPolicyBinding());
  }
  
  public V1beta1MutatingAdmissionPolicyBindingBuilder(V1beta1MutatingAdmissionPolicyBindingFluent<?> fluent) {
    this(fluent, new V1beta1MutatingAdmissionPolicyBinding());
  }
  
  public V1beta1MutatingAdmissionPolicyBindingBuilder(V1beta1MutatingAdmissionPolicyBinding instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1MutatingAdmissionPolicyBindingBuilder(V1beta1MutatingAdmissionPolicyBindingFluent<?> fluent,V1beta1MutatingAdmissionPolicyBinding instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1MutatingAdmissionPolicyBinding build() {
    V1beta1MutatingAdmissionPolicyBinding buildable = new V1beta1MutatingAdmissionPolicyBinding();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}