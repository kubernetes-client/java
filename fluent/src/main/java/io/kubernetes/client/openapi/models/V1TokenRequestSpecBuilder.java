package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1TokenRequestSpecBuilder extends V1TokenRequestSpecFluent<V1TokenRequestSpecBuilder> implements VisitableBuilder<V1TokenRequestSpec,V1TokenRequestSpecBuilder>{
  public V1TokenRequestSpecBuilder() {
    this(new V1TokenRequestSpec());
  }
  
  public V1TokenRequestSpecBuilder(V1TokenRequestSpecFluent<?> fluent) {
    this(fluent, new V1TokenRequestSpec());
  }
  
  public V1TokenRequestSpecBuilder(V1TokenRequestSpecFluent<?> fluent,V1TokenRequestSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1TokenRequestSpecBuilder(V1TokenRequestSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1TokenRequestSpecFluent<?> fluent;
  
  public V1TokenRequestSpec build() {
    V1TokenRequestSpec buildable = new V1TokenRequestSpec();
    buildable.setAudiences(fluent.getAudiences());
    buildable.setBoundObjectRef(fluent.buildBoundObjectRef());
    buildable.setExpirationSeconds(fluent.getExpirationSeconds());
    return buildable;
  }
  

}