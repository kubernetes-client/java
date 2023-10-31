package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FCVolumeSourceBuilder extends V1FCVolumeSourceFluent<V1FCVolumeSourceBuilder> implements VisitableBuilder<V1FCVolumeSource,V1FCVolumeSourceBuilder>{
  public V1FCVolumeSourceBuilder() {
    this(new V1FCVolumeSource());
  }
  
  public V1FCVolumeSourceBuilder(V1FCVolumeSourceFluent<?> fluent) {
    this(fluent, new V1FCVolumeSource());
  }
  
  public V1FCVolumeSourceBuilder(V1FCVolumeSourceFluent<?> fluent,V1FCVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FCVolumeSourceBuilder(V1FCVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FCVolumeSourceFluent<?> fluent;
  
  public V1FCVolumeSource build() {
    V1FCVolumeSource buildable = new V1FCVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setLun(fluent.getLun());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setTargetWWNs(fluent.getTargetWWNs());
    buildable.setWwids(fluent.getWwids());
    return buildable;
  }
  

}