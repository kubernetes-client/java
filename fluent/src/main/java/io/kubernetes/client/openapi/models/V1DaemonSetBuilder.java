package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1DaemonSetBuilder extends V1DaemonSetFluentImpl<V1DaemonSetBuilder> implements VisitableBuilder<V1DaemonSet,V1DaemonSetBuilder>{
  public V1DaemonSetBuilder() {
    this(false);
  }
  public V1DaemonSetBuilder(Boolean validationEnabled) {
    this(new V1DaemonSet(), validationEnabled);
  }
  public V1DaemonSetBuilder(V1DaemonSetFluent<?> fluent) {
    this(fluent, false);
  }
  public V1DaemonSetBuilder(V1DaemonSetFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1DaemonSet(), validationEnabled);
  }
  public V1DaemonSetBuilder(V1DaemonSetFluent<?> fluent,V1DaemonSet instance) {
    this(fluent, instance, false);
  }
  public V1DaemonSetBuilder(V1DaemonSetFluent<?> fluent,V1DaemonSet instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1DaemonSetBuilder(V1DaemonSet instance) {
    this(instance,false);
  }
  public V1DaemonSetBuilder(V1DaemonSet instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1DaemonSetFluent<?> fluent;
  Boolean validationEnabled;
  public V1DaemonSet build() {
    V1DaemonSet buildable = new V1DaemonSet();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}