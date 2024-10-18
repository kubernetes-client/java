package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ImageVolumeSourceBuilder extends V1ImageVolumeSourceFluent<V1ImageVolumeSourceBuilder> implements VisitableBuilder<V1ImageVolumeSource,V1ImageVolumeSourceBuilder>{
  public V1ImageVolumeSourceBuilder() {
    this(new V1ImageVolumeSource());
  }
  
  public V1ImageVolumeSourceBuilder(V1ImageVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ImageVolumeSource());
  }
  
  public V1ImageVolumeSourceBuilder(V1ImageVolumeSourceFluent<?> fluent,V1ImageVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ImageVolumeSourceBuilder(V1ImageVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ImageVolumeSourceFluent<?> fluent;
  
  public V1ImageVolumeSource build() {
    V1ImageVolumeSource buildable = new V1ImageVolumeSource();
    buildable.setPullPolicy(fluent.getPullPolicy());
    buildable.setReference(fluent.getReference());
    return buildable;
  }
  

}