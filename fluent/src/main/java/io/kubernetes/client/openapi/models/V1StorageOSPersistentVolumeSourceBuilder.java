package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1StorageOSPersistentVolumeSourceBuilder extends V1StorageOSPersistentVolumeSourceFluentImpl<V1StorageOSPersistentVolumeSourceBuilder> implements VisitableBuilder<V1StorageOSPersistentVolumeSource,V1StorageOSPersistentVolumeSourceBuilder>{
  public V1StorageOSPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1StorageOSPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1StorageOSPersistentVolumeSource(), validationEnabled);
  }
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1StorageOSPersistentVolumeSource(), validationEnabled);
  }
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSourceFluent<?> fluent,V1StorageOSPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSourceFluent<?> fluent,V1StorageOSPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withVolumeName(instance.getVolumeName());

    fluent.withVolumeNamespace(instance.getVolumeNamespace());

    this.validationEnabled = validationEnabled; 
  }
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1StorageOSPersistentVolumeSourceBuilder(V1StorageOSPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeName(instance.getVolumeName());

    this.withVolumeNamespace(instance.getVolumeNamespace());

    this.validationEnabled = validationEnabled; 
  }
  V1StorageOSPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1StorageOSPersistentVolumeSource build() {
    V1StorageOSPersistentVolumeSource buildable = new V1StorageOSPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setVolumeName(fluent.getVolumeName());
    buildable.setVolumeNamespace(fluent.getVolumeNamespace());
    return buildable;
  }
  
}