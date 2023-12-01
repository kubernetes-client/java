package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressBuilder extends V1IngressFluent<V1IngressBuilder> implements VisitableBuilder<V1Ingress,V1IngressBuilder>{
  public V1IngressBuilder() {
    this(new V1Ingress());
  }
  
  public V1IngressBuilder(V1IngressFluent<?> fluent) {
    this(fluent, new V1Ingress());
  }
  
  public V1IngressBuilder(V1IngressFluent<?> fluent,V1Ingress instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressBuilder(V1Ingress instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressFluent<?> fluent;
  
  public V1Ingress build() {
    V1Ingress buildable = new V1Ingress();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}