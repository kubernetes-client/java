package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2CapacityRequirementsBuilder extends V1beta2CapacityRequirementsFluent<V1beta2CapacityRequirementsBuilder> implements VisitableBuilder<V1beta2CapacityRequirements,V1beta2CapacityRequirementsBuilder>{

  V1beta2CapacityRequirementsFluent<?> fluent;

  public V1beta2CapacityRequirementsBuilder() {
    this(new V1beta2CapacityRequirements());
  }
  
  public V1beta2CapacityRequirementsBuilder(V1beta2CapacityRequirementsFluent<?> fluent) {
    this(fluent, new V1beta2CapacityRequirements());
  }
  
  public V1beta2CapacityRequirementsBuilder(V1beta2CapacityRequirements instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2CapacityRequirementsBuilder(V1beta2CapacityRequirementsFluent<?> fluent,V1beta2CapacityRequirements instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2CapacityRequirements build() {
    V1beta2CapacityRequirements buildable = new V1beta2CapacityRequirements();
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}