package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1GroupVersionForDiscoveryBuilder extends V1GroupVersionForDiscoveryFluent<V1GroupVersionForDiscoveryBuilder> implements VisitableBuilder<V1GroupVersionForDiscovery,V1GroupVersionForDiscoveryBuilder>{
  public V1GroupVersionForDiscoveryBuilder() {
    this(new V1GroupVersionForDiscovery());
  }
  
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscoveryFluent<?> fluent) {
    this(fluent, new V1GroupVersionForDiscovery());
  }
  
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscoveryFluent<?> fluent,V1GroupVersionForDiscovery instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1GroupVersionForDiscoveryBuilder(V1GroupVersionForDiscovery instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1GroupVersionForDiscoveryFluent<?> fluent;
  
  public V1GroupVersionForDiscovery build() {
    V1GroupVersionForDiscovery buildable = new V1GroupVersionForDiscovery();
    buildable.setGroupVersion(fluent.getGroupVersion());
    buildable.setVersion(fluent.getVersion());
    return buildable;
  }
  

}