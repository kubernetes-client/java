package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodDisruptionBudgetStatusBuilder extends V1PodDisruptionBudgetStatusFluent<V1PodDisruptionBudgetStatusBuilder> implements VisitableBuilder<V1PodDisruptionBudgetStatus,V1PodDisruptionBudgetStatusBuilder>{
  public V1PodDisruptionBudgetStatusBuilder() {
    this(new V1PodDisruptionBudgetStatus());
  }
  
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatusFluent<?> fluent) {
    this(fluent, new V1PodDisruptionBudgetStatus());
  }
  
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatusFluent<?> fluent,V1PodDisruptionBudgetStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodDisruptionBudgetStatusFluent<?> fluent;
  
  public V1PodDisruptionBudgetStatus build() {
    V1PodDisruptionBudgetStatus buildable = new V1PodDisruptionBudgetStatus();
    buildable.setConditions(fluent.buildConditions());
    buildable.setCurrentHealthy(fluent.getCurrentHealthy());
    buildable.setDesiredHealthy(fluent.getDesiredHealthy());
    buildable.setDisruptedPods(fluent.getDisruptedPods());
    buildable.setDisruptionsAllowed(fluent.getDisruptionsAllowed());
    buildable.setExpectedPods(fluent.getExpectedPods());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  

}