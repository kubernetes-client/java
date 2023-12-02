package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ValidatingAdmissionPolicyListBuilder extends V1beta1ValidatingAdmissionPolicyListFluent<V1beta1ValidatingAdmissionPolicyListBuilder> implements VisitableBuilder<V1beta1ValidatingAdmissionPolicyList,V1beta1ValidatingAdmissionPolicyListBuilder>{
  public V1beta1ValidatingAdmissionPolicyListBuilder() {
    this(new V1beta1ValidatingAdmissionPolicyList());
  }
  
  public V1beta1ValidatingAdmissionPolicyListBuilder(V1beta1ValidatingAdmissionPolicyListFluent<?> fluent) {
    this(fluent, new V1beta1ValidatingAdmissionPolicyList());
  }
  
  public V1beta1ValidatingAdmissionPolicyListBuilder(V1beta1ValidatingAdmissionPolicyListFluent<?> fluent,V1beta1ValidatingAdmissionPolicyList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ValidatingAdmissionPolicyListBuilder(V1beta1ValidatingAdmissionPolicyList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ValidatingAdmissionPolicyListFluent<?> fluent;
  
  public V1beta1ValidatingAdmissionPolicyList build() {
    V1beta1ValidatingAdmissionPolicyList buildable = new V1beta1ValidatingAdmissionPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}