package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3FlowSchemaStatusBuilder extends V1beta3FlowSchemaStatusFluent<V1beta3FlowSchemaStatusBuilder> implements VisitableBuilder<V1beta3FlowSchemaStatus,V1beta3FlowSchemaStatusBuilder>{
  public V1beta3FlowSchemaStatusBuilder() {
    this(new V1beta3FlowSchemaStatus());
  }
  
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatusFluent<?> fluent) {
    this(fluent, new V1beta3FlowSchemaStatus());
  }
  
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatusFluent<?> fluent,V1beta3FlowSchemaStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3FlowSchemaStatusFluent<?> fluent;
  
  public V1beta3FlowSchemaStatus build() {
    V1beta3FlowSchemaStatus buildable = new V1beta3FlowSchemaStatus();
    buildable.setConditions(fluent.buildConditions());
    return buildable;
  }
  

}