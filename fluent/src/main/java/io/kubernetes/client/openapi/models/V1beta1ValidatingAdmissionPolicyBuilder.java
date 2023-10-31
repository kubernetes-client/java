package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ValidatingAdmissionPolicyBuilder extends V1beta1ValidatingAdmissionPolicyFluent<V1beta1ValidatingAdmissionPolicyBuilder> implements VisitableBuilder<V1beta1ValidatingAdmissionPolicy,V1beta1ValidatingAdmissionPolicyBuilder>{
  public V1beta1ValidatingAdmissionPolicyBuilder() {
    this(new V1beta1ValidatingAdmissionPolicy());
  }
  
  public V1beta1ValidatingAdmissionPolicyBuilder(V1beta1ValidatingAdmissionPolicyFluent<?> fluent) {
    this(fluent, new V1beta1ValidatingAdmissionPolicy());
  }
  
  public V1beta1ValidatingAdmissionPolicyBuilder(V1beta1ValidatingAdmissionPolicyFluent<?> fluent,V1beta1ValidatingAdmissionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ValidatingAdmissionPolicyBuilder(V1beta1ValidatingAdmissionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ValidatingAdmissionPolicyFluent<?> fluent;
  
  public V1beta1ValidatingAdmissionPolicy build() {
    V1beta1ValidatingAdmissionPolicy buildable = new V1beta1ValidatingAdmissionPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}