package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceClaimSpecBuilder extends V1beta1ResourceClaimSpecFluent<V1beta1ResourceClaimSpecBuilder> implements VisitableBuilder<V1beta1ResourceClaimSpec,V1beta1ResourceClaimSpecBuilder>{
  public V1beta1ResourceClaimSpecBuilder() {
    this(new V1beta1ResourceClaimSpec());
  }
  
  public V1beta1ResourceClaimSpecBuilder(V1beta1ResourceClaimSpecFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaimSpec());
  }
  
  public V1beta1ResourceClaimSpecBuilder(V1beta1ResourceClaimSpecFluent<?> fluent,V1beta1ResourceClaimSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimSpecBuilder(V1beta1ResourceClaimSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceClaimSpecFluent<?> fluent;
  
  public V1beta1ResourceClaimSpec build() {
    V1beta1ResourceClaimSpec buildable = new V1beta1ResourceClaimSpec();
    buildable.setDevices(fluent.buildDevices());
    return buildable;
  }
  

}