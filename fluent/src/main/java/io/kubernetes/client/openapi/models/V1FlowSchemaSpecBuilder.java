package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlowSchemaSpecBuilder extends V1FlowSchemaSpecFluent<V1FlowSchemaSpecBuilder> implements VisitableBuilder<V1FlowSchemaSpec,V1FlowSchemaSpecBuilder>{
  public V1FlowSchemaSpecBuilder() {
    this(new V1FlowSchemaSpec());
  }
  
  public V1FlowSchemaSpecBuilder(V1FlowSchemaSpecFluent<?> fluent) {
    this(fluent, new V1FlowSchemaSpec());
  }
  
  public V1FlowSchemaSpecBuilder(V1FlowSchemaSpecFluent<?> fluent,V1FlowSchemaSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlowSchemaSpecBuilder(V1FlowSchemaSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlowSchemaSpecFluent<?> fluent;
  
  public V1FlowSchemaSpec build() {
    V1FlowSchemaSpec buildable = new V1FlowSchemaSpec();
    buildable.setDistinguisherMethod(fluent.buildDistinguisherMethod());
    buildable.setMatchingPrecedence(fluent.getMatchingPrecedence());
    buildable.setPriorityLevelConfiguration(fluent.buildPriorityLevelConfiguration());
    buildable.setRules(fluent.buildRules());
    return buildable;
  }
  

}