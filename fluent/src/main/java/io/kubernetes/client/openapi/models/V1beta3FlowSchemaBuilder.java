package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3FlowSchemaBuilder extends V1beta3FlowSchemaFluent<V1beta3FlowSchemaBuilder> implements VisitableBuilder<V1beta3FlowSchema,V1beta3FlowSchemaBuilder>{
  public V1beta3FlowSchemaBuilder() {
    this(new V1beta3FlowSchema());
  }
  
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchemaFluent<?> fluent) {
    this(fluent, new V1beta3FlowSchema());
  }
  
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchemaFluent<?> fluent,V1beta3FlowSchema instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchema instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3FlowSchemaFluent<?> fluent;
  
  public V1beta3FlowSchema build() {
    V1beta3FlowSchema buildable = new V1beta3FlowSchema();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}