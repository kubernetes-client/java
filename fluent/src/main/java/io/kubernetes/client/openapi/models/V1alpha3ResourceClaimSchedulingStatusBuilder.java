package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimSchedulingStatusBuilder extends V1alpha3ResourceClaimSchedulingStatusFluent<V1alpha3ResourceClaimSchedulingStatusBuilder> implements VisitableBuilder<V1alpha3ResourceClaimSchedulingStatus,V1alpha3ResourceClaimSchedulingStatusBuilder>{
  public V1alpha3ResourceClaimSchedulingStatusBuilder() {
    this(new V1alpha3ResourceClaimSchedulingStatus());
  }
  
  public V1alpha3ResourceClaimSchedulingStatusBuilder(V1alpha3ResourceClaimSchedulingStatusFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaimSchedulingStatus());
  }
  
  public V1alpha3ResourceClaimSchedulingStatusBuilder(V1alpha3ResourceClaimSchedulingStatusFluent<?> fluent,V1alpha3ResourceClaimSchedulingStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimSchedulingStatusBuilder(V1alpha3ResourceClaimSchedulingStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimSchedulingStatusFluent<?> fluent;
  
  public V1alpha3ResourceClaimSchedulingStatus build() {
    V1alpha3ResourceClaimSchedulingStatus buildable = new V1alpha3ResourceClaimSchedulingStatus();
    buildable.setName(fluent.getName());
    buildable.setUnsuitableNodes(fluent.getUnsuitableNodes());
    return buildable;
  }
  

}