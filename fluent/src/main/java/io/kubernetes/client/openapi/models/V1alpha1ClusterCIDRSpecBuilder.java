package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Boolean;
public class V1alpha1ClusterCIDRSpecBuilder extends V1alpha1ClusterCIDRSpecFluentImpl<V1alpha1ClusterCIDRSpecBuilder> implements VisitableBuilder<V1alpha1ClusterCIDRSpec,V1alpha1ClusterCIDRSpecBuilder>{
  public V1alpha1ClusterCIDRSpecBuilder() {
    this(false);
  }
  public V1alpha1ClusterCIDRSpecBuilder(Boolean validationEnabled) {
    this(new V1alpha1ClusterCIDRSpec(), validationEnabled);
  }
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpecFluent<?> fluent) {
    this(fluent, false);
  }
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpecFluent<?> fluent,Boolean validationEnabled) {
    this(fluent, new V1alpha1ClusterCIDRSpec(), validationEnabled);
  }
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpecFluent<?> fluent,V1alpha1ClusterCIDRSpec instance) {
    this(fluent, instance, false);
  }
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpecFluent<?> fluent,V1alpha1ClusterCIDRSpec instance,Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withIpv4(instance.getIpv4());

    fluent.withIpv6(instance.getIpv6());

    fluent.withNodeSelector(instance.getNodeSelector());

    fluent.withPerNodeHostBits(instance.getPerNodeHostBits());

    this.validationEnabled = validationEnabled; 
  }
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpec instance) {
    this(instance,false);
  }
  public V1alpha1ClusterCIDRSpecBuilder(V1alpha1ClusterCIDRSpec instance,Boolean validationEnabled) {
    this.fluent = this; 
    this.withIpv4(instance.getIpv4());

    this.withIpv6(instance.getIpv6());

    this.withNodeSelector(instance.getNodeSelector());

    this.withPerNodeHostBits(instance.getPerNodeHostBits());

    this.validationEnabled = validationEnabled; 
  }
  V1alpha1ClusterCIDRSpecFluent<?> fluent;
  Boolean validationEnabled;
  public V1alpha1ClusterCIDRSpec build() {
    V1alpha1ClusterCIDRSpec buildable = new V1alpha1ClusterCIDRSpec();
    buildable.setIpv4(fluent.getIpv4());
    buildable.setIpv6(fluent.getIpv6());
    buildable.setNodeSelector(fluent.getNodeSelector());
    buildable.setPerNodeHostBits(fluent.getPerNodeHostBits());
    return buildable;
  }
  
}