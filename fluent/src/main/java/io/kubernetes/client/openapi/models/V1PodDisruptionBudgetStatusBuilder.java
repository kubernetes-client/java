package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodDisruptionBudgetStatusBuilder extends V1PodDisruptionBudgetStatusFluentImpl<V1PodDisruptionBudgetStatusBuilder> implements VisitableBuilder<V1PodDisruptionBudgetStatus,V1PodDisruptionBudgetStatusBuilder>{
  public V1PodDisruptionBudgetStatusBuilder() {
    this(false);
  }
  public V1PodDisruptionBudgetStatusBuilder(Boolean validationEnabled) {
    this(new V1PodDisruptionBudgetStatus(), validationEnabled);
  }
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodDisruptionBudgetStatus(), validationEnabled);
  }
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatusFluent<?> fluent,V1PodDisruptionBudgetStatus instance) {
    this(fluent, instance, false);
  }
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatusFluent<?> fluent,V1PodDisruptionBudgetStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withConditions(instance.getConditions());

    fluent.withCurrentHealthy(instance.getCurrentHealthy());

    fluent.withDesiredHealthy(instance.getDesiredHealthy());

    fluent.withDisruptedPods(instance.getDisruptedPods());

    fluent.withDisruptionsAllowed(instance.getDisruptionsAllowed());

    fluent.withExpectedPods(instance.getExpectedPods());

    fluent.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatus instance) {
    this(instance,false);
  }
  public V1PodDisruptionBudgetStatusBuilder(V1PodDisruptionBudgetStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withConditions(instance.getConditions());

    this.withCurrentHealthy(instance.getCurrentHealthy());

    this.withDesiredHealthy(instance.getDesiredHealthy());

    this.withDisruptedPods(instance.getDisruptedPods());

    this.withDisruptionsAllowed(instance.getDisruptionsAllowed());

    this.withExpectedPods(instance.getExpectedPods());

    this.withObservedGeneration(instance.getObservedGeneration());

    this.validationEnabled = validationEnabled; 
  }
  V1PodDisruptionBudgetStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodDisruptionBudgetStatus build() {
    V1PodDisruptionBudgetStatus buildable = new V1PodDisruptionBudgetStatus();
    buildable.setConditions(fluent.getConditions());
    buildable.setCurrentHealthy(fluent.getCurrentHealthy());
    buildable.setDesiredHealthy(fluent.getDesiredHealthy());
    buildable.setDisruptedPods(fluent.getDisruptedPods());
    buildable.setDisruptionsAllowed(fluent.getDisruptionsAllowed());
    buildable.setExpectedPods(fluent.getExpectedPods());
    buildable.setObservedGeneration(fluent.getObservedGeneration());
    return buildable;
  }
  
}