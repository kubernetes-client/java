package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1WeightedPodAffinityTermBuilder extends V1WeightedPodAffinityTermFluentImpl<V1WeightedPodAffinityTermBuilder> implements VisitableBuilder<V1WeightedPodAffinityTerm,V1WeightedPodAffinityTermBuilder>{
  public V1WeightedPodAffinityTermBuilder() {
    this(false);
  }
  public V1WeightedPodAffinityTermBuilder(Boolean validationEnabled) {
    this(new V1WeightedPodAffinityTerm(), validationEnabled);
  }
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTermFluent<?> fluent) {
    this(fluent, false);
  }
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTermFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1WeightedPodAffinityTerm(), validationEnabled);
  }
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTermFluent<?> fluent,V1WeightedPodAffinityTerm instance) {
    this(fluent, instance, false);
  }
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTermFluent<?> fluent,V1WeightedPodAffinityTerm instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withPodAffinityTerm(instance.getPodAffinityTerm());

    fluent.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled; 
  }
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTerm instance) {
    this(instance,false);
  }
  public V1WeightedPodAffinityTermBuilder(V1WeightedPodAffinityTerm instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withPodAffinityTerm(instance.getPodAffinityTerm());

    this.withWeight(instance.getWeight());

    this.validationEnabled = validationEnabled; 
  }
  V1WeightedPodAffinityTermFluent<?> fluent;
  Boolean validationEnabled;
  public V1WeightedPodAffinityTerm build() {
    V1WeightedPodAffinityTerm buildable = new V1WeightedPodAffinityTerm();
    buildable.setPodAffinityTerm(fluent.getPodAffinityTerm());
    buildable.setWeight(fluent.getWeight());
    return buildable;
  }
  
}