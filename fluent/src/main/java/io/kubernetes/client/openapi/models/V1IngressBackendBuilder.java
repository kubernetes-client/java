package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressBackendBuilder extends V1IngressBackendFluent<V1IngressBackendBuilder> implements VisitableBuilder<V1IngressBackend,V1IngressBackendBuilder>{
  public V1IngressBackendBuilder() {
    this(new V1IngressBackend());
  }
  
  public V1IngressBackendBuilder(V1IngressBackendFluent<?> fluent) {
    this(fluent, new V1IngressBackend());
  }
  
  public V1IngressBackendBuilder(V1IngressBackendFluent<?> fluent,V1IngressBackend instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressBackendBuilder(V1IngressBackend instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressBackendFluent<?> fluent;
  
  public V1IngressBackend build() {
    V1IngressBackend buildable = new V1IngressBackend();
    buildable.setResource(fluent.buildResource());
    buildable.setService(fluent.buildService());
    return buildable;
  }
  

}