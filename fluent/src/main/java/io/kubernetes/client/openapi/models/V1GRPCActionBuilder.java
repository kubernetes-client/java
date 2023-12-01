package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1GRPCActionBuilder extends V1GRPCActionFluent<V1GRPCActionBuilder> implements VisitableBuilder<V1GRPCAction,V1GRPCActionBuilder>{
  public V1GRPCActionBuilder() {
    this(new V1GRPCAction());
  }
  
  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent) {
    this(fluent, new V1GRPCAction());
  }
  
  public V1GRPCActionBuilder(V1GRPCActionFluent<?> fluent,V1GRPCAction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1GRPCActionBuilder(V1GRPCAction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1GRPCActionFluent<?> fluent;
  
  public V1GRPCAction build() {
    V1GRPCAction buildable = new V1GRPCAction();
    buildable.setPort(fluent.getPort());
    buildable.setService(fluent.getService());
    return buildable;
  }
  

}