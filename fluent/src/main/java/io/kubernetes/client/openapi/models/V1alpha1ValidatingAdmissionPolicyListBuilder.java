package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ValidatingAdmissionPolicyListBuilder extends V1alpha1ValidatingAdmissionPolicyListFluent<V1alpha1ValidatingAdmissionPolicyListBuilder> implements VisitableBuilder<V1alpha1ValidatingAdmissionPolicyList,V1alpha1ValidatingAdmissionPolicyListBuilder>{
  public V1alpha1ValidatingAdmissionPolicyListBuilder() {
    this(new V1alpha1ValidatingAdmissionPolicyList());
  }
  
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyListFluent<?> fluent) {
    this(fluent, new V1alpha1ValidatingAdmissionPolicyList());
  }
  
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyListFluent<?> fluent,V1alpha1ValidatingAdmissionPolicyList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ValidatingAdmissionPolicyListBuilder(V1alpha1ValidatingAdmissionPolicyList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ValidatingAdmissionPolicyListFluent<?> fluent;
  
  public V1alpha1ValidatingAdmissionPolicyList build() {
    V1alpha1ValidatingAdmissionPolicyList buildable = new V1alpha1ValidatingAdmissionPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}