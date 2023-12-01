package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1VolumeNodeAffinityBuilder extends V1VolumeNodeAffinityFluent<V1VolumeNodeAffinityBuilder> implements VisitableBuilder<V1VolumeNodeAffinity,V1VolumeNodeAffinityBuilder>{
  public V1VolumeNodeAffinityBuilder() {
    this(new V1VolumeNodeAffinity());
  }
  
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinityFluent<?> fluent) {
    this(fluent, new V1VolumeNodeAffinity());
  }
  
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinityFluent<?> fluent,V1VolumeNodeAffinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1VolumeNodeAffinityBuilder(V1VolumeNodeAffinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1VolumeNodeAffinityFluent<?> fluent;
  
  public V1VolumeNodeAffinity build() {
    V1VolumeNodeAffinity buildable = new V1VolumeNodeAffinity();
    buildable.setRequired(fluent.buildRequired());
    return buildable;
  }
  

}