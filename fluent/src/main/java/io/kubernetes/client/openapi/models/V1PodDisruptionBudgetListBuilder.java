package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1PodDisruptionBudgetListBuilder extends V1PodDisruptionBudgetListFluent<V1PodDisruptionBudgetListBuilder> implements VisitableBuilder<V1PodDisruptionBudgetList,V1PodDisruptionBudgetListBuilder>{
  public V1PodDisruptionBudgetListBuilder() {
    this(new V1PodDisruptionBudgetList());
  }
  
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetListFluent<?> fluent) {
    this(fluent, new V1PodDisruptionBudgetList());
  }
  
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetListFluent<?> fluent,V1PodDisruptionBudgetList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1PodDisruptionBudgetListFluent<?> fluent;
  
  public V1PodDisruptionBudgetList build() {
    V1PodDisruptionBudgetList buildable = new V1PodDisruptionBudgetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}