package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1RollingUpdateDaemonSetBuilder extends V1RollingUpdateDaemonSetFluent<V1RollingUpdateDaemonSetBuilder> implements VisitableBuilder<V1RollingUpdateDaemonSet,V1RollingUpdateDaemonSetBuilder>{
  public V1RollingUpdateDaemonSetBuilder() {
    this(new V1RollingUpdateDaemonSet());
  }
  
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSetFluent<?> fluent) {
    this(fluent, new V1RollingUpdateDaemonSet());
  }
  
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSetFluent<?> fluent,V1RollingUpdateDaemonSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1RollingUpdateDaemonSetFluent<?> fluent;
  
  public V1RollingUpdateDaemonSet build() {
    V1RollingUpdateDaemonSet buildable = new V1RollingUpdateDaemonSet();
    buildable.setMaxSurge(fluent.getMaxSurge());
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    return buildable;
  }
  

}