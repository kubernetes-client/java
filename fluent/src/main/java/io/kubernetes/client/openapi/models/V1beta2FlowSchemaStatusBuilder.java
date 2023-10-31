package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2FlowSchemaStatusBuilder extends V1beta2FlowSchemaStatusFluent<V1beta2FlowSchemaStatusBuilder> implements VisitableBuilder<V1beta2FlowSchemaStatus,V1beta2FlowSchemaStatusBuilder>{
  public V1beta2FlowSchemaStatusBuilder() {
    this(new V1beta2FlowSchemaStatus());
  }
  
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatusFluent<?> fluent) {
    this(fluent, new V1beta2FlowSchemaStatus());
  }
  
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatusFluent<?> fluent,V1beta2FlowSchemaStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2FlowSchemaStatusFluent<?> fluent;
  
  public V1beta2FlowSchemaStatus build() {
    V1beta2FlowSchemaStatus buildable = new V1beta2FlowSchemaStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}