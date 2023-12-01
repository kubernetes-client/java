package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ValidatingAdmissionPolicyBindingListBuilder extends V1beta1ValidatingAdmissionPolicyBindingListFluent<V1beta1ValidatingAdmissionPolicyBindingListBuilder> implements VisitableBuilder<V1beta1ValidatingAdmissionPolicyBindingList,V1beta1ValidatingAdmissionPolicyBindingListBuilder>{
  public V1beta1ValidatingAdmissionPolicyBindingListBuilder() {
    this(new V1beta1ValidatingAdmissionPolicyBindingList());
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingListBuilder(V1beta1ValidatingAdmissionPolicyBindingListFluent<?> fluent) {
    this(fluent, new V1beta1ValidatingAdmissionPolicyBindingList());
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingListBuilder(V1beta1ValidatingAdmissionPolicyBindingListFluent<?> fluent,V1beta1ValidatingAdmissionPolicyBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ValidatingAdmissionPolicyBindingListBuilder(V1beta1ValidatingAdmissionPolicyBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ValidatingAdmissionPolicyBindingListFluent<?> fluent;
  
  public V1beta1ValidatingAdmissionPolicyBindingList build() {
    V1beta1ValidatingAdmissionPolicyBindingList buildable = new V1beta1ValidatingAdmissionPolicyBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}