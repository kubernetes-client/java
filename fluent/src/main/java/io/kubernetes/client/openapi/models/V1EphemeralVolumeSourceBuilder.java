package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1EphemeralVolumeSourceBuilder extends V1EphemeralVolumeSourceFluentImpl<V1EphemeralVolumeSourceBuilder> implements VisitableBuilder<V1EphemeralVolumeSource,V1EphemeralVolumeSourceBuilder>{
  public V1EphemeralVolumeSourceBuilder() {
    this(false);
  }
  public V1EphemeralVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1EphemeralVolumeSource(), validationEnabled);
  }
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1EphemeralVolumeSource(), validationEnabled);
  }
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSourceFluent<?> fluent,V1EphemeralVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSourceFluent<?> fluent,V1EphemeralVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());

    this.validationEnabled = validationEnabled; 
  }
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSource instance) {
    this(instance,false);
  }
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withVolumeClaimTemplate(instance.getVolumeClaimTemplate());

    this.validationEnabled = validationEnabled; 
  }
  V1EphemeralVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1EphemeralVolumeSource build() {
    V1EphemeralVolumeSource buildable = new V1EphemeralVolumeSource();
    buildable.setVolumeClaimTemplate(fluent.getVolumeClaimTemplate());
    return buildable;
  }
  
}