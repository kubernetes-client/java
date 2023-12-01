package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicationControllerListBuilder extends V1ReplicationControllerListFluent<V1ReplicationControllerListBuilder> implements VisitableBuilder<V1ReplicationControllerList,V1ReplicationControllerListBuilder>{
  public V1ReplicationControllerListBuilder() {
    this(new V1ReplicationControllerList());
  }
  
  public V1ReplicationControllerListBuilder(V1ReplicationControllerListFluent<?> fluent) {
    this(fluent, new V1ReplicationControllerList());
  }
  
  public V1ReplicationControllerListBuilder(V1ReplicationControllerListFluent<?> fluent,V1ReplicationControllerList instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicationControllerListBuilder(V1ReplicationControllerList instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicationControllerListFluent<?> fluent;
  
  public V1ReplicationControllerList build() {
    V1ReplicationControllerList buildable = new V1ReplicationControllerList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.buildItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    return buildable;
  }
  

}