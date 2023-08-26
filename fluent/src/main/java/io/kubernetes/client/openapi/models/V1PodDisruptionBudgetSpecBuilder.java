package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1PodDisruptionBudgetSpecBuilder extends V1PodDisruptionBudgetSpecFluentImpl<V1PodDisruptionBudgetSpecBuilder> implements VisitableBuilder<V1PodDisruptionBudgetSpec,V1PodDisruptionBudgetSpecBuilder>{
  public V1PodDisruptionBudgetSpecBuilder() {
    this(false);
  }
  public V1PodDisruptionBudgetSpecBuilder(Boolean validationEnabled) {
    this(new V1PodDisruptionBudgetSpec(), validationEnabled);
  }
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1PodDisruptionBudgetSpec(), validationEnabled);
  }
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpecFluent<?> fluent,V1PodDisruptionBudgetSpec instance) {
    this(fluent, instance, false);
  }
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpecFluent<?> fluent,V1PodDisruptionBudgetSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    if (instance != null) {
      fluent.withMaxUnavailable(instance.getMaxUnavailable());
      fluent.withMinAvailable(instance.getMinAvailable());
      fluent.withSelector(instance.getSelector());
      fluent.withUnhealthyPodEvictionPolicy(instance.getUnhealthyPodEvictionPolicy());
    }
    this.validationEnabled = validationEnabled; 
  }
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpec instance) {
    this(instance,false);
  }
  public V1PodDisruptionBudgetSpecBuilder(V1PodDisruptionBudgetSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    if (instance != null) {
      this.withMaxUnavailable(instance.getMaxUnavailable());
      this.withMinAvailable(instance.getMinAvailable());
      this.withSelector(instance.getSelector());
      this.withUnhealthyPodEvictionPolicy(instance.getUnhealthyPodEvictionPolicy());
    }
    this.validationEnabled = validationEnabled; 
  }
  V1PodDisruptionBudgetSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1PodDisruptionBudgetSpec build() {
    V1PodDisruptionBudgetSpec buildable = new V1PodDisruptionBudgetSpec();
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    buildable.setMinAvailable(fluent.getMinAvailable());
    buildable.setSelector(fluent.getSelector());
    buildable.setUnhealthyPodEvictionPolicy(fluent.getUnhealthyPodEvictionPolicy());
    return buildable;
  }
  
}