package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3PriorityLevelConfigurationConditionBuilder extends V1beta3PriorityLevelConfigurationConditionFluentImpl<V1beta3PriorityLevelConfigurationConditionBuilder> implements VisitableBuilder<V1beta3PriorityLevelConfigurationCondition,V1beta3PriorityLevelConfigurationConditionBuilder>{
  public V1beta3PriorityLevelConfigurationConditionBuilder() {
    this(false);
  }
  public V1beta3PriorityLevelConfigurationConditionBuilder(Boolean validationEnabled) {
    this(new V1beta3PriorityLevelConfigurationCondition(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3PriorityLevelConfigurationCondition(), validationEnabled);
  }
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationConditionFluent<?> fluent,V1beta3PriorityLevelConfigurationCondition instance) {
    this(fluent, instance, false);
  }
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationConditionFluent<?> fluent,V1beta3PriorityLevelConfigurationCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withLastTransitionTime(instance.getLastTransitionTime());
      fluent.withMessage(instance.getMessage());
      fluent.withReason(instance.getReason());
      fluent.withStatus(instance.getStatus());
      fluent.withType(instance.getType());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationCondition instance) {
    this(instance,false);
  }
  public V1beta3PriorityLevelConfigurationConditionBuilder(V1beta3PriorityLevelConfigurationCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withLastTransitionTime(instance.getLastTransitionTime());
      this.withMessage(instance.getMessage());
      this.withReason(instance.getReason());
      this.withStatus(instance.getStatus());
      this.withType(instance.getType());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3PriorityLevelConfigurationConditionFluent<?> fluent;
  Boolean validationEnabled;
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