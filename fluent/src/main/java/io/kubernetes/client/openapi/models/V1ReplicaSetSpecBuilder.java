package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicaSetSpecBuilder extends V1ReplicaSetSpecFluent<V1ReplicaSetSpecBuilder> implements VisitableBuilder<V1ReplicaSetSpec,V1ReplicaSetSpecBuilder>{
  public V1ReplicaSetSpecBuilder() {
    this(new V1ReplicaSetSpec());
  }
  
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent) {
    this(fluent, new V1ReplicaSetSpec());
  }
  
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpecFluent<?> fluent,V1ReplicaSetSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicaSetSpecBuilder(V1ReplicaSetSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicaSetSpecFluent<?> fluent;
  
  public V1ReplicaSetSpec build() {
    V1ReplicaSetSpec buildable = new V1ReplicaSetSpec();
    buildable.setMinReadySeconds(fluent.getMinReadySeconds());
    buildable.setReplicas(fluent.getReplicas());
    buildable.setSelector(fluent.buildSelector());
    buildable.setTemplate(fluent.buildTemplate());
    return buildable;
  }
  

}