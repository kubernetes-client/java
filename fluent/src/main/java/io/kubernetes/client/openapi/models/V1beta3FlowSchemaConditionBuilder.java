package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3FlowSchemaConditionBuilder extends V1beta3FlowSchemaConditionFluentImpl<V1beta3FlowSchemaConditionBuilder> implements VisitableBuilder<V1beta3FlowSchemaCondition,V1beta3FlowSchemaConditionBuilder>{
  public V1beta3FlowSchemaConditionBuilder() {
    this(false);
  }
  public V1beta3FlowSchemaConditionBuilder(Boolean validationEnabled) {
    this(new V1beta3FlowSchemaCondition(), validationEnabled);
  }
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3FlowSchemaCondition(), validationEnabled);
  }
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaConditionFluent<?> fluent,V1beta3FlowSchemaCondition instance) {
    this(fluent, instance, false);
  }
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaConditionFluent<?> fluent,V1beta3FlowSchemaCondition instance,Boolean validationEnabled) {
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
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaCondition instance) {
    this(instance,false);
  }
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaCondition instance,Boolean validationEnabled) {
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
  V1beta3FlowSchemaConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3FlowSchemaCondition build() {
    V1beta3FlowSchemaCondition buildable = new V1beta3FlowSchemaCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}