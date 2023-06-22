package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha2ResourceClaimStatusBuilder extends V1alpha2ResourceClaimStatusFluentImpl<V1alpha2ResourceClaimStatusBuilder> implements VisitableBuilder<V1alpha2ResourceClaimStatus,V1alpha2ResourceClaimStatusBuilder>{
  public V1alpha2ResourceClaimStatusBuilder() {
    this(false);
  }
  public V1alpha2ResourceClaimStatusBuilder(Boolean validationEnabled) {
    this(new V1alpha2ResourceClaimStatus(), validationEnabled);
  }
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha2ResourceClaimStatus(), validationEnabled);
  }
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatusFluent<?> fluent,V1alpha2ResourceClaimStatus instance) {
    this(fluent, instance, false);
  }
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatusFluent<?> fluent,V1alpha2ResourceClaimStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withAllocation(instance.getAllocation());
      fluent.withDeallocationRequested(instance.getDeallocationRequested());
      fluent.withDriverName(instance.getDriverName());
      fluent.withReservedFor(instance.getReservedFor());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatus instance) {
    this(instance,false);
  }
  public V1alpha2ResourceClaimStatusBuilder(V1alpha2ResourceClaimStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withAllocation(instance.getAllocation());
      this.withDeallocationRequested(instance.getDeallocationRequested());
      this.withDriverName(instance.getDriverName());
      this.withReservedFor(instance.getReservedFor());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1alpha2ResourceClaimStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha2ResourceClaimStatus build() {
    V1alpha2ResourceClaimStatus buildable = new V1alpha2ResourceClaimStatus();
    buildable.setAllocation(fluent.getAllocation());
    buildable.setDeallocationRequested(fluent.getDeallocationRequested());
    buildable.setDriverName(fluent.getDriverName());
    buildable.setReservedFor(fluent.getReservedFor());
    return buildable;
  }
  
}