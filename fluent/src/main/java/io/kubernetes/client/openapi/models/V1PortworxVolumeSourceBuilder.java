package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PortworxVolumeSourceBuilder extends V1PortworxVolumeSourceFluentImpl<V1PortworxVolumeSourceBuilder> implements VisitableBuilder<V1PortworxVolumeSource,V1PortworxVolumeSourceBuilder>{
  public V1PortworxVolumeSourceBuilder() {
    this(false);
  }
  public V1PortworxVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1PortworxVolumeSource(), validationEnabled);
  }
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PortworxVolumeSource(), validationEnabled);
  }
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSourceFluent<?> fluent,V1PortworxVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSourceFluent<?> fluent,V1PortworxVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSource instance) {
    this(instance,false);
  }
  public V1PortworxVolumeSourceBuilder(V1PortworxVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withReadOnly(instance.getReadOnly());

    this.withVolumeID(instance.getVolumeID());

    this.validationEnabled = validationEnabled; 
  }
  V1PortworxVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1PortworxVolumeSource build() {
    V1PortworxVolumeSource buildable = new V1PortworxVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setVolumeID(fluent.getVolumeID());
    return buildable;
  }
  
}