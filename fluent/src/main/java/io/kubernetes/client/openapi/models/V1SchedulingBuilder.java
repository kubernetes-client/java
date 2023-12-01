package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SchedulingBuilder extends V1SchedulingFluent<V1SchedulingBuilder> implements VisitableBuilder<V1Scheduling,V1SchedulingBuilder>{
  public V1SchedulingBuilder() {
    this(new V1Scheduling());
  }
  
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent) {
    this(fluent, new V1Scheduling());
  }
  
  public V1SchedulingBuilder(V1SchedulingFluent<?> fluent,V1Scheduling instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SchedulingBuilder(V1Scheduling instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SchedulingFluent<?> fluent;
  
  public V1Scheduling build() {
    V1Scheduling buildable = new V1Scheduling();
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setTolerations(fluent.buildTolerations());
    return buildable;
  }
  

}