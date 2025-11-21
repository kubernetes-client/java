package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ReplicaSetBuilder extends V1ReplicaSetFluent<V1ReplicaSetBuilder> implements VisitableBuilder<V1ReplicaSet,V1ReplicaSetBuilder>{

  V1ReplicaSetFluent<?> fluent;

  public V1ReplicaSetBuilder() {
    this(new V1ReplicaSet());
  }
  
  public V1ReplicaSetBuilder(V1ReplicaSetFluent<?> fluent) {
    this(fluent, new V1ReplicaSet());
  }
  
  public V1ReplicaSetBuilder(V1ReplicaSet instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ReplicaSetBuilder(V1ReplicaSetFluent<?> fluent,V1ReplicaSet instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ReplicaSet build() {
    V1ReplicaSet buildable = new V1ReplicaSet();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  
}