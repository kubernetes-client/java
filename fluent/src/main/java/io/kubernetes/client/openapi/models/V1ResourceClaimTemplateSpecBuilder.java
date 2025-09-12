package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceClaimTemplateSpecBuilder extends V1ResourceClaimTemplateSpecFluent<V1ResourceClaimTemplateSpecBuilder> implements VisitableBuilder<V1ResourceClaimTemplateSpec,V1ResourceClaimTemplateSpecBuilder>{
  public V1ResourceClaimTemplateSpecBuilder() {
    this(new V1ResourceClaimTemplateSpec());
  }
  
  public V1ResourceClaimTemplateSpecBuilder(V1ResourceClaimTemplateSpecFluent<?> fluent) {
    this(fluent, new V1ResourceClaimTemplateSpec());
  }
  
  public V1ResourceClaimTemplateSpecBuilder(V1ResourceClaimTemplateSpecFluent<?> fluent,V1ResourceClaimTemplateSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ResourceClaimTemplateSpecBuilder(V1ResourceClaimTemplateSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ResourceClaimTemplateSpecFluent<?> fluent;
  
  public V1ResourceClaimTemplateSpec build() {
    V1ResourceClaimTemplateSpec buildable = new V1ResourceClaimTemplateSpec();
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}