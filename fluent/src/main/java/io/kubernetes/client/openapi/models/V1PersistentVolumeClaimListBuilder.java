package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeClaimListBuilder extends V1PersistentVolumeClaimListFluent<V1PersistentVolumeClaimListBuilder> implements VisitableBuilder<V1PersistentVolumeClaimList,V1PersistentVolumeClaimListBuilder>{
  public V1PersistentVolumeClaimListBuilder() {
    this(new V1PersistentVolumeClaimList());
  }
  
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimListFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaimList());
  }
  
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimListFluent<?> fluent,V1PersistentVolumeClaimList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimListBuilder(V1PersistentVolumeClaimList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeClaimListFluent<?> fluent;
  
  public V1PersistentVolumeClaimList build() {
    V1PersistentVolumeClaimList buildable = new V1PersistentVolumeClaimList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}