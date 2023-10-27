package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1AzureFileVolumeSourceBuilder extends V1AzureFileVolumeSourceFluent<V1AzureFileVolumeSourceBuilder> implements VisitableBuilder<V1AzureFileVolumeSource,V1AzureFileVolumeSourceBuilder>{
  public V1AzureFileVolumeSourceBuilder() {
    this(new V1AzureFileVolumeSource());
  }
  
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSourceFluent<?> fluent) {
    this(fluent, new V1AzureFileVolumeSource());
  }
  
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSourceFluent<?> fluent,V1AzureFileVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AzureFileVolumeSourceFluent<?> fluent;
  
  public V1AzureFileVolumeSource build() {
    V1AzureFileVolumeSource buildable = new V1AzureFileVolumeSource();
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setShareName(fluent.getShareName());
    return buildable;
  }
  

}