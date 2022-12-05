package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1QuobyteVolumeSourceBuilder extends V1QuobyteVolumeSourceFluentImpl<V1QuobyteVolumeSourceBuilder> implements VisitableBuilder<V1QuobyteVolumeSource,V1QuobyteVolumeSourceBuilder>{
  public V1QuobyteVolumeSourceBuilder() {
    this(false);
  }
  public V1QuobyteVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1QuobyteVolumeSource(), validationEnabled);
  }
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1QuobyteVolumeSource(), validationEnabled);
  }
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSourceFluent<?> fluent,V1QuobyteVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSourceFluent<?> fluent,V1QuobyteVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withGroup(instance.getGroup());

    fluent.withReadOnly(instance.getReadOnly());

    fluent.withRegistry(instance.getRegistry());

    fluent.withTenant(instance.getTenant());

    fluent.withUser(instance.getUser());

    fluent.withVolume(instance.getVolume());

    this.validationEnabled = validationEnabled; 
  }
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSource instance) {
    this(instance,false);
  }
  public V1QuobyteVolumeSourceBuilder(V1QuobyteVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withGroup(instance.getGroup());

    this.withReadOnly(instance.getReadOnly());

    this.withRegistry(instance.getRegistry());

    this.withTenant(instance.getTenant());

    this.withUser(instance.getUser());

    this.withVolume(instance.getVolume());

    this.validationEnabled = validationEnabled; 
  }
  V1QuobyteVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1QuobyteVolumeSource build() {
    V1QuobyteVolumeSource buildable = new V1QuobyteVolumeSource();
    buildable.setGroup(fluent.getGroup());
    buildable.setReadOnly(fluent.getReadOnly());
    buildable.setRegistry(fluent.getRegistry());
    buildable.setTenant(fluent.getTenant());
    buildable.setUser(fluent.getUser());
    buildable.setVolume(fluent.getVolume());
    return buildable;
  }
  
}