package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceClaimTemplateSpecBuilder extends V1alpha3ResourceClaimTemplateSpecFluent<V1alpha3ResourceClaimTemplateSpecBuilder> implements VisitableBuilder<V1alpha3ResourceClaimTemplateSpec,V1alpha3ResourceClaimTemplateSpecBuilder>{
  public V1alpha3ResourceClaimTemplateSpecBuilder() {
    this(new V1alpha3ResourceClaimTemplateSpec());
  }
  
  public V1alpha3ResourceClaimTemplateSpecBuilder(V1alpha3ResourceClaimTemplateSpecFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceClaimTemplateSpec());
  }
  
  public V1alpha3ResourceClaimTemplateSpecBuilder(V1alpha3ResourceClaimTemplateSpecFluent<?> fluent,V1alpha3ResourceClaimTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceClaimTemplateSpecBuilder(V1alpha3ResourceClaimTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceClaimTemplateSpecFluent<?> fluent;
  
  public V1alpha3ResourceClaimTemplateSpec build() {
    V1alpha3ResourceClaimTemplateSpec buildable = new V1alpha3ResourceClaimTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}