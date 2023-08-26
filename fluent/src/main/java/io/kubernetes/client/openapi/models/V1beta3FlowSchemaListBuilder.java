package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3FlowSchemaListBuilder extends V1beta3FlowSchemaListFluentImpl<V1beta3FlowSchemaListBuilder> implements VisitableBuilder<V1beta3FlowSchemaList,V1beta3FlowSchemaListBuilder>{
  public V1beta3FlowSchemaListBuilder() {
    this(false);
  }
  public V1beta3FlowSchemaListBuilder(Boolean validationEnabled) {
    this(new V1beta3FlowSchemaList(), validationEnabled);
  }
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3FlowSchemaList(), validationEnabled);
  }
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaListFluent<?> fluent,V1beta3FlowSchemaList instance) {
    this(fluent, instance, false);
  }
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaListFluent<?> fluent,V1beta3FlowSchemaList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withItems(instance.getItems());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaList instance) {
    this(instance,false);
  }
  public V1beta3FlowSchemaListBuilder(V1beta3FlowSchemaList instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withItems(instance.getItems());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3FlowSchemaListFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3FlowSchemaList build() {
    V1beta3FlowSchemaList buildable = new V1beta3FlowSchemaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}