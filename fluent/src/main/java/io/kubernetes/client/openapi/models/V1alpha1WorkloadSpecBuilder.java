package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1WorkloadSpecBuilder extends V1alpha1WorkloadSpecFluent<V1alpha1WorkloadSpecBuilder> implements VisitableBuilder<V1alpha1WorkloadSpec,V1alpha1WorkloadSpecBuilder>{

  V1alpha1WorkloadSpecFluent<?> fluent;

  public V1alpha1WorkloadSpecBuilder() {
    this(new V1alpha1WorkloadSpec());
  }
  
  public V1alpha1WorkloadSpecBuilder(V1alpha1WorkloadSpecFluent<?> fluent) {
    this(fluent, new V1alpha1WorkloadSpec());
  }
  
  public V1alpha1WorkloadSpecBuilder(V1alpha1WorkloadSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1WorkloadSpecBuilder(V1alpha1WorkloadSpecFluent<?> fluent,V1alpha1WorkloadSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1WorkloadSpec build() {
    V1alpha1WorkloadSpec buildable = new V1alpha1WorkloadSpec();
    buildable.setControllerRef(fluent.buildControllerRef());
    buildable.setPodGroups(fluent.buildPodGroups());
    return buildable;
  }
  
}