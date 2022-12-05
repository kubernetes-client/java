package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RBDVolumeSourceBuilder extends V1RBDVolumeSourceFluentImpl<V1RBDVolumeSourceBuilder> implements VisitableBuilder<V1RBDVolumeSource,V1RBDVolumeSourceBuilder>{
  public V1RBDVolumeSourceBuilder() {
    this(false);
  }
  public V1RBDVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1RBDVolumeSource(), validationEnabled);
  }
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RBDVolumeSource(), validationEnabled);
  }
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSourceFluent<?> fluent,V1RBDVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSourceFluent<?> fluent,V1RBDVolumeSource instance,Boolean validationEnabled) {
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
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSource instance) {
    this(instance,false);
  }
  public V1RBDVolumeSourceBuilder(V1RBDVolumeSource instance,Boolean validationEnabled) {
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
  V1RBDVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1RBDVolumeSource build() {
    V1RBDVolumeSource buildable = new V1RBDVolumeSource();
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