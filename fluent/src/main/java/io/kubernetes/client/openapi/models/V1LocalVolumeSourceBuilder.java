package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1LocalVolumeSourceBuilder extends V1LocalVolumeSourceFluent<V1LocalVolumeSourceBuilder> implements VisitableBuilder<V1LocalVolumeSource,V1LocalVolumeSourceBuilder>{
  public V1LocalVolumeSourceBuilder() {
    this(new V1LocalVolumeSource());
  }
  
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent) {
    this(fluent, new V1LocalVolumeSource());
  }
  
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent,V1LocalVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1LocalVolumeSourceFluent<?> fluent;
  
  public V1LocalVolumeSource build() {
    V1LocalVolumeSource buildable = new V1LocalVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  

}