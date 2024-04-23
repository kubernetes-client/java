package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingAdmissionPolicyBindingListBuilder extends V1ValidatingAdmissionPolicyBindingListFluent<V1ValidatingAdmissionPolicyBindingListBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicyBindingList,V1ValidatingAdmissionPolicyBindingListBuilder>{
  public V1ValidatingAdmissionPolicyBindingListBuilder() {
    this(new V1ValidatingAdmissionPolicyBindingList());
  }
  
  public V1ValidatingAdmissionPolicyBindingListBuilder(V1ValidatingAdmissionPolicyBindingListFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicyBindingList());
  }
  
  public V1ValidatingAdmissionPolicyBindingListBuilder(V1ValidatingAdmissionPolicyBindingListFluent<?> fluent,V1ValidatingAdmissionPolicyBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyBindingListBuilder(V1ValidatingAdmissionPolicyBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingAdmissionPolicyBindingListFluent<?> fluent;
  
  public V1ValidatingAdmissionPolicyBindingList build() {
    V1ValidatingAdmissionPolicyBindingList buildable = new V1ValidatingAdmissionPolicyBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}