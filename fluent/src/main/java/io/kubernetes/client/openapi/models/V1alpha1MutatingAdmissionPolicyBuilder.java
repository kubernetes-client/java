package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MutatingAdmissionPolicyBuilder extends V1alpha1MutatingAdmissionPolicyFluent<V1alpha1MutatingAdmissionPolicyBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicy,V1alpha1MutatingAdmissionPolicyBuilder>{
  public V1alpha1MutatingAdmissionPolicyBuilder() {
    this(new V1alpha1MutatingAdmissionPolicy());
  }
  
  public V1alpha1MutatingAdmissionPolicyBuilder(V1alpha1MutatingAdmissionPolicyFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicy());
  }
  
  public V1alpha1MutatingAdmissionPolicyBuilder(V1alpha1MutatingAdmissionPolicyFluent<?> fluent,V1alpha1MutatingAdmissionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicyBuilder(V1alpha1MutatingAdmissionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MutatingAdmissionPolicyFluent<?> fluent;
  
  public V1alpha1MutatingAdmissionPolicy build() {
    V1alpha1MutatingAdmissionPolicy buildable = new V1alpha1MutatingAdmissionPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}