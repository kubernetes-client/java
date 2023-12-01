package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeSelectorRequirementBuilder extends V1NodeSelectorRequirementFluent<V1NodeSelectorRequirementBuilder> implements VisitableBuilder<V1NodeSelectorRequirement,V1NodeSelectorRequirementBuilder>{
  public V1NodeSelectorRequirementBuilder() {
    this(new V1NodeSelectorRequirement());
  }
  
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent) {
    this(fluent, new V1NodeSelectorRequirement());
  }
  
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent,V1NodeSelectorRequirement instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirement instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeSelectorRequirementFluent<?> fluent;
  
  public V1NodeSelectorRequirement build() {
    V1NodeSelectorRequirement buildable = new V1NodeSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  

}