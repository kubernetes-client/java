package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ScaleIOVolumeSourceBuilder extends V1ScaleIOVolumeSourceFluentImpl<V1ScaleIOVolumeSourceBuilder> implements VisitableBuilder<V1ScaleIOVolumeSource,V1ScaleIOVolumeSourceBuilder>{
  public V1ScaleIOVolumeSourceBuilder() {
    this(false);
  }
  public V1ScaleIOVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1ScaleIOVolumeSource(), validationEnabled);
  }
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ScaleIOVolumeSource(), validationEnabled);
  }
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSourceFluent<?> fluent,V1ScaleIOVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSourceFluent<?> fluent,V1ScaleIOVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withGateway(instance.getGateway());

    fluent.withProtectionDomain(instance.getProtectionDomain());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withSslEnabled(instance.getSslEnabled());

    fluent.withStorageMode(instance.getStorageMode());

    fluent.withStoragePool(instance.getStoragePool());

    fluent.withSystem(instance.getSystem());

    fluent.withVolumeName(instance.getVolumeName());

    this.validationEnabled = validationEnabled; 
  }
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSource instance) {
    this(instance,false);
  }
  public V1ScaleIOVolumeSourceBuilder(V1ScaleIOVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withGateway(instance.getGateway());

    this.withProtectionDomain(instance.getProtectionDomain());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withSslEnabled(instance.getSslEnabled());

    this.withStorageMode(instance.getStorageMode());

    this.withStoragePool(instance.getStoragePool());

    this.withSystem(instance.getSystem());

    this.withVolumeName(instance.getVolumeName());

    this.validationEnabled = validationEnabled; 
  }
  V1ScaleIOVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ScaleIOVolumeSource build() {
    V1ScaleIOVolumeSource buildable = new V1ScaleIOVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setGateway(fluent.getGateway());
    buildable.setProtectionDomain(fluent.getProtectionDomain());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setSslEnabled(fluent.getSslEnabled());
    buildable.setStorageMode(fluent.getStorageMode());
    buildable.setStoragePool(fluent.getStoragePool());
    buildable.setSystem(fluent.getSystem());
    buildable.setVolumeName(fluent.getVolumeName());
    return buildable;
  }
  
}