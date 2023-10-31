package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EmptyDirVolumeSourceBuilder extends V1EmptyDirVolumeSourceFluent<V1EmptyDirVolumeSourceBuilder> implements VisitableBuilder<V1EmptyDirVolumeSource,V1EmptyDirVolumeSourceBuilder>{
  public V1EmptyDirVolumeSourceBuilder() {
    this(new V1EmptyDirVolumeSource());
  }
  
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent) {
    this(fluent, new V1EmptyDirVolumeSource());
  }
  
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent,V1EmptyDirVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EmptyDirVolumeSourceFluent<?> fluent;
  
  public V1EmptyDirVolumeSource build() {
    V1EmptyDirVolumeSource buildable = new V1EmptyDirVolumeSource();
    buildable.setMedium(fluent.getMedium());
    buildable.setSizeLimit(fluent.getSizeLimit());
    return buildable;
  }
  

}