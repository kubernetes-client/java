package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2PriorityLevelConfigurationStatusBuilder extends V1beta2PriorityLevelConfigurationStatusFluentImpl<V1beta2PriorityLevelConfigurationStatusBuilder> implements VisitableBuilder<V1beta2PriorityLevelConfigurationStatus,V1beta2PriorityLevelConfigurationStatusBuilder>{
  public V1beta2PriorityLevelConfigurationStatusBuilder() {
    this(false);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(Boolean validationEnabled) {
    this(new V1beta2PriorityLevelConfigurationStatus(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2PriorityLevelConfigurationStatus(), validationEnabled);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatusFluent<?> fluent,V1beta2PriorityLevelConfigurationStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatusFluent<?> fluent,V1beta2PriorityLevelConfigurationStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatus instance) {
    this(instance,false);
  }
  public V1beta2PriorityLevelConfigurationStatusBuilder(V1beta2PriorityLevelConfigurationStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2PriorityLevelConfigurationStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2PriorityLevelConfigurationStatus build() {
    V1beta2PriorityLevelConfigurationStatus buildable = new V1beta2PriorityLevelConfigurationStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}