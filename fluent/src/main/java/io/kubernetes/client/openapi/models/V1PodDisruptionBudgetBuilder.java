package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodDisruptionBudgetBuilder extends V1PodDisruptionBudgetFluentImpl<V1PodDisruptionBudgetBuilder> implements VisitableBuilder<V1PodDisruptionBudget,V1PodDisruptionBudgetBuilder>{
  public V1PodDisruptionBudgetBuilder() {
    this(false);
  }
  public V1PodDisruptionBudgetBuilder(Boolean validationEnabled) {
    this(new V1PodDisruptionBudget(), validationEnabled);
  }
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudgetFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudgetFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodDisruptionBudget(), validationEnabled);
  }
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudgetFluent<?> fluent,V1PodDisruptionBudget instance) {
    this(fluent, instance, false);
  }
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudgetFluent<?> fluent,V1PodDisruptionBudget instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudget instance) {
    this(instance,false);
  }
  public V1PodDisruptionBudgetBuilder(V1PodDisruptionBudget instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1PodDisruptionBudgetFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodDisruptionBudget build() {
    V1PodDisruptionBudget buildable = new V1PodDisruptionBudget();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}