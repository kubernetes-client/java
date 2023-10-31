package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2FlowSchemaSpecBuilder extends V1beta2FlowSchemaSpecFluent<V1beta2FlowSchemaSpecBuilder> implements VisitableBuilder<V1beta2FlowSchemaSpec,V1beta2FlowSchemaSpecBuilder>{
  public V1beta2FlowSchemaSpecBuilder() {
    this(new V1beta2FlowSchemaSpec());
  }
  
  public V1beta2FlowSchemaSpecBuilder(V1beta2FlowSchemaSpecFluent<?> fluent) {
    this(fluent, new V1beta2FlowSchemaSpec());
  }
  
  public V1beta2FlowSchemaSpecBuilder(V1beta2FlowSchemaSpecFluent<?> fluent,V1beta2FlowSchemaSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2FlowSchemaSpecBuilder(V1beta2FlowSchemaSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2FlowSchemaSpecFluent<?> fluent;
  
  public V1beta2FlowSchemaSpec build() {
    V1beta2FlowSchemaSpec buildable = new V1beta2FlowSchemaSpec();
    buildable.setDistinguisherMethod(fluent.buildDistinguisherMethod());
    buildable.setMatchingPrecedence(fluent.getMatchingPrecedence());
    buildable.setPriorityLevelConfiguration(fluent.buildPriorityLevelConfiguration());
    buildable.setRules(fluent.buildRules());
    return buildable;
  }
  

}