package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2FlowSchemaConditionBuilder extends V1beta2FlowSchemaConditionFluentImpl<V1beta2FlowSchemaConditionBuilder> implements VisitableBuilder<V1beta2FlowSchemaCondition,V1beta2FlowSchemaConditionBuilder>{
  public V1beta2FlowSchemaConditionBuilder() {
    this(false);
  }
  public V1beta2FlowSchemaConditionBuilder(Boolean validationEnabled) {
    this(new V1beta2FlowSchemaCondition(), validationEnabled);
  }
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchemaCondition(), validationEnabled);
  }
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaConditionFluent<?> fluent,V1beta2FlowSchemaCondition instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaConditionFluent<?> fluent,V1beta2FlowSchemaCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaCondition instance) {
    this(instance,false);
  }
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2FlowSchemaConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2FlowSchemaCondition build() {
    V1beta2FlowSchemaCondition buildable = new V1beta2FlowSchemaCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}