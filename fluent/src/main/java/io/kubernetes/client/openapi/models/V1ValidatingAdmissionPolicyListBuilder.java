package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ValidatingAdmissionPolicyListBuilder extends V1ValidatingAdmissionPolicyListFluent<V1ValidatingAdmissionPolicyListBuilder> implements VisitableBuilder<V1ValidatingAdmissionPolicyList,V1ValidatingAdmissionPolicyListBuilder>{
  public V1ValidatingAdmissionPolicyListBuilder() {
    this(new V1ValidatingAdmissionPolicyList());
  }
  
  public V1ValidatingAdmissionPolicyListBuilder(V1ValidatingAdmissionPolicyListFluent<?> fluent) {
    this(fluent, new V1ValidatingAdmissionPolicyList());
  }
  
  public V1ValidatingAdmissionPolicyListBuilder(V1ValidatingAdmissionPolicyListFluent<?> fluent,V1ValidatingAdmissionPolicyList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ValidatingAdmissionPolicyListBuilder(V1ValidatingAdmissionPolicyList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ValidatingAdmissionPolicyListFluent<?> fluent;
  
  public V1ValidatingAdmissionPolicyList build() {
    V1ValidatingAdmissionPolicyList buildable = new V1ValidatingAdmissionPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}