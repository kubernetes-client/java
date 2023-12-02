package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TCPSocketActionBuilder extends V1TCPSocketActionFluent<V1TCPSocketActionBuilder> implements VisitableBuilder<V1TCPSocketAction,V1TCPSocketActionBuilder>{
  public V1TCPSocketActionBuilder() {
    this(new V1TCPSocketAction());
  }
  
  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent) {
    this(fluent, new V1TCPSocketAction());
  }
  
  public V1TCPSocketActionBuilder(V1TCPSocketActionFluent<?> fluent,V1TCPSocketAction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TCPSocketActionBuilder(V1TCPSocketAction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TCPSocketActionFluent<?> fluent;
  
  public V1TCPSocketAction build() {
    V1TCPSocketAction buildable = new V1TCPSocketAction();
    buildable.setHost(fluent.getHost());
    buildable.setPort(fluent.getPort());
    return buildable;
  }
  

}