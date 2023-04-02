package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StorageOSVolumeSourceBuilder extends V1StorageOSVolumeSourceFluentImpl<V1StorageOSVolumeSourceBuilder> implements VisitableBuilder<V1StorageOSVolumeSource,V1StorageOSVolumeSourceBuilder>{
  public V1StorageOSVolumeSourceBuilder() {
    this(false);
  }
  public V1StorageOSVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1StorageOSVolumeSource(), validationEnabled);
  }
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StorageOSVolumeSource(), validationEnabled);
  }
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSourceFluent<?> fluent,V1StorageOSVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSourceFluent<?> fluent,V1StorageOSVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withVolumeName(instance.getVolumeName());

    fluent.withVolumeNamespace(instance.getVolumeNamespace());

    this.validationEnabled = validationEnabled; 
  }
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSource instance) {
    this(instance,false);
  }
  public V1StorageOSVolumeSourceBuilder(V1StorageOSVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeName(instance.getVolumeName());

    this.withVolumeNamespace(instance.getVolumeNamespace());

    this.validationEnabled = validationEnabled; 
  }
  V1StorageOSVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1StorageOSVolumeSource build() {
    V1StorageOSVolumeSource buildable = new V1StorageOSVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setVolumeName(fluent.getVolumeName());
    buildable.setVolumeNamespace(fluent.getVolumeNamespace());
    return buildable;
  }
  
}