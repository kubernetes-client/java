package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PriorityLevelConfigurationStatusBuilder extends V1PriorityLevelConfigurationStatusFluent<V1PriorityLevelConfigurationStatusBuilder> implements VisitableBuilder<V1PriorityLevelConfigurationStatus,V1PriorityLevelConfigurationStatusBuilder>{
  public V1PriorityLevelConfigurationStatusBuilder() {
    this(new V1PriorityLevelConfigurationStatus());
  }
  
  public V1PriorityLevelConfigurationStatusBuilder(V1PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, new V1PriorityLevelConfigurationStatus());
  }
  
  public V1PriorityLevelConfigurationStatusBuilder(V1PriorityLevelConfigurationStatusFluent<?> fluent,V1PriorityLevelConfigurationStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PriorityLevelConfigurationStatusBuilder(V1PriorityLevelConfigurationStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PriorityLevelConfigurationStatusFluent<?> fluent;
  
  public V1PriorityLevelConfigurationStatus build() {
    V1PriorityLevelConfigurationStatus buildable = new V1PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}