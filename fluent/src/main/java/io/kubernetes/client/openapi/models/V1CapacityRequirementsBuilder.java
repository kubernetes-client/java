package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1CapacityRequirementsBuilder extends V1CapacityRequirementsFluent<V1CapacityRequirementsBuilder> implements VisitableBuilder<V1CapacityRequirements,V1CapacityRequirementsBuilder>{
  public V1CapacityRequirementsBuilder() {
    this(new V1CapacityRequirements());
  }
  
  public V1CapacityRequirementsBuilder(V1CapacityRequirementsFluent<?> fluent) {
    this(fluent, new V1CapacityRequirements());
  }
  
  public V1CapacityRequirementsBuilder(V1CapacityRequirementsFluent<?> fluent,V1CapacityRequirements instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CapacityRequirementsBuilder(V1CapacityRequirements instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CapacityRequirementsFluent<?> fluent;
  
  public V1CapacityRequirements build() {
    V1CapacityRequirements buildable = new V1CapacityRequirements();
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  

}