package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1alpha1WorkloadBuilder extends V1alpha1WorkloadFluent<V1alpha1WorkloadBuilder> implements VisitableBuilder<V1alpha1Workload,V1alpha1WorkloadBuilder>{

  V1alpha1WorkloadFluent<?> fluent;

  public V1alpha1WorkloadBuilder() {
    this(new V1alpha1Workload());
  }
  
  public V1alpha1WorkloadBuilder(V1alpha1WorkloadFluent<?> fluent) {
    this(fluent, new V1alpha1Workload());
  }
  
  public V1alpha1WorkloadBuilder(V1alpha1Workload instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1alpha1WorkloadBuilder(V1alpha1WorkloadFluent<?> fluent,V1alpha1Workload instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1alpha1Workload build() {
    V1alpha1Workload buildable = new V1alpha1Workload();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    return buildable;
  }
  
}