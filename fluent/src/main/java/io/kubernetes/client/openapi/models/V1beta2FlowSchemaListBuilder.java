package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2FlowSchemaListBuilder extends V1beta2FlowSchemaListFluentImpl<V1beta2FlowSchemaListBuilder> implements VisitableBuilder<V1beta2FlowSchemaList,V1beta2FlowSchemaListBuilder>{
  public V1beta2FlowSchemaListBuilder() {
    this(false);
  }
  public V1beta2FlowSchemaListBuilder(Boolean validationEnabled) {
    this(new V1beta2FlowSchemaList(), validationEnabled);
  }
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchemaList(), validationEnabled);
  }
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaListFluent<?> fluent,V1beta2FlowSchemaList instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaListFluent<?> fluent,V1beta2FlowSchemaList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaList instance) {
    this(instance,false);
  }
  public V1beta2FlowSchemaListBuilder(V1beta2FlowSchemaList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2FlowSchemaListFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2FlowSchemaList build() {
    V1beta2FlowSchemaList buildable = new V1beta2FlowSchemaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}