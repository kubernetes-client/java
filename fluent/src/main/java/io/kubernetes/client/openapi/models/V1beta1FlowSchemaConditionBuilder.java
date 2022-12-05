package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1FlowSchemaConditionBuilder extends V1beta1FlowSchemaConditionFluentImpl<V1beta1FlowSchemaConditionBuilder> implements VisitableBuilder<V1beta1FlowSchemaCondition,V1beta1FlowSchemaConditionBuilder>{
  public V1beta1FlowSchemaConditionBuilder() {
    this(false);
  }
  public V1beta1FlowSchemaConditionBuilder(Boolean validationEnabled) {
    this(new V1beta1FlowSchemaCondition(), validationEnabled);
  }
  public V1beta1FlowSchemaConditionBuilder(V1beta1FlowSchemaConditionFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1FlowSchemaConditionBuilder(V1beta1FlowSchemaConditionFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1FlowSchemaCondition(), validationEnabled);
  }
  public V1beta1FlowSchemaConditionBuilder(V1beta1FlowSchemaConditionFluent<?> fluent,V1beta1FlowSchemaCondition instance) {
    this(fluent, instance, false);
  }
  public V1beta1FlowSchemaConditionBuilder(V1beta1FlowSchemaConditionFluent<?> fluent,V1beta1FlowSchemaCondition instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withLastTransitionTime(instance.getLastTransitionTime());

    fluent.withMessage(instance.getMessage());

    fluent.withReason(instance.getReason());

    fluent.withStatus(instance.getStatus());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1FlowSchemaConditionBuilder(V1beta1FlowSchemaCondition instance) {
    this(instance,false);
  }
  public V1beta1FlowSchemaConditionBuilder(V1beta1FlowSchemaCondition instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withLastTransitionTime(instance.getLastTransitionTime());

    this.withMessage(instance.getMessage());

    this.withReason(instance.getReason());

    this.withStatus(instance.getStatus());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1FlowSchemaConditionFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1FlowSchemaCondition build() {
    V1beta1FlowSchemaCondition buildable = new V1beta1FlowSchemaCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}