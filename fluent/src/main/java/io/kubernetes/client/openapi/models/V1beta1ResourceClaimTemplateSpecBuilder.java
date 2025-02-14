package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceClaimTemplateSpecBuilder extends V1beta1ResourceClaimTemplateSpecFluent<V1beta1ResourceClaimTemplateSpecBuilder> implements VisitableBuilder<V1beta1ResourceClaimTemplateSpec,V1beta1ResourceClaimTemplateSpecBuilder>{
  public V1beta1ResourceClaimTemplateSpecBuilder() {
    this(new V1beta1ResourceClaimTemplateSpec());
  }
  
  public V1beta1ResourceClaimTemplateSpecBuilder(V1beta1ResourceClaimTemplateSpecFluent<?> fluent) {
    this(fluent, new V1beta1ResourceClaimTemplateSpec());
  }
  
  public V1beta1ResourceClaimTemplateSpecBuilder(V1beta1ResourceClaimTemplateSpecFluent<?> fluent,V1beta1ResourceClaimTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceClaimTemplateSpecBuilder(V1beta1ResourceClaimTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceClaimTemplateSpecFluent<?> fluent;
  
  public V1beta1ResourceClaimTemplateSpec build() {
    V1beta1ResourceClaimTemplateSpec buildable = new V1beta1ResourceClaimTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}