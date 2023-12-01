package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RBDPersistentVolumeSourceBuilder extends V1RBDPersistentVolumeSourceFluent<V1RBDPersistentVolumeSourceBuilder> implements VisitableBuilder<V1RBDPersistentVolumeSource,V1RBDPersistentVolumeSourceBuilder>{
  public V1RBDPersistentVolumeSourceBuilder() {
    this(new V1RBDPersistentVolumeSource());
  }
  
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1RBDPersistentVolumeSource());
  }
  
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSourceFluent<?> fluent,V1RBDPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RBDPersistentVolumeSourceFluent<?> fluent;
  
  public V1RBDPersistentVolumeSource build() {
    V1RBDPersistentVolumeSource buildable = new V1RBDPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setImage(fluent.getImage());
    buildable.setKeyring(fluent.getKeyring());
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPool(fluent.getPool());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  

}