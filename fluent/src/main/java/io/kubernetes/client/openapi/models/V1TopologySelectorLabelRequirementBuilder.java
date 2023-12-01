package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TopologySelectorLabelRequirementBuilder extends V1TopologySelectorLabelRequirementFluent<V1TopologySelectorLabelRequirementBuilder> implements VisitableBuilder<V1TopologySelectorLabelRequirement,V1TopologySelectorLabelRequirementBuilder>{
  public V1TopologySelectorLabelRequirementBuilder() {
    this(new V1TopologySelectorLabelRequirement());
  }
  
  public V1TopologySelectorLabelRequirementBuilder(V1TopologySelectorLabelRequirementFluent<?> fluent) {
    this(fluent, new V1TopologySelectorLabelRequirement());
  }
  
  public V1TopologySelectorLabelRequirementBuilder(V1TopologySelectorLabelRequirementFluent<?> fluent,V1TopologySelectorLabelRequirement instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TopologySelectorLabelRequirementBuilder(V1TopologySelectorLabelRequirement instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TopologySelectorLabelRequirementFluent<?> fluent;
  
  public V1TopologySelectorLabelRequirement build() {
    V1TopologySelectorLabelRequirement buildable = new V1TopologySelectorLabelRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  

}