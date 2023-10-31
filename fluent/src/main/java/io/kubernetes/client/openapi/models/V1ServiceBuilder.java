package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceBuilder extends V1ServiceFluent<V1ServiceBuilder> implements VisitableBuilder<V1Service,V1ServiceBuilder>{
  public V1ServiceBuilder() {
    this(new V1Service());
  }
  
  public V1ServiceBuilder(V1ServiceFluent<?> fluent) {
    this(fluent, new V1Service());
  }
  
  public V1ServiceBuilder(V1ServiceFluent<?> fluent,V1Service instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceBuilder(V1Service instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceFluent<?> fluent;
  
  public V1Service build() {
    V1Service buildable = new V1Service();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}