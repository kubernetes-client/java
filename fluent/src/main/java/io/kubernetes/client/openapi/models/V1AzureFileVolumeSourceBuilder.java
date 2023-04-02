package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1AzureFileVolumeSourceBuilder extends V1AzureFileVolumeSourceFluentImpl<V1AzureFileVolumeSourceBuilder> implements VisitableBuilder<V1AzureFileVolumeSource,V1AzureFileVolumeSourceBuilder>{
  public V1AzureFileVolumeSourceBuilder() {
    this(false);
  }
  public V1AzureFileVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1AzureFileVolumeSource(), validationEnabled);
  }
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1AzureFileVolumeSource(), validationEnabled);
  }
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSourceFluent<?> fluent,V1AzureFileVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSourceFluent<?> fluent,V1AzureFileVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretName(instance.getSecretName());

    fluent.withShareName(instance.getShareName());

    this.validationEnabled = validationEnabled; 
  }
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSource instance) {
    this(instance,false);
  }
  public V1AzureFileVolumeSourceBuilder(V1AzureFileVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withReadOnly(instance.getReadOnly());

    this.withSecretName(instance.getSecretName());

    this.withShareName(instance.getShareName());

    this.validationEnabled = validationEnabled; 
  }
  V1AzureFileVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1AzureFileVolumeSource build() {
    V1AzureFileVolumeSource buildable = new V1AzureFileVolumeSource();
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretName(fluent.getSecretName());
    buildable.setShareName(fluent.getShareName());
    return buildable;
  }
  
}