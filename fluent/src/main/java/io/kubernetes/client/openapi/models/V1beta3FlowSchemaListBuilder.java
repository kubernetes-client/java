package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3FlowSchemaListBuilder extends V1beta3FlowSchemaListFluent<V1beta3FlowSchemaListBuilder> implements VisitableBuilder<V1beta3FlowSchemaList,V1beta3FlowSchemaListBuilder>{
  public V1beta3FlowSchemaListBuilder() {
    this(new V1beta3FlowSchemaList());
  }
  
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaListFluent<?> fluent) {
    this(fluent, new V1beta3FlowSchemaList());
  }
  
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaListFluent<?> fluent,V1beta3FlowSchemaList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3FlowSchemaListFluent<?> fluent;
  
  public V1beta3FlowSchemaList build() {
    V1beta3FlowSchemaList buildable = new V1beta3FlowSchemaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}