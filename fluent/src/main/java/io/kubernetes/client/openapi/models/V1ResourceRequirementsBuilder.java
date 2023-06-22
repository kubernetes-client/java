package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ResourceRequirementsBuilder extends V1ResourceRequirementsFluentImpl<V1ResourceRequirementsBuilder> implements VisitableBuilder<V1ResourceRequirements,V1ResourceRequirementsBuilder>{
  public V1ResourceRequirementsBuilder() {
    this(false);
  }
  public V1ResourceRequirementsBuilder(Boolean validationEnabled) {
    this(new V1ResourceRequirements(), validationEnabled);
  }
  public V1ResourceRequirementsBuilder(V1ResourceRequirementsFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ResourceRequirementsBuilder(V1ResourceRequirementsFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ResourceRequirements(), validationEnabled);
  }
  public V1ResourceRequirementsBuilder(V1ResourceRequirementsFluent<?> fluent,V1ResourceRequirements instance) {
    this(fluent, instance, false);
  }
  public V1ResourceRequirementsBuilder(V1ResourceRequirementsFluent<?> fluent,V1ResourceRequirements instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withClaims(instance.getClaims());
      fluent.withLimits(instance.getLimits());
      fluent.withRequests(instance.getRequests());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1ResourceRequirementsBuilder(V1ResourceRequirements instance) {
    this(instance,false);
  }
  public V1ResourceRequirementsBuilder(V1ResourceRequirements instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withClaims(instance.getClaims());
      this.withLimits(instance.getLimits());
      this.withRequests(instance.getRequests());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1ResourceRequirementsFluent<?> fluent;
  Boolean validationEnabled;
  public V1ResourceRequirements build() {
    V1ResourceRequirements buildable = new V1ResourceRequirements();
    buildable.setClaims(fluent.getClaims());
    buildable.setLimits(fluent.getLimits());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}