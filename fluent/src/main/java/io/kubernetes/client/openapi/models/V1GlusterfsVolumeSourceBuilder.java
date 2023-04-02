package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1GlusterfsVolumeSourceBuilder extends V1GlusterfsVolumeSourceFluentImpl<V1GlusterfsVolumeSourceBuilder> implements VisitableBuilder<V1GlusterfsVolumeSource,V1GlusterfsVolumeSourceBuilder>{
  public V1GlusterfsVolumeSourceBuilder() {
    this(false);
  }
  public V1GlusterfsVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1GlusterfsVolumeSource(), validationEnabled);
  }
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1GlusterfsVolumeSource(), validationEnabled);
  }
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSourceFluent<?> fluent,V1GlusterfsVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSourceFluent<?> fluent,V1GlusterfsVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withEndpoints(instance.getEndpoints());

    fluent.withPath(instance.getPath());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSource instance) {
    this(instance,false);
  }
  public V1GlusterfsVolumeSourceBuilder(V1GlusterfsVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withEndpoints(instance.getEndpoints());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  V1GlusterfsVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1GlusterfsVolumeSource build() {
    V1GlusterfsVolumeSource buildable = new V1GlusterfsVolumeSource();
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  
}