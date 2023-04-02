package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1FlowSchemaBuilder extends V1beta1FlowSchemaFluentImpl<V1beta1FlowSchemaBuilder> implements VisitableBuilder<V1beta1FlowSchema,V1beta1FlowSchemaBuilder>{
  public V1beta1FlowSchemaBuilder() {
    this(false);
  }
  public V1beta1FlowSchemaBuilder(Boolean validationEnabled) {
    this(new V1beta1FlowSchema(), validationEnabled);
  }
  public V1beta1FlowSchemaBuilder(V1beta1FlowSchemaFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1FlowSchemaBuilder(V1beta1FlowSchemaFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1FlowSchema(), validationEnabled);
  }
  public V1beta1FlowSchemaBuilder(V1beta1FlowSchemaFluent<?> fluent,V1beta1FlowSchema instance) {
    this(fluent, instance, false);
  }
  public V1beta1FlowSchemaBuilder(V1beta1FlowSchemaFluent<?> fluent,V1beta1FlowSchema instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1FlowSchemaBuilder(V1beta1FlowSchema instance) {
    this(instance,false);
  }
  public V1beta1FlowSchemaBuilder(V1beta1FlowSchema instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1FlowSchemaFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1FlowSchema build() {
    V1beta1FlowSchema buildable = new V1beta1FlowSchema();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}