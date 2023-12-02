package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ReplicationControllerBuilder extends V1ReplicationControllerFluent<V1ReplicationControllerBuilder> implements VisitableBuilder<V1ReplicationController,V1ReplicationControllerBuilder>{
  public V1ReplicationControllerBuilder() {
    this(new V1ReplicationController());
  }
  
  public V1ReplicationControllerBuilder(V1ReplicationControllerFluent<?> fluent) {
    this(fluent, new V1ReplicationController());
  }
  
  public V1ReplicationControllerBuilder(V1ReplicationControllerFluent<?> fluent,V1ReplicationController instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ReplicationControllerBuilder(V1ReplicationController instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ReplicationControllerFluent<?> fluent;
  
  public V1ReplicationController build() {
    V1ReplicationController buildable = new V1ReplicationController();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.buildMetadata());
    buildable.setSpec(fluent.buildSpec());
    buildable.setStatus(fluent.buildStatus());
    return buildable;
  }
  

}