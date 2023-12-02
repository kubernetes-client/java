package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2FlowSchemaBuilder extends V1beta2FlowSchemaFluent<V1beta2FlowSchemaBuilder> implements VisitableBuilder<V1beta2FlowSchema,V1beta2FlowSchemaBuilder>{
  public V1beta2FlowSchemaBuilder() {
    this(new V1beta2FlowSchema());
  }
  
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchemaFluent<?> fluent) {
    this(fluent, new V1beta2FlowSchema());
  }
  
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchemaFluent<?> fluent,V1beta2FlowSchema instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchema instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2FlowSchemaFluent<?> fluent;
  
  public V1beta2FlowSchema build() {
    V1beta2FlowSchema buildable = new V1beta2FlowSchema();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}