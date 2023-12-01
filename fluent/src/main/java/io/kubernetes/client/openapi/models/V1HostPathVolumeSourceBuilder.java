package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1HostPathVolumeSourceBuilder extends V1HostPathVolumeSourceFluent<V1HostPathVolumeSourceBuilder> implements VisitableBuilder<V1HostPathVolumeSource,V1HostPathVolumeSourceBuilder>{
  public V1HostPathVolumeSourceBuilder() {
    this(new V1HostPathVolumeSource());
  }
  
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSourceFluent<?> fluent) {
    this(fluent, new V1HostPathVolumeSource());
  }
  
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSourceFluent<?> fluent,V1HostPathVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1HostPathVolumeSourceFluent<?> fluent;
  
  public V1HostPathVolumeSource build() {
    V1HostPathVolumeSource buildable = new V1HostPathVolumeSource();
    buildable.setPath(fluent.getPath());
    buildable.setType(fluent.getType());
    return buildable;
  }
  

}