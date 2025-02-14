package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ResourceSliceSpecBuilder extends V1beta1ResourceSliceSpecFluent<V1beta1ResourceSliceSpecBuilder> implements VisitableBuilder<V1beta1ResourceSliceSpec,V1beta1ResourceSliceSpecBuilder>{
  public V1beta1ResourceSliceSpecBuilder() {
    this(new V1beta1ResourceSliceSpec());
  }
  
  public V1beta1ResourceSliceSpecBuilder(V1beta1ResourceSliceSpecFluent<?> fluent) {
    this(fluent, new V1beta1ResourceSliceSpec());
  }
  
  public V1beta1ResourceSliceSpecBuilder(V1beta1ResourceSliceSpecFluent<?> fluent,V1beta1ResourceSliceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ResourceSliceSpecBuilder(V1beta1ResourceSliceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ResourceSliceSpecFluent<?> fluent;
  
  public V1beta1ResourceSliceSpec build() {
    V1beta1ResourceSliceSpec buildable = new V1beta1ResourceSliceSpec();
    buildable.setAllNodes(fluent.getAllNodes());
    buildable.setDevices(fluent.buildDevices());
    buildable.setDriver(fluent.getDriver());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    buildable.setPool(fluent.buildPool());
    return buildable;
  }
  

}