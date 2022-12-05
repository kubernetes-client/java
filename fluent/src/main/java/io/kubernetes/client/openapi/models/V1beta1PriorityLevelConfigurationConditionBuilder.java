package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1PriorityLevelConfigurationConditionBuilder extends V1beta1PriorityLevelConfigurationConditionFluentImpl<V1beta1PriorityLevelConfigurationConditionBuilder> implements VisitableBuilder<V1beta1PriorityLevelConfigurationCondition,V1beta1PriorityLevelConfigurationConditionBuilder>{
  public V1beta1PriorityLevelConfigurationConditionBuilder() {
    this(false);
  }
  public V1beta1PriorityLevelConfigurationConditionBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationCondition(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationConditionBuilder(V1beta1PriorityLevelConfigurationConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PriorityLevelConfigurationConditionBuilder(V1beta1PriorityLevelConfigurationConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationCondition(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationConditionBuilder(V1beta1PriorityLevelConfigurationConditionFluent<?> fluent,V1beta1PriorityLevelConfigurationCondition instance) {
    this(fluent, instance, false);
  }
  public V1beta1PriorityLevelConfigurationConditionBuilder(V1beta1PriorityLevelConfigurationConditionFluent<?> fluent,V1beta1PriorityLevelConfigurationCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PriorityLevelConfigurationConditionBuilder(V1beta1PriorityLevelConfigurationCondition instance) {
    this(instance,false);
  }
  public V1beta1PriorityLevelConfigurationConditionBuilder(V1beta1PriorityLevelConfigurationCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1PriorityLevelConfigurationConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1PriorityLevelConfigurationCondition build() {
    V1beta1PriorityLevelConfigurationCondition buildable = new V1beta1PriorityLevelConfigurationCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}