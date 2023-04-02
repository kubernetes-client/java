package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeSelectorRequirementBuilder extends V1NodeSelectorRequirementFluentImpl<V1NodeSelectorRequirementBuilder> implements VisitableBuilder<V1NodeSelectorRequirement,V1NodeSelectorRequirementBuilder>{
  public V1NodeSelectorRequirementBuilder() {
    this(false);
  }
  public V1NodeSelectorRequirementBuilder(Boolean validationEnabled) {
    this(new V1NodeSelectorRequirement(), validationEnabled);
  }
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeSelectorRequirement(), validationEnabled);
  }
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent,V1NodeSelectorRequirement instance) {
    this(fluent, instance, false);
  }
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirementFluent<?> fluent,V1NodeSelectorRequirement instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withKey(instance.getKey());

    fluent.withOperator(instance.getOperator());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirement instance) {
    this(instance,false);
  }
  public V1NodeSelectorRequirementBuilder(V1NodeSelectorRequirement instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeSelectorRequirementFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeSelectorRequirement build() {
    V1NodeSelectorRequirement buildable = new V1NodeSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  
}