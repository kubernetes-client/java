package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1beta1ServiceCIDRSpecBuilder extends V1beta1ServiceCIDRSpecFluent<V1beta1ServiceCIDRSpecBuilder> implements VisitableBuilder<V1beta1ServiceCIDRSpec,V1beta1ServiceCIDRSpecBuilder>{
  public V1beta1ServiceCIDRSpecBuilder() {
    this(new V1beta1ServiceCIDRSpec());
  }
  
  public V1beta1ServiceCIDRSpecBuilder(V1beta1ServiceCIDRSpecFluent<?> fluent) {
    this(fluent, new V1beta1ServiceCIDRSpec());
  }
  
  public V1beta1ServiceCIDRSpecBuilder(V1beta1ServiceCIDRSpecFluent<?> fluent,V1beta1ServiceCIDRSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1beta1ServiceCIDRSpecBuilder(V1beta1ServiceCIDRSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1beta1ServiceCIDRSpecFluent<?> fluent;
  
  public V1beta1ServiceCIDRSpec build() {
    V1beta1ServiceCIDRSpec buildable = new V1beta1ServiceCIDRSpec();
    buildable.setCidrs(fluent.getCidrs());
    return buildable;
  }
  

}