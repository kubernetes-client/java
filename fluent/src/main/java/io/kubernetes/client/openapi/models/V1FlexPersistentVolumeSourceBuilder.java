package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlexPersistentVolumeSourceBuilder extends V1FlexPersistentVolumeSourceFluent<V1FlexPersistentVolumeSourceBuilder> implements VisitableBuilder<V1FlexPersistentVolumeSource,V1FlexPersistentVolumeSourceBuilder>{
  public V1FlexPersistentVolumeSourceBuilder() {
    this(new V1FlexPersistentVolumeSource());
  }
  
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1FlexPersistentVolumeSource());
  }
  
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent,V1FlexPersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlexPersistentVolumeSourceFluent<?> fluent;
  
  public V1FlexPersistentVolumeSource build() {
    V1FlexPersistentVolumeSource buildable = new V1FlexPersistentVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    return buildable;
  }
  

}