package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1SecretVolumeSourceBuilder extends V1SecretVolumeSourceFluent<V1SecretVolumeSourceBuilder> implements VisitableBuilder<V1SecretVolumeSource,V1SecretVolumeSourceBuilder>{
  public V1SecretVolumeSourceBuilder() {
    this(new V1SecretVolumeSource());
  }
  
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent) {
    this(fluent, new V1SecretVolumeSource());
  }
  
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent,V1SecretVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1SecretVolumeSourceFluent<?> fluent;
  
  public V1SecretVolumeSource build() {
    V1SecretVolumeSource buildable = new V1SecretVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.buildItems());
    buildable.setOptional(fluent.getOptional());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
  

}