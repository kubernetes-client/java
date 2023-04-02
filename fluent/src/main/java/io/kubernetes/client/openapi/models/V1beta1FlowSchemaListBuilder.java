package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1FlowSchemaListBuilder extends V1beta1FlowSchemaListFluentImpl<V1beta1FlowSchemaListBuilder> implements VisitableBuilder<V1beta1FlowSchemaList,V1beta1FlowSchemaListBuilder>{
  public V1beta1FlowSchemaListBuilder() {
    this(false);
  }
  public V1beta1FlowSchemaListBuilder(Boolean validationEnabled) {
    this(new V1beta1FlowSchemaList(), validationEnabled);
  }
  public V1beta1FlowSchemaListBuilder(V1beta1FlowSchemaListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1FlowSchemaListBuilder(V1beta1FlowSchemaListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1FlowSchemaList(), validationEnabled);
  }
  public V1beta1FlowSchemaListBuilder(V1beta1FlowSchemaListFluent<?> fluent,V1beta1FlowSchemaList instance) {
    this(fluent, instance, false);
  }
  public V1beta1FlowSchemaListBuilder(V1beta1FlowSchemaListFluent<?> fluent,V1beta1FlowSchemaList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1FlowSchemaListBuilder(V1beta1FlowSchemaList instance) {
    this(instance,false);
  }
  public V1beta1FlowSchemaListBuilder(V1beta1FlowSchemaList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1FlowSchemaListFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1FlowSchemaList build() {
    V1beta1FlowSchemaList buildable = new V1beta1FlowSchemaList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}