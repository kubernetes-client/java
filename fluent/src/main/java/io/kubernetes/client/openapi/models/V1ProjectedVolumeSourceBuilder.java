package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ProjectedVolumeSourceBuilder extends V1ProjectedVolumeSourceFluent<V1ProjectedVolumeSourceBuilder> implements VisitableBuilder<V1ProjectedVolumeSource,V1ProjectedVolumeSourceBuilder>{
  public V1ProjectedVolumeSourceBuilder() {
    this(new V1ProjectedVolumeSource());
  }
  
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSourceFluent<?> fluent) {
    this(fluent, new V1ProjectedVolumeSource());
  }
  
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSourceFluent<?> fluent,V1ProjectedVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ProjectedVolumeSourceFluent<?> fluent;
  
  public V1ProjectedVolumeSource build() {
    V1ProjectedVolumeSource buildable = new V1ProjectedVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setSources(fluent.buildSources());
    return buildable;
  }
  

}