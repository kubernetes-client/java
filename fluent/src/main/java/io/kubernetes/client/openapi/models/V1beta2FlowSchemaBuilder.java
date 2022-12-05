package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2FlowSchemaBuilder extends V1beta2FlowSchemaFluentImpl<V1beta2FlowSchemaBuilder> implements VisitableBuilder<V1beta2FlowSchema,V1beta2FlowSchemaBuilder>{
  public V1beta2FlowSchemaBuilder() {
    this(false);
  }
  public V1beta2FlowSchemaBuilder(Boolean validationEnabled) {
    this(new V1beta2FlowSchema(), validationEnabled);
  }
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchemaFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchemaFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchema(), validationEnabled);
  }
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchemaFluent<?> fluent,V1beta2FlowSchema instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchemaFluent<?> fluent,V1beta2FlowSchema instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchema instance) {
    this(instance,false);
  }
  public V1beta2FlowSchemaBuilder(V1beta2FlowSchema instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2FlowSchemaFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2FlowSchema build() {
    V1beta2FlowSchema buildable = new V1beta2FlowSchema();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}