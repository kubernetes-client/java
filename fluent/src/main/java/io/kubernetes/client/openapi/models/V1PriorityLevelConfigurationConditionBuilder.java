package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PriorityLevelConfigurationConditionBuilder extends V1PriorityLevelConfigurationConditionFluent<V1PriorityLevelConfigurationConditionBuilder> implements VisitableBuilder<V1PriorityLevelConfigurationCondition,V1PriorityLevelConfigurationConditionBuilder>{
  public V1PriorityLevelConfigurationConditionBuilder() {
    this(new V1PriorityLevelConfigurationCondition());
  }
  
  public V1PriorityLevelConfigurationConditionBuilder(V1PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfigurationCondition());
  }
  
  public V1PriorityLevelConfigurationConditionBuilder(V1PriorityLevelConfigurationConditionFluent<?> fluent,V1PriorityLevelConfigurationCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationConditionBuilder(V1PriorityLevelConfigurationCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PriorityLevelConfigurationConditionFluent<?> fluent;
  
  public V1PriorityLevelConfigurationCondition build() {
    V1PriorityLevelConfigurationCondition buildable = new V1PriorityLevelConfigurationCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}