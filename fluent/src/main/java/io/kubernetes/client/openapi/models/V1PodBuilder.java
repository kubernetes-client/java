package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodBuilder extends V1PodFluent<V1PodBuilder> implements VisitableBuilder<V1Pod,V1PodBuilder>{
  public V1PodBuilder() {
    this(new V1Pod());
  }
  
  public V1PodBuilder(V1PodFluent<?> fluent) {
    this(fluent, new V1Pod());
  }
  
  public V1PodBuilder(V1PodFluent<?> fluent,V1Pod instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodBuilder(V1Pod instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodFluent<?> fluent;
  
  public V1Pod build() {
    V1Pod buildable = new V1Pod();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}