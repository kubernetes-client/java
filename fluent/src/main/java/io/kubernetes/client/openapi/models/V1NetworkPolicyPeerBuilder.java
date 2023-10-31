package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NetworkPolicyPeerBuilder extends V1NetworkPolicyPeerFluent<V1NetworkPolicyPeerBuilder> implements VisitableBuilder<V1NetworkPolicyPeer,V1NetworkPolicyPeerBuilder>{
  public V1NetworkPolicyPeerBuilder() {
    this(new V1NetworkPolicyPeer());
  }
  
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeerFluent<?> fluent) {
    this(fluent, new V1NetworkPolicyPeer());
  }
  
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeerFluent<?> fluent,V1NetworkPolicyPeer instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeer instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NetworkPolicyPeerFluent<?> fluent;
  
  public V1NetworkPolicyPeer build() {
    V1NetworkPolicyPeer buildable = new V1NetworkPolicyPeer();
    buildable.setIpBlock(fluent.buildIpBlock());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setPodSelector(fluent.buildPodSelector());
    return buildable;
  }
  

}