package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeListBuilder extends V1PersistentVolumeListFluent<V1PersistentVolumeListBuilder> implements VisitableBuilder<V1PersistentVolumeList,V1PersistentVolumeListBuilder>{
  public V1PersistentVolumeListBuilder() {
    this(new V1PersistentVolumeList());
  }
  
  public V1PersistentVolumeListBuilder(V1PersistentVolumeListFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeList());
  }
  
  public V1PersistentVolumeListBuilder(V1PersistentVolumeListFluent<?> fluent,V1PersistentVolumeList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeListBuilder(V1PersistentVolumeList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeListFluent<?> fluent;
  
  public V1PersistentVolumeList build() {
    V1PersistentVolumeList buildable = new V1PersistentVolumeList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}