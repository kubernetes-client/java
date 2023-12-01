package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSIVolumeSourceBuilder extends V1CSIVolumeSourceFluent<V1CSIVolumeSourceBuilder> implements VisitableBuilder<V1CSIVolumeSource,V1CSIVolumeSourceBuilder>{
  public V1CSIVolumeSourceBuilder() {
    this(new V1CSIVolumeSource());
  }
  
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CSIVolumeSource());
  }
  
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSourceFluent<?> fluent,V1CSIVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSIVolumeSourceBuilder(V1CSIVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSIVolumeSourceFluent<?> fluent;
  
  public V1CSIVolumeSource build() {
    V1CSIVolumeSource buildable = new V1CSIVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodePublishSecretRef(fluent.buildNodePublishSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    return buildable;
  }
  

}