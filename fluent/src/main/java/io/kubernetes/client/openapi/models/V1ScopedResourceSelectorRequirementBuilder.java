package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ScopedResourceSelectorRequirementBuilder extends V1ScopedResourceSelectorRequirementFluentImpl<V1ScopedResourceSelectorRequirementBuilder> implements VisitableBuilder<V1ScopedResourceSelectorRequirement,V1ScopedResourceSelectorRequirementBuilder>{
  public V1ScopedResourceSelectorRequirementBuilder() {
    this(false);
  }
  public V1ScopedResourceSelectorRequirementBuilder(Boolean validationEnabled) {
    this(new V1ScopedResourceSelectorRequirement(), validationEnabled);
  }
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirementFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirementFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ScopedResourceSelectorRequirement(), validationEnabled);
  }
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirementFluent<?> fluent,V1ScopedResourceSelectorRequirement instance) {
    this(fluent, instance, false);
  }
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirementFluent<?> fluent,V1ScopedResourceSelectorRequirement instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withOperator(instance.getOperator());

    fluent.withScopeName(instance.getScopeName());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled; 
  }
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirement instance) {
    this(instance,false);
  }
  public V1ScopedResourceSelectorRequirementBuilder(V1ScopedResourceSelectorRequirement instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withOperator(instance.getOperator());

    this.withScopeName(instance.getScopeName());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled; 
  }
  V1ScopedResourceSelectorRequirementFluent<?> fluent;
  Boolean validationEnabled;
  public V1ScopedResourceSelectorRequirement build() {
    V1ScopedResourceSelectorRequirement buildable = new V1ScopedResourceSelectorRequirement();
    buildable.setOperator(fluent.getOperator());
    buildable.setScopeName(fluent.getScopeName());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  
}