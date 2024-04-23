package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodAffinityTermBuilder extends V1PodAffinityTermFluent<V1PodAffinityTermBuilder> implements VisitableBuilder<V1PodAffinityTerm,V1PodAffinityTermBuilder>{
  public V1PodAffinityTermBuilder() {
    this(new V1PodAffinityTerm());
  }
  
  public V1PodAffinityTermBuilder(V1PodAffinityTermFluent<?> fluent) {
    this(fluent, new V1PodAffinityTerm());
  }
  
  public V1PodAffinityTermBuilder(V1PodAffinityTermFluent<?> fluent,V1PodAffinityTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodAffinityTermBuilder(V1PodAffinityTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodAffinityTermFluent<?> fluent;
  
  public V1PodAffinityTerm build() {
    V1PodAffinityTerm buildable = new V1PodAffinityTerm();
    buildable.setLabelSelector(fluent.buildLabelSelector());
    buildable.setMatchLabelKeys(fluent.getMatchLabelKeys());
    buildable.setMismatchLabelKeys(fluent.getMismatchLabelKeys());
    buildable.setNamespaceSelector(fluent.buildNamespaceSelector());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setTopologyKey(fluent.getTopologyKey());
    return buildable;
  }
  

}