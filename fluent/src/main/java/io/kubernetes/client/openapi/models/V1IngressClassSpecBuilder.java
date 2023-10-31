package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1IngressClassSpecBuilder extends V1IngressClassSpecFluent<V1IngressClassSpecBuilder> implements VisitableBuilder<V1IngressClassSpec,V1IngressClassSpecBuilder>{
  public V1IngressClassSpecBuilder() {
    this(new V1IngressClassSpec());
  }
  
  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent) {
    this(fluent, new V1IngressClassSpec());
  }
  
  public V1IngressClassSpecBuilder(V1IngressClassSpecFluent<?> fluent,V1IngressClassSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1IngressClassSpecBuilder(V1IngressClassSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1IngressClassSpecFluent<?> fluent;
  
  public V1IngressClassSpec build() {
    V1IngressClassSpec buildable = new V1IngressClassSpec();
    buildable.setController(fluent.getController());
    buildable.setParameters(fluent.buildParameters());
    return buildable;
  }
  

}