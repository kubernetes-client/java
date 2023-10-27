package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlockerVolumeSourceBuilder extends V1FlockerVolumeSourceFluent<V1FlockerVolumeSourceBuilder> implements VisitableBuilder<V1FlockerVolumeSource,V1FlockerVolumeSourceBuilder>{
  public V1FlockerVolumeSourceBuilder() {
    this(new V1FlockerVolumeSource());
  }
  
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent) {
    this(fluent, new V1FlockerVolumeSource());
  }
  
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSourceFluent<?> fluent,V1FlockerVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlockerVolumeSourceBuilder(V1FlockerVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlockerVolumeSourceFluent<?> fluent;
  
  public V1FlockerVolumeSource build() {
    V1FlockerVolumeSource buildable = new V1FlockerVolumeSource();
    buildable.setDatasetName(fluent.getDatasetName());
    buildable.setDatasetUUID(fluent.getDatasetUUID());
    return buildable;
  }
  

}