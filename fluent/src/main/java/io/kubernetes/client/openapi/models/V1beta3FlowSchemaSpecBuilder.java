package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta3FlowSchemaSpecBuilder extends V1beta3FlowSchemaSpecFluent<V1beta3FlowSchemaSpecBuilder> implements VisitableBuilder<V1beta3FlowSchemaSpec,V1beta3FlowSchemaSpecBuilder>{
  public V1beta3FlowSchemaSpecBuilder() {
    this(new V1beta3FlowSchemaSpec());
  }
  
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpecFluent<?> fluent) {
    this(fluent, new V1beta3FlowSchemaSpec());
  }
  
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpecFluent<?> fluent,V1beta3FlowSchemaSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta3FlowSchemaSpecBuilder(V1beta3FlowSchemaSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta3FlowSchemaSpecFluent<?> fluent;
  
  public V1beta3FlowSchemaSpec build() {
    V1beta3FlowSchemaSpec buildable = new V1beta3FlowSchemaSpec();
    buildable.setDistinguisherMethod(fluent.buildDistinguisherMethod());
    buildable.setMatchingPrecedence(fluent.getMatchingPrecedence());
    buildable.setPriorityLevelConfiguration(fluent.buildPriorityLevelConfiguration());
    buildable.setRules(fluent.buildRules());
    return buildable;
  }
  

}