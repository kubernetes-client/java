package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimSpecBuilder extends V1alpha2ResourceClaimSpecFluent<V1alpha2ResourceClaimSpecBuilder> implements VisitableBuilder<V1alpha2ResourceClaimSpec,V1alpha2ResourceClaimSpecBuilder>{
  public V1alpha2ResourceClaimSpecBuilder() {
    this(new V1alpha2ResourceClaimSpec());
  }
  
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpecFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimSpec());
  }
  
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpecFluent<?> fluent,V1alpha2ResourceClaimSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimSpecBuilder(V1alpha2ResourceClaimSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimSpecFluent<?> fluent;
  
  public V1alpha2ResourceClaimSpec build() {
    V1alpha2ResourceClaimSpec buildable = new V1alpha2ResourceClaimSpec();
    buildable.setAllocationMode(fluent.getAllocationMode());
    buildable.setParametersRef(fluent.buildParametersRef());
    buildable.setResourceClassName(fluent.getResourceClassName());
    return buildable;
  }
  

}