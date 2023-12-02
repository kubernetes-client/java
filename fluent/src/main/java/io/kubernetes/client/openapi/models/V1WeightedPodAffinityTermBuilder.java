package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1WeightedPodAffinityTermBuilder extends V1WeightedPodAffinityTermFluent<V1WeightedPodAffinityTermBuilder> implements VisitableBuilder<V1WeightedPodAffinityTerm,V1WeightedPodAffinityTermBuilder>{
  public V1WeightedPodAffinityTermBuilder() {
    this(new V1WeightedPodAffinityTerm());
  }
  
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTermFluent<?> fluent) {
    this(fluent, new V1WeightedPodAffinityTerm());
  }
  
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTermFluent<?> fluent,V1WeightedPodAffinityTerm instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTerm instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1WeightedPodAffinityTermFluent<?> fluent;
  
  public V1WeightedPodAffinityTerm build() {
    V1WeightedPodAffinityTerm buildable = new V1WeightedPodAffinityTerm();
    buildable.setPodAffinityTerm(fluent.buildPodAffinityTerm());
    buildable.setWeight(fluent.getWeight());
    return buildable;
  }
  

}