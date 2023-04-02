package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationConditionBuilder extends V1beta2PriorityLevelConfigurationConditionFluentImpl<V1beta2PriorityLevelConfigurationConditionBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationCondition,V1beta2PriorityLevelConfigurationConditionBuilder>{
  public V1beta2PriorityLevelConfigurationConditionBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationCondition(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationCondition(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationConditionFluent<?> fluent,V1beta2PriorityLevelConfigurationCondition instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationConditionFluent<?> fluent,V1beta2PriorityLevelConfigurationCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationCondition instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationConditionBuilder(V1beta2PriorityLevelConfigurationCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2PriorityLevelConfigurationConditionFluent<?> fluent;
  Boolean validationEnabled;
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