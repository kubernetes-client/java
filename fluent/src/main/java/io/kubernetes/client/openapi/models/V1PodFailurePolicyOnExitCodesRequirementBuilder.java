package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodFailurePolicyOnExitCodesRequirementBuilder extends V1PodFailurePolicyOnExitCodesRequirementFluent<V1PodFailurePolicyOnExitCodesRequirementBuilder> implements VisitableBuilder<V1PodFailurePolicyOnExitCodesRequirement,V1PodFailurePolicyOnExitCodesRequirementBuilder>{
  public V1PodFailurePolicyOnExitCodesRequirementBuilder() {
    this(new V1PodFailurePolicyOnExitCodesRequirement());
  }
  
  public V1PodFailurePolicyOnExitCodesRequirementBuilder(V1PodFailurePolicyOnExitCodesRequirementFluent<?> fluent) {
    this(fluent, new V1PodFailurePolicyOnExitCodesRequirement());
  }
  
  public V1PodFailurePolicyOnExitCodesRequirementBuilder(V1PodFailurePolicyOnExitCodesRequirementFluent<?> fluent,V1PodFailurePolicyOnExitCodesRequirement instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodFailurePolicyOnExitCodesRequirementBuilder(V1PodFailurePolicyOnExitCodesRequirement instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodFailurePolicyOnExitCodesRequirementFluent<?> fluent;
  
  public V1PodFailurePolicyOnExitCodesRequirement build() {
    V1PodFailurePolicyOnExitCodesRequirement buildable = new V1PodFailurePolicyOnExitCodesRequirement();
    buildable.setContainerName(fluent.getContainerName());
    buildable.setOperator(fluent.getOperator());
    buildable.setValues(fluent.getValues());
    return buildable;
  }
  

}