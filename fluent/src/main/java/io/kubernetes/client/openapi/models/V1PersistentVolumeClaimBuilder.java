package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PersistentVolumeClaimBuilder extends V1PersistentVolumeClaimFluent<V1PersistentVolumeClaimBuilder> implements VisitableBuilder<V1PersistentVolumeClaim,V1PersistentVolumeClaimBuilder>{
  public V1PersistentVolumeClaimBuilder() {
    this(new V1PersistentVolumeClaim());
  }
  
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaimFluent<?> fluent) {
    this(fluent, new V1PersistentVolumeClaim());
  }
  
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaimFluent<?> fluent,V1PersistentVolumeClaim instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PersistentVolumeClaimBuilder(V1PersistentVolumeClaim instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PersistentVolumeClaimFluent<?> fluent;
  
  public V1PersistentVolumeClaim build() {
    V1PersistentVolumeClaim buildable = new V1PersistentVolumeClaim();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}