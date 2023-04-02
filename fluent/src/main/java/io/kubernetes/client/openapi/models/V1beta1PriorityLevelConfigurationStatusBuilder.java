package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1PriorityLevelConfigurationStatusBuilder extends V1beta1PriorityLevelConfigurationStatusFluentImpl<V1beta1PriorityLevelConfigurationStatusBuilder> implements VisitableBuilder<V1beta1PriorityLevelConfigurationStatus,V1beta1PriorityLevelConfigurationStatusBuilder>{
  public V1beta1PriorityLevelConfigurationStatusBuilder() {
    this(false);
  }
  public V1beta1PriorityLevelConfigurationStatusBuilder(Boolean validationEnabled) {
    this(new V1beta1PriorityLevelConfigurationStatus(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationStatusBuilder(V1beta1PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1PriorityLevelConfigurationStatusBuilder(V1beta1PriorityLevelConfigurationStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1PriorityLevelConfigurationStatus(), validationEnabled);
  }
  public V1beta1PriorityLevelConfigurationStatusBuilder(V1beta1PriorityLevelConfigurationStatusFluent<?> fluent,V1beta1PriorityLevelConfigurationStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta1PriorityLevelConfigurationStatusBuilder(V1beta1PriorityLevelConfigurationStatusFluent<?> fluent,V1beta1PriorityLevelConfigurationStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1PriorityLevelConfigurationStatusBuilder(V1beta1PriorityLevelConfigurationStatus instance) {
    this(instance,false);
  }
  public V1beta1PriorityLevelConfigurationStatusBuilder(V1beta1PriorityLevelConfigurationStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1PriorityLevelConfigurationStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1PriorityLevelConfigurationStatus build() {
    V1beta1PriorityLevelConfigurationStatus buildable = new V1beta1PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}