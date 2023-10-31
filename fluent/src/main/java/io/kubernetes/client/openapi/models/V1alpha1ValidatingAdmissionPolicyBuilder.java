package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ValidatingAdmissionPolicyBuilder extends V1alpha1ValidatingAdmissionPolicyFluent<V1alpha1ValidatingAdmissionPolicyBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicy,V1alpha1ValidatingAdmissionPolicyBuilder>{
  public V1alpha1ValidatingAdmissionPolicyBuilder() {
    this(new V1alpha1ValidatingAdmissionPolicy());
  }
  
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicyFluent<?> fluent) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicy());
  }
  
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicyFluent<?> fluent,V1alpha1ValidatingAdmissionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ValidatingAdmissionPolicyBuilder(V1alpha1ValidatingAdmissionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ValidatingAdmissionPolicyFluent<?> fluent;
  
  public V1alpha1ValidatingAdmissionPolicy build() {
    V1alpha1ValidatingAdmissionPolicy buildable = new V1alpha1ValidatingAdmissionPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}