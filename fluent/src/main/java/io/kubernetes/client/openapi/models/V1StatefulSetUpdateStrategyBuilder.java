package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1StatefulSetUpdateStrategyBuilder extends V1StatefulSetUpdateStrategyFluent<V1StatefulSetUpdateStrategyBuilder> implements VisitableBuilder<V1StatefulSetUpdateStrategy,V1StatefulSetUpdateStrategyBuilder>{
  public V1StatefulSetUpdateStrategyBuilder() {
    this(new V1StatefulSetUpdateStrategy());
  }
  
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent) {
    this(fluent, new V1StatefulSetUpdateStrategy());
  }
  
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategyFluent<?> fluent,V1StatefulSetUpdateStrategy instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1StatefulSetUpdateStrategyBuilder(V1StatefulSetUpdateStrategy instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1StatefulSetUpdateStrategyFluent<?> fluent;
  
  public V1StatefulSetUpdateStrategy build() {
    V1StatefulSetUpdateStrategy buildable = new V1StatefulSetUpdateStrategy();
    buildable.setRollingUpdate(fluent.buildRollingUpdate());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}