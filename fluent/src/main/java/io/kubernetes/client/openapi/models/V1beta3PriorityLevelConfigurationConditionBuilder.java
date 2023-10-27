package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3PriorityLevelConfigurationConditionBuilder extends V1beta3PriorityLevelConfigurationConditionFluent<V1beta3PriorityLevelConfigurationConditionBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationCondition,V1beta3PriorityLevelConfigurationConditionBuilder>{
  public V1beta3PriorityLevelConfigurationConditionBuilder() {
    this(new V1beta3PriorityLevelConfigurationCondition());
  }
  
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, new V1beta3PriorityLevelConfigurationCondition());
  }
  
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationConditionFluent<?> fluent,V1beta3PriorityLevelConfigurationCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3PriorityLevelConfigurationConditionFluent<?> fluent;
  
  public V1beta3PriorityLevelConfigurationCondition build() {
    V1beta3PriorityLevelConfigurationCondition buildable = new V1beta3PriorityLevelConfigurationCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}