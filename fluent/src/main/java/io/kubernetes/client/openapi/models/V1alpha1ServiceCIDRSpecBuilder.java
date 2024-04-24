package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ServiceCIDRSpecBuilder extends V1alpha1ServiceCIDRSpecFluent<V1alpha1ServiceCIDRSpecBuilder> implements VisitableBuilder<V1alpha1ServiceCIDRSpec,V1alpha1ServiceCIDRSpecBuilder>{
  public V1alpha1ServiceCIDRSpecBuilder() {
    this(new V1alpha1ServiceCIDRSpec());
  }
  
  public V1alpha1ServiceCIDRSpecBuilder(V1alpha1ServiceCIDRSpecFluent<?> fluent) {
    this(fluent, new V1alpha1ServiceCIDRSpec());
  }
  
  public V1alpha1ServiceCIDRSpecBuilder(V1alpha1ServiceCIDRSpecFluent<?> fluent,V1alpha1ServiceCIDRSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ServiceCIDRSpecBuilder(V1alpha1ServiceCIDRSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ServiceCIDRSpecFluent<?> fluent;
  
  public V1alpha1ServiceCIDRSpec build() {
    V1alpha1ServiceCIDRSpec buildable = new V1alpha1ServiceCIDRSpec();
    buildable.setCidrs(fluent.getCidrs());
    return buildable;
  }
  

}