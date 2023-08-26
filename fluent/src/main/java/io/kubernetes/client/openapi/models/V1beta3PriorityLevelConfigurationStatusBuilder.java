package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3PriorityLevelConfigurationStatusBuilder extends V1beta3PriorityLevelConfigurationStatusFluentImpl<V1beta3PriorityLevelConfigurationStatusBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationStatus,V1beta3PriorityLevelConfigurationStatusBuilder>{
  public V1beta3PriorityLevelConfigurationStatusBuilder() {
    this(false);
  }
  public V1beta3PriorityLevelConfigurationStatusBuilder(Boolean validationEnabled) {
    this(new V1beta3PriorityLevelConfigurationStatus(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3PriorityLevelConfigurationStatus(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatusFluent<?> fluent,V1beta3PriorityLevelConfigurationStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatusFluent<?> fluent,V1beta3PriorityLevelConfigurationStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withConditions(instance.getConditions());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatus instance) {
    this(instance,false);
  }
  public V1beta3PriorityLevelConfigurationStatusBuilder(V1beta3PriorityLevelConfigurationStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withConditions(instance.getConditions());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3PriorityLevelConfigurationStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3PriorityLevelConfigurationStatus build() {
    V1beta3PriorityLevelConfigurationStatus buildable = new V1beta3PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}