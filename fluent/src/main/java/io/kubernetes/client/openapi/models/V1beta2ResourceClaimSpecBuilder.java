package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta2ResourceClaimSpecBuilder extends V1beta2ResourceClaimSpecFluent<V1beta2ResourceClaimSpecBuilder> implements VisitableBuilder<V1beta2ResourceClaimSpec,V1beta2ResourceClaimSpecBuilder>{
  public V1beta2ResourceClaimSpecBuilder() {
    this(new V1beta2ResourceClaimSpec());
  }
  
  public V1beta2ResourceClaimSpecBuilder(V1beta2ResourceClaimSpecFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimSpec());
  }
  
  public V1beta2ResourceClaimSpecBuilder(V1beta2ResourceClaimSpecFluent<?> fluent,V1beta2ResourceClaimSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimSpecBuilder(V1beta2ResourceClaimSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourceClaimSpecFluent<?> fluent;
  
  public V1beta2ResourceClaimSpec build() {
    V1beta2ResourceClaimSpec buildable = new V1beta2ResourceClaimSpec();
    buildable.setDevices(fluent.buildDevices());
    return buildable;
  }
  

}