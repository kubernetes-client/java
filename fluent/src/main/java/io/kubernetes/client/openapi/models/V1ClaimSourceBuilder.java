package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ClaimSourceBuilder extends V1ClaimSourceFluent<V1ClaimSourceBuilder> implements VisitableBuilder<V1ClaimSource,V1ClaimSourceBuilder>{
  public V1ClaimSourceBuilder() {
    this(new V1ClaimSource());
  }
  
  public V1ClaimSourceBuilder(V1ClaimSourceFluent<?> fluent) {
    this(fluent, new V1ClaimSource());
  }
  
  public V1ClaimSourceBuilder(V1ClaimSourceFluent<?> fluent,V1ClaimSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ClaimSourceBuilder(V1ClaimSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ClaimSourceFluent<?> fluent;
  
  public V1ClaimSource build() {
    V1ClaimSource buildable = new V1ClaimSource();
    buildable.setResourceClaimName(fluent.getResourceClaimName());
    buildable.setResourceClaimTemplateName(fluent.getResourceClaimTemplateName());
    return buildable;
  }
  

}