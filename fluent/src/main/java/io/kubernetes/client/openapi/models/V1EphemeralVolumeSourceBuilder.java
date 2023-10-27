package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1EphemeralVolumeSourceBuilder extends V1EphemeralVolumeSourceFluent<V1EphemeralVolumeSourceBuilder> implements VisitableBuilder<V1EphemeralVolumeSource,V1EphemeralVolumeSourceBuilder>{
  public V1EphemeralVolumeSourceBuilder() {
    this(new V1EphemeralVolumeSource());
  }
  
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSourceFluent<?> fluent) {
    this(fluent, new V1EphemeralVolumeSource());
  }
  
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSourceFluent<?> fluent,V1EphemeralVolumeSource instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1EphemeralVolumeSourceBuilder(V1EphemeralVolumeSource instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1EphemeralVolumeSourceFluent<?> fluent;
  
  public V1EphemeralVolumeSource build() {
    V1EphemeralVolumeSource buildable = new V1EphemeralVolumeSource();
    buildable.setVolumeClaimTemplate(fluent.buildVolumeClaimTemplate());
    return buildable;
  }
  

}