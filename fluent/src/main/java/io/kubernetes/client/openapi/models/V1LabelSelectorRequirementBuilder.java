package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LabelSelectorRequirementBuilder extends V1LabelSelectorRequirementFluent<V1LabelSelectorRequirementBuilder> implements VisitableBuilder<V1LabelSelectorRequirement,V1LabelSelectorRequirementBuilder>{
  public V1LabelSelectorRequirementBuilder() {
    this(new V1LabelSelectorRequirement());
  }
  
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirementFluent<?> fluent) {
    this(fluent, new V1LabelSelectorRequirement());
  }
  
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirementFluent<?> fluent,V1LabelSelectorRequirement instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirement instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LabelSelectorRequirementFluent<?> fluent;
  
  public V1LabelSelectorRequirement build() {
    V1LabelSelectorRequirement buildable = new V1LabelSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  

}