package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha2ResourceClaimTemplateSpecBuilder extends V1alpha2ResourceClaimTemplateSpecFluent<V1alpha2ResourceClaimTemplateSpecBuilder> implements VisitableBuilder<V1alpha2ResourceClaimTemplateSpec,V1alpha2ResourceClaimTemplateSpecBuilder>{
  public V1alpha2ResourceClaimTemplateSpecBuilder() {
    this(new V1alpha2ResourceClaimTemplateSpec());
  }
  
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpecFluent<?> fluent) {
    this(fluent, new V1alpha2ResourceClaimTemplateSpec());
  }
  
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpecFluent<?> fluent,V1alpha2ResourceClaimTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha2ResourceClaimTemplateSpecBuilder(V1alpha2ResourceClaimTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha2ResourceClaimTemplateSpecFluent<?> fluent;
  
  public V1alpha2ResourceClaimTemplateSpec build() {
    V1alpha2ResourceClaimTemplateSpec buildable = new V1alpha2ResourceClaimTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}