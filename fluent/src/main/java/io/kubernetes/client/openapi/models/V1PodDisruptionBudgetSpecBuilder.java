package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodDisruptionBudgetSpecBuilder extends V1PodDisruptionBudgetSpecFluent<V1PodDisruptionBudgetSpecBuilder> implements VisitableBuilder<V1PodDisruptionBudgetSpec,V1PodDisruptionBudgetSpecBuilder>{
  public V1PodDisruptionBudgetSpecBuilder() {
    this(new V1PodDisruptionBudgetSpec());
  }
  
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpecFluent<?> fluent) {
    this(fluent, new V1PodDisruptionBudgetSpec());
  }
  
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpecFluent<?> fluent,V1PodDisruptionBudgetSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodDisruptionBudgetSpecFluent<?> fluent;
  
  public V1PodDisruptionBudgetSpec build() {
    V1PodDisruptionBudgetSpec buildable = new V1PodDisruptionBudgetSpec();
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    buildable.setMinAvailable(fluent.getMinAvailable());
    buildable.setSelector(fluent.buildSelector());
    buildable.setUnhealthyPodEvictionPolicy(fluent.getUnhealthyPodEvictionPolicy());
    return buildable;
  }
  

}