package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
public class V1alpha1ClusterCIDRSpecBuilder extends V1alpha1ClusterCIDRSpecFluent<V1alpha1ClusterCIDRSpecBuilder> implements VisitableBuilder<V1alpha1ClusterCIDRSpec,V1alpha1ClusterCIDRSpecBuilder>{
  public V1alpha1ClusterCIDRSpecBuilder() {
    this(new V1alpha1ClusterCIDRSpec());
  }
  
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpecFluent<?> fluent) {
    this(fluent, new V1alpha1ClusterCIDRSpec());
  }
  
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpecFluent<?> fluent,V1alpha1ClusterCIDRSpec instance) {
    this.fluent = fluent;
    fluent.copyInstance(instance);
  }
  
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpec instance) {
    this.fluent = this;
    this.copyInstance(instance);
  }
  V1alpha1ClusterCIDRSpecFluent<?> fluent;
  
  public V1alpha1ClusterCIDRSpec build() {
    V1alpha1ClusterCIDRSpec buildable = new V1alpha1ClusterCIDRSpec();
    buildable.setIpv4(fluent.getIpv4());
    buildable.setIpv6(fluent.getIpv6());
    buildable.setNodeSelector(fluent.buildNodeSelector());
    buildable.setPerNodeHostBits(fluent.getPerNodeHostBits());
    return buildable;
  }
  

}