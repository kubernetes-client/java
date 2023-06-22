package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1beta3FlowSchemaStatusBuilder extends V1beta3FlowSchemaStatusFluentImpl<V1beta3FlowSchemaStatusBuilder> implements VisitableBuilder<V1beta3FlowSchemaStatus,V1beta3FlowSchemaStatusBuilder>{
  public V1beta3FlowSchemaStatusBuilder() {
    this(false);
  }
  public V1beta3FlowSchemaStatusBuilder(Boolean validationEnabled) {
    this(new V1beta3FlowSchemaStatus(), validationEnabled);
  }
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1beta3FlowSchemaStatus(), validationEnabled);
  }
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatusFluent<?> fluent,V1beta3FlowSchemaStatus instance) {
    this(fluent, instance, false);
  }
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatusFluent<?> fluent,V1beta3FlowSchemaStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withConditions(instance.getConditions());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatus instance) {
    this(instance,false);
  }
  public V1beta3FlowSchemaStatusBuilder(V1beta3FlowSchemaStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withConditions(instance.getConditions());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1beta3FlowSchemaStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1beta3FlowSchemaStatus build() {
    V1beta3FlowSchemaStatus buildable = new V1beta3FlowSchemaStatus();
    buildable.setConditions(fluent.getConditions());
    return buildable;
  }
  
}