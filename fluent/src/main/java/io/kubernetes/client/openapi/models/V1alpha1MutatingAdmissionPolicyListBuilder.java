package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MutatingAdmissionPolicyListBuilder extends V1alpha1MutatingAdmissionPolicyListFluent<V1alpha1MutatingAdmissionPolicyListBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicyList,V1alpha1MutatingAdmissionPolicyListBuilder>{
  public V1alpha1MutatingAdmissionPolicyListBuilder() {
    this(new V1alpha1MutatingAdmissionPolicyList());
  }
  
  public V1alpha1MutatingAdmissionPolicyListBuilder(V1alpha1MutatingAdmissionPolicyListFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicyList());
  }
  
  public V1alpha1MutatingAdmissionPolicyListBuilder(V1alpha1MutatingAdmissionPolicyListFluent<?> fluent,V1alpha1MutatingAdmissionPolicyList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicyListBuilder(V1alpha1MutatingAdmissionPolicyList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MutatingAdmissionPolicyListFluent<?> fluent;
  
  public V1alpha1MutatingAdmissionPolicyList build() {
    V1alpha1MutatingAdmissionPolicyList buildable = new V1alpha1MutatingAdmissionPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}