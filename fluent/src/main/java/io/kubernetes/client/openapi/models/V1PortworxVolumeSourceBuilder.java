package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PortworxVolumeSourceBuilder extends V1PortworxVolumeSourceFluent<V1PortworxVolumeSourceBuilder> implements VisitableBuilder<V1PortworxVolumeSource,V1PortworxVolumeSourceBuilder>{
  public V1PortworxVolumeSourceBuilder() {
    this(new V1PortworxVolumeSource());
  }
  
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSourceFluent<?> fluent) {
    this(fluent, new V1PortworxVolumeSource());
  }
  
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSourceFluent<?> fluent,V1PortworxVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PortworxVolumeSourceFluent<?> fluent;
  
  public V1PortworxVolumeSource build() {
    V1PortworxVolumeSource buildable = new V1PortworxVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  

}