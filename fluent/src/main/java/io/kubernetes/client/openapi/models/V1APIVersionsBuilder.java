package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIVersionsBuilder extends V1APIVersionsFluent<V1APIVersionsBuilder> implements VisitableBuilder<V1APIVersions,V1APIVersionsBuilder>{
  public V1APIVersionsBuilder() {
    this(new V1APIVersions());
  }
  
  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent) {
    this(fluent, new V1APIVersions());
  }
  
  public V1APIVersionsBuilder(V1APIVersionsFluent<?> fluent,V1APIVersions instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIVersionsBuilder(V1APIVersions instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIVersionsFluent<?> fluent;
  
  public V1APIVersions build() {
    V1APIVersions buildable = new V1APIVersions();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setServerAddressByClientCIDRs(fluent.buildServerAddressByClientCIDRs());
    buildable.setVersions(fluent.getVersions());
    return buildable;
  }
  

}