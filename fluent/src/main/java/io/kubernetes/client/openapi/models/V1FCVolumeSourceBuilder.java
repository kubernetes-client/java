package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1FCVolumeSourceBuilder extends V1FCVolumeSourceFluentImpl<V1FCVolumeSourceBuilder> implements VisitableBuilder<V1FCVolumeSource,V1FCVolumeSourceBuilder>{
  public V1FCVolumeSourceBuilder() {
    this(false);
  }
  public V1FCVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1FCVolumeSource(), validationEnabled);
  }
  public V1FCVolumeSourceBuilder(V1FCVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1FCVolumeSourceBuilder(V1FCVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1FCVolumeSource(), validationEnabled);
  }
  public V1FCVolumeSourceBuilder(V1FCVolumeSourceFluent<?> fluent,V1FCVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1FCVolumeSourceBuilder(V1FCVolumeSourceFluent<?> fluent,V1FCVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withLun(instance.getLun());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withTargetWWNs(instance.getTargetWWNs());

    fluent.withWwids(instance.getWwids());

    this.validationEnabled = validationEnabled; 
  }
  public V1FCVolumeSourceBuilder(V1FCVolumeSource instance) {
    this(instance,false);
  }
  public V1FCVolumeSourceBuilder(V1FCVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withLun(instance.getLun());

    this.withReadOnly(instance.getReadOnly());

    this.withTargetWWNs(instance.getTargetWWNs());

    this.withWwids(instance.getWwids());

    this.validationEnabled = validationEnabled; 
  }
  V1FCVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1FCVolumeSource build() {
    V1FCVolumeSource buildable = new V1FCVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setLun(fluent.getLun());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setTargetWWNs(fluent.getTargetWWNs());
    buildable.setWwids(fluent.getWwids());
    return buildable;
  }
  
}