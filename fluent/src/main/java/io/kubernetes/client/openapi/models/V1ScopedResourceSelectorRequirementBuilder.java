package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ScopedResourceSelectorRequirementBuilder extends V1ScopedResourceSelectorRequirementFluent<V1ScopedResourceSelectorRequirementBuilder> implements VisitableBuilder<V1ScopedResourceSelectorRequirement,V1ScopedResourceSelectorRequirementBuilder>{
  public V1ScopedResourceSelectorRequirementBuilder() {
    this(new V1ScopedResourceSelectorRequirement());
  }
  
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirementFluent<?> fluent) {
    this(fluent, new V1ScopedResourceSelectorRequirement());
  }
  
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirementFluent<?> fluent,V1ScopedResourceSelectorRequirement instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirement instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ScopedResourceSelectorRequirementFluent<?> fluent;
  
  public V1ScopedResourceSelectorRequirement build() {
    V1ScopedResourceSelectorRequirement buildable = new V1ScopedResourceSelectorRequirement();
    buildable.setOperator(fluent.getOperator());
    buildable.setScopeName(fluent.getScopeName());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  

}