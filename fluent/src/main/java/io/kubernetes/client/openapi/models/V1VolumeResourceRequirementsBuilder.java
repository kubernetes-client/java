package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeResourceRequirementsBuilder extends V1VolumeResourceRequirementsFluent<V1VolumeResourceRequirementsBuilder> implements VisitableBuilder<V1VolumeResourceRequirements,V1VolumeResourceRequirementsBuilder>{
  public V1VolumeResourceRequirementsBuilder() {
    this(new V1VolumeResourceRequirements());
  }
  
  public V1VolumeResourceRequirementsBuilder(V1VolumeResourceRequirementsFluent<?> fluent) {
    this(fluent, new V1VolumeResourceRequirements());
  }
  
  public V1VolumeResourceRequirementsBuilder(V1VolumeResourceRequirementsFluent<?> fluent,V1VolumeResourceRequirements instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeResourceRequirementsBuilder(V1VolumeResourceRequirements instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeResourceRequirementsFluent<?> fluent;
  
  public V1VolumeResourceRequirements build() {
    V1VolumeResourceRequirements buildable = new V1VolumeResourceRequirements();
    buildable.setLimits(fluent.getLimits());
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}