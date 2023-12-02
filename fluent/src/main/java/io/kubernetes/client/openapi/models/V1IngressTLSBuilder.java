package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressTLSBuilder extends V1IngressTLSFluent<V1IngressTLSBuilder> implements VisitableBuilder<V1IngressTLS,V1IngressTLSBuilder>{
  public V1IngressTLSBuilder() {
    this(new V1IngressTLS());
  }
  
  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent) {
    this(fluent, new V1IngressTLS());
  }
  
  public V1IngressTLSBuilder(V1IngressTLSFluent<?> fluent,V1IngressTLS instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressTLSBuilder(V1IngressTLS instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressTLSFluent<?> fluent;
  
  public V1IngressTLS build() {
    V1IngressTLS buildable = new V1IngressTLS();
    buildable.setHosts(fluent.getHosts());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
  

}