package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha3ResourceSliceSpecBuilder extends V1alpha3ResourceSliceSpecFluent<V1alpha3ResourceSliceSpecBuilder> implements VisitableBuilder<V1alpha3ResourceSliceSpec,V1alpha3ResourceSliceSpecBuilder>{
  public V1alpha3ResourceSliceSpecBuilder() {
    this(new V1alpha3ResourceSliceSpec());
  }
  
  public V1alpha3ResourceSliceSpecBuilder(V1alpha3ResourceSliceSpecFluent<?> fluent) {
    this(fluent, new V1alpha3ResourceSliceSpec());
  }
  
  public V1alpha3ResourceSliceSpecBuilder(V1alpha3ResourceSliceSpecFluent<?> fluent,V1alpha3ResourceSliceSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha3ResourceSliceSpecBuilder(V1alpha3ResourceSliceSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha3ResourceSliceSpecFluent<?> fluent;
  
  public V1alpha3ResourceSliceSpec build() {
    V1alpha3ResourceSliceSpec buildable = new V1alpha3ResourceSliceSpec();
    buildable.setAllNodes(fluent.getAllNodes());
    buildable.setDevices(fluent.buildDevices());
    buildable.setDriver(fluent.getDriver());
    buildable.setNodeName(fluent.getNodeName());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    buildable.setPool(fluent.buildPool());
    return buildable;
  }
  

}