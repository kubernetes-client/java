package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EmptyDirVolumeSourceBuilder extends V1EmptyDirVolumeSourceFluentImpl<V1EmptyDirVolumeSourceBuilder> implements VisitableBuilder<V1EmptyDirVolumeSource,V1EmptyDirVolumeSourceBuilder>{
  public V1EmptyDirVolumeSourceBuilder() {
    this(false);
  }
  public V1EmptyDirVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1EmptyDirVolumeSource(), validationEnabled);
  }
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EmptyDirVolumeSource(), validationEnabled);
  }
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent,V1EmptyDirVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSourceFluent<?> fluent,V1EmptyDirVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMedium(instance.getMedium());

    fluent.withSizeLimit(instance.getSizeLimit());

    this.validationEnabled = validationEnabled; 
  }
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSource instance) {
    this(instance,false);
  }
  public V1EmptyDirVolumeSourceBuilder(V1EmptyDirVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMedium(instance.getMedium());

    this.withSizeLimit(instance.getSizeLimit());

    this.validationEnabled = validationEnabled; 
  }
  V1EmptyDirVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1EmptyDirVolumeSource build() {
    V1EmptyDirVolumeSource buildable = new V1EmptyDirVolumeSource();
    buildable.setMedium(fluent.getMedium());
    buildable.setSizeLimit(fluent.getSizeLimit());
    return buildable;
  }
  
}