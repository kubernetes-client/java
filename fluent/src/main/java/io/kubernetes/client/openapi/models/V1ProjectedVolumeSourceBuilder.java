package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ProjectedVolumeSourceBuilder extends V1ProjectedVolumeSourceFluentImpl<V1ProjectedVolumeSourceBuilder> implements VisitableBuilder<V1ProjectedVolumeSource,V1ProjectedVolumeSourceBuilder>{
  public V1ProjectedVolumeSourceBuilder() {
    this(false);
  }
  public V1ProjectedVolumeSourceBuilder(Boolean validationEnabled) {
    this(new V1ProjectedVolumeSource(), validationEnabled);
  }
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSourceFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSourceFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ProjectedVolumeSource(), validationEnabled);
  }
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSourceFluent<?> fluent,V1ProjectedVolumeSource instance) {
    this(fluent, instance, false);
  }
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSourceFluent<?> fluent,V1ProjectedVolumeSource instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withDefaultMode(instance.getDefaultMode());

    fluent.withSources(instance.getSources());

    this.validationEnabled = validationEnabled; 
  }
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSource instance) {
    this(instance,false);
  }
  public V1ProjectedVolumeSourceBuilder(V1ProjectedVolumeSource instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withDefaultMode(instance.getDefaultMode());

    this.withSources(instance.getSources());

    this.validationEnabled = validationEnabled; 
  }
  V1ProjectedVolumeSourceFluent<?> fluent;
  Boolean validationEnabled;
  public V1ProjectedVolumeSource build() {
    V1ProjectedVolumeSource buildable = new V1ProjectedVolumeSource();
    buildable.setDefaultMode(fluent.getDefaultMode());
    buildable.setSources(fluent.getSources());
    return buildable;
  }
  
}