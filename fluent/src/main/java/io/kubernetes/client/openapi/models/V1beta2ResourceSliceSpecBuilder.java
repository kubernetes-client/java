package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1beta2ResourceSliceSpecBuilder extends V1beta2ResourceSliceSpecFluent<V1beta2ResourceSliceSpecBuilder> implements VisitableBuilder<V1beta2ResourceSliceSpec,V1beta2ResourceSliceSpecBuilder>{
  public V1beta2ResourceSliceSpecBuilder() {
    this(new V1beta2ResourceSliceSpec());
  }
  
  public V1beta2ResourceSliceSpecBuilder(V1beta2ResourceSliceSpecFluent<?> fluent) {
    this(fluent, new V1beta2ResourceSliceSpec());
  }
  
  public V1beta2ResourceSliceSpecBuilder(V1beta2ResourceSliceSpecFluent<?> fluent,V1beta2ResourceSliceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta2ResourceSliceSpecBuilder(V1beta2ResourceSliceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta2ResourceSliceSpecFluent<?> fluent;
  
  public V1beta2ResourceSliceSpec build() {
    V1beta2ResourceSliceSpec buildable = new V1beta2ResourceSliceSpec();
    buildable.setAllNodes(fluent.getAllNodes());
    buildable.setDevices(fluent.buildDevices());
    buildable.setDriver(fluent.getDriver());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    buildable.setPerDeviceNodeSelection(fluent.getPerDeviceNodeSelection());
    buildable.setPool(fluent.buildPool());
    buildable.setSharedCounters(fluent.buildSharedCounters());
    return buildable;
  }
  

}