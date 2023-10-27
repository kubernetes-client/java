package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ExecActionBuilder extends V1ExecActionFluent<V1ExecActionBuilder> implements VisitableBuilder<V1ExecAction,V1ExecActionBuilder>{
  public V1ExecActionBuilder() {
    this(new V1ExecAction());
  }
  
  public V1ExecActionBuilder(V1ExecActionFluent<?> fluent) {
    this(fluent, new V1ExecAction());
  }
  
  public V1ExecActionBuilder(V1ExecActionFluent<?> fluent,V1ExecAction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ExecActionBuilder(V1ExecAction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ExecActionFluent<?> fluent;
  
  public V1ExecAction build() {
    V1ExecAction buildable = new V1ExecAction();
    buildable.setCommand(fluent.getCommand());
    return buildable;
  }
  

}