package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1LocalVolumeSourceBuilder extends V1LocalVolumeSourceFluentImpl<V1LocalVolumeSourceBuilder> implements VisitableBuilder<V1LocalVolumeSource,V1LocalVolumeSourceBuilder>{
  public V1LocalVolumeSourceBuilder() {
    this(false);
  }
  public V1LocalVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1LocalVolumeSource(), validationEnabled);
  }
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1LocalVolumeSource(), validationEnabled);
  }
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent,V1LocalVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSourceFluent<?> fluent,V1LocalVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withFsType(instance.getFsType());

    fluent.withPath(instance.getPath());

    this.validationEnabled = validationEnabled; 
  }
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSource instance) {
    this(instance,false);
  }
  public V1LocalVolumeSourceBuilder(V1LocalVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withFsType(instance.getFsType());

    this.withPath(instance.getPath());

    this.validationEnabled = validationEnabled; 
  }
  V1LocalVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1LocalVolumeSource build() {
    V1LocalVolumeSource buildable = new V1LocalVolumeSource();
    buildable.setFsType(fluent.getFsType());
    buildable.setPath(fluent.getPath());
    return buildable;
  }
  
}