package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2PriorityLevelConfigurationConditionBuilder extends V1beta2PriorityLevelConfigurationConditionFluent<V1beta2PriorityLevelConfigurationConditionBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationCondition,V1beta2PriorityLevelConfigurationConditionBuilder>{
  public V1beta2PriorityLevelConfigurationConditionBuilder() {
    this(new V1beta2PriorityLevelConfigurationCondition());
  }
  
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, new V1beta2PriorityLevelConfigurationCondition());
  }
  
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationConditionFluent<?> fluent,V1beta2PriorityLevelConfigurationCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2PriorityLevelConfigurationConditionFluent<?> fluent;
  
  public V1beta2PriorityLevelConfigurationCondition build() {
    V1beta2PriorityLevelConfigurationCondition buildable = new V1beta2PriorityLevelConfigurationCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}