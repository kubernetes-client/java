package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1MutatingAdmissionPolicyBuilder extends V1beta1MutatingAdmissionPolicyFluent<V1beta1MutatingAdmissionPolicyBuilder> implements VisitableBuilder<V1beta1MutatingAdmissionPolicy,V1beta1MutatingAdmissionPolicyBuilder>{
  public V1beta1MutatingAdmissionPolicyBuilder() {
    this(new V1beta1MutatingAdmissionPolicy());
  }
  
  public V1beta1MutatingAdmissionPolicyBuilder(V1beta1MutatingAdmissionPolicyFluent<?> fluent) {
    this(fluent, new V1beta1MutatingAdmissionPolicy());
  }
  
  public V1beta1MutatingAdmissionPolicyBuilder(V1beta1MutatingAdmissionPolicyFluent<?> fluent,V1beta1MutatingAdmissionPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1MutatingAdmissionPolicyBuilder(V1beta1MutatingAdmissionPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1MutatingAdmissionPolicyFluent<?> fluent;
  
  public V1beta1MutatingAdmissionPolicy build() {
    V1beta1MutatingAdmissionPolicy buildable = new V1beta1MutatingAdmissionPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}