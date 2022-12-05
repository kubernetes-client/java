package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta2FlowSchemaStatusBuilder extends V1beta2FlowSchemaStatusFluentImpl<V1beta2FlowSchemaStatusBuilder> implements VisitableBuilder<V1beta2FlowSchemaStatus,V1beta2FlowSchemaStatusBuilder>{
  public V1beta2FlowSchemaStatusBuilder() {
    this(false);
  }
  public V1beta2FlowSchemaStatusBuilder(Boolean validationEnabled) {
    this(new V1beta2FlowSchemaStatus(), validationEnabled);
  }
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta2FlowSchemaStatus(), validationEnabled);
  }
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatusFluent<?> fluent,V1beta2FlowSchemaStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatusFluent<?> fluent,V1beta2FlowSchemaStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatus instance) {
    this(instance,false);
  }
  public V1beta2FlowSchemaStatusBuilder(V1beta2FlowSchemaStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  V1beta2FlowSchemaStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta2FlowSchemaStatus build() {
    V1beta2FlowSchemaStatus buildable = new V1beta2FlowSchemaStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}