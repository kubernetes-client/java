package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1ReplicaSetBuilder extends V1ReplicaSetFluentImpl<V1ReplicaSetBuilder> implements VisitableBuilder<V1ReplicaSet,V1ReplicaSetBuilder>{
  public V1ReplicaSetBuilder() {
    this(false);
  }
  public V1ReplicaSetBuilder(Boolean validationEnabled) {
    this(new V1ReplicaSet(), validationEnabled);
  }
  public V1ReplicaSetBuilder(V1ReplicaSetFluent<?> fluent) {
    this(fluent, false);
  }
  public V1ReplicaSetBuilder(V1ReplicaSetFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1ReplicaSet(), validationEnabled);
  }
  public V1ReplicaSetBuilder(V1ReplicaSetFluent<?> fluent,V1ReplicaSet instance) {
    this(fluent, instance, false);
  }
  public V1ReplicaSetBuilder(V1ReplicaSetFluent<?> fluent,V1ReplicaSet instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    fluent.withSpec(instance.getSpec());

    fluent.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  public V1ReplicaSetBuilder(V1ReplicaSet instance) {
    this(instance,false);
  }
  public V1ReplicaSetBuilder(V1ReplicaSet instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiVersion(instance.getApiVersion());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.withSpec(instance.getSpec());

    this.withStatus(instance.getStatus());

    this.validationEnabled = validationEnabled; 
  }
  V1ReplicaSetFluent<?> fluent;
  Boolean validationEnabled;
  public V1ReplicaSet build() {
    V1ReplicaSet buildable = new V1ReplicaSet();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    buildable.setSpec(fluent.getSpec());
    buildable.setStatus(fluent.getStatus());
    return buildable;
  }
  
}