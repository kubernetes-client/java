package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimSchedulingStatusBuilder extends V1alpha2ResourceClaimSchedulingStatusFluentImpl<V1alpha2ResourceClaimSchedulingStatusBuilder> implements VisitableBuilder<V1alpha2ResourceClaimSchedulingStatus,V1alpha2ResourceClaimSchedulingStatusBuilder>{
  public V1alpha2ResourceClaimSchedulingStatusBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimSchedulingStatusBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimSchedulingStatus(), validationEnabled);
  }
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimSchedulingStatus(), validationEnabled);
  }
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatusFluent<?> fluent,V1alpha2ResourceClaimSchedulingStatus instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatusFluent<?> fluent,V1alpha2ResourceClaimSchedulingStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withName(instance.getName());
      fluent.withUnsuitableNodes(instance.getUnsuitableNodes());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatus instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimSchedulingStatusBuilder(V1alpha2ResourceClaimSchedulingStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withName(instance.getName());
      this.withUnsuitableNodes(instance.getUnsuitableNodes());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimSchedulingStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimSchedulingStatus build() {
    V1alpha2ResourceClaimSchedulingStatus buildable = new V1alpha2ResourceClaimSchedulingStatus();
    buildable.setName(fluent.getName());
    buildable.setUnsuitableNodes(fluent.getUnsuitableNodes());
    return buildable;
  }
  
}