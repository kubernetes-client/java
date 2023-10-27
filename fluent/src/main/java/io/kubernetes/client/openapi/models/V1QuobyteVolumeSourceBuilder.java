package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1QuobyteVolumeSourceBuilder extends V1QuobyteVolumeSourceFluent<V1QuobyteVolumeSourceBuilder> implements VisitableBuilder<V1QuobyteVolumeSource,V1QuobyteVolumeSourceBuilder>{
  public V1QuobyteVolumeSourceBuilder() {
    this(new V1QuobyteVolumeSource());
  }
  
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSourceFluent<?> fluent) {
    this(fluent, new V1QuobyteVolumeSource());
  }
  
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSourceFluent<?> fluent,V1QuobyteVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1QuobyteVolumeSourceFluent<?> fluent;
  
  public V1QuobyteVolumeSource build() {
    V1QuobyteVolumeSource buildable = new V1QuobyteVolumeSource();
    buildable.setGroup(fluent.getGroup());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setRegistry(fluent.getRegistry());
    buildable.setTenant(fluent.getTenant());
    buildable.setUser(fluent.getUser());
    buildable.setVolume(fluent.getVolume());
    return buildable;
  }
  

}