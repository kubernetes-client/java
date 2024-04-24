package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeStatusBuilder extends V1NodeStatusFluent<V1NodeStatusBuilder> implements VisitableBuilder<V1NodeStatus,V1NodeStatusBuilder>{
  public V1NodeStatusBuilder() {
    this(new V1NodeStatus());
  }
  
  public V1NodeStatusBuilder(V1NodeStatusFluent<?> fluent) {
    this(fluent, new V1NodeStatus());
  }
  
  public V1NodeStatusBuilder(V1NodeStatusFluent<?> fluent,V1NodeStatus instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeStatusBuilder(V1NodeStatus instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeStatusFluent<?> fluent;
  
  public V1NodeStatus build() {
    V1NodeStatus buildable = new V1NodeStatus();
    buildable.setAddresses(fluent.buildAddresses());
    buildable.setAllocatable(fluent.getAllocatable());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConditions(fluent.buildConditions());
    buildable.setConfig(fluent.buildConfig());
    buildable.setDaemonEndpoints(fluent.buildDaemonEndpoints());
    buildable.setImages(fluent.buildImages());
    buildable.setNodeInfo(fluent.buildNodeInfo());
    buildable.setPhase(fluent.getPhase());
    buildable.setRuntimeHandlers(fluent.buildRuntimeHandlers());
    buildable.setVolumesAttached(fluent.buildVolumesAttached());
    buildable.setVolumesInUse(fluent.getVolumesInUse());
    return buildable;
  }
  

}