package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressServiceBackendBuilder extends V1IngressServiceBackendFluent<V1IngressServiceBackendBuilder> implements VisitableBuilder<V1IngressServiceBackend,V1IngressServiceBackendBuilder>{
  public V1IngressServiceBackendBuilder() {
    this(new V1IngressServiceBackend());
  }
  
  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent) {
    this(fluent, new V1IngressServiceBackend());
  }
  
  public V1IngressServiceBackendBuilder(V1IngressServiceBackendFluent<?> fluent,V1IngressServiceBackend instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressServiceBackendBuilder(V1IngressServiceBackend instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressServiceBackendFluent<?> fluent;
  
  public V1IngressServiceBackend build() {
    V1IngressServiceBackend buildable = new V1IngressServiceBackend();
    buildable.setName(fluent.getName());
    buildable.setPort(fluent.buildPort());
    return buildable;
  }
  

}