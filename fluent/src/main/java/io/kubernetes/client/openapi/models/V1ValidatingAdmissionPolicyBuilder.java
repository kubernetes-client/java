package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingAdmissionPolicyBuilder extends V1ValidatingAdmissionPolicyFluent<V1ValidatingAdmissionPolicyBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicy,V1ValidatingAdmissionPolicyBuilder>{
  public V1ValidatingAdmissionPolicyBuilder() {
    this(new V1ValidatingAdmissionPolicy());
  }
  
  public V1ValidatingAdmissionPolicyBuilder(V1ValidatingAdmissionPolicyFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicy());
  }
  
  public V1ValidatingAdmissionPolicyBuilder(V1ValidatingAdmissionPolicyFluent<?> fluent,V1ValidatingAdmissionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyBuilder(V1ValidatingAdmissionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingAdmissionPolicyFluent<?> fluent;
  
  public V1ValidatingAdmissionPolicy build() {
    V1ValidatingAdmissionPolicy buildable = new V1ValidatingAdmissionPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}