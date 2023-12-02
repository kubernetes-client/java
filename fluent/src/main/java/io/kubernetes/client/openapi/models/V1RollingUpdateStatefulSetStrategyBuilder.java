package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RollingUpdateStatefulSetStrategyBuilder extends V1RollingUpdateStatefulSetStrategyFluent<V1RollingUpdateStatefulSetStrategyBuilder> implements VisitableBuilder<V1RollingUpdateStatefulSetStrategy,V1RollingUpdateStatefulSetStrategyBuilder>{
  public V1RollingUpdateStatefulSetStrategyBuilder() {
    this(new V1RollingUpdateStatefulSetStrategy());
  }
  
  public V1RollingUpdateStatefulSetStrategyBuilder(V1RollingUpdateStatefulSetStrategyFluent<?> fluent) {
    this(fluent, new V1RollingUpdateStatefulSetStrategy());
  }
  
  public V1RollingUpdateStatefulSetStrategyBuilder(V1RollingUpdateStatefulSetStrategyFluent<?> fluent,V1RollingUpdateStatefulSetStrategy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RollingUpdateStatefulSetStrategyBuilder(V1RollingUpdateStatefulSetStrategy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RollingUpdateStatefulSetStrategyFluent<?> fluent;
  
  public V1RollingUpdateStatefulSetStrategy build() {
    V1RollingUpdateStatefulSetStrategy buildable = new V1RollingUpdateStatefulSetStrategy();
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    buildable.setPartition(fluent.getPartition());
    return buildable;
  }
  

}