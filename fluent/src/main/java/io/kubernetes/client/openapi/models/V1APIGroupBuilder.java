package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1APIGroupBuilder extends V1APIGroupFluent<V1APIGroupBuilder> implements VisitableBuilder<V1APIGroup,V1APIGroupBuilder>{
  public V1APIGroupBuilder() {
    this(new V1APIGroup());
  }
  
  public V1APIGroupBuilder(V1APIGroupFluent<?> fluent) {
    this(fluent, new V1APIGroup());
  }
  
  public V1APIGroupBuilder(V1APIGroupFluent<?> fluent,V1APIGroup instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1APIGroupBuilder(V1APIGroup instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1APIGroupFluent<?> fluent;
  
  public V1APIGroup build() {
    V1APIGroup buildable = new V1APIGroup();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setName(fluent.getName());
    buildable.setPreferredVersion(fluent.buildPreferredVersion());
    buildable.setServerAddressByClientCIDRs(fluent.buildServerAddressByClientCIDRs());
    buildable.setVersions(fluent.buildVersions());
    return buildable;
  }
  

}