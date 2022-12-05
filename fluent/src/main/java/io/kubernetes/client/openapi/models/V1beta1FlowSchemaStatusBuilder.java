package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta1FlowSchemaStatusBuilder extends V1beta1FlowSchemaStatusFluentImpl<V1beta1FlowSchemaStatusBuilder> implements VisitableBuilder<V1beta1FlowSchemaStatus,V1beta1FlowSchemaStatusBuilder>{
  public V1beta1FlowSchemaStatusBuilder() {
    this(false);
  }
  public V1beta1FlowSchemaStatusBuilder(Boolean validationEnabled) {
    this(new V1beta1FlowSchemaStatus(), validationEnabled);
  }
  public V1beta1FlowSchemaStatusBuilder(V1beta1FlowSchemaStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta1FlowSchemaStatusBuilder(V1beta1FlowSchemaStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta1FlowSchemaStatus(), validationEnabled);
  }
  public V1beta1FlowSchemaStatusBuilder(V1beta1FlowSchemaStatusFluent<?> fluent,V1beta1FlowSchemaStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta1FlowSchemaStatusBuilder(V1beta1FlowSchemaStatusFluent<?> fluent,V1beta1FlowSchemaStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta1FlowSchemaStatusBuilder(V1beta1FlowSchemaStatus instance) {
    this(instance,false);
  }
  public V1beta1FlowSchemaStatusBuilder(V1beta1FlowSchemaStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.validationEnabled = validationEnabled; 
  }
  V1beta1FlowSchemaStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta1FlowSchemaStatus build() {
    V1beta1FlowSchemaStatus buildable = new V1beta1FlowSchemaStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}