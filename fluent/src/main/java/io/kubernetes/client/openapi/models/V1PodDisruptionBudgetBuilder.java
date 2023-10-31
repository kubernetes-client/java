package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodDisruptionBudgetBuilder extends V1PodDisruptionBudgetFluent<V1PodDisruptionBudgetBuilder> implements VisitableBuilder<V1PodDisruptionBudget,V1PodDisruptionBudgetBuilder>{
  public V1PodDisruptionBudgetBuilder() {
    this(new V1PodDisruptionBudget());
  }
  
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudgetFluent<?> fluent) {
    this(fluent, new V1PodDisruptionBudget());
  }
  
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudgetFluent<?> fluent,V1PodDisruptionBudget instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudget instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodDisruptionBudgetFluent<?> fluent;
  
  public V1PodDisruptionBudget build() {
    V1PodDisruptionBudget buildable = new V1PodDisruptionBudget();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}