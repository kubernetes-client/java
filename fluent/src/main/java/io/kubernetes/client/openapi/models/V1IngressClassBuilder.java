package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressClassBuilder extends V1IngressClassFluent<V1IngressClassBuilder> implements VisitableBuilder<V1IngressClass,V1IngressClassBuilder>{
  public V1IngressClassBuilder() {
    this(new V1IngressClass());
  }
  
  public V1IngressClassBuilder(V1IngressClassFluent<?> fluent) {
    this(fluent, new V1IngressClass());
  }
  
  public V1IngressClassBuilder(V1IngressClassFluent<?> fluent,V1IngressClass instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressClassBuilder(V1IngressClass instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressClassFluent<?> fluent;
  
  public V1IngressClass build() {
    V1IngressClass buildable = new V1IngressClass();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  

}