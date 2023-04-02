package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1GlusterfsPersistentVolumeSourceBuilder extends V1GlusterfsPersistentVolumeSourceFluentImpl<V1GlusterfsPersistentVolumeSourceBuilder> implements VisitableBuilder<V1GlusterfsPersistentVolumeSource,V1GlusterfsPersistentVolumeSourceBuilder>{
  public V1GlusterfsPersistentVolumeSourceBuilder() {
    this(false);
  }
  public V1GlusterfsPersistentVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1GlusterfsPersistentVolumeSource(), validationEnabled);
  }
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1GlusterfsPersistentVolumeSource(), validationEnabled);
  }
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSourceFluent<?> fluent,V1GlusterfsPersistentVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSourceFluent<?> fluent,V1GlusterfsPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withEndpoints(instance.getEndpoints());

    fluent.withEndpointsNamespace(instance.getEndpointsNamespace());

    fluent.withPath(instance.getPath());

    fluent.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSource instance) {
    this(instance,false);
  }
  public V1GlusterfsPersistentVolumeSourceBuilder(V1GlusterfsPersistentVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withEndpoints(instance.getEndpoints());

    this.withEndpointsNamespace(instance.getEndpointsNamespace());

    this.withPath(instance.getPath());

    this.withReadOnly(instance.getReadOnly());

    this.validationEnabled = validationEnabled; 
  }
  V1GlusterfsPersistentVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1GlusterfsPersistentVolumeSource build() {
    V1GlusterfsPersistentVolumeSource buildable = new V1GlusterfsPersistentVolumeSource();
    buildable.setEndpoints(fluent.getEndpoints());
    buildable.setEndpointsNamespace(fluent.getEndpointsNamespace());
    buildable.setPath(fluent.getPath());
    buildable.setReadOnly(fluent.getReadOnly());
    return buildable;
  }
  
}