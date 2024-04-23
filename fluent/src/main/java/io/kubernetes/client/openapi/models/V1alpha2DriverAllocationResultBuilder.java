package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2DriverAllocationResultBuilder extends V1alpha2DriverAllocationResultFluent<V1alpha2DriverAllocationResultBuilder> implements VisitableBuilder<V1alpha2DriverAllocationResult,V1alpha2DriverAllocationResultBuilder>{
  public V1alpha2DriverAllocationResultBuilder() {
    this(new V1alpha2DriverAllocationResult());
  }
  
  public V1alpha2DriverAllocationResultBuilder(V1alpha2DriverAllocationResultFluent<?> fluent) {
    this(fluent, new V1alpha2DriverAllocationResult());
  }
  
  public V1alpha2DriverAllocationResultBuilder(V1alpha2DriverAllocationResultFluent<?> fluent,V1alpha2DriverAllocationResult instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2DriverAllocationResultBuilder(V1alpha2DriverAllocationResult instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2DriverAllocationResultFluent<?> fluent;
  
  public V1alpha2DriverAllocationResult build() {
    V1alpha2DriverAllocationResult buildable = new V1alpha2DriverAllocationResult();
    buildable.setNamedResources(fluent.buildNamedResources());
    buildable.setVendorRequestParameters(fluent.getVendorRequestParameters());
    return buildable;
  }
  

}