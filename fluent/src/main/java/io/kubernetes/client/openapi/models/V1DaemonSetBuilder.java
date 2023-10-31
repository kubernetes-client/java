package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1DaemonSetBuilder extends V1DaemonSetFluent<V1DaemonSetBuilder> implements VisitableBuilder<V1DaemonSet,V1DaemonSetBuilder>{
  public V1DaemonSetBuilder() {
    this(new V1DaemonSet());
  }
  
  public V1DaemonSetBuilder(V1DaemonSetFluent<?> fluent) {
    this(fluent, new V1DaemonSet());
  }
  
  public V1DaemonSetBuilder(V1DaemonSetFluent<?> fluent,V1DaemonSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DaemonSetBuilder(V1DaemonSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DaemonSetFluent<?> fluent;
  
  public V1DaemonSet build() {
    V1DaemonSet buildable = new V1DaemonSet();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}