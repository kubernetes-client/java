package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2FlowSchemaListBuilder extends V1beta2FlowSchemaListFluent<V1beta2FlowSchemaListBuilder> implements VisitableBuilder<V1beta2FlowSchemaList,V1beta2FlowSchemaListBuilder>{
  public V1beta2FlowSchemaListBuilder() {
    this(new V1beta2FlowSchemaList());
  }
  
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaListFluent<?> fluent) {
    this(fluent, new V1beta2FlowSchemaList());
  }
  
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaListFluent<?> fluent,V1beta2FlowSchemaList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2FlowSchemaListFluent<?> fluent;
  
  public V1beta2FlowSchemaList build() {
    V1beta2FlowSchemaList buildable = new V1beta2FlowSchemaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}