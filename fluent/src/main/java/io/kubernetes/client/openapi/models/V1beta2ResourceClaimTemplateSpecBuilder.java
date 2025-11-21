package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2ResourceClaimTemplateSpecBuilder extends V1beta2ResourceClaimTemplateSpecFluent<V1beta2ResourceClaimTemplateSpecBuilder> implements VisitableBuilder<V1beta2ResourceClaimTemplateSpec,V1beta2ResourceClaimTemplateSpecBuilder>{

  V1beta2ResourceClaimTemplateSpecFluent<?> fluent;

  public V1beta2ResourceClaimTemplateSpecBuilder() {
    this(new V1beta2ResourceClaimTemplateSpec());
  }
  
  public V1beta2ResourceClaimTemplateSpecBuilder(V1beta2ResourceClaimTemplateSpecFluent<?> fluent) {
    this(fluent, new V1beta2ResourceClaimTemplateSpec());
  }
  
  public V1beta2ResourceClaimTemplateSpecBuilder(V1beta2ResourceClaimTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1beta2ResourceClaimTemplateSpecBuilder(V1beta2ResourceClaimTemplateSpecFluent<?> fluent,V1beta2ResourceClaimTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1beta2ResourceClaimTemplateSpec build() {
    V1beta2ResourceClaimTemplateSpec buildable = new V1beta2ResourceClaimTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}