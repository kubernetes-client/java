package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FieldSelectorRequirementBuilder extends V1FieldSelectorRequirementFluent<V1FieldSelectorRequirementBuilder> implements VisitableBuilder<V1FieldSelectorRequirement,V1FieldSelectorRequirementBuilder>{
  public V1FieldSelectorRequirementBuilder() {
    this(new V1FieldSelectorRequirement());
  }
  
  public V1FieldSelectorRequirementBuilder(V1FieldSelectorRequirementFluent<?> fluent) {
    this(fluent, new V1FieldSelectorRequirement());
  }
  
  public V1FieldSelectorRequirementBuilder(V1FieldSelectorRequirementFluent<?> fluent,V1FieldSelectorRequirement instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FieldSelectorRequirementBuilder(V1FieldSelectorRequirement instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FieldSelectorRequirementFluent<?> fluent;
  
  public V1FieldSelectorRequirement build() {
    V1FieldSelectorRequirement buildable = new V1FieldSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  

}