package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2PriorityLevelConfigurationStatusBuilder extends V1beta2PriorityLevelConfigurationStatusFluent<V1beta2PriorityLevelConfigurationStatusBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationStatus,V1beta2PriorityLevelConfigurationStatusBuilder>{
  public V1beta2PriorityLevelConfigurationStatusBuilder() {
    this(new V1beta2PriorityLevelConfigurationStatus());
  }
  
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, new V1beta2PriorityLevelConfigurationStatus());
  }
  
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatusFluent<?> fluent,V1beta2PriorityLevelConfigurationStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2PriorityLevelConfigurationStatusFluent<?> fluent;
  
  public V1beta2PriorityLevelConfigurationStatus build() {
    V1beta2PriorityLevelConfigurationStatus buildable = new V1beta2PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}