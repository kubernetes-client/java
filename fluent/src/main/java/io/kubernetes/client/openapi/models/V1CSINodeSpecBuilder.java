package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1CSINodeSpecBuilder extends V1CSINodeSpecFluent<V1CSINodeSpecBuilder> implements VisitableBuilder<V1CSINodeSpec,V1CSINodeSpecBuilder>{
  public V1CSINodeSpecBuilder() {
    this(new V1CSINodeSpec());
  }
  
  public V1CSINodeSpecBuilder(V1CSINodeSpecFluent<?> fluent) {
    this(fluent, new V1CSINodeSpec());
  }
  
  public V1CSINodeSpecBuilder(V1CSINodeSpecFluent<?> fluent,V1CSINodeSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1CSINodeSpecBuilder(V1CSINodeSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1CSINodeSpecFluent<?> fluent;
  
  public V1CSINodeSpec build() {
    V1CSINodeSpec buildable = new V1CSINodeSpec();
    buildable.setDrivers(fluent.buildDrivers());
    return buildable;
  }
  

}