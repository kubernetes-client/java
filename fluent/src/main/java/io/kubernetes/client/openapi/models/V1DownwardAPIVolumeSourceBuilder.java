package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DownwardAPIVolumeSourceBuilder extends V1DownwardAPIVolumeSourceFluent<V1DownwardAPIVolumeSourceBuilder> implements VisitableBuilder<V1DownwardAPIVolumeSource,V1DownwardAPIVolumeSourceBuilder>{
  public V1DownwardAPIVolumeSourceBuilder() {
    this(new V1DownwardAPIVolumeSource());
  }
  
  public V1DownwardAPIVolumeSourceBuilder(V1DownwardAPIVolumeSourceFluent<?> fluent) {
    this(fluent, new V1DownwardAPIVolumeSource());
  }
  
  public V1DownwardAPIVolumeSourceBuilder(V1DownwardAPIVolumeSourceFluent<?> fluent,V1DownwardAPIVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DownwardAPIVolumeSourceBuilder(V1DownwardAPIVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DownwardAPIVolumeSourceFluent<?> fluent;
  
  public V1DownwardAPIVolumeSource build() {
    V1DownwardAPIVolumeSource buildable = new V1DownwardAPIVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.buildItems());
    return buildable;
  }
  

}