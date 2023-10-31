package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ValidatingAdmissionPolicyBindingListBuilder extends V1alpha1ValidatingAdmissionPolicyBindingListFluent<V1alpha1ValidatingAdmissionPolicyBindingListBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyBindingList,V1alpha1ValidatingAdmissionPolicyBindingListBuilder>{
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder() {
    this(new V1alpha1ValidatingAdmissionPolicyBindingList());
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingListFluent<?> fluent) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyBindingList());
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingListFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ValidatingAdmissionPolicyBindingListBuilder(V1alpha1ValidatingAdmissionPolicyBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ValidatingAdmissionPolicyBindingListFluent<?> fluent;
  
  public V1alpha1ValidatingAdmissionPolicyBindingList build() {
    V1alpha1ValidatingAdmissionPolicyBindingList buildable = new V1alpha1ValidatingAdmissionPolicyBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}