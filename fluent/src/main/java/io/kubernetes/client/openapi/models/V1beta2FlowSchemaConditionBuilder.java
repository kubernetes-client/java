package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2FlowSchemaConditionBuilder extends V1beta2FlowSchemaConditionFluent<V1beta2FlowSchemaConditionBuilder> implements VisitableBuilder<V1beta2FlowSchemaCondition,V1beta2FlowSchemaConditionBuilder>{
  public V1beta2FlowSchemaConditionBuilder() {
    this(new V1beta2FlowSchemaCondition());
  }
  
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaConditionFluent<?> fluent) {
    this(fluent, new V1beta2FlowSchemaCondition());
  }
  
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaConditionFluent<?> fluent,V1beta2FlowSchemaCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2FlowSchemaConditionBuilder(V1beta2FlowSchemaCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2FlowSchemaConditionFluent<?> fluent;
  
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