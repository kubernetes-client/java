package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3FlowSchemaConditionBuilder extends V1beta3FlowSchemaConditionFluent<V1beta3FlowSchemaConditionBuilder> implements VisitableBuilder<V1beta3FlowSchemaCondition,V1beta3FlowSchemaConditionBuilder>{
  public V1beta3FlowSchemaConditionBuilder() {
    this(new V1beta3FlowSchemaCondition());
  }
  
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaConditionFluent<?> fluent) {
    this(fluent, new V1beta3FlowSchemaCondition());
  }
  
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaConditionFluent<?> fluent,V1beta3FlowSchemaCondition instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3FlowSchemaConditionBuilder(V1beta3FlowSchemaCondition instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3FlowSchemaConditionFluent<?> fluent;
  
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