package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodDisruptionBudgetListBuilder extends V1PodDisruptionBudgetListFluentImpl<V1PodDisruptionBudgetListBuilder> implements VisitableBuilder<V1PodDisruptionBudgetList,V1PodDisruptionBudgetListBuilder>{
  public V1PodDisruptionBudgetListBuilder() {
    this(false);
  }
  public V1PodDisruptionBudgetListBuilder(Boolean validationEnabled) {
    this(new V1PodDisruptionBudgetList(), validationEnabled);
  }
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetListFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetListFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodDisruptionBudgetList(), validationEnabled);
  }
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetListFluent<?> fluent,V1PodDisruptionBudgetList instance) {
    this(fluent, instance, false);
  }
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetListFluent<?> fluent,V1PodDisruptionBudgetList instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetList instance) {
    this(instance,false);
  }
  public V1PodDisruptionBudgetListBuilder(V1PodDisruptionBudgetList instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled; 
  }
  V1PodDisruptionBudgetListFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodDisruptionBudgetList build() {
    V1PodDisruptionBudgetList buildable = new V1PodDisruptionBudgetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }
  
}