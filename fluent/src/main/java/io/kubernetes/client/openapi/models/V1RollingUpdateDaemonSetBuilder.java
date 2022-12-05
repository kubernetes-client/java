package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1RollingUpdateDaemonSetBuilder extends V1RollingUpdateDaemonSetFluentImpl<V1RollingUpdateDaemonSetBuilder> implements VisitableBuilder<V1RollingUpdateDaemonSet,V1RollingUpdateDaemonSetBuilder>{
  public V1RollingUpdateDaemonSetBuilder() {
    this(false);
  }
  public V1RollingUpdateDaemonSetBuilder(Boolean validationEnabled) {
    this(new V1RollingUpdateDaemonSet(), validationEnabled);
  }
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSetFluent<?> fluent) {
    this(fluent, false);
  }
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSetFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1RollingUpdateDaemonSet(), validationEnabled);
  }
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSetFluent<?> fluent,V1RollingUpdateDaemonSet instance) {
    this(fluent, instance, false);
  }
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSetFluent<?> fluent,V1RollingUpdateDaemonSet instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withMaxSurge(instance.getMaxSurge());

    fluent.withMaxUnavailable(instance.getMaxUnavailable());

    this.validationEnabled = validationEnabled; 
  }
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSet instance) {
    this(instance,false);
  }
  public V1RollingUpdateDaemonSetBuilder(V1RollingUpdateDaemonSet instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withMaxSurge(instance.getMaxSurge());

    this.withMaxUnavailable(instance.getMaxUnavailable());

    this.validationEnabled = validationEnabled; 
  }
  V1RollingUpdateDaemonSetFluent<?> fluent;
  Boolean validationEnabled;
  public V1RollingUpdateDaemonSet build() {
    V1RollingUpdateDaemonSet buildable = new V1RollingUpdateDaemonSet();
    buildable.setMaxSurge(fluent.getMaxSurge());
    buildable.setMaxUnavailable(fluent.getMaxUnavailable());
    return buildable;
  }
  
}