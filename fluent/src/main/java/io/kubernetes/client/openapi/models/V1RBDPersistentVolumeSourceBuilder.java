package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RBDPersistentVolumeSourceBuilder extends V1RBDPersistentVolumeSourceFluentImpl<V1RBDPersistentVolumeSourceBuilder> implements VisitableBuilder<V1RBDPersistentVolumeSource,V1RBDPersistentVolumeSourceBuilder>{
  public V1RBDPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1RBDPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1RBDPersistentVolumeSource(), validationEnabled);
  }
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RBDPersistentVolumeSource(), validationEnabled);
  }
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSourceFluent<?> fluent,V1RBDPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSourceFluent<?> fluent,V1RBDPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withImage(instance.getImage());

    fluent.withKeyring(instance.getKeyring());

    fluent.withMonitors(instance.getMonitors());

    fluent.withPool(instance.getPool());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1RBDPersistentVolumeSourceBuilder(V1RBDPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withImage(instance.getImage());

    this.withKeyring(instance.getKeyring());

    this.withMonitors(instance.getMonitors());

    this.withPool(instance.getPool());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withUser(instance.getUser());

    this.validationEnabled = validationEnabled; 
  }
  V1RBDPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1RBDPersistentVolumeSource build() {
    V1RBDPersistentVolumeSource buildable = new V1RBDPersistentVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setImage(fluent.getImage());
    buildable.setKeyring(fluent.getKeyring());
    buildable.setMonitors(fluent.getMonitors());
    buildable.setPool(fluent.getPool());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setUser(fluent.getUser());
    return buildable;
  }
  
}