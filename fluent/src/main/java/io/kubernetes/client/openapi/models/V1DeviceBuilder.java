package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1DeviceBuilder extends V1DeviceFluent<V1DeviceBuilder> implements VisitableBuilder<V1Device,V1DeviceBuilder>{
  public V1DeviceBuilder() {
    this(new V1Device());
  }
  
  public V1DeviceBuilder(V1DeviceFluent<?> fluent) {
    this(fluent, new V1Device());
  }
  
  public V1DeviceBuilder(V1DeviceFluent<?> fluent,V1Device instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1DeviceBuilder(V1Device instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1DeviceFluent<?> fluent;
  
  public V1Device build() {
    V1Device buildable = new V1Device();
    buildable.setAllNodes(fluent.getAllNodes());
    buildable.setAllowMultipleAllocations(fluent.getAllowMultipleAllocations());
    buildable.setAttributes(fluent.getAttributes());
    buildable.setBindingConditions(fluent.getBindingConditions());
    buildable.setBindingFailureConditions(fluent.getBindingFailureConditions());
    buildable.setBindsToNode(fluent.getBindsToNode());
    buildable.setCapacity(fluent.getCapacity());
    buildable.setConsumesCounters(fluent.buildConsumesCounters());
    buildable.setName(fluent.getName());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    buildable.setTaints(fluent.buildTaints());
    return buildable;
  }
  

}