package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ConfigMapVolumeSourceBuilder extends V1ConfigMapVolumeSourceFluent<V1ConfigMapVolumeSourceBuilder> implements VisitableBuilder<V1ConfigMapVolumeSource,V1ConfigMapVolumeSourceBuilder>{
  public V1ConfigMapVolumeSourceBuilder() {
    this(new V1ConfigMapVolumeSource());
  }
  
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ConfigMapVolumeSource());
  }
  
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSourceFluent<?> fluent,V1ConfigMapVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ConfigMapVolumeSourceFluent<?> fluent;
  
  public V1ConfigMapVolumeSource build() {
    V1ConfigMapVolumeSource buildable = new V1ConfigMapVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.buildItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  

}