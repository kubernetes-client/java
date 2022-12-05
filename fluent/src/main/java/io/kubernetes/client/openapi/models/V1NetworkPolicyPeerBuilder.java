package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NetworkPolicyPeerBuilder extends V1NetworkPolicyPeerFluentImpl<V1NetworkPolicyPeerBuilder> implements VisitableBuilder<V1NetworkPolicyPeer,V1NetworkPolicyPeerBuilder>{
  public V1NetworkPolicyPeerBuilder() {
    this(false);
  }
  public V1NetworkPolicyPeerBuilder(Boolean validationEnabled) {
    this(new V1NetworkPolicyPeer(), validationEnabled);
  }
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeerFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeerFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NetworkPolicyPeer(), validationEnabled);
  }
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeerFluent<?> fluent,V1NetworkPolicyPeer instance) {
    this(fluent, instance, false);
  }
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeerFluent<?> fluent,V1NetworkPolicyPeer instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withIpBlock(instance.getIpBlock());

    fluent.withNamespaceSelector(instance.getNamespaceSelector());

    fluent.withPodSelector(instance.getPodSelector());

    this.validationEnabled = validationEnabled; 
  }
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeer instance) {
    this(instance,false);
  }
  public V1NetworkPolicyPeerBuilder(V1NetworkPolicyPeer instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withIpBlock(instance.getIpBlock());

    this.withNamespaceSelector(instance.getNamespaceSelector());

    this.withPodSelector(instance.getPodSelector());

    this.validationEnabled = validationEnabled; 
  }
  V1NetworkPolicyPeerFluent<?> fluent;
  Boolean validationEnabled;
  public V1NetworkPolicyPeer build() {
    V1NetworkPolicyPeer buildable = new V1NetworkPolicyPeer();
    buildable.setIpBlock(fluent.getIpBlock());
    buildable.setNamespaceSelector(fluent.getNamespaceSelector());
    buildable.setPodSelector(fluent.getPodSelector());
    return buildable;
  }
  
}