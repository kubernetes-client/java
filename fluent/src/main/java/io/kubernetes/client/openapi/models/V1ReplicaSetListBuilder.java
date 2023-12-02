package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicaSetListBuilder extends V1ReplicaSetListFluent<V1ReplicaSetListBuilder> implements VisitableBuilder<V1ReplicaSetList,V1ReplicaSetListBuilder>{
  public V1ReplicaSetListBuilder() {
    this(new V1ReplicaSetList());
  }
  
  public V1ReplicaSetListBuilder(V1ReplicaSetListFluent<?> fluent) {
    this(fluent, new V1ReplicaSetList());
  }
  
  public V1ReplicaSetListBuilder(V1ReplicaSetListFluent<?> fluent,V1ReplicaSetList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicaSetListBuilder(V1ReplicaSetList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicaSetListFluent<?> fluent;
  
  public V1ReplicaSetList build() {
    V1ReplicaSetList buildable = new V1ReplicaSetList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}