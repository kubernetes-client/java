package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlowSchemaStatusBuilder extends V1FlowSchemaStatusFluent<V1FlowSchemaStatusBuilder> implements VisitableBuilder<V1FlowSchemaStatus,V1FlowSchemaStatusBuilder>{
  public V1FlowSchemaStatusBuilder() {
    this(new V1FlowSchemaStatus());
  }
  
  public V1FlowSchemaStatusBuilder(V1FlowSchemaStatusFluent<?> fluent) {
    this(fluent, new V1FlowSchemaStatus());
  }
  
  public V1FlowSchemaStatusBuilder(V1FlowSchemaStatusFluent<?> fluent,V1FlowSchemaStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlowSchemaStatusBuilder(V1FlowSchemaStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlowSchemaStatusFluent<?> fluent;
  
  public V1FlowSchemaStatus build() {
    V1FlowSchemaStatus buildable = new V1FlowSchemaStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}