package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1AzureFilePersistentVolumeSourceBuilder extends V1AzureFilePersistentVolumeSourceFluent<V1AzureFilePersistentVolumeSourceBuilder> implements VisitableBuilder<V1AzureFilePersistentVolumeSource,V1AzureFilePersistentVolumeSourceBuilder>{
  public V1AzureFilePersistentVolumeSourceBuilder() {
    this(new V1AzureFilePersistentVolumeSource());
  }
  
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSourceFluent<?> fluent) {
    this(fluent, new V1AzureFilePersistentVolumeSource());
  }
  
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSourceFluent<?> fluent,V1AzureFilePersistentVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AzureFilePersistentVolumeSourceFluent<?> fluent;
  
  public V1AzureFilePersistentVolumeSource build() {
    V1AzureFilePersistentVolumeSource buildable = new V1AzureFilePersistentVolumeSource();
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setSecretNamespace(fluent.getSecretNamespace());
    buildable.setShareName(fluent.getShareName());
    return buildable;
  }
  

}