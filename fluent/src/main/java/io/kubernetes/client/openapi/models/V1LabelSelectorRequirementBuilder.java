package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LabelSelectorRequirementBuilder extends V1LabelSelectorRequirementFluentImpl<V1LabelSelectorRequirementBuilder> implements VisitableBuilder<V1LabelSelectorRequirement,V1LabelSelectorRequirementBuilder>{
  public V1LabelSelectorRequirementBuilder() {
    this(false);
  }
  public V1LabelSelectorRequirementBuilder(Boolean validationEnabled) {
    this(new V1LabelSelectorRequirement(), validationEnabled);
  }
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirementFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirementFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LabelSelectorRequirement(), validationEnabled);
  }
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirementFluent<?> fluent,V1LabelSelectorRequirement instance) {
    this(fluent, instance, false);
  }
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirementFluent<?> fluent,V1LabelSelectorRequirement instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withKey(instance.getKey());

    fluent.withOperator(instance.getOperator());

    fluent.withValues(instance.getValues());

    this.validationEnabled = validationEnabled; 
  }
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirement instance) {
    this(instance,false);
  }
  public V1LabelSelectorRequirementBuilder(V1LabelSelectorRequirement instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withKey(instance.getKey());

    this.withOperator(instance.getOperator());

    this.withValues(instance.getValues());

    this.validationEnabled = validationEnabled; 
  }
  V1LabelSelectorRequirementFluent<?> fluent;
  Boolean validationEnabled;
  public V1LabelSelectorRequirement build() {
    V1LabelSelectorRequirement buildable = new V1LabelSelectorRequirement();
    buildable.setKey(fluent.getKey());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  
}