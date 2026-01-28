package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1MutatingAdmissionPolicyBindingListBuilder extends V1beta1MutatingAdmissionPolicyBindingListFluent<V1beta1MutatingAdmissionPolicyBindingListBuilder> implements VisitableBuilder<V1beta1MutatingAdmissionPolicyBindingList,V1beta1MutatingAdmissionPolicyBindingListBuilder>{

  V1beta1MutatingAdmissionPolicyBindingListFluent<?> fluent;

  public V1beta1MutatingAdmissionPolicyBindingListBuilder() {
    this(new V1beta1MutatingAdmissionPolicyBindingList());
  }
  
  public V1beta1MutatingAdmissionPolicyBindingListBuilder(V1beta1MutatingAdmissionPolicyBindingListFluent<?> fluent) {
    this(fluent, new V1beta1MutatingAdmissionPolicyBindingList());
  }
  
  public V1beta1MutatingAdmissionPolicyBindingListBuilder(V1beta1MutatingAdmissionPolicyBindingList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1MutatingAdmissionPolicyBindingListBuilder(V1beta1MutatingAdmissionPolicyBindingListFluent<?> fluent,V1beta1MutatingAdmissionPolicyBindingList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1MutatingAdmissionPolicyBindingList build() {
    V1beta1MutatingAdmissionPolicyBindingList buildable = new V1beta1MutatingAdmissionPolicyBindingList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}