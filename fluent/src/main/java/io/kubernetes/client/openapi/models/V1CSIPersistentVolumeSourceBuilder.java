package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSIPersistentVolumeSourceBuilder extends V1CSIPersistentVolumeSourceFluent<V1CSIPersistentVolumeSourceBuilder> implements VisitableBuilder<V1CSIPersistentVolumeSource,V1CSIPersistentVolumeSourceBuilder>{
  public V1CSIPersistentVolumeSourceBuilder() {
    this(new V1CSIPersistentVolumeSource());
  }
  
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CSIPersistentVolumeSource());
  }
  
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSourceFluent<?> fluent,V1CSIPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSIPersistentVolumeSourceBuilder(V1CSIPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSIPersistentVolumeSourceFluent<?> fluent;
  
  public V1CSIPersistentVolumeSource build() {
    V1CSIPersistentVolumeSource buildable = new V1CSIPersistentVolumeSource();
    buildable.setControllerExpandSecretRef(fluent.buildControllerExpandSecretRef());
    buildable.setControllerPublishSecretRef(fluent.buildControllerPublishSecretRef());
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setNodeExpandSecretRef(fluent.buildNodeExpandSecretRef());
    buildable.setNodePublishSecretRef(fluent.buildNodePublishSecretRef());
    buildable.setNodeStageSecretRef(fluent.buildNodeStageSecretRef());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeAttributes(fluent.getVolumeAttributes());
    buildable.setVolumeHandle(fluent.getVolumeHandle());
    return buildable;
  }
  

}