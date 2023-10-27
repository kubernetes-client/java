package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CinderVolumeSourceBuilder extends V1CinderVolumeSourceFluent<V1CinderVolumeSourceBuilder> implements VisitableBuilder<V1CinderVolumeSource,V1CinderVolumeSourceBuilder>{
  public V1CinderVolumeSourceBuilder() {
    this(new V1CinderVolumeSource());
  }
  
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSourceFluent<?> fluent) {
    this(fluent, new V1CinderVolumeSource());
  }
  
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSourceFluent<?> fluent,V1CinderVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CinderVolumeSourceFluent<?> fluent;
  
  public V1CinderVolumeSource build() {
    V1CinderVolumeSource buildable = new V1CinderVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  

}