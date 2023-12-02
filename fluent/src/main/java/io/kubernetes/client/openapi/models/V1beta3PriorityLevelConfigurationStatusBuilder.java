package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3PriorityLevelConfigurationStatusBuilder extends V1beta3PriorityLevelConfigurationStatusFluent<V1beta3PriorityLevelConfigurationStatusBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationStatus,V1beta3PriorityLevelConfigurationStatusBuilder>{
  public V1beta3PriorityLevelConfigurationStatusBuilder() {
    this(new V1beta3PriorityLevelConfigurationStatus());
  }
  
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, new V1beta3PriorityLevelConfigurationStatus());
  }
  
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatusFluent<?> fluent,V1beta3PriorityLevelConfigurationStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3PriorityLevelConfigurationStatusFluent<?> fluent;
  
  public V1beta3PriorityLevelConfigurationStatus build() {
    V1beta3PriorityLevelConfigurationStatus buildable = new V1beta3PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}