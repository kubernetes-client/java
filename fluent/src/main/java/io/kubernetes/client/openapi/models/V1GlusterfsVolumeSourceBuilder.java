package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1GlusterfsVolumeSourceBuilder extends V1GlusterfsVolumeSourceFluent<V1GlusterfsVolumeSourceBuilder> implements VisitableBuilder<V1GlusterfsVolumeSource,V1GlusterfsVolumeSourceBuilder>{
  public V1GlusterfsVolumeSourceBuilder() {
    this(new V1GlusterfsVolumeSource());
  }
  
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSourceFluent<?> fluent) {
    this(fluent, new V1GlusterfsVolumeSource());
  }
  
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSourceFluent<?> fluent,V1GlusterfsVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1GlusterfsVolumeSourceFluent<?> fluent;
  
  public V1GlusterfsVolumeSource build() {
    V1GlusterfsVolumeSource buildable = new V1GlusterfsVolumeSource();
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}