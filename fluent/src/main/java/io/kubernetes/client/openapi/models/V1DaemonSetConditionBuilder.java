package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DaemonSetConditionBuilder extends V1DaemonSetConditionFluent<V1DaemonSetConditionBuilder> implements VisitableBuilder<V1DaemonSetCondition,V1DaemonSetConditionBuilder>{
  public V1DaemonSetConditionBuilder() {
    this(new V1DaemonSetCondition());
  }
  
  public V1DaemonSetConditionBuilder(V1DaemonSetConditionFluent<?> fluent) {
    this(fluent, new V1DaemonSetCondition());
  }
  
  public V1DaemonSetConditionBuilder(V1DaemonSetConditionFluent<?> fluent,V1DaemonSetCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DaemonSetConditionBuilder(V1DaemonSetCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DaemonSetConditionFluent<?> fluent;
  
  public V1DaemonSetCondition build() {
    V1DaemonSetCondition buildable = new V1DaemonSetCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}