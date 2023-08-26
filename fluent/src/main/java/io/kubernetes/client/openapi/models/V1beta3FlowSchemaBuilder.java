package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3FlowSchemaBuilder extends V1beta3FlowSchemaFluentImpl<V1beta3FlowSchemaBuilder> implements VisitableBuilder<V1beta3FlowSchema,V1beta3FlowSchemaBuilder>{
  public V1beta3FlowSchemaBuilder() {
    this(false);
  }
  public V1beta3FlowSchemaBuilder(Boolean validationEnabled) {
    this(new V1beta3FlowSchema(), validationEnabled);
  }
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchemaFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchemaFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3FlowSchema(), validationEnabled);
  }
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchemaFluent<?> fluent,V1beta3FlowSchema instance) {
    this(fluent, instance, false);
  }
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchemaFluent<?> fluent,V1beta3FlowSchema instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withApiVersion(instance.getApiVersion());
      fluent.withKind(instance.getKind());
      fluent.withMetadata(instance.getMetadata());
      fluent.withSpec(instance.getSpec());
      fluent.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchema instance) {
    this(instance,false);
  }
  public V1beta3FlowSchemaBuilder(V1beta3FlowSchema instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
      this.withStatus(instance.getStatus());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3FlowSchemaFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3FlowSchema build() {
    V1beta3FlowSchema buildable = new V1beta3FlowSchema();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}