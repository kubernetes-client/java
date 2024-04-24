package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SleepActionBuilder extends V1SleepActionFluent<V1SleepActionBuilder> implements VisitableBuilder<V1SleepAction,V1SleepActionBuilder>{
  public V1SleepActionBuilder() {
    this(new V1SleepAction());
  }
  
  public V1SleepActionBuilder(V1SleepActionFluent<?> fluent) {
    this(fluent, new V1SleepAction());
  }
  
  public V1SleepActionBuilder(V1SleepActionFluent<?> fluent,V1SleepAction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SleepActionBuilder(V1SleepAction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SleepActionFluent<?> fluent;
  
  public V1SleepAction build() {
    V1SleepAction buildable = new V1SleepAction();
    buildable.setSeconds(fluent.getSeconds());
    return buildable;
  }
  

}