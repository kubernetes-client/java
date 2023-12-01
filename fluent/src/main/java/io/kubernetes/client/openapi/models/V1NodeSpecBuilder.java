package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1NodeSpecBuilder extends V1NodeSpecFluent<V1NodeSpecBuilder> implements VisitableBuilder<V1NodeSpec,V1NodeSpecBuilder>{
  public V1NodeSpecBuilder() {
    this(new V1NodeSpec());
  }
  
  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent) {
    this(fluent, new V1NodeSpec());
  }
  
  public V1NodeSpecBuilder(V1NodeSpecFluent<?> fluent,V1NodeSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1NodeSpecBuilder(V1NodeSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1NodeSpecFluent<?> fluent;
  
  public V1NodeSpec build() {
    V1NodeSpec buildable = new V1NodeSpec();
    buildable.setConfigSource(fluent.buildConfigSource());
    buildable.setExternalID(fluent.getExternalID());
    buildable.setPodCIDR(fluent.getPodCIDR());
    buildable.setPodCIDRs(fluent.getPodCIDRs());
    buildable.setProviderID(fluent.getProviderID());
    buildable.setTaints(fluent.buildTaints());
    buildable.setUnschedulable(fluent.getUnschedulable());
    return buildable;
  }
  

}