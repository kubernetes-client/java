package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimSpecBuilder extends V1alpha3ResourceClaimSpecFluent<V1alpha3ResourceClaimSpecBuilder> implements VisitableBuilder<V1alpha3ResourceClaimSpec,V1alpha3ResourceClaimSpecBuilder>{
  public V1alpha3ResourceClaimSpecBuilder() {
    this(new V1alpha3ResourceClaimSpec());
  }
  
  public V1alpha3ResourceClaimSpecBuilder(V1alpha3ResourceClaimSpecFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaimSpec());
  }
  
  public V1alpha3ResourceClaimSpecBuilder(V1alpha3ResourceClaimSpecFluent<?> fluent,V1alpha3ResourceClaimSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimSpecBuilder(V1alpha3ResourceClaimSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimSpecFluent<?> fluent;
  
  public V1alpha3ResourceClaimSpec build() {
    V1alpha3ResourceClaimSpec buildable = new V1alpha3ResourceClaimSpec();
    buildable.setController(fluent.getController());
    buildable.setDevices(fluent.buildDevices());
    return buildable;
  }
  

}