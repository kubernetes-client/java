package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EvictionBuilder extends V1EvictionFluent<V1EvictionBuilder> implements VisitableBuilder<V1Eviction,V1EvictionBuilder>{
  public V1EvictionBuilder() {
    this(new V1Eviction());
  }
  
  public V1EvictionBuilder(V1EvictionFluent<?> fluent) {
    this(fluent, new V1Eviction());
  }
  
  public V1EvictionBuilder(V1EvictionFluent<?> fluent,V1Eviction instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EvictionBuilder(V1Eviction instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EvictionFluent<?> fluent;
  
  public V1Eviction build() {
    V1Eviction buildable = new V1Eviction();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setDeleteOptions(fluent.buildDeleteOptions());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}