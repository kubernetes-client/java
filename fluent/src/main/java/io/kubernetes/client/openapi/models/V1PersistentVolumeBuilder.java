package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PersistentVolumeBuilder extends V1PersistentVolumeFluentImpl<V1PersistentVolumeBuilder> implements VisitableBuilder<V1PersistentVolume,V1PersistentVolumeBuilder>{
  public V1PersistentVolumeBuilder() {
    this(false);
  }
  public V1PersistentVolumeBuilder(Boolean validationEnabled) {
    this(new V1PersistentVolume(), validationEnabled);
  }
  public V1PersistentVolumeBuilder(V1PersistentVolumeFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PersistentVolumeBuilder(V1PersistentVolumeFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PersistentVolume(), validationEnabled);
  }
  public V1PersistentVolumeBuilder(V1PersistentVolumeFluent<?> fluent,V1PersistentVolume instance) {
    this(fluent, instance, false);
  }
  public V1PersistentVolumeBuilder(V1PersistentVolumeFluent<?> fluent,V1PersistentVolume instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1PersistentVolumeBuilder(V1PersistentVolume instance) {
    this(instance,false);
  }
  public V1PersistentVolumeBuilder(V1PersistentVolume instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1PersistentVolumeFluent<?> fluent;
  Boolean validationEnabled;
  public V1PersistentVolume build() {
    V1PersistentVolume buildable = new V1PersistentVolume();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}