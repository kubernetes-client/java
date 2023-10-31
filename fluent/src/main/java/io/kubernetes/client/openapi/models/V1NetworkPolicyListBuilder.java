package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NetworkPolicyListBuilder extends V1NetworkPolicyListFluent<V1NetworkPolicyListBuilder> implements VisitableBuilder<V1NetworkPolicyList,V1NetworkPolicyListBuilder>{
  public V1NetworkPolicyListBuilder() {
    this(new V1NetworkPolicyList());
  }
  
  public V1NetworkPolicyListBuilder(V1NetworkPolicyListFluent<?> fluent) {
    this(fluent, new V1NetworkPolicyList());
  }
  
  public V1NetworkPolicyListBuilder(V1NetworkPolicyListFluent<?> fluent,V1NetworkPolicyList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NetworkPolicyListBuilder(V1NetworkPolicyList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NetworkPolicyListFluent<?> fluent;
  
  public V1NetworkPolicyList build() {
    V1NetworkPolicyList buildable = new V1NetworkPolicyList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}