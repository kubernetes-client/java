package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1FlexVolumeSourceBuilder extends V1FlexVolumeSourceFluent<V1FlexVolumeSourceBuilder> implements VisitableBuilder<V1FlexVolumeSource,V1FlexVolumeSourceBuilder>{
  public V1FlexVolumeSourceBuilder() {
    this(new V1FlexVolumeSource());
  }
  
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSourceFluent<?> fluent) {
    this(fluent, new V1FlexVolumeSource());
  }
  
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSourceFluent<?> fluent,V1FlexVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1FlexVolumeSourceFluent<?> fluent;
  
  public V1FlexVolumeSource build() {
    V1FlexVolumeSource buildable = new V1FlexVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.buildSecretRef());
    return buildable;
  }
  

}