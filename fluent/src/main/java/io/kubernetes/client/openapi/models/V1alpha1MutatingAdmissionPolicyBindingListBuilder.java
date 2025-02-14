package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1MutatingAdmissionPolicyBindingListBuilder extends V1alpha1MutatingAdmissionPolicyBindingListFluent<V1alpha1MutatingAdmissionPolicyBindingListBuilder> implements VisitableBuilder<V1alpha1MutatingAdmissionPolicyBindingList,V1alpha1MutatingAdmissionPolicyBindingListBuilder>{
  public V1alpha1MutatingAdmissionPolicyBindingListBuilder() {
    this(new V1alpha1MutatingAdmissionPolicyBindingList());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingListBuilder(V1alpha1MutatingAdmissionPolicyBindingListFluent<?> fluent) {
    this(fluent, new V1alpha1MutatingAdmissionPolicyBindingList());
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingListBuilder(V1alpha1MutatingAdmissionPolicyBindingListFluent<?> fluent,V1alpha1MutatingAdmissionPolicyBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1MutatingAdmissionPolicyBindingListBuilder(V1alpha1MutatingAdmissionPolicyBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1MutatingAdmissionPolicyBindingListFluent<?> fluent;
  
  public V1alpha1MutatingAdmissionPolicyBindingList build() {
    V1alpha1MutatingAdmissionPolicyBindingList buildable = new V1alpha1MutatingAdmissionPolicyBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}