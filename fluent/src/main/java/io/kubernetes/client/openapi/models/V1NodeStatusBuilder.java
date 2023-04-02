package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1NodeStatusBuilder extends V1NodeStatusFluentImpl<V1NodeStatusBuilder> implements VisitableBuilder<V1NodeStatus,V1NodeStatusBuilder>{
  public V1NodeStatusBuilder() {
    this(false);
  }
  public V1NodeStatusBuilder(Boolean validationEnabled) {
    this(new V1NodeStatus(), validationEnabled);
  }
  public V1NodeStatusBuilder(V1NodeStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V1NodeStatusBuilder(V1NodeStatusFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1NodeStatus(), validationEnabled);
  }
  public V1NodeStatusBuilder(V1NodeStatusFluent<?> fluent,V1NodeStatus instance) {
    this(fluent, instance, false);
  }
  public V1NodeStatusBuilder(V1NodeStatusFluent<?> fluent,V1NodeStatus instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withAddresses(instance.getAddresses());

    fluent.withAllocatable(instance.getAllocatable());

    fluent.withCapacity(instance.getCapacity());

    fluent.withConditions(instance.getConditions());

    fluent.withConfig(instance.getConfig());

    fluent.withDaemonEndpoints(instance.getDaemonEndpoints());

    fluent.withImages(instance.getImages());

    fluent.withNodeInfo(instance.getNodeInfo());

    fluent.withPhase(instance.getPhase());

    fluent.withVolumesAttached(instance.getVolumesAttached());

    fluent.withVolumesInUse(instance.getVolumesInUse());

    this.validationEnabled = validationEnabled; 
  }
  public V1NodeStatusBuilder(V1NodeStatus instance) {
    this(instance,false);
  }
  public V1NodeStatusBuilder(V1NodeStatus instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withAddresses(instance.getAddresses());

    this.withAllocatable(instance.getAllocatable());

    this.withCapacity(instance.getCapacity());

    this.withConditions(instance.getConditions());

    this.withConfig(instance.getConfig());

    this.withDaemonEndpoints(instance.getDaemonEndpoints());

    this.withImages(instance.getImages());

    this.withNodeInfo(instance.getNodeInfo());

    this.withPhase(instance.getPhase());

    this.withVolumesAttached(instance.getVolumesAttached());

    this.withVolumesInUse(instance.getVolumesInUse());

    this.validationEnabled = validationEnabled; 
  }
  V1NodeStatusFluent<?> fluent;
  Boolean validationEnabled;
  public V1NodeStatus build() {
    V1NodeStatus buildable = new V1NodeStatus();
    buildable.setAddresses(fluent.getAddresses());
    buildable.setAllocatable(fluent.getAllocatable());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConditions(fluent.getConditions());
    buildable.setConfig(fluent.getConfig());
    buildable.setDaemonEndpoints(fluent.getDaemonEndpoints());
    buildable.setImages(fluent.getImages());
    buildable.setNodeInfo(fluent.getNodeInfo());
    buildable.setPhase(fluent.getPhase());
    buildable.setVolumesAttached(fluent.getVolumesAttached());
    buildable.setVolumesInUse(fluent.getVolumesInUse());
    return buildable;
  }
  
}