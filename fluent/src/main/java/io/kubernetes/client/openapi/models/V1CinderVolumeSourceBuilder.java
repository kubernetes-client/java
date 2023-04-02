package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1CinderVolumeSourceBuilder extends V1CinderVolumeSourceFluentImpl<V1CinderVolumeSourceBuilder> implements VisitableBuilder<V1CinderVolumeSource,V1CinderVolumeSourceBuilder>{
  public V1CinderVolumeSourceBuilder() {
    this(false);
  }
  public V1CinderVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1CinderVolumeSource(), validationEnabled);
  }
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1CinderVolumeSource(), validationEnabled);
  }
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSourceFluent<?> fluent,V1CinderVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSourceFluent<?> fluent,V1CinderVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSource instance) {
    this(instance,false);
  }
  public V1CinderVolumeSourceBuilder(V1CinderVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  V1CinderVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1CinderVolumeSource build() {
    V1CinderVolumeSource buildable = new V1CinderVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  
}