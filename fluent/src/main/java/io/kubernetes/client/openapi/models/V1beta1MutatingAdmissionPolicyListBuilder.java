package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1MutatingAdmissionPolicyListBuilder extends V1beta1MutatingAdmissionPolicyListFluent<V1beta1MutatingAdmissionPolicyListBuilder> implements VisitableBuilder<V1beta1MutatingAdmissionPolicyList,V1beta1MutatingAdmissionPolicyListBuilder>{

  V1beta1MutatingAdmissionPolicyListFluent<?> fluent;

  public V1beta1MutatingAdmissionPolicyListBuilder() {
    this(new V1beta1MutatingAdmissionPolicyList());
  }
  
  public V1beta1MutatingAdmissionPolicyListBuilder(V1beta1MutatingAdmissionPolicyListFluent<?> fluent) {
    this(fluent, new V1beta1MutatingAdmissionPolicyList());
  }
  
  public V1beta1MutatingAdmissionPolicyListBuilder(V1beta1MutatingAdmissionPolicyList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1MutatingAdmissionPolicyListBuilder(V1beta1MutatingAdmissionPolicyListFluent<?> fluent,V1beta1MutatingAdmissionPolicyList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1MutatingAdmissionPolicyList build() {
    V1beta1MutatingAdmissionPolicyList buildable = new V1beta1MutatingAdmissionPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  
}