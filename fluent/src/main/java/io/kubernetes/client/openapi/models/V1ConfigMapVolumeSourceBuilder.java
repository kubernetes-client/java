package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ConfigMapVolumeSourceBuilder extends V1ConfigMapVolumeSourceFluentImpl<V1ConfigMapVolumeSourceBuilder> implements VisitableBuilder<V1ConfigMapVolumeSource,V1ConfigMapVolumeSourceBuilder>{
  public V1ConfigMapVolumeSourceBuilder() {
    this(false);
  }
  public V1ConfigMapVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1ConfigMapVolumeSource(), validationEnabled);
  }
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ConfigMapVolumeSource(), validationEnabled);
  }
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSourceFluent<?> fluent,V1ConfigMapVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSourceFluent<?> fluent,V1ConfigMapVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDefaultMode(instance.getDefaultMode());

    fluent.withItems(instance.getItems());

    fluent.withName(instance.getName());

    fluent.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSource instance) {
    this(instance,false);
  }
  public V1ConfigMapVolumeSourceBuilder(V1ConfigMapVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDefaultMode(instance.getDefaultMode());

    this.withItems(instance.getItems());

    this.withName(instance.getName());

    this.withOptional(instance.getOptional());

    this.validationEnabled = validationEnabled; 
  }
  V1ConfigMapVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ConfigMapVolumeSource build() {
    V1ConfigMapVolumeSource buildable = new V1ConfigMapVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setItems(fluent.getItems());
    buildable.setName(fluent.getName());
    buildable.setOptional(fluent.getOptional());
    return buildable;
  }
  
}