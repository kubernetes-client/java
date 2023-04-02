package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1AffinityBuilder extends V1AffinityFluentImpl<V1AffinityBuilder> implements VisitableBuilder<V1Affinity,V1AffinityBuilder>{
  public V1AffinityBuilder() {
    this(false);
  }
  public V1AffinityBuilder(Boolean validationEnabled) {
    this(new V1Affinity(), validationEnabled);
  }
  public V1AffinityBuilder(V1AffinityFluent<?> fluent) {
    this(fluent, false);
  }
  public V1AffinityBuilder(V1AffinityFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1Affinity(), validationEnabled);
  }
  public V1AffinityBuilder(V1AffinityFluent<?> fluent,V1Affinity instance) {
    this(fluent, instance, false);
  }
  public V1AffinityBuilder(V1AffinityFluent<?> fluent,V1Affinity instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withNodeAffinity(instance.getNodeAffinity());

    fluent.withPodAffinity(instance.getPodAffinity());

    fluent.withPodAntiAffinity(instance.getPodAntiAffinity());

    this.validationEnabled = validationEnabled; 
  }
  public V1AffinityBuilder(V1Affinity instance) {
    this(instance,false);
  }
  public V1AffinityBuilder(V1Affinity instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withNodeAffinity(instance.getNodeAffinity());

    this.withPodAffinity(instance.getPodAffinity());

    this.withPodAntiAffinity(instance.getPodAntiAffinity());

    this.validationEnabled = validationEnabled; 
  }
  V1AffinityFluent<?> fluent;
  Boolean validationEnabled;
  public V1Affinity build() {
    V1Affinity buildable = new V1Affinity();
    buildable.setNodeAffinity(fluent.getNodeAffinity());
    buildable.setPodAffinity(fluent.getPodAffinity());
    buildable.setPodAntiAffinity(fluent.getPodAntiAffinity());
    return buildable;
  }
  
}