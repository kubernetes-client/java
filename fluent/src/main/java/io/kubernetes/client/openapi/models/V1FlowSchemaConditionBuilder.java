package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlowSchemaConditionBuilder extends V1FlowSchemaConditionFluent<V1FlowSchemaConditionBuilder> implements VisitableBuilder<V1FlowSchemaCondition,V1FlowSchemaConditionBuilder>{
  public V1FlowSchemaConditionBuilder() {
    this(new V1FlowSchemaCondition());
  }
  
  public V1FlowSchemaConditionBuilder(V1FlowSchemaConditionFluent<?> fluent) {
    this(fluent, new V1FlowSchemaCondition());
  }
  
  public V1FlowSchemaConditionBuilder(V1FlowSchemaConditionFluent<?> fluent,V1FlowSchemaCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlowSchemaConditionBuilder(V1FlowSchemaCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlowSchemaConditionFluent<?> fluent;
  
  public V1FlowSchemaCondition build() {
    V1FlowSchemaCondition buildable = new V1FlowSchemaCondition();
    buildable.setLastTransitionTime(fluent.getLastTransitionTime());
    buildable.setMessage(fluent.getMessage());
    buildable.setReason(fluent.getReason());
    buildable.setStatus(fluent.getStatus());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}