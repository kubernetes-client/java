package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta1CapacityRequirementsBuilder extends V1beta1CapacityRequirementsFluent<V1beta1CapacityRequirementsBuilder> implements VisitableBuilder<V1beta1CapacityRequirements,V1beta1CapacityRequirementsBuilder>{

  V1beta1CapacityRequirementsFluent<?> fluent;

  public V1beta1CapacityRequirementsBuilder() {
    this(new V1beta1CapacityRequirements());
  }
  
  public V1beta1CapacityRequirementsBuilder(V1beta1CapacityRequirementsFluent<?> fluent) {
    this(fluent, new V1beta1CapacityRequirements());
  }
  
  public V1beta1CapacityRequirementsBuilder(V1beta1CapacityRequirements instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta1CapacityRequirementsBuilder(V1beta1CapacityRequirementsFluent<?> fluent,V1beta1CapacityRequirements instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta1CapacityRequirements build() {
    V1beta1CapacityRequirements buildable = new V1beta1CapacityRequirements();
    buildable.setRequests(fluent.getRequests());
    return buildable;
  }
  
}