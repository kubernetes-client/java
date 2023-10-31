package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NetworkPolicyPortBuilder extends V1NetworkPolicyPortFluent<V1NetworkPolicyPortBuilder> implements VisitableBuilder<V1NetworkPolicyPort,V1NetworkPolicyPortBuilder>{
  public V1NetworkPolicyPortBuilder() {
    this(new V1NetworkPolicyPort());
  }
  
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPortFluent<?> fluent) {
    this(fluent, new V1NetworkPolicyPort());
  }
  
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPortFluent<?> fluent,V1NetworkPolicyPort instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NetworkPolicyPortBuilder(V1NetworkPolicyPort instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NetworkPolicyPortFluent<?> fluent;
  
  public V1NetworkPolicyPort build() {
    V1NetworkPolicyPort buildable = new V1NetworkPolicyPort();
    buildable.setEndPort(fluent.getEndPort());
    buildable.setPort(fluent.getPort());
    buildable.setProtocol(fluent.getProtocol());
    return buildable;
  }
  

}