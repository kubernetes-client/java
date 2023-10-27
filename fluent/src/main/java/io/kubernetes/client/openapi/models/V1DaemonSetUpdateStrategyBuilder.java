package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DaemonSetUpdateStrategyBuilder extends V1DaemonSetUpdateStrategyFluent<V1DaemonSetUpdateStrategyBuilder> implements VisitableBuilder<V1DaemonSetUpdateStrategy,V1DaemonSetUpdateStrategyBuilder>{
  public V1DaemonSetUpdateStrategyBuilder() {
    this(new V1DaemonSetUpdateStrategy());
  }
  
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent) {
    this(fluent, new V1DaemonSetUpdateStrategy());
  }
  
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategyFluent<?> fluent,V1DaemonSetUpdateStrategy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DaemonSetUpdateStrategyBuilder(V1DaemonSetUpdateStrategy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DaemonSetUpdateStrategyFluent<?> fluent;
  
  public V1DaemonSetUpdateStrategy build() {
    V1DaemonSetUpdateStrategy buildable = new V1DaemonSetUpdateStrategy();
    buildable.setRollingUpdate(fluent.buildRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}