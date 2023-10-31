package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ResourceRequirementsBuilder extends V1ResourceRequirementsFluent<V1ResourceRequirementsBuilder> implements VisitableBuilder<V1ResourceRequirements,V1ResourceRequirementsBuilder>{
  public V1ResourceRequirementsBuilder() {
    this(new V1ResourceRequirements());
  }
  
  public V1ResourceRequirementsBuilder(V1ResourceRequirementsFluent<?> fluent) {
    this(fluent, new V1ResourceRequirements());
  }
  
  public V1ResourceRequirementsBuilder(V1ResourceRequirementsFluent<?> fluent,V1ResourceRequirements instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceRequirementsBuilder(V1ResourceRequirements instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceRequirementsFluent<?> fluent;
  
  public V1ResourceRequirements build() {
    V1ResourceRequirements buildable = new V1ResourceRequirements();
    buildable.setClaims(fluent.buildClaims());
    buildable.setLimits(fluent.getLimits());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}