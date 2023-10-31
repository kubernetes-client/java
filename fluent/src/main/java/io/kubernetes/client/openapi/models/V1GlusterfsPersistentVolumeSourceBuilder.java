package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1GlusterfsPersistentVolumeSourceBuilder extends V1GlusterfsPersistentVolumeSourceFluent<V1GlusterfsPersistentVolumeSourceBuilder> implements VisitableBuilder<V1GlusterfsPersistentVolumeSource,V1GlusterfsPersistentVolumeSourceBuilder>{
  public V1GlusterfsPersistentVolumeSourceBuilder() {
    this(new V1GlusterfsPersistentVolumeSource());
  }
  
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1GlusterfsPersistentVolumeSource());
  }
  
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSourceFluent<?> fluent,V1GlusterfsPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1GlusterfsPersistentVolumeSourceFluent<?> fluent;
  
  public V1GlusterfsPersistentVolumeSource build() {
    V1GlusterfsPersistentVolumeSource buildable = new V1GlusterfsPersistentVolumeSource();
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setEndpointsNamespace(fluent.getEndpointsNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  

}