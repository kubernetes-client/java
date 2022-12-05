package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1FlexVolumeSourceBuilder extends V1FlexVolumeSourceFluentImpl<V1FlexVolumeSourceBuilder> implements VisitableBuilder<V1FlexVolumeSource,V1FlexVolumeSourceBuilder>{
  public V1FlexVolumeSourceBuilder() {
    this(false);
  }
  public V1FlexVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FlexVolumeSource(), validationEnabled);
  }
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1FlexVolumeSource(), validationEnabled);
  }
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSourceFluent<?> fluent,V1FlexVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSourceFluent<?> fluent,V1FlexVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDriver(instance.getDriver());

    fluent.withFsType(instance.getFsType());

    fluent.withOptions(instance.getOptions());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled; 
  }
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSource instance) {
    this(instance,false);
  }
  public V1FlexVolumeSourceBuilder(V1FlexVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDriver(instance.getDriver());

    this.withFsType(instance.getFsType());

    this.withOptions(instance.getOptions());

    this.withReadOnly(instance.getReadOnly());

    this.withSecretRef(instance.getSecretRef());

    this.validationEnabled = validationEnabled; 
  }
  V1FlexVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1FlexVolumeSource build() {
    V1FlexVolumeSource buildable = new V1FlexVolumeSource();
    buildable.setDriver(fluent.getDriver());
    buildable.setFsType(fluent.getFsType());
    buildable.setOptions(fluent.getOptions());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setSecretRef(fluent.getSecretRef());
    return buildable;
  }
  
}