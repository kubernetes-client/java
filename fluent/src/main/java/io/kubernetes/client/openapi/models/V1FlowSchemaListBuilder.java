package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlowSchemaListBuilder extends V1FlowSchemaListFluent<V1FlowSchemaListBuilder> implements VisitableBuilder<V1FlowSchemaList,V1FlowSchemaListBuilder>{
  public V1FlowSchemaListBuilder() {
    this(new V1FlowSchemaList());
  }
  
  public V1FlowSchemaListBuilder(V1FlowSchemaListFluent<?> fluent) {
    this(fluent, new V1FlowSchemaList());
  }
  
  public V1FlowSchemaListBuilder(V1FlowSchemaListFluent<?> fluent,V1FlowSchemaList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlowSchemaListBuilder(V1FlowSchemaList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlowSchemaListFluent<?> fluent;
  
  public V1FlowSchemaList build() {
    V1FlowSchemaList buildable = new V1FlowSchemaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}