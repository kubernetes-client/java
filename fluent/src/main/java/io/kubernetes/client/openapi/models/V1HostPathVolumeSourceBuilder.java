package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1HostPathVolumeSourceBuilder extends V1HostPathVolumeSourceFluentImpl<V1HostPathVolumeSourceBuilder> implements VisitableBuilder<V1HostPathVolumeSource,V1HostPathVolumeSourceBuilder>{
  public V1HostPathVolumeSourceBuilder() {
    this(false);
  }
  public V1HostPathVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1HostPathVolumeSource(), validationEnabled);
  }
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1HostPathVolumeSource(), validationEnabled);
  }
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSourceFluent<?> fluent,V1HostPathVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSourceFluent<?> fluent,V1HostPathVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPath(instance.getPath());

    fluent.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSource instance) {
    this(instance,false);
  }
  public V1HostPathVolumeSourceBuilder(V1HostPathVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPath(instance.getPath());

    this.withType(instance.getType());

    this.validationEnabled = validationEnabled; 
  }
  V1HostPathVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1HostPathVolumeSource build() {
    V1HostPathVolumeSource buildable = new V1HostPathVolumeSource();
    buildable.setPath(fluent.getPath());
    buildable.setType(fluent.getType());
    return buildable;
  }
  
}