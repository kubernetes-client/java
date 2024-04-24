package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlowSchemaBuilder extends V1FlowSchemaFluent<V1FlowSchemaBuilder> implements VisitableBuilder<V1FlowSchema,V1FlowSchemaBuilder>{
  public V1FlowSchemaBuilder() {
    this(new V1FlowSchema());
  }
  
  public V1FlowSchemaBuilder(V1FlowSchemaFluent<?> fluent) {
    this(fluent, new V1FlowSchema());
  }
  
  public V1FlowSchemaBuilder(V1FlowSchemaFluent<?> fluent,V1FlowSchema instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlowSchemaBuilder(V1FlowSchema instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlowSchemaFluent<?> fluent;
  
  public V1FlowSchema build() {
    V1FlowSchema buildable = new V1FlowSchema();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}