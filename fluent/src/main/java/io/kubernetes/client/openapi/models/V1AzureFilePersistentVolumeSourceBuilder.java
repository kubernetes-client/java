package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1AzureFilePersistentVolumeSourceBuilder extends V1AzureFilePersistentVolumeSourceFluentImpl<V1AzureFilePersistentVolumeSourceBuilder> implements VisitableBuilder<V1AzureFilePersistentVolumeSource,V1AzureFilePersistentVolumeSourceBuilder>{
  public V1AzureFilePersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1AzureFilePersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1AzureFilePersistentVolumeSource(), validationEnabled);
  }
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1AzureFilePersistentVolumeSource(), validationEnabled);
  }
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSourceFluent<?> fluent,V1AzureFilePersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSourceFluent<?> fluent,V1AzureFilePersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretName(instance.getSecretName());

    fluent.withSecretNamespace(instance.getSecretNamespace());

    fluent.withShareName(instance.getShareName());

    this.validationEnabled = validationEnabled; 
  }
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1AzureFilePersistentVolumeSourceBuilder(V1AzureFilePersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withReadOnly(instance.getReadOnly());

    this.withSecretName(instance.getSecretName());

    this.withSecretNamespace(instance.getSecretNamespace());

    this.withShareName(instance.getShareName());

    this.validationEnabled = validationEnabled; 
  }
  V1AzureFilePersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1AzureFilePersistentVolumeSource build() {
    V1AzureFilePersistentVolumeSource buildable = new V1AzureFilePersistentVolumeSource();
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setSecretNamespace(fluent.getSecretNamespace());
    buildable.setShareName(fluent.getShareName());
    return buildable;
  }
  
}