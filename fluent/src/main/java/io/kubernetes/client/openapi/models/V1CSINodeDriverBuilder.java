package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSINodeDriverBuilder extends V1CSINodeDriverFluent<V1CSINodeDriverBuilder> implements VisitableBuilder<V1CSINodeDriver,V1CSINodeDriverBuilder>{
  public V1CSINodeDriverBuilder() {
    this(new V1CSINodeDriver());
  }
  
  public V1CSINodeDriverBuilder(V1CSINodeDriverFluent<?> fluent) {
    this(fluent, new V1CSINodeDriver());
  }
  
  public V1CSINodeDriverBuilder(V1CSINodeDriverFluent<?> fluent,V1CSINodeDriver instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSINodeDriverBuilder(V1CSINodeDriver instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSINodeDriverFluent<?> fluent;
  
  public V1CSINodeDriver build() {
    V1CSINodeDriver buildable = new V1CSINodeDriver();
    buildable.setAllocatable(fluent.buildAllocatable());
    buildable.setName(fluent.getName());
    buildable.setNodeID(fluent.getNodeID());
    buildable.setTopologyKeys(fluent.getTopologyKeys());
    return buildable;
  }
  

}