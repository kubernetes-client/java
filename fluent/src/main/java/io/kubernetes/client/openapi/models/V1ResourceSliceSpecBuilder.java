package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
public class V1ResourceSliceSpecBuilder extends V1ResourceSliceSpecFluent<V1ResourceSliceSpecBuilder> implements VisitableBuilder<V1ResourceSliceSpec,V1ResourceSliceSpecBuilder>{

  V1ResourceSliceSpecFluent<?> fluent;

  public V1ResourceSliceSpecBuilder() {
    this(new V1ResourceSliceSpec());
  }
  
  public V1ResourceSliceSpecBuilder(V1ResourceSliceSpecFluent<?> fluent) {
    this(fluent, new V1ResourceSliceSpec());
  }
  
  public V1ResourceSliceSpecBuilder(V1ResourceSliceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  
  public V1ResourceSliceSpecBuilder(V1ResourceSliceSpecFluent<?> fluent,V1ResourceSliceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }

  public V1ResourceSliceSpec build() {
    V1ResourceSliceSpec buildable = new V1ResourceSliceSpec();
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