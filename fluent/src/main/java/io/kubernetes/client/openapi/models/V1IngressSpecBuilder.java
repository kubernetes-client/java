package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressSpecBuilder extends V1IngressSpecFluent<V1IngressSpecBuilder> implements VisitableBuilder<V1IngressSpec,V1IngressSpecBuilder>{
  public V1IngressSpecBuilder() {
    this(new V1IngressSpec());
  }
  
  public V1IngressSpecBuilder(V1IngressSpecFluent<?> fluent) {
    this(fluent, new V1IngressSpec());
  }
  
  public V1IngressSpecBuilder(V1IngressSpecFluent<?> fluent,V1IngressSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressSpecBuilder(V1IngressSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressSpecFluent<?> fluent;
  
  public V1IngressSpec build() {
    V1IngressSpec buildable = new V1IngressSpec();
    buildable.setDefaultBackend(fluent.buildDefaultBackend());
    buildable.setIngressClassName(fluent.getIngressClassName());
    buildable.setRules(fluent.buildRules());
    buildable.setTls(fluent.buildTls());
    return buildable;
  }
  

}