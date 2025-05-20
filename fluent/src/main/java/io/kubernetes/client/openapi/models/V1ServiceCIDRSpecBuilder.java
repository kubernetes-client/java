package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1ServiceCIDRSpecBuilder extends V1ServiceCIDRSpecFluent<V1ServiceCIDRSpecBuilder> implements VisitableBuilder<V1ServiceCIDRSpec,V1ServiceCIDRSpecBuilder>{
  public V1ServiceCIDRSpecBuilder() {
    this(new V1ServiceCIDRSpec());
  }
  
  public V1ServiceCIDRSpecBuilder(V1ServiceCIDRSpecFluent<?> fluent) {
    this(fluent, new V1ServiceCIDRSpec());
  }
  
  public V1ServiceCIDRSpecBuilder(V1ServiceCIDRSpecFluent<?> fluent,V1ServiceCIDRSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1ServiceCIDRSpecBuilder(V1ServiceCIDRSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1ServiceCIDRSpecFluent<?> fluent;
  
  public V1ServiceCIDRSpec build() {
    V1ServiceCIDRSpec buildable = new V1ServiceCIDRSpec();
    buildable.setCidrs(fluent.getCidrs());
    return buildable;
  }
  

}