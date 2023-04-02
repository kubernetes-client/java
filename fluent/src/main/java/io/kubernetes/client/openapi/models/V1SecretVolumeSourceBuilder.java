package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1SecretVolumeSourceBuilder extends V1SecretVolumeSourceFluentImpl<V1SecretVolumeSourceBuilder> implements VisitableBuilder<V1SecretVolumeSource,V1SecretVolumeSourceBuilder>{
  public V1SecretVolumeSourceBuilder() {
    this(false);
  }
  public V1SecretVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1SecretVolumeSource(), validationEnabled);
  }
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1SecretVolumeSource(), validationEnabled);
  }
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent,V1SecretVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSourceFluent<?> fluent,V1SecretVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDefaultMode(instance.getDefaultMode());

    fluent.withItems(instance.getItems());

    fluent.withOptional(instance.getOptional());

    fluent.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled; 
  }
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSource instance) {
    this(instance,false);
  }
  public V1SecretVolumeSourceBuilder(V1SecretVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDefaultMode(instance.getDefaultMode());

    this.withItems(instance.getItems());

    this.withOptional(instance.getOptional());

    this.withSecretName(instance.getSecretName());

    this.validationEnabled = validationEnabled; 
  }
  V1SecretVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1SecretVolumeSource build() {
    V1SecretVolumeSource buildable = new V1SecretVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.getItems());
    buildable.setOptional(fluent.getOptional());
    buildable.setSecretName(fluent.getSecretName());
    return buildable;
  }
  
}