package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NetworkPolicyBuilder extends V1NetworkPolicyFluent<V1NetworkPolicyBuilder> implements VisitableBuilder<V1NetworkPolicy,V1NetworkPolicyBuilder>{
  public V1NetworkPolicyBuilder() {
    this(new V1NetworkPolicy());
  }
  
  public V1NetworkPolicyBuilder(V1NetworkPolicyFluent<?> fluent) {
    this(fluent, new V1NetworkPolicy());
  }
  
  public V1NetworkPolicyBuilder(V1NetworkPolicyFluent<?> fluent,V1NetworkPolicy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NetworkPolicyBuilder(V1NetworkPolicy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NetworkPolicyFluent<?> fluent;
  
  public V1NetworkPolicy build() {
    V1NetworkPolicy buildable = new V1NetworkPolicy();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}