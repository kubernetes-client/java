package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RBDVolumeSourceBuilder extends V1RBDVolumeSourceFluent<V1RBDVolumeSourceBuilder> implements VisitableBuilder<V1RBDVolumeSource,V1RBDVolumeSourceBuilder>{
  public V1RBDVolumeSourceBuilder() {
    this(new V1RBDVolumeSource());
  }
  
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSourceFluent<?> fluent) {
    this(fluent, new V1RBDVolumeSource());
  }
  
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSourceFluent<?> fluent,V1RBDVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RBDVolumeSourceFluent<?> fluent;
  
  public V1RBDVolumeSource build() {
    V1RBDVolumeSource buildable = new V1RBDVolumeSource();
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