package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1AffinityBuilder extends V1AffinityFluent<V1AffinityBuilder> implements VisitableBuilder<V1Affinity,V1AffinityBuilder>{
  public V1AffinityBuilder() {
    this(new V1Affinity());
  }
  
  public V1AffinityBuilder(V1AffinityFluent<?> fluent) {
    this(fluent, new V1Affinity());
  }
  
  public V1AffinityBuilder(V1AffinityFluent<?> fluent,V1Affinity instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1AffinityBuilder(V1Affinity instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1AffinityFluent<?> fluent;
  
  public V1Affinity build() {
    V1Affinity buildable = new V1Affinity();
    buildable.setNodeAffinity(fluent.buildNodeAffinity());
    buildable.setPodAffinity(fluent.buildPodAffinity());
    buildable.setPodAntiAffinity(fluent.buildPodAntiAffinity());
    return buildable;
  }
  

}