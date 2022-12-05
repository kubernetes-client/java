package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1FlexPersistentVolumeSourceBuilder extends V1FlexPersistentVolumeSourceFluentImpl<V1FlexPersistentVolumeSourceBuilder> implements VisitableBuilder<V1FlexPersistentVolumeSource,V1FlexPersistentVolumeSourceBuilder>{
  public V1FlexPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1FlexPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FlexPersistentVolumeSource(), validationEnabled);
  }
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1FlexPersistentVolumeSource(), validationEnabled);
  }
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent,V1FlexPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSourceFluent<?> fluent,V1FlexPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withOptions(instance.getOptions());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled; 
  }
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1FlexPersistentVolumeSourceBuilder(V1FlexPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withOptions(instance.getOptions());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled; 
  }
  V1FlexPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1FlexPersistentVolumeSource build() {
    V1FlexPersistentVolumeSource buildable = new V1FlexPersistentVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    return buildable;
  }
  
}