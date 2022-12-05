package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1VolumeNodeAffinityBuilder extends V1VolumeNodeAffinityFluentImpl<V1VolumeNodeAffinityBuilder> implements VisitableBuilder<V1VolumeNodeAffinity,V1VolumeNodeAffinityBuilder>{
  public V1VolumeNodeAffinityBuilder() {
    this(false);
  }
  public V1VolumeNodeAffinityBuilder(Boolean validationEnabled) {
    this(new V1VolumeNodeAffinity(), validationEnabled);
  }
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinityFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1VolumeNodeAffinity(), validationEnabled);
  }
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinityFluent<?> fluent,V1VolumeNodeAffinity instance) {
    this(fluent, instance, false);
  }
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinityFluent<?> fluent,V1VolumeNodeAffinity instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withRequired(instance.getRequired());

    this.validationEnabled = validationEnabled; 
  }
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinity instance) {
    this(instance,false);
  }
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinity instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withRequired(instance.getRequired());

    this.validationEnabled = validationEnabled; 
  }
  V1VolumeNodeAffinityFluent<?> fluent;
  Boolean validationEnabled;
  public V1VolumeNodeAffinity build() {
    V1VolumeNodeAffinity buildable = new V1VolumeNodeAffinity();
    buildable.setRequired(fluent.getRequired());
    return buildable;
  }
  
}